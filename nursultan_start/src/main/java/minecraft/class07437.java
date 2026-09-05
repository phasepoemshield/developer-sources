/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10416
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class02928
 *  minecraft.class02936
 *  minecraft.class03942
 *  minecraft.class04129
 *  minecraft.class04489
 *  minecraft.class04782
 *  minecraft.class05074
 *  minecraft.class05561
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 */
package minecraft;

import Nursultan.class10416;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class00453;
import minecraft.class02928;
import minecraft.class02936;
import minecraft.class03942;
import minecraft.class04129;
import minecraft.class04489;
import minecraft.class04782;
import minecraft.class05074;
import minecraft.class05561;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class07447;

public class class07437
extends class00453 {
    public static final MapCodec<class07437> N = RecordCodecBuilder.mapCodec(instance -> class07437.N(instance).and(instance.group((App)class02936.i.fieldOf("component").forGetter(class074372 -> class074372.y), (App)class03942.N.listOf().fieldOf("entries").forGetter(class074372 -> class074372.L))).apply(instance, class07437::new));
    private final class02928<?> y;
    private final List<class04129> L;

    class07437(List<class05957> list, class02928<?> class029282, List<class04129> list2) {
        super(list);
        this.y = class029282;
        this.L = List.copyOf(list2);
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        if (class065842.R()) {
            return class065842;
        }
        Stream.Builder builder = Stream.builder();
        this.L.forEach(class041292 -> class041292.expand(class059082, class035992 -> class035992.N(class05074.N((class04782)class059082.u(), builder::add), class059082)));
        this.y.N(class065842, builder.build());
        return class065842;
    }

    public void N(class05561 class055612) {
        super.N(class055612);
        for (int i = 0; i < this.L.size(); ++i) {
            this.L.get(i).N(class055612.N((class04489)new class10416("entries", i)));
        }
    }

    public static class07447 N(class02928<?> class029282) {
        return new class07447(class029282);
    }

    public class05959<class07437> N() {
        return class07439.v;
    }
}

