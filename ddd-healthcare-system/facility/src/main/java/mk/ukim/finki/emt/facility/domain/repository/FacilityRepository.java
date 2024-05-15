package mk.ukim.finki.emt.facility.domain.repository;

import mk.ukim.finki.emt.facility.domain.models.Facility;
import mk.ukim.finki.emt.facility.domain.models.FacilityId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepository extends JpaRepository<Facility, FacilityId> {
}
