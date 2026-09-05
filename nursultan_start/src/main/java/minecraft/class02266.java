/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class03952
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
import com.mojang.serialization.Dynamic;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import minecraft.class02269;
import minecraft.class03952;
import minecraft.class06962;

public class class02266
extends DataFix {
    private static final List<String> N = List.of("minecraft:witch", "minecraft:ravager", "minecraft:pillager", "minecraft:illusioner", "minecraft:evoker", "minecraft:vindicator");

    public class02266(Schema schema) {
        super(schema, true);
    }

    private void y(List<TypeRewriteRule> list) {
        list.add(this.N(class06962.G, "minecraft:beehive", Map.of("FlowerPos", "flower_pos")));
        list.add(this.N(class06962.G, "minecraft:end_gateway", Map.of("ExitPortal", "exit_portal")));
    }

    private Typed<?> N(Typed<?> typed, Map<String, String> map) {
        return typed.update(DSL.remainderFinder(), dynamic -> {
            for (Map.Entry entry : map.entrySet()) {
                dynamic = dynamic.renameAndFixField((String)entry.getKey(), (String)entry.getValue(), class02269::N);
            }
            return dynamic;
        });
    }

    private void N(List<TypeRewriteRule> list) {
        list.add(this.N(class06962.o, "minecraft:bee", Map.of("HivePos", "hive_pos", "FlowerPos", "flower_pos")));
        list.add(this.N(class06962.o, "minecraft:end_crystal", Map.of("BeamTarget", "beam_target")));
        list.add(this.N(class06962.o, "minecraft:wandering_trader", Map.of("WanderTarget", "wander_target")));
        for (String string : N) {
            list.add(this.N(class06962.o, string, Map.of("PatrolTarget", "patrol_target")));
        }
        list.add(this.fixTypeEverywhereTyped("BlockPos format in Leash for mobs", this.getInputSchema().getType(class06962.o), typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.renameAndFixField("Leash", "leash", class02269::N))));
    }

    private TypeRewriteRule N(DSL.TypeReference typeReference, String string, Map<String, String> map) {
        String string2 = "BlockPos format in " + String.valueOf(map.keySet()) + " for " + string + " (" + typeReference.typeName() + ")";
        OpticFinder opticFinder = DSL.namedChoice((String)string, (Type)this.getInputSchema().getChoiceType(typeReference, string));
        return this.fixTypeEverywhereTyped(string2, this.getInputSchema().getType(typeReference), typed2 -> typed2.updateTyped(opticFinder, typed -> this.N((Typed<?>)typed, map)));
    }

    private <T> Dynamic<T> N(Dynamic<T> dynamic) {
        return dynamic.update("frames", dynamic2 -> dynamic2.createList(dynamic2.asStream().map(dynamic -> {
            dynamic = dynamic.renameAndFixField("Pos", "pos", class02269::N);
            dynamic = dynamic.renameField("Rotation", "rotation");
            dynamic = dynamic.renameField("EntityId", "entity_id");
            return dynamic;
        }))).update("banners", dynamic2 -> dynamic2.createList(dynamic2.asStream().map(dynamic -> {
            dynamic = dynamic.renameField("Pos", "pos");
            dynamic = dynamic.renameField("Color", "color");
            dynamic = dynamic.renameField("Name", "name");
            return dynamic;
        })));
    }

    public TypeRewriteRule makeRule() {
        ArrayList<TypeRewriteRule> arrayList = new ArrayList<TypeRewriteRule>();
        this.N(arrayList);
        this.y(arrayList);
        arrayList.add(this.writeFixAndRead("BlockPos format for map frames", this.getInputSchema().getType(class06962.U), this.getOutputSchema().getType(class06962.U), dynamic -> dynamic.update("data", this::N)));
        Type var2 = this.getInputSchema().getType(class06962.l);
        arrayList.add(this.fixTypeEverywhereTyped("BlockPos format for compass target", var2, class03952.N((Type)var2, "minecraft:compass"::equals, typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.update("LodestonePos", class02269::N)))));
        return TypeRewriteRule.seq(arrayList);
    }
}

