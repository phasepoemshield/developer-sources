/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01231
 *  minecraft.class07209
 *  minecraft.class07290
 */
package minecraft;

import minecraft.class01231;
import minecraft.class02866;
import minecraft.class02875;
import minecraft.class07209;
import minecraft.class07290;

public interface class02883 {
    public static final class02875 N = (class054872, class072092, class070782) -> true;
    public static final class02875 y = (class054872, class072092, class070782) -> {
        if (class070782 == null || !class054872.method_8621().N(class072092)) {
            return false;
        }
        class07209 class072093 = class072092.method_10084();
        return class054872.method_8316(class072092).N(class01231.N) && !class054872.method_8320(class072093).u((class07290)class054872, class072093);
    };
    public static final class02875 L = (class054872, class072092, class070782) -> {
        if (class070782 == null || !class054872.method_8621().N(class072092)) {
            return false;
        }
        return class054872.method_8316(class072092).N(class01231.y);
    };
    public static final class02875 u = new class02866();
}

