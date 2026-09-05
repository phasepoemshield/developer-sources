/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class06962;

public class class08191
extends DataFix {
    public class08191(Schema schema) {
        super(schema, true);
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic) {
        if ("true".equals(dynamic.asString("true"))) {
            return dynamic.createString("1");
        }
        return dynamic.createString("0");
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("fancyGraphics to graphicsMode", this.getInputSchema().getType(class06962.R), typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.renameAndFixField("fancyGraphics", "graphicsMode", class08191::N)));
    }
}

