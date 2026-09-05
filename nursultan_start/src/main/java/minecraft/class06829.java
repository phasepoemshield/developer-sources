/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02466
 *  minecraft.class02488
 *  minecraft.class05908
 *  minecraft.class07491
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import minecraft.class02466;
import minecraft.class02488;
import minecraft.class05908;
import minecraft.class06834;
import minecraft.class06838;
import minecraft.class06841;
import minecraft.class06843;
import minecraft.class07491;

public class class06829
implements class06834 {
    public static final MapCodec<class06829> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06841.N.fieldOf("source").forGetter(class068292 -> class068292.y), (App)class02488.N.fieldOf("slots").forGetter(class068292 -> class068292.L)).apply(instance, class06829::new));
    private final class06841<Object> y;
    private final class02466 L;

    private class06829(class06841<Object> class068412, class02466 class024662) {
        this.y = class068412;
        this.L = class024662;
    }

    public Set<class07491<?>> y() {
        return Set.of(this.y.N());
    }

    public MapCodec<class06829> N() {
        return N;
    }

    @Override
    public final class06838 N(class05908 class059082) {
        Object object = this.y.N(class059082);
        if (object instanceof class06843) {
            return ((class06843)object).N_66(this.L.N());
        }
        return class06838.N;
    }
}

