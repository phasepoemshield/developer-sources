/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10758
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  minecraft.class00812
 *  minecraft.class01894
 *  minecraft.class01990
 *  minecraft.class02055
 *  minecraft.class03530
 *  minecraft.class03543
 *  minecraft.class03719
 *  minecraft.class03741
 *  minecraft.class04493
 *  minecraft.class05544
 *  minecraft.class05946
 *  minecraft.class06510
 *  minecraft.class06521
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07165
 *  minecraft.class07310
 *  minecraft.class07329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10758;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
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
import minecraft.class04493;
import minecraft.class05544;
import minecraft.class05946;
import minecraft.class06510;
import minecraft.class06521;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06915;
import minecraft.class07165;
import minecraft.class07310;
import minecraft.class07329;
import org.jspecify.annotations.Nullable;

public class class06870
implements class05544 {
    private final class02055<class06581> y;
    private final class01990 L;
    private final class06581 u;
    private final int i;
    private final List<String> R = Lists.newArrayList();
    private final Map<Character, class06510> M = Maps.newLinkedHashMap();
    private final Map<String, class06915<?>> B = new LinkedHashMap();
    private @Nullable String Z;
    private boolean z = true;

    public class06870 y(@Nullable String string) {
        this.Z = string;
        return this;
    }

    private class06870(class02055<class06581> class020552, class01990 class019902, class07310 class073102, int n) {
        this.y = class020552;
        this.L = class019902;
        this.u = class073102.B();
        this.i = n;
    }

    public class06581 N() {
        return this.u;
    }

    public void N(class03719 class037192, class05946<class06521<?>> class059462) {
        class059462 = this.N(class059462, class037192);
        class04493 class044932 = this.N(class059462);
        class07165 class071652 = class037192.method_53818().N("has_the_recipe", class00812.N((class05946)class059462)).N(class10758.L((class05946)class059462)).N(class03741.y);
        this.B.forEach((arg_0, arg_1) -> ((class07165)class071652).N(arg_0, arg_1));
        class07329 class073292 = new class07329(Objects.requireNonNullElse(this.Z, ""), class05544.N((class01990)this.L), class044932, new class06584((class07310)this.u, this.i), this.z);
        class037192.method_53819(class059462, (class06521)class073292, class071652.y(class059462.N().R("recipes/" + this.L.N() + "/")));
    }

    public class06870 N(boolean bl) {
        this.z = bl;
        return this;
    }

    private class04493 N(class05946<class06521<?>> class059462) {
        if (this.B.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + String.valueOf(class059462.N()));
        }
        return class04493.N(this.M, this.R);
    }

    private class05946 N(class05946 class059462, class03719 class037192) {
        return class05946.N((class05946)class059462.L(), (class01894)class037192.getRecipeIdentifier(class059462.N()));
    }

    public class06870 N(Character c, class06510 class065102) {
        if (this.M.containsKey(c)) {
            throw new IllegalArgumentException("Symbol '" + c + "' is already defined!");
        }
        if (c.charValue() == ' ') {
            throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
        }
        this.M.put(c, class065102);
        return this;
    }

    public class06870 N(Character c, class07310 class073102) {
        return this.N(c, class06510.method_8101((class07310)class073102));
    }

    public class06870 N(Character c, class03530<class06581> class035302) {
        return this.N(c, class06510.method_8106((class03543)this.y.y(class035302)));
    }

    public static class06870 N(class02055<class06581> class020552, class01990 class019902, class07310 class073102, int n) {
        return new class06870(class020552, class019902, class073102, n);
    }

    public class06870 N(String string) {
        if (!this.R.isEmpty() && string.length() != this.R.get(0).length()) {
            throw new IllegalArgumentException("Pattern must be the same width on every line!");
        }
        this.R.add(string);
        return this;
    }

    public class06870 y(String string, class06915<?> class069152) {
        this.B.put(string, class069152);
        return this;
    }

    public static class06870 N(class02055<class06581> class020552, class01990 class019902, class07310 class073102) {
        return class06870.N(class020552, class019902, class073102, 1);
    }
}

