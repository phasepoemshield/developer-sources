/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  minecraft.class00622
 */
package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class00622;

public class class06181
extends class00622 {
    public class06181(int n, Schema schema) {
        super(n, schema);
    }

    protected static void N(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.registerSimple(map, string);
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map var2 = super.registerEntities(schema);
        var2.remove("minecraft:illager_beast");
        class06181.N(schema, var2, "minecraft:ravager");
        return var2;
    }
}

