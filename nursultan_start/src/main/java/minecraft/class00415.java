/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00743
 *  minecraft.class00869
 *  minecraft.class00902
 *  minecraft.class01099
 *  minecraft.class01226
 *  minecraft.class05845
 *  minecraft.class06511
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06686
 *  minecraft.class06695
 *  minecraft.class06704
 *  minecraft.class07054
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07236
 *  minecraft.class07299
 *  minecraft.class07482
 *  minecraft.class07489
 *  minecraft.class08044
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumInventory
 *  net.caffeinemc.mods.lithium.common.block.entity.SetChangedHandlingBlockEntity
 *  net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity
 *  net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker
 *  net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.util.Arrays;
import minecraft.class00392;
import minecraft.class00404;
import minecraft.class00416;
import minecraft.class00500;
import minecraft.class00743;
import minecraft.class00869;
import minecraft.class00902;
import minecraft.class01099;
import minecraft.class01226;
import minecraft.class05845;
import minecraft.class06511;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06686;
import minecraft.class06695;
import minecraft.class06704;
import minecraft.class07054;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07236;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class07489;
import minecraft.class08044;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.SetChangedHandlingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00415
extends class07236
implements class07054,
LithiumInventory,
SetChangedHandlingBlockEntity,
SleepingBlockEntity,
InventoryChangeTracker {
    private static final int Z = 3;
    private static final int m = 4;
    private static final int[] P = new int[]{3};
    private static final int[] s = new int[]{0, 1, 2, 3};
    private static final int[] T = new int[]{0, 1, 2, 4};
    public static final int N = 20;
    public static final int y = 0;
    public static final int u = 1;
    public static final int i = 2;
    private static final short b = 0;
    private static final byte j = 0;
    private static final class00392 v = class00392.L("container.brewing");
    private class00743<class06584> n = class00743.method_10213((int)5, (Object)class06584.E);
    int R;
    private boolean[] l;
    private class06581 d;
    int M;
    protected final class05845 B = new class00416(this);
    private static final ThreadLocal w = new ThreadLocal();
    private WrappedBlockEntityTickInvokerAccessor k = null;
    private class01099 Y = null;

    protected class00743<class06584> aC_() {
        return this.n;
    }

    public class00415(class07209 class072092, class00500 class005002) {
        super(class00404.field_11894, class072092, class005002);
    }

    private boolean[] u() {
        boolean[] blArray = new boolean[3];
        for (int i = 0; i < 3; ++i) {
            if (((class06584)this.n.get(i)).R()) continue;
            blArray[i] = true;
        }
        return blArray;
    }

    private static class06584 y(class06581 class065812) {
        class06584 class065842 = (class06584)w.get();
        w.remove();
        return class065842;
    }

    public boolean y(int n, class06584 class065842, class07211 class072112) {
        if (n == 3) {
            return class065842.N(class06570.nP);
        }
        return true;
    }

    private static void y(class07299 class072992, class07209 class072092, class00500 class005002, class00415 class004152, CallbackInfo callbackInfo) {
        class004152.wakeUpNow();
    }

    private void N(CallbackInfo callbackInfo) {
        if (this.isSleeping() && this.z != null && !this.z.method_8608()) {
            this.wakeUpNow();
        }
    }

    protected class07482 N(int n, class08044 class080442) {
        return new class07489(n, class080442, (class06695)this, this.B);
    }

    public boolean N(int n, class06584 class065842, @Nullable class07211 class072112) {
        return this.method_5437(n, class065842);
    }

    private static void N(class07299 class072992, class07209 class072092, class00743 class007432, CallbackInfo callbackInfo, class06584 class065842) {
        w.set(class065842.getRecipeRemainder());
    }

    private void N(class00500 class005002) {
        if (this.R == 0 && class005002.N(class00869.MB) && this.z != null) {
            this.lithium$startSleeping();
        }
    }

    private static void N(class07299 class072992, class07209 class072092, class00500 class005002, class00415 class004152, CallbackInfo callbackInfo) {
        class004152.N(class005002);
    }

    private static void N(class07299 class072992, class07209 class072092, class00743<class06584> class007432) {
        class06584 class065842 = (class06584)class007432.get(3);
        class06511 class065112 = class072992.method_59547();
        for (int i = 0; i < 3; ++i) {
            class007432.set(i, (Object)class065112.u(class065842, (class06584)class007432.get(i)));
        }
        class065842.B(1);
        class00415.N(class072992, class072092, class007432, null, class065842);
        class06584 class065843 = class00415.y(class065842.B());
        if (!class065843.R()) {
            if (class065842.R()) {
                class065842 = class065843;
            } else {
                class06704.N((class07299)class072992, (double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), (class06584)class065843);
            }
        }
        class007432.set(3, (Object)class065842);
        class072992.N(1035, class072092, 0);
    }

    private static boolean N(class06511 class065112, class00743<class06584> class007432) {
        class06584 class065842 = (class06584)class007432.get(3);
        if (class065842.R()) {
            return false;
        }
        if (!class065112.N(class065842)) {
            return false;
        }
        for (int i = 0; i < 3; ++i) {
            class06584 class065843 = (class06584)class007432.get(i);
            if (class065843.R() || !class065112.N(class065843, class065842)) continue;
            return true;
        }
        return false;
    }

    protected void N(class00743<class06584> class007432) {
        this.n = class007432;
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class00415 class004152) {
        class00415.N(class072992, class072092, class005002, class004152, null);
        class06584 class065842 = (class06584)class004152.n.get(4);
        if (class004152.M <= 0 && class065842.N(class01226.Nd)) {
            class004152.M = 20;
            class065842.B(1);
            class00415.y(class072992, class072092, class005002, class004152, null);
            class00415.N((class07299)class072992, (class07209)class072092, (class00500)class005002);
        }
        boolean bl = class00415.N(class072992.method_59547(), class004152.n);
        boolean bl2 = class004152.R > 0;
        class06584 class065843 = (class06584)class004152.n.get(3);
        if (bl2) {
            boolean bl3;
            --class004152.R;
            boolean bl4 = bl3 = class004152.R == 0;
            if (bl3 && bl) {
                class00415.N(class072992, class072092, class004152.n);
            } else if (!bl || !class065843.N(class004152.d)) {
                class004152.R = 0;
            }
            class00415.y(class072992, class072092, class005002, class004152, null);
            class00415.N((class07299)class072992, (class07209)class072092, (class00500)class005002);
        } else if (bl && class004152.M > 0) {
            --class004152.M;
            class004152.R = 400;
            class004152.d = class065843.B();
            class00415.y(class072992, class072092, class005002, class004152, null);
            class00415.N((class07299)class072992, (class07209)class072092, (class00500)class005002);
        }
        boolean[] blArray = class004152.u();
        if (!Arrays.equals(blArray, class004152.l)) {
            class004152.l = blArray;
            class00500 class005003 = class005002;
            if (!(class005003.i() instanceof class00902)) {
                return;
            }
            for (int i = 0; i < class00902.y.length; ++i) {
                class005003 = (class00500)((Object)class005003.y((class08092)class00902.y[i], Boolean.valueOf(blArray[i])));
            }
            class072992.method_8652(class072092, class005003, 2);
        }
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.n = class00743.method_10213((int)this.method_5439(), (Object)class06584.E);
        class06686.N((class08299)class082992, this.n);
        this.R = class082992.N("BrewTime", (short)0);
        if (this.R > 0) {
            this.d = ((class06584)this.n.get(3)).B();
        }
        this.M = class082992.N("Fuel", (byte)0);
        this.N((CallbackInfo)null);
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        class083292.N("BrewTime", (short)this.R);
        class06686.N((class08329)class083292, this.n);
        class083292.N("Fuel", (byte)this.M);
    }

    public int[] N(class07211 class072112) {
        if (class072112 == class07211.field_11036) {
            return P;
        }
        if (class072112 == class07211.field_11033) {
            return s;
        }
        return T;
    }

    public boolean method_5437(int n, class06584 class065842) {
        if (n == 3) {
            return (this.z != null ? this.z.method_59547() : class06511.y).N(class065842);
        }
        if (n == 4) {
            return class065842.N(class01226.Nd);
        }
        return (class065842.N(class06570.ns) || class065842.N(class06570.lO) || class065842.N(class06570.lJ) || class065842.N(class06570.nP)) && this.method_5438(n).R();
    }

    public class01099 lithium$getSleepingTicker() {
        return this.Y;
    }

    public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor wrappedBlockEntityTickInvokerAccessor) {
        this.k = wrappedBlockEntityTickInvokerAccessor;
        this.lithium$setSleepingTicker(null);
    }

    public void lithium$setSleepingTicker(class01099 class010992) {
        this.Y = class010992;
    }

    public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
        return this.k;
    }

    protected class00392 an_() {
        return v;
    }

    public int method_5439() {
        return this.n.size();
    }

    public /* synthetic */ void setInventoryLithium(class00743 class007432) {
        this.n = class007432;
    }

    public /* synthetic */ class00743 getInventoryLithium() {
        return this.n;
    }

    public void lithium$handleSetChanged() {
        if (this.isSleeping() && this.z != null && !this.z.method_8608()) {
            this.wakeUpNow();
        }
    }
}

