/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09045
 *  Nursultan.class10872
 *  Nursultan.class11286
 *  Nursultan.class11333
 *  Nursultan.class11381
 *  Nursultan.class11386
 *  Nursultan.class11389
 *  Nursultan.class11398
 *  Nursultan.class11938
 *  Nursultan.class12002
 *  Nursultan.class12013
 */
package Nursultan;

import Nursultan.class09045;
import Nursultan.class10872;
import Nursultan.class11286;
import Nursultan.class11333;
import Nursultan.class11381;
import Nursultan.class11386;
import Nursultan.class11389;
import Nursultan.class11398;
import Nursultan.class11938;
import Nursultan.class12002;
import Nursultan.class12013;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class class09173 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;

    public String L() {
        return (String)this.y_3;
    }

    public void L(class11389 class113892) {
        switch (((class09045)this.y_4).ordinal()) {
            case 0: {
                ((class10872)this.y_2).N(class113892);
                break;
            }
            case 1: {
                ((class10872)this.y_2).L(class113892);
                this.N_3 = true;
            }
        }
        this.T();
    }

    public boolean M() {
        return (class09045)this.y_4 == class09045.HOLD ? ((Boolean)this.N_3).booleanValue() : ((class10872)this.y_2).N();
    }

    private void T() {
        boolean bl = this.M();
        if (bl == (Boolean)this.N_4) {
            return;
        }
        this.N_4 = bl;
        this.N(bl ? class11386.ACTIVATED : class11386.DEACTIVATED);
    }

    public class09173(class11333 class113332, String string, class09045 class090452, class12002 class120022, int n) {
        this.m();
        this.y_0 = new ArrayList();
        this.y_1 = class113332;
        this.y_3 = string;
        this.y_4 = class090452;
        this.N_0 = class120022;
        this.N_1 = n;
        this.N_2 = true;
        this.U();
    }

    public boolean B() {
        return ((class12002)this.N_0).y();
    }

    public int Z() {
        return (Integer)this.N_1;
    }

    public class09045 i() {
        return (class09045)this.y_4;
    }

    private void b() {
        if (!((Boolean)this.N_3).booleanValue()) {
            return;
        }
        this.N_3 = false;
        ((class10872)this.y_2).y(class11389.N((int)((class12002)this.N_0).L(), (class11286)class11286.RELEASE, (class11381)(((class12002)this.N_0).N() ? class11381.MOUSE : class11381.KEYBOARD)));
        this.T();
    }

    private void s() {
        ((List)this.y_0).forEach(consumer -> consumer.accept(this));
    }

    private void m() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = 0;
            this.N_2 = false;
            this.N_3 = false;
            this.N_4 = false;
        }
    }

    public void U() {
        this.y_2 = ((class11333)this.y_1).N();
    }

    public String z() {
        return class12013.N((class12002)((class12002)this.N_0), (int)((Integer)this.N_1));
    }

    public boolean u(class11389 class113892) {
        return ((class12002)this.N_0).N(class113892.z()) && class12013.y((class12002)((class12002)this.N_0), (int)class113892.R()) == (Integer)this.N_1;
    }

    public void u() {
        this.T();
    }

    public class12002 y() {
        return (class12002)this.N_0;
    }

    public boolean y(class11389 class113892) {
        return ((class12002)this.N_0).N(class113892.z()) && (Integer)this.N_1 == 0;
    }

    public void N(String string) {
        this.y_3 = string;
    }

    private void N(class11386 class113862) {
        class11938.L().L((Object)class11398.N((class09173)this, (class11386)class113862));
    }

    public void N(class12002 class120022) {
        if ((class12002)this.N_0 == class120022) {
            return;
        }
        this.b();
        this.N_0 = class120022;
        this.s();
        this.N(class11386.UPDATED);
    }

    public void N(class12002 class120022, int n, class09045 class090452, boolean bl) {
        this.b();
        boolean bl2 = (class12002)this.N_0 != class120022;
        boolean bl3 = bl2 || (Integer)this.N_1 != n || (class09045)this.y_4 != class090452 || (Boolean)this.N_2 != bl;
        this.y_4 = class090452;
        this.N_2 = bl;
        this.N_0 = class120022;
        this.N_1 = n;
        if (bl2) {
            this.s();
        }
        if (bl3) {
            this.N(class11386.UPDATED);
        }
    }

    public boolean N() {
        return (Boolean)this.N_2;
    }

    public void N(Consumer<class09173> consumer) {
        if (((List)this.y_0).stream().anyMatch(consumer2 -> consumer2 == consumer)) {
            return;
        }
        ((List)this.y_0).add(consumer);
    }

    public void N(class11389 class113892) {
        if ((class09045)this.y_4 == class09045.HOLD && ((Boolean)this.N_3).booleanValue()) {
            ((class10872)this.y_2).y(class113892);
            this.N_3 = false;
            this.T();
        }
    }

    public void N(boolean bl) {
        if ((Boolean)this.N_2 == bl) {
            return;
        }
        this.N_2 = bl;
        this.N(class11386.UPDATED);
    }

    public boolean N(int n) {
        return ((class12002)this.N_0).N(n) && (Boolean)this.N_3 != false;
    }

    public String R() {
        return ((class11333)this.y_1).y();
    }
}

