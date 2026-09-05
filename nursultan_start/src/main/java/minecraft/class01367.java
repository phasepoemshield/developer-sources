/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Set;
import minecraft.class01350;
import minecraft.class06962;
import org.slf4j.Logger;

public class class01367
extends class01350 {
    private static final Logger y = LogUtils.getLogger();
    private static final Set<String> L = Sets.newHashSet();
    private static final Set<String> u = Sets.newHashSet();
    private static final Set<String> i = Sets.newHashSet();
    private static final Set<String> R = Sets.newHashSet();
    private static final Set<String> M = Sets.newHashSet();
    private static final Set<String> B = Sets.newHashSet();

    public static Dynamic<?> L(Dynamic<?> dynamic) {
        return class01367.L(dynamic, "UUID", "UUID").orElse(dynamic);
    }

    private static Dynamic<?> M(Dynamic<?> dynamic) {
        return class01367.L(dynamic, "OwnerUUID", "Owner").orElse(dynamic);
    }

    private static Dynamic<?> P(Dynamic<?> dynamic) {
        return (Dynamic)DataFixUtils.orElse(dynamic.get("OwnerUUID").result().map(dynamic2 -> dynamic.remove("OwnerUUID").set("Owner", dynamic2)), dynamic);
    }

    public class01367(Schema schema) {
        super(schema, class06962.o);
    }

    private static Dynamic<?> B(Dynamic<?> dynamic) {
        Dynamic<?> var0 = class01367.y(dynamic, "Owner", "Owner").orElse(dynamic);
        return class01367.y(var0, "Target", "Target").orElse(var0);
    }

    private static Dynamic<?> Z(Dynamic<?> dynamic) {
        Dynamic<?> var0 = class01367.y(dynamic, "Owner", "Owner").orElse(dynamic);
        return class01367.y(var0, "Thrower", "Thrower").orElse(var0);
    }

    private static Dynamic<?> i(Dynamic<?> dynamic) {
        return class01367.L(dynamic, "OwnerUUID", "Owner").orElse(dynamic);
    }

    private static Dynamic<?> m(Dynamic<?> dynamic2) {
        return class01367.y(dynamic2).update("Leash", dynamic -> class01367.L(dynamic, "UUID", "UUID").orElse((Dynamic<?>)dynamic));
    }

    private static Dynamic<?> U(Dynamic<?> dynamic) {
        return class01367.N(dynamic, "HurtBy", "HurtBy").orElse(dynamic);
    }

    private static Dynamic<?> z(Dynamic<?> dynamic) {
        return (Dynamic)DataFixUtils.orElse(dynamic.get("TrustedUUIDs").result().map(dynamic3 -> dynamic.createList(dynamic3.asStream().map(dynamic -> class01367.N(dynamic).orElseGet(() -> {
            y.warn("Trusted contained invalid data.");
            return dynamic;
        })))).map(dynamic2 -> dynamic.remove("TrustedUUIDs").set("Trusted", dynamic2)), dynamic);
    }

    private static Dynamic<?> u(Dynamic<?> dynamic2) {
        return dynamic2.update("Brain", dynamic -> dynamic.update("memories", dynamic2 -> dynamic2.update("minecraft:angry_at", dynamic -> class01367.N(dynamic, "value", "value").orElseGet(() -> {
            y.warn("angry_at has no value.");
            return dynamic;
        }))));
    }

    public static Dynamic<?> y(Dynamic<?> dynamic) {
        return dynamic.update("Attributes", dynamic3 -> dynamic.createList(dynamic3.asStream().map(dynamic -> dynamic.update("Modifiers", dynamic3 -> dynamic.createList(dynamic3.asStream().map(dynamic -> class01367.L(dynamic, "UUID", "UUID").orElse((Dynamic<?>)dynamic)))))));
    }

    private static Dynamic<?> E(Dynamic<?> dynamic) {
        Dynamic<?> var1 = class01367.W(dynamic);
        return class01367.N(var1, "OwnerUUID", "Owner").orElse(var1);
    }

    private static Dynamic<?> W(Dynamic<?> dynamic) {
        Dynamic<?> var1 = class01367.m(dynamic);
        return class01367.L(var1, "LoveCause", "LoveCause").orElse(var1);
    }

    private static Dynamic<?> R(Dynamic<?> dynamic) {
        return class01367.L(dynamic, "ConversionPlayer", "ConversionPlayer").orElse(dynamic);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("EntityUUIDFixes", this.getInputSchema().getType(this.N), typed -> {
            Typed var1 = typed.update(DSL.remainderFinder(), class01367::L);
            for (String string : L) {
                typed = this.N(var1, string, class01367::E);
            }
            for (String string : u) {
                typed = this.N((Typed<?>)typed, string, class01367::E);
            }
            for (String string : i) {
                typed = this.N((Typed<?>)typed, string, class01367::W);
            }
            for (String string : R) {
                typed = this.N((Typed<?>)typed, string, class01367::m);
            }
            for (String string : M) {
                typed = this.N((Typed<?>)typed, string, class01367::y);
            }
            for (String string : B) {
                typed = this.N((Typed<?>)typed, string, class01367::P);
            }
            typed = this.N((Typed<?>)typed, "minecraft:bee", class01367::U);
            typed = this.N((Typed<?>)typed, "minecraft:zombified_piglin", class01367::U);
            typed = this.N((Typed<?>)typed, "minecraft:fox", class01367::z);
            typed = this.N((Typed<?>)typed, "minecraft:item", class01367::Z);
            typed = this.N((Typed<?>)typed, "minecraft:shulker_bullet", class01367::B);
            typed = this.N((Typed<?>)typed, "minecraft:area_effect_cloud", class01367::M);
            typed = this.N((Typed<?>)typed, "minecraft:zombie_villager", class01367::R);
            typed = this.N((Typed<?>)typed, "minecraft:evoker_fangs", class01367::i);
            typed = this.N((Typed<?>)typed, "minecraft:piglin", class01367::u);
            return typed;
        });
    }

    static {
        L.add("minecraft:donkey");
        L.add("minecraft:horse");
        L.add("minecraft:llama");
        L.add("minecraft:mule");
        L.add("minecraft:skeleton_horse");
        L.add("minecraft:trader_llama");
        L.add("minecraft:zombie_horse");
        u.add("minecraft:cat");
        u.add("minecraft:parrot");
        u.add("minecraft:wolf");
        i.add("minecraft:bee");
        i.add("minecraft:chicken");
        i.add("minecraft:cow");
        i.add("minecraft:fox");
        i.add("minecraft:mooshroom");
        i.add("minecraft:ocelot");
        i.add("minecraft:panda");
        i.add("minecraft:pig");
        i.add("minecraft:polar_bear");
        i.add("minecraft:rabbit");
        i.add("minecraft:sheep");
        i.add("minecraft:turtle");
        i.add("minecraft:hoglin");
        R.add("minecraft:bat");
        R.add("minecraft:blaze");
        R.add("minecraft:cave_spider");
        R.add("minecraft:cod");
        R.add("minecraft:creeper");
        R.add("minecraft:dolphin");
        R.add("minecraft:drowned");
        R.add("minecraft:elder_guardian");
        R.add("minecraft:ender_dragon");
        R.add("minecraft:enderman");
        R.add("minecraft:endermite");
        R.add("minecraft:evoker");
        R.add("minecraft:ghast");
        R.add("minecraft:giant");
        R.add("minecraft:guardian");
        R.add("minecraft:husk");
        R.add("minecraft:illusioner");
        R.add("minecraft:magma_cube");
        R.add("minecraft:pufferfish");
        R.add("minecraft:zombified_piglin");
        R.add("minecraft:salmon");
        R.add("minecraft:shulker");
        R.add("minecraft:silverfish");
        R.add("minecraft:skeleton");
        R.add("minecraft:slime");
        R.add("minecraft:snow_golem");
        R.add("minecraft:spider");
        R.add("minecraft:squid");
        R.add("minecraft:stray");
        R.add("minecraft:tropical_fish");
        R.add("minecraft:vex");
        R.add("minecraft:villager");
        R.add("minecraft:iron_golem");
        R.add("minecraft:vindicator");
        R.add("minecraft:pillager");
        R.add("minecraft:wandering_trader");
        R.add("minecraft:witch");
        R.add("minecraft:wither");
        R.add("minecraft:wither_skeleton");
        R.add("minecraft:zombie");
        R.add("minecraft:zombie_villager");
        R.add("minecraft:phantom");
        R.add("minecraft:ravager");
        R.add("minecraft:piglin");
        M.add("minecraft:armor_stand");
        B.add("minecraft:arrow");
        B.add("minecraft:dragon_fireball");
        B.add("minecraft:firework_rocket");
        B.add("minecraft:fireball");
        B.add("minecraft:llama_spit");
        B.add("minecraft:small_fireball");
        B.add("minecraft:snowball");
        B.add("minecraft:spectral_arrow");
        B.add("minecraft:egg");
        B.add("minecraft:ender_pearl");
        B.add("minecraft:experience_bottle");
        B.add("minecraft:potion");
        B.add("minecraft:trident");
        B.add("minecraft:wither_skull");
    }
}

