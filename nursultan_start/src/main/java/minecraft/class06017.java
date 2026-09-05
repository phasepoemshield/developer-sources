/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.datafixers.util.Unit
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import minecraft.class06962;

public class class06017
extends DataFix {
    public class06017(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private <R> Typed<?> N(Type<R> type, Type<Pair<Either<Pair<List<Pair<R, Integer>>, Dynamic<?>>, Unit>, Dynamic<?>>> type2, Typed<?> typed) {
        Dynamic var4 = (Dynamic)typed.getOrCreate(DSL.remainderFinder());
        int n = var4.get("RecipesUsedSize").asInt(0);
        Dynamic dynamic2 = var4.remove("RecipesUsedSize");
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < n; ++i) {
            String string = "RecipeLocation" + i;
            String string2 = "RecipeAmount" + i;
            Optional var10 = dynamic2.get(string).result();
            int n2 = dynamic2.get(string2).asInt(0);
            if (n2 > 0) {
                var10.ifPresent(dynamic -> type.read(dynamic).result().ifPresent(pair -> arrayList.add(Pair.of((Object)pair.getFirst(), (Object)n2))));
            }
            dynamic2 = dynamic2.remove(string).remove(string2);
        }
        return typed.set(DSL.remainderFinder(), type2, (Object)Pair.of((Object)Either.left((Object)Pair.of((Object)arrayList, (Object)dynamic2.emptyMap())), (Object)dynamic2));
    }

    private <R> TypeRewriteRule N(Type<R> type) {
        Type type2 = DSL.and((Type)DSL.optional((Type)DSL.field((String)"RecipesUsed", (Type)DSL.and((Type)DSL.compoundList(type, (Type)DSL.intType()), (Type)DSL.remainderType()))), (Type)DSL.remainderType());
        OpticFinder opticFinder = DSL.namedChoice((String)"minecraft:furnace", (Type)this.getInputSchema().getChoiceType(class06962.G, "minecraft:furnace"));
        OpticFinder opticFinder2 = DSL.namedChoice((String)"minecraft:blast_furnace", (Type)this.getInputSchema().getChoiceType(class06962.G, "minecraft:blast_furnace"));
        OpticFinder opticFinder3 = DSL.namedChoice((String)"minecraft:smoker", (Type)this.getInputSchema().getChoiceType(class06962.G, "minecraft:smoker"));
        Type var6 = this.getOutputSchema().getChoiceType(class06962.G, "minecraft:furnace");
        Type var7 = this.getOutputSchema().getChoiceType(class06962.G, "minecraft:blast_furnace");
        Type var8 = this.getOutputSchema().getChoiceType(class06962.G, "minecraft:smoker");
        Type var9 = this.getInputSchema().getType(class06962.G);
        Type var10 = this.getOutputSchema().getType(class06962.G);
        return this.fixTypeEverywhereTyped("FurnaceRecipesFix", var9, var10, typed2 -> typed2.updateTyped(opticFinder, var6, typed -> this.N(type, (Type)type2, (Typed<?>)typed)).updateTyped(opticFinder2, var7, typed -> this.N(type, (Type)type2, (Typed<?>)typed)).updateTyped(opticFinder3, var8, typed -> this.N(type, (Type)type2, (Typed<?>)typed)));
    }

    protected TypeRewriteRule makeRule() {
        return this.N(this.getOutputSchema().getTypeRaw(class06962.a));
    }
}

