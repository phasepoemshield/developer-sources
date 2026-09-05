/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.datafixers.util.Unit
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import minecraft.class06962;

public class class02873
extends DataFix {
    public class02873(Schema schema) {
        super(schema, false);
    }

    private TypeRewriteRule N(OpticFinder<Pair<String, Pair<Either<Pair<String, String>, Unit>, Pair<Either<?, Unit>, Dynamic<?>>>>> opticFinder, Type<?> type, String string) {
        Type type2 = this.getInputSchema().getChoiceType(class06962.o, string);
        OpticFinder opticFinder2 = DSL.namedChoice((String)string, (Type)type2);
        OpticFinder opticFinder3 = type2.findField("Items");
        return this.fixTypeEverywhereTyped("Fix non-zero indexing in chest horse type " + string, type, typed -> typed.updateTyped(opticFinder2, typed2 -> typed2.updateTyped(opticFinder3, typed -> typed.update(opticFinder, pair -> pair.mapSecond(pair2 -> pair2.mapSecond(pair -> pair.mapSecond(dynamic2 -> dynamic2.update("Slot", dynamic -> dynamic.createByte((byte)(dynamic.asInt(2) - 2))))))))));
    }

    protected TypeRewriteRule makeRule() {
        OpticFinder opticFinder = DSL.typeFinder((Type)this.getInputSchema().getType(class06962.l));
        Type type = this.getInputSchema().getType(class06962.o);
        return TypeRewriteRule.seq((TypeRewriteRule)this.N(opticFinder, type, "minecraft:llama"), (TypeRewriteRule[])new TypeRewriteRule[]{this.N(opticFinder, type, "minecraft:trader_llama"), this.N(opticFinder, type, "minecraft:mule"), this.N(opticFinder, type, "minecraft:donkey")});
    }
}

