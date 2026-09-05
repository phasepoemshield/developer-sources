/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10992
 *  Nursultan.class11281
 *  Nursultan.class11297
 *  Nursultan.class11322
 *  Nursultan.class11328
 *  Nursultan.class11938
 *  Nursultan.class12008
 *  Nursultan.class12029
 *  Nursultan.class12040
 *  minecraft.class00381
 *  minecraft.class00743
 *  minecraft.class02484
 *  minecraft.class02575
 *  minecraft.class02830
 *  minecraft.class04453
 *  minecraft.class05462
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07482
 *  minecraft.class07510
 */
package Nursultan;

import Nursultan.class10992;
import Nursultan.class11281;
import Nursultan.class11297;
import Nursultan.class11322;
import Nursultan.class11328;
import Nursultan.class11819;
import Nursultan.class11907;
import Nursultan.class11938;
import Nursultan.class12008;
import Nursultan.class12029;
import Nursultan.class12040;
import java.util.ArrayDeque;
import java.util.Deque;
import minecraft.class00381;
import minecraft.class00743;
import minecraft.class02484;
import minecraft.class02575;
import minecraft.class02830;
import minecraft.class04453;
import minecraft.class05462;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07482;
import minecraft.class07510;

public class class11900
implements class11819 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;
    public Object N_7;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;

    private void L() {
        class11328 class113282 = (class11328)((Deque)this.N_1).poll();
        if (class113282 == null) {
            return;
        }
        int n = class11281.R((class11328)class113282);
        if (class11281.y((int)n)) {
            if ((Integer)this.N_4 == -1 && (Integer)this.y_4 == -1 && this.L(class113282) != null) {
                this.y_3 = class113282;
                this.y_0 = true;
            }
            return;
        }
        if (((class04453)((class06202)this.N_0).T_4).method_7357().N((class06584)((class04453)((class06202)this.N_0).T_4).method_31548().u().get(n))) {
            return;
        }
        if ((Integer)this.N_4 == -1) {
            this.N_4 = n;
        }
        this.N_5 = n;
        this.y_0 = true;
    }

    private class11297 L(class11328 class113282) {
        return class11281.L(class065842 -> this.N((class06584)class065842, class113282)).findFirst().orElse(null);
    }

    private boolean M() {
        return (Integer)this.N_2 <= 0 && (Integer)this.N_3 <= 0;
    }

    public class11900(int n) {
        this(n, 0);
    }

    public class11900(int n, int n2) {
        this.N();
        this.N_0 = class06202.Nq();
        this.N_1 = new ArrayDeque();
        this.N_4 = -1;
        this.N_5 = -1;
        this.y_4 = -1;
        this.y_5 = -1;
        this.N_2 = n;
        this.N_3 = n2;
    }

    private void B() {
        if (class11938.m().u() || (class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3 != ((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2 || !((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M().R()) {
            return;
        }
        class06584 class065842 = (class06584)((class04453)((class06202)this.N_0).T_4).method_31548().u().get(((Integer)this.y_4).intValue());
        class02830 class028302 = (class02830)class065842.method_58694(class02484.D);
        if (class028302 == null || class028302.M()) {
            this.y_4 = -1;
            this.y_5 = -1;
            return;
        }
        int n = class11281.L((int)((Integer)this.y_4));
        if (class028302.Z() && class028302.B() != 0) {
            class05462.N((class06584)class065842, (int)0);
            ((class06202)this.N_0).NE().N((class00381)new class02575(n, 0));
        }
        int n2 = class11281.L((int)((Integer)this.y_5));
        boolean bl = !((class06584)((class04453)((class06202)this.N_0).T_4).method_31548().u().get(((Integer)this.y_5).intValue())).R();
        class12029 class120292 = class11938.m().N(0, n, 1, class07510.field_7790).N(0, n2, 0, class07510.field_7790);
        if (bl) {
            class120292.N(0, n, 0, class07510.field_7790);
        }
        class120292.y();
        this.y_4 = -1;
        this.y_5 = -1;
    }

    private void Z() {
        if ((Integer)this.N_3 <= 0) {
            this.z();
            return;
        }
        this.N_7 = (int)((Integer)this.N_3);
        this.y_2 = true;
    }

    private void i() {
        int n = ((class04453)((class06202)this.N_0).T_4).method_31548().N();
        if (class11281.u((int)((Integer)this.N_5))) {
            class11322.N((int)((Integer)this.N_5));
            this.Z();
            if (this.M()) {
                class11322.i();
                if (((Integer)this.N_4).intValue() == ((Integer)this.N_5).intValue()) {
                    this.N_4 = -1;
                }
            }
            return;
        }
        if (this.M()) {
            class11938.m().N(((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b, ((Integer)this.N_5).intValue(), n, class07510.field_7791).i().N((class12040)new class12008(this::Z)).N(((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b, ((Integer)this.N_5).intValue(), n, class07510.field_7791).L();
            if (((Integer)this.N_4).intValue() == ((Integer)this.N_5).intValue()) {
                this.N_4 = -1;
            }
            return;
        }
        class11938.m().N(((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b, ((Integer)this.N_5).intValue(), n, class07510.field_7791).y(class062022 -> this.Z()).y();
    }

    private void U() {
        this.N_6 = (Integer)this.N_6 - 1;
        if (((Boolean)this.y_2).booleanValue()) {
            if ((Integer)this.N_7 > 0) {
                this.N_7 = (Integer)this.N_7 - 1;
                return;
            }
            this.y_2 = false;
            this.z();
            return;
        }
        if (!((Boolean)this.y_0).booleanValue()) {
            this.L();
        }
        if (((Boolean)this.y_0).booleanValue()) {
            if ((class11328)this.y_3 != null) {
                class11328 class113282 = (class11328)this.y_3;
                this.y_3 = null;
                this.y(class113282);
            } else if (((Boolean)this.y_1).booleanValue()) {
                this.Z();
            } else if ((Integer)this.N_5 != -1) {
                this.i();
            }
            this.N_5 = -1;
            this.y_0 = false;
            this.y_1 = false;
            return;
        }
        if ((Integer)this.N_6 == 0 && (Integer)this.N_4 != -1) {
            int n = ((class04453)((class06202)this.N_0).T_4).method_31548().N();
            if (class11281.u((int)((Integer)this.N_4))) {
                class11322.i();
            } else {
                class11938.m().N(((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b, ((Integer)this.N_4).intValue(), n, class07510.field_7791).y();
            }
            this.N_4 = -1;
        }
        if ((Integer)this.N_6 <= 0 && (Integer)this.y_4 != -1) {
            this.B();
        }
    }

    private void z() {
        if (((class04453)((class06202)this.N_0).T_4).method_6047().R()) {
            return;
        }
        class11907.N(class07050.field_5808);
        this.N_6 = (int)((Integer)this.N_2);
    }

    private int y() {
        class00743 var1 = ((class04453)((class06202)this.N_0).T_4).method_31548().u();
        for (int i = 9; i < var1.size(); ++i) {
            if (!((class06584)var1.get(i)).R()) continue;
            return i;
        }
        return -1;
    }

    private void y(class11328 class113282) {
        int n;
        if (class11938.m().u() || (class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3 != ((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2 || !((class07482)((class04453)((class06202)this.N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M().R()) {
            return;
        }
        class11297 class112972 = this.L(class113282);
        if (class112972 == null) {
            return;
        }
        class02830 class028302 = (class02830)class112972.N().method_58694(class02484.D);
        int n2 = this.N(class028302, class113282);
        if (n2 == -1 || ((class04453)((class06202)this.N_0).T_4).method_7357().N(class028302.N(n2))) {
            return;
        }
        class06584 class065842 = ((class04453)((class06202)this.N_0).T_4).method_6047();
        boolean bl = !class065842.R() && class028302.i() == 1 && class02830.y((class06584)class065842);
        int n3 = n = class065842.R() || bl ? -1 : this.y();
        if (!class065842.R() && !bl && class11281.y((int)n)) {
            return;
        }
        int n4 = class11281.L((int)class112972.y());
        int n5 = ((class04453)((class06202)this.N_0).T_4).method_31548().N();
        int n6 = class11281.L((int)n5);
        if (class028302.B() != n2) {
            class05462.N((class06584)class112972.N(), (int)n2);
            ((class06202)this.N_0).NE().N((class00381)new class02575(n4, n2));
        }
        class12029 class120292 = class11938.m().N(0, n4, 1, class07510.field_7790).N(0, n6, 0, class07510.field_7790);
        if (!class065842.R()) {
            if (bl) {
                class120292.N(0, n4, 0, class07510.field_7790);
                this.y_4 = class112972.y();
                this.y_5 = n5;
            } else {
                class120292.N(0, class11281.L((int)n), 0, class07510.field_7790);
                this.N_4 = n;
            }
        }
        class120292.y(class062022 -> this.Z()).y();
        this.N_6 = (int)((Integer)this.N_2);
    }

    @Override
    public void y(Object object) {
        if (object instanceof class10992) {
            this.U();
        }
    }

    public void N(int n) {
        this.N_2 = n;
    }

    public void N(class11328 class113282) {
        ((Deque)this.N_1).add(class113282);
    }

    private int N(class02830 class028302, class11328 class113282) {
        for (int i = 0; i < class028302.i(); ++i) {
            if (!class113282.test((Object)class028302.N(i))) continue;
            return i;
        }
        return -1;
    }

    private void N() {
        this.N_2 = 0;
        this.y_0 = false;
        this.N_3 = 0;
        this.y_1 = false;
        this.N_4 = 0;
        this.y_2 = false;
        this.N_5 = 0;
        this.y_4 = 0;
        this.N_6 = 0;
        this.y_5 = 0;
        this.N_7 = 0;
    }

    private boolean N(class06584 class065842, class11328 class113282) {
        class02830 class028302 = (class02830)class065842.method_58694(class02484.D);
        if (class028302 == null) {
            return false;
        }
        return class028302.y().anyMatch(arg_0 -> class113282.test(arg_0));
    }
}

