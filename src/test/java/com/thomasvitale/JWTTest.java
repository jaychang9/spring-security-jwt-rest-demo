package com.thomasvitale;

import io.jsonwebtoken.*;
import io.jsonwebtoken.impl.DefaultClaims;
import org.junit.Test;

import java.util.Date;
import java.util.UUID;

/**
 * @author zhangjie
 * @package com.thomasvitale
 * @description TODO
 * @create 2018-07-26 09:22
 */
public class JWTTest {
    private String SECRECT = "p@Axxd";

    @Test
    public void test1() {
        String username = "jack";
        Date now = new Date();

        JwtBuilder jwtBuilder = Jwts.builder();

//        String jwt = jwtBuilder.signWith(SignatureAlgorithm.HS512,SECRECT).setExpiration(new Date(System.currentTimeMillis()+60*1000)).setId(UUID.randomUUID().toString()).setSubject(username).setIssuedAt(now).compact();

//        String jwt = jwtBuilder.setPayload("{ " +
//                "    \"iss\": \"John Wu JWT\", " +
//                "    \"iat\": 1441593502, " +
//                "    \"exp\": 1441594722, " +
//                "    \"foo\": \"bar\", " +
//                "    \"aud\": \"www.example.com\", " +
//                "    \"sub\": \"jrocket@example.com\", " +
//                "    \"from_user\": \"B\", " +
//                "    \"target_user\": \"A\"" + "}").setHeaderParam(Header.TYPE, Header.JWT_TYPE).signWith(SignatureAlgorithm.HS512, SECRECT).compact();
        DefaultClaims claims = new DefaultClaims();
        claims.put("foo","bar");
        String jwt = jwtBuilder.setHeaderParam(Header.TYPE,Header.JWT_TYPE).setClaims(claims).signWith(SignatureAlgorithm.HS512, SECRECT).compact();
        System.out.println(jwt);


    }

    @Test
    public void test2(){
        JwtBuilder jwtBuilder = Jwts.builder();


    }
}
