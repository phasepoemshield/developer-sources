/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00392
 *  minecraft.class00453
 *  minecraft.class02484
 *  minecraft.class02489
 *  minecraft.class02706
 *  minecraft.class02826
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class07439
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00392;
import minecraft.class00453;
import minecraft.class02484;
import minecraft.class02489;
import minecraft.class02706;
import minecraft.class02826;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07439;

public class class02326
extends class00453 {
    public static final MapCodec<class02326> N = RecordCodecBuilder.mapCodec(instance -> class02326.N(instance).and(instance.group((App)class02706.B.fieldOf("pages").forGetter(class023262 -> class023262.y), (App)class02489.N.forGetter(class023262 -> class023262.L))).apply(instance, class02326::new));
    private final List<class02826<class00392>> y;
    private final class02489 L;

    protected class02326(List<class05957> list, List<class02826<class00392>> list2, class02489 class024892) {
        super(list);
        this.y = list2;
        this.L = class024892;
    }

    public class02706 N(class02706 class027062) {
        List list = this.L.N(class027062.N(), this.y);
        return class027062.y(list);
    }

    protected class06584 N(class06584 class065842, class05908 class059082) {
        class065842.N(class02484.NL, (Object)class02706.N, this::N);
        return class065842;
    }

    public class05959<class02326> N() {
        return class07439.c;
    }
}

