/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01362
 *  minecraft.class02142
 *  minecraft.class02151
 *  minecraft.class03481
 *  minecraft.class03493
 *  minecraft.class03508
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class07049
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07796
 *  minecraft.class08092
 *  minecraft.class08713
 *  net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01362;
import minecraft.class02142;
import minecraft.class02151;
import minecraft.class03481;
import minecraft.class03493;
import minecraft.class03508;
import minecraft.class04093;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class07049;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07796;
import minecraft.class08092;
import minecraft.class08713;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04007
extends class07796
implements class06084 {
    public static final MapCodec<class04007> N = class04007.y(class04007::new);
    public static final class06667 y = class06665.Q;
    public static final class06667 L = class06665.q;
    public static final class06667 u = class06665.i;
    private static final class00494 R = class00891.y((double)16.0, (double)0.0, (double)8.0);
    public static final double i = R.method_1105(class07185.field_11052);

    public class04007(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(false))).y((class08092)L, (Comparable)Boolean.valueOf(false))).y((class08092)u, (Comparable)Boolean.valueOf(false)));
    }

    protected class00494 z(class00500 class005002) {
        return R;
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return R;
    }

    private static void N(class07299 class072992, class07209 class072092, class00500 class005002, class04093 class040932, CallbackInfo callbackInfo) {
        class03508 class035082 = class040932.L();
        if (class035082.y() == null && class035082.N().N(Long.MAX_VALUE).isEmpty()) {
            ((SleepingBlockEntity)class040932).lithium$startSleeping();
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06584 class065842, boolean bl) {
        super.N(class005002, class047822, class072092, class065842, bl);
        if (bl) {
            this.N(class047822, class072092, class065842, (class02142)class02151.N((int)5));
        }
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072993, class00500 class005003, class00404<T> class004042) {
        if (!class072993.method_8608()) {
            return class07796.N(class004042, (class00404)class00404.field_37648, (class072992, class072092, class005002, class040932) -> {
                class03493.N((class07299)class072992, (class03508)class040932.L(), (class03481)class040932.u());
                class04007.N(class072992, class072092, class005002, class040932, null);
            });
        }
        return null;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            class047822.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(false)), 3);
            class047822.N(class072092, class00404.field_37648).ifPresent(class040932 -> class040932.N(class047822));
        }
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, class07049 class070492) {
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class04770 class047702 = class04093.N(class070492);
            if (class047702 != null) {
                class047822.N(class072092, class00404.field_37648).ifPresent(class040932 -> class040932.N(class047822, class047702));
            }
        }
        super.N(class072992, class072092, class005002, class070492);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
        class005172.N(new class08092[]{L});
        class005172.N(new class08092[]{u});
    }

    public MapCodec<class04007> N() {
        return N;
    }

    public @Nullable class00500 N(class06942 class069422) {
        return (class00500)this.W().y((class08092)L, (Comparable)Boolean.valueOf(class069422.method_8045().method_8316(class069422.method_8037()).N() == class04684.L));
    }

    public @Nullable class00394 N(class07209 class072092, class00500 class005002) {
        return new class04093(class072092, class005002);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected boolean a_(class00500 class005002) {
        return true;
    }
}

