/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00622
 *  minecraft.class02269
 *  minecraft.class06962
 *  minecraft.class08147
 */
package minecraft;

import com.google.common.base.Suppliers;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import java.util.function.Supplier;
import minecraft.class00228;
import minecraft.class00622;
import minecraft.class02269;
import minecraft.class06962;
import minecraft.class08147;

public class class00218
extends class08147 {
    private final Supplier<class00228> y = Suppliers.memoize(() -> {
        OpticFinder opticFinder = class02269.N((Type)this.getInputSchema().getChoiceType(class06962.o, "minecraft:potion"), (Type)this.getInputSchema().getType(class06962.o), (Type)this.getOutputSchema().getType(class06962.o)).findField("Item");
        OpticFinder opticFinder2 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)class06962.K.typeName(), (Type)class00622.N()));
        return new class00228(opticFinder, (OpticFinder<Pair<String, String>>)opticFinder2);
    });

    public class00218(Schema schema) {
        super("ThrownPotionSplitFix", schema, true);
    }

    protected Pair<String, Typed<?>> N(String string, Typed<?> typed) {
        if (!string.equals("minecraft:potion")) {
            return Pair.of((Object)string, typed);
        }
        String string2 = this.y.get().N(typed);
        if ("minecraft:lingering_potion".equals(string2)) {
            return Pair.of((Object)"minecraft:lingering_potion", typed);
        }
        return Pair.of((Object)"minecraft:splash_potion", typed);
    }
}

