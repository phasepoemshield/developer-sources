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
 *  Nursultan.class11923
 *  Nursultan.class12020
 *  minecraft.class00380
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00405
 *  minecraft.class00509
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class05216
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07299
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.UseTracker;
import Nursultan.class10990;
import Nursultan.class11067;
import Nursultan.class11287;
import Nursultan.class11288;
import Nursultan.class11303;
import Nursultan.class11590;
import Nursultan.class11923;
import Nursultan.class12020;
import minecraft.class00380;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00405;
import minecraft.class00509;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07299;
import minecraft.class08036;

public class class11559
extends class11590 {
    public class11559(UseTracker useTracker, String string, boolean bl) {
        super(useTracker, string, bl);
    }

    static {
        class11559.N();
    }

    public void y(Object object) {
        class00509 class005092;
        if (!(object instanceof class10990)) {
            return;
        }
        class10990 class109902 = (class10990)object;
        class00381 var4 = class109902.u();
        if (!(var4 instanceof class00509) || (class005092 = (class00509)var4).N() != 35) {
            return;
        }
        class07049 class070492 = class005092.N((class07299)((class03448)((class06202)this.N_0).T_3));
        if (class070492 == (class04453)((class06202)this.N_0).T_4 || !(class070492 instanceof class08036)) {
            return;
        }
        class08036 class080362 = (class08036)class070492;
        for (class07050 class070502 : class07050.values()) {
            class06584 class065842 = class080362.method_5998(class070502);
            if (class065842.B() != class06570.la) continue;
            class11923.N(() -> this.y(class080362, class065842));
            break;
        }
    }

    private void y(class08036 class080362, class06584 class065842) {
        class00380 class003802 = new class00380(class065842);
        class05216 class052162 = class080362.method_5476().L();
        class05216 class052163 = class052162.i(String.valueOf(class06541.field_1080) + (class06541.N((String)class052162.getString()).endsWith(" ") ? "" : " ") + class12020.N((String)"totem-popped") + " ").i(class065842.I() ? String.valueOf(class06541.field_1060) + "\u2714" : String.valueOf(class06541.field_1061) + "\u274c").y(class00405.N.N((class00395)class003802));
        class11303.N((class11287)new class11288((class11067)((UseTracker)this.u_0)), (class00392)class052163);
    }

    private static void N() {
    }
}

