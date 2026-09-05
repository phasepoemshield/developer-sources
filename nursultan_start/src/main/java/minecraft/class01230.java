/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00860
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01209
 *  minecraft.class01219
 *  minecraft.class01894
 *  minecraft.class03298
 *  minecraft.class04878
 *  minecraft.class05163
 *  minecraft.class05282
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06273
 *  minecraft.class06993
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08092
 */
package minecraft;

import java.util.ArrayList;
import minecraft.class00500;
import minecraft.class00860;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01209;
import minecraft.class01219;
import minecraft.class01224;
import minecraft.class01233;
import minecraft.class01894;
import minecraft.class03298;
import minecraft.class04878;
import minecraft.class05163;
import minecraft.class05282;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06273;
import minecraft.class06993;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08092;

public class class01230
extends class01209 {
    public class01230(class01224 class012242, class07001 class070012) {
        super(class04878.r, class070012, class012242, class018942 -> class01230.N((class07111)class070012.N_15("Mi", class07111.field_56669).orElseThrow(), (class06993)class070012.N_15("Rot", class06993.field_56670).orElseThrow()));
    }

    public class01230(class01224 class012242, String string, class07209 class072092, class06993 class069932, class07111 class071112) {
        super(class04878.r, 0, class012242, class01230.N(string), string, class01230.N(class071112, class069932), class072092);
    }

    public class01230(class01224 class012242, String string, class07209 class072092, class06993 class069932) {
        this(class012242, string, class072092, class069932, class07111.field_11302);
    }

    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("Rot", class06993.field_56670, (Object)this.L.u());
        class070012.N("Mi", class07111.field_56669, (Object)this.L.L());
    }

    protected void N(String string, class07209 class072092, class01001 class010012, class06069 class060692, class05163 class051632) {
        if (string.startsWith("Chest")) {
            class06993 class069932 = this.L.u();
            class00500 class005002 = class00869.LA.W();
            if ("ChestWest".equals(string)) {
                class005002 = (class00500)class005002.y((class08092)class00860.u, (Comparable)class069932.N(class07211.field_11039));
            } else if ("ChestEast".equals(string)) {
                class005002 = (class00500)class005002.y((class08092)class00860.u, (Comparable)class069932.N(class07211.field_11034));
            } else if ("ChestSouth".equals(string)) {
                class005002 = (class00500)class005002.y((class08092)class00860.u, (Comparable)class069932.N(class07211.field_11035));
            } else if ("ChestNorth".equals(string)) {
                class005002 = (class00500)class005002.y((class08092)class00860.u, (Comparable)class069932.N(class07211.field_11043));
            }
            this.N(class010012, class051632, class060692, class072092, class06273.Q, class005002);
        } else {
            ArrayList<class07079> arrayList = new ArrayList<class07079>();
            switch (string) {
                case "Mage": {
                    arrayList.add((class07079)class07078.x.N((class07299)class010012.method_8410(), class06113.field_16474));
                    break;
                }
                case "Warrior": {
                    arrayList.add((class07079)class07078.yH.N((class07299)class010012.method_8410(), class06113.field_16474));
                    break;
                }
                case "Group of Allays": {
                    int n = class010012.method_8409().y(3) + 1;
                    for (int i = 0; i < n; ++i) {
                        arrayList.add((class07079)class07078.i.N((class07299)class010012.method_8410(), class06113.field_16474));
                    }
                    break;
                }
                default: {
                    return;
                }
            }
            for (class07079 class070792 : arrayList) {
                if (class070792 == null) continue;
                class070792.NW();
                class070792.method_5725(class072092, 0.0f, 0.0f);
                class070792.N(class010012, class010012.method_8404(class070792.method_24515()), class06113.field_16474, null);
                class010012.y((class07049)class070792);
                class010012.method_8652(class072092, class00869.N.W(), 2);
            }
        }
    }

    private static class01233 N(class07111 class071112, class06993 class069932) {
        return new class01233().N(true).N(class069932).N(class071112).N((class01219)class05282.y);
    }

    private static class01894 N(String string) {
        return class01894.y((String)("woodland_mansion/" + string));
    }

    protected class01894 N() {
        return class01230.N(this.N);
    }
}

