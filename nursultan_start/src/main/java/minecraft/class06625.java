/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  minecraft.class05945
 *  minecraft.class06599
 *  minecraft.class06616
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Objects;
import minecraft.class05945;
import minecraft.class06599;
import minecraft.class06616;
import org.jspecify.annotations.Nullable;

public final class class06625
extends class06599 {
    private static final String B = "persistent";
    private static final String Z = "decayable";
    private static final String z = "distance";
    private @Nullable IntSet U;
    private @Nullable IntSet E;
    private @Nullable Int2IntMap W;

    int L(int n) {
        if (this.N(n)) {
            return 0;
        }
        return Integer.parseInt(((Dynamic)this.i.get(n)).get("Properties").get(z).asString(""));
    }

    public class06625(Typed<?> typed, Schema schema) {
        super(typed, schema);
    }

    public boolean y(int n) {
        return this.U.contains(n);
    }

    void N(int n, int n2, int n3) {
        int n4;
        boolean bl;
        Dynamic var4 = (Dynamic)this.i.get(n2);
        String string = var4.get("Name").asString("");
        int n5 = this.N(string, bl = Objects.equals(var4.get("Properties").get(B).asString(""), "true"), n3);
        if (!this.W.containsKey(n5)) {
            n4 = this.i.size();
            this.U.add(n4);
            this.W.put(n5, n4);
            this.i.add(this.N(var4, string, bl, n3));
        }
        n4 = this.W.get(n5);
        if (1 << this.M.y() <= n4) {
            class05945 class059452 = new class05945(this.M.y() + 1, 4096);
            for (int i = 0; i < 4096; ++i) {
                class059452.N(i, this.M.N(i));
            }
            this.M = class059452;
        }
        this.M.N(n, n4);
    }

    public boolean N(int n) {
        return this.E.contains(n);
    }

    private Dynamic<?> N(Dynamic<?> dynamic, String string, boolean bl, int n) {
        Dynamic dynamic2 = dynamic.emptyMap();
        dynamic2 = dynamic2.set(B, dynamic2.createString(bl ? "true" : "false"));
        dynamic2 = dynamic2.set(z, dynamic2.createString(Integer.toString(n)));
        Dynamic dynamic3 = dynamic.emptyMap();
        dynamic3 = dynamic3.set("Properties", dynamic2);
        dynamic3 = dynamic3.set("Name", dynamic3.createString(string));
        return dynamic3;
    }

    protected boolean N() {
        this.U = new IntOpenHashSet();
        this.E = new IntOpenHashSet();
        this.W = new Int2IntOpenHashMap();
        for (int i = 0; i < this.i.size(); ++i) {
            Dynamic var2 = (Dynamic)this.i.get(i);
            String string = var2.get("Name").asString("");
            if (class06616.N.containsKey((Object)string)) {
                boolean bl = Objects.equals(var2.get("Properties").get(Z).asString(""), "false");
                this.U.add(i);
                this.W.put(this.N(string, bl, 7), i);
                this.i.set(i, this.N(var2, string, bl, 7));
            }
            if (!class06616.y.contains(string)) continue;
            this.E.add(i);
        }
        return this.U.isEmpty() && this.E.isEmpty();
    }
}

