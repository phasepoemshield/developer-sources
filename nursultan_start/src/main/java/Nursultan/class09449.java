/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class03511
 */
package Nursultan;

import Nursultan.class09443;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class01894;
import minecraft.class03511;

public final class class09449
extends Record
implements class03511<class01894> {
    public final List<class09443> entries;

    public class09449(List<class09443> list) {
        this.entries = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09449.class, "entries", "entries"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09449.class, "entries", "entries"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09449.class, "entries", "entries"}, this);
    }

    public void y(Consumer<class01894> consumer) {
        this.entries.forEach(class094432 -> class094432.N().method_43944(consumer));
    }

    public List<class09443> N() {
        return this.entries;
    }

    public void N(Consumer<class01894> consumer) {
        this.entries.forEach(class094432 -> class094432.N().method_32831(consumer));
    }
}

