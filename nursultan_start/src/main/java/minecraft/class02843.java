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
 *  com.mojang.datafixers.types.templates.List$ListType
 *  com.mojang.serialization.Dynamic
 *  minecraft.class02269
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List;
import com.mojang.serialization.Dynamic;
import minecraft.class02269;
import minecraft.class06962;

public class class02843
extends DataFix {
    public class02843(Schema schema) {
        super(schema, true);
    }

    private Dynamic<?> y(Dynamic<?> dynamic) {
        dynamic = dynamic.remove("EntityData");
        dynamic = dynamic.renameField("TicksInHive", "ticks_in_hive");
        dynamic = dynamic.renameField("MinOccupationTicks", "min_ticks_in_hive");
        return dynamic;
    }

    private Dynamic<?> N(Dynamic<?> dynamic) {
        return dynamic.remove("Bees");
    }

    public TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getChoiceType(class06962.G, "minecraft:beehive");
        OpticFinder opticFinder = DSL.namedChoice((String)"minecraft:beehive", (Type)type);
        List.ListType listType = (List.ListType)type.findFieldType("Bees");
        Type type2 = listType.getElement();
        OpticFinder opticFinder2 = DSL.fieldFinder((String)"Bees", (Type)listType);
        OpticFinder opticFinder3 = DSL.typeFinder((Type)type2);
        Type type3 = this.getInputSchema().getType(class06962.G);
        Type type4 = this.getOutputSchema().getType(class06962.G);
        return this.fixTypeEverywhereTyped("BeehiveFieldRenameFix", type3, type4, typed2 -> class02269.N((Type)type4, (Typed)typed2.updateTyped(opticFinder, typed -> typed.update(DSL.remainderFinder(), this::N).updateTyped(opticFinder2, typed2 -> typed2.updateTyped(opticFinder3, typed -> typed.update(DSL.remainderFinder(), this::y))))));
    }
}

