/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00500
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07299
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00901;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07299;

public interface class00873 {
    default public class07209 N(class07209 class072092) {
        return switch (this.ay_().ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class072092.method_10084();
            case 1 -> class072092;
        };
    }

    private static Optional<class07209> N(List<class07211> list, class05487 class054872, class07209 class072092, class00500 class005002) {
        for (class07211 class072112 : list) {
            class07209 class072093 = class072092.method_10093(class072112);
            if (!class054872.R(class072093) || !class005002.N(class054872, class072093)) continue;
            return Optional.of(class072093);
        }
        return Optional.empty();
    }

    public static Optional<class07209> N(class07299 class072992, class07209 class072092, class00500 class005002) {
        return class00873.N(class07221.field_11062.L(class072992.field_9229), (class05487)class072992, class072092, class005002);
    }

    public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4);

    public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4);

    public boolean N(class05487 var1, class07209 var2, class00500 var3);

    default public class00901 ay_() {
        return class00901.field_47835;
    }

    public static boolean a_(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class00873.N(class07221.field_11062.N().toList(), class054872, class072092, class005002).isPresent();
    }
}

