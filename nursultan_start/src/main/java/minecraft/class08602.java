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

public class class08602
extends class00622 {
    public class08602(int n, Schema schema) {
        super(n, schema);
    }

    private static TypeTemplate N(Schema schema) {
        return DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map var2 = super.registerEntities(schema);
        schema.register(var2, "minecraft:llama", string -> class08602.N(schema));
        schema.register(var2, "minecraft:trader_llama", string -> class08602.N(schema));
        schema.register(var2, "minecraft:donkey", string -> class08602.N(schema));
        schema.register(var2, "minecraft:mule", string -> class08602.N(schema));
        schema.registerSimple(var2, "minecraft:horse");
        schema.registerSimple(var2, "minecraft:skeleton_horse");
        schema.registerSimple(var2, "minecraft:zombie_horse");
        return var2;
    }
}

