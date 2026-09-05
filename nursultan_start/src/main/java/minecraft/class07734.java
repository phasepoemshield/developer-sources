/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01362
 *  minecraft.class03137
 *  minecraft.class05700
 *  minecraft.class06563
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01362;
import minecraft.class03137;
import minecraft.class05700;
import minecraft.class06563;

public class class07734
extends class03137
implements class05700 {
    public static final MapCodec<class07734> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06563.field_41600.fieldOf("color").forGetter(class07734::y), (App)class07734.t()).apply(instance, class07734::new));
    private final class06563 L;

    public class07734(class06563 class065632, class01362 class013622) {
        super(class013622);
        this.L = class065632;
    }

    public class06563 y() {
        return this.L;
    }

    public MapCodec<class07734> N() {
        return N;
    }
}

