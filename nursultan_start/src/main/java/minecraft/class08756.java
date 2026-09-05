/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  minecraft.class00955
 *  minecraft.class03731
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.List;
import minecraft.class00955;
import minecraft.class03731;
import minecraft.class06962;

public class class08756
extends class00955 {
    private static final List<String> L = List.of("Text1", "Text2", "Text3", "Text4");

    public class08756(Schema schema) {
        super(schema, false, "SignTextStrictJsonFix", class06962.G, "Sign");
    }

    protected Typed<?> N(Typed<?> typed2) {
        Typed var1;
        for (String string : L) {
            OpticFinder var4 = typed2.getType().findField(string);
            OpticFinder opticFinder = DSL.typeFinder((Type)this.getInputSchema().getType(class06962.O));
            var1 = typed2.updateTyped(var4, typed -> typed.update(opticFinder, pair -> pair.mapSecond(class03731::L)));
        }
        return var1;
    }
}

