/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Streams
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.List$ListType
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Streams;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.IntStream;
import minecraft.class06962;

public class class05012
extends DataFix {
    public class05012(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private <TE> TypeRewriteRule N(Type<?> type, List.ListType<TE> listType) {
        Type type2 = listType.getElement();
        OpticFinder opticFinder = DSL.fieldFinder((String)"Level", type);
        OpticFinder opticFinder2 = DSL.fieldFinder((String)"TileEntities", listType);
        int n = 416;
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhere("InjectBedBlockEntityType", (Type)this.getInputSchema().findChoiceType(class06962.G), (Type)this.getOutputSchema().findChoiceType(class06962.G), dynamicOps -> pair -> pair), (TypeRewriteRule)this.fixTypeEverywhereTyped("BedBlockEntityInjecter", this.getOutputSchema().getType(class06962.u), typed -> {
            Typed typed2 = typed.getTyped(opticFinder);
            Dynamic var5 = (Dynamic)typed2.get(DSL.remainderFinder());
            int n = var5.get("xPos").asInt(0);
            int n2 = var5.get("zPos").asInt(0);
            ArrayList arrayList = Lists.newArrayList((Iterable)((Iterable)typed2.getOrCreate(opticFinder2)));
            for (Dynamic dynamic : var5.get("Sections").asList(Function.identity())) {
                int n3 = dynamic.get("Y").asInt(0);
                Streams.mapWithIndex((IntStream)dynamic.get("Blocks").asIntStream(), (n4, l) -> {
                    if (416 == (n4 & 0xFF) << 4) {
                        int n5 = (int)l;
                        int n6 = n5 & 0xF;
                        int n7 = n5 >> 8 & 0xF;
                        int n8 = n5 >> 4 & 0xF;
                        HashMap hashMap = Maps.newHashMap();
                        hashMap.put(dynamic.createString("id"), dynamic.createString("minecraft:bed"));
                        hashMap.put(dynamic.createString("x"), dynamic.createInt(n6 + (n << 4)));
                        hashMap.put(dynamic.createString("y"), dynamic.createInt(n7 + (n3 << 4)));
                        hashMap.put(dynamic.createString("z"), dynamic.createInt(n8 + (n2 << 4)));
                        hashMap.put(dynamic.createString("color"), dynamic.createShort((short)14));
                        return hashMap;
                    }
                    return null;
                }).forEachOrdered(map -> {
                    if (map != null) {
                        arrayList.add(((Pair)type2.read(dynamic.createMap(map)).result().orElseThrow(() -> new IllegalStateException("Could not parse newly created bed block entity."))).getFirst());
                    }
                });
            }
            if (!arrayList.isEmpty()) {
                return typed.set(opticFinder, typed2.set(opticFinder2, (Object)arrayList));
            }
            return typed;
        }));
    }

    public TypeRewriteRule makeRule() {
        Type var2 = this.getOutputSchema().getType(class06962.u).findFieldType("Level");
        Type var3 = var2.findFieldType("TileEntities");
        if (!(var3 instanceof List.ListType)) {
            throw new IllegalStateException("Tile entity type is not a list type.");
        }
        List.ListType listType = (List.ListType)var3;
        return this.N(var2, listType);
    }
}

