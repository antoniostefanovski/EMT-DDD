package mk.ukim.finki.emt.doctor.domain.valueobjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.address.Address;
import mk.ukim.finki.emt.sharedkernel.domain.base.ValueObject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public class Doctor implements ValueObject {
    private final DoctorId id;
    private final String name;
    private final String specialization;
    private final List<LocalDate> schedules;

    private Doctor () {
        this.id =  DoctorId.randomId(DoctorId.class);
        this.name = "Venko";
        this.specialization = "Cardiologist";
        this.schedules = new ArrayList<>(Arrays.asList(
                LocalDate.of(2024, 10, 25),
                LocalDate.of(2024, 10, 26),
                LocalDate.of(2024, 10, 27)
        ));
    }

    @JsonCreator
    public Doctor(@JsonProperty("id") DoctorId id,
                  @JsonProperty("name") String name,
                  @JsonProperty("specialization") String specialization,
                  @JsonProperty("schedules") List<LocalDate> schedules) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.schedules = schedules;
    }
}
