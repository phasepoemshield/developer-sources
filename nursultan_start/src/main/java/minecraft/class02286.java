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
 *  com.mojang.datafixers.types.templates.List$ListType
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List;
import minecraft.class02269;
import minecraft.class06962;

public class class02286
extends DataFix {
    public class02286(Schema schema) {
        super(schema, false);
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.U);
        OpticFinder opticFinder = type.findField("data");
        OpticFinder opticFinder2 = opticFinder.type().findField("banners");
        OpticFinder opticFinder3 = DSL.typeFinder((Type)((List.ListType)opticFinder2.type()).getElement());
        return this.fixTypeEverywhereTyped("MapBannerBlockPosFormatFix", type, typed2 -> typed2.updateTyped(opticFinder, typed -> typed.updateTyped(opticFinder2, typed2 -> typed2.updateTyped(opticFinder3, typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.update("Pos", class02269::N))))));
    }
}

