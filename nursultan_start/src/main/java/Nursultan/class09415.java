/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00949
 *  minecraft.class02689
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00949;
import minecraft.class02689;

public final class class09415
extends Record
implements class00949 {
    private final class02689 profile;
    private final boolean hat;

    public class09415(class02689 class026892, boolean bl) {
        this.profile = class026892;
        this.hat = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09415.class, "profile;hat", "profile", "hat"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09415.class, "profile;hat", "profile", "hat"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09415.class, "profile;hat", "profile", "hat"}, this);
    }

    public boolean y() {
        return this.hat;
    }

    public class02689 N() {
        return this.profile;
    }
}

