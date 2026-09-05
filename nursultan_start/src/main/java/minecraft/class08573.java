/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class02269
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class02269;
import minecraft.class06962;

public class class08573
extends DataFix {
    public class08573(Schema schema) {
        super(schema, false);
    }

    private static Dynamic<?> y(Dynamic<?> dynamic) {
        return class02269.N(dynamic, (String)"CX", (String)"CY", (String)"CZ", (String)"center").renameField("Id", "id").renameField("Started", "started").renameField("Active", "active").renameField("TicksActive", "ticks_active").renameField("BadOmenLevel", "raid_omen_level").renameField("GroupsSpawned", "groups_spawned").renameField("PreRaidTicks", "cooldown_ticks").renameField("PostRaidTicks", "post_raid_ticks").renameField("TotalHealth", "total_health").renameField("NumGroups", "group_count").renameField("Status", "status").renameField("HeroesOfTheVillage", "heroes_of_the_village");
    }

    private static Dynamic<?> N(Dynamic<?> dynamic2) {
        return dynamic2.renameAndFixField("Raids", "raids", dynamic -> dynamic.createList(dynamic.asStream().map(class08573::y))).renameField("Tick", "tick").renameField("NextAvailableID", "next_id");
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("RaidRenamesDataFix", this.getInputSchema().getType(class06962.W), typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.update("data", class08573::N)));
    }
}

