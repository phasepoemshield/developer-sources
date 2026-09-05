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
 *  minecraft.class04995
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06339
 *  minecraft.class06378
 *  minecraft.class06584
 *  minecraft.class07439
 *  minecraft.class07491
 *  minecraft.class08213
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
import minecraft.class04995;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06339;
import minecraft.class06378;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class07491;
import minecraft.class08213;

public class class02635
extends class00453 {
    static final MapCodec<class02635> N = RecordCodecBuilder.mapCodec(instance -> class02635.N(instance).and((App)class06339.N.fieldOf("amplifier").forGetter(class026352 -> class026352.y)).apply(instance, class02635::new));
    private final class06378 y;

    public class06378 L() {
        return this.y;
    }

    private class02635(List<class05957> list, class06378 class063782) {
        super(list);
        this.y = class063782;
    }

    public Set<class07491<?>> y() {
        return this.y.y();
    }

    public static class00471<?> N(class06378 class063782) {
        return class02635.N((T list) -> new class02635((List<class05957>)list, class063782));
    }

    public class05959<class02635> N() {
        return class07439.p;
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        int n = class04995.N((int)this.y.N(class059082), (int)0, (int)4);
        class065842.N(class02484.NU, (Object)new class08213(n));
        return class065842;
    }
}

