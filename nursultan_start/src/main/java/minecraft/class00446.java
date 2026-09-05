/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import minecraft.class06962;

public class class00446
extends DataFix {
    public class00446(Schema schema) {
        super(schema, false);
    }

    private static String N(String string) {
        return string.equals("health") ? "hearts" : "integer";
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.c);
        return this.fixTypeEverywhereTyped("ObjectiveRenderTypeFix", var1, typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            if (dynamic.get("RenderType").asString().result().isEmpty()) {
                String string = class00446.N(dynamic.get("CriteriaName").asString(""));
                return dynamic.set("RenderType", dynamic.createString(string));
            }
            return dynamic;
        }));
    }
}

