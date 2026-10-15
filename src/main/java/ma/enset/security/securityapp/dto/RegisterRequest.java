package ma.enset.security.securityapp.dto;

public record RegisterRequest(
        String email,
        String password
) {
}
