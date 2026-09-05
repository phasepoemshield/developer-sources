/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00809
 *  minecraft.class02666
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00809;
import minecraft.class02500;
import minecraft.class02666;

public final class class02483
extends Record
implements class02500 {
    private final class00809 value;
    public static final Codec<class02483> N = class00809.N.xmap(class02483::new, class02483::N);

    public class02483(class00809 class008092) {
        this.value = class008092;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02483.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02483.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02483.class, "value", "value"}, this);
    }

    @Override
    public boolean N(class02666 class026662) {
        return this.value.N(class026662);
    }

    public class00809 N() {
        return this.value;
    }

    public static class02483 N(class00809 class008092) {
        return new class02483(class008092);
    }
}

