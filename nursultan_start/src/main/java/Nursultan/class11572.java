/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.UseTracker
 *  Nursultan.class10990
 *  Nursultan.class11067
 *  Nursultan.class11287
 *  Nursultan.class11288
 *  Nursultan.class11303
 *  Nursultan.class11396
 *  Nursultan.class11923
 *  Nursultan.class11929
 *  Nursultan.class11938
 *  Nursultan.class12020
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00380
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00405
 *  minecraft.class02998
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04477
 *  minecraft.class05216
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06586
 *  minecraft.class06660
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.UseTracker;
import Nursultan.class10990;
import Nursultan.class11067;
import Nursultan.class11287;
import Nursultan.class11288;
import Nursultan.class11303;
import Nursultan.class11396;
import Nursultan.class11543;
import Nursultan.class11590;
import Nursultan.class11923;
import Nursultan.class11929;
import Nursultan.class11938;
import Nursultan.class12020;
import java.lang.runtime.SwitchBootstraps;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import minecraft.class00380;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00405;
import minecraft.class02998;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04477;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06586;
import minecraft.class06660;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class08036;

public class class11572
extends class11590 {
    public Object y_0;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;

    private static void M() {
        L_0 = 8;
        L_1 = (byte)1;
        L_2 = (byte)0;
        L_3 = (byte)3;
        L_4 = (byte)2;
    }

    public class11572(UseTracker useTracker, String string, boolean bl) {
        super(useTracker, string, bl);
        this.i();
        this.y_0 = new WeakHashMap();
    }

    static {
        class11572.N();
        class11572.M();
    }

    private void i() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void y(Object object) {
        this.i();
        Object object2 = object;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class11396.class, class10990.class}, (Object)object2, (int)n)) {
            case 0: {
                class07049 class070492 = ((class11396)object2).N();
                if (!(class070492 instanceof class08036)) return;
                class08036 class080362 = (class08036)class070492;
                ((WeakHashMap)this.y_0).remove(class080362);
                return;
            }
            case 1: {
                List var7;
                int n2;
                class10990 class109902 = (class10990)object2;
                class00381 var9 = class109902.u();
                if (!(var9 instanceof class06660)) return;
                class06660 class066602 = (class06660)var9;
                try {
                    List var10;
                    int n3;
                    n2 = n3 = class066602.N();
                    var7 = var10 = class066602.y();
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
                if ((class04453)((class06202)this.N_0).T_4 == null) return;
                if (((class04453)((class06202)this.N_0).T_4).method_5628() == n2) return;
                class07049 class070493 = ((class03448)((class06202)this.N_0).T_3).method_8469(n2);
                if (!(class070493 instanceof class04477)) return;
                class066602 = (class04477)class070493;
                int n4 = class11938.j().y();
                class11543 class115432 = (class11543)((Object)((WeakHashMap)this.y_0).get(class066602));
                Iterator var11 = var7.iterator();
                while (var11.hasNext()) {
                    class02998 var12 = (class02998)var11.next();
                    if (var12.N() != 8) continue;
                    byte by = (Byte)var12.L();
                    if (class115432 != null) {
                        if (n4 - class115432.y() >= 32) {
                            this.N((class04477)class066602, class115432, by);
                        } else {
                            ((WeakHashMap)this.y_0).remove(class066602);
                        }
                    }
                    this.N((class04477)class066602, by, n4);
                }
                return;
            }
        }
    }

    private boolean N(class06584 class065842) {
        return !class11929.U((class06584)class065842) && !(class065842.B() instanceof class06586) && class065842.B() != class06570.jT;
    }

    private void N(class04477 class044772, class11543 class115432, byte by) {
        this.i();
        for (class07050 class070502 : class07050.values()) {
            boolean bl;
            class06584 class065842 = class044772.method_5998(class070502);
            class06584 class065843 = class115432.N();
            boolean bl2 = bl = class065842.B() != class06570.nP || this.N(class065843);
            if (bl && this.N(class065842)) continue;
            if (!bl) {
                class065842 = class065843;
            }
            if (by != (class070502 == class07050.field_5808 ? (byte)0 : 2)) continue;
            class06584 class065844 = class065842;
            class11923.N(() -> this.N((class08036)class044772, class065844));
            ((WeakHashMap)this.y_0).remove(class044772);
            break;
        }
    }

    private static void N() {
    }

    private void N(class08036 class080362, class06584 class065842) {
        class00380 class003802 = new class00380(class065842);
        class05216 class052162 = class080362.method_5476().L();
        class00392 class003922 = class065842.B() instanceof class06586 ? class065842.k() : class065842.Y();
        String string = class06541.N((String)class052162.getString()).endsWith(" ") ? "" : " ";
        class05216 class052163 = class052162.i(String.valueOf(class06541.field_1080) + string + class12020.N((String)"food-used") + " ").y(class003922).y(class00405.N.N((class00395)class003802));
        class11303.N((class11287)new class11288((class11067)((UseTracker)this.u_0)), (class00392)class052163);
    }

    private void N(class04477 class044772, byte by, int n) {
        this.i();
        for (class07050 class070502 : class07050.values()) {
            class06584 class065842 = class044772.method_5998(class070502);
            if (this.N(class065842) || by != (class070502 == class07050.field_5808 ? (byte)1 : 3)) continue;
            ((WeakHashMap)this.y_0).put(class044772, new class11543(n, class065842));
            break;
        }
    }
}

