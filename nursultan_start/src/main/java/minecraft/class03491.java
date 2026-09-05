/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import minecraft.class06962;

public class class03491
extends DataFix {
    private static final String N = "minecraft:decorated_pot";

    public class03491(Schema schema) {
        super(schema, true);
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getChoiceType(class06962.G, N);
        Type var2 = this.getOutputSchema().getChoiceType(class06962.G, N);
        return this.convertUnchecked("DecoratedPotFieldRenameFix", var1, var2);
    }
}

