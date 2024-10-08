package be.ae.technicalqafundamentals.repository;

import be.ae.technicalqafundamentals.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
