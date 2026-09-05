/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00101
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class02055
 *  minecraft.class03543
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class05220
 *  minecraft.class05946
 *  minecraft.class08734
 *  minecraft.class08782
 *  minecraft.class09027
 *  minecraft.class09037
 *  minecraft.class09039
 *  minecraft.class09040
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import minecraft.class00101;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class02055;
import minecraft.class03543;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class05220;
import minecraft.class05946;
import minecraft.class08734;
import minecraft.class08782;
import minecraft.class09001;
import minecraft.class09027;
import minecraft.class09037;
import minecraft.class09039;
import minecraft.class09040;

public class class09016 {
    public static final class05946<class09037> N = class09016.N("server_links");
    public static final class05946<class09037> y = class09016.N("custom_options");
    public static final class05946<class09037> L = class09016.N("quick_actions");
    public static final int u = 310;
    private static final class08734 i = new class08734(new class09027(class05220.U, 200), Optional.empty());

    private static class05946<class09037> N(String string) {
        return class05946.N((class05946)class04227.yL, (class01894)class01894.y((String)string));
    }

    public static void N(class04116<class09037> class041162) {
        class02055 class020552 = class041162.N(class04227.yL);
        class041162.N(N, (Object)new class09001(new class09039((class00392)class00392.L((String)"menu.server_links.title"), Optional.of(class00392.L((String)"menu.server_links")), true, true, class08782.field_60962, List.of(), List.of()), Optional.of(i), 1, 310));
        class041162.N(y, (Object)new class09040(new class09039((class00392)class00392.L((String)"menu.custom_options.title"), Optional.of(class00392.L((String)"menu.custom_options")), true, true, class08782.field_60962, List.of(), List.of()), (class03543)class020552.y(class00101.N), Optional.of(i), 1, 310));
        class041162.N(L, (Object)new class09040(new class09039((class00392)class00392.L((String)"menu.quick_actions.title"), Optional.of(class00392.L((String)"menu.quick_actions")), true, true, class08782.field_60962, List.of(), List.of()), (class03543)class020552.y(class00101.y), Optional.of(i), 1, 310));
    }
}

