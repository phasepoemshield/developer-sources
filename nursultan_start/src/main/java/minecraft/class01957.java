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

public class class01957
extends class00622 {
    public class01957(int n, Schema schema) {
        super(n, schema);
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        Map map = super.registerBlockEntities(schema);
        schema.register(map, "minecraft:decorated_pot", () -> DSL.optionalFields((String)"shards", (TypeTemplate)DSL.list((TypeTemplate)class06962.K.in(schema)), (String)"item", (TypeTemplate)class06962.l.in(schema)));
        schema.register(map, "minecraft:suspicious_sand", () -> DSL.optionalFields((String)"item", (TypeTemplate)class06962.l.in(schema)));
        return map;
    }
}

