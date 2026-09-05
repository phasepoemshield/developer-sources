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
 *  minecraft.class00622
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.UnaryOperator;
import minecraft.class00622;
import minecraft.class06962;

public class class03513
extends DataFix {
    private final String N;
    private final UnaryOperator<String> y;

    public class03513(Schema schema, String string, UnaryOperator<String> unaryOperator) {
        super(schema, false);
        this.N = string;
        this.y = unaryOperator;
    }

    private <T> Dynamic<T> N(Dynamic<T> dynamic) {
        return (Dynamic)DataFixUtils.orElse(dynamic.asString().result().map(class00622::N).map(this.y).map(arg_0 -> dynamic.createString(arg_0)), dynamic);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped(this.N, this.getInputSchema().getType(class06962.u), typed -> typed.update(DSL.remainderFinder(), dynamic2 -> dynamic2.update("Status", this::N).update("below_zero_retrogen", dynamic -> dynamic.update("target_status", this::N))));
    }
}

