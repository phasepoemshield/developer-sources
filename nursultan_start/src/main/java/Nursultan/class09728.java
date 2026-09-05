/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09743;
import Nursultan.class09759;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09728
extends Record
implements class09743 {
    private final float durationSeconds;
    private final class09759 easing;
    private final float delaySeconds;

    public float L() {
        return this.delaySeconds;
    }

    public class09728(float f, class09759 class097592, float f2) {
        f = Float.isFinite(f) ? Math.max(0.0f, f) : 0.0f;
        class097592 = class097592 == null ? class09759.EASE : class097592;
        f2 = Float.isFinite(f2) ? Math.max(0.0f, f2) : 0.0f;
        this.durationSeconds = f;
        this.easing = class097592;
        this.delaySeconds = f2;
    }

    public class09728(float f, class09759 class097592) {
        this(f, class097592, 0.0f);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09728.class, "durationSeconds;easing;delaySeconds", "durationSeconds", "easing", "delaySeconds"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09728.class, "durationSeconds;easing;delaySeconds", "durationSeconds", "easing", "delaySeconds"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09728.class, "durationSeconds;easing;delaySeconds", "durationSeconds", "easing", "delaySeconds"}, this);
    }

    @Override
    public boolean u() {
        return this.durationSeconds > 0.0f;
    }

    public class09759 y() {
        return this.easing;
    }

    public float N() {
        return this.durationSeconds;
    }

    public class09728 N(float f) {
        return new class09728(this.durationSeconds, this.easing, f);
    }
}

