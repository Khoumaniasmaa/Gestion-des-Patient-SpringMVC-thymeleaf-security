package ma.emsi.jeetp3.repositories;

import ma.emsi.jeetp3.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,String> {
    AppUser findByUsername(String username);

}
