/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.List$ListType
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  minecraft.class06962
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import minecraft.class03021;
import minecraft.class06962;
import org.apache.commons.lang3.mutable.MutableInt;
import org.jspecify.annotations.Nullable;

public class class03018
extends DataFix {
    private static final int N = 16;
    private static final ImmutableSet<String> y = ImmutableSet.of((Object)"minecraft:bubble_column", (Object)"minecraft:kelp", (Object)"minecraft:kelp_plant", (Object)"minecraft:seagrass", (Object)"minecraft:tall_seagrass");

    public class03018(Schema schema) {
        super(schema, false);
    }

    private static String y(@Nullable Dynamic<?> dynamic) {
        if (dynamic == null) {
            return "minecraft:empty";
        }
        String string = dynamic.get("Name").asString("");
        if ("minecraft:water".equals(string)) {
            return dynamic.get("Properties").get("level").asInt(0) == 0 ? "minecraft:water" : "minecraft:flowing_water";
        }
        if ("minecraft:lava".equals(string)) {
            return dynamic.get("Properties").get("level").asInt(0) == 0 ? "minecraft:lava" : "minecraft:flowing_lava";
        }
        if (y.contains((Object)string) || dynamic.get("Properties").get("waterlogged").asBoolean(false)) {
            return "minecraft:water";
        }
        return "minecraft:empty";
    }

    private static /* synthetic */ void N(OpticFinder opticFinder, OpticFinder opticFinder2, MutableInt mutableInt, OpticFinder opticFinder3, Int2ObjectMap int2ObjectMap, OpticFinder opticFinder4, Typed typed) {
        typed.getAllTyped(opticFinder).forEach(typed2 -> {
            int n = ((Dynamic)typed2.get(DSL.remainderFinder())).get("Y").asInt(Integer.MAX_VALUE);
            if (n == Integer.MAX_VALUE) {
                return;
            }
            if (typed2.getOptionalTyped(opticFinder2).isPresent()) {
                mutableInt.setValue(Math.min(n, mutableInt.intValue()));
            }
            typed2.getOptionalTyped(opticFinder3).ifPresent(typed -> int2ObjectMap.put(n, (Object)Suppliers.memoize(() -> {
                List list = typed.getOptionalTyped(opticFinder4).map(typed -> typed.write().result().map(dynamic -> dynamic.asList(Function.identity())).orElse(Collections.emptyList())).orElse(Collections.emptyList());
                long[] lArray = ((Dynamic)typed.get(DSL.remainderFinder())).get("data").asLongStream().toArray();
                return new class03021(list, lArray);
            })));
        });
    }

    private Dynamic<?> N(Dynamic<?> dynamic2, Int2ObjectMap<Supplier<class03021>> int2ObjectMap, byte by, int n2, int n3, String string, Function<Dynamic<?>, String> function) {
        Stream<Object> stream = Stream.empty();
        List list = dynamic2.get(string).asList(Function.identity());
        for (int i = 0; i < list.size(); ++i) {
            int n4 = i + by;
            Supplier supplier = (Supplier)int2ObjectMap.get(n4);
            Stream<Dynamic> stream2 = ((Dynamic)list.get(i)).asStream().mapToInt(dynamic -> dynamic.asShort((short)-1)).filter(n -> n > 0).mapToObj(arg_0 -> this.N(dynamic2, (Supplier)supplier, n2, n4, n3, function, arg_0));
            stream = Stream.concat(stream, stream2);
        }
        return dynamic2.createList(stream);
    }

    private /* synthetic */ Dynamic N(Dynamic dynamic, Supplier supplier, int n, int n2, int n3, Function function, int n4) {
        return this.N(dynamic, (Supplier<class03021>)supplier, n, n2, n3, n4, function);
    }

    private Dynamic<?> N(Dynamic<?> dynamic, @Nullable Supplier<class03021> supplier, int n, int n2, int n3, int n4, Function<Dynamic<?>, String> function) {
        int n5 = n4 & 0xF;
        int n6 = n4 >>> 4 & 0xF;
        int n7 = n4 >>> 8 & 0xF;
        String string = function.apply(supplier != null ? supplier.get().N(n5, n6, n7) : null);
        return dynamic.createMap((Map)ImmutableMap.builder().put((Object)dynamic.createString("i"), (Object)dynamic.createString(string)).put((Object)dynamic.createString("x"), (Object)dynamic.createInt(n * 16 + n5)).put((Object)dynamic.createString("y"), (Object)dynamic.createInt(n2 * 16 + n6)).put((Object)dynamic.createString("z"), (Object)dynamic.createInt(n3 * 16 + n7)).put((Object)dynamic.createString("t"), (Object)dynamic.createInt(0)).put((Object)dynamic.createString("p"), (Object)dynamic.createInt(0)).build());
    }

    private static String N(@Nullable Dynamic<?> dynamic) {
        return dynamic != null ? dynamic.get("Name").asString("minecraft:air") : "minecraft:air";
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.u);
        OpticFinder var2 = var1.findField("Level");
        OpticFinder var3 = var2.type().findField("Sections");
        OpticFinder opticFinder = ((List.ListType)var3.type()).getElement().finder();
        OpticFinder var5 = opticFinder.type().findField("block_states");
        OpticFinder var6 = opticFinder.type().findField("biomes");
        OpticFinder var7 = var5.type().findField("palette");
        OpticFinder var8 = var2.type().findField("TileTicks");
        return this.fixTypeEverywhereTyped("ChunkProtoTickListFix", var1, typed2 -> typed2.updateTyped(var2, typed -> {
            Typed var7 = typed.update(DSL.remainderFinder(), dynamic -> (Dynamic)DataFixUtils.orElse(dynamic.get("LiquidTicks").result().map(dynamic2 -> dynamic.set("fluid_ticks", dynamic2).remove("LiquidTicks")), (Object)dynamic));
            Dynamic var8 = (Dynamic)var7.get(DSL.remainderFinder());
            MutableInt mutableInt = new MutableInt();
            Int2ObjectArrayMap int2ObjectArrayMap = new Int2ObjectArrayMap();
            var7.getOptionalTyped(var3).ifPresent(arg_0 -> class03018.N(opticFinder, var6, mutableInt, var5, (Int2ObjectMap)int2ObjectArrayMap, var7, arg_0));
            byte by = mutableInt.byteValue();
            typed = var7.update(DSL.remainderFinder(), dynamic2 -> dynamic2.update("yPos", dynamic -> dynamic.createByte(by)));
            if (typed.getOptionalTyped(var8).isPresent() || var8.get("fluid_ticks").result().isPresent()) {
                return typed;
            }
            int n = var8.get("xPos").asInt(0);
            int n2 = var8.get("zPos").asInt(0);
            Dynamic<?> var14 = this.N(var8, (Int2ObjectMap<Supplier<class03021>>)int2ObjectArrayMap, by, n, n2, "LiquidsToBeTicked", class03018::y);
            Dynamic<?> var15 = this.N(var8, (Int2ObjectMap<Supplier<class03021>>)int2ObjectArrayMap, by, n, n2, "ToBeTicked", class03018::N);
            Optional optional = var8.type().readTyped(var15).result();
            if (optional.isPresent()) {
                typed = typed.set(var8, (Typed)((Pair)optional.get()).getFirst());
            }
            return typed.update(DSL.remainderFinder(), dynamic2 -> dynamic2.remove("ToBeTicked").remove("LiquidsToBeTicked").set("fluid_ticks", var14));
        }));
    }
}

