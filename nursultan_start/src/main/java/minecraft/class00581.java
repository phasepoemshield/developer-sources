/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  minecraft.class06689
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class06689;
import minecraft.class06962;

public class class00581
extends Schema {
    public class00581(int n, Schema schema) {
        super(n, schema);
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        super.registerTypes(schema, map, map2);
        schema.registerType(true, class06962.l, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"id", (TypeTemplate)class06962.K.in(schema), (String)"tag", (TypeTemplate)class06689.y((Schema)schema)), (Hook.HookFunction)class06689.L, (Hook.HookFunction)Hook.HookFunction.IDENTITY));
    }
}

