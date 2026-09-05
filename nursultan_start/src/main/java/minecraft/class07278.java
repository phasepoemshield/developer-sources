/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00743
 *  minecraft.class00891
 *  minecraft.class01099
 *  minecraft.class01194
 *  minecraft.class03556
 *  minecraft.class04641
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06563
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06686
 *  minecraft.class06695
 *  minecraft.class06889
 *  minecraft.class06922
 *  minecraft.class07027
 *  minecraft.class07049
 *  minecraft.class07054
 *  minecraft.class07144
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07451
 *  minecraft.class07482
 *  minecraft.class08044
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08978
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumInventory
 *  net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity
 *  net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker
 *  net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import java.util.List;
import java.util.stream.IntStream;
import minecraft.class00392;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00743;
import minecraft.class00891;
import minecraft.class01099;
import minecraft.class01194;
import minecraft.class03556;
import minecraft.class04641;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06563;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06686;
import minecraft.class06695;
import minecraft.class06889;
import minecraft.class06922;
import minecraft.class07027;
import minecraft.class07049;
import minecraft.class07054;
import minecraft.class07144;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07266;
import minecraft.class07277;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07451;
import minecraft.class07482;
import minecraft.class08044;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08978;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07278
extends class07277
implements class07054,
LithiumInventory,
SleepingBlockEntity,
InventoryChangeTracker {
    public static final int N = 9;
    public static final int y = 3;
    public static final int u = 27;
    public static final int M = 1;
    public static final int B = 10;
    public static final float Z = 0.5f;
    public static final float m = 270.0f;
    private static final int[] P = IntStream.range(0, 27).toArray();
    private static final class00392 s = class00392.L((String)"container.shulkerBox");
    private class00743<class06584> T = class00743.method_10213((int)27, (Object)class06584.E);
    private int b;
    private class07266 j = class07266.field_12065;
    private float v;
    private float n;
    private final @Nullable class06563 l;
    private WrappedBlockEntityTickInvokerAccessor d = null;
    private class01099 w = null;

    @Override
    protected class00743<class06584> aC_() {
        return this.T;
    }

    private void L(class07299 class072992, class07209 class072092, class00500 class005002) {
        if (!(class005002.i() instanceof class07027)) {
            return;
        }
        class07211 class072112 = (class07211)class005002.L((class08092)class07027.L);
        class00734 class007342 = class07144.N((float)1.0f, (class07211)class072112, (float)this.n, (float)this.v, (class06889)class072092.method_61082());
        List var6 = class072992.N_70(null, class007342);
        if (var6.isEmpty()) {
            return;
        }
        for (class07049 class070492 : var6) {
            if (class070492.method_5657() == class04641.field_15975) continue;
            class070492.method_5784(class07451.field_6306, new class06889((class007342.y() + 0.01) * (double)class072112.P(), (class007342.L() + 0.01) * (double)class072112.s(), (class007342.u() + 0.01) * (double)class072112.T()));
        }
    }

    public class07278(@Nullable class06563 class065632, class07209 class072092, class00500 class005002) {
        super(class00404.field_11896, class072092, class005002);
        this.l = class065632;
    }

    public class07278(class07209 class072092, class00500 class005002) {
        super(class00404.field_11896, class072092, class005002);
        class00891 class008912 = class005002.i();
        this.l = class008912 instanceof class07027 ? ((class07027)class008912).y() : null;
    }

    public boolean U() {
        return this.j == class07266.field_12065;
    }

    public @Nullable class06563 z() {
        return this.l;
    }

    public void u(class08299 class082992) {
        this.T = class00743.method_10213((int)this.method_5439(), (Object)class06584.E);
        if (!this.c_(class082992)) {
            class06686.N((class08299)class082992, this.T);
        }
    }

    private static void u(class07299 class072992, class07209 class072092, class00500 class005002) {
        class005002.N((class07284)class072992, class072092, 3);
        class072992.method_8408(class072092, class005002.i());
    }

    public class07266 u() {
        return this.j;
    }

    private void y(class07299 class072992, class07209 class072092, class00500 class005002) {
        this.n = this.v;
        switch (this.j.ordinal()) {
            case 0: {
                this.v = 0.0f;
                break;
            }
            case 1: {
                this.v += 0.1f;
                if (this.n == 0.0f) {
                    class07278.u(class072992, class072092, class005002);
                }
                if (this.v >= 1.0f) {
                    this.j = class07266.field_12063;
                    this.v = 1.0f;
                    class07278.u(class072992, class072092, class005002);
                }
                this.L(class072992, class072092, class005002);
                break;
            }
            case 3: {
                this.v -= 0.1f;
                if (this.n == 1.0f) {
                    class07278.u(class072992, class072092, class005002);
                }
                if (!(this.v <= 0.0f)) break;
                this.j = class07266.field_12065;
                this.v = 0.0f;
                class07278.u(class072992, class072092, class005002);
                break;
            }
            case 2: {
                this.v = 1.0f;
            }
        }
        this.N(class072992, class072092, class005002, null);
    }

    public boolean y(int n, class06584 class065842, class07211 class072112) {
        return true;
    }

    private void N(class07299 class072992, class07209 class072092, class00500 class005002, CallbackInfo callbackInfo) {
        if (this.j == class07266.field_12065 && this.n == 0.0f && this.v == 0.0f) {
            this.lithium$startSleeping();
        }
    }

    public int[] N(class07211 class072112) {
        return P;
    }

    public boolean N(int n, class06584 class065842, @Nullable class07211 class072112) {
        return !(class00891.N((class06581)class065842.B()) instanceof class07027);
    }

    private void N(int n, int n2, CallbackInfoReturnable callbackInfoReturnable) {
        if (this.w != null) {
            this.wakeUpNow();
        }
    }

    @Override
    protected class07482 N(int n, class08044 class080442) {
        return new class06922(n, class080442, (class06695)this);
    }

    public float N(float f) {
        return class04995.B((float)f, (float)this.n, (float)this.v);
    }

    public void N(class00743 class007432, CallbackInfo callbackInfo) {
        this.lithium$emitStackListReplaced();
    }

    public void N(class07209 class072092, class00500 class005002) {
    }

    public boolean N(int n, int n2) {
        this.N(n, n2, null);
        if (n == 1) {
            this.b = n2;
            if (n2 == 0) {
                this.j = class07266.field_12064;
            }
            if (n2 == 1) {
                this.j = class07266.field_12066;
            }
            return true;
        }
        return super.N(n, n2);
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class07278 class072782) {
        class072782.y(class072992, class072092, class005002);
    }

    public class00734 N(class00500 class005002) {
        class06889 class068892 = new class06889(0.5, 0.0, 0.5);
        return class07144.N((float)1.0f, (class07211)((class07211)class005002.L((class08092)class07027.L)), (float)(0.5f * this.N(1.0f)), (class06889)class068892);
    }

    @Override
    protected void N(class08299 class082992) {
        super.N(class082992);
        this.u(class082992);
    }

    @Override
    protected void N(class08329 class083292) {
        super.N(class083292);
        if (!this.a_(class083292)) {
            class06686.N((class08329)class083292, this.T, (boolean)false);
        }
    }

    @Override
    protected void N(class00743<class06584> class007432) {
        this.T = class007432;
        this.N(class007432, null);
    }

    public void method_5432(class08978 class089782) {
        if (!this.E && !class089782.aB_().method_7325()) {
            --this.b;
            this.z.method_8427(this.U, this.w().i(), 1, this.b);
            if (this.b <= 0) {
                this.z.N((class07049)class089782.aB_(), (class03556)class01194.z, this.U);
                this.z.method_8396(null, this.U, class04909.wf, class04911.field_15245, 0.5f, this.z.field_9229.z() * 0.1f + 0.9f);
            }
        }
    }

    public void method_5435(class08978 class089782) {
        if (!this.E && !class089782.aB_().method_7325()) {
            if (this.b < 0) {
                this.b = 0;
            }
            ++this.b;
            this.z.method_8427(this.U, this.w().i(), 1, this.b);
            if (this.b == 1) {
                this.z.N((class07049)class089782.aB_(), (class03556)class01194.U, this.U);
                this.z.method_8396(null, this.U, class04909.wC, class04911.field_15245, 0.5f, this.z.field_9229.z() * 0.1f + 0.9f);
            }
        }
    }

    public class01099 lithium$getSleepingTicker() {
        return this.w;
    }

    public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor wrappedBlockEntityTickInvokerAccessor) {
        this.d = wrappedBlockEntityTickInvokerAccessor;
    }

    public void lithium$setSleepingTicker(class01099 class010992) {
        this.w = class010992;
    }

    public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
        return this.d;
    }

    @Override
    protected class00392 an_() {
        return s;
    }

    public int method_5439() {
        return this.T.size();
    }

    public /* synthetic */ void setInventoryLithium(class00743 class007432) {
        this.T = class007432;
    }

    public /* synthetic */ class00743 getInventoryLithium() {
        return this.T;
    }
}

