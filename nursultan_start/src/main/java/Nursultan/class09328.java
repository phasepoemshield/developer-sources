/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09065
 *  Nursultan.class09173
 *  Nursultan.class10992
 *  Nursultan.class11322
 *  Nursultan.class11380
 *  Nursultan.class11796
 *  Nursultan.class11822
 *  Nursultan.class11826
 *  Nursultan.class11938
 *  Nursultan.class11951
 *  Nursultan.class11975
 *  minecraft.class04453
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class09065;
import Nursultan.class09173;
import Nursultan.class09345;
import Nursultan.class10992;
import Nursultan.class11322;
import Nursultan.class11380;
import Nursultan.class11796;
import Nursultan.class11822;
import Nursultan.class11826;
import Nursultan.class11938;
import Nursultan.class11951;
import Nursultan.class11975;
import java.util.Iterator;
import minecraft.class04453;
import minecraft.class06202;

public class class09328
implements class11826<class11380> {
    public static Object N_0;
    public Object y_0;

    private void M() {
        if ((class04453)((class06202)this.y_0).T_4 == null) {
            return;
        }
        ((class11796)((class11822)((class04453)((class06202)this.y_0).T_4)).dataManager()).u().N((Object)Float.valueOf(((class04453)((class06202)this.y_0).T_4).method_36455()));
        class11938.L().L((Object)class10992.N());
    }

    public class09328() {
        this.Z();
        this.y_0 = class06202.Nq();
    }

    static {
        class09328.B();
    }

    private static void B() {
        N_0 = 3000L;
    }

    private void Z() {
    }

    private void i() {
        if (class11938.j().y() % 20 == 0) {
            Iterator var1 = class11938.b().N().iterator();
            while (var1.hasNext()) {
                ((class09173)var1.next()).u();
            }
        }
    }

    public void listen(class11380 class113802) {
        this.i();
        ((class09065)class09065.y_0).y();
        class11938.j().N();
        class11938.Z().N();
        this.R();
        this.M();
        class11322.R();
    }

    private void R() {
        class09345 class093452 = class11938.N();
        class093452.N(3000L, System.currentTimeMillis());
        if (class093452.u() || (class04453)((class06202)this.y_0).T_4 == null || ((class04453)((class06202)this.y_0).T_4).field_6012 % 20 != 0 || !((class06202)this.y_0).y()) {
            return;
        }
        class11938.z().N((class11951)new class11975(((class04453)((class06202)this.y_0).T_4).method_23317(), ((class04453)((class06202)this.y_0).T_4).method_23318(), ((class04453)((class06202)this.y_0).T_4).method_23321()));
    }
}

