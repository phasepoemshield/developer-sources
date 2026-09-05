/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00041
 *  minecraft.class00751
 *  minecraft.class01242
 *  minecraft.class01252
 *  minecraft.class01506
 *  minecraft.class01509
 *  minecraft.class01511
 *  minecraft.class01894
 *  minecraft.class02147
 *  minecraft.class03811
 *  minecraft.class03841
 *  minecraft.class03983
 *  minecraft.class04058
 *  minecraft.class04069
 *  minecraft.class04101
 *  minecraft.class04206
 *  minecraft.class04501
 *  minecraft.class05554
 *  minecraft.class05708
 *  minecraft.class06277
 *  minecraft.class06281
 *  minecraft.class06306
 *  minecraft.class07438
 *  minecraft.class08185
 */
package minecraft;

import java.util.function.Supplier;
import minecraft.class00041;
import minecraft.class00751;
import minecraft.class01242;
import minecraft.class01252;
import minecraft.class01506;
import minecraft.class01509;
import minecraft.class01511;
import minecraft.class01894;
import minecraft.class02147;
import minecraft.class03811;
import minecraft.class03841;
import minecraft.class03983;
import minecraft.class04058;
import minecraft.class04069;
import minecraft.class04101;
import minecraft.class04206;
import minecraft.class04501;
import minecraft.class05337;
import minecraft.class05347;
import minecraft.class05355;
import minecraft.class05360;
import minecraft.class05376;
import minecraft.class05378;
import minecraft.class05383;
import minecraft.class05554;
import minecraft.class05708;
import minecraft.class06277;
import minecraft.class06281;
import minecraft.class06306;
import minecraft.class07438;
import minecraft.class08185;

public class class05340<U extends class05355<?>> {
    public static final class05340<class05347> N = class05340.N("dummy", class05347::new);
    public static final class05340<class01506> y = class05340.N("nearest_items", class01506::new);
    public static final class05340<class05360<class07438>> L = class05340.N("nearest_living_entities", class05360::new);
    public static final class05340<class05383> u = class05340.N("nearest_players", class05383::new);
    public static final class05340<class06277> i = class05340.N("nearest_bed", class06277::new);
    public static final class05340<class05337> R = class05340.N("hurt_by", class05337::new);
    public static final class05340<class05376> M = class05340.N("villager_hostiles", class05376::new);
    public static final class05340<class06306> B = class05340.N("villager_babies", class06306::new);
    public static final class05340<class06281> Z = class05340.N("secondary_pois", class06281::new);
    public static final class05340<class05708> z = class05340.N("golem_detected", class05708::new);
    public static final class05340<class03841<class03811>> U = class05340.N("armadillo_scare_detected", () -> new class03841(5, class03811::N, class03811::l, class05378.o, 80));
    public static final class05340<class01509> E = class05340.N("piglin_specific_sensor", class01509::new);
    public static final class05340<class01242> W = class05340.N("piglin_brute_specific_sensor", class01242::new);
    public static final class05340<class01511> m = class05340.N("hoglin_specific_sensor", class01511::new);
    public static final class05340<class01252> P = class05340.N("nearest_adult", class01252::new);
    public static final class05340<class01252> s = class05340.N("nearest_adult_any_type", class00041::new);
    public static final class05340<class02147> T = class05340.N("axolotl_attackables", class02147::new);
    public static final class05340<class05554> b = class05340.N("food_temptations", class05554::y);
    public static final class05340<class05554> j = class05340.N("frog_temptations", () -> new class05554(class04058.N()));
    public static final class05340<class05554> v = class05340.N("nautilus_temptations", () -> new class05554(class08185.y()));
    public static final class05340<class04069> n = class05340.N("frog_attackables", class04069::new);
    public static final class05340<class04101> t = class05340.N("is_in_water", class04101::new);
    public static final class05340<class03983> G = class05340.N("warden_entity_sensor", class03983::new);
    public static final class05340<class04501> l = class05340.N("breeze_attack_entity_sensor", class04501::new);
    private final Supplier<U> d;

    public class05340(Supplier<U> supplier) {
        this.d = supplier;
    }

    public U N() {
        return (U)((class05355)this.d.get());
    }

    private static <U extends class05355<?>> class05340<U> N(String string, Supplier<U> supplier) {
        return (class05340)class00751.N((class00751)class04206.Y, (class01894)class01894.y((String)string), new class05340<U>(supplier));
    }
}

