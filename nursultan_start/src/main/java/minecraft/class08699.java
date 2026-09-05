/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11647
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class05946
 *  minecraft.class06563
 *  minecraft.class07536
 */
package minecraft;

import Nursultan.class11647;
import java.util.Map;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class05946;
import minecraft.class06563;
import minecraft.class07536;

public interface class08699 {
    public static final class05946<? extends class00751<class11647>> N = class05946.N((class01894)class01894.y((String)"equipment_asset"));
    public static final class05946<class11647> y = class08699.N("leather");
    public static final class05946<class11647> L = class08699.N("copper");
    public static final class05946<class11647> u = class08699.N("chainmail");
    public static final class05946<class11647> i = class08699.N("iron");
    public static final class05946<class11647> R = class08699.N("gold");
    public static final class05946<class11647> M = class08699.N("diamond");
    public static final class05946<class11647> B = class08699.N("turtle_scute");
    public static final class05946<class11647> Z = class08699.N("netherite");
    public static final class05946<class11647> z = class08699.N("armadillo_scute");
    public static final class05946<class11647> U = class08699.N("elytra");
    public static final class05946<class11647> E = class08699.N("saddle");
    public static final Map<class06563, class05946<class11647>> W = class07536.N_74(class06563.class, class065632 -> class08699.N(class065632.method_15434() + "_carpet"));
    public static final class05946<class11647> m = class08699.N("trader_llama");
    public static final Map<class06563, class05946<class11647>> P = class07536.N_74(class06563.class, class065632 -> class08699.N(class065632.method_15434() + "_harness"));

    public static class05946<class11647> N(String string) {
        return class05946.N(N, (class01894)class01894.y((String)string));
    }
}

