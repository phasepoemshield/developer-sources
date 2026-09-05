/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09692
 *  Nursultan.class09743
 *  Nursultan.class09778
 *  Nursultan.class09785
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09962
 *  Nursultan.class09991
 *  Nursultan.class09994
 *  Nursultan.class11644
 */
package Nursultan;

import Nursultan.class09692;
import Nursultan.class09743;
import Nursultan.class09778;
import Nursultan.class09785;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09962;
import Nursultan.class09991;
import Nursultan.class09994;
import Nursultan.class11644;
import Nursultan.class11769;

public class class11760 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public boolean y_init;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;

    private void L() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = Float.valueOf(0.0f);
            this.y_1 = Float.valueOf(0.0f);
            this.y_2 = 0L;
        }
    }

    public class11760(String string) {
        this.L();
        this.y_0 = Float.valueOf((float)(string.hashCode() & 0xFFFF) / 65535.0f * ((float)Math.PI * 2));
    }

    static {
        class11760.N();
        class11760.y();
        N_4 = class09991.N().N(class09962.N()).y(class09962.N()).N(class09692.N((class09994[])new class09994[]{class09994.z((class09743)((class09743)class11644.N_0))}));
        N_5 = class09991.N((class09991[])new class09991[]{(class09991)N_4, class09991.N().P(1.0f)});
        N_6 = class09991.N((class09991[])new class09991[]{(class09991)N_4, class09991.N().P(1.05f)});
    }

    private static void y() {
        L_0 = Float.valueOf(1.05f);
        L_1 = Float.valueOf(0.45f);
        L_2 = Float.valueOf(1.2f);
        L_3 = Float.valueOf(9.0f);
        N_0 = Float.valueOf(13.0f);
        N_1 = Float.valueOf(0.005f);
        N_2 = Float.valueOf(0.05f);
        N_3 = Math.PI * 2;
        N_4 = null;
        N_5 = null;
        N_6 = null;
    }

    private float N(boolean bl) {
        long l = System.nanoTime();
        float f = (Long)this.y_2 == 0L ? 0.0f : Math.min(0.05f, (float)(l - (Long)this.y_2) / 1.0E9f);
        this.y_2 = l;
        float f2 = bl ? 1.0f : 0.0f;
        this.y_1 = Float.valueOf(((Float)this.y_1).floatValue() + (f2 - ((Float)this.y_1).floatValue()) * Math.min(1.0f, f * (bl ? 9.0f : 13.0f)));
        if (!bl && ((Float)this.y_1).floatValue() < 0.005f) {
            this.y_1 = Float.valueOf(0.0f);
            return 0.0f;
        }
        double d = (double)l / 1.0E9 * 13.96263438583813 + (double)((Float)this.y_0).floatValue();
        return ((Float)this.y_1).floatValue() * 1.2f * (float)Math.sin(d);
    }

    public class09798 N(class09809 class098092, class11769 class117692, class09785<Boolean> class097852, class09798 class097982) {
        float f = ((Float)class098092.L(class117692.E() + "Jiggle", () -> Float.valueOf(this.N(class117692.s() && !Boolean.TRUE.equals(class097852.L()))))).floatValue();
        boolean bl = Boolean.TRUE.equals(class097852.L());
        return class09778.N((class09991)class09991.N((class09991[])new class09991[]{bl ? (class09991)N_6 : (class09991)N_5, class09991.N().s(f)}), class097842 -> {
            class097842.N(class117692.E() + "Motion");
            class097842.y(class097982);
        });
    }

    private static void N() {
    }
}

