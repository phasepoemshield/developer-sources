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
 *  minecraft.class00622
 *  minecraft.class03731
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import minecraft.class00622;
import minecraft.class03731;
import minecraft.class06962;

class class05026
extends DataFix {
    class05026(Schema schema, boolean bl) {
        super(schema, bl);
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.o);
        OpticFinder opticFinder = DSL.fieldFinder((String)"id", (Type)class00622.N());
        OpticFinder opticFinder2 = type.findField("CustomName");
        OpticFinder opticFinder3 = DSL.typeFinder((Type)this.getInputSchema().getType(class06962.O));
        return this.fixTypeEverywhereTyped("Command block minecart custom name fix", type, typed2 -> {
            String string = typed2.getOptional(opticFinder).orElse("");
            if (!"minecraft:commandblock_minecart".equals(string)) {
                return typed2;
            }
            return typed2.updateTyped(opticFinder2, typed -> typed.update(opticFinder3, pair -> pair.mapSecond(class03731::N)));
        });
    }
}

