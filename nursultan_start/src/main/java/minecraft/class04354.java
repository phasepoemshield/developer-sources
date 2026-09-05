/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  it.unimi.dsi.fastutil.ints.IntSets
 *  minecraft.class00947
 *  minecraft.class05647
 *  minecraft.class06262
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import java.util.Map;
import minecraft.class00947;
import minecraft.class05647;
import minecraft.class06262;
import org.jspecify.annotations.Nullable;

public class class04354
implements class06262 {
    private final Int2ObjectMap<class05647> N;

    public class04354(Map<Integer, Float> map) {
        this.N = new Int2ObjectOpenHashMap(map.size());
        map.forEach((n, f) -> this.N.put(n.intValue(), (Object)new class05647(f.floatValue())));
    }

    public IntSet N() {
        return IntSets.unmodifiable((IntSet)this.N.keySet());
    }

    public @Nullable class00947 N(int n) {
        return (class00947)this.N.get(n);
    }
}

