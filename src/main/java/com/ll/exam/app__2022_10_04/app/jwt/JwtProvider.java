package com.ll.exam.app__2022_10_04.app.jwt;

import com.ll.exam.app__2022_10_04.util.Util;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class JwtProvider {
    private final SecretKey jwtSecretKey;

    private SecretKey getSecretKey() {
        return jwtSecretKey;
    }


    public String generateAccessToken(Map<String, Object> claims, int seconds) {
        long now = new Date().getTime();
        Date accessTokenExpiresIn = new Date(now + 1000L * seconds);

        return Jwts.builder()
                .claim("body", Util.json.toStr(claims))         // payload에 들어갈 정보 조각
                .setExpiration(accessTokenExpiresIn)                // accessToken 만료 시간
                .signWith(getSecretKey(), SignatureAlgorithm.HS512) // secretKey로 암호화
                .compact();
    }
}
