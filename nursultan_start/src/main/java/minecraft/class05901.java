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
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import minecraft.class06962;

public class class05901
extends DataFix {
    public class05901(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic2) {
        return dynamic2.update("references", dynamic -> dynamic.createInt(dynamic.asNumber().map(Number::intValue).result().filter(n -> n > 0).orElse(1).intValue()));
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.H);
        return this.fixTypeEverywhereTyped("Structure Reference Fix", type, typed -> typed.update(DSL.remainderFinder(), class05901::N));
    }
}

