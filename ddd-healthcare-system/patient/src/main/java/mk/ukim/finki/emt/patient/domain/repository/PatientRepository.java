package mk.ukim.finki.emt.patient.domain.repository;

import mk.ukim.finki.emt.patient.domain.models.Patient;
import mk.ukim.finki.emt.patient.domain.models.PatientId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, PatientId> {
}
