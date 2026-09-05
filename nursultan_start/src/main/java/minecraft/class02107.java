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

public class class02107
extends DataFix {
    public class02107(Schema schema) {
        super(schema, false);
    }

    private static String N(String string) {
        return switch (string) {
            case "0" -> "false";
            case "1", "2" -> "true";
            default -> string;
        };
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("OptionsAmbientOcclusionFix", this.getInputSchema().getType(class06962.R), typed -> typed.update(DSL.remainderFinder(), dynamic -> (Dynamic)DataFixUtils.orElse((Optional)dynamic.get("ao").asString().map(string -> dynamic.set("ao", dynamic.createString(class02107.N(string)))).result(), (Object)dynamic)));
    }
}

