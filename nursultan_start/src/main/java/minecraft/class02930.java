/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10419
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class04489
 *  minecraft.class05561
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class07439
 *  minecraft.class08122
 */
package minecraft;

import Nursultan.class10419;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00453;
import minecraft.class02928;
import minecraft.class02936;
import minecraft.class04489;
import minecraft.class05561;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class08122;

public class class02930
extends class00453 {
    public static final MapCodec<class02930> N = RecordCodecBuilder.mapCodec(instance -> class02930.N(instance).and(instance.group((App)class02936.i.fieldOf("component").forGetter(class029302 -> class029302.y), (App)class07439.L.fieldOf("modifier").forGetter(class029302 -> class029302.L))).apply(instance, class02930::new));
    private final class02928<?> y;
    private final class08122 L;

    private class02930(List<class05957> list, class02928<?> class029282, class08122 class081222) {
        super(list);
        this.y = class029282;
        this.L = class081222;
    }

    public class06584 N(class06584 class065843, class05908 class059082) {
        if (class065843.R()) {
            return class065843;
        }
        this.y.N(class065843, class065842 -> (class06584)this.L.apply(class065842, (Object)class059082));
        return class065843;
    }

    public class05959<class02930> N() {
        return class07439.n;
    }

    public void N(class05561 class055612) {
        super.N(class055612);
        this.L.N(class055612.N((class04489)new class10419("modifier")));
    }
}

