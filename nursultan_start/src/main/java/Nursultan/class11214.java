/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09065
 *  Nursultan.class09076
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08066
 */
package Nursultan;

import Nursultan.class09065;
import Nursultan.class09076;
import Nursultan.class11171;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class08066;

public class class11214<C>
extends Record
implements class11171<C> {
    public Supplier<class08066> framebuffer;
    private static String[] L;
    public boolean viewport;

    public boolean L() {
        return this.viewport;
    }

    class11214(Supplier<class08066> supplier, boolean bl) {
        this.framebuffer = Objects.requireNonNull(supplier, L[0]);
        this.viewport = bl;
    }

    static {
        class11214.i();
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11214.class, "framebuffer;viewport", "framebuffer", "viewport"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11214.class, "framebuffer;viewport", "framebuffer", "viewport"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11214.class, "framebuffer;viewport", "framebuffer", "viewport"}, this);
    }

    private static void i() {
        L = new String[1];
        class11214.L[0] = "framebuffer";
    }

    public Supplier<class08066> u() {
        return this.framebuffer;
    }

    @Override
    public void N(C c, class09076 class090762, class09065 class090652) {
        class090652.N(this.framebuffer.get(), this.viewport);
    }
}

