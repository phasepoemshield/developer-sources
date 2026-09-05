/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08057
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class08057;

public final class class08074
extends Record {
    private final double centerX;
    private final double centerZ;
    private final double damagePerBlock;
    private final double safeZone;
    private final int warningBlocks;
    private final int warningTime;
    private final double size;
    private final long lerpTime;
    private final double lerpTarget;
    public static final class08074 N = new class08074(0.0, 0.0, 0.2, 5.0, 5, 300, 5.9999968E7, 0L, 0.0);
    public static final Codec<class08074> y = RecordCodecBuilder.create(instance -> instance.group((App)Codec.doubleRange((double)-2.9999984E7, (double)2.9999984E7).fieldOf("center_x").forGetter(class08074::N), (App)Codec.doubleRange((double)-2.9999984E7, (double)2.9999984E7).fieldOf("center_z").forGetter(class08074::y), (App)Codec.DOUBLE.fieldOf("damage_per_block").forGetter(class08074::L), (App)Codec.DOUBLE.fieldOf("safe_zone").forGetter(class08074::u), (App)Codec.INT.fieldOf("warning_blocks").forGetter(class08074::i), (App)Codec.INT.fieldOf("warning_time").forGetter(class08074::R), (App)Codec.DOUBLE.fieldOf("size").forGetter(class08074::M), (App)Codec.LONG.fieldOf("lerp_time").forGetter(class08074::B), (App)Codec.DOUBLE.fieldOf("lerp_target").forGetter(class08074::Z)).apply(instance, class08074::new));

    public double L() {
        return this.damagePerBlock;
    }

    public double M() {
        return this.size;
    }

    public class08074(double d, double d2, double d3, double d4, int n, int n2, double d5, long l, double d6) {
        this.centerX = d;
        this.centerZ = d2;
        this.damagePerBlock = d3;
        this.safeZone = d4;
        this.warningBlocks = n;
        this.warningTime = n2;
        this.size = d5;
        this.lerpTime = l;
        this.lerpTarget = d6;
    }

    public class08074(class08057 class080572) {
        this(class080572.Z, class080572.z, class080572.i, class080572.R, class080572.B, class080572.M, class080572.E.N(), class080572.E.L(), class080572.E.u());
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08074.class, "centerX;centerZ;damagePerBlock;safeZone;warningBlocks;warningTime;size;lerpTime;lerpTarget", "centerX", "centerZ", "damagePerBlock", "safeZone", "warningBlocks", "warningTime", "size", "lerpTime", "lerpTarget"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08074.class, "centerX;centerZ;damagePerBlock;safeZone;warningBlocks;warningTime;size;lerpTime;lerpTarget", "centerX", "centerZ", "damagePerBlock", "safeZone", "warningBlocks", "warningTime", "size", "lerpTime", "lerpTarget"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08074.class, "centerX;centerZ;damagePerBlock;safeZone;warningBlocks;warningTime;size;lerpTime;lerpTarget", "centerX", "centerZ", "damagePerBlock", "safeZone", "warningBlocks", "warningTime", "size", "lerpTime", "lerpTarget"}, this);
    }

    public long B() {
        return this.lerpTime;
    }

    public double Z() {
        return this.lerpTarget;
    }

    public int i() {
        return this.warningBlocks;
    }

    public double u() {
        return this.safeZone;
    }

    public double y() {
        return this.centerZ;
    }

    public double N() {
        return this.centerX;
    }

    public int R() {
        return this.warningTime;
    }
}

