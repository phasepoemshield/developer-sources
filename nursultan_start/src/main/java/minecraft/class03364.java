/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10412
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class00471
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04480
 *  minecraft.class04489
 *  minecraft.class05537
 *  minecraft.class05561
 *  minecraft.class05566
 *  minecraft.class05576
 *  minecraft.class05908
 *  minecraft.class05925
 *  minecraft.class05946
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class07439
 *  minecraft.class08122
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10412;
import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00453;
import minecraft.class00471;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04480;
import minecraft.class04489;
import minecraft.class05537;
import minecraft.class05561;
import minecraft.class05566;
import minecraft.class05576;
import minecraft.class05908;
import minecraft.class05925;
import minecraft.class05946;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class07439;
import minecraft.class08122;
import org.slf4j.Logger;

public class class03364
extends class00453 {
    private static final Logger y = LogUtils.getLogger();
    public static final MapCodec<class03364> N = RecordCodecBuilder.mapCodec(instance -> class03364.N(instance).and((App)class05946.N((class05946)class04227.yo).fieldOf("name").forGetter(class033642 -> class033642.L)).apply(instance, class03364::new));
    private final class05946<class08122> L;

    private class03364(List<class05957> list, class05946<class08122> class059462) {
        super(list);
        this.L = class059462;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected class06584 N(class06584 class065842, class05908 class059082) {
        class08122 class081222 = class059082.N().u(this.L).map(class03556::N).orElse(null);
        if (class081222 == null) {
            y.warn("Unknown function: {}", (Object)this.L.N());
            return class065842;
        }
        class05925 class059252 = class05908.N((class08122)class081222);
        if (class059082.y(class059252)) {
            try {
                class06584 class065843 = (class06584)class081222.apply((Object)class065842, (Object)class059082);
                return class065843;
            }
            finally {
                class059082.L(class059252);
            }
        }
        y.warn("Detected infinite loop in loot tables");
        return class065842;
    }

    public static class00471<?> N(class05946<class08122> class059462) {
        return class03364.N((T list) -> new class03364((List<class05957>)list, class059462));
    }

    public class05959<class03364> N() {
        return class07439.o;
    }

    public void N(class05561 class055612) {
        if (!class055612.y()) {
            class055612.N((class04480)new class05566(this.L));
            return;
        }
        if (class055612.N(this.L)) {
            class055612.N((class04480)new class05537(this.L));
            return;
        }
        super.N(class055612);
        class055612.N().u(this.L).ifPresentOrElse(class035292 -> ((class08122)class035292.N()).N(class055612.N((class04489)new class10412(this.L), this.L)), () -> class055612.N((class04480)new class05576(this.L)));
    }
}

