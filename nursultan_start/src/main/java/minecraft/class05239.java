/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01219
 *  minecraft.class01228
 *  minecraft.class01233
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class07209
 *  minecraft.class07830
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01219;
import minecraft.class01228;
import minecraft.class01233;
import minecraft.class04782;
import minecraft.class05235;
import minecraft.class05487;
import minecraft.class07209;
import minecraft.class07830;
import org.jspecify.annotations.Nullable;

public class class05239
extends class01219 {
    public static final MapCodec<class05239> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07830.field_24772.fieldOf("heightmap").orElse((Object)class07830.field_13194).forGetter(class052392 -> class052392.y), (App)Codec.INT.fieldOf("offset").orElse((Object)0).forGetter(class052392 -> class052392.L)).apply(instance, class05239::new));
    private final class07830 y;
    private final int L;

    public class05239(class07830 class078302, int n) {
        this.y = class078302;
        this.L = n;
    }

    public @Nullable class01228 N(class05487 class054872, class07209 class072092, class07209 class072093, class01228 class012282, class01228 class012283, class01233 class012332) {
        class07830 class078302 = class054872 instanceof class04782 ? (this.y == class07830.field_13194 ? class07830.field_13202 : (this.y == class07830.field_13195 ? class07830.field_13200 : this.y)) : this.y;
        class07209 class072094 = class012283.N();
        int n = class054872.method_8624(class078302, class072094.method_10263(), class072094.method_10260()) + this.L;
        int n2 = class012282.N().method_10264();
        return new class01228(new class07209(class072094.method_10263(), n + n2, class072094.method_10260()), class012283.y(), class012283.L());
    }

    protected class05235<?> N() {
        return class05235.M;
    }
}

