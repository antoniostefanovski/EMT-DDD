package mk.ukim.finki.emt.doctor.services;

import mk.ukim.finki.emt.doctor.domain.models.Doctor;
import mk.ukim.finki.emt.doctor.domain.models.DoctorId;
import mk.ukim.finki.emt.doctor.domain.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService{
    private final DoctorRepository repository;

    public DoctorServiceImpl(DoctorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<LocalDate> getSchedules(DoctorId id) {
        return this.repository.findById(id).get().getSchedules();
    }

    @Override
    public Doctor addDoctor(String name, String specialization) {
        Doctor doctor = Doctor.build(name, specialization);
        return this.repository.save(doctor);
    }

    @Override
    public List<Doctor> getDoctors() {
        return this.repository.findAll();
    }
}
