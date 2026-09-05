/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 *  minecraft.class00622
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;
import java.util.Locale;
import java.util.Objects;
import minecraft.class00622;
import minecraft.class06962;

public abstract class class08181
extends DataFix {
    private final String N;

    public class08181(String string, Schema schema, boolean bl) {
        super(schema, bl);
        this.N = string;
    }

    protected abstract String N(String var1);

    public TypeRewriteRule makeRule() {
        TaggedChoice.TaggedChoiceType taggedChoiceType = this.getInputSchema().findChoiceType(class06962.o);
        TaggedChoice.TaggedChoiceType taggedChoiceType2 = this.getOutputSchema().findChoiceType(class06962.o);
        Type type = DSL.named((String)class06962.I.typeName(), (Type)class00622.N());
        if (!Objects.equals(this.getOutputSchema().getType(class06962.I), type)) {
            throw new IllegalStateException("Entity name type is not what was expected.");
        }
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhere(this.N, (Type)taggedChoiceType, (Type)taggedChoiceType2, dynamicOps -> pair -> pair.mapFirst(string -> {
            String string2 = this.N((String)string);
            Type type = (Type)taggedChoiceType.types().get(string);
            Type type2 = (Type)taggedChoiceType2.types().get(string2);
            if (!type2.equals((Object)type, true, true)) {
                throw new IllegalStateException(String.format(Locale.ROOT, "Dynamic type check failed: %s not equal to %s", type2, type));
            }
            return string2;
        })), (TypeRewriteRule)this.fixTypeEverywhere(this.N + " for entity name", type, dynamicOps -> pair -> pair.mapSecond(this::N)));
    }
}

