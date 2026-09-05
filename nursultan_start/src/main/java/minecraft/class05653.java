/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00955
 *  minecraft.class06962
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;
import minecraft.class00955;
import minecraft.class06962;

public class class05653
extends class00955 {
    public class05653(Schema schema, String string) {
        super(schema, false, "Villager profession data fix (" + string + ")", class06962.o, string);
    }

    protected Typed<?> N(Typed<?> typed) {
        Dynamic var2 = (Dynamic)typed.get(DSL.remainderFinder());
        return typed.set(DSL.remainderFinder(), (Object)var2.remove("Profession").remove("Career").remove("CareerLevel").set("VillagerData", var2.createMap((Map)ImmutableMap.of((Object)var2.createString("type"), (Object)var2.createString("minecraft:plains"), (Object)var2.createString("profession"), (Object)var2.createString(class05653.N(var2.get("Profession").asInt(0), var2.get("Career").asInt(0))), (Object)var2.createString("level"), (Object)((Dynamic)DataFixUtils.orElse((Optional)var2.get("CareerLevel").result(), (Object)var2.createInt(1)))))));
    }

    private static String N(int n, int n2) {
        if (n == 0) {
            if (n2 == 2) {
                return "minecraft:fisherman";
            }
            if (n2 == 3) {
                return "minecraft:shepherd";
            }
            if (n2 == 4) {
                return "minecraft:fletcher";
            }
            return "minecraft:farmer";
        }
        if (n == 1) {
            if (n2 == 2) {
                return "minecraft:cartographer";
            }
            return "minecraft:librarian";
        }
        if (n == 2) {
            return "minecraft:cleric";
        }
        if (n == 3) {
            if (n2 == 2) {
                return "minecraft:weaponsmith";
            }
            if (n2 == 3) {
                return "minecraft:toolsmith";
            }
            return "minecraft:armorer";
        }
        if (n == 4) {
            if (n2 == 2) {
                return "minecraft:leatherworker";
            }
            return "minecraft:butcher";
        }
        if (n == 5) {
            return "minecraft:nitwit";
        }
        return "minecraft:none";
    }
}

