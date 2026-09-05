/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00622
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class00622;
import minecraft.class06962;

public class class08613
extends class00622 {
    public class08613(int n, Schema schema) {
        super(n, schema);
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(true, class06962.g, () -> DSL.optional((TypeTemplate)DSL.field((String)"equipment", (TypeTemplate)DSL.optionalFields((Pair[])new Pair[]{Pair.of((Object)"mainhand", (Object)class06962.l.in(schema)), Pair.of((Object)"offhand", (Object)class06962.l.in(schema)), Pair.of((Object)"feet", (Object)class06962.l.in(schema)), Pair.of((Object)"legs", (Object)class06962.l.in(schema)), Pair.of((Object)"chest", (Object)class06962.l.in(schema)), Pair.of((Object)"head", (Object)class06962.l.in(schema)), Pair.of((Object)"body", (Object)class06962.l.in(schema)), Pair.of((Object)"saddle", (Object)class06962.l.in(schema))}))));
    }
}

