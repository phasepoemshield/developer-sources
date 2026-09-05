/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  minecraft.class00622
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class00622;
import minecraft.class06962;

public class class03687
extends class00622 {
    public class03687(int n, Schema schema) {
        super(n, schema);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map map = super.registerEntities(schema);
        schema.register(map, "minecraft:item_display", string -> DSL.optionalFields((String)"item", (TypeTemplate)class06962.l.in(schema)));
        schema.register(map, "minecraft:block_display", string -> DSL.optionalFields((String)"block_state", (TypeTemplate)class06962.d.in(schema)));
        schema.register(map, "minecraft:text_display", () -> DSL.optionalFields((String)"text", (TypeTemplate)class06962.O.in(schema)));
        return map;
    }
}

