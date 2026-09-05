/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00622
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class00622;
import minecraft.class06962;

public class class06853
extends Schema {
    public class06853(int n, Schema schema) {
        super(n, schema);
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(false, class06962.a, () -> DSL.constType((Type)class00622.N()));
        schema.registerType(false, class06962.L, () -> DSL.optionalFields((Pair[])new Pair[]{Pair.of((Object)"RootVehicle", (Object)DSL.optionalFields((String)"Entity", (TypeTemplate)class06962.J.in(schema))), Pair.of((Object)"ender_pearls", (Object)DSL.list((TypeTemplate)class06962.J.in(schema))), Pair.of((Object)"Inventory", (Object)DSL.list((TypeTemplate)class06962.l.in(schema))), Pair.of((Object)"EnderItems", (Object)DSL.list((TypeTemplate)class06962.l.in(schema))), Pair.of((Object)"ShoulderEntityLeft", (Object)class06962.J.in(schema)), Pair.of((Object)"ShoulderEntityRight", (Object)class06962.J.in(schema)), Pair.of((Object)"recipeBook", (Object)DSL.optionalFields((String)"recipes", (TypeTemplate)DSL.list((TypeTemplate)class06962.a.in(schema)), (String)"toBeDisplayed", (TypeTemplate)DSL.list((TypeTemplate)class06962.a.in(schema))))}));
        schema.registerType(false, class06962.i, () -> DSL.compoundList((TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema))));
    }
}

