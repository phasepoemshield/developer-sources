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
import minecraft.class08181;

public class class05805
extends class08181 {
    public static final Map<String, String> N = ImmutableMap.builder().put((Object)"minecraft:salmon_mob", (Object)"minecraft:salmon").put((Object)"minecraft:cod_mob", (Object)"minecraft:cod").build();
    public static final Map<String, String> y = ImmutableMap.builder().put((Object)"minecraft:salmon_mob_spawn_egg", (Object)"minecraft:salmon_spawn_egg").put((Object)"minecraft:cod_mob_spawn_egg", (Object)"minecraft:cod_spawn_egg").build();

    public class05805(Schema schema, boolean bl) {
        super("EntityCodSalmonFix", schema, bl);
    }

    protected String N(String string) {
        return N.getOrDefault(string, string);
    }
}

