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

public class class06169
extends class08181 {
    public static final Map<String, String> N = ImmutableMap.builder().put((Object)"minecraft:illager_beast_spawn_egg", (Object)"minecraft:ravager_spawn_egg").build();

    public class06169(Schema schema, boolean bl) {
        super("EntityRavagerRenameFix", schema, bl);
    }

    protected String N(String string) {
        return Objects.equals("minecraft:illager_beast", string) ? "minecraft:ravager" : string;
    }
}

