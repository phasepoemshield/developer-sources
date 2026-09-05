/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.security.SecureRandom;

public final class class00456
extends Record {
    private final String secretKey;
    private static final String y = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public class00456(String string) {
        this.secretKey = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00456.class, "secretKey", "secretKey"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00456.class, "secretKey", "secretKey"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00456.class, "secretKey", "secretKey"}, this);
    }

    public String y() {
        return this.secretKey;
    }

    public static String N() {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder stringBuilder = new StringBuilder(40);
        for (int i = 0; i < 40; ++i) {
            stringBuilder.append(y.charAt(secureRandom.nextInt(y.length())));
        }
        return stringBuilder.toString();
    }

    public static boolean N(String string) {
        if (string.isEmpty()) {
            return false;
        }
        return string.matches("^[a-zA-Z0-9]{40}$");
    }
}

