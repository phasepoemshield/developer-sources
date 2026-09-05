/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01207
 *  minecraft.class01219
 *  minecraft.class01233
 *  minecraft.class01894
 *  minecraft.class02610
 *  minecraft.class03556
 *  minecraft.class04872
 *  minecraft.class05163
 *  minecraft.class05246
 *  minecraft.class05267
 *  minecraft.class05282
 *  minecraft.class05483
 *  minecraft.class06993
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class01207;
import minecraft.class01219;
import minecraft.class01233;
import minecraft.class01894;
import minecraft.class02610;
import minecraft.class03556;
import minecraft.class04872;
import minecraft.class05163;
import minecraft.class05246;
import minecraft.class05267;
import minecraft.class05282;
import minecraft.class05483;
import minecraft.class06993;

public class class05057
extends class04872 {
    public static final MapCodec<class05057> R = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05057.u(), (App)class05057.y(), (App)class05057.R(), (App)class05057.L()).apply(instance, class05057::new));

    public class05057(Either<class01894, class01207> either, class03556<class05483> class035562, class05246 class052462, Optional<class02610> optional) {
        super(either, class035562, class052462, optional);
    }

    public String toString() {
        return "LegacySingle[" + String.valueOf(this.y) + "]";
    }

    public class05267<?> N() {
        return class05267.i;
    }

    protected class01233 N(class06993 class069932, class05163 class051632, class02610 class026102, boolean bl) {
        class01233 class012332 = super.N(class069932, class051632, class026102, bl);
        class012332.y((class01219)class05282.y);
        class012332.N((class01219)class05282.u);
        return class012332;
    }
}

