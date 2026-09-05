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

public class class08339
extends class00622 {
    public class08339(int n, Schema schema) {
        super(n, schema);
    }

    public static TypeTemplate N(Schema schema) {
        return DSL.optionalFields((String)"front_text", (TypeTemplate)DSL.optionalFields((String)"messages", (TypeTemplate)DSL.list((TypeTemplate)class06962.O.in(schema)), (String)"filtered_messages", (TypeTemplate)DSL.list((TypeTemplate)class06962.O.in(schema))), (String)"back_text", (TypeTemplate)DSL.optionalFields((String)"messages", (TypeTemplate)DSL.list((TypeTemplate)class06962.O.in(schema)), (String)"filtered_messages", (TypeTemplate)DSL.list((TypeTemplate)class06962.O.in(schema))));
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        Map map = super.registerBlockEntities(schema);
        this.register(map, "minecraft:sign", () -> class08339.N(schema));
        return map;
    }
}

