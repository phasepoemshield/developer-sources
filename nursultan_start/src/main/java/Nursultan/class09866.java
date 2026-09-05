/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09770;
import Nursultan.class09833;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09866
extends Record {
    private final float animationUpdateRateHz;
    private final class09833 inertialScroll;
    private final class09770 loggingOptions;
    private final boolean debugOverlay;
    private static final float i = 120.0f;
    private static final float R = 1.0E-6f;

    public class09833 L() {
        return this.inertialScroll;
    }

    public class09866(float f, class09833 class098332, class09770 class097702, boolean bl) {
        f = class09866.y(f);
        class098332 = class098332 == null ? class09833.N() : class098332;
        class097702 = class097702 == null ? class09770.N : class097702;
        this.animationUpdateRateHz = f;
        this.inertialScroll = class098332;
        this.loggingOptions = class097702;
        this.debugOverlay = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09866.class, "animationUpdateRateHz;inertialScroll;loggingOptions;debugOverlay", "animationUpdateRateHz", "inertialScroll", "loggingOptions", "debugOverlay"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09866.class, "animationUpdateRateHz;inertialScroll;loggingOptions;debugOverlay", "animationUpdateRateHz", "inertialScroll", "loggingOptions", "debugOverlay"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09866.class, "animationUpdateRateHz;inertialScroll;loggingOptions;debugOverlay", "animationUpdateRateHz", "inertialScroll", "loggingOptions", "debugOverlay"}, this);
    }

    public boolean i() {
        return this.debugOverlay;
    }

    public class09770 u() {
        return this.loggingOptions;
    }

    public float y() {
        return this.animationUpdateRateHz;
    }

    private static float y(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f) || f <= 1.0E-6f) {
            return 0.0f;
        }
        return f;
    }

    public class09866 N(class09770 class097702) {
        return new class09866(this.animationUpdateRateHz, this.inertialScroll, class097702, this.debugOverlay);
    }

    public static class09866 N() {
        return new class09866(120.0f, class09833.N(), class09770.N, false);
    }

    public class09866 N(float f) {
        return new class09866(f, this.inertialScroll, this.loggingOptions, this.debugOverlay);
    }

    public class09866 N(class09833 class098332) {
        return new class09866(this.animationUpdateRateHz, class098332, this.loggingOptions, this.debugOverlay);
    }

    public class09866 N(boolean bl) {
        return new class09866(this.animationUpdateRateHz, this.inertialScroll, this.loggingOptions, bl);
    }
}

