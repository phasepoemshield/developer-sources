/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10626
 *  Nursultan.class10990
 *  Nursultan.class11303
 *  Nursultan.class11475
 *  Nursultan.class11481
 *  Nursultan.class11938
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00405
 *  minecraft.class00625
 *  minecraft.class00647
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class06889
 */
package Nursultan;

import Nursultan.class10626;
import Nursultan.class10990;
import Nursultan.class11303;
import Nursultan.class11475;
import Nursultan.class11481;
import Nursultan.class11910;
import Nursultan.class11921;
import Nursultan.class11938;
import java.time.Duration;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00405;
import minecraft.class00625;
import minecraft.class00647;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06889;

public abstract class class11888 {
    static {
        class11888.N();
    }

    private String i(String string) {
        Object object = string;
        long l = class11938.E().y().filter(string2 -> string2.equals(string)).count();
        if (l > 0L) {
            object = (String)object + " (" + l + ")";
        }
        return object;
    }

    private String N(double d) {
        return String.valueOf(class06541.field_1068) + String.valueOf((int)d) + String.valueOf(class06541.field_1080);
    }

    public void N(String string, double d, double d2, double d3, boolean bl) {
        String string2 = this.i(string);
        if (bl) {
            this.N(string2, d, d2, d3);
        }
        class05216 class052162 = class11921.N("event-waypoint", String.valueOf(class06541.field_1068) + string2 + String.valueOf(class06541.field_1080), this.N(d), this.N(d2), this.N(d3)).N(class06541.field_1080);
        if (!bl) {
            class00401 class004012 = new class00401((class00392)class11921.N("click-to-way"));
            class00625 class006252 = new class00625(((Character)class10626.N_1).charValue() + "gps " + d + " " + d3);
            class052162.y(class00405.N.N((class00395)class004012).N((class00647)class006252));
        }
        class11303.y((Object)class052162);
    }

    public void N(String string) {
        String string2 = this.i(string);
        class11303.y((Object)class11921.N("event-notify", String.valueOf(class06541.field_1068) + string2 + String.valueOf(class06541.field_1080)).N(class06541.field_1080));
    }

    private void N(String string, double d, double d2, double d3) {
        String string2 = class11910.L();
        Duration duration = Duration.ofSeconds(500L);
        class06889 class068892 = new class06889(d, d2, d3);
        class11475 class114752 = new class11475(string, class068892, duration, string2);
        class11938.E().N((class11481)class114752);
    }

    public abstract void N(class10990 var1);

    private static void N() {
    }
}

