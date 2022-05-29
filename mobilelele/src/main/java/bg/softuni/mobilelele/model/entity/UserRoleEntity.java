package bg.softuni.mobilelele.model.entity;

import bg.softuni.mobilelele.model.enums.UserRoleEnum;

import javax.persistence.*;

@Entity
@Table(name = "user_roles")
public class UserRoleEntity {


    /*
   1. One user may have many roles -> admin, moderator or only user
   2. Don't extend BaseEntity because we have different roles from UserRoleEnum and one user may have more than one role
   3. We have generated singly id in this class
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRoleEnum userRole;

    public Long getId() {
        return id;
    }

    public UserRoleEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public UserRoleEnum getUserRole() {
        return userRole;
    }

    public UserRoleEntity setUserRole(UserRoleEnum userRole) {
        this.userRole = userRole;
        return this;
    }

    @Override
    public String toString() {
        return "UserRoleEntity{" +
                "id=" + id +
                ", userRole=" + userRole +
                '}';
    }
}
