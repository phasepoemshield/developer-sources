/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class06962;

public class class01288
extends DataFix {
    public class01288(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private double N(String string) {
        try {
            return (0.9 * Double.parseDouble(string) + 0.1) / 2.0;
        }
        catch (NumberFormatException numberFormatException) {
            return 0.5;
        }
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("OptionsAddTextBackgroundFix", this.getInputSchema().getType(class06962.R), typed -> typed.update(DSL.remainderFinder(), dynamic -> (Dynamic)DataFixUtils.orElse((Optional)dynamic.get("chatOpacity").asString().map(string -> {
            double d = this.N((String)string);
            return dynamic.set("textBackgroundOpacity", dynamic.createString(String.valueOf(d)));
        }).result(), (Object)dynamic)));
    }
}

