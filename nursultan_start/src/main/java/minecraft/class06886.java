/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10758
 *  minecraft.class00812
 *  minecraft.class01894
 *  minecraft.class01990
 *  minecraft.class02484
 *  minecraft.class03719
 *  minecraft.class03741
 *  minecraft.class03774
 *  minecraft.class05544
 *  minecraft.class05636
 *  minecraft.class05641
 *  minecraft.class05654
 *  minecraft.class05869
 *  minecraft.class05946
 *  minecraft.class06510
 *  minecraft.class06514
 *  minecraft.class06521
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07165
 *  minecraft.class07293
 *  minecraft.class07310
 *  minecraft.class07313
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
import minecraft.class02484;
import minecraft.class03719;
import minecraft.class03741;
import minecraft.class03774;
import minecraft.class05544;
import minecraft.class05636;
import minecraft.class05641;
import minecraft.class05654;
import minecraft.class05869;
import minecraft.class05946;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06521;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06915;
import minecraft.class06918;
import minecraft.class07165;
import minecraft.class07293;
import minecraft.class07310;
import minecraft.class07313;
import org.jspecify.annotations.Nullable;

public class class06886
implements class05544 {
    private final class01990 y;
    private final class03774 L;
    private final class06581 u;
    private final class06510 i;
    private final float R;
    private final int M;
    private final Map<String, class06915<?>> B = new LinkedHashMap();
    private @Nullable String Z;
    private final class07293<?> z;

    public static class06886 L(class06510 class065102, class01990 class019902, class07310 class073102, float f, int n) {
        return new class06886(class019902, class06886.N(class073102), class073102, class065102, f, n, class05654::new);
    }

    private static class03774 L(class07310 class073102) {
        if (class073102.B() instanceof class06918) {
            return class03774.field_40243;
        }
        return class03774.field_40244;
    }

    private class06886(class01990 class019902, class03774 class037742, class07310 class073102, class06510 class065102, float f, int n, class07293<?> class072932) {
        this.y = class019902;
        this.L = class037742;
        this.u = class073102.B();
        this.i = class065102;
        this.R = f;
        this.M = n;
        this.z = class072932;
    }

    public static class06886 u(class06510 class065102, class01990 class019902, class07310 class073102, float f, int n) {
        return new class06886(class019902, class03774.field_40242, class073102, class065102, f, n, class05636::new);
    }

    public static class06886 y(class06510 class065102, class01990 class019902, class07310 class073102, float f, int n) {
        return new class06886(class019902, class06886.L(class073102), class073102, class065102, f, n, class05641::new);
    }

    private static class03774 N(class07310 class073102) {
        if (class073102.B().R().N(class02484.d)) {
            return class03774.field_40242;
        }
        if (class073102.B() instanceof class06918) {
            return class03774.field_40243;
        }
        return class03774.field_40244;
    }

    private class05946 N(class05946 class059462, class03719 class037192) {
        return class05946.N((class05946)class059462.L(), (class01894)class037192.getRecipeIdentifier(class059462.N()));
    }

    private static class03774 N(class06514<? extends class07313> class065142, class07310 class073102) {
        if (class065142 == class06514.s) {
            return class06886.N(class073102);
        }
        if (class065142 == class06514.T) {
            return class06886.L(class073102);
        }
        if (class065142 == class06514.b || class065142 == class06514.j) {
            return class03774.field_40242;
        }
        throw new IllegalStateException("Unknown cooking recipe type");
    }

    private void N(class05946<class06521<?>> class059462) {
        if (this.B.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + String.valueOf(class059462.N()));
        }
    }

    public static <T extends class07313> class06886 N(class06510 class065102, class01990 class019902, class07310 class073102, float f, int n, class06514<T> class065142, class07293<T> class072932) {
        return new class06886(class019902, class06886.N(class065142, class073102), class073102, class065102, f, n, class072932);
    }

    public static class06886 N(class06510 class065102, class01990 class019902, class07310 class073102, float f, int n) {
        return new class06886(class019902, class03774.field_40242, class073102, class065102, f, n, class05869::new);
    }

    public class06886 y(String string, class06915<?> class069152) {
        this.B.put(string, class069152);
        return this;
    }

    public class06886 y(@Nullable String string) {
        this.Z = string;
        return this;
    }

    public class06581 N() {
        return this.u;
    }

    public void N(class03719 class037192, class05946<class06521<?>> class059462) {
        class059462 = this.N(class059462, class037192);
        this.N(class059462);
        class07165 class071652 = class037192.method_53818().N("has_the_recipe", class00812.N((class05946)class059462)).N(class10758.L((class05946)class059462)).N(class03741.y);
        this.B.forEach((arg_0, arg_1) -> ((class07165)class071652).N(arg_0, arg_1));
        class07313 class073132 = this.z.create(Objects.requireNonNullElse(this.Z, ""), this.L, this.i, new class06584((class07310)this.u), this.R, this.M);
        class037192.method_53819(class059462, (class06521)class073132, class071652.y(class059462.N().R("recipes/" + this.y.N() + "/")));
    }
}

