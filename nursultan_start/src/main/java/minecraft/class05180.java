/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00679
 *  minecraft.class00753
 *  minecraft.class01001
 *  minecraft.class01209
 *  minecraft.class01219
 *  minecraft.class01224
 *  minecraft.class01233
 *  minecraft.class01894
 *  minecraft.class03136
 *  minecraft.class03298
 *  minecraft.class04878
 *  minecraft.class05282
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06273
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06993
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07144
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 */
package minecraft;

import minecraft.class00679;
import minecraft.class00753;
import minecraft.class01001;
import minecraft.class01209;
import minecraft.class01219;
import minecraft.class01224;
import minecraft.class01233;
import minecraft.class01894;
import minecraft.class03136;
import minecraft.class03298;
import minecraft.class04878;
import minecraft.class05163;
import minecraft.class05282;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06273;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06993;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07144;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;

public class class05180
extends class01209 {
    public class05180(class01224 class012242, String string, class07209 class072092, class06993 class069932, boolean bl) {
        super(class04878.h, 0, class012242, class05180.N(string), string, class05180.N(bl, class069932), class072092);
    }

    public class05180(class01224 class012242, class07001 class070012) {
        super(class04878.h, class070012, class012242, class018942 -> class05180.N(class070012.y("OW", false), (class06993)class070012.N_15("Rot", class06993.field_56670).orElseThrow()));
    }

    protected void N(String string, class07209 class072092, class01001 class010012, class06069 class060692, class05163 class051632) {
        if (string.startsWith("Chest")) {
            class07209 class072093 = class072092.method_10074();
            if (class051632.y((class00753)class072093)) {
                class03136.N((class07290)class010012, (class06069)class060692, (class07209)class072093, (class05946)class06273.y);
            }
        } else if (class051632.y((class00753)class072092) && class07299.method_25953((class07209)class072092)) {
            if (string.startsWith("Sentry")) {
                class07144 class071442 = (class07144)class07078.yU.N((class07299)class010012.method_8410(), class06113.field_16474);
                if (class071442 != null) {
                    class071442.method_5814((double)class072092.method_10263() + 0.5, (double)class072092.method_10264(), (double)class072092.method_10260() + 0.5);
                    class010012.method_8649((class07049)class071442);
                }
            } else if (string.startsWith("Elytra")) {
                class00679 class006792 = new class00679((class07299)class010012.method_8410(), class072092, this.L.u().N(class07211.field_11035));
                class006792.N(new class06584((class07310)class06570.sT), false);
                class010012.method_8649((class07049)class006792);
            }
        }
    }

    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("Rot", class06993.field_56670, (Object)this.L.u());
        class070012.N("OW", this.L.Z().get(0) == class05282.y);
    }

    private static class01894 N(String string) {
        return class01894.y((String)("end_city/" + string));
    }

    protected class01894 N() {
        return class05180.N(this.N);
    }

    private static class01233 N(boolean bl, class06993 class069932) {
        class05282 class052822 = bl ? class05282.y : class05282.u;
        return new class01233().N(true).N((class01219)class052822).N(class069932);
    }
}

