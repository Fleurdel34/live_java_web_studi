package fr.studi.live.security.jwt;

import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtUtils {

    @Value("${api.jwtSecret}")
    private String jwtSecret;

    @Value("${api.jwtExpirationLMs}")
    private int jwtExpiration;

    //finir avec le repository et la video de 35 minutes

}
