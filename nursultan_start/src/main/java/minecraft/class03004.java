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

public class class03004
extends class00622 {
    public class03004(int n, Schema schema) {
        super(n, schema);
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(false, class06962.u, () -> DSL.optionalFields((String)"entities", (TypeTemplate)DSL.list((TypeTemplate)class06962.J.in(schema)), (String)"block_entities", (TypeTemplate)DSL.list((TypeTemplate)DSL.or((TypeTemplate)class06962.G.in(schema), (TypeTemplate)DSL.remainder())), (String)"block_ticks", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"i", (TypeTemplate)class06962.q.in(schema))), (String)"sections", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"biomes", (TypeTemplate)DSL.optionalFields((String)"palette", (TypeTemplate)DSL.list((TypeTemplate)class06962.p.in(schema))), (String)"block_states", (TypeTemplate)DSL.optionalFields((String)"palette", (TypeTemplate)DSL.list((TypeTemplate)class06962.d.in(schema))))), (String)"structures", (TypeTemplate)DSL.optionalFields((String)"starts", (TypeTemplate)DSL.compoundList((TypeTemplate)class06962.H.in(schema)))));
    }
}

