/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class00765
 *  minecraft.class00780
 *  minecraft.class00782
 *  minecraft.class01022
 *  minecraft.class01584
 *  minecraft.class01896
 *  minecraft.class01929
 *  minecraft.class01935
 *  minecraft.class02055
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04382
 *  minecraft.class04865
 *  minecraft.class05096
 *  minecraft.class05213
 *  minecraft.class05357
 *  minecraft.class05737
 *  minecraft.class07850
 *  minecraft.class08088
 */
package minecraft;

import java.util.Map;
import java.util.Optional;
import minecraft.class00751;
import minecraft.class00765;
import minecraft.class00780;
import minecraft.class00782;
import minecraft.class01022;
import minecraft.class01584;
import minecraft.class01896;
import minecraft.class01929;
import minecraft.class01935;
import minecraft.class02055;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04382;
import minecraft.class04865;
import minecraft.class05096;
import minecraft.class05213;
import minecraft.class05357;
import minecraft.class05737;
import minecraft.class05943;
import minecraft.class05946;
import minecraft.class05964;
import minecraft.class07850;
import minecraft.class08088;

public interface class05966 {
    public static final Map<Optional<class05946<class04382>>, class05966> N = Map.of(Optional.of(class05964.y), (class052132, class018962) -> {
        class08088 class080882 = class018962.i().N();
        class01022 class010222 = class018962.N();
        class00751 class007512 = class010222.L(class04227.NA);
        class00751 class007513 = class010222.L(class04227.yb);
        class00751 class007514 = class010222.L(class04227.ys);
        return new class05737(class052132, class015842 -> class052132.N().N(class05966.N(class015842)), class080882 instanceof class07850 ? ((class07850)class080882).B() : class01584.N((class02055)class007512, (class02055)class007513, (class02055)class007514));
    }, Optional.of(class05964.i), (class052132, class018962) -> new class05357((class05096)class052132, class018962, class035562 -> class052132.N().N(class05966.N((class03556<class00780>)class035562))));

    public static class01935 N(class01584 class015842) {
        return (class010222, class037642) -> {
            class07850 class078502 = new class07850(class015842);
            return class037642.N((class01929)class010222, (class08088)class078502);
        };
    }

    private static class01935 N(class03556<class00780> class035562) {
        return (class010222, class037642) -> {
            class03529 class035292 = class010222.L(class04227.yE).y(class05943.L);
            class00782 class007822 = new class00782(class035562);
            class04865 class048652 = new class04865((class00765)class007822, (class03556)class035292);
            return class037642.N((class01929)class010222, (class08088)class048652);
        };
    }

    public class05096 createEditScreen(class05213 var1, class01896 var2);
}

