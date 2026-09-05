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

public class class02906
extends class00622 {
    public class02906(int n, Schema schema) {
        super(n, schema);
    }

    protected static TypeTemplate N(Schema schema) {
        return DSL.optionalFields((String)"inBlockState", (TypeTemplate)class06962.d.in(schema), (String)"item", (TypeTemplate)class06962.l.in(schema), (String)"weapon", (TypeTemplate)class06962.l.in(schema));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map var2 = super.registerEntities(schema);
        schema.register(var2, "minecraft:spectral_arrow", () -> class02906.N(schema));
        schema.register(var2, "minecraft:arrow", () -> class02906.N(schema));
        return var2;
    }
}

