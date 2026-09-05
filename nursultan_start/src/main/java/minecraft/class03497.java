/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class03497
extends Record {
    private final int millis;
    public static final Codec<class03497> N = Codec.INT.xmap(class03497::new, class034972 -> class034972.millis);

    public class03497(int n) {
        this.millis = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03497.class, "millis", "millis"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03497.class, "millis", "millis"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03497.class, "millis", "millis"}, this);
    }

    public int N() {
        return this.millis;
    }
}

