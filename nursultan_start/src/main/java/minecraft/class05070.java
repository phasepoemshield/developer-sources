/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class05052
 *  minecraft.class05054
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;
import minecraft.class05052;
import minecraft.class05054;

public class class05070
extends class05054 {
    public static final MapCodec<class05070> u = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.intRange((int)0, (int)80).fieldOf("limit").orElse((Object)1).forGetter(class050702 -> class050702.i), (App)Codec.intRange((int)0, (int)80).fieldOf("upper_limit").orElse((Object)1).forGetter(class050702 -> class050702.R), (App)Codec.intRange((int)0, (int)16).fieldOf("lower_size").orElse((Object)0).forGetter(class050702 -> class050702.M), (App)Codec.intRange((int)0, (int)16).fieldOf("middle_size").orElse((Object)1).forGetter(class050702 -> class050702.B), (App)Codec.intRange((int)0, (int)16).fieldOf("upper_size").orElse((Object)1).forGetter(class050702 -> class050702.Z), (App)class05070.N()).apply(instance, class05070::new));
    private final int i;
    private final int R;
    private final int M;
    private final int B;
    private final int Z;

    public class05070(int n, int n2, int n3, int n4, int n5, OptionalInt optionalInt) {
        super(optionalInt);
        this.i = n;
        this.R = n2;
        this.M = n3;
        this.B = n4;
        this.Z = n5;
    }

    protected class05052<?> y() {
        return class05052.y;
    }

    public int N(int n, int n2) {
        if (n2 < this.i) {
            return this.M;
        }
        if (n2 >= n - this.R) {
            return this.Z;
        }
        return this.B;
    }
}

