/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00955
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class00955;
import minecraft.class06962;

public class class02229
extends class00955 {
    public class02229(Schema schema) {
        super(schema, false, "JukeboxTicksSinceSongStartedFix", class06962.G, "minecraft:jukebox");
    }

    public Dynamic<?> N(Dynamic<?> dynamic) {
        long l = dynamic.get("TickCount").asLong(0L) - dynamic.get("RecordStartTick").asLong(0L);
        Dynamic dynamic2 = dynamic.remove("IsPlaying").remove("TickCount").remove("RecordStartTick");
        if (l > 0L) {
            return dynamic2.set("ticks_since_song_started", dynamic.createLong(l));
        }
        return dynamic2;
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::N);
    }
}

