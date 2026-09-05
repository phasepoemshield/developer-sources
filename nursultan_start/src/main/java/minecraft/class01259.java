/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.FieldFinder
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.CompoundList$CompoundListType
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.datafixers.util.Unit
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00622
 *  minecraft.class05972
 *  minecraft.class06962
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.FieldFinder;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.CompoundList;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Map;
import minecraft.class00622;
import minecraft.class05972;
import minecraft.class06962;

public class class01259
extends DataFix {
    public class01259(Schema schema, boolean bl) {
        super(schema, bl);
    }

    protected static <A> Type<Pair<Either<A, Unit>, Dynamic<?>>> y(String string, Type<A> type) {
        return DSL.and((Type)DSL.optional((Type)DSL.field((String)string, type)), (Type)DSL.remainderType());
    }

    private <T> Dynamic<T> N(Dynamic<T> dynamic) {
        long l = dynamic.get("seed").asLong(0L);
        return new Dynamic(dynamic.getOps(), class05972.N(dynamic, (long)l, (Dynamic)class05972.N(dynamic, (long)l), (boolean)false));
    }

    protected static <A> Type<Pair<A, Dynamic<?>>> N(String string, Type<A> type) {
        return DSL.and((Type)DSL.field((String)string, type), (Type)DSL.remainderType());
    }

    protected static <A1, A2> Type<Pair<Either<A1, Unit>, Pair<Either<A2, Unit>, Dynamic<?>>>> N(String string, Type<A1> type, String string2, Type<A2> type2) {
        return DSL.and((Type)DSL.optional((Type)DSL.field((String)string, type)), (Type)DSL.optional((Type)DSL.field((String)string2, type2)), (Type)DSL.remainderType());
    }

    protected static Type<? extends Pair<? extends Either<? extends Pair<? extends Either<?, Unit>, ? extends Pair<? extends Either<? extends List<? extends Pair<? extends Either<?, Unit>, Dynamic<?>>>, Unit>, Dynamic<?>>>, Unit>, Dynamic<?>>> N(Schema schema) {
        return class01259.y("settings", class01259.N("biome", schema.getType(class06962.p), "layers", DSL.list(class01259.y("block", schema.getType(class06962.q)))));
    }

    protected TypeRewriteRule makeRule() {
        Schema schema = this.getInputSchema();
        Type type = DSL.taggedChoiceType((String)"type", (Type)DSL.string(), (Map)ImmutableMap.of((Object)"minecraft:debug", (Object)DSL.remainderType(), (Object)"minecraft:flat", class01259.N(schema), (Object)"minecraft:noise", class01259.N("biome_source", DSL.taggedChoiceType((String)"type", (Type)DSL.string(), (Map)ImmutableMap.of((Object)"minecraft:fixed", class01259.N("biome", schema.getType(class06962.p)), (Object)"minecraft:multi_noise", (Object)DSL.list(class01259.N("biome", schema.getType(class06962.p))), (Object)"minecraft:checkerboard", class01259.N("biomes", DSL.list((Type)schema.getType(class06962.p))), (Object)"minecraft:vanilla_layered", (Object)DSL.remainderType(), (Object)"minecraft:the_end", (Object)DSL.remainderType())), "settings", DSL.or((Type)DSL.string(), class01259.N("default_block", schema.getType(class06962.q), "default_fluid", schema.getType(class06962.q))))));
        CompoundList.CompoundListType compoundListType = DSL.compoundList((Type)class00622.N(), class01259.N("generator", type));
        Type type2 = DSL.and((Type)compoundListType, (Type)DSL.remainderType());
        Type type3 = schema.getType(class06962.A);
        FieldFinder fieldFinder = new FieldFinder("dimensions", type2);
        if (!type3.findFieldType("dimensions").equals((Object)type2)) {
            throw new IllegalStateException();
        }
        OpticFinder opticFinder = compoundListType.finder();
        return this.fixTypeEverywhereTyped("MissingDimensionFix", type3, typed -> typed.updateTyped((OpticFinder)fieldFinder, typed3 -> typed3.updateTyped(opticFinder, typed2 -> {
            if (!(typed2.getValue() instanceof List)) {
                throw new IllegalStateException("List exptected");
            }
            if (((List)typed2.getValue()).isEmpty()) {
                Dynamic dynamic = (Dynamic)typed.get(DSL.remainderFinder());
                Dynamic dynamic2 = this.N(dynamic);
                return (Typed)DataFixUtils.orElse(compoundListType.readTyped(dynamic2).result().map(Pair::getFirst), (Object)typed2);
            }
            return typed2;
        })));
    }
}

