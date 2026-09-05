/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09343
 *  Nursultan.class10961
 *  Nursultan.class10963
 *  Nursultan.class10965
 *  Nursultan.class10990
 *  Nursultan.class10992
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11109
 *  Nursultan.class11116
 *  Nursultan.class11140
 *  Nursultan.class11150
 *  Nursultan.class11275
 *  Nursultan.class11303
 *  Nursultan.class11331
 *  Nursultan.class11363
 *  Nursultan.class11385
 *  Nursultan.class11402
 *  Nursultan.class11502
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11516
 *  Nursultan.class11517
 *  Nursultan.class11519
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  Nursultan.class11807
 *  Nursultan.class11906
 *  Nursultan.class11909
 *  Nursultan.class11910
 *  Nursultan.class11921
 *  Nursultan.class11924
 *  Nursultan.class11938
 *  minecraft.class03448
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06584
 */
package Nursultan;

import Nursultan.class09343;
import Nursultan.class10961;
import Nursultan.class10963;
import Nursultan.class10965;
import Nursultan.class10990;
import Nursultan.class10992;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11109;
import Nursultan.class11116;
import Nursultan.class11140;
import Nursultan.class11150;
import Nursultan.class11275;
import Nursultan.class11303;
import Nursultan.class11331;
import Nursultan.class11363;
import Nursultan.class11385;
import Nursultan.class11402;
import Nursultan.class11502;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11516;
import Nursultan.class11517;
import Nursultan.class11519;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11782;
import Nursultan.class11807;
import Nursultan.class11906;
import Nursultan.class11909;
import Nursultan.class11910;
import Nursultan.class11921;
import Nursultan.class11924;
import Nursultan.class11938;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import minecraft.class03448;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06584;

@class11080(L="AutoBuy", y=class11072.MISC, N=class11106.BASE)
public class AutoBuy
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public Object L_7;

    private void T() {
    }

    public AutoBuy() {
        this.T();
        this.L_0 = new class11275();
        this.L_1 = new class11331();
        this.L_2 = new class11109();
        this.L_3 = new class11116((class11275)this.L_0, this, "buyer", true, this::y);
        this.L_4 = new class11150((class11331)this.L_1, this, "checker", false, this::N);
        this.L_5 = class11524.N((class11512)this, (String)"mode", (class11535[])new class11807[]{(class11116)this.L_3, (class11150)this.L_4});
        this.L_6 = class11524.N((class11512)this, (String)"decrease-prices", (float)40.0f, (float)0.0f, (float)90.0f, (float)1.0f).N((Supplier)class11502.N_0);
        this.L_7 = class11524.N((class11512)this, (String)"auto-parser", this::n);
    }

    public boolean Z() {
        this.T();
        if ((class03448)((class06202)this.y_0).T_3 != null) {
            if (((class11150)this.L_4).U()) {
                ((class11331)this.L_1).L();
            } else if (((class11116)this.L_3).U() && !((class11275)this.L_0).N()) {
                ((class11275)this.L_0).y();
            }
            return super.Z();
        }
        return false;
    }

    public boolean i() {
        this.T();
        ((class11109)this.L_2).N();
        if (((class11150)this.L_4).U() && !((class11331)this.L_1).y()) {
            ((class11331)this.L_1).u();
        } else if (((class11116)this.L_3).U() && ((class11275)this.L_0).N()) {
            ((class11275)this.L_0).i();
        }
        ((class11150)this.L_4).N();
        return super.i();
    }

    private double s() {
        this.T();
        return (double)((Float)((class11504)this.L_6).i()).floatValue() / 100.0;
    }

    private void n() {
        this.T();
        if (((class11116)this.L_3).U() && ((class11275)this.L_0).N() && ((class11275)this.L_0).L() || ((class11150)this.L_4).U() && ((class11331)this.L_1).N().get()) {
            return;
        }
        List var1 = class11938.n().y().values().stream().filter(class118822 -> class118822.M() && (Boolean)class118822.u().i() != false).toList();
        ((class11109)this.L_2).N((Collection)var1, longStream -> class11140.N((LongStream)longStream, (double)this.s())).thenAccept(void_ -> {
            class11303.y((Object)class11921.N((String)"auto-parser.complete").N(class06541.field_1080));
            class11519.y(class11516.class);
        });
    }

    public void m() {
        int n = class11910.M();
        if (n == -1) {
            return;
        }
        int[] nArray = class11924.N().filter(class119062 -> class119062.y() == class11909.staticFields_0d98e95695d6732fd9192964e161ca232_1).mapToInt(class11906::u).toArray();
        for (int i = 0; i < nArray.length; ++i) {
            int n2 = nArray[i];
            if (n != n2) continue;
            class11910.N((String)("/an" + nArray[(i + 1) % nArray.length]));
            break;
        }
    }

    private void y(class11535 class115352) {
        this.T();
        ((class11116)class115352).N();
        if (!class115352.U()) {
            ((class11275)this.L_0).i();
            return;
        }
        if (this.U()) {
            ((class11275)this.L_0).y();
        }
    }

    @class11782
    public void N(class10992 class109922) {
        this.T();
        ((class11109)this.L_2).y((Object)class109922);
        ((class11807)((class11517)this.L_5).i()).y((Object)class109922);
    }

    @class11782
    public void N(class10990 class109902) {
        this.T();
        ((class11109)this.L_2).y((Object)class109902.u());
    }

    @class11782
    public void N(class10963 class109632) {
        this.T();
        ((class11807)((class11517)this.L_5).i()).y((Object)class109632);
    }

    private void N(class11535 class115352) {
        this.T();
        ((class11150)class115352).N();
        if (!class115352.U()) {
            ((class11331)this.L_1).u();
            return;
        }
        if (this.U()) {
            ((class11331)this.L_1).L();
        }
    }

    @class11782
    public void N(class11385 class113852) {
        this.T();
        if ((class05096)((class06202)this.y_0).v_3 == null) {
            return;
        }
        if (((class11150)this.L_4).U() && ((class11331)this.L_1).y() || ((class11116)this.L_3).U() && !((class11275)this.L_0).N()) {
            return;
        }
        class113852.M(false);
        class113852.i(false);
        class113852.L(false);
        class113852.R(false);
        class113852.B(false);
        class113852.u(false);
    }

    @class11782
    public void N(class10961 class109612) {
        this.T();
        ((class11807)((class11517)this.L_5).i()).y((Object)class109612);
    }

    @class11782
    public void N(class09343 class093432) {
        this.T();
        ((class11109)this.L_2).y((Object)class093432);
    }

    @class11782
    public void N(class10965 class109652) {
        this.T();
        ((class11807)((class11517)this.L_5).i()).y((Object)class109652);
    }

    @class11782
    public void N(class11402 class114022) {
        this.T();
        ((class11807)((class11517)this.L_5).i()).y((Object)class114022);
    }

    @class11782
    public void N(class11363 class113632) {
        this.T();
        ((class11807)((class11517)this.L_5).i()).y((Object)class113632);
    }

    public static int N(class06584 class065842, long l) {
        return Objects.hash(class065842.Y().getString(), class065842.B().z(), l);
    }
}

