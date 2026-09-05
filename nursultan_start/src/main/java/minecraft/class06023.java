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

public class class06023
extends class00622 {
    public class06023(int n, Schema schema) {
        super(n, schema);
    }

    private static void N(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)), (String)"CustomName", (TypeTemplate)class06962.O.in(schema), (String)"RecipesUsed", (TypeTemplate)DSL.compoundList((TypeTemplate)class06962.a.in(schema), (TypeTemplate)DSL.constType((Type)DSL.intType()))));
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        Map map = super.registerBlockEntities(schema);
        class06023.N(schema, map, "minecraft:furnace");
        class06023.N(schema, map, "minecraft:smoker");
        class06023.N(schema, map, "minecraft:blast_furnace");
        return map;
    }
}

