/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public abstract class class00955
extends DataFix {
    private final String L;
    protected final String N;
    protected final DSL.TypeReference y;

    public class00955(Schema schema, boolean bl, String string, DSL.TypeReference typeReference, String string2) {
        super(schema, bl);
        this.L = string;
        this.y = typeReference;
        this.N = string2;
    }

    protected abstract Typed<?> N(Typed<?> var1);

    public TypeRewriteRule makeRule() {
        OpticFinder opticFinder = DSL.namedChoice((String)this.N, (Type)this.getInputSchema().getChoiceType(this.y, this.N));
        return this.fixTypeEverywhereTyped(this.L, this.getInputSchema().getType(this.y), this.getOutputSchema().getType(this.y), typed -> typed.updateTyped(opticFinder, this.getOutputSchema().getChoiceType(this.y, this.N), this::N));
    }
}

