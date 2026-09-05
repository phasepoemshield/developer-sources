/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class01733
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class01733;
import minecraft.class06962;

public class class03921
extends class01733 {
    public class03921(Schema schema) {
        super(schema, false, "Remove filtered text from signs", class06962.G, "minecraft:sign");
    }

    protected <T> Dynamic<T> N(Dynamic<T> dynamic) {
        return dynamic.remove("FilteredText1").remove("FilteredText2").remove("FilteredText3").remove("FilteredText4");
    }
}

