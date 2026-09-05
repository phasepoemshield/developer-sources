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

public class class06811
extends Schema {
    public class06811(int n, Schema schema) {
        super(n, schema);
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(false, class06962.L, () -> DSL.optionalFields((String)"RootVehicle", (TypeTemplate)DSL.optionalFields((String)"Entity", (TypeTemplate)class06962.J.in(schema)), (String)"ender_pearls", (TypeTemplate)DSL.list((TypeTemplate)class06962.J.in(schema)), (String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)), (String)"EnderItems", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema))));
        schema.registerType(true, class06962.J, () -> DSL.optionalFields((String)"Passengers", (TypeTemplate)DSL.list((TypeTemplate)class06962.J.in(schema)), (TypeTemplate)class06962.o.in(schema)));
    }
}

