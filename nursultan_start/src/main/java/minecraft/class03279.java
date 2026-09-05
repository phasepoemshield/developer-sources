/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10758
 *  minecraft.class00812
 *  minecraft.class01894
 *  minecraft.class01990
 *  minecraft.class03719
 *  minecraft.class03741
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06510
 *  minecraft.class06521
 *  minecraft.class06581
 *  minecraft.class06915
 *  minecraft.class07165
 *  minecraft.class08604
 */
package minecraft;

import Nursultan.class10758;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class00812;
import minecraft.class01894;
import minecraft.class01990;
import minecraft.class03280;
import minecraft.class03719;
import minecraft.class03741;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06510;
import minecraft.class06521;
import minecraft.class06581;
import minecraft.class06915;
import minecraft.class07165;
import minecraft.class08604;

public class class03279 {
    private final class06510 N;
    private final class06510 y;
    private final class06510 L;
    private final class01990 u;
    private final class06581 i;
    private final Map<String, class06915<?>> R = new LinkedHashMap();

    public class03279(class06510 class065102, class06510 class065103, class06510 class065104, class01990 class019902, class06581 class065812) {
        this.u = class019902;
        this.N = class065102;
        this.y = class065103;
        this.L = class065104;
        this.i = class065812;
    }

    public void N(class03719 class037192, class05946<class06521<?>> class059462) {
        class059462 = this.N(class059462, class037192);
        this.N(class059462);
        class07165 class071652 = class037192.method_53818().N("has_the_recipe", class00812.N((class05946)class059462)).N(class10758.L((class05946)class059462)).N(class03741.y);
        this.R.forEach((arg_0, arg_1) -> ((class07165)class071652).N(arg_0, arg_1));
        class03280 class032802 = new class03280(Optional.of(this.N), this.y, Optional.of(this.L), new class08604(this.i));
        class037192.method_53819(class059462, (class06521)class032802, class071652.y(class059462.N().R("recipes/" + this.u.N() + "/")));
    }

    private void N(class05946<class06521<?>> class059462) {
        if (this.R.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + String.valueOf(class059462.N()));
        }
    }

    private class05946 N(class05946 class059462, class03719 class037192) {
        return class05946.N((class05946)class059462.L(), (class01894)class037192.getRecipeIdentifier(class059462.N()));
    }

    public void N(class03719 class037192, String string) {
        this.N(class037192, class05946.N((class05946)class04227.yV, (class01894)class01894.N((String)string)));
    }

    public class03279 N(String string, class06915<?> class069152) {
        this.R.put(string, class069152);
        return this;
    }

    public static class03279 N(class06510 class065102, class06510 class065103, class06510 class065104, class01990 class019902, class06581 class065812) {
        return new class03279(class065102, class065103, class065104, class019902, class065812);
    }
}

