/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00864
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class07049
 *  minecraft.class07153
 *  minecraft.class07208
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07310
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08400
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00864;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class07049;
import minecraft.class07153;
import minecraft.class07208;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07310;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08400;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06772
extends class00864
implements class00873 {
    public static final MapCodec<class06772> u = class06772.y(class06772::new);
    public static final int i = 7;
    public static final class08071 R = class06665.Nw;
    private static final class00494[] N = class00891.N((int)7, (int n) -> class00891.y((double)16.0, (double)0.0, (double)(2 + n * 2)));
    private static final class00494 y;

    protected class08071 L() {
        return R;
    }

    public class06772(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)this.L(), (Comparable)Integer.valueOf(0)));
    }

    protected class07310 i() {
        return class06570.by;
    }

    public int U(class00500 class005002) {
        return (Integer)class005002.L((class08092)this.L());
    }

    public int u() {
        return 7;
    }

    public void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        float f;
        int n;
        if (class047822.method_22335(class072092, 0) >= 9 && (n = this.U(class005002)) < this.u() && class060692.y((int)(25.0f / (f = class06772.N((class00891)this, (class07290)class047822, class072092))) + 1) == 0) {
            class047822.method_8652(class072092, this.y(n + 1), 2);
        }
    }

    public void y(class07299 class072992, class07209 class072092, class00500 class005002) {
        int n = Math.min(this.u(), this.U(class005002) + this.N(class072992));
        class072992.method_8652(class072092, this.y(n), 2);
    }

    public class00500 y(int n) {
        return (class00500)this.W().y((class08092)this.L(), (Comparable)Integer.valueOf(n));
    }

    public final boolean E(class00500 class005002) {
        return this.U(class005002) >= this.u();
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return !this.E(class005002);
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return new class06584(this.i());
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (DebugSettings.INSTANCE.legacyCropOutlines.isEnabled()) {
            callbackInfoReturnable.setReturnValue((Object)y);
        }
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        this.y((class07299)class047822, class072092, class005002);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{R});
    }

    public int N(class07299 class072992) {
        return class04995.N((class06069)class072992.field_9229, (int)2, (int)5);
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class005002.N(class00869.Lr);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return N[this.U(class005002)];
    }

    public MapCodec<? extends class06772> N() {
        return u;
    }

    protected static boolean N(class05487 class054872, class07209 class072092) {
        return class054872.method_22335(class072092, 0) >= 8;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (class070492 instanceof class07153 && ((Boolean)class047822.method_64395().N(class07305.I)).booleanValue()) {
                class047822.N(class072092, true, class070492);
            }
        }
        super.N(class005002, class072992, class072092, class070492, class084002, bl);
    }

    public static float N(class00891 class008912, class07290 class072902, class07209 class072092) {
        boolean bl;
        class07209 class072093;
        float f = 1.0f;
        class07209 class072094 = class072092.method_10074();
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                float f2 = 0.0f;
                class072093 = class072902.method_8320(class072094.method_10069(i, 0, j));
                if (class072093.N(class00869.Lr)) {
                    f2 = 1.0f;
                    if ((Integer)class072093.L((class08092)class07208.y) > 0) {
                        f2 = 3.0f;
                    }
                }
                if (i != 0 || j != 0) {
                    f2 /= 4.0f;
                }
                f += f2;
            }
        }
        class07209 class072095 = class072092.method_10095();
        class07209 class072096 = class072092.method_10072();
        class07209 class072097 = class072092.method_10067();
        class072093 = class072092.method_10078();
        boolean bl2 = class072902.method_8320(class072097).N(class008912) || class072902.method_8320(class072093).N(class008912);
        boolean bl3 = bl = class072902.method_8320(class072095).N(class008912) || class072902.method_8320(class072096).N(class008912);
        if (bl2 && bl) {
            f /= 2.0f;
        } else if (class072902.method_8320(class072097.method_10095()).N(class008912) || class072902.method_8320(class072093.method_10095()).N(class008912) || class072902.method_8320(class072093.method_10072()).N(class008912) || class072902.method_8320(class072097.method_10072()).N(class008912)) {
            f /= 2.0f;
        }
        return f;
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class06772.N(class054872, class072092) && super.a_(class005002, class054872, class072092);
    }

    protected boolean e_(class00500 class005002) {
        return !this.E(class005002);
    }
}

