/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00743
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class06686
 *  minecraft.class06695
 *  minecraft.class07209
 *  minecraft.class07482
 *  minecraft.class07502
 *  minecraft.class08044
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumInventory
 *  net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00743;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class06686;
import minecraft.class06695;
import minecraft.class07209;
import minecraft.class07277;
import minecraft.class07482;
import minecraft.class07502;
import minecraft.class08044;
import minecraft.class08299;
import minecraft.class08329;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07243
extends class07277
implements LithiumInventory,
InventoryChangeTracker {
    public static final int N = 9;
    private static final class00392 y = class00392.L((String)"container.dispenser");
    private class00743<class06584> u = class00743.method_10213((int)9, (Object)class06584.E);

    @Override
    protected class00743<class06584> aC_() {
        return this.u;
    }

    protected class07243(class00404<?> class004042, class07209 class072092, class00500 class005002) {
        super(class004042, class072092, class005002);
    }

    public class07243(class07209 class072092, class00500 class005002) {
        this(class00404.field_11887, class072092, class005002);
    }

    @Override
    protected void N(class08329 class083292) {
        super.N(class083292);
        if (!this.a_(class083292)) {
            class06686.N((class08329)class083292, this.u);
        }
    }

    @Override
    protected void N(class00743<class06584> class007432) {
        this.u = class007432;
        this.N(class007432, null);
    }

    @Override
    protected class07482 N(int n, class08044 class080442) {
        return new class07502(n, class080442, (class06695)this);
    }

    public void N(class00743 class007432, CallbackInfo callbackInfo) {
        this.lithium$emitStackListReplaced();
    }

    public int N(class06069 class060692) {
        this.y(null);
        int n = -1;
        int n2 = 1;
        for (int i = 0; i < this.u.size(); ++i) {
            if (((class06584)this.u.get(i)).R() || class060692.y(n2++) != 0) continue;
            n = i;
        }
        return n;
    }

    public class06584 N(class06584 class065842) {
        int n = this.a_(class065842);
        for (int i = 0; i < this.u.size(); ++i) {
            class06584 class065843 = (class06584)this.u.get(i);
            if (!class065843.R() && !class06584.L((class06584)class065842, (class06584)class065843)) continue;
            int n2 = Math.min(class065842.c(), n - class065843.c());
            if (n2 > 0) {
                if (class065843.R()) {
                    this.method_5447(i, class065842.N(n2));
                } else {
                    class065842.B(n2);
                    class065843.M(n2);
                }
            }
            if (class065842.R()) break;
        }
        return class065842;
    }

    @Override
    protected void N(class08299 class082992) {
        super.N(class082992);
        this.u = class00743.method_10213((int)this.method_5439(), (Object)class06584.E);
        if (!this.c_(class082992)) {
            class06686.N((class08299)class082992, this.u);
        }
    }

    @Override
    protected class00392 an_() {
        return y;
    }

    public int method_5439() {
        return 9;
    }

    public /* synthetic */ void setInventoryLithium(class00743 class007432) {
        this.u = class007432;
    }

    public /* synthetic */ class00743 getInventoryLithium() {
        return this.u;
    }
}

