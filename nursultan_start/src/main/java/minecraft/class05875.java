/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00743
 *  minecraft.class01099
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02676
 *  minecraft.class02854
 *  minecraft.class02904
 *  minecraft.class02950
 *  minecraft.class03556
 *  minecraft.class03729
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05266
 *  minecraft.class06069
 *  minecraft.class06485
 *  minecraft.class06584
 *  minecraft.class06686
 *  minecraft.class06704
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07269
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08303
 *  minecraft.class08329
 *  net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity
 *  net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.Optional;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00743;
import minecraft.class01099;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02676;
import minecraft.class02854;
import minecraft.class02904;
import minecraft.class02950;
import minecraft.class03556;
import minecraft.class03729;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05266;
import minecraft.class05838;
import minecraft.class05847;
import minecraft.class05869;
import minecraft.class06069;
import minecraft.class06485;
import minecraft.class06584;
import minecraft.class06686;
import minecraft.class06704;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07269;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08303;
import minecraft.class08329;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class05875
extends class00394
implements class05266,
SleepingBlockEntity {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = 2;
    private static final int L = 4;
    private final class00743<class06584> u = class00743.method_10213((int)4, (Object)class06584.E);
    private final int[] i = new int[4];
    private final int[] R = new int[4];
    private WrappedBlockEntityTickInvokerAccessor M = null;
    private class01099 B = null;

    public class07269 i() {
        return class07269.N((class00394)this);
    }

    public class05875(class07209 class072092, class00500 class005002) {
        super(class00404.field_17380, class072092, class005002);
    }

    private void u() {
        this.method_5431();
        this.G().method_8413(this.d(), this.w(), this.w(), 3);
    }

    public void y(class08329 class083292) {
        class083292.L("Items");
    }

    public static void y(class07299 class072992, class07209 class072092, class00500 class005002, class05875 class058752) {
        int n;
        class06069 class060692 = class072992.field_9229;
        if (class060692.z() < 0.11f) {
            for (n = 0; n < class060692.y(2) + 2; ++n) {
                class05847.N(class072992, class072092, (Boolean)class005002.L((class08092)class05847.L), false);
            }
        }
        n = ((class07211)class005002.L(class05847.i)).u();
        for (int i = 0; i < class058752.u.size(); ++i) {
            if (((class06584)class058752.u.get(i)).R() || !(class060692.z() < 0.2f)) continue;
            class07211 class072112 = class07211.y((int)Math.floorMod(i + n, 4));
            float f = 0.3125f;
            double d = (double)class072092.method_10263() + 0.5 - (double)((float)class072112.P() * 0.3125f) + (double)((float)class072112.R().P() * 0.3125f);
            double d2 = (double)class072092.method_10264() + 0.5;
            double d3 = (double)class072092.method_10260() + 0.5 - (double)((float)class072112.T() * 0.3125f) + (double)((float)class072112.R().T() * 0.3125f);
            for (int j = 0; j < 4; ++j) {
                class072992.method_8406((class07126)class07107.NZ, d, d2, d3, 0.0, 5.0E-4, 0.0);
            }
        }
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class05875 class058752) {
        boolean bl = false;
        for (int i = 0; i < class058752.u.size(); ++i) {
            if (class058752.i[i] <= 0) continue;
            bl = true;
            class058752.i[i] = class04995.N((int)(class058752.i[i] - 2), (int)0, (int)class058752.R[i]);
        }
        if (bl) {
            class05875.N((class07299)class072992, (class07209)class072092, (class00500)class005002);
        }
        class05875.N(class072992, class072092, class005002, class058752, null, bl);
    }

    public static void N(class04782 class047822, class07209 class072092, class00500 class005002, class05875 class058752, class06485<class02904, class05869> class064852) {
        boolean bl = false;
        for (int i = 0; i < class058752.u.size(); ++i) {
            class02904 class029042;
            class06584 class065842;
            class06584 class065843 = (class06584)class058752.u.get(i);
            if (class065843.R()) continue;
            bl = true;
            int n = i;
            class058752.i[n] = class058752.i[n] + 1;
            if (class058752.i[i] < class058752.R[i] || !(class065842 = class064852.N((class02950)(class029042 = new class02904(class065843)), class047822).map(class037292 -> ((class05869)class037292.y()).method_8116(class029042, (class01929)class047822.method_30349())).orElse(class065843)).N(class047822.method_45162())) continue;
            class06704.N((class07299)class047822, (double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), (class06584)class065842);
            class058752.u.set(i, (Object)class06584.E);
            class047822.method_8413(class072092, class005002, class005002, 3);
            class047822.N((class03556)class01194.L, class072092, class01164.N((class00500)class005002));
        }
        if (bl) {
            class05875.N((class07299)class047822, (class07209)class072092, (class00500)class005002);
        }
        class05875.N(null, class058752, bl);
    }

    public class07001 N(class01929 class019292) {
        try (class04495 class044952 = new class04495(this.J(), N);){
            class08303 class083032 = class08303.N((class04490)class044952, (class01929)class019292);
            class06686.N((class08329)class083032, this.u, (boolean)true);
            class07001 class070012 = class083032.y();
            return class070012;
        }
    }

    private static void N(class07299 class072992, class07209 class072092, class00500 class005002, class05875 class058752, CallbackInfo callbackInfo, boolean bl) {
        if (!bl) {
            class058752.lithium$startSleeping();
        }
    }

    private static void N(CallbackInfo callbackInfo, class05875 class058752, boolean bl) {
        if (!bl) {
            class058752.lithium$startSleeping();
        }
    }

    private void N(class08299 class082992, CallbackInfo callbackInfo) {
        this.wakeUpNow();
    }

    private void N(class04782 class047822, class07438 class074382, class06584 class065842, CallbackInfoReturnable callbackInfoReturnable) {
        this.wakeUpNow();
    }

    protected void N(class02676 class026762) {
        super.N(class026762);
        class026762.N(class02484.NG, (Object)class02854.N(this.N()));
    }

    protected void N_9(class02666 class026662) {
        super.N_9(class026662);
        ((class02854)class026662.a_(class02484.NG, (Object)class02854.N)).N(this.N());
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        class06686.N((class08329)class083292, this.u, (boolean)true);
        class083292.N("CookingTimes", this.i);
        class083292.N("CookingTotalTimes", this.R);
    }

    public void N(class07209 class072092, class00500 class005002) {
        if (this.z != null) {
            class06704.N((class07299)this.z, (class07209)class072092, this.N());
        }
    }

    public boolean N(class04782 class047822, @Nullable class07438 class074382, class06584 class065842) {
        for (int i = 0; i < this.u.size(); ++i) {
            if (!((class06584)this.u.get(i)).R()) continue;
            Optional var6 = class047822.method_64577().N(class05838.i, (class02950)new class02904(class065842), (class07299)class047822);
            if (var6.isEmpty()) {
                return false;
            }
            this.R[i] = ((class05869)((class03729)var6.get()).y()).M();
            this.i[i] = 0;
            class06584 class065843 = class065842.y(1, class074382);
            this.N(class047822, class074382, class065842, null);
            this.u.set(i, (Object)class065843);
            class047822.N((class03556)class01194.L, this.d(), class01164.N((class07049)class074382, (class00500)this.w()));
            this.u();
            return true;
        }
        return false;
    }

    public class00743<class06584> N() {
        return this.u;
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.u.clear();
        class06686.N((class08299)class082992, this.u);
        class082992.B("CookingTimes").ifPresentOrElse(nArray -> System.arraycopy(nArray, 0, this.i, 0, Math.min(this.R.length, ((int[])nArray).length)), () -> Arrays.fill(this.i, 0));
        class082992.B("CookingTotalTimes").ifPresentOrElse(nArray -> System.arraycopy(nArray, 0, this.R, 0, Math.min(this.R.length, ((int[])nArray).length)), () -> Arrays.fill(this.R, 0));
        this.N(class082992, null);
    }

    public void method_5448() {
        this.u.clear();
    }

    public class01099 lithium$getSleepingTicker() {
        return this.B;
    }

    public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor wrappedBlockEntityTickInvokerAccessor) {
        this.M = wrappedBlockEntityTickInvokerAccessor;
        this.lithium$setSleepingTicker(null);
    }

    public void lithium$setSleepingTicker(class01099 class010992) {
        this.B = class010992;
    }

    public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
        return this.M;
    }
}

