/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00622
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import minecraft.class00622;
import minecraft.class06962;

public abstract class class03952
extends DataFix {
    private final String N;
    private final Predicate<String> y;

    public class03952(Schema schema, String string, Predicate<String> predicate) {
        super(schema, false);
        this.N = string;
        this.y = predicate;
    }

    protected abstract Typed<?> N(Typed<?> var1);

    public static UnaryOperator<Typed<?>> N(Type<?> type, Predicate<String> predicate, UnaryOperator<Typed<?>> unaryOperator) {
        OpticFinder opticFinder = DSL.fieldFinder((String)"id", (Type)DSL.named((String)class06962.K.typeName(), (Type)class00622.N()));
        OpticFinder opticFinder2 = type.findField("tag");
        return typed -> {
            Optional optional = typed.getOptional(opticFinder);
            if (optional.isPresent() && predicate.test((String)((Pair)optional.get()).getSecond())) {
                return typed.updateTyped(opticFinder2, (Function)unaryOperator);
            }
            return typed;
        };
    }

    public final TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.l);
        return this.fixTypeEverywhereTyped(this.N, type, class03952.N(type, this.y, this::N));
    }
}

