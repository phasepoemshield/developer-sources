/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class08347
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import minecraft.class08347;

public class class01356
extends class08347 {
    private static final Map<String, String> N = ImmutableMap.builder().put((Object)"down", (Object)"down_south").put((Object)"up", (Object)"up_north").put((Object)"north", (Object)"north_up").put((Object)"south", (Object)"south_up").put((Object)"west", (Object)"west_up").put((Object)"east", (Object)"east_up").build();

    public class01356(Schema schema) {
        super(schema, "jigsaw_rotation_fix");
    }

    protected boolean N(String string) {
        return string.equals("minecraft:jigsaw");
    }

    protected <T> Dynamic<T> N(String string, Dynamic<T> dynamic) {
        String string2 = dynamic.get("facing").asString("north");
        return dynamic.remove("facing").set("orientation", dynamic.createString(N.getOrDefault(string2, string2)));
    }
}

