package be.ae.technicalqafundamentals.Domain;

import be.ae.technicalqafundamentals.Adaptors.EmailAdaptor;
import be.ae.technicalqafundamentals.repository.InvoiceRepository;

public class LateInvoiceNotifier {

    private final EmailAdaptor emailAdaptor;
    private final InvoiceRepository invoiceStorage;

    public LateInvoiceNotifier(final EmailAdaptor emailAdaptor, final InvoiceRepository invoiceRepository) {
        this.emailAdaptor = emailAdaptor;
        this.invoiceStorage = invoiceRepository;
    }

    public void notifyIfLate(User customer) {
        if (invoiceStorage.hasOutstandingInvoice(customer)) {
            emailAdaptor.sendEmail(customer);
        }
    }
}