/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import minecraft.class00255;
import minecraft.class06962;

public class class00241
extends DataFix {
    public class00241(Schema schema) {
        super(schema, false);
    }

    private static Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic -> dynamic.renameAndFixField("Lock", "lock", class00255::y));
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("ContainerBlockEntityLockPredicateFix", (Type)this.getInputSchema().findChoiceType(class06962.G), class00241::N);
    }
}

