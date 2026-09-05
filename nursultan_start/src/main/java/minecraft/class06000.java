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
import java.util.function.Function;
import minecraft.class06962;

public class class06000
extends DataFix {
    private final String N;
    private final Function<String, String> y;

    public class06000(Schema schema, boolean bl, String string, Function<String, String> function) {
        super(schema, bl);
        this.N = string;
        this.y = function;
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped(this.N, this.getInputSchema().getType(class06962.j), typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.updateMapValues(pair -> {
            String string = ((Dynamic)pair.getFirst()).asString("");
            return pair.mapFirst(dynamic2 -> dynamic.createString(this.y.apply(string)));
        })));
    }
}

