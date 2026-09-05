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

public class class00244
extends class00622 {
    public class00244(int n, Schema schema) {
        super(n, schema);
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        Map var2 = super.registerBlockEntities(schema);
        this.registerSimple(var2, "minecraft:creaking_heart");
        return var2;
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map var2 = super.registerEntities(schema);
        schema.registerSimple(var2, "minecraft:creaking");
        schema.registerSimple(var2, "minecraft:creaking_transient");
        return var2;
    }
}

