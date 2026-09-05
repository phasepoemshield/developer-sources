/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01362
 *  minecraft.class03481
 *  minecraft.class03493
 *  minecraft.class06361
 *  minecraft.class06665
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08064
 *  minecraft.class08092
 *  net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01362;
import minecraft.class03481;
import minecraft.class03493;
import minecraft.class03508;
import minecraft.class03592;
import minecraft.class06361;
import minecraft.class06665;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08064;
import minecraft.class08092;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03584
extends class06361 {
    public static final MapCodec<class03584> M = class03584.y(class03584::new);
    public static final class08064<class07211> B = class06665.f;

    public int L() {
        return 10;
    }

    public class03584(class01362 class013622) {
        super(class013622);
        this.P((class00500)this.W().y(B, (Comparable)class07211.field_11043));
    }

    public class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(B)));
    }

    public class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(B, (Comparable)class069932.N((class07211)class005002.L(B)));
    }

    private static void N(class07299 class072992, class07209 class072092, class00500 class005002, class03592 class035922, CallbackInfo callbackInfo) {
        class03508 class035082 = class035922.L();
        if (class035082.y() == null && class035082.N().N(Long.MAX_VALUE).isEmpty()) {
            ((SleepingBlockEntity)class035922).lithium$startSleeping();
        }
    }

    public MapCodec<class03584> N() {
        return M;
    }

    public @Nullable class00394 N(class07209 class072092, class00500 class005002) {
        return new class03592(class072092, class005002);
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072993, class00500 class005003, class00404<T> class004042) {
        if (!class072993.method_8608()) {
            return class03584.N(class004042, (class00404)class00404.field_43258, (class072992, class072092, class005002, class035922) -> {
                class03493.N((class07299)class072992, (class03508)class035922.L(), (class03481)class035922.u());
                class03584.N(class072992, class072092, class005002, class035922, null);
            });
        }
        return null;
    }

    public @Nullable class00500 N(class06942 class069422) {
        return (class00500)super.N(class069422).y(B, (Comparable)class069422.method_8042());
    }

    public int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (class072112 != class005002.L(B)) {
            return super.N_8(class005002, class072902, class072092, class072112);
        }
        return 0;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        super.N(class005172);
        class005172.N(new class08092[]{B});
    }
}

