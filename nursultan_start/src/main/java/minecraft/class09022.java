/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class03748
 *  minecraft.class09034
 *  minecraft.class09037
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class03748;
import minecraft.class09034;
import minecraft.class09037;

public final class class09022
extends Record
implements class09034 {
    private final class00392 contents;
    private final int width;
    public static final int L = 200;
    public static final MapCodec<class09022> u = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03748.N.fieldOf("contents").forGetter(class09022::y), (App)class09037.y.optionalFieldOf("width", (Object)200).forGetter(class09022::L)).apply(instance, class09022::new));
    public static final Codec<class09022> i = Codec.withAlternative((Codec)u.codec(), (Codec)class03748.N, class003922 -> new class09022((class00392)class003922, 200));

    public int L() {
        return this.width;
    }

    public class09022(class00392 class003922, int n) {
        this.contents = class003922;
        this.width = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09022.class, "contents;width", "contents", "width"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09022.class, "contents;width", "contents", "width"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09022.class, "contents;width", "contents", "width"}, this);
    }

    public class00392 y() {
        return this.contents;
    }

    public MapCodec<class09022> N() {
        return u;
    }
}

