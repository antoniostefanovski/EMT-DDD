package mk.ukim.finki.emt.doctor.services;


import mk.ukim.finki.emt.doctor.domain.models.Doctor;
import mk.ukim.finki.emt.doctor.domain.models.DoctorId;

import java.time.LocalDate;
import java.util.List;

public interface DoctorService {
    List<LocalDate> getSchedules(DoctorId id);
    Doctor addDoctor(String name, String specialization);
    List<Doctor> getDoctors();
}
