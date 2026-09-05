/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00382
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00679
 *  minecraft.class00734
 *  minecraft.class00763
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class03589
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06183
 *  minecraft.class06665
 *  minecraft.class06677
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07190
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import minecraft.class00382;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00679;
import minecraft.class00734;
import minecraft.class00763;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class03589;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06183;
import minecraft.class06665;
import minecraft.class06677;
import minecraft.class06781;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07190;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class06775
extends class06781
implements class07190 {
    public static final MapCodec<class06775> N = class06775.y(class06775::new);
    public static final class08064<class06677> y = class06665.yZ;

    @Override
    protected void L(class07299 class072992, class07209 class072092, class00500 class005002) {
        int n;
        if (class072992.method_8397().y(class072092, (Object)this)) {
            return;
        }
        int n2 = this.i(class072992, class072092, class005002);
        class00394 class003942 = class072992.method_8321(class072092);
        int n3 = n = class003942 instanceof class00382 ? ((class00382)class003942).N() : 0;
        if (n2 != n || ((Boolean)class005002.L((class08092)L)).booleanValue() != this.N(class072992, class072092, class005002)) {
            class00763 class007632 = this.y((class07290)class072992, class072092, class005002) ? class00763.field_9310 : class00763.field_9314;
            class072992.N(class072092, (class00891)this, 2, class007632);
        }
    }

    public class06775(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)R, (Comparable)class07211.field_11043)).y((class08092)L, (Comparable)Boolean.valueOf(false))).y(y, (Comparable)class06677.field_12576));
    }

    private int i(class07299 class072992, class07209 class072092, class00500 class005002) {
        int n = this.y(class072992, class072092, class005002);
        if (n == 0) {
            return 0;
        }
        int n2 = this.N((class03589)class072992, class072092, class005002);
        if (n2 > n) {
            return 0;
        }
        if (class005002.L(y) == class06677.field_12578) {
            return n - n2;
        }
        return n;
    }

    @Override
    protected int U(class00500 class005002) {
        return 2;
    }

    @Override
    protected int y(class07299 class072992, class07209 class072092, class00500 class005002) {
        int n = super.y(class072992, class072092, class005002);
        class07211 class072112 = (class07211)class005002.L((class08092)R);
        class07209 class072093 = class072092.method_10093(class072112);
        class00500 class005003 = class072992.method_8320(class072093);
        if (class005003.v()) {
            n = class005003.N(class072992, class072093, class072112.b());
        } else if (n < 15 && class005003.u((class07290)class072992, class072093)) {
            class072093 = class072093.method_10093(class072112);
            class005003 = class072992.method_8320(class072093);
            class00679 class006792 = this.N(class072992, class072112, class072093);
            int n2 = Math.max(class006792 == null ? Integer.MIN_VALUE : class006792.m(), class005003.v() ? class005003.N(class072992, class072093, class072112.b()) : Integer.MIN_VALUE);
            if (n2 != Integer.MIN_VALUE) {
                n = n2;
            }
        }
        return n;
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class00382(class072092, class005002);
    }

    protected boolean N(class00500 class005002, class07299 class072992, class07209 class072092, int n, int n2) {
        super.N(class005002, class072992, class072092, n, n2);
        class00394 class003942 = class072992.method_8321(class072092);
        return class003942 != null && class003942.N(n, n2);
    }

    @Override
    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        this.R((class07299)class047822, class072092, class005002);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{R, y, L});
    }

    public MapCodec<class06775> N() {
        return N;
    }

    @Override
    protected int N(class07290 class072902, class07209 class072092, class00500 class005002) {
        class00394 class003942 = class072902.method_8321(class072092);
        if (class003942 instanceof class00382) {
            return ((class00382)class003942).N();
        }
        return 0;
    }

    public class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11033 && !this.N(class054872, class072093, class005003)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    private @Nullable class00679 N(class07299 class072992, class07211 class072112, class07209 class072092) {
        List var4 = class072992.N(class00679.class, new class00734((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), (double)(class072092.method_10263() + 1), (double)(class072092.method_10264() + 1), (double)(class072092.method_10260() + 1)), class006792 -> class006792.method_5735() == class072112);
        if (var4.size() == 1) {
            return (class00679)var4.get(0);
        }
        return null;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (!class080362.method_31549().i) {
            return class07082.i;
        }
        float f = (class005002 = (class00500)class005002.N(y)).L(y) == class06677.field_12578 ? 0.55f : 0.5f;
        class072992.method_8396((class07049)class080362, class072092, class04909.RA, class04911.field_15245, 0.3f, f);
        class072992.method_8652(class072092, class005002, 2);
        this.R(class072992, class072092, class005002);
        return class07082.N;
    }

    @Override
    protected boolean N(class07299 class072992, class07209 class072092, class00500 class005002) {
        int n = this.y(class072992, class072092, class005002);
        if (n == 0) {
            return false;
        }
        int n2 = this.N((class03589)class072992, class072092, class005002);
        if (n > n2) {
            return true;
        }
        return n == n2 && class005002.L(y) == class06677.field_12576;
    }

    private void R(class07299 class072992, class07209 class072092, class00500 class005002) {
        int n = this.i(class072992, class072092, class005002);
        class00394 class003942 = class072992.method_8321(class072092);
        int n2 = 0;
        if (class003942 instanceof class00382) {
            class00382 class003822 = (class00382)class003942;
            n2 = class003822.N();
            class003822.N(n);
        }
        if (n2 != n || class005002.L(y) == class06677.field_12576) {
            boolean bl = this.N(class072992, class072092, class005002);
            boolean bl2 = (Boolean)class005002.L((class08092)L);
            if (bl2 && !bl) {
                class072992.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(false)), 2);
            } else if (!bl2 && bl) {
                class072992.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(true)), 2);
            }
            this.u(class072992, class072092, class005002);
        }
    }
}

