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

public class class06697
extends Schema {
    public class06697(int n, Schema schema) {
        super(n, schema);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map map = super.registerEntities(schema);
        map.remove("EntityHorse");
        schema.register(map, "Horse", () -> DSL.optionalFields((String)"ArmorItem", (TypeTemplate)class06962.l.in(schema), (String)"SaddleItem", (TypeTemplate)class06962.l.in(schema)));
        schema.register(map, "Donkey", () -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)), (String)"SaddleItem", (TypeTemplate)class06962.l.in(schema)));
        schema.register(map, "Mule", () -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)), (String)"SaddleItem", (TypeTemplate)class06962.l.in(schema)));
        schema.register(map, "ZombieHorse", () -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)class06962.l.in(schema)));
        schema.register(map, "SkeletonHorse", () -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)class06962.l.in(schema)));
        return map;
    }
}

