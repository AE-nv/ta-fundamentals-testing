package be.ae.technicalqafundamentals.repository;

import be.ae.technicalqafundamentals.Domain.User;

public interface InvoiceRepository {
    boolean hasOutstandingInvoice(User customer);
}
