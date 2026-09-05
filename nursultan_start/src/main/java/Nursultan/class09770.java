/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09770
extends Record {
    private final boolean layoutRebuilds;
    private final boolean drawCommandRebuilds;
    public static final class09770 N = new class09770(false, false);

    public static class09770 L() {
        return new class09770(true, true);
    }

    public class09770(boolean bl, boolean bl2) {
        this.layoutRebuilds = bl;
        this.drawCommandRebuilds = bl2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09770.class, "layoutRebuilds;drawCommandRebuilds", "layoutRebuilds", "drawCommandRebuilds"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09770.class, "layoutRebuilds;drawCommandRebuilds", "layoutRebuilds", "drawCommandRebuilds"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09770.class, "layoutRebuilds;drawCommandRebuilds", "layoutRebuilds", "drawCommandRebuilds"}, this);
    }

    public boolean i() {
        return this.drawCommandRebuilds;
    }

    public boolean u() {
        return this.layoutRebuilds;
    }

    public static class09770 y() {
        return new class09770(false, true);
    }

    public static class09770 N() {
        return new class09770(true, false);
    }
}

