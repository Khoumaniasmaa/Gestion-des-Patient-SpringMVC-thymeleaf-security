package ma.emsi.jeetp3.sec;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.jeetp3.sec.AppRole;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {
    @Id
    private String uderId;
    @Column(unique = true)
    private String username;
    private  String Password ;
    private  boolean active;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<AppRole>appRoles=new ArrayList<>();
}
