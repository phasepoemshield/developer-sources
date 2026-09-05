/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class02362
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class08709;

public final class class08687
extends Record {
    private final boolean forward;
    private final boolean backward;
    private final boolean left;
    private final boolean right;
    private final boolean jump;
    private final boolean shift;
    private final boolean sprint;
    private static final byte z = 1;
    private static final byte U = 2;
    private static final byte E = 4;
    private static final byte W = 8;
    private static final byte m = 16;
    private static final byte P = 32;
    private static final byte s = 64;
    public static final class02362<class00667, class08687> N = new class08709();
    public static class08687 y = new class08687(false, false, false, false, false, false, false);

    public boolean L() {
        return this.left;
    }

    public boolean M() {
        return this.sprint;
    }

    public class08687(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        this.forward = bl;
        this.backward = bl2;
        this.left = bl3;
        this.right = bl4;
        this.jump = bl5;
        this.shift = bl6;
        this.sprint = bl7;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08687.class, "forward;backward;left;right;jump;shift;sprint", "forward", "backward", "left", "right", "jump", "shift", "sprint"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08687.class, "forward;backward;left;right;jump;shift;sprint", "forward", "backward", "left", "right", "jump", "shift", "sprint"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08687.class, "forward;backward;left;right;jump;shift;sprint", "forward", "backward", "left", "right", "jump", "shift", "sprint"}, this);
    }

    public boolean i() {
        return this.jump;
    }

    public boolean u() {
        return this.right;
    }

    public boolean y() {
        return this.backward;
    }

    public boolean N() {
        return this.forward;
    }

    public boolean R() {
        return this.shift;
    }
}

