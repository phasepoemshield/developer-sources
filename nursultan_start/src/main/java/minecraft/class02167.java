/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class07439
 *  minecraft.class08562
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import minecraft.class00453;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class08562;

public class class02167
extends class00453 {
    public static final MapCodec<class02167> N = RecordCodecBuilder.mapCodec(instance -> class02167.N(instance).and((App)Codec.unboundedMap((Codec)class02477.N, (Codec)Codec.BOOL).fieldOf("toggles").forGetter(class021672 -> class021672.y)).apply(instance, class02167::new));
    private final Map<class02477<?>, Boolean> y;

    private class02167(List<class05957> list, Map<class02477<?>, Boolean> map) {
        super(list);
        this.y = map;
    }

    public class05959<class02167> N() {
        return class07439.a;
    }

    protected class06584 N(class06584 class065842, class05908 class059082) {
        class065842.N(class02484.v, (Object)class08562.L, class085622 -> {
            Iterator<Map.Entry<class02477<?>, Boolean>> iterator = this.y.entrySet().iterator();
            while (iterator.hasNext()) {
                boolean bl;
                Map.Entry<class02477<?>, Boolean> entry;
                class085622 = class085622.N(entry.getKey(), !(bl = (entry = iterator.next()).getValue().booleanValue()));
            }
            return class085622;
        });
        return class065842;
    }
}

