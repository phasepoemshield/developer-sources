/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  minecraft.class04995
 *  minecraft.class06962
 */
package minecraft;

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
import java.util.List;
import java.util.stream.LongStream;
import minecraft.class04995;
import minecraft.class06962;

public class class05067
extends DataFix {
    private static final int N = 6;
    private static final int y = 16;
    private static final int L = 16;
    private static final int u = 4096;
    private static final int i = 9;
    private static final int R = 256;

    public class05067(Schema schema) {
        super(schema, false);
    }

    private static Typed<?> N(OpticFinder<?> opticFinder, OpticFinder<?> opticFinder2, OpticFinder<List<Pair<String, Dynamic<?>>>> opticFinder3, Typed<?> typed) {
        return typed.updateTyped(opticFinder, typed2 -> typed2.updateTyped(opticFinder2, typed -> {
            int n = typed.getOptional(opticFinder3).map(list -> Math.max(4, DataFixUtils.ceillog2((int)list.size()))).orElse(0);
            if (n == 0 || class04995.i((int)n)) {
                return typed;
            }
            return typed.update(DSL.remainderFinder(), dynamic -> dynamic.update("BlockStates", dynamic2 -> class05067.N(dynamic, dynamic2, 4096, n)));
        }));
    }

    private static Dynamic<?> N(Dynamic<?> dynamic, Dynamic<?> dynamic2, int n, int n2) {
        long[] lArray = dynamic2.asLongStream().toArray();
        long[] lArray2 = class05067.N(n, n2, lArray);
        return dynamic.createLongList(LongStream.of(lArray2));
    }

    public static long[] N(int n, int n2, long[] lArray) {
        int n3 = lArray.length;
        if (n3 == 0) {
            return lArray;
        }
        long l = (1L << n2) - 1L;
        int n4 = 64 / n2;
        long[] lArray2 = new long[(n + n4 - 1) / n4];
        int n5 = 0;
        int n6 = 0;
        long l2 = 0L;
        int n7 = 0;
        long l3 = lArray[0];
        long l4 = n3 > 1 ? lArray[1] : 0L;
        for (int i = 0; i < n; ++i) {
            int n8;
            long l5;
            int n9 = i * n2;
            int n10 = n9 >> 6;
            int n11 = (i + 1) * n2 - 1 >> 6;
            int n12 = n9 ^ n10 << 6;
            if (n10 != n7) {
                l3 = l4;
                l4 = n10 + 1 < n3 ? lArray[n10 + 1] : 0L;
                n7 = n10;
            }
            if (n10 == n11) {
                l5 = l3 >>> n12 & l;
            } else {
                n8 = 64 - n12;
                l5 = (l3 >>> n12 | l4 << n8) & l;
            }
            n8 = n6 + n2;
            if (n8 >= 64) {
                lArray2[n5++] = l2;
                l2 = l5;
                n6 = n2;
                continue;
            }
            l2 |= l5 << n6;
            n6 = n8;
        }
        if (l2 != 0L) {
            lArray2[n5] = l2;
        }
        return lArray2;
    }

    private Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic -> dynamic.update("Heightmaps", dynamic2 -> dynamic2.updateMapValues(pair -> pair.mapSecond(dynamic2 -> class05067.N(dynamic, dynamic2, 256, 9)))));
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.u);
        Type var2 = var1.findFieldType("Level");
        OpticFinder opticFinder = DSL.fieldFinder((String)"Level", (Type)var2);
        OpticFinder var4 = opticFinder.type().findField("Sections");
        OpticFinder opticFinder2 = DSL.typeFinder((Type)((List.ListType)var4.type()).getElement());
        Type var7 = DSL.named((String)class06962.d.typeName(), (Type)DSL.remainderType());
        OpticFinder opticFinder3 = DSL.fieldFinder((String)"Palette", (Type)DSL.list((Type)var7));
        return this.fixTypeEverywhereTyped("BitStorageAlignFix", var1, this.getOutputSchema().getType(class06962.u), typed2 -> typed2.updateTyped(opticFinder, typed -> this.N(class05067.N(var4, opticFinder2, opticFinder3, typed))));
    }
}

