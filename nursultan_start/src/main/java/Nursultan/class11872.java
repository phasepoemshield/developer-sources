/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09785
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09785;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.IntConsumer;

public class class11872
extends Record {
    public class09785<Boolean> opened;
    public boolean alphaAllowed;
    public IntConsumer onChange;
    public int color;
    public boolean pastel;

    public boolean L() {
        return this.pastel;
    }

    public class11872(int n, class09785<Boolean> class097852, IntConsumer intConsumer, boolean bl, boolean bl2) {
        this.color = n;
        this.opened = class097852;
        this.onChange = intConsumer;
        this.alphaAllowed = bl;
        this.pastel = bl2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11872.class, "color;opened;onChange;alphaAllowed;pastel", "color", "opened", "onChange", "alphaAllowed", "pastel"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11872.class, "color;opened;onChange;alphaAllowed;pastel", "color", "opened", "onChange", "alphaAllowed", "pastel"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11872.class, "color;opened;onChange;alphaAllowed;pastel", "color", "opened", "onChange", "alphaAllowed", "pastel"}, this);
    }

    public IntConsumer i() {
        return this.onChange;
    }

    public boolean u() {
        return this.alphaAllowed;
    }

    public int y() {
        return this.color;
    }

    public class09785<Boolean> N() {
        return this.opened;
    }
}

