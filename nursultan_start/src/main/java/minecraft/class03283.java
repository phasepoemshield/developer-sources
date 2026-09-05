/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03249
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03249;
import minecraft.class03287;

public final class class03283
extends Record {
    private final int x;
    private final int y;

    public class03283(int n, int n2) {
        this.x = n;
        this.y = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03283.class, "x;y", "x", "y"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03283.class, "x;y", "x", "y"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03283.class, "x;y", "x", "y"}, this);
    }

    public int y() {
        return this.y;
    }

    public int N(class03287 class032872) {
        return switch (class032872) {
            default -> throw new MatchException(null, null);
            case class03287.field_41822 -> this.x;
            case class03287.field_41823 -> this.y;
        };
    }

    public int N() {
        return this.x;
    }

    public static class03283 N(class03287 class032872, int n, int n2) {
        return switch (class032872) {
            default -> throw new MatchException(null, null);
            case class03287.field_41822 -> new class03283(n, n2);
            case class03287.field_41823 -> new class03283(n2, n);
        };
    }

    public class03283 N(class03249 class032492) {
        return switch (class032492) {
            default -> throw new MatchException(null, null);
            case class03249.field_41827 -> new class03283(this.x, this.y + 1);
            case class03249.field_41826 -> new class03283(this.x, this.y - 1);
            case class03249.field_41828 -> new class03283(this.x - 1, this.y);
            case class03249.field_41829 -> new class03283(this.x + 1, this.y);
        };
    }
}

