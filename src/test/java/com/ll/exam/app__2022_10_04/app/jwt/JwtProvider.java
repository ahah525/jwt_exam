package com.ll.exam.app__2022_10_04.app.jwt;

import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Base64;

@Component
public class JwtProvider {
    @Value("${custom.jwt.secretKey}")
    private String secretKeyPlain;		// 시크릿키 원문

    public SecretKey getSecretKey() {
        String keyBase64Encoded = Base64.getEncoder().encodeToString(secretKeyPlain.getBytes());
        SecretKey secretKey = Keys.hmacShaKeyFor(keyBase64Encoded.getBytes());

        return secretKey;
    }
}