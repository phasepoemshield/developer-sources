/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class05085;
import minecraft.class06338;

public final class class05082
extends Record {
    private final class05085 placement;
    private final float airPocketProbability;
    private final float mossiness;
    private final boolean overgrown;
    private final boolean vines;
    private final boolean canBeCold;
    private final boolean replaceWithBlackstone;
    private final float weight;
    public static final Codec<class05082> N = RecordCodecBuilder.create(instance -> instance.group((App)class05085.field_37811.fieldOf("placement").forGetter(class05082::N), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("air_pocket_probability").forGetter(class05082::y), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("mossiness").forGetter(class05082::L), (App)Codec.BOOL.fieldOf("overgrown").forGetter(class05082::u), (App)Codec.BOOL.fieldOf("vines").forGetter(class05082::i), (App)Codec.BOOL.fieldOf("can_be_cold").forGetter(class05082::R), (App)Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(class05082::M), (App)class06338.t.fieldOf("weight").forGetter(class05082::B)).apply(instance, class05082::new));

    public float L() {
        return this.mossiness;
    }

    public boolean M() {
        return this.replaceWithBlackstone;
    }

    public class05082(class05085 class050852, float f, float f2, boolean bl, boolean bl2, boolean bl3, boolean bl4, float f3) {
        this.placement = class050852;
        this.airPocketProbability = f;
        this.mossiness = f2;
        this.overgrown = bl;
        this.vines = bl2;
        this.canBeCold = bl3;
        this.replaceWithBlackstone = bl4;
        this.weight = f3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05082.class, "placement;airPocketProbability;mossiness;overgrown;vines;canBeCold;replaceWithBlackstone;weight", "placement", "airPocketProbability", "mossiness", "overgrown", "vines", "canBeCold", "replaceWithBlackstone", "weight"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05082.class, "placement;airPocketProbability;mossiness;overgrown;vines;canBeCold;replaceWithBlackstone;weight", "placement", "airPocketProbability", "mossiness", "overgrown", "vines", "canBeCold", "replaceWithBlackstone", "weight"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05082.class, "placement;airPocketProbability;mossiness;overgrown;vines;canBeCold;replaceWithBlackstone;weight", "placement", "airPocketProbability", "mossiness", "overgrown", "vines", "canBeCold", "replaceWithBlackstone", "weight"}, this);
    }

    public float B() {
        return this.weight;
    }

    public boolean i() {
        return this.vines;
    }

    public boolean u() {
        return this.overgrown;
    }

    public float y() {
        return this.airPocketProbability;
    }

    public class05085 N() {
        return this.placement;
    }

    public boolean R() {
        return this.canBeCold;
    }
}

