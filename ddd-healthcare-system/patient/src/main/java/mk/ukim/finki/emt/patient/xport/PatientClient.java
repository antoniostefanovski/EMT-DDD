package mk.ukim.finki.emt.patient.xport;

import mk.ukim.finki.emt.patient.domain.models.Doctor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;
import java.util.List;

@Service
public class PatientClient {
    private final RestTemplate restTemplate;
    private final String serverUrl;

    public PatientClient(@Value("${app.doctor-schedules.url}") String serverUrl) {
        this.serverUrl = serverUrl;
        this.restTemplate = new RestTemplate();
        var requestFactory = new SimpleClientHttpRequestFactory();
        this.restTemplate.setRequestFactory(requestFactory);
    }

    private UriComponentsBuilder uri() {
        return UriComponentsBuilder.fromUriString(this.serverUrl);
    }

    public List<LocalDate> getSchedules() {
        var doctors = restTemplate.exchange(uri().path("/api/doctors").build().toUri(), HttpMethod.GET,null, new ParameterizedTypeReference<List<Doctor>>() {
        }).getBody();

        var doctor = doctors.get(0);

        return restTemplate.exchange(uri().path("/api/doctors/schedules/{" + doctor.getId() + "}").build().toUri(), HttpMethod.GET,null, new ParameterizedTypeReference<List<LocalDate>>() {
        }).getBody();

    }
}
