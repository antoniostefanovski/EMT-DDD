package mk.ukim.finki.emt.doctor.domain.repository;

import mk.ukim.finki.emt.doctor.domain.models.Doctor;
import mk.ukim.finki.emt.doctor.domain.models.DoctorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, DoctorId> {
}
