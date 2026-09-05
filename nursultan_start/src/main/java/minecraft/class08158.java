/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import minecraft.class08147;

public abstract class class08158
extends class08147 {
    public class08158(String string, Schema schema, boolean bl) {
        super(string, schema, bl);
    }

    @Override
    protected Pair<String, Typed<?>> N(String string, Typed<?> typed) {
        Pair<String, Dynamic<?>> var3 = this.N(string, (Dynamic)typed.getOrCreate(DSL.remainderFinder()));
        return Pair.of((Object)((String)var3.getFirst()), (Object)typed.set(DSL.remainderFinder(), (Object)((Dynamic)var3.getSecond())));
    }

    protected abstract Pair<String, Dynamic<?>> N(String var1, Dynamic<?> var2);
}

