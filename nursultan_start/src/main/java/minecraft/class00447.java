/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00891
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04620
 *  minecraft.class05946
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04620;
import minecraft.class05946;

public final class class00447
extends Record {
    private final class00891 type;
    private final int occupantCount;
    private final int honeyLevel;
    private final boolean sedated;
    public static final class02362<class04247, class00447> N = class02362.N((class02362)class02389.N((class05946)class04227.Z), class00447::N, (class02362)class02389.B, class00447::y, (class02362)class02389.B, class00447::L, (class02362)class02389.y, class00447::u, class00447::new);

    public int L() {
        return this.honeyLevel;
    }

    public class00447(class00891 class008912, int n, int n2, boolean bl) {
        this.type = class008912;
        this.occupantCount = n;
        this.honeyLevel = n2;
        this.sedated = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00447.class, "type;occupantCount;honeyLevel;sedated", "type", "occupantCount", "honeyLevel", "sedated"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00447.class, "type;occupantCount;honeyLevel;sedated", "type", "occupantCount", "honeyLevel", "sedated"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00447.class, "type;occupantCount;honeyLevel;sedated", "type", "occupantCount", "honeyLevel", "sedated"}, this);
    }

    public boolean u() {
        return this.sedated;
    }

    public int y() {
        return this.occupantCount;
    }

    public static class00447 N(class04620 class046202) {
        return new class00447(class046202.w().i(), class046202.R(), class04620.N((class00500)class046202.w()), class046202.M());
    }

    public class00891 N() {
        return this.type;
    }
}

