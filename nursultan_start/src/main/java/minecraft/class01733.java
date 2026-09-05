/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class02269
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
import com.mojang.serialization.Dynamic;
import minecraft.class02269;
import minecraft.class07536;

public abstract class class01733
extends DataFix {
    private final String N;
    private final String y;
    private final DSL.TypeReference L;

    public class01733(Schema schema, boolean bl, String string, DSL.TypeReference typeReference, String string2) {
        super(schema, bl);
        this.N = string;
        this.L = typeReference;
        this.y = string2;
    }

    protected abstract <T> Dynamic<T> N(Dynamic<T> var1);

    private <S, T, A> TypeRewriteRule N(Type<S> type, Type<T> type2, Type<?> type3, OpticFinder<A> opticFinder) {
        return this.fixTypeEverywhereTyped(this.N, type, type2, typed -> {
            if (typed.getOptional(opticFinder).isEmpty()) {
                return class02269.N((Type)type2, (Typed)typed);
            }
            return class07536.N((Typed)class02269.N((Type)type3, (Typed)typed), (Type)type2, this::N);
        });
    }

    public TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(this.L);
        Type var2 = this.getInputSchema().getChoiceType(this.L, this.y);
        Type var3 = this.getOutputSchema().getType(this.L);
        OpticFinder opticFinder = DSL.namedChoice((String)this.y, (Type)var2);
        Type var5 = class02269.N((Type)var1, (Type)var1, (Type)var3);
        return this.N(var1, var3, var5, opticFinder);
    }
}

