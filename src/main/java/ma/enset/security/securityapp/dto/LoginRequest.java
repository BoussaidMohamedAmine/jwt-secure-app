package ma.enset.security.securityapp.dto;

public record LoginRequest(
        String email,
        String password
) {
}
