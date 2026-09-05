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
 *  minecraft.class00102
 *  minecraft.class00392
 *  minecraft.class03748
 *  minecraft.class06338
 *  minecraft.class09015
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00102;
import minecraft.class00392;
import minecraft.class03748;
import minecraft.class06338;
import minecraft.class09015;
import minecraft.class09037;

public final class class09035
extends Record
implements class09015 {
    private final int width;
    private final class00392 label;
    private final boolean labelVisible;
    private final String initial;
    private final int maxLength;
    private final Optional<class00102> multiline;
    public static final MapCodec<class09035> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class09037.y.optionalFieldOf("width", (Object)200).forGetter(class09035::y), (App)class03748.N.fieldOf("label").forGetter(class09035::L), (App)Codec.BOOL.optionalFieldOf("label_visible", (Object)true).forGetter(class09035::u), (App)Codec.STRING.optionalFieldOf("initial", (Object)"").forGetter(class09035::i), (App)class06338.b.optionalFieldOf("max_length", (Object)32).forGetter(class09035::R), (App)class00102.y.optionalFieldOf("multiline").forGetter(class09035::M)).apply(instance, class09035::new)).validate(class090352 -> {
        if (class090352.initial.length() > class090352.R()) {
            return DataResult.error(() -> "Default text length exceeds allowed size");
        }
        return DataResult.success((Object)class090352);
    });

    public class00392 L() {
        return this.label;
    }

    public Optional<class00102> M() {
        return this.multiline;
    }

    public class09035(int n, class00392 class003922, boolean bl, String string, int n2, Optional<class00102> optional) {
        this.width = n;
        this.label = class003922;
        this.labelVisible = bl;
        this.initial = string;
        this.maxLength = n2;
        this.multiline = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09035.class, "width;label;labelVisible;initial;maxLength;multiline", "width", "label", "labelVisible", "initial", "maxLength", "multiline"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09035.class, "width;label;labelVisible;initial;maxLength;multiline", "width", "label", "labelVisible", "initial", "maxLength", "multiline"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09035.class, "width;label;labelVisible;initial;maxLength;multiline", "width", "label", "labelVisible", "initial", "maxLength", "multiline"}, this);
    }

    public String i() {
        return this.initial;
    }

    public boolean u() {
        return this.labelVisible;
    }

    public int y() {
        return this.width;
    }

    public MapCodec<class09035> N() {
        return N;
    }

    public int R() {
        return this.maxLength;
    }
}

