/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00955
 *  minecraft.class01894
 *  minecraft.class06962
 *  minecraft.class07709
 *  minecraft.class07713
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import minecraft.class00955;
import minecraft.class01894;
import minecraft.class06962;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class08203;
import org.slf4j.Logger;

public class class08223
extends class00955 {
    private static final Logger L = LogUtils.getLogger();

    public class08223(Schema schema) {
        super(schema, false, "TrialSpawnerConfigInRegistryFix", class06962.G, "minecraft:trial_spawner");
    }

    public Dynamic<?> N(Dynamic<class07709> dynamic) {
        Optional optional = dynamic.get("normal_config").result();
        if (optional.isEmpty()) {
            return dynamic;
        }
        Optional optional2 = dynamic.get("ominous_config").result();
        if (optional2.isEmpty()) {
            return dynamic;
        }
        class01894 class018942 = class08203.N.get(Pair.of((Object)((Dynamic)optional.get()), (Object)((Dynamic)optional2.get())));
        if (class018942 == null) {
            return dynamic;
        }
        return dynamic.set("normal_config", dynamic.createString(class018942.M("/normal").toString())).set("ominous_config", dynamic.createString(class018942.M("/ominous").toString()));
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic -> {
            DynamicOps dynamicOps = dynamic.getOps();
            return this.N((Dynamic<class07709>)dynamic.convert((DynamicOps)class07713.N)).convert(dynamicOps);
        });
    }
}

