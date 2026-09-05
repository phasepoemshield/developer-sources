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

public class class08357
extends class00622 {
    public class08357(int n, Schema schema) {
        super(n, schema);
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(true, class06962.O, () -> DSL.or((TypeTemplate)DSL.or((TypeTemplate)DSL.constType((Type)DSL.string()), (TypeTemplate)DSL.list((TypeTemplate)class06962.O.in(schema))), (TypeTemplate)DSL.optionalFields((String)"extra", (TypeTemplate)DSL.list((TypeTemplate)class06962.O.in(schema)), (String)"separator", (TypeTemplate)class06962.O.in(schema), (String)"hover_event", (TypeTemplate)DSL.taggedChoice((String)"action", (Type)DSL.string(), Map.of("show_text", DSL.optionalFields((String)"value", (TypeTemplate)class06962.O.in(schema)), "show_item", class06962.l.in(schema), "show_entity", DSL.optionalFields((String)"id", (TypeTemplate)class06962.I.in(schema), (String)"name", (TypeTemplate)class06962.O.in(schema)))))));
    }
}

