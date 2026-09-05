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
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.datafixers.util.Unit
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
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
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import minecraft.class06962;

public class class08632
extends DataFix {
    public class08632(Schema schema) {
        super(schema, true);
    }

    private static /* synthetic */ Pair N(Predicate predicate, DynamicOps dynamicOps, Pair pair) {
        String string = (String)pair.getFirst();
        Pair pair2 = (Pair)pair.getSecond();
        List list = (List)((Either)pair2.getFirst()).map(Function.identity(), unit -> List.of());
        List list2 = (List)((Either)((Pair)pair2.getSecond()).getFirst()).map(Function.identity(), unit -> List.of());
        Either either = (Either)((Pair)((Pair)pair2.getSecond()).getSecond()).getFirst();
        Either either2 = (Either)((Pair)((Pair)pair2.getSecond()).getSecond()).getSecond();
        Either either3 = class08632.N(0, list, predicate);
        Either either4 = class08632.N(1, list, predicate);
        Either either5 = class08632.N(2, list, predicate);
        Either either6 = class08632.N(3, list, predicate);
        Either either7 = class08632.N(0, list2, predicate);
        Either either8 = class08632.N(1, list2, predicate);
        if (class08632.N(either, either2, either3, either4, either5, either6, either7, either8)) {
            return Pair.of((Object)string, (Object)Either.right((Object)Unit.INSTANCE));
        }
        return Pair.of((Object)string, (Object)Either.left((Object)Pair.of(either7, (Object)Pair.of(either8, (Object)Pair.of(either3, (Object)Pair.of(either4, (Object)Pair.of(either5, (Object)Pair.of(either6, (Object)Pair.of((Object)either, (Object)Pair.of((Object)either2, (Object)new Dynamic(dynamicOps)))))))))));
    }

    private <ItemStackOld, ItemStackNew> TypeRewriteRule N(Type<ItemStackOld> type, Type<ItemStackNew> type2, OpticFinder<?> opticFinder) {
        Type type3 = DSL.named((String)class06962.g.typeName(), (Type)DSL.and((Type)DSL.optional((Type)DSL.field((String)"ArmorItems", (Type)DSL.list(type))), (Type)DSL.optional((Type)DSL.field((String)"HandItems", (Type)DSL.list(type))), (Type)DSL.optional((Type)DSL.field((String)"body_armor_item", type)), (Type)DSL.optional((Type)DSL.field((String)"saddle", type))));
        Type type4 = DSL.named((String)class06962.g.typeName(), (Type)DSL.optional((Type)DSL.field((String)"equipment", (Type)DSL.and((Type)DSL.optional((Type)DSL.field((String)"mainhand", type2)), (Type)DSL.optional((Type)DSL.field((String)"offhand", type2)), (Type)DSL.optional((Type)DSL.field((String)"feet", type2)), (Type)DSL.and((Type)DSL.optional((Type)DSL.field((String)"legs", type2)), (Type)DSL.optional((Type)DSL.field((String)"chest", type2)), (Type)DSL.optional((Type)DSL.field((String)"head", type2)), (Type)DSL.and((Type)DSL.optional((Type)DSL.field((String)"body", type2)), (Type)DSL.optional((Type)DSL.field((String)"saddle", type2)), (Type)DSL.remainderType()))))));
        if (!type3.equals((Object)this.getInputSchema().getType(class06962.g))) {
            throw new IllegalStateException("Input entity_equipment type does not match expected");
        }
        if (!type4.equals((Object)this.getOutputSchema().getType(class06962.g))) {
            throw new IllegalStateException("Output entity_equipment type does not match expected");
        }
        return this.fixTypeEverywhere("EquipmentFormatFix", type3, type4, dynamicOps -> arg_0 -> class08632.N(object -> new Typed(type, dynamicOps, object).getOptional(opticFinder).isEmpty(), dynamicOps, arg_0));
    }

    @SafeVarargs
    private static boolean N(Either<?, Unit> ... eitherArray) {
        Either<?, Unit>[] eitherArray2 = eitherArray;
        int n = eitherArray2.length;
        for (int i = 0; i < n; ++i) {
            if (!eitherArray2[i].right().isEmpty()) continue;
            return false;
        }
        return true;
    }

    private static <ItemStack> Either<ItemStack, Unit> N(int n, List<ItemStack> list, Predicate<ItemStack> predicate) {
        if (n >= list.size()) {
            return Either.right((Object)Unit.INSTANCE);
        }
        ItemStack ItemStack = list.get(n);
        if (predicate.test(ItemStack)) {
            return Either.right((Object)Unit.INSTANCE);
        }
        return Either.left(ItemStack);
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getTypeRaw(class06962.l);
        Type var2 = this.getOutputSchema().getTypeRaw(class06962.l);
        OpticFinder var3 = var1.findField("id");
        return this.N(var1, var2, var3);
    }
}

