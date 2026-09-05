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
 *  minecraft.class05544
 *  minecraft.class05946
 *  minecraft.class06510
 *  minecraft.class06521
 *  minecraft.class06581
 *  minecraft.class06915
 *  minecraft.class07165
 *  minecraft.class08604
 *  minecraft.class08690
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10758;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import minecraft.class00812;
import minecraft.class01894;
import minecraft.class01990;
import minecraft.class03556;
import minecraft.class03719;
import minecraft.class03741;
import minecraft.class05544;
import minecraft.class05946;
import minecraft.class06510;
import minecraft.class06521;
import minecraft.class06581;
import minecraft.class06915;
import minecraft.class07165;
import minecraft.class08604;
import minecraft.class08690;
import org.jspecify.annotations.Nullable;

public class class00258
implements class05544 {
    private final class01990 y;
    private final class03556<class06581> L;
    private final class06510 u;
    private final class06510 i;
    private final Map<String, class06915<?>> R = new LinkedHashMap();
    private @Nullable String M;

    private class00258(class01990 class019902, class03556<class06581> class035562, class06510 class065102, class06510 class065103) {
        this.y = class019902;
        this.L = class035562;
        this.u = class065102;
        this.i = class065103;
    }

    private class05946 N(class05946 class059462, class03719 class037192) {
        return class05946.N((class05946)class059462.L(), (class01894)class037192.getRecipeIdentifier(class059462.N()));
    }

    private void N(class05946<class06521<?>> class059462) {
        if (this.R.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + String.valueOf(class059462.N()));
        }
    }

    public void N(class03719 class037192, class05946<class06521<?>> class059462) {
        class059462 = this.N(class059462, class037192);
        this.N(class059462);
        class07165 class071652 = class037192.method_53818().N("has_the_recipe", class00812.N((class05946)class059462)).N(class10758.L((class05946)class059462)).N(class03741.y);
        this.R.forEach((arg_0, arg_1) -> ((class07165)class071652).N(arg_0, arg_1));
        class08690 class086902 = new class08690(Objects.requireNonNullElse(this.M, ""), class05544.N((class01990)this.y), this.u, this.i, new class08604((class06581)this.L.N()));
        class037192.method_53819(class059462, (class06521)class086902, class071652.y(class059462.N().R("recipes/" + this.y.N() + "/")));
    }

    public static class00258 N(class01990 class019902, class06510 class065102, class06510 class065103, class06581 class065812) {
        return new class00258(class019902, (class03556<class06581>)class065812.i(), class065102, class065103);
    }

    public class00258 y(String string, class06915<?> class069152) {
        this.R.put(string, class069152);
        return this;
    }

    public class00258 y(@Nullable String string) {
        this.M = string;
        return this;
    }

    public class06581 N() {
        return (class06581)this.L.N();
    }
}

