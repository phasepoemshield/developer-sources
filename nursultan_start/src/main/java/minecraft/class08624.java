/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class class08624
extends DataFix {
    private final DSL.TypeReference N;

    public class08624(Schema schema, DSL.TypeReference typeReference) {
        super(schema, false);
        this.N = typeReference;
    }

    private static Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic2 -> dynamic2.renameAndFixField("FallDistance", "fall_distance", dynamic -> dynamic.createDouble((double)dynamic.asFloat(0.0f))));
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("EntityFallDistanceFloatToDoubleFixFor" + this.N.typeName(), this.getOutputSchema().getType(this.N), class08624::N);
    }
}

