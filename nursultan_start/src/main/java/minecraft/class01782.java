/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class05216
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class01757;
import minecraft.class01762;
import minecraft.class01796;
import minecraft.class05216;

public final class class01782
extends Record
implements class01762 {
    private final class00392 value;
    public static final class01757<class01782> N = new class01796();

    public class01782(class00392 class003922) {
        this.value = class003922;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01782.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01782.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01782.class, "value", "value"}, this);
    }

    public class00392 y() {
        return this.value;
    }

    @Override
    public class05216 N(int n) {
        return this.value.L();
    }

    public class01757<class01782> N() {
        return N;
    }
}

