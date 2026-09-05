/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01471
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01471;
import minecraft.class06386;

public final class class05610
extends Record
implements class06386 {
    private final class01471 toPlace;
    private final boolean scheduleTick;
    public static final Codec<class05610> N = RecordCodecBuilder.create(instance -> instance.group((App)class01471.N.fieldOf("to_place").forGetter(class056102 -> class056102.toPlace), (App)Codec.BOOL.optionalFieldOf("schedule_tick", (Object)false).forGetter(class056102 -> class056102.scheduleTick)).apply(instance, class05610::new));

    public class05610(class01471 class014712) {
        this(class014712, false);
    }

    public class05610(class01471 class014712, boolean bl) {
        this.toPlace = class014712;
        this.scheduleTick = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05610.class, "toPlace;scheduleTick", "toPlace", "scheduleTick"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05610.class, "toPlace;scheduleTick", "toPlace", "scheduleTick"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05610.class, "toPlace;scheduleTick", "toPlace", "scheduleTick"}, this);
    }

    public boolean y() {
        return this.scheduleTick;
    }

    public class01471 N() {
        return this.toPlace;
    }
}

