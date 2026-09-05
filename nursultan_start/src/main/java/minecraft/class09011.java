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
 *  minecraft.class09037
 *  minecraft.class09041
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
import minecraft.class09015;
import minecraft.class09037;
import minecraft.class09041;

public final class class09011
extends Record
implements class09015 {
    private final int width;
    private final class00392 label;
    private final String labelFormat;
    private final class09041 rangeInfo;
    public static final MapCodec<class09011> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class09037.y.optionalFieldOf("width", (Object)200).forGetter(class09011::y), (App)class03748.N.fieldOf("label").forGetter(class09011::L), (App)Codec.STRING.optionalFieldOf("label_format", (Object)"options.generic_value").forGetter(class09011::u), (App)class09041.N.forGetter(class09011::i)).apply(instance, class09011::new));

    public class00392 L() {
        return this.label;
    }

    public class09011(int n, class00392 class003922, String string, class09041 class090412) {
        this.width = n;
        this.label = class003922;
        this.labelFormat = string;
        this.rangeInfo = class090412;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09011.class, "width;label;labelFormat;rangeInfo", "width", "label", "labelFormat", "rangeInfo"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09011.class, "width;label;labelFormat;rangeInfo", "width", "label", "labelFormat", "rangeInfo"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09011.class, "width;label;labelFormat;rangeInfo", "width", "label", "labelFormat", "rangeInfo"}, this);
    }

    public class09041 i() {
        return this.rangeInfo;
    }

    public String u() {
        return this.labelFormat;
    }

    public int y() {
        return this.width;
    }

    public MapCodec<class09011> N() {
        return N;
    }

    public class00392 N(String string) {
        return class00392.N((String)this.labelFormat, (Object[])new Object[]{this.label, string});
    }
}

