/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00743
 *  minecraft.class01099
 *  minecraft.class01712
 *  minecraft.class01748
 *  minecraft.class02741
 *  minecraft.class03108
 *  minecraft.class03507
 *  minecraft.class05845
 *  minecraft.class06584
 *  minecraft.class06686
 *  minecraft.class06695
 *  minecraft.class07209
 *  minecraft.class07277
 *  minecraft.class07299
 *  minecraft.class07482
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.caffeinemc.mods.lithium.common.block.entity.SetChangedHandlingBlockEntity
 *  net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity
 *  net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.Iterator;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00743;
import minecraft.class01099;
import minecraft.class01712;
import minecraft.class01748;
import minecraft.class02741;
import minecraft.class03108;
import minecraft.class03507;
import minecraft.class05845;
import minecraft.class06584;
import minecraft.class06686;
import minecraft.class06695;
import minecraft.class07209;
import minecraft.class07277;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import net.caffeinemc.mods.lithium.common.block.entity.SetChangedHandlingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03145
extends class07277
implements class03507,
SetChangedHandlingBlockEntity,
SleepingBlockEntity {
    public static final int N = 3;
    public static final int y = 3;
    public static final int u = 9;
    public static final int M = 1;
    public static final int B = 0;
    public static final int Z = 9;
    public static final int m = 10;
    private static final int s = 0;
    private static final int T = 0;
    private static final class00392 b = class00392.L((String)"container.crafter");
    private class00743<class06584> j = class00743.method_10213((int)9, (Object)class06584.E);
    private int v = 0;
    protected final class05845 P = new class03108(this);
    private WrappedBlockEntityTickInvokerAccessor n = null;
    private class01099 l = null;

    public class00743<class06584> aC_() {
        return this.j;
    }

    private boolean L(int n) {
        return n > -1 && n < 9 && ((class06584)this.j.get(n)).R();
    }

    public class03145(class07209 class072092, class00500 class005002) {
        super(class00404.field_46808, class072092, class005002);
    }

    private void B(class08329 class083292) {
        IntArrayList intArrayList = new IntArrayList();
        for (int i = 0; i < 9; ++i) {
            if (!this.N(i)) continue;
            intArrayList.add(i);
        }
        class083292.N("disabled_slots", intArrayList.toIntArray());
    }

    private void Z(class08329 class083292) {
        class083292.N("triggered", this.P.N(9));
    }

    public int U() {
        int n = 0;
        for (int i = 0; i < this.method_5439(); ++i) {
            if (this.method_5438(i).R() && !this.N(i)) continue;
            ++n;
        }
        return n;
    }

    public boolean z() {
        return this.P.N(9) == 1;
    }

    public int y() {
        return 3;
    }

    public void y(int n) {
        this.v = n;
        this.N((CallbackInfo)null);
    }

    private void E() {
        if (this.v == 0) {
            this.lithium$startSleeping();
        }
    }

    public int N() {
        return 3;
    }

    public void N(class02741 class027412) {
        for (class06584 class065842 : this.j) {
            class027412.N(class065842);
        }
    }

    protected class07482 N(int n, class08044 class080442) {
        return new class01712(n, class080442, (class03507)this, this.P);
    }

    public void N(int n, boolean bl) {
        if (!this.L(n)) {
            return;
        }
        this.P.N(n, bl ? 0 : 1);
        this.method_5431();
    }

    public void N(boolean bl) {
        this.P.N(9, bl ? 1 : 0);
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class03145 class031452) {
        int n = class031452.v - 1;
        if (n < 0) {
            class03145.N(null, class031452, n);
            return;
        }
        class031452.v = n;
        if (n == 0) {
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)class01748.y, (Comparable)Boolean.valueOf(false)), 3);
        }
        class03145.N(null, class031452, n);
    }

    private static void N(CallbackInfo callbackInfo, class03145 class031452, int n) {
        if (n < 0) {
            class031452.E();
        }
    }

    private void N(CallbackInfo callbackInfo) {
        if (this.isSleeping() && this.z != null && !this.z.method_8608()) {
            this.wakeUpNow();
        }
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        class083292.N("crafting_ticks_remaining", this.v);
        if (!this.a_(class083292)) {
            class06686.N((class08329)class083292, this.j);
        }
        this.B(class083292);
        this.Z(class083292);
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.v = class082992.N("crafting_ticks_remaining", 0);
        this.j = class00743.method_10213((int)this.method_5439(), (Object)class06584.E);
        if (!this.c_(class082992)) {
            class06686.N((class08299)class082992, this.j);
        }
        for (int i = 0; i < 9; ++i) {
            this.P.N(i, 0);
        }
        class082992.B("disabled_slots").ifPresent(nArray -> {
            for (int n : nArray) {
                if (!this.L(n)) continue;
                this.P.N(n, 1);
            }
        });
        this.P.N(9, class082992.N("triggered", 0));
        this.N((CallbackInfo)null);
    }

    private boolean N(int n, class06584 class065842, int n2) {
        for (int i = n2 + 1; i < 9; ++i) {
            class06584 class065843;
            if (this.N(i) || !(class065843 = this.method_5438(i)).R() && (class065843.c() >= n || !class06584.L((class06584)class065843, (class06584)class065842))) continue;
            return true;
        }
        return false;
    }

    protected void N(class00743<class06584> class007432) {
        this.j = class007432;
    }

    public boolean N(int n) {
        if (n >= 0 && n < 9) {
            return this.P.N(n) == 1;
        }
        return false;
    }

    public boolean method_5443(class08036 class080362) {
        return class06695.N((class00394)this, (class08036)class080362);
    }

    public boolean method_5437(int n, class06584 class065842) {
        if (this.P.N(n) == 1) {
            return false;
        }
        class06584 class065843 = (class06584)this.j.get(n);
        int n2 = class065843.c();
        if (n2 >= class065843.U()) {
            return false;
        }
        if (class065843.R()) {
            return true;
        }
        return !this.N(n2, class065843, n);
    }

    public void method_5447(int n, class06584 class065842) {
        if (this.N(n)) {
            this.N(n, true);
        }
        super.method_5447(n, class065842);
    }

    public boolean method_5442() {
        Iterator var1 = this.j.iterator();
        while (var1.hasNext()) {
            if (((class06584)var1.next()).R()) continue;
            return false;
        }
        return true;
    }

    public class01099 lithium$getSleepingTicker() {
        return this.l;
    }

    public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor wrappedBlockEntityTickInvokerAccessor) {
        this.n = wrappedBlockEntityTickInvokerAccessor;
        this.lithium$setSleepingTicker(null);
    }

    public void lithium$setSleepingTicker(class01099 class010992) {
        this.l = class010992;
    }

    public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
        return this.n;
    }

    protected class00392 an_() {
        return b;
    }

    public class06584 method_5438(int n) {
        return (class06584)this.j.get(n);
    }

    public int method_5439() {
        return 9;
    }

    public void lithium$handleSetChanged() {
        if (this.isSleeping() && this.z != null && !this.z.method_8608()) {
            this.wakeUpNow();
        }
    }
}

