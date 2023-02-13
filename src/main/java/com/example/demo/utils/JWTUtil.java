package com.example.demo.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class JWTUtil {
    
    /**
     * 过期时间
     * 默认15分钟
     */
    private static final long EXPIRE_TIME = 15 * 60 * 1000;
    /**
     * 私钥
     */
    private static final String TOKEN_SECRET = TokenUtil.mdSalt;
    
    private static final String CLAIM = "userId";
    
    /**
     * 生成token，自定义过期时间 毫秒
     * @param userId
     * @param expireDate 默认为15分钟
     * @return
     */
    public static String createToken(String userId, Long expireDate) {
        if (Objects.isNull(expireDate)) {
            expireDate = EXPIRE_TIME;
        }
        try {
            // 设置过期时间
            Date date = new Date(System.currentTimeMillis() + expireDate);
            // 私钥和加密算法
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            // 设置头部信息
            Map<String, Object> header = new HashMap<>(2);
            header.put("TYPE", "Jwt");
            header.put("ALG", "HS256");
            // 返回token字符串
            return JWT.create()
                    .withHeader(header)
                    .withClaim(CLAIM, userId)
                    .withExpiresAt(date)
                    .sign(algorithm);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * 检验token是否正确
     *
     * @param **token**
     * @return
     */
    public static String verifyToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            String userId = jwt.getClaim(CLAIM).asString();
            return userId;
        } catch (Exception e) {
            return null;
        }
    }
}
