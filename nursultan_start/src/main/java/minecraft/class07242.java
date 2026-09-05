/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Reference2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00743
 *  minecraft.class00748
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01042
 *  minecraft.class01099
 *  minecraft.class01929
 *  minecraft.class02741
 *  minecraft.class02755
 *  minecraft.class02904
 *  minecraft.class02950
 *  minecraft.class03729
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05838
 *  minecraft.class05845
 *  minecraft.class05946
 *  minecraft.class06482
 *  minecraft.class06485
 *  minecraft.class06521
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06686
 *  minecraft.class06889
 *  minecraft.class06941
 *  minecraft.class06946
 *  minecraft.class07054
 *  minecraft.class07057
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumInventory
 *  net.caffeinemc.mods.lithium.common.block.entity.SetChangedHandlingBlockEntity
 *  net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity
 *  net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker
 *  net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor
 *  net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Reference2IntMap;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00743;
import minecraft.class00748;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01042;
import minecraft.class01099;
import minecraft.class01929;
import minecraft.class02741;
import minecraft.class02755;
import minecraft.class02904;
import minecraft.class02950;
import minecraft.class03729;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05838;
import minecraft.class05845;
import minecraft.class05946;
import minecraft.class06482;
import minecraft.class06485;
import minecraft.class06521;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06686;
import minecraft.class06889;
import minecraft.class06941;
import minecraft.class06946;
import minecraft.class07054;
import minecraft.class07057;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07231;
import minecraft.class07236;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07313;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.SetChangedHandlingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class07242
extends class07236
implements class06941,
class06946,
class07054,
LithiumInventory,
SetChangedHandlingBlockEntity,
SleepingBlockEntity,
InventoryChangeTracker,
SpecialLogicInventory {
    protected static final int N = 0;
    protected static final int y = 1;
    protected static final int u = 2;
    public static final int i = 0;
    private static final int[] l = new int[]{0};
    private static final int[] d = new int[]{2, 1};
    private static final int[] w = new int[]{1};
    public static final int R = 1;
    public static final int M = 2;
    public static final int B = 3;
    public static final int Z = 4;
    public static final int m = 200;
    public static final int P = 2;
    private static final Codec<Map<class05946<class06521<?>>, Integer>> k = Codec.unboundedMap((Codec)class06521.M, (Codec)Codec.INT);
    private static final short Y = 0;
    private static final short Q = 0;
    private static final short O = 0;
    private static final short g = 0;
    protected class00743<class06584> s = class00743.method_10213((int)3, (Object)class06584.E);
    int T;
    int b;
    int j;
    int v;
    protected final class05845 n = new class07231(this);
    private final Reference2IntOpenHashMap<class05946<class06521<?>>> I = new Reference2IntOpenHashMap();
    private final class06485<class02904, ? extends class07313> J;
    private static final ThreadLocal o = new ThreadLocal();
    private boolean q;
    private WrappedBlockEntityTickInvokerAccessor K = null;
    private class01099 V = null;

    @Override
    protected class00743<class06584> aC_() {
        return this.s;
    }

    protected class07242(class00404<?> class004042, class07209 class072092, class00500 class005002, class05838<? extends class07313> class058382) {
        super(class004042, class072092, class005002);
        this.J = class06482.N(class058382);
    }

    private boolean u() {
        return this.T > 0;
    }

    private static boolean y(class01042 class010422, @Nullable class03729<? extends class07313> class037292, class02904 class029042, class00743<class06584> class007432, int n) {
        if (class037292 == null || !class07242.N(class010422, class037292, class029042, class007432, n)) {
            return false;
        }
        class06584 class065842 = (class06584)class007432.get(0);
        class06584 class065843 = ((class07313)class037292.y()).method_8116(class029042, (class01929)class010422);
        class06584 class065844 = (class06584)class007432.get(2);
        if (class065844.R()) {
            class007432.set(2, (Object)class065843.t());
        } else if (class06584.L((class06584)class065844, (class06584)class065843)) {
            class065844.M(1);
        }
        if (class065842.N(class00869.Nx.B()) && !((class06584)class007432.get(1)).R() && ((class06584)class007432.get(1)).N(class06570.jU)) {
            class007432.set(1, (Object)new class06584((class07310)class06570.jE));
        }
        class065842.B(1);
        return true;
    }

    public boolean y(int n, class06584 class065842, class07211 class072112) {
        if (class072112 == class07211.field_11033 && n == 1) {
            return class065842.N(class06570.jE) || class065842.N(class06570.jU);
        }
        return true;
    }

    private static void N(class04782 class047822, class06889 class068892, int n, float f) {
        int n2 = class04995.y((float)((float)n * f));
        float f2 = class04995.M((float)((float)n * f));
        if (f2 != 0.0f && class047822.field_9229.z() < f2) {
            ++n2;
        }
        class07057.N((class04782)class047822, (class06889)class068892, (int)n2);
    }

    public void N(class02741 class027412) {
        for (class06584 class065842 : this.s) {
            class027412.y(class065842);
        }
    }

    public void N(class07209 class072092, class00500 class005002) {
        super.N(class072092, class005002);
        class07299 class072992 = this.z;
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.N(class047822, class06889.y((class00753)class072092));
        }
    }

    private void N(CallbackInfo callbackInfo) {
        if (this.isSleeping() && this.z != null && !this.z.method_8608()) {
            this.wakeUpNow();
        }
    }

    public List<class03729<?>> N(class04782 class047822, class06889 class068892) {
        ArrayList arrayList = Lists.newArrayList();
        for (Reference2IntMap.Entry entry : this.I.reference2IntEntrySet()) {
            class047822.method_64577().y((class05946)entry.getKey()).ifPresent(class037292 -> {
                arrayList.add(class037292);
                class07242.N(class047822, class068892, entry.getIntValue(), ((class07313)class037292.y()).R());
            });
        }
        return arrayList;
    }

    public void N(class04770 class047702) {
        List<class03729<?>> var2 = this.N(class047702.method_51469(), class047702.method_73189());
        class047702.method_7254(var2);
        for (class03729<?> var4 : var2) {
            class047702.method_51283(var4, this.s);
        }
        this.I.clear();
    }

    public void N(class08036 class080362, List<class06584> list) {
    }

    private static Object N(Object object) {
        Object t = o.get();
        o.remove();
        return t;
    }

    private static void N(class04782 class047822, class07209 class072092, class00500 class005002, class07242 class072422, CallbackInfo callbackInfo, class06584 class065842) {
        o.set(class065842.getRecipeRemainder());
    }

    public void N(int n, class06584 class065842, CallbackInfo callbackInfo) {
        if (this.q) {
            this.s.set(n, (Object)class065842);
            callbackInfo.cancel();
        }
    }

    private static void N(class04782 class047822, class07209 class072092, class00500 class005002, class07242 class072422, CallbackInfo callbackInfo) {
        class072422.N(class005002);
    }

    private void N(class00500 class005002) {
        if (!this.u() && this.j == 0 && (class005002.N(class00869.uN) || class005002.N(class00869.Pf) || class005002.N(class00869.PA)) && this.z != null) {
            this.lithium$startSleeping();
        }
    }

    protected int N(class02755 class027552, class06584 class065842) {
        return class027552.y(class065842);
    }

    private static int N(class04782 class047822, class07242 class072422) {
        class02904 class029042 = new class02904(class072422.method_5438(0));
        return class072422.J.N((class02950)class029042, class047822).map(class037292 -> ((class07313)class037292.y()).M()).orElse(200);
    }

    public int[] N(class07211 class072112) {
        if (class072112 == class07211.field_11033) {
            return d;
        }
        if (class072112 == class07211.field_11036) {
            return l;
        }
        return w;
    }

    public boolean N(int n, class06584 class065842, @Nullable class07211 class072112) {
        return this.method_5437(n, class065842);
    }

    private static boolean N(class01042 class010422, @Nullable class03729<? extends class07313> class037292, class02904 class029042, class00743<class06584> class007432, int n) {
        if (((class06584)class007432.get(0)).R() || class037292 == null) {
            return false;
        }
        class06584 class065842 = ((class07313)class037292.y()).method_8116(class029042, (class01929)class010422);
        if (class065842.R()) {
            return false;
        }
        class06584 class065843 = (class06584)class007432.get(2);
        if (class065843.R()) {
            return true;
        }
        if (!class06584.L((class06584)class065843, (class06584)class065842)) {
            return false;
        }
        if (class065843.c() < n && class065843.c() < class065843.U()) {
            return true;
        }
        return class065843.c() < class065842.U();
    }

    @Override
    protected void N(class08329 class083292) {
        super.N(class083292);
        class083292.N("cooking_time_spent", (short)this.j);
        class083292.N("cooking_total_time", (short)this.v);
        class083292.N("lit_time_remaining", (short)this.T);
        class083292.N("lit_total_time", (short)this.b);
        class06686.N((class08329)class083292, this.s);
        class083292.N("RecipesUsed", k, this.I);
    }

    public static void N(class04782 class047822, class07209 class072092, class00500 class005002, class07242 class072422) {
        boolean bl;
        boolean bl2 = class072422.u();
        boolean bl3 = false;
        if (class072422.u()) {
            --class072422.T;
        }
        class06584 class065842 = (class06584)class072422.s.get(1);
        class06584 class065843 = (class06584)class072422.s.get(0);
        boolean bl4 = !class065843.R();
        boolean bl5 = bl = !class065842.R();
        if (class072422.u() || bl && bl4) {
            class03729<?> class037292;
            class02904 class029042 = new class02904(class065843);
            if (bl4) {
                class03729 var10 = class072422.J.N((class02950)class029042, class047822).orElse(null);
            } else {
                class037292 = null;
            }
            int n = class072422.method_5444();
            if (!class072422.u() && class07242.N(class047822.method_30349(), class037292, class029042, class072422.s, n)) {
                class072422.b = class072422.T = class072422.N(class047822.method_61269(), class065842);
                if (class072422.u()) {
                    bl3 = true;
                    if (bl) {
                        class07242.N(class047822, class072092, class005002, class072422, null, class065842);
                        class06581 class065812 = class065842.B();
                        class065842.B(1);
                        if (class065842.R()) {
                            class072422.s.set(1, class07242.N(class065812.Z()));
                        }
                    }
                }
            }
            if (class072422.u() && class07242.N(class047822.method_30349(), class037292, class029042, class072422.s, n)) {
                ++class072422.j;
                if (class072422.j == class072422.v) {
                    class072422.j = 0;
                    class072422.v = class07242.N(class047822, class072422);
                    if (class07242.y(class047822.method_30349(), class037292, class029042, class072422.s, n)) {
                        class072422.N(class037292);
                    }
                    bl3 = true;
                }
            } else {
                class072422.j = 0;
            }
        } else if (!class072422.u() && class072422.j > 0) {
            class072422.j = class04995.N((int)(class072422.j - 2), (int)0, (int)class072422.v);
        }
        if (bl2 != class072422.u()) {
            bl3 = true;
            class005002 = (class00500)class005002.y((class08092)class00748.y, (Comparable)Boolean.valueOf(class072422.u()));
            class047822.method_8652(class072092, class005002, 3);
        }
        if (bl3) {
            class07242.N((class07299)class047822, (class07209)class072092, (class00500)class005002);
        }
        class07242.N(class047822, class072092, class005002, class072422, null);
    }

    public @Nullable class03729<?> N() {
        return null;
    }

    public void N(@Nullable class03729<?> class037292) {
        if (class037292 != null) {
            class05946 var2 = class037292.N();
            this.I.addTo((Object)var2, 1);
        }
    }

    @Override
    protected void N(class00743<class06584> class007432) {
        this.s = class007432;
    }

    @Override
    protected void N(class08299 class082992) {
        super.N(class082992);
        this.s = class00743.method_10213((int)this.method_5439(), (Object)class06584.E);
        class06686.N((class08299)class082992, this.s);
        this.j = class082992.N("cooking_time_spent", (short)0);
        this.v = class082992.N("cooking_total_time", (short)0);
        this.T = class082992.N("lit_time_remaining", (short)0);
        this.b = class082992.N("lit_total_time", (short)0);
        this.I.clear();
        this.I.putAll(class082992.N("RecipesUsed", k).orElse(Map.of()));
        this.N((CallbackInfo)null);
    }

    public boolean method_5437(int n, class06584 class065842) {
        if (n == 2) {
            return false;
        }
        if (n == 1) {
            class06584 class065843 = (class06584)this.s.get(1);
            return this.z.method_61269().N(class065842) || class065842.N(class06570.jU) && !class065843.N(class06570.jU);
        }
        return true;
    }

    @Override
    public void method_5447(int n, class06584 class065842) {
        class07299 class072992;
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(n, class065842, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class06584 class065843 = (class06584)this.s.get(n);
        boolean bl = !class065842.R() && class06584.L((class06584)class065843, (class06584)class065842);
        this.s.set(n, (Object)class065842);
        class065842.R(this.a_(class065842));
        if (n == 0 && !bl && (class072992 = this.z) instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.v = class07242.N(class047822, this);
            this.j = 0;
            this.method_5431();
        }
    }

    public class01099 lithium$getSleepingTicker() {
        return this.V;
    }

    public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor wrappedBlockEntityTickInvokerAccessor) {
        this.K = wrappedBlockEntityTickInvokerAccessor;
        this.lithium$setSleepingTicker(null);
    }

    public void lithium$setSleepingTicker(class01099 class010992) {
        this.V = class010992;
    }

    public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
        return this.K;
    }

    @Override
    public void fabric_onFinalCommit(int n, class06584 class065842, class06584 class065843) {
        if (n == 0) {
            class07299 class072992;
            class06584 class065844 = class065842;
            class06584 class065845 = class065843;
            if (!(!class065845.R() && class06584.L((class06584)class065845, (class06584)class065844)) && (class072992 = this.z) instanceof class04782) {
                class04782 class047822 = (class04782)class072992;
                this.v = class07242.N(class047822, this);
                this.j = 0;
            }
        }
    }

    @Override
    public void fabric_setSuppress(boolean bl) {
        this.q = bl;
    }

    public int method_5439() {
        return this.s.size();
    }

    public /* synthetic */ void setInventoryLithium(class00743 class007432) {
        this.s = class007432;
    }

    public /* synthetic */ class00743 getInventoryLithium() {
        return this.s;
    }

    public void lithium$handleSetChanged() {
        if (this.isSleeping() && this.z != null && !this.z.method_8608()) {
            this.wakeUpNow();
        }
    }
}

