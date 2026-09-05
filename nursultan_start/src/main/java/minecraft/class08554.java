/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.OptionalDynamic
 *  minecraft.class06962
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import minecraft.class06962;
import minecraft.class07536;

public class class08554
extends DataFix {
    private static final List<String> N = List.of("minecraft:banner_patterns", "minecraft:bees", "minecraft:block_entity_data", "minecraft:block_state", "minecraft:bundle_contents", "minecraft:charged_projectiles", "minecraft:container", "minecraft:container_loot", "minecraft:firework_explosion", "minecraft:fireworks", "minecraft:instrument", "minecraft:map_id", "minecraft:painting/variant", "minecraft:pot_decorations", "minecraft:potion_contents", "minecraft:tropical_fish/pattern", "minecraft:written_book_content");

    public class08554(Schema schema) {
        super(schema, true);
    }

    private static Dynamic<?> N(Dynamic<?> dynamic, String string, Set<String> set) {
        return class08554.N(dynamic, string, set, UnaryOperator.identity());
    }

    private static Typed<?> N(Typed<?> typed, OpticFinder<?> opticFinder, OpticFinder<?> opticFinder2, Type<?> type, Type<?> type2) {
        HashSet<String> hashSet = new HashSet<String>();
        Typed<?> var0 = class08554.N(typed, opticFinder, type, "minecraft:can_place_on", hashSet);
        var0 = class08554.N(var0, opticFinder2, type2, "minecraft:can_break", hashSet);
        return var0.update(DSL.remainderFinder(), dynamic -> {
            Dynamic<?> var1 = class08554.N(dynamic, "minecraft:trim", hashSet);
            var1 = class08554.N(var1, "minecraft:unbreakable", hashSet);
            var1 = class08554.N(var1, "minecraft:dyed_color", "rgb", hashSet);
            var1 = class08554.N(var1, "minecraft:attribute_modifiers", "modifiers", hashSet);
            var1 = class08554.N(var1, "minecraft:enchantments", "levels", hashSet);
            var1 = class08554.N(var1, "minecraft:stored_enchantments", "levels", hashSet);
            var1 = class08554.N(var1, "minecraft:jukebox_playable", "song", hashSet);
            boolean bl = var1.get("minecraft:hide_tooltip").result().isPresent();
            dynamic = var1.remove("minecraft:hide_tooltip");
            boolean bl2 = dynamic.get("minecraft:hide_additional_tooltip").result().isPresent();
            dynamic = dynamic.remove("minecraft:hide_additional_tooltip");
            if (bl2) {
                for (String string : N) {
                    if (!dynamic.get(string).result().isPresent()) continue;
                    hashSet.add(string);
                }
            }
            if (hashSet.isEmpty() && !bl) {
                return dynamic;
            }
            return dynamic.set("minecraft:tooltip_display", dynamic.createMap(Map.of(dynamic.createString("hide_tooltip"), dynamic.createBoolean(bl), dynamic.createString("hidden_components"), dynamic.createList(hashSet.stream().map(arg_0 -> ((Dynamic)dynamic).createString(arg_0))))));
        });
    }

    private static Dynamic<?> N(Dynamic<?> dynamic2, String string, Set<String> set, UnaryOperator<Dynamic<?>> unaryOperator) {
        return dynamic2.update(string, dynamic -> {
            if (!dynamic.get("show_in_tooltip").asBoolean(true)) {
                set.add(string);
            }
            return (Dynamic)unaryOperator.apply(dynamic.remove("show_in_tooltip"));
        });
    }

    private static Typed<?> N(Typed<?> typed2, OpticFinder<?> opticFinder, Type<?> type, String string, Set<String> set) {
        return typed2.updateTyped(opticFinder, type, typed -> class07536.N((Typed)typed, (Type)type, dynamic -> {
            OptionalDynamic optionalDynamic = dynamic.get("predicates");
            if (optionalDynamic.result().isEmpty()) {
                return dynamic;
            }
            if (!dynamic.get("show_in_tooltip").asBoolean(true)) {
                set.add(string);
            }
            return (Dynamic)optionalDynamic.result().get();
        }));
    }

    private static Dynamic<?> N(Dynamic<?> dynamic2, String string, String string2, Set<String> set) {
        return class08554.N(dynamic2, string, set, dynamic -> (Dynamic)DataFixUtils.orElse((Optional)dynamic.get(string2).result(), (Object)dynamic));
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.k);
        Type var2 = this.getOutputSchema().getType(class06962.k);
        OpticFinder var3 = var1.findField("minecraft:can_place_on");
        OpticFinder var4 = var1.findField("minecraft:can_break");
        Type var5 = var2.findFieldType("minecraft:can_place_on");
        Type var6 = var2.findFieldType("minecraft:can_break");
        return this.fixTypeEverywhereTyped("TooltipDisplayComponentFix", var1, var2, typed -> class08554.N(typed, var3, var4, var5, var6));
    }
}

