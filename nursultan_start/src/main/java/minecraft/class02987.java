/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class06962;

public class class02987
extends DataFix {
    public class02987(Schema schema) {
        super(schema, false);
    }

    private <T> Dynamic<T> N(Dynamic<T> dynamic) {
        return dynamic.asString().result().map(string -> dynamic.createString(string.replace("\"programer_art\"", "\"programmer_art\""))).orElse(dynamic);
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("OptionsProgrammerArtFix", this.getInputSchema().getType(class06962.R), typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.update("resourcePacks", this::N).update("incompatibleResourcePacks", this::N)));
    }
}

