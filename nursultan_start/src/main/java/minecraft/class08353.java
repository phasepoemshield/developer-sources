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

public class class08353
extends class00955 {
    public class08353(Schema schema, String string) {
        super(schema, false, "BlockEntityFurnaceBurnTimeFix" + string, class06962.G, string);
    }

    public Dynamic<?> N(Dynamic<?> dynamic) {
        dynamic = dynamic.renameField("CookTime", "cooking_time_spent");
        dynamic = dynamic.renameField("CookTimeTotal", "cooking_total_time");
        dynamic = dynamic.renameField("BurnTime", "lit_time_remaining");
        dynamic = dynamic.setFieldIfPresent("lit_total_time", dynamic.get("lit_time_remaining").result());
        return dynamic;
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::N);
    }
}

