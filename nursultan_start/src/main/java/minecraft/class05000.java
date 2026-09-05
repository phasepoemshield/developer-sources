/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;
import java.util.Locale;

public class class05000
extends DataFix {
    private final String N;
    private final DSL.TypeReference y;

    public class05000(Schema schema, String string, DSL.TypeReference typeReference) {
        super(schema, true);
        this.N = string;
        this.y = typeReference;
    }

    private <K> TypeRewriteRule N(TaggedChoice.TaggedChoiceType<K> taggedChoiceType, TaggedChoice.TaggedChoiceType<?> taggedChoiceType2) {
        if (taggedChoiceType.getKeyType() != taggedChoiceType2.getKeyType()) {
            throw new IllegalStateException("Could not inject: key type is not the same");
        }
        TaggedChoice.TaggedChoiceType<?> taggedChoiceType3 = taggedChoiceType2;
        return this.fixTypeEverywhere(this.N, (Type)taggedChoiceType, (Type)taggedChoiceType3, dynamicOps -> pair -> {
            if (!taggedChoiceType3.hasType(pair.getFirst())) {
                throw new IllegalArgumentException(String.format(Locale.ROOT, "%s: Unknown type %s in '%s'", this.N, pair.getFirst(), this.y.typeName()));
            }
            return pair;
        });
    }

    public TypeRewriteRule makeRule() {
        TaggedChoice.TaggedChoiceType taggedChoiceType = this.getInputSchema().findChoiceType(this.y);
        TaggedChoice.TaggedChoiceType taggedChoiceType2 = this.getOutputSchema().findChoiceType(this.y);
        return this.N(taggedChoiceType, taggedChoiceType2);
    }
}

