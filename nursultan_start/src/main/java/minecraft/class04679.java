/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  minecraft.class00622
 *  minecraft.class06962
 *  minecraft.class08380
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class00622;
import minecraft.class06962;
import minecraft.class08380;

public class class04679
extends class00622 {
    public class04679(int n, Schema schema) {
        super(n, schema);
    }

    protected static void N(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> class08380.N((Schema)schema));
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        Map map = super.registerBlockEntities(schema);
        class04679.N(schema, map, "minecraft:barrel");
        class04679.N(schema, map, "minecraft:smoker");
        class04679.N(schema, map, "minecraft:blast_furnace");
        schema.register(map, "minecraft:lectern", string -> DSL.optionalFields((String)"Book", (TypeTemplate)class06962.l.in(schema)));
        schema.registerSimple(map, "minecraft:bell");
        return map;
    }
}

