/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.OptionalDynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.List;
import minecraft.class06962;

public class class08381
extends DataFix {
    private static final List<String> N = List.of("feet", "legs", "chest", "head");
    private static final List<String> y = List.of("mainhand", "offhand");
    private static final float L = 0.085f;

    public class08381(Schema schema) {
        super(schema, false);
    }

    private static List<Float> N(OptionalDynamic<?> optionalDynamic) {
        return optionalDynamic.asStream().map(dynamic -> Float.valueOf(dynamic.asFloat(0.085f))).toList();
    }

    private static Dynamic<?> N(Dynamic<?> dynamic, List<Float> list, List<String> list2) {
        for (int i = 0; i < list2.size() && i < list.size(); ++i) {
            String string = list2.get(i);
            float f = list.get(i).floatValue();
            if (f == 0.085f) continue;
            dynamic = dynamic.set(string, dynamic.createFloat(f));
        }
        return dynamic;
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("DropChancesFormatFix", this.getInputSchema().getType(class06962.o), typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            List<Float> var1 = class08381.N(dynamic.get("ArmorDropChances"));
            List<Float> var2 = class08381.N(dynamic.get("HandDropChances"));
            float f = dynamic.get("body_armor_drop_chance").asNumber().result().map(Number::floatValue).orElse(Float.valueOf(0.085f)).floatValue();
            dynamic = dynamic.remove("ArmorDropChances").remove("HandDropChances").remove("body_armor_drop_chance");
            Dynamic dynamic2 = dynamic.emptyMap();
            Dynamic<?> var4 = class08381.N(dynamic2, var1, N);
            var4 = class08381.N(var4, var2, y);
            if (f != 0.085f) {
                dynamic2 = var4.set("body", dynamic.createFloat(f));
            }
            if (!dynamic2.equals((Object)dynamic.emptyMap())) {
                return dynamic.set("drop_chances", dynamic2);
            }
            return dynamic;
        }));
    }
}

