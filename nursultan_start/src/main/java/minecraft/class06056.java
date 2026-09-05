/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00410
 *  minecraft.class01362
 *  minecraft.class06563
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00410;
import minecraft.class01362;
import minecraft.class06563;

public class class06056
extends class00410 {
    public static final MapCodec<class06056> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06563.field_41600.fieldOf("color").forGetter(class06056::y), (App)class06056.t()).apply(instance, class06056::new));
    private final class06563 L;

    public class06056(class06563 class065632, class01362 class013622) {
        super(class013622);
        this.L = class065632;
    }

    public class06563 y() {
        return this.L;
    }

    public MapCodec<class06056> N() {
        return y;
    }
}

