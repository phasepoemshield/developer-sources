/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.schemas.Schema
 *  minecraft.class08181
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Objects;
import minecraft.class08181;

public class class05831
extends class08181 {
    public static final Map<String, String> N = ImmutableMap.builder().put((Object)"minecraft:puffer_fish_spawn_egg", (Object)"minecraft:pufferfish_spawn_egg").build();

    public class05831(Schema schema, boolean bl) {
        super("EntityPufferfishRenameFix", schema, bl);
    }

    protected String N(String string) {
        return Objects.equals("minecraft:puffer_fish", string) ? "minecraft:pufferfish" : string;
    }
}

