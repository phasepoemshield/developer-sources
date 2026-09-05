/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  minecraft.class00622
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import minecraft.class00622;
import minecraft.class05803;
import minecraft.class06962;

public class class05822
extends DataFix {
    public class05822(Schema schema, boolean bl) {
        super(schema, bl);
    }

    public TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.q);
        Type type2 = this.getOutputSchema().getType(class06962.q);
        Type type3 = DSL.named((String)class06962.q.typeName(), (Type)DSL.or((Type)DSL.intType(), (Type)class00622.N()));
        Type type4 = DSL.named((String)class06962.q.typeName(), (Type)class00622.N());
        if (!Objects.equals(type, type3) || !Objects.equals(type2, type4)) {
            throw new IllegalStateException("Expected and actual types don't match.");
        }
        return this.fixTypeEverywhere("BlockNameFlatteningFix", type3, type4, dynamicOps -> pair -> pair.mapSecond(either -> (String)either.map(class05803::N, string -> class05803.N(class00622.N((String)string)))));
    }
}

