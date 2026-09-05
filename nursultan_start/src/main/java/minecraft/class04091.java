/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class03707
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class07013
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class03707;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class07013;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class04091
extends class07013
implements class06084 {
    public static final MapCodec<class04091> u = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03707.N.fieldOf("tree").forGetter(class040912 -> class040912.L), (App)class04091.t()).apply(instance, class04091::new));
    public static final class08071 i = class06665.Nl;
    public static final int R = 4;
    private static final int[] B = new int[]{13, 10, 7, 3, 0};
    private static final class00494[] Z = class00891.N((int)4, n -> class00891.y((double)2.0, (double)B[n], (double)16.0));
    private static final class06667 O = class06665.q;
    public static final class06667 M = class06665.W;

    public static class00500 L() {
        return class04091.y(0);
    }

    private static boolean T(class00500 class005002) {
        return (Integer)class005002.L((class08092)i) == 4;
    }

    public class04091(class03707 class037072, class01362 class013622) {
        super(class037072, class013622);
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Integer.valueOf(0))).y((class08092)i, (Comparable)Integer.valueOf(0))).y((class08092)O, (Comparable)Boolean.valueOf(false))).y((class08092)M, (Comparable)Boolean.valueOf(false)));
    }

    private static boolean U(class00500 class005002) {
        return (Boolean)class005002.L((class08092)M);
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)O)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!class04091.U(class005002)) {
            if (class060692.y(7) == 0) {
                this.N(class047822, class072092, class005002, class060692);
            }
            return;
        }
        if (!class04091.T(class005002)) {
            class047822.method_8652(class072092, (class00500)class005002.N((class08092)i), 2);
        }
    }

    public static class00500 y(int n) {
        return (class00500)((class00500)class00869.o.W().y((class08092)M, (Comparable)Boolean.valueOf(true))).y((class08092)i, (Comparable)Integer.valueOf(n));
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        if (class04091.U(class005002) && !class04091.T(class005002)) {
            class047822.method_8652(class072092, (class00500)class005002.N((class08092)i), 2);
        } else {
            super.N(class047822, class060692, class072092, class005002);
        }
    }

    public MapCodec<class04091> N() {
        return u;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        int n = (Boolean)class005002.L((class08092)M) != false ? (Integer)class005002.L((class08092)i) : 4;
        return Z[n].method_64034(class005002.N(class072092));
    }

    public @Nullable class00500 N(class06942 class069422) {
        boolean bl = class069422.method_8045().method_8316(class069422.method_8037()).N() == class04684.L;
        return (class00500)((class00500)super.N(class069422).y((class08092)O, (Comparable)Boolean.valueOf(bl))).y((class08092)i, (Comparable)Integer.valueOf(4));
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return super.N(class005002, class072902, class072092) || class005002.N(class00869.in);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y}).N(new class08092[]{i}).N(new class08092[]{O}).N(new class08092[]{M});
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return class04091.U(class005002) ? !class04091.T(class005002) : super.N(class072992, class060692, class072092, class005002);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)O)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        if (class072112 == class07211.field_11036 && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return !class04091.U(class005002) || !class04091.T(class005002);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        if (class04091.U(class005002)) {
            return class054872.method_8320(class072092.method_10084()).N(class00869.NA);
        }
        return super.a_(class005002, class054872, class072092);
    }
}

