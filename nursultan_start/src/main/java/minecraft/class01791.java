/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00701
 *  minecraft.class01237
 *  minecraft.class01383
 *  minecraft.class01421
 *  minecraft.class04507
 *  minecraft.class04832
 *  minecraft.class06898
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class08452
 *  minecraft.class08800
 */
package minecraft;

import minecraft.class00701;
import minecraft.class01237;
import minecraft.class01383;
import minecraft.class01421;
import minecraft.class04507;
import minecraft.class04832;
import minecraft.class06898;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class08452;
import minecraft.class08800;

public class class01791
extends class04507<class00701, class08452> {
    public class01791(class04832 class048322) {
        super(class048322);
        this.field_4673 = 0.5f;
    }

    public void method_62354(class00701 class007012, class08452 class084522, float f) {
        super.method_62354((class07049)class007012, (class08800)class084522, f);
        class07209 class072092 = class07209.method_49637((double)class007012.method_23317(), (double)class007012.method_5829().i, (double)class007012.method_23321());
        class084522.N.N = class007012.N();
        class084522.N.y = class072092;
        class084522.N.L = class007012.L();
        class084522.N.u = class007012.method_73183().i(class072092);
        class084522.N.i = class007012.method_73183();
    }

    public class08452 method_55269() {
        return new class08452();
    }

    public void method_3936(class08452 class084522, class01421 class014212, class01237 class012372, class06959 class069592) {
        if (class084522.N.L.b() != class06898.field_11458) {
            return;
        }
        class014212.N();
        class014212.N(-0.5, 0.0, -0.5);
        class012372.N(class014212, class084522.N);
        class014212.y();
        super.method_3936((class08800)class084522, class014212, class012372, class069592);
    }

    public boolean method_3933(class00701 class007012, class01383 class013832, double d, double d2, double d3) {
        if (!super.method_3933((class07049)class007012, class013832, d, d2, d3)) {
            return false;
        }
        return class007012.L() != class007012.method_73183().method_8320(class007012.method_24515());
    }
}

