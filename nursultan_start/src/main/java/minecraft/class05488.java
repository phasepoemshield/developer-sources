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
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;
import minecraft.class06962;

public class class05488
extends DataFix {
    public class05488(Schema schema, boolean bl) {
        super(schema, bl);
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.u);
        OpticFinder var2 = var1.findField("Level");
        return this.fixTypeEverywhereTyped("Leaves fix", var1, typed2 -> typed2.updateTyped(var2, typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            int n;
            Optional var1 = dynamic.get("Biomes").asIntStreamOpt().result();
            if (var1.isEmpty()) {
                return dynamic;
            }
            int[] nArray = ((IntStream)var1.get()).toArray();
            if (nArray.length != 256) {
                return dynamic;
            }
            int[] nArray2 = new int[1024];
            for (n = 0; n < 4; ++n) {
                for (int i = 0; i < 4; ++i) {
                    int n2 = (i << 2) + 2;
                    int n3 = (n << 2) + 2 << 4 | n2;
                    nArray2[n << 2 | i] = nArray[n3];
                }
            }
            for (n = 1; n < 64; ++n) {
                System.arraycopy(nArray2, 0, nArray2, n * 16, 16);
            }
            return dynamic.set("Biomes", dynamic.createIntList(Arrays.stream(nArray2)));
        })));
    }
}

