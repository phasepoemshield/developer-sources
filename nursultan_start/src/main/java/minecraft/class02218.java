/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import minecraft.class06962;

public class class02218
extends DataFix {
    public class02218(Schema schema) {
        super(schema, false);
    }

    private int N(String string) {
        try {
            return Math.round(Float.parseFloat(string) * 10.0f);
        }
        catch (NumberFormatException numberFormatException) {
            return 5;
        }
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("OptionsMenuBlurrinessFix", this.getInputSchema().getType(class06962.R), typed -> typed.update(DSL.remainderFinder(), dynamic2 -> dynamic2.update("menuBackgroundBlurriness", dynamic -> {
            int n = this.N(dynamic.asString("0.5"));
            return dynamic.createString(String.valueOf(n));
        })));
    }
}

