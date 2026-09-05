/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00734
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06695
 *  minecraft.class06897
 *  minecraft.class06993
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07480
 *  minecraft.class07482
 *  minecraft.class07504
 *  minecraft.class07760
 *  minecraft.class08064
 *  minecraft.class08080
 *  minecraft.class08092
 *  minecraft.class08400
 *  net.fabricmc.fabric.api.object.builder.v1.entity.MinecartComparatorLogicRegistry
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00734;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06695;
import minecraft.class06897;
import minecraft.class06993;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07480;
import minecraft.class07482;
import minecraft.class07504;
import minecraft.class07760;
import minecraft.class08064;
import minecraft.class08080;
import minecraft.class08092;
import minecraft.class08400;
import net.fabricmc.fabric.api.object.builder.v1.entity.MinecartComparatorLogicRegistry;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06784
extends class07760 {
    public static final MapCodec<class06784> y = class06784.y(class06784::new);
    public static final class08064<class08080> L = class06665.NE;
    public static final class06667 u = class06665.k;
    private static final int i = 20;

    public class08092<class08080> L() {
        return L;
    }

    public class06784(class01362 class013622) {
        super(true, class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)u, (Comparable)Boolean.valueOf(false))).y(L, (Comparable)class08080.field_12665)).y((class08092)N, (Comparable)Boolean.valueOf(false)));
    }

    protected void y(class07299 class072992, class07209 class072092, class00500 class005002, boolean bl) {
        for (class07209 class072093 : new class06897(class072992, class072092, class005002).N()) {
            class00500 class005003 = class072992.method_8320(class072093);
            class072992.method_41410(class005003, class072093, class005003.i(), null, false);
        }
    }

    protected int y(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (!((Boolean)class005002.L((class08092)u)).booleanValue()) {
            return 0;
        }
        return class072112 == class07211.field_11036 ? 15 : 0;
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        class08080 class080802 = (class08080)class005002.L(L);
        class08080 class080803 = this.N(class080802, class069932);
        return (class00500)class005002.y(L, (Comparable)class080803);
    }

    private class00734 N(class07209 class072092) {
        double d = 0.2;
        return new class00734((double)class072092.method_10263() + 0.2, (double)class072092.method_10264(), (double)class072092.method_10260() + 0.2, (double)(class072092.method_10263() + 1) - 0.2, (double)(class072092.method_10264() + 1) - 0.2, (double)(class072092.method_10260() + 1) - 0.2);
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        class08080 class080802 = (class08080)class005002.L(L);
        class08080 class080803 = this.N(class080802, class071112);
        return (class00500)class005002.y(L, (Comparable)class080803);
    }

    public MapCodec<class06784> N() {
        return y;
    }

    private void N(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112, CallbackInfoReturnable callbackInfoReturnable) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            for (class07504 class075042 : this.N(class072992, class072092, class07504.class, (class07049 class070492) -> MinecartComparatorLogicRegistry.getCustomComparatorLogic((class07078)class070492.method_5864()) != null)) {
                int n = MinecartComparatorLogicRegistry.getCustomComparatorLogic((class07078)class075042.method_5864()).getComparatorValue(class075042, class005002, class072092);
                if (n < 0) continue;
                callbackInfoReturnable.setReturnValue((Object)n);
                break;
            }
        }
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, u, N});
    }

    private void N(class07299 class072992, class07209 class072092, class00500 class005002) {
        class00500 class005003;
        if (!this.a_(class005002, (class05487)class072992, class072092)) {
            return;
        }
        boolean bl = (Boolean)class005002.L((class08092)u);
        boolean bl2 = false;
        if (!this.N(class072992, class072092, class07504.class, (class07049 class070492) -> true).isEmpty()) {
            bl2 = true;
        }
        if (bl2 && !bl) {
            class005003 = (class00500)class005002.y((class08092)u, (Comparable)Boolean.valueOf(true));
            class072992.method_8652(class072092, class005003, 3);
            this.y(class072992, class072092, class005003, true);
            class072992.method_8408(class072092, (class00891)this);
            class072992.method_8408(class072092.method_10074(), (class00891)this);
            class072992.method_16109(class072092, class005002, class005003);
        }
        if (!bl2 && bl) {
            class005003 = (class00500)class005002.y((class08092)u, (Comparable)Boolean.valueOf(false));
            class072992.method_8652(class072092, class005003, 3);
            this.y(class072992, class072092, class005003, false);
            class072992.method_8408(class072092, (class00891)this);
            class072992.method_8408(class072092.method_10074(), (class00891)this);
            class072992.method_16109(class072092, class005002, class005003);
        }
        if (bl2) {
            class072992.N(class072092, (class00891)this, 20);
        }
        class072992.method_8455(class072092, (class00891)this);
    }

    protected int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return (Boolean)class005002.L((class08092)u) != false ? 15 : 0;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!((Boolean)class005002.L((class08092)u)).booleanValue()) {
            return;
        }
        this.N((class07299)class047822, class072092, class005002);
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        if (class072992.method_8608()) {
            return;
        }
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            return;
        }
        this.N(class072992, class072092, class005002);
    }

    private <T extends class07504> List<T> N(class07299 class072992, class07209 class072092, Class<T> clazz, Predicate<class07049> predicate) {
        return class072992.N(clazz, this.N(class072092), predicate);
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072992, class072092, class072112, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            List<class07480> var5 = this.N(class072992, class072092, class07480.class, (class07049 class070492) -> true);
            if (!var5.isEmpty()) {
                return var5.get(0).U().y();
            }
            List<class07504> var6 = this.N(class072992, class072092, class07504.class, class07042.u);
            if (!var6.isEmpty()) {
                return class07482.L((class06695)((class06695)var6.get(0)));
            }
        }
        return 0;
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (class005003.N(class005002.i())) {
            return;
        }
        class00500 class005004 = this.N(class005002, class072992, class072092, bl);
        this.N(class072992, class072092, class005004);
    }

    protected boolean i_(class00500 class005002) {
        return true;
    }
}

