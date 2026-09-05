/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import minecraft.class06962;

public class class08349
extends DataFix {
    public class08349(Schema schema) {
        super(schema, false);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("ForcedChunkToTicketFix", this.getInputSchema().getType(class06962.z), typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.update("data", dynamic3 -> dynamic3.renameAndFixField("Forced", "tickets", dynamic2 -> dynamic2.createList(dynamic2.asLongStream().mapToObj(l -> dynamic.emptyMap().set("type", dynamic.createString("minecraft:forced")).set("level", dynamic.createInt(31)).set("ticks_left", dynamic.createLong(0L)).set("chunk_pos", dynamic.createLong(l))))))));
    }
}

