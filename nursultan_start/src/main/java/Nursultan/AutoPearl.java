/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10992
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11223
 *  Nursultan.class11225
 *  Nursultan.class11228
 *  Nursultan.class11281
 *  Nursultan.class11297
 *  Nursultan.class11322
 *  Nursultan.class11371
 *  Nursultan.class11499
 *  Nursultan.class11504
 *  Nursultan.class11505
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11522
 *  Nursultan.class11524
 *  Nursultan.class11534
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11791
 *  Nursultan.class11799
 *  Nursultan.class11907
 *  Nursultan.class11938
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04477
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07438
 *  minecraft.class07488
 *  minecraft.class07843
 */
package Nursultan;

import Nursultan.TargetEsp;
import Nursultan.Trajectory;
import Nursultan.class10992;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11223;
import Nursultan.class11225;
import Nursultan.class11228;
import Nursultan.class11281;
import Nursultan.class11297;
import Nursultan.class11322;
import Nursultan.class11371;
import Nursultan.class11499;
import Nursultan.class11504;
import Nursultan.class11505;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11522;
import Nursultan.class11524;
import Nursultan.class11534;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11791;
import Nursultan.class11799;
import Nursultan.class11907;
import Nursultan.class11938;
import java.util.Comparator;
import java.util.Optional;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04477;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07438;
import minecraft.class07488;
import minecraft.class07843;

@class11080(L="AutoPearl", y=class11072.PLAYER, N=class11106.AUTO)
public class AutoPearl
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public Object L_7;
    public boolean L_init;

    public AutoPearl() {
        this.b();
        this.L_0 = class11524.N((class11512)this, (String)"only-in-pvp", (boolean)false);
        this.L_1 = class11524.N((class11512)this, (String)"target-follow", (boolean)false);
        this.L_2 = class11524.N((class11512)this, (String)"threshold", (float)6.0f, (float)1.0f, (float)8.0f, (float)0.5f);
        this.L_3 = class11524.N((class11512)this, (String)"min-distance", (float)5.0f, (float)5.0f, (float)10.0f, (float)1.0f);
        this.L_4 = new class11228((class11225)class11225.L_2);
    }

    private void b() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_5 = 0;
            this.L_6 = 0;
            this.L_7 = 0;
        }
    }

    private boolean s() {
        this.b();
        if (((Boolean)((class11507)this.L_0).i()).booleanValue() && !class11907.u()) {
            return true;
        }
        if (((class11799)((class03443)((class06202)this.y_0).T_2)).N() < 3) {
            return true;
        }
        return ((class04453)((class06202)this.y_0).T_4).method_6115();
    }

    private Optional<class11499> N(class07049 class070492) {
        this.b();
        Optional var2 = ((class11228)this.L_4).N(class070492, class070492.method_73189(), class070492.method_18798()).N();
        if (var2.isEmpty()) {
            return Optional.empty();
        }
        class06889 class068892 = ((class11223)var2.get()).N();
        if (((class04453)((class06202)this.y_0).T_4).method_73189().R(class068892) <= (double)((Float)((class11504)this.L_3).i()).floatValue()) {
            return Optional.empty();
        }
        float f = class04995.z((float)((Float)((class11504)this.L_2).i()).floatValue());
        class11499 class114992 = class11505.N((class06889)class068892);
        float f2 = class114992.y();
        float f3 = class114992.R();
        class06889 class068893 = ((class04453)((class06202)this.y_0).T_4).method_60478();
        class06889 class068894 = ((class04453)((class06202)this.y_0).T_4).method_33571();
        class11499 class114993 = null;
        double d = Double.MAX_VALUE;
        int n = -1;
        for (int i = 0; i < 180; i += 3) {
            float f4 = (f3 - (float)i - 90.0f) % 180.0f + 90.0f;
            class06889 class068895 = Trajectory.N((class07049)((class04453)((class06202)this.y_0).T_4), class068893, -f4, f2, 0.0f, 1.5f);
            Optional var17 = ((class11228)this.L_4).N(null, class068894, class068895).N();
            if (var17.isEmpty()) continue;
            double d2 = ((class11223)var17.get()).N().M(class068892);
            int n2 = ((class11223)var17.get()).L();
            if (n2 > ((class11223)var2.get()).L() + 100 || !(d2 <= (double)f) || (!(d2 < d) || n != -1 && Math.abs(n2 - n) >= 40) && n2 >= n) continue;
            d = d2;
            n = n2;
            class114993 = new class11499(f2, f4);
        }
        return Optional.ofNullable(class114993);
    }

    @class11782
    public void N(class11371 class113712) {
        class07049 class070492 = class113712.N();
        if (!(class070492 instanceof class07488)) {
            return;
        }
        class07488 class074882 = (class07488)class070492;
        ((class03448)((class06202)this.y_0).T_3).method_18456().stream().min(Comparator.comparingDouble(class044772 -> class044772.method_5707(class074882.method_73189()))).ifPresent(class044772 -> {
            this.b();
            int n = class074882.method_5628();
            if (class044772 == (class04453)((class06202)this.y_0).T_4 || class11791.u().test(class044772)) {
                this.L_5 = n;
            } else if (((Boolean)((class11507)this.L_1).i()).booleanValue()) {
                class07438 class074382;
                TargetEsp targetEsp = class11938.u().r();
                if (targetEsp.m() && (class074382 = targetEsp.P()) instanceof class04477 && (class04477)class074382 == class044772) {
                    this.L_6 = n;
                    this.L_7 = 20;
                }
            } else {
                this.L_6 = n;
                this.L_7 = 20;
            }
        });
    }

    @class11782(y=class11777.AFTER)
    public void N(class10992 class109922) {
        this.b();
        if ((Integer)this.L_6 == -1 || ((Integer)this.L_5).intValue() == ((Integer)this.L_6).intValue()) {
            return;
        }
        class07049 class070492 = ((class03448)((class06202)this.y_0).T_3).method_8469(((Integer)this.L_6).intValue());
        if (!(class070492 instanceof class07488)) {
            this.L_6 = -1;
            return;
        }
        class07488 class074882 = (class07488)class070492;
        if (this.s()) {
            return;
        }
        int n = class11281.L((class06581)class06570.nz).min(Comparator.comparingInt(class112972 -> class112972.N().I() ? 1 : 0)).map(class11297::y).orElse(-1);
        if (class11281.y((int)n) || ((class04453)((class06202)this.y_0).T_4).method_7357().N(class06570.nz.E())) {
            this.L_6 = -1;
            return;
        }
        if ((Integer)this.L_7 <= 0) {
            this.L_6 = -1;
            return;
        }
        Optional<class11499> var5 = this.N((class07049)class074882);
        if (var5.isEmpty()) {
            this.L_7 = (Integer)this.L_7 - 1;
            return;
        }
        class11499 class114992 = var5.get();
        class11499 class114993 = new class11499(class114992.y(), -class114992.R()).N(class11522.staticFields_05ffa7eec8dd73e94b3c68970de658457_0).u(true).N(true);
        class11534.y((class11499)class114993);
        class11938.Z().N(() -> {
            this.b();
            class11534.y((class11499)class114993);
            class11322.N((int)n);
            ((class03443)((class06202)this.y_0).T_2).N((class03448)((class06202)this.y_0).T_3, n -> new class07843(class07050.field_5808, n, class114993.y(), class114993.R()));
            ((class04453)((class06202)this.y_0).T_4).method_6104(class07050.field_5808);
            this.L_6 = -1;
            this.L_7 = 0;
            class11938.Z().y(4, class11322::L);
        });
    }
}

