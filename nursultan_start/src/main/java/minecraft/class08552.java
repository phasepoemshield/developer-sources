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

public class class08552
extends class00622 {
    public class08552(int n, Schema schema) {
        super(n, schema);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map var2 = super.registerEntities(schema);
        var2.remove("minecraft:potion");
        schema.register(var2, "minecraft:splash_potion", () -> DSL.optionalFields((String)"Item", (TypeTemplate)class06962.l.in(schema)));
        schema.register(var2, "minecraft:lingering_potion", () -> DSL.optionalFields((String)"Item", (TypeTemplate)class06962.l.in(schema)));
        return var2;
    }
}

