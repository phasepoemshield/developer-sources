/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class06942
 *  minecraft.class07101
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06942;
import minecraft.class07101;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;

public class class00900
extends class07101
implements class00873 {
    public static final MapCodec<class00900> N = class00900.y(class00900::new);
    public static final int y = 2;
    public static final class08071 L = class06665.Nt;
    private static final List<Map<class07211, class00494>> u = IntStream.rangeClosed(0, 2).mapToObj(n -> class00389.L((class00494)class00891.y(4 + n * 2, 7 - n * 2, 12.0).method_1096(0.0, 0.0, (double)(n - 5) / 16.0).method_1097())).toList();

    public class00900(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y((class08092)R, (Comparable)class07211.field_11043)).y((class08092)L, (Comparable)Integer.valueOf(0)));
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        int n;
        if (class047822.field_9229.y(5) == 0 && (n = ((Integer)class005002.L((class08092)L)).intValue()) < 2) {
            class047822.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(n + 1)), 2);
        }
    }

    @Override
    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    @Override
    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class047822.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf((Integer)class005002.L((class08092)L) + 1)), 2);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{R, L});
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    public MapCodec<class00900> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return u.get((Integer)class005002.L((class08092)L)).get(class005002.L((class08092)R));
    }

    public @Nullable class00500 N(class06942 class069422) {
        class00500 class005002 = this.W();
        class07299 class072992 = class069422.method_8045();
        class07209 class072092 = class069422.method_8037();
        for (class07211 class072112 : class069422.i()) {
            if (!class072112.z().L() || !(class005002 = (class00500)class005002.y((class08092)R, (Comparable)class072112)).N((class05487)class072992, class072092)) continue;
            return class005002;
        }
        return null;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class005002.L((class08092)R) && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    @Override
    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return (Integer)class005002.L((class08092)L) < 2;
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class054872.method_8320(class072092.method_10093((class07211)class005002.L((class08092)R))).N(class01210.d);
    }

    protected boolean e_(class00500 class005002) {
        return (Integer)class005002.L((class08092)L) < 2;
    }
}

