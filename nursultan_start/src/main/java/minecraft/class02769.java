/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class06889
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class06889;

public final class class02769
extends Record {
    final class06889 position;
    final class06889 movement;
    final float yRot;
    final float xRot;
    final float weight;
    public static final class02362<ByteBuf, class02769> R = class02362.N((class02362)class06889.y, class02769::N, (class02362)class06889.y, class02769::y, (class02362)class02389.u, class02769::L, (class02362)class02389.u, class02769::u, (class02362)class02389.E, class02769::i, class02769::new);
    public static class02769 M = new class02769(class06889.L, class06889.L, 0.0f, 0.0f, 0.0f);

    public float L() {
        return this.yRot;
    }

    public class02769(class06889 class068892, class06889 class068893, float f, float f2, float f3) {
        this.position = class068892;
        this.movement = class068893;
        this.yRot = f;
        this.xRot = f2;
        this.weight = f3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02769.class, "position;movement;yRot;xRot;weight", "position", "movement", "yRot", "xRot", "weight"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02769.class, "position;movement;yRot;xRot;weight", "position", "movement", "yRot", "xRot", "weight"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02769.class, "position;movement;yRot;xRot;weight", "position", "movement", "yRot", "xRot", "weight"}, this);
    }

    public float i() {
        return this.weight;
    }

    public float u() {
        return this.xRot;
    }

    public class06889 y() {
        return this.movement;
    }

    public class06889 N() {
        return this.position;
    }
}

