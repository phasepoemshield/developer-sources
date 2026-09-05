/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00763
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01020
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class02752
 *  minecraft.class03589
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06884
 *  minecraft.class06942
 *  minecraft.class07101
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08092
 *  net.caffeinemc.mods.lithium.common.block.entity.inventory_comparator_tracking.ComparatorTracking
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00763;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01020;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class02752;
import minecraft.class03589;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06775;
import minecraft.class06884;
import minecraft.class06942;
import minecraft.class07101;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08092;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_comparator_tracking.ComparatorTracking;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class06781
extends class07101 {
    public static final class06667 L = class06665.k;
    private static final class00494 N = class00891.y((double)16.0, (double)0.0, (double)2.0);

    protected void L(class07299 class072992, class07209 class072092, class00500 class005002) {
        boolean bl;
        if (this.y((class05487)class072992, class072092, class005002)) {
            return;
        }
        boolean bl2 = (Boolean)class005002.L((class08092)L);
        if (bl2 != (bl = this.N(class072992, class072092, class005002)) && !class072992.method_8397().y(class072092, (Object)this)) {
            class00763 class007632 = class00763.field_9310;
            if (this.y((class07290)class072992, class072092, class005002)) {
                class007632 = class00763.field_9315;
            } else if (bl2) {
                class007632 = class00763.field_9313;
            }
            class072992.N(class072092, (class00891)this, this.U(class005002), class007632);
        }
    }

    public class06781(class01362 class013622) {
        super(class013622);
    }

    protected abstract int U(class00500 var1);

    protected void u(class07299 class072992, class07209 class072092, class00500 class005002) {
        class07211 class072112 = (class07211)class005002.L((class08092)R);
        class07209 class072093 = class072092.method_10093(class072112.b());
        class02733 class027332 = class02752.N((class07299)class072992, (class07211)class072112.b(), (class07211)class07211.field_11036);
        class072992.method_8492(class072093, (class00891)this, class027332);
        class072992.method_8508(class072093, (class00891)this, class072112, class027332);
    }

    public boolean y(class05487 class054872, class07209 class072092, class00500 class005002) {
        return false;
    }

    public int y(class07299 class072992, class07209 class072092, class00500 class005002) {
        class07211 class072112 = (class07211)class005002.L((class08092)R);
        class07209 class072093 = class072092.method_10093(class072112);
        int n = class072992.u(class072093, class072112);
        if (n >= 15) {
            return n;
        }
        class00500 class005003 = class072992.method_8320(class072093);
        return Math.max(n, class005003.N(class00869.Lf) ? (Integer)class005003.L((class08092)class06884.R) : 0);
    }

    protected boolean y() {
        return false;
    }

    public boolean y(class07290 class072902, class07209 class072092, class00500 class005002) {
        class07211 class072112 = ((class07211)class005002.L((class08092)R)).b();
        class00500 class005003 = class072902.method_8320(class072092.method_10093(class072112));
        return class06781.E(class005003) && class005003.L((class08092)R) != class072112;
    }

    protected int y(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return class005002.N(class072902, class072092, class072112);
    }

    public static boolean E(class00500 class005002) {
        return class005002.i() instanceof class06781;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        if (!bl) {
            this.u((class07299)class047822, class072092, class005002);
        }
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        this.u(class072992, class072092, class005002);
        this.N(class005002, class072992, class072092, class005003, bl, null);
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class07438 class074382, class06584 class065842) {
        if (this.N(class072992, class072092, class005002)) {
            class072992.N(class072092, (class00891)this, 1);
        }
    }

    private void N(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl, CallbackInfo callbackInfo) {
        if (this instanceof class06775 && !class005003.N(class00869.Ba)) {
            ComparatorTracking.notifyNearbyBlockEntitiesAboutNewComparator((class07299)class072992, (class07209)class072092);
        }
    }

    protected int N(class07290 class072902, class07209 class072092, class00500 class005002) {
        return 15;
    }

    protected int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (!((Boolean)class005002.L((class08092)L)).booleanValue()) {
            return 0;
        }
        if (class005002.L((class08092)R) == class072112) {
            return this.N(class072902, class072092, class005002);
        }
        return 0;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (this.y((class05487)class047822, class072092, class005002)) {
            return;
        }
        boolean bl = (Boolean)class005002.L((class08092)L);
        boolean bl2 = this.N((class07299)class047822, class072092, class005002);
        if (bl && !bl2) {
            class047822.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(false)), 2);
        } else if (!bl) {
            class047822.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(true)), 2);
            if (!bl2) {
                class047822.N(class072092, (class00891)this, this.U(class005002), class00763.field_9313);
            }
        }
    }

    protected boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class005002.N((class07290)class054872, class072092, class07211.field_11036, class01020.field_25824);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return N;
    }

    protected abstract MapCodec<? extends class06781> N();

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y((class08092)R, (Comparable)class069422.method_8042().b());
    }

    protected int N(class03589 class035892, class07209 class072092, class00500 class005002) {
        class07211 class072112 = (class07211)class005002.L((class08092)R);
        class07211 class072113 = class072112.R();
        class07211 class072114 = class072112.M();
        boolean bl = this.y();
        return Math.max(class035892.N(class072092.method_10093(class072113), class072113, bl), class035892.N(class072092.method_10093(class072114), class072114, bl));
    }

    protected boolean N(class07299 class072992, class07209 class072092, class00500 class005002) {
        return this.y(class072992, class072092, class005002) > 0;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        if (class005002.N((class05487)class072992, class072092)) {
            this.L(class072992, class072092, class005002);
            return;
        }
        class00394 class003942 = class005002.k() ? class072992.method_8321(class072092) : null;
        class06781.N((class00500)class005002, (class07284)class072992, (class07209)class072092, (class00394)class003942);
        class072992.method_8650(class072092, false);
        for (class07211 class072112 : class07211.values()) {
            class072992.method_8408(class072092.method_10093(class072112), (class00891)this);
        }
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10074();
        return this.N(class054872, class072093, class054872.method_8320(class072093));
    }

    protected boolean i_(class00500 class005002) {
        return true;
    }
}

