/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10091
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03979
 *  minecraft.class04017
 *  minecraft.class04018
 *  minecraft.class04039
 */
package minecraft;

import Nursultan.class10091;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03979;
import minecraft.class04017;
import minecraft.class04018;
import minecraft.class04039;

public final class class03033
extends Record
implements class04017 {
    public final int offset;
    public final int surfaceDepthMultiplier;
    public final boolean addStoneDepth;
    static final class03979<class03033> i = class03979.N((MapCodec)RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.INT.fieldOf("offset").forGetter(class03033::y), (App)Codec.intRange((int)-20, (int)20).fieldOf("surface_depth_multiplier").forGetter(class03033::L), (App)Codec.BOOL.fieldOf("add_stone_depth").forGetter(class03033::u)).apply(instance, class03033::new)));

    public int L() {
        return this.surfaceDepthMultiplier;
    }

    class03033(int n, int n2, boolean bl) {
        this.offset = n;
        this.surfaceDepthMultiplier = n2;
        this.addStoneDepth = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03033.class, "offset;surfaceDepthMultiplier;addStoneDepth", "offset", "surfaceDepthMultiplier", "addStoneDepth"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03033.class, "offset;surfaceDepthMultiplier;addStoneDepth", "offset", "surfaceDepthMultiplier", "addStoneDepth"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03033.class, "offset;surfaceDepthMultiplier;addStoneDepth", "offset", "surfaceDepthMultiplier", "addStoneDepth"}, this);
    }

    public boolean u() {
        return this.addStoneDepth;
    }

    public int y() {
        return this.offset;
    }

    public class03979<? extends class04017> N() {
        return i;
    }

    public class04018 apply(class04039 class040392) {
        return new class10091(this, class040392);
    }
}

