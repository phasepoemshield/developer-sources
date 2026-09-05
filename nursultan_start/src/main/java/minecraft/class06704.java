/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class00743
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07299
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00743;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07299;

public class class06704 {
    public static void N(class07299 class072992, class07209 class072092, class00743<class06584> class007432) {
        class007432.forEach(class065842 -> class06704.N(class072992, (double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), class065842));
    }

    public static void N(class07299 class072992, double d, double d2, double d3, class06584 class065842) {
        double d4 = class07078.Nt.z();
        double d5 = 1.0 - d4;
        double d6 = d4 / 2.0;
        double d7 = Math.floor(d) + class072992.field_9229.U() * d5 + d6;
        double d8 = Math.floor(d2) + class072992.field_9229.U() * d5;
        double d9 = Math.floor(d3) + class072992.field_9229.U() * d5 + d6;
        while (!class065842.R()) {
            class00717 class007172 = new class00717(class072992, d7, d8, d9, class065842.N(class072992.field_9229.y(21) + 10));
            float f = 0.05f;
            class007172.method_18800(class072992.field_9229.N(0.0, 0.11485000171139836), class072992.field_9229.N(0.2, 0.11485000171139836), class072992.field_9229.N(0.0, 0.11485000171139836));
            class072992.method_8649((class07049)class007172);
        }
    }

    public static void N(class00500 class005002, class07299 class072992, class07209 class072092) {
        class072992.method_8455(class072092, class005002.i());
    }

    private static void N(class07299 class072992, double d, double d2, double d3, class06695 class066952) {
        for (int i = 0; i < class066952.method_5439(); ++i) {
            class06704.N(class072992, d, d2, d3, class066952.method_5438(i));
        }
    }

    public static void N(class07299 class072992, class07049 class070492, class06695 class066952) {
        class06704.N(class072992, class070492.method_23317(), class070492.method_23318(), class070492.method_23321(), class066952);
    }

    public static void N(class07299 class072992, class07209 class072092, class06695 class066952) {
        class06704.N(class072992, (double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), class066952);
    }
}

