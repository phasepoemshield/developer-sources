/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class01199
 *  minecraft.class05945
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import minecraft.class01199;
import minecraft.class05803;
import minecraft.class05819;
import minecraft.class05829;
import minecraft.class05830;
import minecraft.class05945;

class class05821 {
    private final class01199<Dynamic<?>> u = class01199.L((int)32);
    private final List<Dynamic<?>> i;
    private final Dynamic<?> R;
    private final boolean M;
    final Int2ObjectMap<IntList> N = new Int2ObjectLinkedOpenHashMap();
    final IntList y = new IntArrayList();
    public final int L;
    private final Set<Dynamic<?>> B = Sets.newIdentityHashSet();
    private final int[] Z = new int[4096];

    public class05821(Dynamic<?> dynamic) {
        this.i = Lists.newArrayList();
        this.R = dynamic;
        this.L = dynamic.get("Y").asInt(0);
        this.M = dynamic.get("Blocks").result().isPresent();
    }

    public int y(int n) {
        if (!this.M) {
            return n;
        }
        ByteBuffer byteBuffer2 = (ByteBuffer)this.R.get("Blocks").asByteBufferOpt().result().get();
        class05829 class058292 = this.R.get("Data").asByteBufferOpt().map(byteBuffer -> new class05829(DataFixUtils.toArray((ByteBuffer)byteBuffer))).result().orElseGet(class05829::new);
        class05829 class058293 = this.R.get("Add").asByteBufferOpt().map(byteBuffer -> new class05829(DataFixUtils.toArray((ByteBuffer)byteBuffer))).result().orElseGet(class05829::new);
        this.B.add(class05830.j);
        class05819.N(this.u, class05830.j);
        this.i.add(class05830.j);
        for (int i = 0; i < 4096; ++i) {
            int n2 = i & 0xF;
            int n3 = i >> 8 & 0xF;
            int n4 = i >> 4 & 0xF;
            int n5 = class058293.N(n2, n3, n4) << 12 | (byteBuffer2.get(i) & 0xFF) << 4 | class058292.N(n2, n3, n4);
            if (class05830.y.get(n5 >> 4)) {
                this.N(n5 >> 4, i);
            }
            if (class05830.N.get(n5 >> 4)) {
                int n6 = class05819.N(n2 == 0, n2 == 15, n4 == 0, n4 == 15);
                if (n6 == 0) {
                    this.y.add(i);
                } else {
                    n |= n6;
                }
            }
            this.N(i, class05803.y(n5));
        }
        return n;
    }

    private void N(int n, int n2) {
        IntList intList = (IntList)this.N.get(n);
        if (intList == null) {
            intList = new IntArrayList();
            this.N.put(n, (Object)intList);
        }
        intList.add(n2);
    }

    public Dynamic<?> N() {
        Dynamic<?> var1 = this.R;
        if (!this.M) {
            return var1;
        }
        Dynamic dynamic = var1.set("Palette", var1.createList(this.i.stream()));
        int n = Math.max(4, DataFixUtils.ceillog2((int)this.B.size()));
        class05945 class059452 = new class05945(n, 4096);
        for (int i = 0; i < this.Z.length; ++i) {
            class059452.N(i, this.Z[i]);
        }
        dynamic = dynamic.set("BlockStates", dynamic.createLongList(Arrays.stream(class059452.N())));
        dynamic = dynamic.remove("Blocks");
        dynamic = dynamic.remove("Data");
        dynamic = dynamic.remove("Add");
        return dynamic;
    }

    public Dynamic<?> N(int n) {
        if (n < 0 || n > 4095) {
            return class05830.j;
        }
        Dynamic var2 = (Dynamic)this.u.N(this.Z[n]);
        return var2 == null ? class05830.j : var2;
    }

    public void N(int n, Dynamic<?> dynamic) {
        if (this.B.add(dynamic)) {
            this.i.add("%%FILTER_ME%%".equals(class05819.N(dynamic)) ? class05830.j : dynamic);
        }
        this.Z[n] = class05819.N(this.u, dynamic);
    }
}

