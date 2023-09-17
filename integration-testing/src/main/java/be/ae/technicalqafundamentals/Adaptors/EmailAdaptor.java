package be.ae.technicalqafundamentals.Adaptors;

import be.ae.technicalqafundamentals.Domain.User;

public interface EmailAdaptor {

    void sendEmail(User customer);
}
