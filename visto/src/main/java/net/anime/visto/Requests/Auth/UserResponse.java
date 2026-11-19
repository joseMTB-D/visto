package net.anime.visto.Requests.Auth;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    Long id;

    String name;

    String email;

    String password;
}
