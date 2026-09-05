/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class02269
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.UnaryOperator;
import minecraft.class02269;
import minecraft.class06962;

public class class02569
extends DataFix {
    private final String N;
    private final UnaryOperator<String> y;

    public class02569(Schema schema, String string, UnaryOperator<String> unaryOperator) {
        super(schema, false);
        this.N = string;
        this.y = unaryOperator;
    }

    private Typed<?> y(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic2 -> dynamic2.update("attributes", dynamic -> (Dynamic)DataFixUtils.orElse(dynamic.asStreamOpt().result().map(stream -> stream.map(this::N)).map(arg_0 -> ((Dynamic)dynamic).createList(arg_0)), (Object)dynamic)));
    }

    private Dynamic<?> y(Dynamic<?> dynamic) {
        return class02269.N(dynamic, (String)"type", this.y);
    }

    private Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic -> dynamic.update("minecraft:attribute_modifiers", dynamic2 -> dynamic2.update("modifiers", dynamic -> (Dynamic)DataFixUtils.orElse(dynamic.asStreamOpt().result().map(stream -> stream.map(this::y)).map(arg_0 -> ((Dynamic)dynamic).createList(arg_0)), (Object)dynamic))));
    }

    private Dynamic<?> N(Dynamic<?> dynamic) {
        return class02269.N(dynamic, (String)"id", this.y);
    }

    protected TypeRewriteRule makeRule() {
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhereTyped(this.N + " (Components)", this.getInputSchema().getType(class06962.k), this::N), (TypeRewriteRule[])new TypeRewriteRule[]{this.fixTypeEverywhereTyped(this.N + " (Entity)", this.getInputSchema().getType(class06962.o), this::y), this.fixTypeEverywhereTyped(this.N + " (Player)", this.getInputSchema().getType(class06962.L), this::y)});
    }
}

