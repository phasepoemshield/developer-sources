/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class01894
 *  minecraft.class02362
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class02362;

public final class class01638
extends Record
implements class01659 {
    private final class01894 id;

    public class01638(class01894 class018942) {
        this.id = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01638.class, "id", "id"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01638.class, "id", "id"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01638.class, "id", "id"}, this);
    }

    public static <T extends class00667> class02362<T, class01638> N(class01894 class018942, int n) {
        return class01659.N((class016382, class006672) -> {}, class006672 -> {
            int n2 = class006672.readableBytes();
            if (n2 < 0 || n2 > n) {
                throw new IllegalArgumentException("Payload may not be larger than " + n + " bytes");
            }
            class006672.skipBytes(n2);
            return new class01638(class018942);
        });
    }

    public class01894 N() {
        return this.id;
    }

    public class01666<class01638> method_56479() {
        return new class01666<class01638>(this.id);
    }
}

