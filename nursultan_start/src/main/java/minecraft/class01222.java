/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09452
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class05449
 */
package minecraft;

import Nursultan.class09452;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import minecraft.class05449;

public class class01222 {
    private static final String B = "AES";
    private static final int Z = 128;
    private static final String z = "RSA";
    private static final int U = 1024;
    private static final String E = "ISO_8859_1";
    private static final String W = "SHA-1";
    public static final String N = "SHA256withRSA";
    public static final int y = 256;
    private static final String m = "-----BEGIN RSA PRIVATE KEY-----";
    private static final String P = "-----END RSA PRIVATE KEY-----";
    public static final String L = "-----BEGIN RSA PUBLIC KEY-----";
    private static final String s = "-----END RSA PUBLIC KEY-----";
    public static final String u = "\n";
    public static final Base64.Encoder i = Base64.getMimeEncoder(76, "\n".getBytes(StandardCharsets.UTF_8));
    public static final Codec<PublicKey> R = Codec.STRING.comapFlatMap(string -> {
        try {
            return DataResult.success((Object)class01222.y(string));
        }
        catch (class05449 class054492) {
            return DataResult.error(class054492::getMessage);
        }
    }, class01222::N);
    public static final Codec<PrivateKey> M = Codec.STRING.comapFlatMap(string -> {
        try {
            return DataResult.success((Object)class01222.N(string));
        }
        catch (class05449 class054492) {
            return DataResult.error(class054492::getMessage);
        }
    }, class01222::N);

    public static byte[] y(Key key, byte[] byArray) throws class05449 {
        return class01222.N(2, key, byArray);
    }

    public static KeyPair y() throws class05449 {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(z);
            keyPairGenerator.initialize(1024);
            return keyPairGenerator.generateKeyPair();
        }
        catch (Exception exception) {
            throw new class05449((Throwable)exception);
        }
    }

    public static PublicKey y(String string) throws class05449 {
        return (PublicKey)class01222.N(string, L, s, class01222::N);
    }

    private static PrivateKey y(byte[] byArray) throws class05449 {
        try {
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(byArray);
            return KeyFactory.getInstance(z).generatePrivate(pKCS8EncodedKeySpec);
        }
        catch (Exception exception) {
            throw new class05449((Throwable)exception);
        }
    }

    private static byte[] N(int n, Key key, byte[] byArray) throws class05449 {
        try {
            return class01222.N(n, key.getAlgorithm(), key).doFinal(byArray);
        }
        catch (Exception exception) {
            throw new class05449((Throwable)exception);
        }
    }

    public static byte[] N(Key key, byte[] byArray) throws class05449 {
        return class01222.N(1, key, byArray);
    }

    public static byte[] N(String string, PublicKey publicKey, SecretKey secretKey) throws class05449 {
        try {
            return class01222.N(string.getBytes(E), secretKey.getEncoded(), publicKey.getEncoded());
        }
        catch (Exception exception) {
            throw new class05449((Throwable)exception);
        }
    }

    public static SecretKey N() throws class05449 {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(B);
            keyGenerator.init(128);
            return keyGenerator.generateKey();
        }
        catch (Exception exception) {
            throw new class05449((Throwable)exception);
        }
    }

    public static Cipher N(int n, Key key) throws class05449 {
        try {
            Cipher cipher = Cipher.getInstance("AES/CFB8/NoPadding");
            cipher.init(n, key, new IvParameterSpec(key.getEncoded()));
            return cipher;
        }
        catch (Exception exception) {
            throw new class05449((Throwable)exception);
        }
    }

    private static Cipher N(int n, String string, Key key) throws Exception {
        Cipher cipher = Cipher.getInstance(string);
        cipher.init(n, key);
        return cipher;
    }

    public static String N(PublicKey publicKey) {
        if (!z.equals(publicKey.getAlgorithm())) {
            throw new IllegalArgumentException("Public key must be RSA");
        }
        return "-----BEGIN RSA PUBLIC KEY-----\n" + i.encodeToString(publicKey.getEncoded()) + "\n-----END RSA PUBLIC KEY-----\n";
    }

    public static PrivateKey N(String string) throws class05449 {
        return (PrivateKey)class01222.N(string, m, P, class01222::y);
    }

    private static <T extends Key> T N(String string, String string2, String string3, class09452<T> class094522) throws class05449 {
        int n = string.indexOf(string2);
        if (n != -1) {
            int n2 = string.indexOf(string3, n += string2.length());
            string = string.substring(n, n2 + 1);
        }
        try {
            return (T)class094522.apply(Base64.getMimeDecoder().decode(string));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new class05449((Throwable)illegalArgumentException);
        }
    }

    private static byte[] N(byte[] ... byArray) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance(W);
        for (byte[] byArray2 : byArray) {
            messageDigest.update(byArray2);
        }
        return messageDigest.digest();
    }

    public static String N(PrivateKey privateKey) {
        if (!z.equals(privateKey.getAlgorithm())) {
            throw new IllegalArgumentException("Private key must be RSA");
        }
        return "-----BEGIN RSA PRIVATE KEY-----\n" + i.encodeToString(privateKey.getEncoded()) + "\n-----END RSA PRIVATE KEY-----\n";
    }

    public static PublicKey N(byte[] byArray) throws class05449 {
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(byArray);
            return KeyFactory.getInstance(z).generatePublic(x509EncodedKeySpec);
        }
        catch (Exception exception) {
            throw new class05449((Throwable)exception);
        }
    }

    public static SecretKey N(PrivateKey privateKey, byte[] byArray) throws class05449 {
        byte[] byArray2 = class01222.y(privateKey, byArray);
        try {
            return new SecretKeySpec(byArray2, B);
        }
        catch (Exception exception) {
            throw new class05449((Throwable)exception);
        }
    }
}

