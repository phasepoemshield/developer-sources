/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import minecraft.class05052;
import minecraft.class05054;

public class class05046
extends class05054 {
    public static final MapCodec<class05046> u = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.intRange((int)0, (int)81).fieldOf("limit").orElse((Object)1).forGetter(class050462 -> class050462.i), (App)Codec.intRange((int)0, (int)16).fieldOf("lower_size").orElse((Object)0).forGetter(class050462 -> class050462.R), (App)Codec.intRange((int)0, (int)16).fieldOf("upper_size").orElse((Object)1).forGetter(class050462 -> class050462.M), class05046.N()).apply(instance, class05046::new));
    private final int i;
    private final int R;
    private final int M;

    public class05046(int n, int n2, int n3) {
        this(n, n2, n3, OptionalInt.empty());
    }

    public class05046(int n, int n2, int n3, OptionalInt optionalInt) {
        super(optionalInt);
        this.i = n;
        this.R = n2;
        this.M = n3;
    }

    @Override
    protected class05052<?> y() {
        return class05052.N;
    }

    @Override
    public int N(int n, int n2) {
        return n2 < this.i ? this.R : this.M;
    }
}

