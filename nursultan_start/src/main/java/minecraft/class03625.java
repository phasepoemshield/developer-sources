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
import java.util.function.UnaryOperator;
import minecraft.class06962;

public class class03625
extends DataFix {
    private final String N;
    private final String y;
    private final UnaryOperator<String> L;

    public class03625(Schema schema, String string, String string2, UnaryOperator<String> unaryOperator) {
        super(schema, false);
        this.N = string;
        this.y = string2;
        this.L = unaryOperator;
    }

    private Dynamic<?> N(Dynamic<?> dynamic) {
        return dynamic.update(this.y, dynamic2 -> dynamic2.update("criteria", dynamic -> dynamic.updateMapValues(pair -> pair.mapFirst(dynamic -> (Dynamic)DataFixUtils.orElse((Optional)dynamic.asString().map(string -> dynamic.createString((String)this.L.apply((String)string))).result(), (Object)dynamic)))));
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped(this.N, this.getInputSchema().getType(class06962.j), typed -> typed.update(DSL.remainderFinder(), this::N));
    }
}

