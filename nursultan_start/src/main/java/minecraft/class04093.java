/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class00753
 *  minecraft.class01099
 *  minecraft.class01164
 *  minecraft.class01171
 *  minecraft.class01194
 *  minecraft.class03481
 *  minecraft.class03485
 *  minecraft.class03502
 *  minecraft.class03508
 *  minecraft.class03556
 *  minecraft.class03982
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07086
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07438
 *  minecraft.class07536
 *  minecraft.class08005
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity
 *  net.caffeinemc.mods.lithium.common.block.entity.sleeping_sculk.GameEventListenerWithCallback
 *  net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00753;
import minecraft.class01099;
import minecraft.class01164;
import minecraft.class01171;
import minecraft.class01194;
import minecraft.class03481;
import minecraft.class03485;
import minecraft.class03502;
import minecraft.class03508;
import minecraft.class03556;
import minecraft.class03982;
import minecraft.class04000;
import minecraft.class04003;
import minecraft.class04007;
import minecraft.class04011;
import minecraft.class04061;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07086;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07438;
import minecraft.class07536;
import minecraft.class08005;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.sleeping_sculk.GameEventListenerWithCallback;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04093
extends class00394
implements class01171<class03485>,
class03502,
SleepingBlockEntity {
    private static final int N = 10;
    private static final int y = 20;
    private static final int L = 5;
    private static final int u = 6;
    private static final int i = 40;
    private static final int R = 90;
    private static final Int2ObjectMap<class04891> M = (Int2ObjectMap)class07536.N((Object)new Int2ObjectOpenHashMap(), int2ObjectOpenHashMap -> {
        int2ObjectOpenHashMap.put(1, (Object)class04909.IU);
        int2ObjectOpenHashMap.put(2, (Object)class04909.IE);
        int2ObjectOpenHashMap.put(3, (Object)class04909.IW);
        int2ObjectOpenHashMap.put(4, (Object)class04909.Iz);
    });
    private static final int m = 0;
    private int P = 0;
    private final class03481 s = new class04061(this);
    private class03508 T = new class03508();
    private final class03485 b = new class03485((class03502)this);
    private WrappedBlockEntityTickInvokerAccessor j = null;
    private class01099 v = null;

    private boolean L(class04782 class047822) {
        if (this.P < 4) {
            return false;
        }
        return class04011.N(class07078.yX, class06113.field_16461, class047822, this.d(), 20, 5, 6, class04000.y, false).isPresent();
    }

    public class03508 L() {
        return this.T;
    }

    public class04093(class07209 class072092, class00500 class005002) {
        super(class00404.field_37648, class072092, class005002);
        this.N(class072092, class005002, null);
    }

    public class03481 u() {
        return this.s;
    }

    private void y(class07299 class072992) {
        class04891 class048912 = (class04891)M.get(this.P);
        if (class048912 != null) {
            class07209 class072092 = this.d();
            int n = class072092.method_10263() + class04995.y((class06069)class072992.field_9229, (int)-10, (int)10);
            int n2 = class072092.method_10264() + class04995.y((class06069)class072992.field_9229, (int)-10, (int)10);
            int n3 = class072092.method_10260() + class04995.y((class06069)class072992.field_9229, (int)-10, (int)10);
            class072992.method_43128(null, (double)n, (double)n2, (double)n3, class048912, class04911.field_15251, 5.0f, 1.0f);
        }
    }

    private boolean y(class04782 class047822) {
        return (Boolean)this.w().L((class08092)class04007.u) != false && class047822.y() != class07086.field_5801 && (Boolean)class047822.method_64395().N(class07305.NN) != false;
    }

    private boolean y(class04782 class047822, class04770 class047702) {
        OptionalInt optionalInt = class03982.N((class04782)class047822, (class07209)this.d(), (class04770)class047702);
        optionalInt.ifPresent(n -> {
            this.P = n;
        });
        return optionalInt.isPresent();
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        class083292.N("warning_level", this.P);
        class083292.N("listener", class03508.N, (Object)this.T);
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.P = class082992.N("warning_level", 0);
        this.T = class082992.N("listener", class03508.N).orElseGet(class03508::new);
        this.N(class082992, null);
    }

    private void N(class07209 class072092, class00500 class005002, CallbackInfo callbackInfo) {
        ((GameEventListenerWithCallback)this.b).lithium$setGameEventCallback(() -> ((class04093)this).wakeUpNow());
    }

    private void N(class08299 class082992, CallbackInfo callbackInfo) {
        if (this.T.N().N(Long.MAX_VALUE).isPresent()) {
            this.wakeUpNow();
        }
    }

    public void N(class07209 class072092, class00500 class005002) {
        class07299 class072992;
        if (((Boolean)class005002.L((class08092)class04007.y)).booleanValue() && (class072992 = this.z) instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.N(class047822);
        }
    }

    private void N(class04782 class047822, @Nullable class07049 class070492) {
        class07209 class072092 = this.d();
        class00500 class005002 = this.w();
        class047822.method_8652(class072092, (class00500)class005002.y((class08092)class04007.y, (Comparable)Boolean.valueOf(true)), 2);
        class047822.N(class072092, class005002.i(), 90);
        class047822.N(3007, class072092, 0);
        class047822.N((class03556)class01194.c, class072092, class01164.N((class07049)class070492));
    }

    public void N(class04782 class047822) {
        if (this.y(class047822) && this.P > 0) {
            if (!this.L(class047822)) {
                this.y((class07299)class047822);
            }
            class04003.N(class047822, class06889.y((class00753)this.d()), null, 40);
        }
    }

    public static @Nullable class04770 N(@Nullable class07049 class070492) {
        class08005 class080052;
        class07049 class070493;
        class07438 class074382;
        if (class070492 instanceof class04770) {
            class04770 class047702 = (class04770)class070492;
            return class047702;
        }
        if (class070492 != null && (class074382 = class070492.method_5642()) instanceof class04770) {
            class04770 class047703 = (class04770)class074382;
            return class047703;
        }
        if (class070492 instanceof class08005 && (class070493 = (class080052 = (class08005)class070492).z()) instanceof class04770) {
            class074382 = (class04770)class070493;
            return class074382;
        }
        if (class070492 instanceof class00717 && (class070493 = (class080052 = (class00717)class070492).z()) instanceof class04770) {
            class074382 = (class04770)class070493;
            return class074382;
        }
        return null;
    }

    public class03485 B() {
        return this.b;
    }

    public void N(class04782 class047822, @Nullable class04770 class047702) {
        if (class047702 == null) {
            return;
        }
        if (((Boolean)this.w().L((class08092)class04007.y)).booleanValue()) {
            return;
        }
        this.P = 0;
        if (this.y(class047822) && !this.y(class047822, class047702)) {
            return;
        }
        this.N(class047822, (class07049)class047702);
    }

    public class01099 lithium$getSleepingTicker() {
        return this.v;
    }

    public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor wrappedBlockEntityTickInvokerAccessor) {
        this.j = wrappedBlockEntityTickInvokerAccessor;
        this.lithium$setSleepingTicker(null);
    }

    public void lithium$setSleepingTicker(class01099 class010992) {
        this.v = class010992;
    }

    public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
        return this.j;
    }
}

