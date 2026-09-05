/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class06729
 *  minecraft.class06738
 */
package minecraft;

import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06729;
import minecraft.class06738;

public class class07591
extends class06738 {
    private final class01686 L;

    public class07591(class01686 class016862) {
        super(class016862);
        class01686 class016863 = this.y.y("shell");
        this.L = class016863.y("corals");
    }

    public void method_2819(class06729 class067292) {
        super.method_2819(class067292);
        this.L.U = class067292.y.R();
    }

    public static class04806 N() {
        class04792 class047922 = class07591.L();
        class04839 class048392 = class047922.N().y("root").y("shell").N("corals", class04822.L(), class04838.N((float)8.0f, (float)4.5f, (float)-8.0f));
        class04839 class048393 = class048392.N("yellow_coral", class04822.L(), class04838.N((float)0.0f, (float)-11.0f, (float)11.0f));
        class048393.N("yellow_coral_second", class04822.L().N(0, 85).N(-4.5f, -3.5f, 0.0f, 6.0f, 8.0f, 0.0f), class04838.N((float)0.0f, (float)0.0f, (float)2.0f, (float)0.0f, (float)-0.7854f, (float)0.0f));
        class048393.N("yellow_coral_first", class04822.L().N(0, 85).N(-4.5f, -3.5f, 0.0f, 6.0f, 8.0f, 0.0f), class04838.N((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.7854f, (float)0.0f));
        class048392.N("pink_coral", class04822.L().N(-8, 94).N(-4.5f, 4.5f, 0.0f, 6.0f, 0.0f, 8.0f), class04838.N((float)-12.5f, (float)-18.0f, (float)11.0f)).N("pink_coral_second", class04822.L().N(-8, 94).N(-3.0f, 0.0f, -4.0f, 6.0f, 0.0f, 8.0f), class04838.N((float)-1.5f, (float)4.5f, (float)4.0f, (float)0.0f, (float)0.0f, (float)1.5708f));
        class04839 class048394 = class048392.N("blue_coral", class04822.L(), class04838.N((float)-14.0f, (float)0.0f, (float)5.5f));
        class048394.N("blue_second", class04822.L().N(0, 102).N(-3.5f, -5.5f, 0.0f, 5.0f, 10.0f, 0.0f), class04838.N((float)0.0f, (float)0.0f, (float)-2.0f, (float)0.0f, (float)0.7854f, (float)0.0f));
        class048394.N("blue_first", class04822.L().N(0, 102).N(-3.5f, -5.5f, 0.0f, 5.0f, 10.0f, 0.0f), class04838.N((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-0.7854f, (float)0.0f));
        class04839 class048395 = class048392.N("red_coral", class04822.L(), class04838.N((float)0.0f, (float)0.0f, (float)0.0f));
        class048395.N("red_coral_second", class04822.L().N(0, 112).N(-2.5f, -5.5f, 0.0f, 4.0f, 10.0f, 0.0f), class04838.N((float)-0.5f, (float)-1.0f, (float)1.5f, (float)0.0f, (float)-0.829f, (float)0.0f));
        class048395.N("red_coral_first", class04822.L().N(0, 112).N(-4.5f, -5.5f, 0.0f, 6.0f, 10.0f, 0.0f), class04838.N((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.7854f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)128, (int)128);
    }
}

