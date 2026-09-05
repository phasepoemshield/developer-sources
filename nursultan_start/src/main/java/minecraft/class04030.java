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
 *  minecraft.class03556
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06517
 *  minecraft.class06525
 *  minecraft.class06584
 *  minecraft.class07439
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00453;
import minecraft.class00471;
import minecraft.class02484;
import minecraft.class03556;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06517;
import minecraft.class06525;
import minecraft.class06584;
import minecraft.class07439;

public class class04030
extends class00453 {
    public static final MapCodec<class04030> N = RecordCodecBuilder.mapCodec(instance -> class04030.N(instance).and((App)class06525.N.fieldOf("id").forGetter(class040302 -> class040302.y)).apply(instance, class04030::new));
    private final class03556<class06525> y;

    private class04030(List<class05957> list, class03556<class06525> class035562) {
        super(list);
        this.y = class035562;
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        class065842.N(class02484.h, (Object)class06517.N, this.y, class06517::y);
        return class065842;
    }

    public class05959<class04030> N() {
        return class07439.I;
    }

    public static class00471<?> N(class03556<class06525> class035562) {
        return class04030.N((T list) -> new class04030((List<class05957>)list, class035562));
    }
}

