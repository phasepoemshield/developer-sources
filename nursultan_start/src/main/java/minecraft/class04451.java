/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class08360
 */
package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class08360;

public class class04451
extends class08360 {
    private static final String[] N = new String[]{"minecraft:ponder_goat_horn", "minecraft:sing_goat_horn", "minecraft:seek_goat_horn", "minecraft:feel_goat_horn", "minecraft:admire_goat_horn", "minecraft:call_goat_horn", "minecraft:yearn_goat_horn", "minecraft:dream_goat_horn"};

    public class04451(Schema schema) {
        super(schema, "GoatHornIdFix", string -> string.equals("minecraft:goat_horn"));
    }

    protected <T> Dynamic<T> N(Dynamic<T> dynamic) {
        int n = dynamic.get("SoundVariant").asInt(0);
        String string = N[n >= 0 && n < N.length ? n : 0];
        return dynamic.remove("SoundVariant").set("instrument", dynamic.createString(string));
    }
}

