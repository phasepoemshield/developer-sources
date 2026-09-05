/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10236
 *  com.mojang.logging.LogUtils
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00743
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01226
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02676
 *  minecraft.class02854
 *  minecraft.class03556
 *  minecraft.class06584
 *  minecraft.class06667
 *  minecraft.class06686
 *  minecraft.class06695
 *  minecraft.class07209
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08974
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumTransferConditionInventory
 *  net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext
 *  net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant
 *  net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10236;
import com.mojang.logging.LogUtils;
import java.util.Objects;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00743;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01226;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02676;
import minecraft.class02854;
import minecraft.class03556;
import minecraft.class03769;
import minecraft.class06584;
import minecraft.class06667;
import minecraft.class06686;
import minecraft.class06695;
import minecraft.class07209;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08974;
import net.caffeinemc.mods.lithium.api.inventory.LithiumTransferConditionInventory;
import net.fabricmc.fabric.api.transfer.v1.transaction.TransactionContext;
import net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant;
import net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03773
extends class00394
implements class08974,
LithiumTransferConditionInventory,
SpecialLogicInventory {
    public static final int N = 6;
    private static final Logger y = LogUtils.getLogger();
    private static final int u = -1;
    private final class00743<class06584> i;
    public int R = -1;
    private boolean M = false;
    private final SnapshotParticipant B = new class10236(this);

    public int L() {
        return this.R;
    }

    public class03773(class07209 class072092, class00500 class005002) {
        super(class00404.field_40329, class072092, class005002);
        this.i = class00743.method_10213((int)6, (Object)class06584.E);
    }

    public void y(class08329 class083292) {
        class083292.L("Items");
    }

    protected void N_9(class02666 class026662) {
        super.N_9(class026662);
        ((class02854)class026662.a_(class02484.NG, (Object)class02854.N)).N(this.i);
    }

    public void N(int n) {
        if (n < 0 || n >= 6) {
            y.error("Expected slot 0-5, got {}", (Object)n);
            return;
        }
        this.R = n;
        class00500 class005002 = this.w();
        for (int i = 0; i < class03769.Z.size(); ++i) {
            boolean bl = !this.method_5438(i).R();
            class06667 class066672 = class03769.Z.get(i);
            class005002 = (class00500)class005002.y((class08092)class066672, (Comparable)Boolean.valueOf(bl));
        }
        Objects.requireNonNull(this.z).method_8652(this.U, class005002, 3);
        this.z.N((class03556)class01194.L, this.U, class01164.N((class00500)class005002));
    }

    public class00743<class06584> N() {
        return this.i;
    }

    protected void N(class02676 class026762) {
        super.N(class026762);
        class026762.N(class02484.NG, (Object)class02854.N(this.i));
    }

    public void N(int n, class06584 class065842, CallbackInfo callbackInfo) {
        if (this.M) {
            this.i.set(n, (Object)class065842);
            callbackInfo.cancel();
        }
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.yv);
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.i.clear();
        class06686.N((class08299)class082992, this.i);
        this.R = class082992.N("last_interacted_slot", -1);
    }

    public boolean N(class06695 class066952, int n, class06584 class065842) {
        return class066952.N_60(class065843 -> {
            if (class065843.R()) {
                return true;
            }
            return class06584.L((class06584)class065842, (class06584)class065843) && class065843.c() + class065842.c() <= class066952.a_(class065843);
        });
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        class06686.N((class08329)class083292, this.i, (boolean)true);
        class083292.N("last_interacted_slot", this.R);
    }

    public boolean method_5443(class08036 class080362) {
        return class06695.N((class00394)this, (class08036)class080362);
    }

    public int method_5444() {
        return 1;
    }

    public void method_5447(int n, class06584 class065842) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(n, class065842, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (this.N(class065842)) {
            this.N().set(n, (Object)class065842);
            this.N(n);
        } else if (class065842.R()) {
            this.method_5434(n, this.method_5444());
        }
    }

    public class06584 method_5434(int n, int n2) {
        class06584 class065842 = Objects.requireNonNullElse((class06584)this.N().get(n), class06584.E);
        this.N().set(n, (Object)class06584.E);
        if (!class065842.R()) {
            this.N(n);
        }
        return class065842;
    }

    public void fabric_onFinalCommit(int n, class06584 class065842, class06584 class065843) {
    }

    public void fabric_onTransfer(int n, TransactionContext transactionContext) {
        this.B.updateSnapshots(transactionContext);
        this.R = n;
    }

    public void fabric_setSuppress(boolean bl) {
        this.M = bl;
    }

    public boolean lithium$itemInsertionTestRequiresStackSize1() {
        return true;
    }
}

