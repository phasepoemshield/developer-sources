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
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import minecraft.class06962;

public class class04888
extends DataFix {
    public class04888(Schema schema, boolean bl) {
        super(schema, bl);
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.u);
        Type type2 = type.findFieldType("Level");
        OpticFinder opticFinder = DSL.fieldFinder((String)"Level", (Type)type2);
        return this.fixTypeEverywhereTyped("ChunkLightRemoveFix", type, this.getOutputSchema().getType(class06962.u), typed2 -> typed2.updateTyped(opticFinder, typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.remove("isLightOn"))));
    }
}

