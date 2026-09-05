/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00891
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00891;

public class class11025
extends Record {
    public int color;
    public class00891 block;

    public class11025(class00891 class008912, int n) {
        this.block = class008912;
        this.color = n;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11025.class, "block;color", "block", "color"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11025.class, "block;color", "block", "color"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11025.class, "block;color", "block", "color"}, this);
    }

    public int y() {
        return this.color;
    }

    public class00891 N() {
        return this.block;
    }
}

