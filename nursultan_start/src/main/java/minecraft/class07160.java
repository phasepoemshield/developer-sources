/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class00471
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02837
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class07001
 *  minecraft.class07439
 *  minecraft.class07755
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00453;
import minecraft.class00471;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02837;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07001;
import minecraft.class07439;
import minecraft.class07755;

public class class07160
extends class00453 {
    public static final MapCodec<class07160> N = RecordCodecBuilder.mapCodec(instance -> class07160.N(instance).and((App)class07755.R.fieldOf("tag").forGetter(class071602 -> class071602.y)).apply(instance, class07160::new));
    private final class07001 y;

    private class07160(List<class05957> list, class07001 class070012) {
        super(list);
        this.y = class070012;
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        class02837.N((class02477)class02484.y, (class06584)class065842, class070012 -> class070012.N(this.y));
        return class065842;
    }

    public class05959<class07160> N() {
        return class07439.z;
    }

    @Deprecated
    public static class00471<?> N(class07001 class070012) {
        return class07160.N((T list) -> new class07160((List<class05957>)list, class070012));
    }
}

