/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import minecraft.class03952;
import minecraft.class07536;

public class class03960
extends class03952 {
    public class03960(Schema schema) {
        super(schema, "Remove filtered text from books", string -> string.equals("minecraft:writable_book") || string.equals("minecraft:written_book"));
    }

    @Override
    protected Typed<?> N(Typed<?> typed) {
        return class07536.N(typed, (Type)typed.getType(), dynamic -> dynamic.remove("filtered_title").remove("filtered_pages"));
    }
}

