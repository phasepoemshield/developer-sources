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

public class class04634
extends class00622 {
    public class04634(int n, Schema schema) {
        super(n, schema);
    }

    protected static void N(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.registerSimple(map, string);
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        Map map = super.registerBlockEntities(schema);
        schema.register(map, "minecraft:beehive", () -> DSL.optionalFields((String)"Bees", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"EntityData", (TypeTemplate)class06962.J.in(schema)))));
        return map;
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map map = super.registerEntities(schema);
        class04634.N(schema, map, "minecraft:bee");
        class04634.N(schema, map, "minecraft:bee_stinger");
        return map;
    }
}

