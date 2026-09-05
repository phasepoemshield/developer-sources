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

public class class06713
extends Schema {
    public class06713(int n, Schema schema) {
        super(n, schema);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map map = super.registerEntities(schema);
        schema.register(map, "ZombieVillager", string -> DSL.optionalFields((String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)class06962.Y.in(schema)))));
        schema.registerSimple(map, "Husk");
        return map;
    }
}

