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
import Nursultan.class11212;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class08066;

public class class11186
extends Record
implements class11212 {
    public boolean viewport;
    public Supplier<class08066> framebuffer;

    public Supplier<class08066> L() {
        return this.framebuffer;
    }

    class11186(Supplier<class08066> supplier, boolean bl) {
        Objects.requireNonNull(supplier, "framebuffer");
        this.framebuffer = supplier;
        this.viewport = bl;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11186.class, "framebuffer;viewport", "framebuffer", "viewport"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11186.class, "framebuffer;viewport", "framebuffer", "viewport"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11186.class, "framebuffer;viewport", "framebuffer", "viewport"}, this);
    }

    public boolean y() {
        return this.viewport;
    }

    @Override
    public boolean N(class09076 class090762) {
        return true;
    }

    @Override
    public void N(class09076 class090762, class09065 class090652) {
        class090652.N(this.framebuffer.get(), this.viewport);
    }
}

