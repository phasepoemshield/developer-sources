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
import minecraft.class03731;
import minecraft.class06962;

public class class07919
extends DataFix {
    public class07919(Schema schema) {
        super(schema, false);
    }

    public TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.l);
        Type type2 = this.getInputSchema().getType(class06962.O);
        OpticFinder opticFinder = type.findField("tag");
        OpticFinder opticFinder2 = opticFinder.type().findField("display");
        OpticFinder opticFinder3 = opticFinder2.type().findField("Name");
        OpticFinder opticFinder4 = DSL.typeFinder((Type)type2);
        return this.fixTypeEverywhereTyped("ItemCustomNameToComponentFix", type, typed2 -> typed2.updateTyped(opticFinder, typed -> typed.updateTyped(opticFinder2, typed2 -> typed2.updateTyped(opticFinder3, typed -> typed.update(opticFinder4, pair -> pair.mapSecond(class03731::N))))));
    }
}

