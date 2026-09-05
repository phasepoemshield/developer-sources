/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.OptionalDynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Codec;
import com.mojang.serialization.OptionalDynamic;
import java.util.List;
import minecraft.class06962;

public class class01483
extends DataFix {
    private static final Codec<List<Float>> N = Codec.FLOAT.listOf();

    public class01483(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static boolean N(OptionalDynamic<?> optionalDynamic, int n) {
        return optionalDynamic.flatMap(arg_0 -> N.parse(arg_0)).map(list -> list.size() == n && list.stream().allMatch(f -> f.floatValue() == 0.0f)).result().orElse(false);
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("EntityRedundantChanceTagsFix", this.getInputSchema().getType(class06962.o), typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            if (class01483.N(dynamic.get("HandDropChances"), 2)) {
                dynamic = dynamic.remove("HandDropChances");
            }
            if (class01483.N(dynamic.get("ArmorDropChances"), 4)) {
                dynamic = dynamic.remove("ArmorDropChances");
            }
            return dynamic;
        }));
    }
}

