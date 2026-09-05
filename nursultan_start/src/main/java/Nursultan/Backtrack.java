/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09321
 *  Nursultan.class09343
 *  Nursultan.class10990
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11074
 *  Nursultan.class11080
 *  Nursultan.class11099
 *  Nursultan.class11106
 *  Nursultan.class11380
 *  Nursultan.class11382
 *  Nursultan.class11502
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11515
 *  Nursultan.class11524
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11791
 *  minecraft.class00269
 *  minecraft.class00381
 *  minecraft.class00475
 *  minecraft.class00495
 *  minecraft.class00501
 *  minecraft.class00516
 *  minecraft.class00638
 *  minecraft.class01785
 *  minecraft.class01938
 *  minecraft.class02046
 *  minecraft.class02459
 *  minecraft.class02565
 *  minecraft.class03053
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04459
 *  minecraft.class04464
 *  minecraft.class06202
 *  minecraft.class06642
 *  minecraft.class06644
 *  minecraft.class06652
 *  minecraft.class06663
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07232
 *  minecraft.class07268
 *  minecraft.class07280
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08049
 *  minecraft.class08062
 *  minecraft.class08073
 *  minecraft.class08090
 *  minecraft.class08091
 *  minecraft.class08095
 */
package Nursultan;

import Nursultan.class09321;
import Nursultan.class09343;
import Nursultan.class10990;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11074;
import Nursultan.class11080;
import Nursultan.class11099;
import Nursultan.class11106;
import Nursultan.class11380;
import Nursultan.class11382;
import Nursultan.class11502;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11515;
import Nursultan.class11524;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11791;
import java.util.LinkedList;
import java.util.function.Supplier;
import minecraft.class00269;
import minecraft.class00381;
import minecraft.class00475;
import minecraft.class00495;
import minecraft.class00501;
import minecraft.class00516;
import minecraft.class00638;
import minecraft.class01785;
import minecraft.class01938;
import minecraft.class02046;
import minecraft.class02459;
import minecraft.class02565;
import minecraft.class03053;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04459;
import minecraft.class04464;
import minecraft.class06202;
import minecraft.class06642;
import minecraft.class06644;
import minecraft.class06652;
import minecraft.class06663;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07232;
import minecraft.class07268;
import minecraft.class07280;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08049;
import minecraft.class08062;
import minecraft.class08073;
import minecraft.class08090;
import minecraft.class08091;
import minecraft.class08095;

