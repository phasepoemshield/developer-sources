/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09787;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;

public final class class09810
extends Record {
    private final class09787 exitAnimationPolicy;
    public static final class09810 N = new class09810(class09787.ANIMATE_REMOVALS);
    public static final class09810 y = new class09810(class09787.REMOVE_IMMEDIATELY);

    public class09787 L() {
        return this.exitAnimationPolicy;
    }

    public class09810(class09787 class097872) {
        Objects.requireNonNull(class097872, "exitAnimationPolicy");
        this.exitAnimationPolicy = class097872;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09810.class, "exitAnimationPolicy", "exitAnimationPolicy"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09810.class, "exitAnimationPolicy", "exitAnimationPolicy"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09810.class, "exitAnimationPolicy", "exitAnimationPolicy"}, this);
    }

    public static class09810 y() {
        return y;
    }

    public static class09810 N() {
        return N;
    }
}

