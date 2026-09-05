/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00622
 *  minecraft.class00955
 *  minecraft.class06962
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import minecraft.class00622;
import minecraft.class00955;
import minecraft.class06962;

public class class05802
extends class00955 {
    private static final Map<String, String> L = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
        hashMap.put("donkeykong", "donkey_kong");
        hashMap.put("burningskull", "burning_skull");
        hashMap.put("skullandroses", "skull_and_roses");
    });

    public class05802(Schema schema, boolean bl) {
        super(schema, bl, "EntityPaintingMotiveFix", class06962.o, "minecraft:painting");
    }

    public Dynamic<?> N(Dynamic<?> dynamic) {
        Optional var2 = dynamic.get("Motive").asString().result();
        if (var2.isPresent()) {
            String string = ((String)var2.get()).toLowerCase(Locale.ROOT);
            return dynamic.set("Motive", dynamic.createString(class00622.N((String)L.getOrDefault(string, string))));
        }
        return dynamic;
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::N);
    }
}

