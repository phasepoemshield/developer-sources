/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02028
 *  minecraft.class03674
 *  minecraft.class08350
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02028;
import minecraft.class03674;
import minecraft.class08350;
import minecraft.class08857;
import minecraft.class08880;
import minecraft.class08887;

public final class class08883
extends Record
implements class08880 {
    private final class03674 variant;
    public static final Codec<class08883> u = class03674.y.xmap(class08883::new, class08883::y);

    public class08883(class03674 class036742) {
        this.variant = class036742;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08883.class, "variant", "variant"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08883.class, "variant", "variant"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08883.class, "variant", "variant"}, this);
    }

    public class03674 y() {
        return this.variant;
    }

    public void method_62326(class08350 class083502) {
        this.variant.method_62326(class083502);
    }

    @Override
    public class08887 method_68521(class02028 class020282) {
        return new class08857(this.variant.N(class020282));
    }
}

