/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04489
 *  minecraft.class07321
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04489;
import minecraft.class07321;

public final class class10870
extends Record
implements class04489 {
    private final class07321 pos;

    public class10870(class07321 class073212) {
        this.pos = class073212;
    }

    public String get() {
        return "chunk@" + String.valueOf(this.pos);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10870.class, "pos", "pos"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10870.class, "pos", "pos"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10870.class, "pos", "pos"}, this);
    }

    public class07321 N() {
        return this.pos;
    }
}

