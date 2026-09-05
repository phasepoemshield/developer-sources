/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import minecraft.class06962;

public class class08189
extends DataFix {
    public class08189(Schema schema) {
        super(schema, true);
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("graphicsPreset set to \"custom\"", this.getInputSchema().getType(class06962.R), typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.set("graphicsPreset", dynamic.createString("custom"))));
    }
}

