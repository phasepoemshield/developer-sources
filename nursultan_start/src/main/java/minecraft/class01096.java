/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00801
 *  minecraft.class00865
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01362
 *  minecraft.class03556
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04782
 *  minecraft.class04823
 *  minecraft.class04835
 *  minecraft.class05476
 *  minecraft.class06665
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07536
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08397
 *  minecraft.class08400
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00801;
import minecraft.class00865;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01362;
import minecraft.class03556;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04782;
import minecraft.class04823;
import minecraft.class04835;
import minecraft.class05476;
import minecraft.class06665;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07536;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08397;
import minecraft.class08400;

public class class01096
extends class00865 {
    public static final MapCodec<class01096> u = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00801.field_46251.fieldOf("precipitation").forGetter(class010962 -> class010962.F), (App)class04823.y.fieldOf("interactions").forGetter(class010962 -> class010962.L), (App)class01096.t()).apply(instance, class01096::new));
    public static final int i = 1;
    public static final int R = 3;
    public static final class08071 M = class06665.NX;
    private static final int B = 6;
    private static final double Z = 3.0;
    private static final class00494[] O = (class00494[])class07536.N(() -> class00891.N((int)2, n -> class00389.N((class00494)class00865.y, (class00494)class00891.y((double)12.0, (double)4.0, (double)class01096.y(n + 1)))));
    private final class00801 F;

    public static void L(class00500 class005002, class07299 class072992, class07209 class072092) {
        int n = (Integer)class005002.L((class08092)M) - 1;
        class00500 class005003 = n == 0 ? class00869.MZ.W() : (class00500)class005002.y((class08092)M, (Comparable)Integer.valueOf(n));
        class072992.method_8501(class072092, class005003);
        class072992.N((class03556)class01194.L, class072092, class01164.N((class00500)class005003));
    }

    public class01096(class00801 class008012, class04835 class048352, class01362 class013622) {
        super(class013622, class048352);
        this.F = class008012;
        this.P((class00500)((class00500)this.Q.y()).y((class08092)M, (Comparable)Integer.valueOf(1)));
    }

    protected double U(class00500 class005002) {
        return class01096.y((Integer)class005002.L((class08092)M)) / 16.0;
    }

    private void u(class00500 class005002, class07299 class072992, class07209 class072092) {
        if (this.F == class00801.field_9383) {
            class01096.L((class00500)class00869.Mz.W().y((class08092)M, (Comparable)((Integer)class005002.L((class08092)M))), class072992, class072092);
        } else {
            class01096.L(class005002, class072992, class072092);
        }
    }

    private static double y(int n) {
        return 6.0 + (double)n * 3.0;
    }

    public boolean E(class00500 class005002) {
        return (Integer)class005002.L((class08092)M) == 3;
    }

    public MapCodec<class01096> N() {
        return u;
    }

    public void N_4(class00500 class005002, class07299 class072992, class07209 class072092, class00801 class008012) {
        if (!class05476.N((class07299)class072992, (class00801)class008012) || (Integer)class005002.L((class08092)M) == 3 || class008012 != this.F) {
            return;
        }
        class00500 class005003 = (class00500)class005002.N((class08092)M);
        class072992.method_8501(class072092, class005003);
        class072992.N((class03556)class01194.L, class072092, class01164.N((class00500)class005003));
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070493, class08400 class084002, boolean bl) {
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class07209 class072093 = class072092.method_10062();
            class084002.N(class08397.field_56645, class070492 -> {
                if (class070492.method_5809() && class070492.method_36971(class047822, class072093)) {
                    this.u(class005002, class072992, class072093);
                }
            });
        }
        class084002.N(class08397.field_56645);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class07049 class070492) {
        return O[(Integer)class005002.L((class08092)M) - 1];
    }

    protected boolean N(class04651 class046512) {
        return class046512 == class04684.L && this.F == class00801.field_9382;
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        return (Integer)class005002.L((class08092)M);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{M});
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class04651 class046512) {
        if (this.E(class005002)) {
            return;
        }
        class00500 class005003 = (class00500)class005002.y((class08092)M, (Comparable)Integer.valueOf((Integer)class005002.L((class08092)M) + 1));
        class072992.method_8501(class072092, class005003);
        class072992.N((class03556)class01194.L, class072092, class01164.N((class00500)class005003));
        class072992.N(1047, class072092, 0);
    }
}

