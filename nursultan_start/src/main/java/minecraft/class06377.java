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

public class class06377
extends class00622 {
    public class06377(int n, Schema schema) {
        super(n, schema);
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        Map map = super.registerBlockEntities(schema);
        schema.register(map, "minecraft:sculk_sensor", () -> DSL.optionalFields((String)"listener", (TypeTemplate)DSL.optionalFields((String)"event", (TypeTemplate)DSL.optionalFields((String)"game_event", (TypeTemplate)class06962.V.in(schema)))));
        return map;
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(false, class06962.V, () -> DSL.constType((Type)class06377.N()));
    }
}

