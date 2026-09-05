/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00717
 *  minecraft.class00737
 *  minecraft.class01289
 *  minecraft.class01296
 *  minecraft.class04051
 *  minecraft.class04782
 *  minecraft.class05352
 *  minecraft.class05378
 *  minecraft.class05475
 *  minecraft.class05744
 *  minecraft.class05751
 *  minecraft.class05779
 *  minecraft.class06577
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class07475
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import minecraft.class00717;
import minecraft.class00737;
import minecraft.class01289;
import minecraft.class01296;
import minecraft.class04051;
import minecraft.class04782;
import minecraft.class05352;
import minecraft.class05378;
import minecraft.class05475;
import minecraft.class05744;
import minecraft.class05751;
import minecraft.class05779;
import minecraft.class06577;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class07475;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;

public class class06293 {
    private static void L(class07438 class074382, class07438 class074383) {
        class06293.N(class074382, class074383);
        class06293.N(class074383, class074382);
    }

    private class06293() {
    }

    public static boolean y(class07438 class074382, class07438 class074383) {
        class01289 var2 = class074382.method_18868();
        if (!var2.N(class05378.B)) {
            return false;
        }
        return ((class04051)var2.L(class05378.B).get()).N(class074383);
    }

    private static void y(class07438 class074382, class07438 class074383, float f, int n) {
        class06293.N(class074382, (class07049)class074383, f, n);
        class06293.N(class074383, (class07049)class074382, f, n);
    }

    public static boolean N(class07438 class074382, class07438 class074383, double d) {
        Optional var4 = class074382.method_18868().L(class05378.s);
        if (var4.isEmpty()) {
            return false;
        }
        double d2 = class074382.method_5707(((class07438)var4.get()).method_73189());
        return class074382.method_5707(class074383.method_73189()) > d2 + d * d;
    }

    public static class07438 N(class07438 class074382, class07438 class074383, class07438 class074384) {
        class06889 class068892 = class074383.method_73189();
        class06889 class068893 = class074384.method_73189();
        return class074382.method_5707(class068892) < class074382.method_5707(class068893) ? class074383 : class074384;
    }

    public static Optional<class07438> N(class07438 class074382, class05378<UUID> class053782) {
        return class074382.method_18868().L(class053782).map(uUID -> class074382.method_73183().method_66347(uUID)).map(class070492 -> class070492 instanceof class07438 ? (class07438)class070492 : null);
    }

    public static class07438 N(class07438 class074382, Optional<class07438> optional, class07438 class074383) {
        if (optional.isEmpty()) {
            return class074383;
        }
        return class06293.N(class074382, optional.get(), class074383);
    }

    public static boolean N(class07438 class074382) {
        return class074382.method_18868().N(class05378.j);
    }

    public static @Nullable class06889 N(class07475 class074752, int n, int n2) {
        class06889 class068892 = class05475.N((class07475)class074752, (int)n, (int)n2);
        int n3 = 0;
        while (class068892 != null && !class074752.method_73183().method_8320(class07209.method_49638((class00737)class068892)).N(class08791.field_48) && n3++ < 10) {
            class068892 = class05475.N((class07475)class074752, (int)n, (int)n2);
        }
        return class068892;
    }

    public static void N(class07438 class074382, class07049 class070492, float f, int n) {
        class06293.N(class074382, (class05779)new class05751(class070492, true), f, n);
    }

    public static void N(class07438 class074382, class07438 class074383) {
        class074382.method_18868().N(class05378.P, (Object)new class05751((class07049)class074383, true));
    }

    private static boolean N(class01289<?> class012892, class05378<? extends class07438> class053782, Predicate<class07438> predicate) {
        return class012892.L(class053782).filter(predicate).filter(class07438::method_5805).filter(class074382 -> class06293.N(class012892, class074382)).isPresent();
    }

    public static boolean N(class01289<?> class012892, class05378<? extends class07438> class053782, class07078<?> class070782) {
        return class06293.N(class012892, class053782, (class07438 class074382) -> class074382.method_5864() == class070782);
    }

    public static boolean N(class01289<?> class012892, class07438 class074382) {
        Optional var2 = class012892.L(class05378.B);
        return var2.isPresent() && ((class04051)var2.get()).N(class074382);
    }

    public static void N(class07438 class074382, class07438 class074383, float f, int n) {
        class06293.L(class074382, class074383);
        class06293.y(class074382, class074383, f, n);
    }

    public static boolean N(class07079 class070792, class07438 class074382, int n) {
        class06581 class065812 = class070792.method_6047().B();
        if (class065812 instanceof class06577) {
            class06577 class065772 = (class06577)class065812;
            if (class070792.y(class070792.method_6047())) {
                int n2 = class065772.y() - n;
                return class070792.method_24516((class07049)class074382, (double)n2);
            }
        }
        return class070792.L(class074382);
    }

    public static class01296 N(class04782 class047822, class01296 class012963, int n) {
        int n2 = class047822.method_19498(class012963);
        return class01296.N((class01296)class012963, (int)n).filter(class012962 -> class047822.method_19498(class012962) < n2).min(Comparator.comparingInt(arg_0 -> ((class04782)class047822).method_19498(arg_0))).orElse(class012963);
    }

    public static void N(class07438 class074382, class06584 class065842, class06889 class068892, class06889 class068893, float f) {
        double d = class074382.method_23320() - (double)f;
        class00717 class007172 = new class00717(class074382.method_73183(), class074382.method_23317(), d, class074382.method_23321(), class065842);
        class007172.N((class07049)class074382);
        class06889 class068894 = class068892.u(class074382.method_73189());
        class068894 = class068894.u().u(class068893.M, class068893.B, class068893.Z);
        class007172.method_18799(class068894);
        class007172.L();
        class074382.method_73183().method_8649((class07049)class007172);
    }

    public static void N(class07438 class074382, class06584 class065842, class06889 class068892) {
        class06889 class068893 = new class06889((double)0.3f, (double)0.3f, (double)0.3f);
        class06293.N(class074382, class065842, class068892, class068893, 0.3f);
    }

    public static void N(class07438 class074382, class05779 class057792, float f, int n) {
        class05352 class053522 = new class05352(class057792, f, n);
        class074382.method_18868().N(class05378.P, (Object)class057792);
        class074382.method_18868().N(class05378.m, (Object)class053522);
    }

    public static void N(class07438 class074382, class07209 class072092, float f, int n) {
        class06293.N(class074382, (class05779)new class05744(class072092), f, n);
    }
}

