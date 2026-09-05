/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  minecraft.class00622
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.function.UnaryOperator;
import minecraft.class00622;

public class class03623
extends DataFix {
    private final String N;
    private final DSL.TypeReference y;
    private final UnaryOperator<String> L;

    public class03623(Schema schema, String string, DSL.TypeReference typeReference, UnaryOperator<String> unaryOperator) {
        super(schema, false);
        this.N = string;
        this.y = typeReference;
        this.L = unaryOperator;
    }

    protected TypeRewriteRule makeRule() {
        Type type = DSL.named((String)this.y.typeName(), (Type)class00622.N());
        if (!Objects.equals(type, this.getInputSchema().getType(this.y))) {
            throw new IllegalStateException("\"" + this.y.typeName() + "\" is not what was expected.");
        }
        return this.fixTypeEverywhere(this.N, type, dynamicOps -> pair -> pair.mapSecond(this.L));
    }
}

