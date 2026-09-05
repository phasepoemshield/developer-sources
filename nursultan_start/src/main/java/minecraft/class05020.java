/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00955
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class00955;
import minecraft.class06962;

public class class05020
extends class00955 {
    public class05020(Schema schema, boolean bl) {
        super(schema, bl, "BlockEntityBannerColorFix", class06962.G, "minecraft:banner");
    }

    public Dynamic<?> N(Dynamic<?> dynamic2) {
        dynamic2 = dynamic2.update("Base", dynamic -> dynamic.createInt(15 - dynamic.asInt(0)));
        dynamic2 = dynamic2.update("Patterns", dynamic -> (Dynamic)DataFixUtils.orElse((Optional)dynamic.asStreamOpt().map(stream -> stream.map(dynamic2 -> dynamic2.update("Color", dynamic -> dynamic.createInt(15 - dynamic.asInt(0))))).map(arg_0 -> ((Dynamic)dynamic).createList(arg_0)).result(), (Object)dynamic));
        return dynamic2;
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::N);
    }
}

