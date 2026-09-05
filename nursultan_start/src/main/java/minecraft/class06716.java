/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  minecraft.class06599
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Objects;
import minecraft.class06599;
import org.jspecify.annotations.Nullable;

public final class class06716
extends class06599 {
    private @Nullable IntSet B;

    public class06716(Typed<?> typed, Schema schema) {
        super(typed, schema);
    }

    protected boolean N() {
        this.B = new IntOpenHashSet();
        for (int i = 0; i < this.i.size(); ++i) {
            if (!Objects.equals(((Dynamic)this.i.get(i)).get("Name").asString(""), "minecraft:trapped_chest")) continue;
            this.B.add(i);
        }
        return this.B.isEmpty();
    }

    public boolean N(int n) {
        return this.B.contains(n);
    }
}

