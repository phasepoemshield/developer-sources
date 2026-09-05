/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class02269
 *  minecraft.class06962
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;
import java.util.Locale;
import java.util.function.Function;
import minecraft.class02269;
import minecraft.class06962;
import minecraft.class07536;

public abstract class class08147
extends DataFix {
    protected final String N;

    public class08147(String string, Schema schema, boolean bl) {
        super(schema, bl);
        this.N = string;
    }

    protected abstract Pair<String, Typed<?>> N(String var1, Typed<?> var2);

    private <A> Typed<A> N(Object object, DynamicOps<?> dynamicOps, Type<A> type) {
        return new Typed(type, dynamicOps, object);
    }

    public TypeRewriteRule makeRule() {
        TaggedChoice.TaggedChoiceType taggedChoiceType = this.getInputSchema().findChoiceType(class06962.o);
        TaggedChoice.TaggedChoiceType taggedChoiceType2 = this.getOutputSchema().findChoiceType(class06962.o);
        Function function = class07536.y_4(string -> class02269.N((Type)((Type)taggedChoiceType.types().get(string)), (Type)taggedChoiceType, (Type)taggedChoiceType2));
        return this.fixTypeEverywhere(this.N, (Type)taggedChoiceType, (Type)taggedChoiceType2, dynamicOps -> pair -> {
            String string = (String)pair.getFirst();
            Type type = (Type)function.apply(string);
            Pair<String, Typed<?>> var7 = this.N(string, this.N(pair.getSecond(), (DynamicOps<?>)dynamicOps, (Type)type));
            Type type2 = (Type)taggedChoiceType2.types().get(var7.getFirst());
            if (!type2.equals((Object)((Typed)var7.getSecond()).getType(), true, true)) {
                throw new IllegalStateException(String.format(Locale.ROOT, "Dynamic type check failed: %s not equal to %s", type2, ((Typed)var7.getSecond()).getType()));
            }
            return Pair.of((Object)((String)var7.getFirst()), (Object)((Typed)var7.getSecond()).getValue());
        });
    }
}