@class11080(L="Backtrack", y=class11072.COMBAT, N=class11106.TOOLS)
public class Backtrack
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
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public static Object i_0;
    public static Object i_1;
    public Object R_0;
    public Object R_1;
    public Object R_2;

    private void L(class00381<?> class003812) {
        class07049 class070492;
        class07049 class070493;
        class00269 class002692;
        this.d();
        if (class003812 instanceof class00269 && (class002692 = (class00269)class003812).N() == ((Integer)this.L_0).intValue()) {
            this.L_5 = class002692.y().N();
            this.L_7 = Float.valueOf(class002692.y().L());
            this.L_6 = Float.valueOf(class002692.y().u());
            return;
        }
        if (class003812 instanceof class06644 && (class070493 = (class002692 = (class06644)class003812).N((class07299)((class03448)((class06202)this.y_0).T_3))) instanceof class07049 && (class070492 = class070493).method_5628() == ((Integer)this.L_0).intValue()) {
            this.L_7 = Float.valueOf(class002692.N());
            return;
        }
        if (!(class003812 instanceof class00475) || !((class070493 = (class002692 = (class00475)class003812).N((class07299)((class03448)((class06202)this.y_0).T_3))) instanceof class07049) || (class070492 = class070493).method_5628() != ((Integer)this.L_0).intValue()) {
            return;
        }
        if (class002692.B()) {
            this.L_7 = Float.valueOf(class002692.u());
            this.L_6 = Float.valueOf(class002692.M());
        }
        if (class002692.Z()) {
            class070493 = (class06889)this.L_5 != null ? (class06889)this.L_5 : class070492.method_43389().N();
            this.L_5 = class070493.y((double)class002692.N() / 4096.0, (double)class002692.y() / 4096.0, (double)class002692.L() / 4096.0);
        }
    }

    private boolean T() {
        class07049 class070492;
        this.d();
        if ((class06889)this.L_5 == null || !((class070492 = ((class03448)((class06202)this.y_0).T_3).method_8469(((Integer)this.L_0).intValue())) instanceof class07049)) {
            return false;
        }
        class07049 class070493 = class070492;
        class070492 = ((class04453)((class06202)this.y_0).T_4).method_73189();
        return ((class06889)this.L_5).M((class06889)class070492) < class070493.method_73189().M((class06889)class070492);
    }

    public Backtrack() {
        this.d();
        this.u_0 = class11524.N((class11512)this, (String)"distance", (float)4.0f, (float)3.0f, (float)10.0f, (float)0.1f);
        this.u_1 = class11524.N((class11512)this, (String)"delay", (float)4.0f, (float)1.0f, (float)20.0f, (float)1.0f).N((Supplier)class11502.N_3);
        this.u_2 = class11524.N((class11512)this, (String)"hold-after-attack", (float)10.0f, (float)0.0f, (float)20.0f, (float)1.0f).N((Supplier)class11502.N_3);
        this.R_0 = class11524.N((class11512)this, (String)"color", (int)-1258337204);
        this.R_1 = new LinkedList();
        this.R_2 = new class11074();
        this.L_0 = -1;
    }

    static {
        Backtrack.G();
    }

    private boolean i(class00381<?> class003812) {
        return class003812 instanceof class04459 || class003812 instanceof class04464 || class003812 instanceof class02046 || class003812 instanceof class02459 || class003812 instanceof class03053 || class003812 instanceof class07232 || class003812 instanceof class08073 || class003812 instanceof class08062 || class003812 instanceof class08090 || class003812 instanceof class00495 || class003812 instanceof class00516 || class003812 instanceof class07268 || class003812 instanceof class01938 || class003812 instanceof class08095 || class003812 instanceof class02565 || class003812 instanceof class08091 || class003812 instanceof class08049 || class003812 instanceof class01785 || class003812 instanceof class06642 || class003812 instanceof class00501 || class003812 instanceof class06663;
    }

    private void n() {
        class07438 class074382;
        class07049 class070492;
        this.d();
        if ((class03448)((class06202)this.y_0).T_3 == null || !((class070492 = ((class03448)((class06202)this.y_0).T_3).method_8469(((Integer)this.L_0).intValue())) instanceof class07438) || !(class074382 = (class07438)class070492).method_5805()) {
            return;
        }
        this.L_5 = class074382.method_43389().N();
        this.L_6 = Float.valueOf(class074382.method_36455());
        this.L_7 = Float.valueOf(class074382.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue());
        ((class11074)this.R_2).N(class074382, (class06889)this.L_5);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean l() {
        this.d();
        LinkedList linkedList = (LinkedList)this.R_1;
        synchronized (linkedList) {
            return !((LinkedList)this.R_1).isEmpty();
        }
    }

    private void d() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = 0;
            this.L_1 = 0;
            this.L_2 = 0;
            this.L_3 = false;
            this.L_4 = false;
            this.L_6 = Float.valueOf(0.0f);
            this.L_7 = Float.valueOf(0.0f);
        }
    }

    private boolean m() {
        this.d();
        if ((class03448)((class06202)this.y_0).T_3 == null || (class04453)((class06202)this.y_0).T_4 == null || (Integer)this.L_0 == -1 || (class06889)this.L_5 == null) {
            return false;
        }
        class07049 class070492 = ((class03448)((class06202)this.y_0).T_3).method_8469(((Integer)this.L_0).intValue());
        if (!(class070492 instanceof class07438) || !((class07438)class070492).method_5805()) {
            return false;
        }
        return ((class06889)this.L_5).R(((class04453)((class06202)this.y_0).T_4).method_73189()) <= (double)((Float)((class11504)this.u_0).i()).floatValue();
    }

    private boolean u(class00381<?> class003812) {
        if (class003812 instanceof class00501 || class003812 instanceof class06663) {
            return true;
        }
        return class003812 instanceof class08095 && ((class08095)class003812).N() <= 0.0f;
    }

    public void y() {
        this.d();
        this.L_0 = -1;
        this.L_1 = 0;
        this.L_2 = 0;
        this.L_3 = false;
        this.L_4 = false;
        this.L_5 = null;
        ((class11074)this.R_2).N();
        this.y(true);
        super.y();
    }

    private void y(boolean bl) {
        ((class06202)this.y_0).execute(() -> {
            this.d();
            if (((class06202)this.y_0).NE() == null) {
                return;
            }
            LinkedList linkedList = (LinkedList)this.R_1;
            synchronized (linkedList) {
                long l = System.currentTimeMillis();
                long l2 = ((Float)((class11504)this.u_1).i()).longValue() * 50L;
                ((LinkedList)this.R_1).removeIf(class110992 -> {
                    if (!bl && l - class110992.N() < l2) {
                        return false;
                    }
                    try {
                        this.y(class110992.y());
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    return true;
                });
            }
        });
    }

    private void y(class00381<?> class003812) {
        class003812.method_65081((class00638)((class06202)this.y_0).NE());
    }

    @class11782
    public void N(class11382 class113822) {
        this.d();
        class07049 class070492 = class113822.L();
        if (!(class070492 instanceof class07438)) {
            return;
        }
        class07438 class074382 = (class07438)class070492;
        if (class11791.u().test(class074382)) {
            return;
        }
        this.L_2 = ((Float)((class11504)this.u_2).i()).intValue();
        if (class074382.method_5628() == ((Integer)this.L_0).intValue()) {
            return;
        }
        this.L_0 = class074382.method_5628();
        if ((class06889)this.L_5 != null) {
            return;
        }
        this.L_5 = class074382.method_43389().N();
        this.L_6 = Float.valueOf(class074382.method_36455());
        this.L_7 = Float.valueOf(class074382.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue());
        this.L_4 = false;
        ((class11074)this.R_2).N();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @class11782
    public void N(class09343 class093432) {
        this.d();
        this.L_0 = -1;
        this.L_1 = 0;
        this.L_2 = 0;
        this.L_3 = false;
        this.L_4 = false;
        this.L_5 = null;
        ((class11074)this.R_2).N();
        LinkedList linkedList = (LinkedList)this.R_1;
        synchronized (linkedList) {
            ((LinkedList)this.R_1).clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @class11782(y=class11777.AFTER_ALL, u=true)
    public void N(class10990 class109902) {
        Object object;
        this.d();
        if ((class03448)((class06202)this.y_0).T_3 == null || (class04453)((class06202)this.y_0).T_4 == null || (Integer)this.L_0 == -1 || (Integer)this.L_1 > 0) {
            return;
        }
        if (!(class109902.L().method_10744() instanceof class07280)) {
            return;
        }
        class00381 var2 = class109902.u();
        if (this.i(var2)) {
            if (this.u(var2)) {
                this.L_3 = true;
            }
            return;
        }
        if (var2 instanceof class06652) {
            object = (class06652)var2;
            if ((class04453)((class06202)this.y_0).T_4 != null && ((class04453)((class06202)this.y_0).T_4).method_5628() == object.N()) {
                this.L_2 = ((Float)((class11504)this.u_2).i()).intValue();
            }
        }
        object = (LinkedList)this.R_1;
        synchronized (object) {
            class109902.N();
            ((LinkedList)this.R_1).add(new class11099(var2, System.currentTimeMillis()));
        }
        if (!((Boolean)this.L_4).booleanValue()) {
            this.L_4 = true;
            ((class06202)this.y_0).execute(this::n);
        }
        ((class06202)this.y_0).execute(() -> this.L(var2));
    }

    @class11782
    public void N(class09321 class093212) {
        this.d();
        if (!this.l()) {
            return;
        }
        ((class11074)this.R_2).N(class093212, ((Integer)((class11515)this.R_0).i()).intValue());
    }

    @class11782
    public void N(class11380 class113802) {
        this.d();
        ((class11074)this.R_2).N((class06889)this.L_5, ((Float)this.L_6).floatValue(), ((Float)this.L_7).floatValue());
        if ((Integer)this.L_1 > 0) {
            this.L_1 = (Integer)this.L_1 - 1;
        }
        if ((Integer)this.L_2 > 0) {
            this.L_2 = (Integer)this.L_2 - 1;
        }
        if (!this.m()) {
            this.L_0 = -1;
            this.L_5 = null;
            this.L_3 = false;
            this.L_4 = false;
            ((class11074)this.R_2).N();
            this.y(true);
            return;
        }
        if (((Boolean)this.L_3).booleanValue()) {
            this.L_3 = false;
            this.L_1 = 5;
            this.L_4 = false;
            this.y(true);
            return;
        }
        if ((Integer)this.L_2 == 0 && this.T()) {
            this.L_1 = 5;
            this.L_4 = false;
            this.y(true);
            return;
        }
        this.y(false);
    }

    private static void G() {
        i_0 = 4096.0;
        i_1 = 5;
    }
}

