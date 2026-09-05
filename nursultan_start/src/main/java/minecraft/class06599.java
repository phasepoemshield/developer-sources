/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  minecraft.class05945
 *  minecraft.class06962
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import minecraft.class05945;
import minecraft.class06616;
import minecraft.class06962;
import org.jspecify.annotations.Nullable;

public abstract class class06599 {
    protected static final String N = "BlockStates";
    protected static final String y = "Name";
    protected static final String L = "Properties";
    private final Type<Pair<String, Dynamic<?>>> B = DSL.named((String)class06962.d.typeName(), (Type)DSL.remainderType());
    protected final OpticFinder<List<Pair<String, Dynamic<?>>>> u = DSL.fieldFinder((String)"Palette", (Type)DSL.list(this.B));
    protected final List<Dynamic<?>> i;
    protected final int R;
    protected @Nullable class05945 M;

    int L() {
        return this.R;
    }

    public class06599(Typed<?> typed, Schema schema) {
        if (!Objects.equals(schema.getType(class06962.d), this.B)) {
            throw new IllegalStateException("Block state type is not what was expected.");
        }
        Optional var3 = typed.getOptional(this.u);
        this.i = var3.map(list -> list.stream().map(Pair::getSecond).collect(Collectors.toList())).orElse((List)ImmutableList.of());
        Dynamic var4 = (Dynamic)typed.get(DSL.remainderFinder());
        this.R = var4.get("Y").asInt(0);
        this.N(var4);
    }

    public int u(int n) {
        return this.M.N(n);
    }

    public boolean y() {
        return this.M == null;
    }

    protected abstract boolean N();

    protected int N(String string, boolean bl, int n) {
        return class06616.N.get((Object)string) << 5 | (bl ? 16 : 0) | n;
    }

    public Typed<?> N(Typed<?> typed) {
        if (this.y()) {
            return typed;
        }
        return typed.update(DSL.remainderFinder(), dynamic -> dynamic.set(N, dynamic.createLongList(Arrays.stream(this.M.N())))).set(this.u, this.i.stream().map(dynamic -> Pair.of((Object)class06962.d.typeName(), (Object)dynamic)).collect(Collectors.toList()));
    }

    protected void N(Dynamic<?> dynamic) {
        if (this.N()) {
            this.M = null;
        } else {
            long[] lArray = dynamic.get(N).asLongStream().toArray();
            int n = Math.max(4, DataFixUtils.ceillog2((int)this.i.size()));
            this.M = new class05945(n, 4096, lArray);
        }
    }
}

