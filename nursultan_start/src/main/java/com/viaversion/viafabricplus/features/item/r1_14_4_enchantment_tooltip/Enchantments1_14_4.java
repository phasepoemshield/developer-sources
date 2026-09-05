/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.util.Key
 *  minecraft.class05946
 *  minecraft.class07304
 *  minecraft.class07314
 */
package com.viaversion.viafabricplus.features.item.r1_14_4_enchantment_tooltip;

import com.viaversion.viaversion.util.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class05946;
import minecraft.class07304;
import minecraft.class07314;

public final class Enchantments1_14_4 {
    private static final Map<String, class05946<class07304>> ENCHANTMENT_REGISTRY = new HashMap<String, class05946<class07304>>();

    static {
        ENCHANTMENT_REGISTRY.put("protection", (class05946<class07304>)class07314.N);
        ENCHANTMENT_REGISTRY.put("fire_protection", (class05946<class07304>)class07314.y);
        ENCHANTMENT_REGISTRY.put("feather_falling", (class05946<class07304>)class07314.L);
        ENCHANTMENT_REGISTRY.put("blast_protection", (class05946<class07304>)class07314.u);
        ENCHANTMENT_REGISTRY.put("projectile_protection", (class05946<class07304>)class07314.i);
        ENCHANTMENT_REGISTRY.put("respiration", (class05946<class07304>)class07314.R);
        ENCHANTMENT_REGISTRY.put("aqua_affinity", (class05946<class07304>)class07314.M);
        ENCHANTMENT_REGISTRY.put("thorns", (class05946<class07304>)class07314.B);
        ENCHANTMENT_REGISTRY.put("depth_strider", (class05946<class07304>)class07314.Z);
        ENCHANTMENT_REGISTRY.put("frost_walker", (class05946<class07304>)class07314.z);
        ENCHANTMENT_REGISTRY.put("binding_curse", (class05946<class07304>)class07314.U);
        ENCHANTMENT_REGISTRY.put("sharpness", (class05946<class07304>)class07314.m);
        ENCHANTMENT_REGISTRY.put("smite", (class05946<class07304>)class07314.P);
        ENCHANTMENT_REGISTRY.put("bane_of_arthropods", (class05946<class07304>)class07314.s);
        ENCHANTMENT_REGISTRY.put("knockback", (class05946<class07304>)class07314.T);
        ENCHANTMENT_REGISTRY.put("fire_aspect", (class05946<class07304>)class07314.b);
        ENCHANTMENT_REGISTRY.put("looting", (class05946<class07304>)class07314.j);
        ENCHANTMENT_REGISTRY.put("sweeping", (class05946<class07304>)class07314.v);
        ENCHANTMENT_REGISTRY.put("efficiency", (class05946<class07304>)class07314.n);
        ENCHANTMENT_REGISTRY.put("silk_touch", (class05946<class07304>)class07314.t);
        ENCHANTMENT_REGISTRY.put("unbreaking", (class05946<class07304>)class07314.G);
        ENCHANTMENT_REGISTRY.put("fortune", (class05946<class07304>)class07314.l);
        ENCHANTMENT_REGISTRY.put("power", (class05946<class07304>)class07314.d);
        ENCHANTMENT_REGISTRY.put("punch", (class05946<class07304>)class07314.w);
        ENCHANTMENT_REGISTRY.put("flame", (class05946<class07304>)class07314.k);
        ENCHANTMENT_REGISTRY.put("infinity", (class05946<class07304>)class07314.Y);
        ENCHANTMENT_REGISTRY.put("luck_of_the_sea", (class05946<class07304>)class07314.Q);
        ENCHANTMENT_REGISTRY.put("lure", (class05946<class07304>)class07314.O);
        ENCHANTMENT_REGISTRY.put("loyalty", (class05946<class07304>)class07314.g);
        ENCHANTMENT_REGISTRY.put("impaling", (class05946<class07304>)class07314.I);
        ENCHANTMENT_REGISTRY.put("riptide", (class05946<class07304>)class07314.J);
        ENCHANTMENT_REGISTRY.put("channeling", (class05946<class07304>)class07314.o);
        ENCHANTMENT_REGISTRY.put("multishot", (class05946<class07304>)class07314.q);
        ENCHANTMENT_REGISTRY.put("quick_charge", (class05946<class07304>)class07314.K);
        ENCHANTMENT_REGISTRY.put("piercing", (class05946<class07304>)class07314.V);
        ENCHANTMENT_REGISTRY.put("mending", (class05946<class07304>)class07314.a);
        ENCHANTMENT_REGISTRY.put("vanishing_curse", (class05946<class07304>)class07314.p);
    }

    public static Optional<class05946<class07304>> getOrEmpty(String string) {
        return Optional.ofNullable(ENCHANTMENT_REGISTRY.get(Key.stripMinecraftNamespace((String)string)));
    }
}

