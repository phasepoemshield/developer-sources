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
 *  minecraft.class05544
 *  minecraft.class05946
 *  minecraft.class06138
 *  minecraft.class06510
 *  minecraft.class06521
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06915
 *  minecraft.class07165
 *  minecraft.class07310
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
import minecraft.class03719;
import minecraft.class03741;
import minecraft.class05544;
import minecraft.class05946;
import minecraft.class06138;
import minecraft.class06156;
import minecraft.class06184;
import minecraft.class06510;
import minecraft.class06521;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06915;
import minecraft.class07165;
import minecraft.class07310;
import org.jspecify.annotations.Nullable;

public class class06161
implements class05544 {
    private final class01990 y;
    private final class06581 L;
    private final class06510 u;
    private final int i;
    private final Map<String, class06915<?>> R = new LinkedHashMap();
    private @Nullable String M;
    private final class06138<?> B;

    public class06161(class01990 class019902, class06138<?> class061382, class06510 class065102, class07310 class073102, int n) {
        this.y = class019902;
        this.B = class061382;
        this.L = class073102.B();
        this.u = class065102;
        this.i = n;
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
        class06184 class061842 = this.B.create(Objects.requireNonNullElse(this.M, ""), this.u, new class06584((class07310)this.L, this.i));
        class037192.method_53819(class059462, (class06521)class061842, class071652.y(class059462.N().R("recipes/" + this.y.N() + "/")));
    }

    public static class06161 N(class06510 class065102, class01990 class019902, class07310 class073102) {
        return new class06161(class019902, class06156::new, class065102, class073102, 1);
    }

    public static class06161 N(class06510 class065102, class01990 class019902, class07310 class073102, int n) {
        return new class06161(class019902, class06156::new, class065102, class073102, n);
    }

    public class06161 y(String string, class06915<?> class069152) {
        this.R.put(string, class069152);
        return this;
    }

    public class06161 y(@Nullable String string) {
        this.M = string;
        return this;
    }

    public class06581 N() {
        return this.L;
    }
}

