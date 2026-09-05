/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Notifications
 *  Nursultan.class10990
 *  Nursultan.class10996
 *  Nursultan.class11798
 *  Nursultan.class11807
 *  Nursultan.class11849
 *  Nursultan.class11857
 *  Nursultan.class11868
 *  Nursultan.class11869
 *  Nursultan.class11929
 *  Nursultan.class11938
 *  Nursultan.class12020
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00381
 *  minecraft.class00496
 *  minecraft.class02484
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06937
 */
package Nursultan;

import Nursultan.Notifications;
import Nursultan.class10990;
import Nursultan.class10996;
import Nursultan.class11798;
import Nursultan.class11807;
import Nursultan.class11849;
import Nursultan.class11857;
import Nursultan.class11868;
import Nursultan.class11869;
import Nursultan.class11929;
import Nursultan.class11938;
import Nursultan.class12020;
import java.lang.runtime.SwitchBootstraps;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import minecraft.class00381;
import minecraft.class00496;
import minecraft.class02484;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06937;

public class class11428
extends class11807<Notifications> {
    public Object y_0;
    public static Object L_0;
    public static Object L_1;

    private void L() {
    }

    private static void M() {
        L_0 = 10000L;
        L_1 = 4000L;
    }

    public class11428(Notifications notifications, String string, boolean bl) {
        super((Object)notifications, string, bl);
        this.L();
        this.y_0 = new HashMap();
    }

    static {
        class11428.N();
        class11428.M();
    }

    public void y(Object object) {
        this.L();
        Object object2 = object;
        Objects.requireNonNull(object2);
        Object object3 = object2;
        int n = 0;
        block4: while (true) {
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class10990.class, class10996.class}, (Object)object3, (int)n)) {
                case 0: {
                    class00381 var6 = ((class10990)object3).u();
                    if (!(var6 instanceof class00496)) {
                        n = 1;
                        continue block4;
                    }
                    class00496 class004962 = (class00496)var6;
                    this.N(class004962);
                    break block4;
                }
                case 1: {
                    class10996 class109962 = (class10996)object3;
                    ((Map)this.y_0).entrySet().removeIf(entry -> System.currentTimeMillis() - (Long)entry.getValue() > 10000L);
                    break block4;
                }
            }
            break;
        }
    }

    private static void N() {
    }

    private void N(class00496 class004962) {
        class06584 class065842;
        this.L();
        if (class004962.N() != 0 || (class04453)((class06202)((class11798)this).N_0).T_4 == null) {
            return;
        }
        class06584 class065843 = class004962.L();
        int n = class004962.y();
        class06937 class069372 = ((class04453)((class06202)((class11798)this).N_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.L(n);
        if (!class069372.R() || !class065843.W()) {
            return;
        }
        class06581 class065812 = class065843.B();
        float f = class11929.M((class06584)class065843);
        if (f < 0.0f || f > 7.0f) {
            return;
        }
        class06584 class065844 = class069372.i();
        if (!class065844.W() || class065844.P() >= class065843.P()) {
            return;
        }
        long l = System.currentTimeMillis();
        Long l2 = (Long)((Map)this.y_0).get(n);
        if (l2 != null && l - l2 < 10000L) {
            return;
        }
        ((Map)this.y_0).put(n, l);
        if (n > 4 && n < 9 && class065812.R().N(class02484.o)) {
            class11428.N(class065843, "item-almost-break");
        } else if (((class04453)((class06202)((class11798)this).N_0).T_4).method_31548().N() + 36 == n && !(class065842 = ((class04453)((class06202)((class11798)this).N_0).T_4).method_6047()).R()) {
            class11428.N(class065842, "item-in-hand-almost-break");
        }
    }

    private static void N(class06584 class065842, String string) {
        class11938.g().i().L().N((class11849)new class11869(class065842.t())).N((class11868)new class11857(class12020.N((String)string))).N(4000L).N();
    }
}

