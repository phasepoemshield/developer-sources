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
 *  minecraft.class02269
 *  minecraft.class06962
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import minecraft.class02269;
import minecraft.class06962;
import minecraft.class07536;

public class class02927
extends DataFix {
    public class02927(Schema schema) {
        super(schema, true);
    }

    private static <T> Function<Typed<?>, Typed<?>> N(String string, Type<?> type, Type<T> type2) {
        return arg_0 -> class02927.N(DSL.namedChoice((String)string, type), type2, arg_0);
    }

    private static /* synthetic */ Typed N(OpticFinder opticFinder, Type type, Typed typed2) {
        return typed2.updateTyped(opticFinder, type, typed -> class07536.N((Typed)typed, (Type)type, UnaryOperator.identity()));
    }

    private Function<Typed<?>, Typed<?>> N(String string) {
        Type var2 = this.getInputSchema().getChoiceType(class06962.o, string);
        Type var3 = this.getOutputSchema().getChoiceType(class06962.o, string);
        return class02927.N(string, var2, var3);
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.o);
        Type var2 = this.getOutputSchema().getType(class06962.o);
        return this.fixTypeEverywhereTyped("Fix Arrow stored weapon", var1, var2, class02269.N((Function[])new Function[]{this.N("minecraft:arrow"), this.N("minecraft:spectral_arrow")}));
    }
}

