/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07209
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07209;

public class class11149
extends Record {
    public int color;
    public class07209 blockPos;

    class11149(class07209 class072092, int n) {
        this.blockPos = class072092;
        this.color = n;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11149.class, "blockPos;color", "blockPos", "color"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11149.class, "blockPos;color", "blockPos", "color"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11149.class, "blockPos;color", "blockPos", "color"}, this);
    }

    public int y() {
        return this.color;
    }

    public class07209 N() {
        return this.blockPos;
    }
}

