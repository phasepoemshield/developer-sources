/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class00471
 *  minecraft.class02484
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class06841
 *  minecraft.class07061
 *  minecraft.class07439
 *  minecraft.class07491
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import minecraft.class00453;
import minecraft.class00471;
import minecraft.class02484;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class06841;
import minecraft.class07061;
import minecraft.class07439;
import minecraft.class07491;

public class class08252
extends class00453 {
    public static final MapCodec<class08252> N = RecordCodecBuilder.mapCodec(instance -> class08252.N(instance).and((App)class06841.N.fieldOf("source").forGetter(class082522 -> class082522.y)).apply(instance, class08252::new));
    private final class06841<Object> y;

    private class08252(List<class05957> list, class06841<?> class068412) {
        super(list);
        this.y = class06841.N(class068412);
    }

    public Set<class07491<?>> y() {
        return Set.of(this.y.N());
    }

    public static class00471<?> N(class06841<?> class068412) {
        return class08252.N((T list) -> new class08252((List<class05957>)list, class068412));
    }

    public class05959<class08252> N() {
        return class07439.j;
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        Object object = this.y.N(class059082);
        if (object instanceof class07061) {
            class07061 class070612 = (class07061)object;
            class065842.N(class02484.B, (Object)class070612.method_5797());
        }
        return class065842;
    }
}

