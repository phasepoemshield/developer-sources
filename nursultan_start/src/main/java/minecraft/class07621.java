/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class00471
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06339
 *  minecraft.class06378
 *  minecraft.class06584
 *  minecraft.class07439
 *  minecraft.class07491
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import minecraft.class00453;
import minecraft.class00471;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06339;
import minecraft.class06378;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class07491;

public class class07621
extends class00453 {
    public static final MapCodec<class07621> N = RecordCodecBuilder.mapCodec(instance -> class07621.N(instance).and(instance.group((App)class06339.N.fieldOf("count").forGetter(class076212 -> class076212.y), (App)Codec.BOOL.fieldOf("add").orElse((Object)false).forGetter(class076212 -> class076212.L))).apply(instance, class07621::new));
    private final class06378 y;
    private final boolean L;

    private class07621(List<class05957> list, class06378 class063782, boolean bl) {
        super(list);
        this.y = class063782;
        this.L = bl;
    }

    public Set<class07491<?>> y() {
        return this.y.y();
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        int n = this.L ? class065842.c() : 0;
        class065842.i(n + this.y.N(class059082));
        return class065842;
    }

    public static class00471<?> N(class06378 class063782) {
        return class07621.N((T list) -> new class07621((List<class05957>)list, class063782, false));
    }

    public static class00471<?> N(class06378 class063782, boolean bl) {
        return class07621.N((T list) -> new class07621((List<class05957>)list, class063782, bl));
    }

    public class05959<class07621> N() {
        return class07439.i;
    }
}

