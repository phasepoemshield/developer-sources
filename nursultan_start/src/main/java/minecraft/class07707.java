/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01424
 *  minecraft.class03154
 *  minecraft.class03175
 *  minecraft.class04818
 *  minecraft.class04836
 *  minecraft.class08876
 *  minecraft.class08884
 */
package minecraft;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class01424;
import minecraft.class03154;
import minecraft.class03175;
import minecraft.class04818;
import minecraft.class04836;
import minecraft.class07738;
import minecraft.class08876;
import minecraft.class08884;

public final class class07707
extends Record
implements class08884 {
    private final String value;
    private static final int L = 36;
    public static final class01424<class07707> N = new class07738();
    private static final class07707 t = new class07707("");
    private static final char G = '\"';
    private static final char l = '\'';
    private static final char d = '\\';
    private static final char w = '\u0000';

    public byte L() {
        return 8;
    }

    public static String L(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        class07707.y(string, stringBuilder);
        return stringBuilder.toString();
    }

    @Deprecated(forRemoval=true)
    public class07707(String string) {
        this.value = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07707.class, "value", "value"}, this, object);
    }

    public String toString() {
        class04818 class048182 = new class04818();
        class048182.N(this);
        return class048182.N();
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07707.class, "value", "value"}, this);
    }

    public class07707 N() {
        return this;
    }

    public String U() {
        return this.value;
    }

    public class01424<class07707> u() {
        return N;
    }

    public static void y(String string, StringBuilder stringBuilder) {
        block3: for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            switch (c) {
                case '\"': 
                case '\'': 
                case '\\': {
                    stringBuilder.append('\\');
                    stringBuilder.append(c);
                    continue block3;
                }
                default: {
                    String string2 = class08876.N((char)c);
                    if (string2 != null) {
                        stringBuilder.append('\\');
                        stringBuilder.append(string2);
                        continue block3;
                    }
                    stringBuilder.append(c);
                }
            }
        }
    }

    public static String y(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        class07707.N(string, stringBuilder);
        return stringBuilder.toString();
    }

    public int y() {
        return 36 + 2 * this.value.length();
    }

    public class03154 N(class03175 class031752) {
        return class031752.N(this.value);
    }

    public void N(class04836 class048362) {
        class048362.N(this);
    }

    public void N(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.value);
    }

    public static class07707 N(String string) {
        if (string.isEmpty()) {
            return t;
        }
        return new class07707(string);
    }

    public static void N(String string, StringBuilder stringBuilder) {
        int n = stringBuilder.length();
        stringBuilder.append(' ');
        int n2 = 0;
        for (int i = 0; i < string.length(); ++i) {
            int n3 = string.charAt(i);
            if (n3 == 92) {
                stringBuilder.append("\\\\");
                continue;
            }
            if (n3 == 34 || n3 == 39) {
                if (n2 == 0) {
                    int n4 = n2 = n3 == 34 ? 39 : 34;
                }
                if (n2 == n3) {
                    stringBuilder.append('\\');
                }
                stringBuilder.append((char)n3);
                continue;
            }
            String string2 = class08876.N((char)n3);
            if (string2 != null) {
                stringBuilder.append('\\');
                stringBuilder.append(string2);
                continue;
            }
            stringBuilder.append((char)n3);
        }
        if (n2 == 0) {
            n2 = 34;
        }
        stringBuilder.setCharAt(n, (char)n2);
        stringBuilder.append((char)n2);
    }

    public static void N(DataInput dataInput) throws IOException {
        dataInput.skipBytes(dataInput.readUnsignedShort());
    }

    public Optional<String> ah_() {
        return Optional.of(this.value);
    }
}

