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

public class class04955
extends class08181 {
    public static final Map<String, String> N = ImmutableMap.builder().put((Object)"minecraft:zombie_pigman_spawn_egg", (Object)"minecraft:zombified_piglin_spawn_egg").build();

    public class04955(Schema schema) {
        super("EntityZombifiedPiglinRenameFix", schema, true);
    }

    protected String N(String string) {
        return Objects.equals("minecraft:zombie_pigman", string) ? "minecraft:zombified_piglin" : string;
    }
}

