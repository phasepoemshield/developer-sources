/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10758
 *  minecraft.class00812
 *  minecraft.class01894
 *  minecraft.class01990
 *  minecraft.class02055
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03719
 *  minecraft.class03741
 *  minecraft.class05544
 *  minecraft.class05946
 *  minecraft.class06510
 *  minecraft.class06521
 *  minecraft.class06523
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07165
 *  minecraft.class07310
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10758;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import minecraft.class00812;
import minecraft.class01894;
import minecraft.class01990;
import minecraft.class02055;
import minecraft.class03530;
import minecraft.class03543;
import minecraft.class03719;
import minecraft.class03741;
import minecraft.class05544;
import minecraft.class05946;
import minecraft.class06510;
import minecraft.class06521;
import minecraft.class06523;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06915;
import minecraft.class07165;
import minecraft.class07310;
import org.jspecify.annotations.Nullable;

public class class06895
implements class05544 {
    private final class02055<class06581> y;
    private final class01990 L;
    private final class06584 u;
    private final List<class06510> i = new ArrayList<class06510>();
    private final Map<String, class06915<?>> R = new LinkedHashMap();
    private @Nullable String M;

    private class06895(class02055<class06581> class020552, class01990 class019902, class06584 class065842) {
        this.y = class020552;
        this.L = class019902;
        this.u = class065842;
    }

    public class06895 y(String string, class06915<?> class069152) {
        this.R.put(string, class069152);
        return this;
    }

    public class06895 y(@Nullable String string) {
        this.M = string;
        return this;
    }

    public class06581 N() {
        return this.u.B();
    }

    public void N(class03719 class037192, class05946<class06521<?>> class059462) {
        class059462 = this.N(class059462, class037192);
        this.N(class059462);
        class07165 class071652 = class037192.method_53818().N("has_the_recipe", class00812.N((class05946)class059462)).N(class10758.L((class05946)class059462)).N(class03741.y);
        this.R.forEach((arg_0, arg_1) -> ((class07165)class071652).N(arg_0, arg_1));
        class06523 class065232 = new class06523(Objects.requireNonNullElse(this.M, ""), class05544.N((class01990)this.L), this.u, this.i);
        class037192.method_53819(class059462, (class06521)class065232, class071652.y(class059462.N().R("recipes/" + this.L.N() + "/")));
    }

    private void N(class05946<class06521<?>> class059462) {
        if (this.R.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + String.valueOf(class059462.N()));
        }
    }

    private class05946 N(class05946 class059462, class03719 class037192) {
        return class05946.N((class05946)class059462.L(), (class01894)class037192.getRecipeIdentifier(class059462.N()));
    }

    public class06895 N(class03530<class06581> class035302) {
        return this.N(class06510.method_8106((class03543)this.y.y(class035302)));
    }

    public static class06895 N(class02055<class06581> class020552, class01990 class019902, class07310 class073102, int n) {
        return new class06895(class020552, class019902, class073102.B().E().L(n));
    }

    public static class06895 N(class02055<class06581> class020552, class01990 class019902, class07310 class073102) {
        return class06895.N(class020552, class019902, class073102, 1);
    }

    public static class06895 N(class02055<class06581> class020552, class01990 class019902, class06584 class065842) {
        return new class06895(class020552, class019902, class065842);
    }

    public class06895 N(class06510 class065102, int n) {
        for (int i = 0; i < n; ++i) {
            this.i.add(class065102);
        }
        return this;
    }

    public class06895 N(class06510 class065102) {
        return this.N(class065102, 1);
    }

    public class06895 N(class07310 class073102, int n) {
        for (int i = 0; i < n; ++i) {
            this.N(class06510.method_8101((class07310)class073102));
        }
        return this;
    }

    public class06895 N(class07310 class073102) {
        return this.N(class073102, 1);
    }
}

