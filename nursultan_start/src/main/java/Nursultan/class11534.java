/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09316
 *  Nursultan.class10992
 *  Nursultan.class11375
 *  Nursultan.class11384
 *  Nursultan.class11385
 *  Nursultan.class11394
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11902
 *  Nursultan.class11908
 *  Nursultan.class11938
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class05515
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07843
 */
package Nursultan;

import Nursultan.class09316;
import Nursultan.class10992;
import Nursultan.class11375;
import Nursultan.class11384;
import Nursultan.class11385;
import Nursultan.class11394;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11522;
import Nursultan.class11538;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11902;
import Nursultan.class11908;
import Nursultan.class11938;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05515;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07843;

public class class11534 {
    public static Object N_0;
    public Object y_0;
    public Object y_1;
    public boolean y_init;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public Object L_7;
    public boolean L_init;

    public boolean L() {
        return (Boolean)this.L_1;
    }

    private void L(class11499 class114992) {
        if (!((Boolean)this.L_3).booleanValue()) {
            this.L_4 = Float.valueOf(((class04453)((class06202)class11534.N_0).T_4).method_36454());
            this.L_5 = Float.valueOf(((class04453)((class06202)class11534.N_0).T_4).method_36455());
        }
        ((class04453)((class06202)class11534.N_0).T_4).method_36456(class114992.y());
        ((class04453)((class06202)class11534.N_0).T_4).method_36457(class114992.R());
        this.L_2 = class11938.j().y();
        this.L_3 = true;
    }

    public float M() {
        return ((Float)this.L_4).floatValue();
    }

    private static void P() {
        N_0 = null;
    }

