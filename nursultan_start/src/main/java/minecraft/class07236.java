/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.ReferenceArraySet
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00743
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02676
 *  minecraft.class02854
 *  minecraft.class03748
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06237
 *  minecraft.class06584
 *  minecraft.class06686
 *  minecraft.class06695
 *  minecraft.class06889
 *  minecraft.class07044
 *  minecraft.class07061
 *  minecraft.class07209
 *  minecraft.class07482
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumInventory
 *  net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeEmitter
 *  net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeListener
 *  net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker
 *  net.caffeinemc.mods.lithium.common.hopper.InventoryHelper
 *  net.caffeinemc.mods.lithium.common.hopper.LithiumStackList
 *  net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import java.util.Iterator;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00743;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02676;
import minecraft.class02854;
import minecraft.class03748;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06237;
import minecraft.class06584;
import minecraft.class06686;
import minecraft.class06695;
import minecraft.class06889;
import minecraft.class07044;
import minecraft.class07061;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08299;
import minecraft.class08329;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeEmitter;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeListener;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import net.caffeinemc.mods.lithium.common.hopper.InventoryHelper;
import net.caffeinemc.mods.lithium.common.hopper.LithiumStackList;
import net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class07236
extends class00394
implements class06237,
class06695,
class07061,
InventoryChangeEmitter,
SpecialLogicInventory {
    private class07044 N = class07044.N;
    private @Nullable class00392 y;
    private boolean u = false;
    ReferenceArraySet t = null;
    ReferenceArraySet G = null;

    protected abstract class00743<class06584> aC_();

    public class00392 method_5476() {
        return this.method_5477();
    }

    public @Nullable class00392 method_5797() {
        return this.y;
    }

    public class00392 method_5477() {
        if (this.y != null) {
            return this.y;
        }
        return this.an_();
    }

    protected class07236(class00404<?> class004042, class07209 class072092, class00500 class005002) {
        super(class004042, class072092, class005002);
    }

    public boolean Z() {
        return !this.N.equals((Object)class07044.N);
    }

    private void z() {
        class07236 var3;
        LithiumStackList lithiumStackList;
        if (this.t != null) {
            this.t.clear();
        }
        LithiumStackList lithiumStackList2 = lithiumStackList = this instanceof LithiumInventory ? InventoryHelper.getLithiumStackListOrNull((LithiumInventory)((LithiumInventory)this)) : null;
        if (lithiumStackList != null && (var3 = this) instanceof InventoryChangeTracker) {
            InventoryChangeTracker inventoryChangeTracker = (InventoryChangeTracker)var3;
            lithiumStackList.removeInventoryModificationCallback(inventoryChangeTracker);
        }
    }

    public void y(class08329 class083292) {
        class083292.L("CustomName");
        class083292.L("lock");
        class083292.L("Items");
    }

    protected void N(class02676 class026762) {
        super.N(class026762);
        class026762.N(class02484.B, (Object)this.y);
        if (this.Z()) {
            class026762.N(class02484.Nw, (Object)this.N);
        }
        class026762.N(class02484.NG, (Object)class02854.N(this.aC_()));
    }

    protected abstract class07482 N(int var1, class08044 var2);

    protected void N_9(class02666 class026662) {
        super.N_9(class026662);
        this.y = (class00392)class026662.method_58694(class02484.B);
        this.N = (class07044)class026662.a_(class02484.Nw, (Object)class07044.N);
        ((class02854)class026662.a_(class02484.NG, (Object)class02854.N)).N(this.aC_());
    }

    public void N(class07236 class072362, Operation operation) {
        if (!this.u) {
            operation.call(new Object[]{class072362});
        }
    }

    public void N(class08299 class082992, CallbackInfo callbackInfo) {
        class07236 var4 = this;
        if (var4 instanceof InventoryChangeTracker) {
            ((InventoryChangeTracker)var4).lithium$emitStackListReplaced();
        }
    }

    public boolean N(class08036 class080362) {
        return this.N.N(class080362);
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        this.N.N(class083292);
        class083292.y("CustomName", class03748.N, (Object)this.y);
    }

    protected abstract void N(class00743<class06584> var1);

    public static void N(class06889 class068892, class08036 class080362, class00392 class003922) {
        class07299 class072992 = class080362.method_73183();
        class080362.method_7353((class00392)class00392.N((String)"container.isLocked", (Object[])new Object[]{class003922}), true);
        if (!class072992.method_8608()) {
            class072992.method_43128(null, class068892.N(), class068892.y(), class068892.L(), class04909.RT, class04911.field_15245, 1.0f, 1.0f);
        }
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.N = class07044.N((class08299)class082992);
        this.y = class07236.N_10((class08299)class082992, (String)"CustomName");
        this.N(class082992, null);
    }

    public boolean method_5443(class08036 class080362) {
        return class06695.N((class00394)this, (class08036)class080362);
    }

    public void method_5448() {
        this.aC_().clear();
    }

    public void method_5447(int n, class06584 class065842) {
        this.aC_().set(n, (Object)class065842);
        class065842.R(this.a_(class065842));
        class07236 class072362 = this;
        this.N(class072362, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_2624]");
            ((class07236)((Object)((Object)objectArray[0]))).method_5431();
            return null;
        });
    }

    public class06584 method_5434(int n, int n2) {
        class06584 class065842 = class06686.N(this.aC_(), (int)n, (int)n2);
        if (!class065842.R()) {
            this.method_5431();
        }
        return class065842;
    }

    public class06584 method_5441(int n) {
        return class06686.N(this.aC_(), (int)n);
    }

    public boolean method_5442() {
        Iterator var1 = this.aC_().iterator();
        while (var1.hasNext()) {
            if (((class06584)var1.next()).R()) continue;
            return false;
        }
        return true;
    }

    public void fabric_onFinalCommit(int n, class06584 class065842, class06584 class065843) {
    }

    public void fabric_setSuppress(boolean bl) {
        this.u = bl;
    }

    public void lithium$emitStackListReplaced() {
        class07236 var3;
        ReferenceArraySet referenceArraySet = this.G;
        this.G = null;
        if (referenceArraySet != null && !referenceArraySet.isEmpty()) {
            for (InventoryChangeListener inventoryChangeListener : referenceArraySet) {
                inventoryChangeListener.handleStackListReplaced((class06695)this);
            }
            referenceArraySet.clear();
        }
        if (this.G == null) {
            this.G = referenceArraySet;
        }
        if ((var3 = this) instanceof InventoryChangeListener) {
            ObjectIterator objectIterator = (InventoryChangeListener)var3;
            objectIterator.handleStackListReplaced((class06695)this);
        }
        this.z();
    }

    public void lithium$forwardContentChangeOnce(InventoryChangeListener inventoryChangeListener, LithiumStackList lithiumStackList) {
        if (this.t == null) {
            this.t = new ReferenceArraySet(1);
        }
        lithiumStackList.setNextInventoryModificationCallback((InventoryChangeTracker)this);
        this.t.add((Object)inventoryChangeListener);
    }

    public void lithium$emitContentModified() {
        ReferenceArraySet referenceArraySet = this.t;
        if (referenceArraySet != null) {
            ObjectIterator objectIterator = referenceArraySet.iterator();
            while (objectIterator.hasNext()) {
                ((InventoryChangeListener)objectIterator.next()).lithium$handleInventoryContentModified((class06695)this);
            }
            referenceArraySet.clear();
        }
    }

    protected abstract class00392 an_();

    public void lithium$emitFirstComparatorAdded() {
        ReferenceArraySet referenceArraySet = this.t;
        if (referenceArraySet != null && !referenceArraySet.isEmpty()) {
            referenceArraySet.removeIf(inventoryChangeListener -> inventoryChangeListener.lithium$handleComparatorAdded((class06695)this));
        }
    }

    public @Nullable class07482 createMenu(int n, class08044 class080442, class08036 class080362) {
        if (this.N(class080362)) {
            return this.N(n, class080442);
        }
        class07236.N(this.d().method_46558(), class080362, this.method_5476());
        return null;
    }

    public class06584 method_5438(int n) {
        return (class06584)this.aC_().get(n);
    }

    public void lithium$stopForwardingMajorInventoryChanges(InventoryChangeListener inventoryChangeListener) {
        if (this.G != null) {
            this.G.remove((Object)inventoryChangeListener);
        }
    }

    public void lithium$emitRemoved() {
        class07236 var3;
        ReferenceArraySet referenceArraySet = this.G;
        this.G = null;
        if (referenceArraySet != null && !referenceArraySet.isEmpty()) {
            for (InventoryChangeListener inventoryChangeListener : referenceArraySet) {
                inventoryChangeListener.lithium$handleInventoryRemoved((class06695)this);
            }
            referenceArraySet.clear();
        }
        if (this.G == null) {
            this.G = referenceArraySet;
        }
        if ((var3 = this) instanceof InventoryChangeListener) {
            ObjectIterator objectIterator = (InventoryChangeListener)var3;
            objectIterator.lithium$handleInventoryRemoved((class06695)this);
        }
        this.z();
    }

    public void lithium$forwardMajorInventoryChanges(InventoryChangeListener inventoryChangeListener) {
        if (this.G == null) {
            this.G = new ReferenceArraySet(1);
        }
        this.G.add((Object)inventoryChangeListener);
    }
}

