/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class06962;

public class class00582
extends Schema {
    public class00582(int n, Schema schema) {
        super(n, schema);
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(true, class06962.g, () -> DSL.and((TypeTemplate)DSL.optional((TypeTemplate)DSL.field((String)"ArmorItems", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)))), (TypeTemplate[])new TypeTemplate[]{DSL.optional((TypeTemplate)DSL.field((String)"HandItems", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)))), DSL.optional((TypeTemplate)DSL.field((String)"body_armor_item", (TypeTemplate)class06962.l.in(schema))), DSL.optional((TypeTemplate)DSL.field((String)"saddle", (TypeTemplate)class06962.l.in(schema)))}));
    }
}

