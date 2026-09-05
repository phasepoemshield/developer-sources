/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package de.maxhenkel.voicechat.voice.common;

import io.netty.buffer.ByteBuf;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Secret {
    public static final int SECRET_SIZE_BYTES = 16;
    public static final int IV_SIZE_BYTES = 12;
    public static final int TAG_LEN_BITS = 128;
    public static final String CIPHER = "AES/GCM/NoPadding";
    private static final SecureRandom RANDOM = new SecureRandom();
    private final byte[] secret;
    private final SecretKeySpec keySpec;

    protected Secret(byte[] byArray) {
        this.secret = byArray;
        this.keySpec = new SecretKeySpec(byArray, "AES");
    }

    public boolean equals(Object object) {
        if (!(object instanceof Secret)) {
            return false;
        }
        return Arrays.equals(this.secret, ((Secret)object).secret);
    }

    public int hashCode() {
        return Arrays.hashCode(this.secret);
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeBytes(this.secret);
    }

    public SecretKeySpec getKeySpec() {
        return this.keySpec;
    }

    public byte[] decrypt(byte[] byArray) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        byte[] byArray2 = Arrays.copyOfRange(byArray, 0, 12);
        byte[] byArray3 = Arrays.copyOfRange(byArray, 12, byArray.length);
        Cipher cipher = Cipher.getInstance(CIPHER);
        cipher.init(2, (Key)this.getKeySpec(), new GCMParameterSpec(128, byArray2));
        return cipher.doFinal(byArray3);
    }

    public byte[] encrypt(byte[] byArray) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        byte[] byArray2 = Secret.generateIV();
        Cipher cipher = Cipher.getInstance(CIPHER);
        cipher.init(1, (Key)this.getKeySpec(), new GCMParameterSpec(128, byArray2));
        byte[] byArray3 = cipher.doFinal(byArray);
        byte[] byArray4 = new byte[byArray2.length + byArray3.length];
        System.arraycopy(byArray2, 0, byArray4, 0, byArray2.length);
        System.arraycopy(byArray3, 0, byArray4, byArray2.length, byArray3.length);
        return byArray4;
    }

    public static Secret fromBytes(byte[] byArray) {
        return new Secret(byArray);
    }

    public static Secret fromBytes(ByteBuf byteBuf) {
        byte[] byArray = new byte[16];
        byteBuf.readBytes(byArray);
        return Secret.fromBytes(byArray);
    }

    public static Secret generateNewRandomSecret() {
        byte[] byArray = new byte[16];
        RANDOM.nextBytes(byArray);
        return new Secret(byArray);
    }

    public byte[] getSecret() {
        return this.secret;
    }

    public static byte[] generateIV() {
        byte[] byArray = new byte[12];
        RANDOM.nextBytes(byArray);
        return byArray;
    }
}

