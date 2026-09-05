/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import minecraft.class06962;

public class class03206
extends DataFix {
    public class03206(Schema schema) {
        super(schema, true);
    }

    private <T> Typed<T> y(Type<T> type, Typed<?> typed) {
        DynamicOps var3 = typed.getOps();
        List list = ((List)typed.getValue()).stream().map(object -> {
            Pair pair = (Pair)object;
            int n = ((Number)((Dynamic)pair.getSecond()).get("Weight").asNumber().result().orElse(1)).intValue();
            Dynamic dynamic = new Dynamic(var3);
            dynamic = dynamic.set("weight", dynamic.createInt(n));
            Dynamic dynamic2 = ((Dynamic)pair.getSecond()).remove("Weight").remove("Entity");
            return Pair.of((Object)Pair.of((Object)pair.getFirst(), (Object)dynamic2), (Object)dynamic);
        }).toList();
        return new Typed(type, var3, (Object)list);
    }

    private <T> Typed<T> N(Type<T> type, Typed<?> typed) {
        DynamicOps var3 = typed.getOps();
        return new Typed(type, var3, (Object)Pair.of((Object)typed.getValue(), (Object)new Dynamic(var3)));
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.e);
        Type var2 = this.getOutputSchema().getType(class06962.e);
        OpticFinder var3 = var1.findField("SpawnData");
        Type var4 = var2.findField("SpawnData").type();
        OpticFinder var5 = var1.findField("SpawnPotentials");
        Type var6 = var2.findField("SpawnPotentials").type();
        return this.fixTypeEverywhereTyped("Fix mob spawner data structure", var1, var2, typed2 -> typed2.updateTyped(var3, var4, typed -> this.N((Type)var4, (Typed<?>)typed)).updateTyped(var5, var6, typed -> this.y((Type)var6, (Typed<?>)typed)));
    }
}

