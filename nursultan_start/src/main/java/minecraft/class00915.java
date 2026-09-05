/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 *  minecraft.class07536
 *  minecraft.class08147
 */
package minecraft;

import com.google.common.base.Suppliers;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.function.Supplier;
import minecraft.class06962;
import minecraft.class07536;
import minecraft.class08147;

public class class00915
extends class08147 {
    private final Supplier<Type<?>> y = Suppliers.memoize(() -> this.getOutputSchema().getChoiceType(class06962.o, "ZombieVillager"));

    public class00915(Schema schema) {
        super("EntityZombieSplitFix", schema, true);
    }

    private Typed<?> N(Typed<?> typed, int n) {
        return class07536.N(typed, this.y.get(), dynamic -> dynamic.set("Profession", dynamic.createInt(n)));
    }

    protected Pair<String, Typed<?>> N(String string, Typed<?> typed) {
        String string2;
        if (!string.equals("Zombie")) {
            return Pair.of((Object)string, typed);
        }
        int n = ((Dynamic)typed.getOptional(DSL.remainderFinder()).orElseThrow()).get("ZombieType").asInt(0);
        return Pair.of((Object)string2, (Object)(switch (n) {
            default -> {
                string2 = "Zombie";
                yield typed;
            }
            case 1, 2, 3, 4, 5 -> {
                string2 = "ZombieVillager";
                Typed<?> var6 = this.N(typed, n - 1);
            }
            case 6 -> {
                string2 = "Husk";
                yield typed;
            }
        }).update(DSL.remainderFinder(), dynamic -> dynamic.remove("ZombieType")));
    }
}

