/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08019
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01385;
import minecraft.class08019;

final class class01401
extends Record
implements class01385 {
    private final boolean state;
    public static final Codec<class01401> N = Codec.BOOL.xmap(class01401::new, class01401::N);

    class01401(boolean bl) {
        this.state = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01401.class, "state", "state"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01401.class, "state", "state"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01401.class, "state", "state"}, this);
    }

    public boolean N() {
        return this.state;
    }

    @Override
    public boolean test(class08019 class080192) {
        return class080192.N() == this.state;
    }
}

