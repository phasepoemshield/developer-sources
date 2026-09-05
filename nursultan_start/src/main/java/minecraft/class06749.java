/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class class06749
extends DataFix {
    private final String N;
    private final DSL.TypeReference y;

    public class06749(Schema schema, String string, DSL.TypeReference typeReference) {
        super(schema, true);
        this.N = string;
        this.y = typeReference;
    }

    protected TypeRewriteRule makeRule() {
        return this.writeAndRead(this.N, this.getInputSchema().getType(this.y), this.getOutputSchema().getType(this.y));
    }
}

