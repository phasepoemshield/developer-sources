/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class01164
 *  minecraft.class01187
 *  minecraft.class01190
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class03508
 *  minecraft.class03556
 *  minecraft.class03978
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06331
 *  minecraft.class06889
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  net.caffeinemc.mods.lithium.common.block.entity.sleeping_sculk.GameEventListenerWithCallback
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import java.util.Optional;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class01164;
import minecraft.class01187;
import minecraft.class01190;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class03481;
import minecraft.class03502;
import minecraft.class03508;
import minecraft.class03556;
import minecraft.class03978;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06331;
import minecraft.class06889;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import net.caffeinemc.mods.lithium.common.block.entity.sleeping_sculk.GameEventListenerWithCallback;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03485
implements class01187,
GameEventListenerWithCallback {
    private final class03502 N;
    private Runnable y;

    public class03485(class03502 class035022) {
        this.N = class035022;
    }

    public void y(class04782 class047822, class03556<class01194> class035562, class01164 class011642, class06889 class068892) {
        this.N.u().y().N((class07299)class047822).ifPresent(class068893 -> this.N(class047822, this.N.L(), class035562, class011642, class068892, (class06889)class068893));
    }

    public int y() {
        return this.N.u().N();
    }

    private static boolean N(class07299 class072992, class06889 class068892, class06889 class068893) {
        class06889 class068894 = new class06889((double)class04995.N((double)class068892.M) + 0.5, (double)class04995.N((double)class068892.B) + 0.5, (double)class04995.N((double)class068892.Z) + 0.5);
        class06889 class068895 = new class06889((double)class04995.N((double)class068893.M) + 0.5, (double)class04995.N((double)class068893.B) + 0.5, (double)class04995.N((double)class068893.Z) + 0.5);
        for (class07211 class072112 : class07211.values()) {
            class06889 class068896 = class068894.N(class072112, (double)1.0E-5f);
            if (class072992.N(new class06331(class068896, class068895, class005002 -> class005002.N(class01210.yg))).N() == class07113.field_1332) continue;
            return false;
        }
        return true;
    }

    private void N(class04782 class047822, class03556 class035562, class01164 class011642, class06889 class068892, CallbackInfoReturnable callbackInfoReturnable) {
        if (this.y != null) {
            this.y.run();
        }
    }

    public class01190 N() {
        return this.N.u().y();
    }

    public boolean N(class04782 class047822, class03556<class01194> class035562, class01164 class011642, class06889 class068892) {
        class03508 class035082 = this.N.L();
        class03481 class034812 = this.N.u();
        if (class035082.y() != null) {
            return false;
        }
        if (!class034812.N(class035562, class011642)) {
            return false;
        }
        Optional var7 = class034812.y().N((class07299)class047822);
        if (var7.isEmpty()) {
            return false;
        }
        class06889 class068893 = (class06889)var7.get();
        if (!class034812.N(class047822, class07209.method_49638((class00737)class068892), class035562, class011642)) {
            return false;
        }
        if (class03485.N((class07299)class047822, class068892, class068893)) {
            return false;
        }
        this.N(class047822, (class03556)class035562, class011642, class068892, (CallbackInfoReturnable)null);
        this.N(class047822, class035082, class035562, class011642, class068892, class068893);
        return true;
    }

    private void N(class04782 class047822, class03508 class035082, class03556<class01194> class035562, class01164 class011642, class06889 class068892, class06889 class068893) {
        class035082.u.N(new class03978(class035562, (float)class068892.R(class068893), class068892, class011642.N()), class047822.N());
    }

    public static float N(class07209 class072092, class07209 class072093) {
        return (float)Math.sqrt(class072092.method_10262((class00753)class072093));
    }

    public void lithium$setGameEventCallback(Runnable runnable) {
        this.y = runnable;
    }
}

