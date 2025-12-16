package fr.studi.live.security.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {

    @NotBlank
    @Email
    private String username;

    @NotBlank
    private String password;

    public @NotBlank @Email String getUsername() {
        return username;
    }

    public void setUsername(@NotBlank @Email String username) {
        this.username = username;
    }

    public @NotBlank String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank String password) {
        this.password = password;
    }
}
