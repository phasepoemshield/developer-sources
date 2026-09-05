/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  minecraft.class03731
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import minecraft.class03731;
import minecraft.class06962;

public class class08346
extends DataFix {
    private final String N;
    private final DSL.TypeReference y;

    public class08346(Schema schema, String string, DSL.TypeReference typeReference) {
        super(schema, false);
        this.N = string;
        this.y = typeReference;
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(this.y);
        OpticFinder opticFinder = type.findField("DisplayName");
        OpticFinder opticFinder2 = DSL.typeFinder((Type)this.getInputSchema().getType(class06962.O));
        return this.fixTypeEverywhereTyped(this.N, type, typed2 -> typed2.updateTyped(opticFinder, typed -> typed.update(opticFinder2, pair -> pair.mapSecond(class03731::N))));
    }
}

