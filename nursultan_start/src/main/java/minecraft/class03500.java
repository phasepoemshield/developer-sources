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
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import minecraft.class06962;

public class class03500
extends DataFix {
    public class03500(Schema schema) {
        super(schema, false);
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.u);
        OpticFinder opticFinder = type.findField("sections");
        return this.fixTypeEverywhereTyped("ChunkDeleteLightFix for " + this.getOutputSchema().getVersionKey(), type, typed2 -> {
            typed2 = typed2.update(DSL.remainderFinder(), dynamic -> dynamic.remove("isLightOn"));
            return typed2.updateTyped(opticFinder, typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.remove("BlockLight").remove("SkyLight")));
        });
    }
}

