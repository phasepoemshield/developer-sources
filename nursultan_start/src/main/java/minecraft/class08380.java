/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  minecraft.class00622
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class00622;
import minecraft.class06962;

public class class08380
extends class00622 {
    public class08380(int n, Schema schema) {
        super(n, schema);
    }

    public static TypeTemplate y(Schema schema) {
        return DSL.optionalFields((String)"CustomName", (TypeTemplate)class06962.O.in(schema));
    }

    public static TypeTemplate N(Schema schema) {
        return DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)), (String)"CustomName", (TypeTemplate)class06962.O.in(schema));
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        Map map = super.registerBlockEntities(schema);
        schema.register(map, "minecraft:beacon", () -> class08380.y(schema));
        schema.register(map, "minecraft:banner", () -> class08380.y(schema));
        schema.register(map, "minecraft:brewing_stand", () -> class08380.N(schema));
        schema.register(map, "minecraft:chest", () -> class08380.N(schema));
        schema.register(map, "minecraft:trapped_chest", () -> class08380.N(schema));
        schema.register(map, "minecraft:dispenser", () -> class08380.N(schema));
        schema.register(map, "minecraft:dropper", () -> class08380.N(schema));
        schema.register(map, "minecraft:enchanting_table", () -> class08380.y(schema));
        schema.register(map, "minecraft:furnace", () -> class08380.N(schema));
        schema.register(map, "minecraft:hopper", () -> class08380.N(schema));
        schema.register(map, "minecraft:shulker_box", () -> class08380.N(schema));
        return map;
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(true, class06962.o, () -> DSL.and((TypeTemplate)class06962.g.in(schema), (TypeTemplate)DSL.optionalFields((String)"CustomName", (TypeTemplate)class06962.O.in(schema), (TypeTemplate)DSL.taggedChoiceLazy((String)"id", (Type)class08380.N(), (Map)map))));
    }
}

