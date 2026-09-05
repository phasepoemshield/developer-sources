/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00743
 *  minecraft.class00753
 *  minecraft.class01114
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class06584
 *  minecraft.class06686
 *  minecraft.class06695
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07277
 *  minecraft.class07482
 *  minecraft.class07490
 *  minecraft.class08044
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08978
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumInventory
 *  net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.util.List;
import minecraft.class00392;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00743;
import minecraft.class00753;
import minecraft.class01114;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class06109;
import minecraft.class06122;
import minecraft.class06584;
import minecraft.class06686;
import minecraft.class06695;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07277;
import minecraft.class07482;
import minecraft.class07490;
import minecraft.class08044;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08978;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06130
extends class07277
implements LithiumInventory,
InventoryChangeTracker {
    private static final class00392 N = class00392.L((String)"container.barrel");
    private class00743<class06584> y = class00743.method_10213((int)27, (Object)class06584.E);
    private final class01114 u = new class06122(this);

    protected class00743<class06584> aC_() {
        return this.y;
    }

    public class06130(class07209 class072092, class00500 class005002) {
        super(class00404.field_16411, class072092, class005002);
    }

    public void u() {
        if (!this.E) {
            this.u.L(this.G(), this.d(), this.w());
        }
    }

    protected class07482 N(int n, class08044 class080442) {
        return class07490.N((int)n, (class08044)class080442, (class06695)this);
    }

    void N(class00500 class005002, class04891 class048912) {
        class00753 class007532 = ((class07211)class005002.L(class06109.y)).E();
        double d = (double)this.U.method_10263() + 0.5 + (double)class007532.method_10263() / 2.0;
        double d2 = (double)this.U.method_10264() + 0.5 + (double)class007532.method_10264() / 2.0;
        double d3 = (double)this.U.method_10260() + 0.5 + (double)class007532.method_10260() / 2.0;
        this.z.method_43128(null, d, d2, d3, class048912, class04911.field_15245, 0.5f, this.z.field_9229.z() * 0.1f + 0.9f);
    }

    void N(class00500 class005002, boolean bl) {
        this.z.method_8652(this.d(), (class00500)class005002.y((class08092)class06109.L, (Comparable)Boolean.valueOf(bl)), 3);
    }

    protected void N(class00743<class06584> class007432) {
        this.y = class007432;
        this.N(class007432, null);
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        if (!this.a_(class083292)) {
            class06686.N((class08329)class083292, this.y);
        }
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.y = class00743.method_10213((int)this.method_5439(), (Object)class06584.E);
        if (!this.c_(class082992)) {
            class06686.N((class08299)class082992, this.y);
        }
    }

    public void N(class00743 class007432, CallbackInfo callbackInfo) {
        this.lithium$emitStackListReplaced();
    }

    public void method_5432(class08978 class089782) {
        if (!this.E && !class089782.aB_().method_7325()) {
            this.u.N(class089782.aB_(), this.G(), this.d(), this.w());
        }
    }

    public void method_5435(class08978 class089782) {
        if (!this.E && !class089782.aB_().method_7325()) {
            this.u.N(class089782.aB_(), this.G(), this.d(), this.w(), class089782.method_72381());
        }
    }

    protected class00392 an_() {
        return N;
    }

    public List<class08978> j_() {
        return this.u.N(this.G(), this.d());
    }

    public int method_5439() {
        return 27;
    }

    public /* synthetic */ void setInventoryLithium(class00743 class007432) {
        this.y = class007432;
    }

    public /* synthetic */ class00743 getInventoryLithium() {
        return this.y;
    }
}

