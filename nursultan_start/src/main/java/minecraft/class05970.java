/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00717
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class00717;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;

public class class05970 {
    public static class06584 N(class06584 class065842, class08036 class080362, class06584 class065843) {
        return class05970.N(class065842, class080362, class065843, true);
    }

    public static void N(class00717 class007172, Iterable<class06584> iterable) {
        class07299 class072992 = class007172.method_73183();
        if (class072992.method_8608()) {
            return;
        }
        iterable.forEach(class065842 -> class072992.method_8649((class07049)new class00717(class072992, class007172.method_23317(), class007172.method_23318(), class007172.method_23321(), class065842)));
    }

    public static class06584 N(class06584 class065842, class08036 class080362, class06584 class065843, boolean bl) {
        boolean bl2 = class080362.method_56992();
        if (bl && bl2) {
            if (!class080362.method_31548().z(class065843)) {
                class080362.method_31548().M(class065843);
            }
            return class065842;
        }
        class065842.N(1, (class07438)class080362);
        if (class065842.R()) {
            return class065843;
        }
        if (!class080362.method_31548().M(class065843)) {
            class080362.method_7328(class065843, false);
        }
        return class065842;
    }

    public static class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class080362.method_6019(class070502);
        return class07082.L;
    }
}

