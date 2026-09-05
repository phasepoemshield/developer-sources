/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10556
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class01217
 *  minecraft.class02329
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05378
 *  minecraft.class07047
 *  minecraft.class07055
 *  minecraft.class07103
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07438
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package minecraft;

import Nursultan.class10556;
import java.util.List;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class01217;
import minecraft.class02329;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05378;
import minecraft.class07047;
import minecraft.class07055;
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07438;
import org.apache.commons.lang3.mutable.MutableInt;

public class class06112
extends class00394 {
    private static final int u = 50;
    private static final int i = 60;
    private static final int R = 60;
    private static final int M = 40;
    private static final int B = 5;
    private static final int Z = 48;
    private static final int m = 32;
    private static final int P = 48;
    private long s;
    public int N;
    public boolean y;
    public class07211 L;
    private List<class07438> T;
    private boolean b;
    private int j;

    public class06112(class07209 class072092, class00500 class005002) {
        super(class00404.field_16413, class072092, class005002);
    }

    public static void y(class07299 class072992, class07209 class072092, class00500 class005002, class06112 class061122) {
        class06112.N(class072992, class072092, class005002, class061122, class06112::N);
    }

    private static void y(class07299 class072992, class07209 class072092, List<class07438> list) {
        MutableInt mutableInt = new MutableInt(16700985);
        int n = (int)list.stream().filter(class074382 -> class072092.method_19769((class00737)class074382.method_73189(), 48.0)).count();
        list.stream().filter(class074382 -> class06112.N(class072092, class074382)).forEach(class074382 -> {
            float f = 1.0f;
            double d = Math.sqrt((class074382.method_23317() - (double)class072092.method_10263()) * (class074382.method_23317() - (double)class072092.method_10263()) + (class074382.method_23321() - (double)class072092.method_10260()) * (class074382.method_23321() - (double)class072092.method_10260()));
            double d2 = (double)((float)class072092.method_10263() + 0.5f) + 1.0 / d * (class074382.method_23317() - (double)class072092.method_10263());
            double d3 = (double)((float)class072092.method_10260() + 0.5f) + 1.0 / d * (class074382.method_23321() - (double)class072092.method_10260());
            int n2 = class04995.N((int)((n - 21) / -2), (int)3, (int)15);
            for (int i = 0; i < n2; ++i) {
                int n3 = mutableInt.addAndGet(5);
                class072992.method_8406((class07126)class02329.N((class07103)class07107.t, (int)n3), d2, (double)((float)class072092.method_10264() + 0.5f), d3, 0.0, 0.0, 0.0);
            }
        });
    }

    private static boolean N(class07209 class072092, class07438 class074382) {
        return class074382.method_5805() && !class074382.method_31481() && class072092.method_19769((class00737)class074382.method_73189(), 48.0) && class074382.method_5864().N(class01217.L);
    }

    private static void N(class07438 class074382) {
        class074382.method_6092(new class07055(class07047.l, 60));
    }

    public boolean N(int n, int n2) {
        if (n == 1) {
            this.N();
            this.j = 0;
            this.L = class07211.N((int)n2);
            this.N = 0;
            this.y = true;
            return true;
        }
        return super.N(n, n2);
    }

    private static void N(class07299 class072992, class07209 class072092, List<class07438> list) {
        list.stream().filter(class074382 -> class06112.N(class072092, class074382)).forEach(class06112::N);
    }

    public void N(class07211 class072112) {
        class07209 class072092 = this.d();
        this.L = class072112;
        if (this.y) {
            this.N = 0;
        } else {
            this.y = true;
        }
        this.z.method_8427(class072092, this.w().i(), 1, class072112.L());
    }

    private void N() {
        class07209 class072092 = this.d();
        if (this.z.N() > this.s + 60L || this.T == null) {
            this.s = this.z.N();
            class00734 class007342 = new class00734(class072092).M(48.0);
            this.T = this.z.N(class07438.class, class007342);
        }
        if (!this.z.method_8608()) {
            for (class07438 class074382 : this.T) {
                if (!class074382.method_5805() || class074382.method_31481() || !class072092.method_19769((class00737)class074382.method_73189(), 32.0)) continue;
                class074382.method_18868().N(class05378.g, (Object)this.z.N());
            }
        }
    }

    private static boolean N(class07209 class072092, List<class07438> list) {
        for (class07438 class074382 : list) {
            if (!class074382.method_5805() || class074382.method_31481() || !class072092.method_19769((class00737)class074382.method_73189(), 32.0) || !class074382.method_5864().N(class01217.L)) continue;
            return true;
        }
        return false;
    }

    private static void N(class07299 class072992, class07209 class072092, class00500 class005002, class06112 class061122, class10556 class105562) {
        if (class061122.y) {
            ++class061122.N;
        }
        if (class061122.N >= 50) {
            class061122.y = false;
            class061122.N = 0;
        }
        if (class061122.N >= 5 && class061122.j == 0 && class06112.N(class072092, class061122.T)) {
            class061122.b = true;
            class072992.method_8396(null, class072092, class04909.LW, class04911.field_15245, 1.0f, 1.0f);
        }
        if (class061122.b) {
            if (class061122.j < 40) {
                ++class061122.j;
            } else {
                class105562.run(class072992, class072092, class061122.T);
                class061122.b = false;
            }
        }
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class06112 class061122) {
        class06112.N(class072992, class072092, class005002, class061122, class06112::y);
    }
}

