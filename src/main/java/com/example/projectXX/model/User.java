package com.example.projectXX.model;



import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
@Table(name = "User_Table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Email
    private String email;
    private String password;
    private String name;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Commentary> comments;

    private User() {
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email='" + email + '\'' + ", password='" + password + '\'' + ", name='" + name + '\'' + '}';
    }

    public User(@Email String email, String password, String name, List<Commentary> comments) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.comments = comments;
    }

    public static class Builder {
        private String name;
        private String password;
        private String email;


        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPassword(String password) {
            this.password= password;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public User  build() {
            User user = new User();
            user.name=this.name;
            user.email=this.email;
            user.password=this.password;
            return user;
        }
    }
}
