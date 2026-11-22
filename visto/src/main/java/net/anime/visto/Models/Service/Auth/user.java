package net.anime.visto.Models.Service.Auth;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "users")
public class user {

    @Id
    Long id;

    String name;

    String email;

    String password;
}
