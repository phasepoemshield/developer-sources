/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10092
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02258
 *  minecraft.class03979
 *  minecraft.class04017
 *  minecraft.class04018
 *  minecraft.class04039
 */
package minecraft;

import Nursultan.class10092;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02258;
import minecraft.class03979;
import minecraft.class04017;
import minecraft.class04018;
import minecraft.class04039;

public final class class03037
extends Record
implements class04017 {
    public final int offset;
    public final boolean addSurfaceDepth;
    public final int secondaryDepthRange;
    private final class02258 surfaceType;
    static final class03979<class03037> i = class03979.N((MapCodec)RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.INT.fieldOf("offset").forGetter(class03037::y), (App)Codec.BOOL.fieldOf("add_surface_depth").forGetter(class03037::L), (App)Codec.INT.fieldOf("secondary_depth_range").forGetter(class03037::u), (App)class02258.field_29315.fieldOf("surface_type").forGetter(class03037::i)).apply(instance, class03037::new)));

    public boolean L() {
        return this.addSurfaceDepth;
    }

    class03037(int n, boolean bl, int n2, class02258 class022582) {
        this.offset = n;
        this.addSurfaceDepth = bl;
        this.secondaryDepthRange = n2;
        this.surfaceType = class022582;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03037.class, "offset;addSurfaceDepth;secondaryDepthRange;surfaceType", "offset", "addSurfaceDepth", "secondaryDepthRange", "surfaceType"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03037.class, "offset;addSurfaceDepth;secondaryDepthRange;surfaceType", "offset", "addSurfaceDepth", "secondaryDepthRange", "surfaceType"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03037.class, "offset;addSurfaceDepth;secondaryDepthRange;surfaceType", "offset", "addSurfaceDepth", "secondaryDepthRange", "surfaceType"}, this);
    }

    public class02258 i() {
        return this.surfaceType;
    }

    public int u() {
        return this.secondaryDepthRange;
    }

    public int y() {
        return this.offset;
    }

    public class03979<? extends class04017> N() {
        return i;
    }

    public class04018 apply(class04039 class040392) {
        boolean bl = this.surfaceType == class02258.field_29313;
        return new class10092(this, class040392, bl);
    }
}

