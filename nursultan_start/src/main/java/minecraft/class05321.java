/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.function.UnaryOperator;
import minecraft.class06962;

public class class05321
extends DataFix {
    private final String N;
    private final UnaryOperator<String> y;

    public class05321(Schema schema, String string, UnaryOperator<String> unaryOperator) {
        super(schema, false);
        this.N = string;
        this.y = unaryOperator;
    }

    private Typed<?> y(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic2 -> dynamic2.update("Attributes", dynamic -> (Dynamic)DataFixUtils.orElse(dynamic.asStreamOpt().result().map(stream -> stream.map(dynamic -> dynamic.update("Name", this::N))).map(arg_0 -> ((Dynamic)dynamic).createList(arg_0)), (Object)dynamic)));
    }

    private Dynamic<?> N(Dynamic<?> dynamic) {
        return (Dynamic)DataFixUtils.orElse(dynamic.asString().result().map(this.y).map(arg_0 -> dynamic.createString(arg_0)), dynamic);
    }

    private Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic2 -> dynamic2.update("AttributeModifiers", dynamic -> (Dynamic)DataFixUtils.orElse(dynamic.asStreamOpt().result().map(stream -> stream.map(dynamic -> dynamic.update("AttributeName", this::N))).map(arg_0 -> ((Dynamic)dynamic).createList(arg_0)), (Object)dynamic)));
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.l);
        OpticFinder opticFinder = type.findField("tag");
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhereTyped(this.N + " (ItemStack)", type, typed -> typed.updateTyped(opticFinder, this::N)), (TypeRewriteRule[])new TypeRewriteRule[]{this.fixTypeEverywhereTyped(this.N + " (Entity)", this.getInputSchema().getType(class06962.o), this::y), this.fixTypeEverywhereTyped(this.N + " (Player)", this.getInputSchema().getType(class06962.L), this::y)});
    }
}

