/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00407
 *  minecraft.class00500
 *  minecraft.class00743
 *  minecraft.class00860
 *  minecraft.class00891
 *  minecraft.class01099
 *  minecraft.class01114
 *  minecraft.class01142
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class06584
 *  minecraft.class06638
 *  minecraft.class06686
 *  minecraft.class06695
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07274
 *  minecraft.class07277
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07482
 *  minecraft.class07490
 *  minecraft.class08044
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08978
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumInventory
 *  net.caffeinemc.mods.lithium.common.block.entity.SetBlockStateHandlingBlockEntity
 *  net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity
 *  net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeEmitter
 *  net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker
 *  net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import java.util.List;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00407;
import minecraft.class00500;
import minecraft.class00743;
import minecraft.class00860;
import minecraft.class00891;
import minecraft.class01099;
import minecraft.class01114;
import minecraft.class01142;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class06584;
import minecraft.class06638;
import minecraft.class06686;
import minecraft.class06695;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07274;
import minecraft.class07277;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class07490;
import minecraft.class08044;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08978;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.SetBlockStateHandlingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeEmitter;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00379
extends class07277
implements class07274,
LithiumInventory,
SetBlockStateHandlingBlockEntity,
SleepingBlockEntity,
InventoryChangeEmitter,
InventoryChangeTracker {
    private static final int N = 1;
    private static final class00392 y = class00392.L((String)"container.chest");
    private class00743<class06584> u = class00743.method_10213((int)27, (Object)class06584.E);
    private final class01114 M = new class00407(this);
    private final class01142 B = new class01142();
    private WrappedBlockEntityTickInvokerAccessor Z = null;
    private class01099 m = null;

    protected class00743<class06584> aC_() {
        return this.u;
    }

    protected class00379(class00404<?> class004042, class07209 class072092, class00500 class005002) {
        super(class004042, class072092, class005002);
    }

    public class00379(class07209 class072092, class00500 class005002) {
        this(class00404.field_11914, class072092, class005002);
    }

    private void z() {
        if (this.N(0.0f) == this.N(1.0f)) {
            this.lithium$startSleeping();
        }
    }

    public void u() {
        if (!this.E) {
            this.M.L(this.G(), this.d(), this.w());
        }
    }

    protected class07482 N(int n, class08044 class080442) {
        return class07490.N((int)n, (class08044)class080442, (class06695)this);
    }

    public static void N(class00379 class003792, class00379 class003793) {
        class00743<class06584> var2 = class003792.aC_();
        class003792.N(class003793.aC_());
        class003793.N(var2);
    }

    public static int N(class07290 class072902, class07209 class072092) {
        class00394 class003942;
        if (class072902.method_8320(class072092).k() && (class003942 = class072902.method_8321(class072092)) instanceof class00379) {
            return ((class00379)class003942).M.N();
        }
        return 0;
    }

    public float N(float f) {
        return this.B.N(f);
    }

    private static void N(class07299 class072992, class07209 class072092, class00500 class005002, class00379 class003792, CallbackInfo callbackInfo) {
        class003792.z();
    }

    private void N(int n, int n2, CallbackInfoReturnable callbackInfoReturnable) {
        if (this.m != null) {
            this.wakeUpNow();
        }
    }

    public void N(class00743 class007432, CallbackInfo callbackInfo) {
        this.lithium$emitStackListReplaced();
    }

    protected void N(class07299 class072992, class07209 class072092, class00500 class005002, int n, int n2) {
        class00891 class008912 = class005002.i();
        class072992.method_8427(class072092, class008912, 1, n2);
    }

    public boolean N(int n, int n2) {
        if (n == 1) {
            boolean bl = n2 > 0;
            this.N(n, n2, null);
            this.B.N(bl);
            return true;
        }
        return super.N(n, n2);
    }

    static void N(class07299 class072992, class07209 class072092, class00500 class005002, class04891 class048912) {
        class06638 class066382 = (class06638)class005002.L((class08092)class00860.i);
        if (class066382 == class06638.field_12574) {
            return;
        }
        double d = (double)class072092.method_10263() + 0.5;
        double d2 = (double)class072092.method_10264() + 0.5;
        double d3 = (double)class072092.method_10260() + 0.5;
        if (class066382 == class06638.field_12571) {
            class07211 class072112 = class00860.E((class00500)class005002);
            d += (double)class072112.P() * 0.5;
            d3 += (double)class072112.T() * 0.5;
        }
        class072992.method_43128(null, d, d2, d3, class048912, class04911.field_15245, 0.5f, class072992.field_9229.z() * 0.1f + 0.9f);
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class00379 class003792) {
        class003792.B.N();
        class00379.N(class072992, class072092, class005002, class003792, null);
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        if (!this.a_(class083292)) {
            class06686.N((class08329)class083292, this.u);
        }
    }

    protected void N(class00743<class06584> class007432) {
        this.u = class007432;
        this.N(class007432, null);
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.u = class00743.method_10213((int)this.method_5439(), (Object)class06584.E);
        if (!this.c_(class082992)) {
            class06686.N((class08299)class082992, this.u);
        }
    }

    public void method_5432(class08978 class089782) {
        if (!this.E && !class089782.aB_().method_7325()) {
            this.M.N(class089782.aB_(), this.G(), this.d(), this.w());
        }
    }

    public void method_5435(class08978 class089782) {
        if (!this.E && !class089782.aB_().method_7325()) {
            this.M.N(class089782.aB_(), this.G(), this.d(), this.w(), class089782.method_72381());
        }
    }

    public class01099 lithium$getSleepingTicker() {
        return this.m;
    }

    public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor wrappedBlockEntityTickInvokerAccessor) {
        this.Z = wrappedBlockEntityTickInvokerAccessor;
    }

    public void lithium$setSleepingTicker(class01099 class010992) {
        this.m = class010992;
    }

    public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
        return this.Z;
    }

    protected class00392 an_() {
        return y;
    }

    public void lithium$handleSetBlockState() {
        this.lithium$emitRemoved();
    }

    public List<class08978> j_() {
        return this.M.N(this.G(), this.d());
    }

    public int method_5439() {
        return 27;
    }

    public /* synthetic */ void setInventoryLithium(class00743 class007432) {
        this.u = class007432;
    }

    public /* synthetic */ class00743 getInventoryLithium() {
        return this.u;
    }
}

