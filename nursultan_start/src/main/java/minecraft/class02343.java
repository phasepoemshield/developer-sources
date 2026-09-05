/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class02484
 *  minecraft.class02489
 *  minecraft.class02699
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
import minecraft.class00453;
import minecraft.class02484;
import minecraft.class02489;
import minecraft.class02699;
import minecraft.class02826;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07439;

public class class02343
extends class00453 {
    public static final MapCodec<class02343> N = RecordCodecBuilder.mapCodec(instance -> class02343.N(instance).and(instance.group((App)class02699.u.fieldOf("pages").forGetter(class023432 -> class023432.y), (App)class02489.N((int)100).forGetter(class023432 -> class023432.L))).apply(instance, class02343::new));
    private final List<class02826<String>> y;
    private final class02489 L;

    protected class02343(List<class05957> list, List<class02826<String>> list2, class02489 class024892) {
        super(list);
        this.y = list2;
        this.L = class024892;
    }

    public class02699 N(class02699 class026992) {
        List list = this.L.N(class026992.N(), this.y, 100);
        return class026992.y(list);
    }

    protected class06584 N(class06584 class065842, class05908 class059082) {
        class065842.N(class02484.Ny, (Object)class02699.N, this::N);
        return class065842;
    }

    public class05959<class02343> N() {
        return class07439.X;
    }
}

