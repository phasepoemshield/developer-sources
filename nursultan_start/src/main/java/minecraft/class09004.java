/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class00471
 *  minecraft.class05338
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
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
import minecraft.class05338;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class07491;

public class class09004
extends class00453 {
    public static final MapCodec<class09004> N = RecordCodecBuilder.mapCodec(instance -> class09004.N(instance).and((App)class05338.N.fieldOf("limit").forGetter(class090042 -> class090042.y)).apply(instance, class09004::new));
    private final class05338 y;

    private class09004(List<class05957> list, class05338 class053382) {
        super(list);
        this.y = class053382;
    }

    public Set<class07491<?>> y() {
        return this.y.N();
    }

    public static class00471<?> N(class05338 class053382) {
        return class09004.N((T list) -> new class09004((List<class05957>)list, class053382));
    }

    public class05959<class09004> N() {
        return class07439.G;
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        int n = this.y.N(class059082, class065842.c());
        class065842.i(n);
        return class065842;
    }
}

