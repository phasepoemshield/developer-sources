/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00404
 *  minecraft.class00453
 *  minecraft.class00471
 *  minecraft.class02484
 *  minecraft.class02720
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04480
 *  minecraft.class05074
 *  minecraft.class05561
 *  minecraft.class05566
 *  minecraft.class05576
 *  minecraft.class05908
 *  minecraft.class05946
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class07439
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00404;
import minecraft.class00453;
import minecraft.class00471;
import minecraft.class02484;
import minecraft.class02720;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04480;
import minecraft.class05074;
import minecraft.class05561;
import minecraft.class05566;
import minecraft.class05576;
import minecraft.class05908;
import minecraft.class05946;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07439;

public class class07624
extends class00453 {
    public static final MapCodec<class07624> N = RecordCodecBuilder.mapCodec(instance -> class07624.N(instance).and(instance.group((App)class05074.N.fieldOf("name").forGetter(class076242 -> class076242.y), (App)Codec.LONG.optionalFieldOf("seed", (Object)0L).forGetter(class076242 -> class076242.L), (App)class04206.U.b().fieldOf("type").forGetter(class076242 -> class076242.u))).apply(instance, class07624::new));
    private final class05946<class05074> y;
    private final long L;
    private final class03556<class00404<?>> u;

    private class07624(List<class05957> list, class05946<class05074> class059462, long l, class03556<class00404<?>> class035562) {
        super(list);
        this.y = class059462;
        this.L = l;
        this.u = class035562;
    }

    public void N(class05561 class055612) {
        super.N(class055612);
        if (!class055612.y()) {
            class055612.N((class04480)new class05566(this.y));
            return;
        }
        if (class055612.N().u(this.y).isEmpty()) {
            class055612.N((class04480)new class05576(this.y));
        }
    }

    public class05959<class07624> N() {
        return class07439.d;
    }

    public static class00471<?> N(class00404<?> class004042, class05946<class05074> class059462) {
        return class07624.N((T list) -> new class07624((List<class05957>)list, class059462, 0L, (class03556<class00404<?>>)class004042.method_53254()));
    }

    public static class00471<?> N(class00404<?> class004042, class05946<class05074> class059462, long l) {
        return class07624.N((T list) -> new class07624((List<class05957>)list, class059462, l, (class03556<class00404<?>>)class004042.method_53254()));
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        if (class065842.R()) {
            return class065842;
        }
        class065842.N(class02484.Nk, (Object)new class02720(this.y, this.L));
        return class065842;
    }
}

