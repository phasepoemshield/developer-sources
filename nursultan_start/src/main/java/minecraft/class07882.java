/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class00471
 *  minecraft.class04995
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06339
 *  minecraft.class06378
 *  minecraft.class06584
 *  minecraft.class07439
 *  minecraft.class07491
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import minecraft.class00453;
import minecraft.class00471;
import minecraft.class04995;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06339;
import minecraft.class06378;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class07491;
import org.slf4j.Logger;

public class class07882
extends class00453 {
    private static final Logger y = LogUtils.getLogger();
    public static final MapCodec<class07882> N = RecordCodecBuilder.mapCodec(instance -> class07882.N(instance).and(instance.group((App)class06339.N.fieldOf("damage").forGetter(class078822 -> class078822.L), (App)Codec.BOOL.fieldOf("add").orElse((Object)false).forGetter(class078822 -> class078822.u))).apply(instance, class07882::new));
    private final class06378 L;
    private final boolean u;

    private class07882(List<class05957> list, class06378 class063782, boolean bl) {
        super(list);
        this.L = class063782;
        this.u = bl;
    }

    public Set<class07491<?>> y() {
        return this.L.y();
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        if (class065842.W()) {
            int n = class065842.s();
            float f = this.u ? 1.0f - (float)class065842.P() / (float)n : 0.0f;
            float f2 = 1.0f - class04995.N((float)(this.L.y(class059082) + f), (float)0.0f, (float)1.0f);
            class065842.y(class04995.y((float)(f2 * (float)n)));
        } else {
            y.warn("Couldn't set damage of loot item {}", (Object)class065842);
        }
        return class065842;
    }

    public static class00471<?> N(class06378 class063782) {
        return class07882.N((T list) -> new class07882((List<class05957>)list, class063782, false));
    }

    public static class00471<?> N(class06378 class063782, boolean bl) {
        return class07882.N((T list) -> new class07882((List<class05957>)list, class063782, bl));
    }

    public class05959<class07882> N() {
        return class07439.m;
    }
}

