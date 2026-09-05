/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00453
 *  minecraft.class01929
 *  minecraft.class02625
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04995
 *  minecraft.class05908
 *  minecraft.class05946
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06069
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07304
 *  minecraft.class07310
 *  minecraft.class07439
 *  minecraft.class07536
 *  net.fabricmc.fabric.api.item.v1.EnchantingContext
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import minecraft.class00453;
import minecraft.class01929;
import minecraft.class02625;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04995;
import minecraft.class05908;
import minecraft.class05946;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06069;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07304;
import minecraft.class07310;
import minecraft.class07439;
import minecraft.class07536;
import minecraft.class08848;
import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import org.slf4j.Logger;

public class class08853
extends class00453 {
    private static final Logger y = LogUtils.getLogger();
    public static final MapCodec<class08853> N = RecordCodecBuilder.mapCodec(instance -> class08853.N(instance).and(instance.group((App)class03541.N((class05946)class04227.yR).optionalFieldOf("options").forGetter(class088532 -> class088532.L), (App)Codec.BOOL.optionalFieldOf("only_compatible", (Object)true).forGetter(class088532 -> class088532.u))).apply(instance, class08853::new));
    private final Optional<class03543<class07304>> L;
    private final boolean u;

    public static class08848 L() {
        return new class08848();
    }

    class08853(List<class05957> list, Optional<class03543<class07304>> optional, boolean bl) {
        super(list);
        this.L = optional;
        this.u = bl;
    }

    private static boolean N(class07304 class073042, class06584 class065842, boolean bl, class06584 class065843, class03556 class035562) {
        return class065842.canBeEnchantedWith(class035562, EnchantingContext.ACCEPTABLE);
    }

    public class05959<class08853> N() {
        return class07439.B;
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        class06069 class060692 = class059082.y();
        boolean bl = !class065842.N(class06570.jY) && this.u;
        Optional optional = class07536.y_9((List)this.L.map(class03543::N).orElseGet(() -> class059082.u().method_30349().L(class04227.yR).z().map(Function.identity())).filter(class035562 -> !bl || class08853.N((class07304)class035562.N(), class065842, bl, class065842, class035562)).toList(), (class06069)class060692);
        if (optional.isEmpty()) {
            y.warn("Couldn't find a compatible enchantment for {}", (Object)class065842);
            return class065842;
        }
        return class08853.N(class065842, (class03556<class07304>)((class03556)optional.get()), class060692);
    }

    private static class06584 N(class06584 class065842, class03556<class07304> class035562, class06069 class060692) {
        int n = class04995.N((class06069)class060692, (int)((class07304)class035562.N()).u(), (int)((class07304)class035562.N()).i());
        if (class065842.N(class06570.jY)) {
            class065842 = new class06584((class07310)class06570.Gq);
        }
        class065842.N(class035562, n);
        return class065842;
    }

    public static class08848 N(class01929 class019292) {
        return class08853.L().N((class03543<class07304>)class019292.y(class04227.yR).y(class02625.m));
    }
}

