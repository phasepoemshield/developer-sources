/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01191
 *  minecraft.class04887
 *  minecraft.class05163
 *  minecraft.class05974
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07284
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.OptionalInt;
import java.util.function.Predicate;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01191;
import minecraft.class04887;
import minecraft.class05163;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06076;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07284;

public class class06070
extends class06391<class06076> {
    private static boolean L(class00500 class005002) {
        return class005002.N(class00869.K) || class005002.P();
    }

    public class06070(Codec<class06076> codec) {
        super(codec);
    }

    private boolean y(class05974 class059742, class07209 class072092) {
        if (class06070.L(class059742.method_8320(class072092)) || this.N((class07284)class059742, class072092.method_10074(), class07211.field_11036)) {
            return false;
        }
        for (class07211 class072112 : class07221.field_11062) {
            if (!this.N((class07284)class059742, class072092.method_10093(class072112), class072112.b())) continue;
            return false;
        }
        return true;
    }

    private boolean N(class07284 class072842, class07209 class072092, class07211 class072112) {
        class00494 class004942 = class072842.method_8320(class072092).N(class072112);
        return class004942 == class00389.N() || !class00891.N((class00494)class004942);
    }

    private static OptionalInt N(class05974 class059742, class07209 class072092, class06076 class060762) {
        Predicate<class00500> predicate = class005002 -> class005002.N(class00869.K);
        Predicate<class00500> predicate2 = class005002 -> !class005002.N(class00869.K);
        return class01191.N((class04887)class059742, (class07209)class072092, (int)class060762.y, predicate, predicate2).map(class01191::L).orElseGet(OptionalInt::empty);
    }

    public boolean N(class06058<class06076> class060582) {
        class00753 class007532;
        class05974 class059742 = class060582.y();
        class07209 class072093 = class060582.i();
        class06076 class060762 = class060582.R();
        class06069 class060692 = class060582.u();
        OptionalInt optionalInt = class06070.N(class059742, class072093, class060762);
        if (optionalInt.isEmpty()) {
            return false;
        }
        class07209 class072094 = class072093.method_33096(optionalInt.getAsInt());
        return class07209.method_23627((class05163)class05163.N((class00753)class072094.method_10059(class007532 = new class00753(class060762.L, class060762.L, class060762.L)), (class00753)class072094.method_10081(class007532))).filter(class072092 -> class060692.z() < class060762.u).filter(class072092 -> this.y(class059742, (class07209)class072092)).mapToInt(class072092 -> {
            class059742.method_8652(class072092, class00869.EI.W(), 2);
            return 1;
        }).sum() > 0;
    }
}

