/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07438
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07438;

public class class11263
extends Record {
    public int confirmTick;
    public class07438 living;

    class11263(class07438 class074382, int n) {
        this.living = class074382;
        this.confirmTick = n;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11263.class, "living;confirmTick", "living", "confirmTick"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11263.class, "living;confirmTick", "living", "confirmTick"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11263.class, "living;confirmTick", "living", "confirmTick"}, this);
    }

    public class07438 y() {
        return this.living;
    }

    public int N() {
        return this.confirmTick;
    }
}

