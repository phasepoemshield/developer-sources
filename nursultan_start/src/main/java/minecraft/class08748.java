/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  minecraft.class03731
 *  minecraft.class03952
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import minecraft.class03731;
import minecraft.class03952;
import minecraft.class06962;

public class class08748
extends class03952 {
    public class08748(Schema schema) {
        super(schema, "WrittenBookPagesStrictJsonFix", string -> string.equals("minecraft:written_book"));
    }

    protected Typed<?> N(Typed<?> typed2) {
        Type var2 = this.getInputSchema().getType(class06962.O);
        OpticFinder var5 = this.getInputSchema().getType(class06962.l).findField("tag").type().findField("pages");
        OpticFinder opticFinder = DSL.typeFinder((Type)var2);
        return typed2.updateTyped(var5, typed -> typed.update(opticFinder, pair -> pair.mapSecond(class03731::L)));
    }
}

