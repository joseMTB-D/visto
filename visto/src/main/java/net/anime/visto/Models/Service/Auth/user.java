package net.anime.visto.Models.Service.Auth;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "usuarios")
public class user {

    @Id
    Long id;

    String name;

    String email;

    String password;
}
