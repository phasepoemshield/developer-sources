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
import java.util.Map;
import java.util.stream.Stream;
import minecraft.class06962;

public class class08807
extends DataFix {
    public class08807(Schema schema) {
        super(schema, false);
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.k);
        return this.fixTypeEverywhereTyped("Custom Model Data expansion", type, typed -> typed.update(DSL.remainderFinder(), dynamic2 -> dynamic2.update("minecraft:custom_model_data", dynamic -> {
            float f = dynamic.asNumber((Number)Float.valueOf(0.0f)).floatValue();
            return dynamic.createMap(Map.of(dynamic.createString("floats"), dynamic.createList(Stream.of(dynamic.createFloat(f)))));
        })));
    }
}

