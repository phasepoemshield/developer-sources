/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11647
 *  minecraft.class01894
 *  minecraft.class01996
 *  minecraft.class01997
 *  minecraft.class02024
 *  minecraft.class04476
 *  minecraft.class05946
 *  minecraft.class06563
 *  minecraft.class07135
 */
package minecraft;

import Nursultan.class11647;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import minecraft.class01894;
import minecraft.class01996;
import minecraft.class01997;
import minecraft.class02024;
import minecraft.class04476;
import minecraft.class05946;
import minecraft.class06563;
import minecraft.class07135;
import minecraft.class08699;
import minecraft.class08706;
import minecraft.class08719;
import minecraft.class08732;

public class class08729
implements class07135 {
    private final class01997 N;

    public class08729(class01996 class019962) {
        this.N = class019962.method_45973(class02024.field_39368, "equipment");
    }

    private static class08732 y(String string) {
        return class08732.N().N(class01894.y((String)string)).N(class08719.field_54129, class08706.N(class01894.y((String)string), false)).N(class08719.field_63622, class08706.N(class01894.y((String)string), false)).N();
    }

    private static void N(BiConsumer<class05946<class11647>, class08732> biConsumer) {
        class06563 class065632;
        biConsumer.accept(class08699.y, class08732.N().N(class01894.y((String)"leather"), true).N(class01894.y((String)"leather_overlay"), false).N(class08719.field_54129, class08706.N(class01894.y((String)"leather"), true), class08706.N(class01894.y((String)"leather_overlay"), false)).N());
        biConsumer.accept(class08699.u, class08729.N("chainmail"));
        biConsumer.accept(class08699.L, class08729.y("copper"));
        biConsumer.accept(class08699.i, class08729.y("iron"));
        biConsumer.accept(class08699.R, class08729.y("gold"));
        biConsumer.accept(class08699.M, class08729.y("diamond"));
        biConsumer.accept(class08699.B, class08732.N().y(class01894.y((String)"turtle_scute"), false).N());
        biConsumer.accept(class08699.Z, class08729.y("netherite"));
        biConsumer.accept(class08699.z, class08732.N().N(class08719.field_54128, class08706.y(class01894.y((String)"armadillo_scute"), false)).N(class08719.field_54128, class08706.y(class01894.y((String)"armadillo_scute_overlay"), true)).N());
        biConsumer.accept(class08699.U, class08732.N().N(class08719.field_54127, new class08706(class01894.y((String)"elytra"), Optional.empty(), true)).N());
        class08706 class087062 = new class08706(class01894.y((String)"saddle"));
        biConsumer.accept(class08699.E, class08732.N().N(class08719.field_56123, class087062).N(class08719.field_56124, class087062).N(class08719.field_56125, class087062).N(class08719.field_64249, class087062).N(class08719.field_56126, class087062).N(class08719.field_56127, class087062).N(class08719.field_56128, class087062).N(class08719.field_56130, class087062).N(class08719.field_56129, class087062).N(class08719.field_63621, class087062).N());
        for (Map.Entry<class06563, class05946<class11647>> entry : class08699.P.entrySet()) {
            class065632 = entry.getKey();
            class05946<class11647> var5 = entry.getValue();
            biConsumer.accept(var5, class08732.N().N(class08719.field_59984, class08706.y(class01894.y((String)(class065632.method_15434() + "_harness")), false)).N());
        }
        for (Map.Entry<class06563, class05946<class11647>> entry : class08699.W.entrySet()) {
            class065632 = entry.getKey();
            class05946<class11647> class059462 = entry.getValue();
            biConsumer.accept(class059462, class08732.N().N(class08719.field_54130, new class08706(class01894.y((String)class065632.method_15434()))).N());
        }
        biConsumer.accept(class08699.m, class08732.N().N(class08719.field_54130, new class08706(class01894.y((String)"trader_llama"))).N());
    }

    private static class08732 N(String string) {
        return class08732.N().N(class01894.y((String)string)).N();
    }

    public String method_10321() {
        return "Equipment Asset Definitions";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        HashMap hashMap = new HashMap();
        class08729.N((class05946<class11647> class059462, class08732 class087322) -> {
            if (hashMap.putIfAbsent(class059462, class087322) != null) {
                throw new IllegalStateException("Tried to register equipment asset twice for id: " + String.valueOf(class059462));
            }
        });
        return class07135.N((class04476)class044762, class08732.N, arg_0 -> ((class01997)this.N).N(arg_0), hashMap);
    }
}

