/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00955
 *  minecraft.class02849
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class00955;
import minecraft.class02849;
import minecraft.class06962;

public class class02493
extends class00955 {
    public class02493(Schema schema) {
        super(schema, false, "PlayerHeadBlockProfileFix", class06962.G, "minecraft:skull");
    }

    private static /* synthetic */ Optional N(Optional optional) {
        return optional;
    }

    private <T> Dynamic<T> N(Dynamic<T> dynamic) {
        Optional optional;
        Optional optional2 = dynamic.get("SkullOwner").result();
        Optional optional3 = optional2.or(() -> class02493.N(optional = dynamic.get("ExtraType").result()));
        if (optional3.isEmpty()) {
            return dynamic;
        }
        dynamic = dynamic.remove("SkullOwner").remove("ExtraType");
        dynamic = dynamic.set("profile", class02849.N((Dynamic)((Dynamic)optional3.get())));
        return dynamic;
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::N);
    }
}

