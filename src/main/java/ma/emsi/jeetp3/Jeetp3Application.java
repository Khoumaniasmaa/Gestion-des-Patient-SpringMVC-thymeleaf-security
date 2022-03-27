package ma.emsi.jeetp3;
import ma.emsi.jeetp3.entities.Patient;
import ma.emsi.jeetp3.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Jpa21Utils;

import java.util.Date;
@SpringBootApplication
public class Jeetp3Application  {
    public static void main(String[] args) {
        SpringApplication.run(Jeetp3Application.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {patientRepository.save(
                new Patient(null,"Asmaa",new Date(),false,12));
            patientRepository.save(
                    new Patient(null,"hayat",new Date(),true,321));
            patientRepository.save(
                    new Patient(null,"janat",new Date(),false,65));
            patientRepository.save(
                    new Patient(null,"hanae",new Date(),true,32));
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }
}


