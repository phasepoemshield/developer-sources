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

public class class02863
extends class00622 {
    public class02863(int n, Schema schema) {
        super(n, schema);
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        Map map = super.registerBlockEntities(schema);
        schema.register(map, "minecraft:vault", () -> DSL.optionalFields((String)"config", (TypeTemplate)DSL.optionalFields((String)"key_item", (TypeTemplate)class06962.l.in(schema)), (String)"server_data", (TypeTemplate)DSL.optionalFields((String)"items_to_eject", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema))), (String)"shared_data", (TypeTemplate)DSL.optionalFields((String)"display_item", (TypeTemplate)class06962.l.in(schema))));
        return map;
    }
}

