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

public class class07598
extends class00622 {
    public class07598(int n, Schema schema) {
        super(n, schema);
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(false, class06962.u, () -> DSL.fields((String)"Level", (TypeTemplate)DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)class06962.J.in(schema)), (String)"TileEntities", (TypeTemplate)DSL.list((TypeTemplate)DSL.or((TypeTemplate)class06962.G.in(schema), (TypeTemplate)DSL.remainder())), (String)"TileTicks", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"i", (TypeTemplate)class06962.q.in(schema))), (String)"Sections", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"Palette", (TypeTemplate)DSL.list((TypeTemplate)class06962.d.in(schema)))))));
    }
}

