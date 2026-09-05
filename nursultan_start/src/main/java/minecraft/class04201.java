/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;

public final class class04201
extends Record {
    final class01894 sprite;
    final double x;
    final double y;
    final double width;
    final double height;
    public static final Codec<class04201> R = RecordCodecBuilder.create(instance -> instance.group((App)class01894.N.fieldOf("sprite").forGetter(class04201::N), (App)Codec.DOUBLE.fieldOf("x").forGetter(class04201::y), (App)Codec.DOUBLE.fieldOf("y").forGetter(class04201::L), (App)Codec.DOUBLE.fieldOf("width").forGetter(class04201::u), (App)Codec.DOUBLE.fieldOf("height").forGetter(class04201::i)).apply(instance, class04201::new));

    public double L() {
        return this.y;
    }

    public class04201(class01894 class018942, double d, double d2, double d3, double d4) {
        this.sprite = class018942;
        this.x = d;
        this.y = d2;
        this.width = d3;
        this.height = d4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04201.class, "sprite;x;y;width;height", "sprite", "x", "y", "width", "height"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04201.class, "sprite;x;y;width;height", "sprite", "x", "y", "width", "height"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04201.class, "sprite;x;y;width;height", "sprite", "x", "y", "width", "height"}, this);
    }

    public double i() {
        return this.height;
    }

    public double u() {
        return this.width;
    }

    public double y() {
        return this.x;
    }

    public class01894 N() {
        return this.sprite;
    }
}

