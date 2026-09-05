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

public class class08341
extends class00622 {
    public class08341(int n, Schema schema) {
        super(n, schema);
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(true, class06962.O, () -> DSL.or((TypeTemplate)DSL.or((TypeTemplate)DSL.constType((Type)DSL.string()), (TypeTemplate)DSL.list((TypeTemplate)class06962.O.in(schema))), (TypeTemplate)DSL.optionalFields((String)"extra", (TypeTemplate)DSL.list((TypeTemplate)class06962.O.in(schema)), (String)"separator", (TypeTemplate)class06962.O.in(schema), (String)"hoverEvent", (TypeTemplate)DSL.taggedChoice((String)"action", (Type)DSL.string(), Map.of("show_text", DSL.optionalFields((String)"contents", (TypeTemplate)class06962.O.in(schema)), "show_item", DSL.optionalFields((String)"contents", (TypeTemplate)DSL.or((TypeTemplate)class06962.l.in(schema), (TypeTemplate)class06962.K.in(schema))), "show_entity", DSL.optionalFields((String)"type", (TypeTemplate)class06962.I.in(schema), (String)"name", (TypeTemplate)class06962.O.in(schema)))))));
    }
}

