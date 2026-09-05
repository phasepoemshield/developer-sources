/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.OptionalDynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import minecraft.class06962;

public class class03085
extends DataFix {
    public class03085(Schema schema) {
        super(schema, false);
    }

    private static Dynamic<?> N(Dynamic<?> dynamic, OptionalDynamic<?> optionalDynamic) {
        return "minecraft:overworld".equals(optionalDynamic.get("dimension").asString().result().orElse("")) ? dynamic : dynamic.remove("blending_data");
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getOutputSchema().getType(class06962.u);
        return this.fixTypeEverywhereTyped("BlendingDataRemoveFromNetherEndFix", var1, typed -> typed.update(DSL.remainderFinder(), dynamic -> class03085.N(dynamic, dynamic.get("__context"))));
    }
}