    private void T() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_1 = false;
            this.L_2 = 0;
            this.L_3 = false;
            this.L_4 = Float.valueOf(0.0f);
            this.L_5 = Float.valueOf(0.0f);
            this.L_6 = false;
            this.L_7 = false;
        }
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = false;
        }
    }

    public class11534() {
        this.T();
        this.L_0 = new ArrayList();
        class11938.L().y((Object)this);
    }

    static {
        class11534.P();
        N_0 = class06202.Nq();
    }

    public List<class11499> B() {
        return (List)this.L_0;
    }

    public boolean Z() {
        return (Boolean)this.L_7;
    }

    public int i() {
        return (Integer)this.L_2;
    }

    public boolean z() {
        return (Boolean)this.y_0;
    }

    public boolean u() {
        return (Boolean)this.L_3;
    }

    private void y(class11375 class113752) {
        class07050 class070502 = class113752.i();
        if (!this.N(((class04453)((class06202)class11534.N_0).T_4).method_5998(class070502))) {
            return;
        }
        class113752.N();
        class11499 class114992 = class11505.L().N(class11522.staticFields_05ffa7eec8dd73e94b3c68970de658457_0);
        this.L(class114992);
        class11534.y(class114992);
        class11938.Z().y(2, () -> {
            this.L(class114992);
            class11534.y(class114992);
            ((class03443)((class06202)class11534.N_0).T_2).N((class03448)((class06202)class11534.N_0).T_3, n -> new class07843(class070502, n, ((class04453)((class06202)class11534.N_0).T_4).method_36454(), ((class04453)((class06202)class11534.N_0).T_4).method_36455()));
            ((class04453)((class06202)class11534.N_0).T_4).method_6104(class070502);
        });
    }

    public boolean y() {
        return (Boolean)this.L_6;
    }

    public static void y(class11499 class114993) {
        class11534 class115342 = class11938.v();
        if (((Boolean)class115342.y_0).booleanValue()) {
            return;
        }
        ((List)class115342.L_0).add(class114993);
        ((List)class115342.L_0).sort(Comparator.comparingInt(class114992 -> class114992.z().N()));
    }

    private void E() {
        if (class11938.j().y() - 20 > (Integer)this.L_2 || !((Boolean)this.L_6).booleanValue()) {
            this.W();
        } else {
            float f = ((class04453)((class06202)class11534.N_0).T_4).method_36454() + class04995.R((float)(((Float)this.L_4).floatValue() - ((class04453)((class06202)class11534.N_0).T_4).method_36454()));
            if (Math.abs(f - ((class04453)((class06202)class11534.N_0).T_4).method_36454()) < 2.0f && Math.abs(((Float)this.L_5).floatValue() - ((class04453)((class06202)class11534.N_0).T_4).method_36455()) < 2.0f) {
                this.W();
                return;
            }
            if ((class11538)((Object)this.y_1) == class11538.staticFields_002f846683278372c86f24838365e6c39_1) {
                float f2 = class11938.j().y() - 10 < (Integer)this.L_2 ? class11908.y((float)1.0f, (float)5.0f) : class11908.y((float)10.0f, (float)35.0f);
                class11499 class114992 = new class11499(((class04453)((class06202)class11534.N_0).T_4).method_36454() + class04995.N((float)(f - ((class04453)((class06202)class11534.N_0).T_4).method_36454()), (float)(-f2), (float)f2), ((class04453)((class06202)class11534.N_0).T_4).method_36455() + class04995.N((float)(((Float)this.L_5).floatValue() - ((class04453)((class06202)class11534.N_0).T_4).method_36455()), (float)(-f2), (float)f2)).N(true);
                ((class04453)((class06202)class11534.N_0).T_4).method_36456(class114992.y());
                ((class04453)((class06202)class11534.N_0).T_4).method_36457(class114992.R());
            } else {
                class11499 class114993 = new class11499(class04995.B((float)0.5f, (float)((class04453)((class06202)class11534.N_0).T_4).method_36454(), (float)f), class04995.B((float)0.5f, (float)((class04453)((class06202)class11534.N_0).T_4).method_36455(), (float)((Float)this.L_5).floatValue())).N(true);
                ((class04453)((class06202)class11534.N_0).T_4).method_36456(class114993.y());
                ((class04453)((class06202)class11534.N_0).T_4).method_36457(class114993.R());
            }
        }
    }

    public float N() {
        return ((Float)this.L_5).floatValue();
    }

    @class11782(y=class11777.AFTER)
    public void N(class11384 class113842) {
        if (class113842.y()) {
            return;
        }
        if (!((Boolean)this.L_1).booleanValue() && ((Boolean)this.L_3).booleanValue()) {
            class113842.N();
            this.L_4 = Float.valueOf(((Float)this.L_4).floatValue() + (float)class113842.u() * 0.15f);
            this.L_5 = Float.valueOf(((Float)this.L_5).floatValue() + (float)class113842.L() * 0.15f);
            this.L_5 = Float.valueOf(Math.clamp((float)((Float)this.L_5).floatValue(), (float)-90.0f, (float)90.0f));
        }
    }

    @class11782
    public void N(class11375 class113752) {
        if (!((Boolean)this.L_1).booleanValue() && ((Boolean)this.L_3).booleanValue()) {
            this.y(class113752);
        }
    }

    @class11782
    public void N(class09316 class093162) {
        if (!((Boolean)this.L_1).booleanValue() && ((Boolean)this.L_3).booleanValue()) {
            class093162.N(((Float)this.L_4).floatValue());
            class093162.y(((Float)this.L_5).floatValue());
        }
    }

    public static void N(class11499 class114992) {
        class11534 class115342 = class11938.v();
        if ((class04453)((class06202)class11534.N_0).T_4 == null) {
            return;
        }
        ((List)class115342.L_0).clear();
        class115342.L_1 = class114992.B();
        class115342.L_7 = class114992.u();
        class115342.L_6 = class114992.E();
        class115342.y_1 = class114992.N();
        class115342.L(class114992);
        class115342.y_0 = true;
    }

    @class11782
    public void N(class11394 class113942) {
        if (!((Boolean)this.L_1).booleanValue() && ((Boolean)this.L_3).booleanValue()) {
            class113942.y(((Float)this.L_4).floatValue());
            class113942.N(((Float)this.L_5).floatValue());
        }
    }

    @class11782
    public void N(class11385 class113852) {
        if (!((Boolean)this.L_1).booleanValue() && ((Boolean)this.L_3).booleanValue() && !((Boolean)this.L_7).booleanValue()) {
            class11902.N((class11385)class113852, (float)((Float)this.L_4).floatValue());
        }
    }

    @class11782(y=class11777.LISTENER)
    public void N(class10992 class109922) {
        this.y_0 = false;
        if ((class04453)((class06202)class11534.N_0).T_4 == null) {
            return;
        }
        if (class11938.j().y() - 1 > (Integer)this.L_2 && ((Boolean)this.L_3).booleanValue()) {
            this.E();
        }
        Iterator iterator = ((List)this.L_0).iterator();
        while (iterator.hasNext()) {
            class11499 class114992 = (class11499)iterator.next();
            this.L_1 = class114992.B();
            this.L_7 = class114992.u();
            this.L_6 = class114992.E();
            this.y_1 = class114992.N();
            this.L(class114992);
            iterator.remove();
        }
    }

    private boolean N(class06584 class065842) {
        if (class065842.N(class06570.nz)) {
            return true;
        }
        if (class065842.N(class06570.Gz)) {
            return true;
        }
        if (class065842.N(class06570.dw)) {
            return true;
        }
        if (class065842.N(class06570.GB)) {
            return true;
        }
        return class065842.B() instanceof class05515;
    }

    private void W() {
        if (((Boolean)this.L_3).booleanValue()) {
            ((class04453)((class06202)class11534.N_0).T_4).method_36456(((class04453)((class06202)class11534.N_0).T_4).method_36454() + class04995.R((float)(((Float)this.L_4).floatValue() - ((class04453)((class06202)class11534.N_0).T_4).method_36454())));
            ((class04453)((class06202)class11534.N_0).T_4).u_0 = Float.valueOf(((class04453)((class06202)class11534.N_0).T_4).method_36454());
            ((class04453)((class06202)class11534.N_0).T_4).fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(((class04453)((class06202)class11534.N_0).T_4).method_36454());
            ((class04453)((class06202)class11534.N_0).T_4).method_36457(class04995.N((float)((Float)this.L_5).floatValue(), (float)-90.0f, (float)90.0f));
        }
        this.L_1 = false;
        this.L_3 = false;
    }

    public class11538 R() {
        return (class11538)((Object)this.y_1);
    }
}

