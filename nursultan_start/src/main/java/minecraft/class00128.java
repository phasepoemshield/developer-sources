/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class02102
 *  minecraft.class03725
 *  minecraft.class03943
 *  minecraft.class04927
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class09035
 */
package minecraft;

import java.util.Objects;
import java.util.function.Supplier;
import minecraft.class00096;
import minecraft.class00102;
import minecraft.class00127;
import minecraft.class00129;
import minecraft.class00392;
import minecraft.class01590;
import minecraft.class02102;
import minecraft.class03725;
import minecraft.class03943;
import minecraft.class04927;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class09035;

class class00128
implements class00127<class09035> {
    class00128() {
    }

    @Override
    public void N(class09035 class090352, class05096 class050962, class00129 class001292) {
        Supplier<String> supplier;
        class00102 class001022;
        class00102 class001023;
        class01590 class015902 = class050962.method_64506();
        if (class090352.M().isPresent()) {
            class001023 = (class00102)((Object)class090352.M().get());
            int n = class001023.y().orElseGet(() -> {
                int n = class001023.N().orElse(4);
                Objects.requireNonNull(class015902);
                return Math.min(9 * n + 8, 512);
            });
            class03943 class039432 = class03943.L().N(class015902, class090352.y(), n, class05220.N);
            class039432.N(class090352.R());
            class001023.N().ifPresent(arg_0 -> ((class03943)class039432).y(arg_0));
            class039432.N(class090352.i());
            class001022 = class039432;
            supplier = () -> ((class03943)class039432).y();
        } else {
            class001023 = new class04927(class015902, class090352.y(), 20, class090352.L());
            class001023.method_1880(class090352.R());
            class001023.method_1852(class090352.i());
            class001022 = class001023;
            supplier = () -> ((class04927)class001023).method_1882();
        }
        class001023 = class090352.u() ? class03725.N((class01590)class015902, (class02102)class001022, (class00392)class090352.L()) : class001022;
        class001292.accept((class02102)class001023, new class00096(this, supplier));
    }
}

