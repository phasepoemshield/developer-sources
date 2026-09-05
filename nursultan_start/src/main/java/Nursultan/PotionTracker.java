/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10990
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11107
 *  Nursultan.class11149
 *  Nursultan.class11165
 *  Nursultan.class11300
 *  Nursultan.class11303
 *  Nursultan.class11367
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11664
 *  Nursultan.class11805
 *  Nursultan.class11910
 *  Nursultan.class11938
 *  com.mojang.serialization.Lifecycle
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00380
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00405
 *  minecraft.class00516
 *  minecraft.class00734
 *  minecraft.class02484
 *  minecraft.class03448
 *  minecraft.class04227
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class05018
 *  minecraft.class05216
 *  minecraft.class06145
 *  minecraft.class06202
 *  minecraft.class06517
 *  minecraft.class06541
 *  minecraft.class06584
 *  minecraft.class06658
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07084
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class07486
 *  minecraft.class08036
 *  minecraft.class08392
 */
package Nursultan;

import Nursultan.class10990;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11107;
import Nursultan.class11149;
import Nursultan.class11165;
import Nursultan.class11300;
import Nursultan.class11303;
import Nursultan.class11367;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11664;
import Nursultan.class11805;
import Nursultan.class11910;
import Nursultan.class11938;
import com.mojang.serialization.Lifecycle;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00380;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00405;
import minecraft.class00516;
import minecraft.class00734;
import minecraft.class02484;
import minecraft.class03448;
import minecraft.class04227;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05018;
import minecraft.class05216;
import minecraft.class06145;
import minecraft.class06202;
import minecraft.class06517;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class06658;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07486;
import minecraft.class08036;
import minecraft.class08392;

