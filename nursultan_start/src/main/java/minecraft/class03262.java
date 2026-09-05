/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class05220
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06591
 *  minecraft.class07536
 *  minecraft.class08562
 */
package minecraft;

import java.util.List;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class05220;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06591;
import minecraft.class07536;
import minecraft.class08562;

public class class03262
extends class06581 {
    private static final class06541 N = class06541.field_1080;
    private static final class06541 y = class06541.field_1078;
    private static final class00392 L = class00392.L((String)class07536.N((String)"item", (class01894)class01894.y((String)"smithing_template.ingredients"))).N(N);
    private static final class00392 m = class00392.L((String)class07536.N((String)"item", (class01894)class01894.y((String)"smithing_template.applies_to"))).N(N);
    private static final class00392 P = class00392.L((String)class07536.N((String)"item", (class01894)class01894.y((String)"smithing_template"))).N(N);
    private static final class00392 s = class00392.L((String)class07536.N((String)"item", (class01894)class01894.y((String)"smithing_template.armor_trim.applies_to"))).N(y);
    private static final class00392 T = class00392.L((String)class07536.N((String)"item", (class01894)class01894.y((String)"smithing_template.armor_trim.ingredients"))).N(y);
    private static final class00392 b = class00392.L((String)class07536.N((String)"item", (class01894)class01894.y((String)"smithing_template.armor_trim.base_slot_description")));
    private static final class00392 j = class00392.L((String)class07536.N((String)"item", (class01894)class01894.y((String)"smithing_template.armor_trim.additions_slot_description")));
    private static final class00392 v = class00392.L((String)class07536.N((String)"item", (class01894)class01894.y((String)"smithing_template.netherite_upgrade.applies_to"))).N(y);
    private static final class00392 n = class00392.L((String)class07536.N((String)"item", (class01894)class01894.y((String)"smithing_template.netherite_upgrade.ingredients"))).N(y);
    private static final class00392 t = class00392.L((String)class07536.N((String)"item", (class01894)class01894.y((String)"smithing_template.netherite_upgrade.base_slot_description")));
    private static final class00392 G = class00392.L((String)class07536.N((String)"item", (class01894)class01894.y((String)"smithing_template.netherite_upgrade.additions_slot_description")));
    private static final class01894 l = class01894.y((String)"container/slot/helmet");
    private static final class01894 d = class01894.y((String)"container/slot/chestplate");
    private static final class01894 w = class01894.y((String)"container/slot/leggings");
    private static final class01894 k = class01894.y((String)"container/slot/boots");
    private static final class01894 Y = class01894.y((String)"container/slot/hoe");
    private static final class01894 Q = class01894.y((String)"container/slot/axe");
    private static final class01894 O = class01894.y((String)"container/slot/sword");
    private static final class01894 g = class01894.y((String)"container/slot/shovel");
    private static final class01894 I = class01894.y((String)"container/slot/spear");
    private static final class01894 J = class01894.y((String)"container/slot/pickaxe");
    private static final class01894 o = class01894.y((String)"container/slot/ingot");
    private static final class01894 q = class01894.y((String)"container/slot/redstone_dust");
    private static final class01894 K = class01894.y((String)"container/slot/quartz");
    private static final class01894 V = class01894.y((String)"container/slot/emerald");
    private static final class01894 e = class01894.y((String)"container/slot/diamond");
    private static final class01894 H = class01894.y((String)"container/slot/lapis_lazuli");
    private static final class01894 c = class01894.y((String)"container/slot/amethyst_shard");
    private static final class01894 X = class01894.y((String)"container/slot/nautilus_armor");
    private final class00392 a;
    private final class00392 p;
    private final class00392 F;
    private final class00392 A;
    private final List<class01894> f;
    private final List<class01894> C;

    public List<class01894> L() {
        return this.f;
    }

    private static List<class01894> P() {
        return List.of(o, q, H, K, e, V, c);
    }

    private static List<class01894> T() {
        return List.of(o);
    }

    public class03262(class00392 class003922, class00392 class003923, class00392 class003924, class00392 class003925, List<class01894> list, List<class01894> list2, class06573 class065732) {
        super(class065732);
        this.a = class003922;
        this.p = class003923;
        this.F = class003924;
        this.A = class003925;
        this.f = list;
        this.C = list2;
    }

    private static List<class01894> s() {
        return List.of(l, O, d, J, w, Q, k, Y, g, X, I);
    }

    private static List<class01894> m() {
        return List.of(l, d, w, k);
    }

    public class00392 y() {
        return this.A;
    }

    public static class03262 y(class06573 class065732) {
        return new class03262(v, n, t, G, class03262.s(), class03262.T(), class065732);
    }

    public static class03262 N(class06573 class065732) {
        return new class03262(s, T, b, j, class03262.m(), class03262.P(), class065732);
    }

    public class00392 N() {
        return this.F;
    }

    public void N(class06584 class065842, class06591 class065912, class08562 class085622, Consumer<class00392> consumer, class06497 class064972) {
        consumer.accept(P);
        consumer.accept(class05220.N);
        consumer.accept(m);
        consumer.accept((class00392)class05220.N().y(this.a));
        consumer.accept(L);
        consumer.accept((class00392)class05220.N().y(this.p));
    }

    public List<class01894> W() {
        return this.C;
    }
}

