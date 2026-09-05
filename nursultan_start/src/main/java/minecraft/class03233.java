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

public class class03233
extends class00622 {
    public class03233(int n, Schema schema) {
        super(n, schema);
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(true, class06962.e, () -> DSL.optionalFields((String)"SpawnPotentials", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"data", (TypeTemplate)DSL.fields((String)"entity", (TypeTemplate)class06962.J.in(schema)))), (String)"SpawnData", (TypeTemplate)DSL.fields((String)"entity", (TypeTemplate)class06962.J.in(schema))));
    }
}

