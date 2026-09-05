/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class03556
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07310
 *  minecraft.class07439
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00453;
import minecraft.class03556;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07310;
import minecraft.class07439;

public class class02925
extends class00453 {
    public static final MapCodec<class02925> N = RecordCodecBuilder.mapCodec(instance -> class02925.N(instance).and((App)class06581.u.fieldOf("item").forGetter(class029252 -> class029252.y)).apply(instance, class02925::new));
    private final class03556<class06581> y;

    private class02925(List<class05957> list, class03556<class06581> class035562) {
        super(list);
        this.y = class035562;
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        return class065842.N((class07310)this.y.N());
    }

    public class05959<class02925> N() {
        return class07439.R;
    }
}

