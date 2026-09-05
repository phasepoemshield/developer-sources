/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;
import java.util.function.UnaryOperator;
import minecraft.class06962;

public class class03593
extends DataFix {
    private final String N;
    private final UnaryOperator<String> y;

    private class03593(Schema schema, String string, UnaryOperator<String> unaryOperator) {
        super(schema, true);
        this.N = string;
        this.y = unaryOperator;
    }

    public static DataFix N(Schema schema, String string, UnaryOperator<String> unaryOperator) {
        return new class03593(schema, string, unaryOperator);
    }

    public TypeRewriteRule makeRule() {
        TaggedChoice.TaggedChoiceType taggedChoiceType = this.getInputSchema().findChoiceType(class06962.G);
        TaggedChoice.TaggedChoiceType taggedChoiceType2 = this.getOutputSchema().findChoiceType(class06962.G);
        return this.fixTypeEverywhere(this.N, (Type)taggedChoiceType, (Type)taggedChoiceType2, dynamicOps -> pair -> pair.mapFirst(this.y));
    }
}

