/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10758
 *  minecraft.class00812
 *  minecraft.class01894
 *  minecraft.class01990
 *  minecraft.class03556
 *  minecraft.class03719
 *  minecraft.class03741
 *  minecraft.class05946
 *  minecraft.class06510
 *  minecraft.class06521
 *  minecraft.class06915
 *  minecraft.class07165
 */
package minecraft;

import Nursultan.class10758;
import java.util.LinkedHashMap;
import java.util.Map;
import minecraft.class00812;
import minecraft.class01894;
import minecraft.class01990;
import minecraft.class03246;
import minecraft.class03259;
import minecraft.class03556;
import minecraft.class03719;
import minecraft.class03741;
import minecraft.class05946;
import minecraft.class06510;
import minecraft.class06521;
import minecraft.class06915;
import minecraft.class07165;

public class class03243 {
    private final class01990 N;
    private final class06510 y;
    private final class06510 L;
    private final class06510 u;
    private final class03556<class03246> i;
    private final Map<String, class06915<?>> R = new LinkedHashMap();

    public class03243(class01990 class019902, class06510 class065102, class06510 class065103, class06510 class065104, class03556<class03246> class035562) {
        this.N = class019902;
        this.y = class065102;
        this.L = class065103;
        this.u = class065104;
        this.i = class035562;
    }

    public void N(class03719 class037192, class05946<class06521<?>> class059462) {
        class059462 = this.N(class059462, class037192);
        this.N(class059462);
        class07165 class071652 = class037192.method_53818().N("has_the_recipe", class00812.N((class05946)class059462)).N(class10758.L((class05946)class059462)).N(class03741.y);
        this.R.forEach((arg_0, arg_1) -> ((class07165)class071652).N(arg_0, arg_1));
        class03259 class032592 = new class03259(this.y, this.L, this.u, this.i);
        class037192.method_53819(class059462, (class06521)class032592, class071652.y(class059462.N().R("recipes/" + this.N.N() + "/")));
    }

    private void N(class05946<class06521<?>> class059462) {
        if (this.R.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + String.valueOf(class059462.N()));
        }
    }

    private class05946 N(class05946 class059462, class03719 class037192) {
        return class05946.N((class05946)class059462.L(), (class01894)class037192.getRecipeIdentifier(class059462.N()));
    }

    public class03243 N(String string, class06915<?> class069152) {
        this.R.put(string, class069152);
        return this;
    }

    public static class03243 N(class06510 class065102, class06510 class065103, class06510 class065104, class03556<class03246> class035562, class01990 class019902) {
        return new class03243(class019902, class065102, class065103, class065104, class035562);
    }
}

