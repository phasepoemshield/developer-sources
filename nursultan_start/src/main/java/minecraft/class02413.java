/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07211
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07211;
import org.jspecify.annotations.Nullable;

public final class class02413
extends Record {
    final float ticks;
    final @Nullable class07211 shakeDirection;

    public class02413(float f, @Nullable class07211 class072112) {
        this.ticks = f;
        this.shakeDirection = class072112;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02413.class, "ticks;shakeDirection", "ticks", "shakeDirection"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02413.class, "ticks;shakeDirection", "ticks", "shakeDirection"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02413.class, "ticks;shakeDirection", "ticks", "shakeDirection"}, this);
    }

    public @Nullable class07211 y() {
        return this.shakeDirection;
    }

    public float N() {
        return this.ticks;
    }
}

