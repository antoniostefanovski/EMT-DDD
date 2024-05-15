package mk.ukim.finki.emt.doctor.xport;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.doctor.domain.models.Doctor;
import mk.ukim.finki.emt.doctor.domain.models.DoctorId;
import mk.ukim.finki.emt.doctor.domain.models.dto.DoctorDTO;
import mk.ukim.finki.emt.doctor.services.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/doctor")
@AllArgsConstructor

public class DoctorResource {
    private final DoctorService doctorService;

    @GetMapping("/schedules/{id}")
    public List<LocalDate> getSchedules(@PathVariable DoctorId id) {
        return doctorService.getSchedules(id);
    }

    @GetMapping
    public List<Doctor> getDoctors() {
        return doctorService.getDoctors();
    }

    @PostMapping("/add-doctor")
    public Doctor addDoctor(@RequestBody DoctorDTO doctorDTO) {
        return doctorService.addDoctor(doctorDTO.getName(), doctorDTO.getName());
    }
}
