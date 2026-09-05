/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01224
 *  minecraft.class01894
 *  minecraft.class03860
 *  minecraft.class04890
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07209
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class01224;
import minecraft.class01894;
import minecraft.class03860;
import minecraft.class04890;
import minecraft.class05165;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07209;

public class class05173 {
    public static final int N = 90;
    static final class01894 y = class01894.y((String)"igloo/top");
    private static final class01894 i = class01894.y((String)"igloo/middle");
    private static final class01894 R = class01894.y((String)"igloo/bottom");
    static final Map<class01894, class07209> L = ImmutableMap.of((Object)y, (Object)new class07209(3, 5, 5), (Object)i, (Object)new class07209(1, 3, 1), (Object)R, (Object)new class07209(3, 6, 7));
    static final Map<class01894, class07209> u = ImmutableMap.of((Object)y, (Object)class07209.field_10980, (Object)i, (Object)new class07209(2, -3, 4), (Object)R, (Object)new class07209(0, -3, -2));

    public static void N(class01224 class012242, class07209 class072092, class06993 class069932, class03860 class038602, class06069 class060692) {
        if (class060692.U() < 0.5) {
            int n = class060692.y(8) + 4;
            class038602.N((class04890)new class05165(class012242, R, class072092, class069932, n * 3));
            for (int i = 0; i < n - 1; ++i) {
                class038602.N((class04890)new class05165(class012242, class05173.i, class072092, class069932, i * 3));
            }
        }
        class038602.N((class04890)new class05165(class012242, y, class072092, class069932, 0));
    }
}

