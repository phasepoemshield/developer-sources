/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class03748
 *  minecraft.class06338
 *  minecraft.class09025
 *  minecraft.class09037
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class03748;
import minecraft.class06338;
import minecraft.class09015;
import minecraft.class09025;
import minecraft.class09037;

public final class class08997
extends Record
implements class09015 {
    private final int width;
    private final List<class09025> entries;
    private final class00392 label;
    private final boolean labelVisible;
    public static final MapCodec<class08997> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class09037.y.optionalFieldOf("width", (Object)200).forGetter(class08997::L), (App)class06338.y((Codec)class09025.y.listOf()).fieldOf("options").forGetter(class08997::u), (App)class03748.N.fieldOf("label").forGetter(class08997::i), (App)Codec.BOOL.optionalFieldOf("label_visible", (Object)true).forGetter(class08997::R)).apply(instance, class08997::new)).validate(class089972 -> {
        if (class089972.entries.stream().filter(class09025::u).count() > 1L) {
            return DataResult.error(() -> "Multiple initial values");
        }
        return DataResult.success((Object)class089972);
    });

    public int L() {
        return this.width;
    }

    public class08997(int n, List<class09025> list, class00392 class003922, boolean bl) {
        this.width = n;
        this.entries = list;
        this.label = class003922;
        this.labelVisible = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08997.class, "width;entries;label;labelVisible", "width", "entries", "label", "labelVisible"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08997.class, "width;entries;label;labelVisible", "width", "entries", "label", "labelVisible"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08997.class, "width;entries;label;labelVisible", "width", "entries", "label", "labelVisible"}, this);
    }

    public class00392 i() {
        return this.label;
    }

    public List<class09025> u() {
        return this.entries;
    }

    public Optional<class09025> y() {
        return this.entries.stream().filter(class09025::u).findFirst();
    }

    public MapCodec<class08997> N() {
        return N;
    }

    public boolean R() {
        return this.labelVisible;
    }
}

