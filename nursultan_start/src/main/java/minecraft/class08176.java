/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
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
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;
import java.util.Map;
import minecraft.class00622;
import minecraft.class06962;

public class class08176
extends DataFix {
    private final String N;
    private final Map<String, String> y;

    public class08176(Schema schema, String string, Map<String, String> map) {
        super(schema, false);
        this.N = string;
        this.y = map;
    }

    private TypeRewriteRule y() {
        Type var1 = this.getOutputSchema().getType(class06962.B);
        Type var2 = this.getInputSchema().getType(class06962.B);
        OpticFinder var3 = var2.findField("stats");
        OpticFinder var4 = var3.type().findField("minecraft:custom");
        OpticFinder var5 = class00622.N().finder();
        return this.fixTypeEverywhereTyped(this.N, var2, var1, typed -> typed.updateTyped(var3, typed2 -> typed2.updateTyped(var4, typed -> typed.update(var5, string -> this.y.getOrDefault(string, (String)string)))));
    }

    private TypeRewriteRule N() {
        Type var1 = this.getOutputSchema().getType(class06962.c);
        Type var2 = this.getInputSchema().getType(class06962.c);
        OpticFinder var3 = var2.findField("CriteriaType");
        Type type = (Type)((TaggedChoice.TaggedChoiceType)var3.type().findChoiceType("type", -1).orElseThrow(() -> new IllegalStateException("Can't find choice type for criteria"))).types().get("minecraft:custom");
        if (type == null) {
            throw new IllegalStateException("Failed to find custom criterion type variant");
        }
        OpticFinder opticFinder = DSL.namedChoice((String)"minecraft:custom", (Type)type);
        OpticFinder var7 = DSL.fieldFinder((String)"id", (Type)class00622.N());
        return this.fixTypeEverywhereTyped(this.N, var2, var1, typed -> typed.updateTyped(var3, typed2 -> typed2.updateTyped(opticFinder, typed -> typed.update(var7, string -> this.y.getOrDefault(string, (String)string)))));
    }

    protected TypeRewriteRule makeRule() {
        return TypeRewriteRule.seq((TypeRewriteRule)this.y(), (TypeRewriteRule)this.N());
    }
}

