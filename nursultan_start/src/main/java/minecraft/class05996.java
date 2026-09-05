/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Set;
import minecraft.class06962;

public class class05996
extends DataFix {
    private static final Set<String> N = ImmutableSet.of((Object)"minecraft:andesite_wall", (Object)"minecraft:brick_wall", (Object)"minecraft:cobblestone_wall", (Object)"minecraft:diorite_wall", (Object)"minecraft:end_stone_brick_wall", (Object)"minecraft:granite_wall", (Object[])new String[]{"minecraft:mossy_cobblestone_wall", "minecraft:mossy_stone_brick_wall", "minecraft:nether_brick_wall", "minecraft:prismarine_wall", "minecraft:red_nether_brick_wall", "minecraft:red_sandstone_wall", "minecraft:sandstone_wall", "minecraft:stone_brick_wall"});

    public class05996(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic2) {
        if (!dynamic2.get("Name").asString().result().filter(N::contains).isPresent()) {
            return dynamic2;
        }
        return dynamic2.update("Properties", dynamic -> {
            Dynamic dynamic2 = class05996.N(dynamic, "east");
            dynamic2 = class05996.N(dynamic2, "west");
            dynamic2 = class05996.N(dynamic2, "north");
            return class05996.N(dynamic2, "south");
        });
    }

    private static String N(String string) {
        return "true".equals(string) ? "low" : "none";
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic2, String string) {
        return dynamic2.update(string, dynamic -> (Dynamic)DataFixUtils.orElse(dynamic.asString().result().map(class05996::N).map(arg_0 -> ((Dynamic)dynamic).createString(arg_0)), (Object)dynamic));
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("WallPropertyFix", this.getInputSchema().getType(class06962.d), typed -> typed.update(DSL.remainderFinder(), class05996::N));
    }
}

