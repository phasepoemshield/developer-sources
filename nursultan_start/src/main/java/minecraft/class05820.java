/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import minecraft.class06962;

public class class05820
extends DataFix {
    public class05820(Schema schema, boolean bl) {
        super(schema, bl);
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.u);
        Type var2 = var1.findFieldType("Level");
        OpticFinder opticFinder = DSL.fieldFinder((String)"Level", (Type)var2);
        return this.fixTypeEverywhereTyped("ChunkStatusFix", var1, this.getOutputSchema().getType(class06962.u), typed2 -> typed2.updateTyped(opticFinder, typed -> {
            Dynamic dynamic;
            Dynamic var1 = (Dynamic)typed.get(DSL.remainderFinder());
            if (Objects.equals(var1.get("Status").asString("empty"), "postprocessed")) {
                dynamic = var1.set("Status", var1.createString("fullchunk"));
            }
            return typed.set(DSL.remainderFinder(), (Object)dynamic);
        }));
    }
}

