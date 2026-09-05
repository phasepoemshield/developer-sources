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

public class class03985
extends class00622 {
    public class03985(int n, Schema schema) {
        super(n, schema);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map map = super.registerEntities(schema);
        schema.register(map, "minecraft:warden", () -> DSL.optionalFields((String)"listener", (TypeTemplate)DSL.optionalFields((String)"event", (TypeTemplate)DSL.optionalFields((String)"game_event", (TypeTemplate)class06962.V.in(schema)))));
        return map;
    }
}