@class11080(L="PotionTracker", y=class11072.MISC, N=class11106.TRACKERS)
public class PotionTracker
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;

    private void L(class11367 class113672) {
        class11938.Z().N(() -> {
            this.v();
            this.y(class113672);
            ((List)this.L_4).clear();
        });
    }

    public PotionTracker() {
        this.v();
        this.L_0 = class11524.N((class11512)this, (String)"ignore-self", (boolean)true);
        this.L_1 = class11524.N((class11512)this, (String)"ignore-common-splash-potions", (boolean)true);
        this.L_2 = class11524.N((class11512)this, (String)"ft-bypass", (boolean)true);
        this.L_3 = new ArrayList();
        this.L_4 = new ArrayList();
        class11805 class118052 = class11938.L();
        class118052.N(class11367.class, this::L);
        class118052.N(class10990.class, this::N);
        class11938.Z().N(class062022 -> (class03448)class062022.T_3 != null && ((class03448)class062022.T_3).method_30349().method_46759(class04227.yR).map(class007512 -> class007512.R().equals(Lifecycle.experimental())).orElse(false) != false, this::m);
    }

    private void m() {
        this.v();
        class11107.N((class11165)class11165.POTIONS).stream().map(class11664::N).forEach(((List)this.L_3)::add);
    }

    private void v() {
    }

    private void y(class11367 class113672) {
        this.v();
        class07089 class070892 = class113672.N();
        class07049 class070492 = class070892.N() == class07113.field_1331 ? ((class06145)class070892).L() : null;
        class07486 class074862 = class113672.y();
        List<class08036> var5 = this.N(class074862.method_5829().L(4.0, 2.0, 4.0));
        if (var5.isEmpty()) {
            return;
        }
        if (((Boolean)((class11507)this.L_2).i()).booleanValue() && class11910.i()) {
            block0: for (class11149 class111492 : (List)this.L_4) {
                for (class06584 class065842 : (List)this.L_3) {
                    class06517 class065172 = (class06517)class065842.a_(class02484.h, (Object)class06517.N);
                    int n = class11300.y((int)class11300.u((int)class111492.y()), (int)class11300.N((int)class111492.y()), (int)class11300.i((int)class111492.y()), (int)255);
                    if (class065172.R().isEmpty() || !class11300.N((int)((Integer)class065172.R().get()), (int)n, (int)10)) continue;
                    this.N(var5, class070892.y(), class070492, true, class065842);
                    continue block0;
                }
            }
            return;
        }
        this.N(var5, class074862.method_73189(), class070492, false, class074862.L());
    }

    private void N(List<class08036> list, class06889 class068892, class07049 class070492, boolean bl, class06584 class065842) {
        this.v();
        Iterable var7 = ((class06517)class065842.a_(class02484.h, (Object)class06517.N)).N();
        for (class08036 class080362 : list) {
            if (!this.N(class080362)) continue;
            double d = this.N(class068892.M(class080362.method_73189()), class080362, class070492);
            ArrayList<class00392> arrayList = new ArrayList<class00392>();
            for (class07055 class070552 : var7) {
                int n2;
                if (((class07084)class070552.L().N()).N() || (n2 = class070552.N(n -> (int)(d * (double)n + 0.5))) <= 20) continue;
                arrayList.add(this.N(class070552, n2));
            }
            if (arrayList.isEmpty() || !this.U() || ((Boolean)((class11507)this.L_1).i()).booleanValue() && !bl) continue;
            int n3 = Math.clamp((long)Math.round(d * 100.0), (int)1, (int)100);
            this.N(class080362, class065842, arrayList, n3);
        }
    }

    private void N(class08036 class080362, class06584 class065842, List<class00392> list, int n) {
        int n2 = class04995.M((float)((float)n / 100.0f * 0.33333334f), (float)1.0f, (float)1.0f);
        class05216 class052162 = class00392.y((String)(" " + n + "%")).L(class00405.N.N(n2));
        class05216 class052163 = class080362.yZ().L().i(" ").y(class065842.Y()).y((class00392)class052162).L(class00405.N.N((class00395)new class00380(class065842)));
        for (class00392 class003922 : list) {
            class052163.i("\n\u25cf ").y(class003922);
        }
        class11303.y((Object)class052163.N(class06541.field_1080));
    }

    private double N(double d, class08036 class080362, class07049 class070492) {
        if (d >= 16.0) {
            return 0.0;
        }
        return class080362 == class070492 ? 1.0 : 1.0 - Math.sqrt(d) / 4.0;
    }

    private List<class08036> N(class00734 class007342) {
        return ((class03448)((class06202)this.y_0).T_3).N(class08036.class, class007342);
    }

    private boolean N(class08036 class080362) {
        this.v();
        if (!class080362.method_6086()) {
            return false;
        }
        boolean bl = this.U();
        if (!bl && class080362 == (class04453)((class06202)this.y_0).T_4) {
            return false;
        }
        return !bl || (Boolean)((class11507)this.L_0).i() == false || class080362 != (class04453)((class06202)this.y_0).T_4;
    }

    private class00392 N(class07055 class070552, int n) {
        Object object = class08392.N((String)class070552.z(), (Object[])new Object[0]);
        if (class070552.i() >= 1 && class070552.i() <= 9) {
            object = (String)object + " " + class08392.N((String)("enchantment.level." + (class070552.i() + 1)), (Object[])new Object[0]);
        }
        String string = class05018.N((int)n, (float)((class03448)((class06202)this.y_0).T_3).method_54719().R());
        class05216 class052162 = class00392.y((String)object).N(class06541.field_1061);
        return class00392.i().y((class00392)class052162).i(" " + string);
    }

    private void N(class10990 class109902) {
        this.v();
        class00381 var2 = class109902.u();
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class06658.class, class00516.class}, (Object)var2, (int)n)) {
            case 0: {
                class06658 class066582 = (class06658)var2;
                ((class06202)this.y_0).execute(() -> class066582.N().forEach(n -> {
                    class07049 class070492 = ((class03448)((class06202)this.y_0).T_3).method_8469(n);
                    if (class070492 instanceof class07486) {
                        ((class07486)class070492).method_5773();
                    }
                }));
                break;
            }
            case 1: {
                class00516 class005162 = (class00516)var2;
                if (!((Boolean)((class11507)this.L_2).i()).booleanValue() || !class11910.i()) {
                    return;
                }
                ((class06202)this.y_0).execute(() -> {
                    this.v();
                    if (class005162.y() == 2002) {
                        ((List)this.L_4).add(new class11149(class005162.u(), class005162.L()));
                    }
                });
                break;
            }
        }
    }
}

