package ma.emsi.jeetp3.repositories;

import ma.emsi.jeetp3.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
  Page<Patient> findByNomContains(String Kw, Pageable pageable);

}
