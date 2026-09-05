/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00622
 *  minecraft.class02269
 *  minecraft.class03731
 *  minecraft.class06962
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import minecraft.class00622;
import minecraft.class02269;
import minecraft.class03731;
import minecraft.class06962;
import minecraft.class07536;

public class class05814
extends DataFix {
    public class05814(Schema schema) {
        super(schema, true);
    }

    private static <T> Dynamic<T> N(DynamicOps<T> dynamicOps, String string, String string2) {
        if ("minecraft:commandblock_minecart".equals(string2)) {
            return new Dynamic(dynamicOps, dynamicOps.createString(string));
        }
        return class03731.N(dynamicOps, (String)string);
    }

    private static <T> Typed<?> N(Typed<?> typed, Type<?> type, OpticFinder<String> opticFinder, OpticFinder<String> opticFinder2, Type<T> type2) {
        Optional optional = typed.getOptional(opticFinder2);
        if (optional.isEmpty()) {
            return class02269.N(type, typed);
        }
        if (((String)optional.get()).isEmpty()) {
            return class07536.N(typed, type, dynamic -> dynamic.remove("CustomName"));
        }
        String string = typed.getOptional(opticFinder).orElse("");
        Dynamic<T> dynamic2 = class05814.N(typed.getOps(), (String)optional.get(), string);
        return typed.set(opticFinder2, class07536.N(type2, dynamic2));
    }

    public TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.o);
        Type type2 = this.getOutputSchema().getType(class06962.o);
        OpticFinder opticFinder = DSL.fieldFinder((String)"id", (Type)class00622.N());
        OpticFinder opticFinder2 = type.findField("CustomName");
        Type type3 = type2.findFieldType("CustomName");
        return this.fixTypeEverywhereTyped("EntityCustomNameToComponentFix", type, type2, typed -> class05814.N(typed, type2, (OpticFinder<String>)opticFinder, (OpticFinder<String>)opticFinder2, type3));
    }
}

