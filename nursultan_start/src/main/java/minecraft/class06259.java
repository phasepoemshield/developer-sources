/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.CompoundList$CompoundListType
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00622
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.CompoundList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.stream.Collectors;
import minecraft.class00622;
import minecraft.class06962;

public class class06259
extends DataFix {
    public class06259(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private <SF> TypeRewriteRule N(CompoundList.CompoundListType<String, SF> compoundListType) {
        Type var2 = this.getInputSchema().getType(class06962.u);
        Type var3 = this.getInputSchema().getType(class06962.H);
        OpticFinder var4 = var2.findField("Level");
        OpticFinder var5 = var4.type().findField("Structures");
        OpticFinder var6 = var5.type().findField("Starts");
        OpticFinder opticFinder = compoundListType.finder();
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhereTyped("NewVillageFix", var2, typed2 -> typed2.updateTyped(var4, typed -> typed.updateTyped(var5, typed2 -> typed2.updateTyped(var6, typed -> typed.update(opticFinder, list -> list.stream().filter(pair -> !Objects.equals(pair.getFirst(), "Village")).map(pair -> pair.mapFirst(string -> string.equals("New_Village") ? "Village" : string)).collect(Collectors.toList()))).update(DSL.remainderFinder(), dynamic2 -> dynamic2.update("References", dynamic -> ((Dynamic)DataFixUtils.orElse(dynamic.get("New_Village").result().map(dynamic2 -> dynamic.remove("New_Village").set("Village", dynamic2)), (Object)dynamic)).remove("Village")))))), (TypeRewriteRule)this.fixTypeEverywhereTyped("NewVillageStartFix", var3, typed -> typed.update(DSL.remainderFinder(), dynamic2 -> dynamic2.update("id", dynamic -> Objects.equals(class00622.N((String)dynamic.asString("")), "minecraft:new_village") ? dynamic.createString("minecraft:village") : dynamic))));
    }

    protected TypeRewriteRule makeRule() {
        CompoundList.CompoundListType compoundListType = DSL.compoundList((Type)DSL.string(), (Type)this.getInputSchema().getType(class06962.H));
        OpticFinder opticFinder = compoundListType.finder();
        return this.N(compoundListType);
    }
}

