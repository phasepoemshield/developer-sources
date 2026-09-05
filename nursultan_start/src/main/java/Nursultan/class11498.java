/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11938
 */
package Nursultan;

import Nursultan.class11472;
import Nursultan.class11938;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class class11498 {
    private class11498() {
    }

    private static byte[] N(long l) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(("nursultan-storage-xor-v1:" + l).getBytes());
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new IllegalStateException("SHA-256 unavailable", noSuchAlgorithmException);
        }
    }

    public static byte[] N(byte[] byArray) {
        if (byArray == null || byArray.length == 0) {
            return byArray;
        }
        byte[] byArray2 = class11498.N(((class11472)class11938.L_2).M());
        byte[] byArray3 = new byte[byArray.length];
        for (int i = 0; i < byArray.length; ++i) {
            byArray3[i] = (byte)(byArray[i] ^ byArray2[i % byArray2.length]);
        }
        return byArray3;
    }
}

