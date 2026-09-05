/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Scaffold
 *  Nursultan.class11281
 *  Nursultan.class11297
 *  Nursultan.class11322
 *  Nursultan.class11494
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11534
 *  Nursultan.class11535
 *  Nursultan.class11907
 *  Nursultan.class11908
 *  Nursultan.class12010
 *  minecraft.class00494
 *  minecraft.class00734
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06918
 *  minecraft.class06942
 *  minecraft.class07050
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.Scaffold;
import Nursultan.class11019;
import Nursultan.class11281;
import Nursultan.class11297;
import Nursultan.class11322;
import Nursultan.class11494;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11534;
import Nursultan.class11535;
import Nursultan.class11907;
import Nursultan.class11908;
import Nursultan.class12010;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class00494;
import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06918;
import minecraft.class06942;
import minecraft.class07050;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08036;

public abstract class class11053
extends class11535 {
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public boolean y_init;

    public boolean L(class06183 class061832) {
        return class061832.N() == class07113.field_1333;
    }

    public void L() {
        this.P();
        if ((Integer)this.y_2 >= 0) {
            this.y_2 = (Integer)this.y_2 - 1;
        }
        if (this.u()) {
            return;
        }
        this.B();
        class11019 class110192 = this.N();
        if (class110192 == null) {
            return;
        }
        for (class07050 class070502 : class07050.values()) {
            class06183 class061832;
            class11499 class114992;
            class11499 class114993;
            if (!this.N(((class04453)((class06202)this.y_0).T_4).method_5998(class070502))) continue;
            class06889 class068892 = this.N(class110192.N(), ((class04453)((class06202)this.y_0).T_4).method_73189().y(0.0, -0.5, 0.0));
            class11499 class114994 = this.N(class110192, class068892, class114993 = class11505.N((class11499)(class114992 = class11505.N()), (class06889)class068892));
            class06183 class061833 = this.N(class114994.y(), class114994.R(), class110192);
            if (this.N(class061833, class061832 = this.N(class114992.y(), class114992.R(), class110192))) {
                class061833 = class061832;
                class114994 = class114992;
            }
            if (this.y(class061833, class070502)) {
                this.N(class061833, class070502);
                this.N(class114994, true);
            }
            this.N(class114994, false);
            break;
        }
    }

    public boolean M() {
        class11322.i();
        return true;
    }

    private void P() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_2 = 0;
        }
    }

    public class11053(Scaffold scaffold, String string, boolean bl) {
        super(string, bl);
        this.P();
        this.y_0 = class06202.Nq();
        this.y_1 = scaffold;
    }

    public void B() {
        this.P();
        class06584 class065842 = ((class04453)((class06202)this.y_0).T_4).method_6047();
        if (this.N(class065842)) {
            return;
        }
        Optional<class11297> var2 = class11281.i(this::N).max(Comparator.comparingInt(class112972 -> class112972.N().c()));
        if (var2.isEmpty()) {
            return;
        }
        class11322.u((int)var2.get().y());
    }

    public boolean i() {
        return true;
    }

    public boolean u() {
        return false;
    }

    public boolean y(class06183 class061832) {
        this.P();
        if (!((Scaffold)this.y_1).P()) {
            return false;
        }
        return class061832.i() == class07211.field_11036 && !this.R() && !((class04453)((class06202)this.y_0).T_4).method_24828();
    }

    public boolean y(class06183 class061832, class07050 class070502) {
        this.P();
        if (this.L(class061832)) {
            return false;
        }
        if (this.y(class061832)) {
            return false;
        }
        if (!this.N(class061832)) {
            return false;
        }
        return this.N(((class04453)((class06202)this.y_0).T_4).method_5998(class070502), class061832, class070502);
    }

    private boolean N(class06584 class065842) {
        this.P();
        class06581 class065812 = class065842.B();
        if (class065812 instanceof class06918) {
            return (class065812 = ((class06918)class065812).L().W().R((class07290)((class03448)((class06202)this.y_0).T_3), class07209.field_10980).method_1107()).y() == 1.0 && class065812.u() == 1.0;
        }
        return false;
    }

    public void N(class11499 class114992, boolean bl) {
        class11534.y((class11499)class114992);
    }

    public boolean N(class06183 class061832, class06183 class061833) {
        if (class061832.N() == class07113.field_1333 || class061833.N() == class07113.field_1333) {
            return false;
        }
        if (!class061832.u().equals((Object)class061833.u())) {
            return false;
        }
        return class061832.i() == class07211.field_11036 || class061832.i() == class061833.i();
    }

    public boolean N(class06183 class061832) {
        this.P();
        return (Integer)this.y_2 <= 0;
    }

    public class06183 N(float f, float f2, class11019 class110192) {
        this.P();
        class06889 class068892 = ((class04453)((class06202)this.y_0).T_4).method_5631(f2, f);
        class06889 class068893 = ((class04453)((class06202)this.y_0).T_4).method_33571();
        class06889 class068894 = class068893.i(class068892.L(((class04453)((class06202)this.y_0).T_4).method_55754()));
        class06183 class061832 = ((class03448)((class06202)this.y_0).T_3).method_8320(class110192.y()).R((class07290)((class03448)((class06202)this.y_0).T_3), class110192.y()).method_1092(class068893, class068894, class110192.y());
        return class061832 == null ? class06183.N((class06889)class068893, (class07211)class07211.field_11036, (class07209)class110192.y()) : class061832;
    }

    public void N(class06183 class061832, class07050 class070502) {
        this.P();
        class11907.N((class07050)class070502, (class06183)class061832);
        class11494 class114942 = ((Scaffold)this.y_1).m();
        this.y_2 = class11908.N((int)((int)class114942.N()), (int)((int)class114942.L()));
    }

    public class11019 N() {
        this.P();
        class06889 class068892 = ((class04453)((class06202)this.y_0).T_4).method_73189();
        class06889 class068893 = new class06889(((class04453)((class06202)this.y_0).T_4).method_23317(), Math.floor(((class04453)((class06202)this.y_0).T_4).method_23318()) - 0.5, ((class04453)((class06202)this.y_0).T_4).method_23321());
        double d = ((class04453)((class06202)this.y_0).T_4).method_55754();
        return this.N(class068892, d).stream().min(Comparator.comparingDouble(class110192 -> this.N(class110192.N(), class068892).M(class068893))).orElse(null);
    }

    public boolean N(class06584 class065842, class06183 class061832, class07050 class070502) {
        this.P();
        class06581 class065812 = class065842.B();
        if (class065812 instanceof class06918) {
            class06918 class069182 = (class06918)class065812;
            class065812 = new class06942((class07299)((class03448)((class06202)this.y_0).T_3), (class08036)((class04453)((class06202)this.y_0).T_4), class070502, class065842, class061832);
            if (!class065812.N()) {
                return false;
            }
            if (((class03448)((class06202)this.y_0).T_3).method_31606(class065812.method_8037())) {
                return false;
            }
            return ((class12010)class069182).N((class06942)class065812) != null;
        }
        return false;
    }

    public List<class11019> N(class06889 class068892, double d) {
        this.P();
        class07218 class072182 = new class07218();
        ArrayList<class11019> arrayList = new ArrayList<class11019>();
        for (int i = (int)(-d); i <= (int)d; ++i) {
            for (int j = (int)(-d); j <= (int)d; ++j) {
                int n = 0;
                while ((float)n <= (float)((int)d) - ((class04453)((class06202)this.y_0).T_4).method_18381(((class04453)((class06202)this.y_0).T_4).method_18376())) {
                    class072182.N(class068892.M + (double)i, class068892.B - (double)n, class068892.Z + (double)j);
                    class00494 class004942 = ((class03448)((class06202)this.y_0).T_3).method_8320((class07209)class072182).R((class07290)((class03448)((class06202)this.y_0).T_3), (class07209)class072182);
                    if (!class004942.method_1110()) {
                        class004942 = class004942.method_1096((double)class072182.method_10263(), (double)class072182.method_10264(), (double)class072182.method_10260());
                        arrayList.add(new class11019(class072182.method_10062(), class004942));
                    }
                    ++n;
                }
            }
        }
        return arrayList;
    }

    public abstract class11499 N(class11019 var1, class06889 var2, class11499 var3);

    public class06889 N(class00494 class004942, class06889 class068892) {
        class06889 class068893 = null;
        Iterator var4 = class004942.method_1090().iterator();
        while (var4.hasNext()) {
            class00734 class007342 = ((class00734)var4.next()).L(0.0, (double)-0.15f, 0.0);
            double d = class04995.N((double)class068892.N(), (double)class007342.N, (double)class007342.u);
            double d2 = class04995.N((double)class068892.y(), (double)class007342.y, (double)class007342.i);
            double d3 = class04995.N((double)class068892.L(), (double)class007342.L, (double)class007342.R);
            if (class068893 != null && !(class068892.L(d, d2, d3) < class068892.M(class068893))) continue;
            class068893 = new class06889(d, d2, d3);
        }
        return class068893 == null ? class068892 : class068893;
    }

    public boolean R() {
        this.P();
        return !((class04453)((class06202)this.y_0).T_4).k() || ((class04453)((class06202)this.y_0).T_4).field_5976;
    }
}

