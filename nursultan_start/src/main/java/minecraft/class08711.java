/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class06584
 *  minecraft.class06758
 *  minecraft.class07079
 *  minecraft.class07085
 *  minecraft.class07206
 *  minecraft.class07209
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class07438
 *  minecraft.class08092
 */
package minecraft;

import java.util.List;
import minecraft.class00734;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07079;
import minecraft.class07085;
import minecraft.class07206;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07438;
import minecraft.class08092;

public class class08711
extends class07206 {
    public static final class08711 N = new class08711();

    public static boolean y(class07210 class072102, class06584 class065842) {
        class07209 class072092 = class072102.L().method_10093((class07211)class072102.u().L((class08092)class06758.y));
        List var3 = class072102.y().N(class07438.class, new class00734(class072092), class074382 -> class074382.method_63625(class065842));
        if (var3.isEmpty()) {
            return false;
        }
        class07438 class074383 = (class07438)var3.getFirst();
        class07085 class070852 = class074383.method_32326(class065842);
        class06584 class065843 = class065842.N(1);
        class074383.method_5673(class070852, class065843);
        if (class074383 instanceof class07079) {
            class07079 class070792 = (class07079)class074383;
            class070792.N(class070852);
            class070792.NW();
        }
        return true;
    }

    protected class06584 N(class07210 class072102, class06584 class065842) {
        return class08711.y(class072102, class065842) ? class065842 : super.N(class072102, class065842);
    }
}

