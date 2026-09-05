/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Streams
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  minecraft.class01487
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06338
 *  minecraft.class07049
 *  minecraft.class07062
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Streams;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class01487;
import minecraft.class04001;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06338;
import minecraft.class07049;
import minecraft.class07062;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public class class03987 {
    protected static final int N = 2;
    protected static final int y = 150;
    private static final int M = 1;
    private int B = class04995.y((class06069)class06069.u(), (int)0, (int)2);
    int L;
    private static final Codec<Pair<UUID, Integer>> Z = RecordCodecBuilder.create(instance -> instance.group((App)class01487.N.fieldOf("uuid").forGetter(Pair::getFirst), (App)class06338.T.fieldOf("anger").forGetter(Pair::getSecond)).apply((Applicative)instance, Pair::of));
    private final Predicate<class07049> z;
    protected final ArrayList<class07049> u;
    private final class04001 U;
    protected final Object2IntMap<class07049> i;
    protected final Object2IntMap<UUID> R;

    private void L() {
        this.L = 0;
        this.u.sort(this.U);
        if (this.u.size() == 1) {
            this.L = this.i.getInt((Object)this.u.get(0));
        }
    }

    public class03987(Predicate<class07049> predicate, List<Pair<UUID, Integer>> list) {
        this.z = predicate;
        this.u = new ArrayList();
        this.U = new class04001(this);
        this.i = new Object2IntOpenHashMap();
        this.R = new Object2IntOpenHashMap(list.size());
        list.forEach(pair -> this.R.put((Object)((UUID)pair.getFirst()), (Integer)pair.getSecond()));
    }

    private @Nullable class07049 u() {
        return this.u.stream().filter(this.z).findFirst().orElse(null);
    }

    public int y(@Nullable class07049 class070492) {
        return class070492 == null ? this.L : this.i.getInt((Object)class070492);
    }

    private List<Pair<UUID, Integer>> y() {
        return Streams.concat((Stream[])new Stream[]{this.u.stream().map(class070492 -> Pair.of((Object)class070492.method_5667(), (Object)this.i.getInt(class070492))), this.R.object2IntEntrySet().stream().map(entry -> Pair.of((Object)((UUID)entry.getKey()), (Object)entry.getIntValue()))}).collect(Collectors.toList());
    }

    public static Codec<class03987> N(Predicate<class07049> predicate) {
        return RecordCodecBuilder.create(instance -> instance.group((App)Z.listOf().fieldOf("suspects").orElse(Collections.emptyList()).forGetter(class03987::y)).apply((Applicative)instance, list -> new class03987(predicate, (List<Pair<UUID, Integer>>)list)));
    }

    public void N(class04782 class047822, Predicate<class07049> predicate) {
        Object2IntMap.Entry entry;
        --this.B;
        if (this.B <= 0) {
            this.N(class047822);
            this.B = 2;
        }
        ObjectIterator var3 = this.R.object2IntEntrySet().iterator();
        while (var3.hasNext()) {
            entry = (Object2IntMap.Entry)var3.next();
            int n = entry.getIntValue();
            if (n <= 1) {
                var3.remove();
                continue;
            }
            entry.setValue(n - 1);
        }
        entry = this.i.object2IntEntrySet().iterator();
        while (entry.hasNext()) {
            Object2IntMap.Entry entry2 = (Object2IntMap.Entry)entry.next();
            int n = entry2.getIntValue();
            class07049 class070492 = (class07049)entry2.getKey();
            class07062 class070622 = class070492.method_35049();
            if (n <= 1 || !predicate.test(class070492) || class070622 != null) {
                this.u.remove(class070492);
                entry.remove();
                if (n <= 1 || class070622 == null) continue;
                switch (class070622) {
                    case field_27002: 
                    case field_27000: 
                    case field_27001: {
                        this.R.put((Object)class070492.method_5667(), n - 1);
                    }
                }
                continue;
            }
            entry2.setValue(n - 1);
        }
        this.L();
    }

    private void N(class04782 class047822) {
        ObjectIterator var2 = this.R.object2IntEntrySet().iterator();
        while (var2.hasNext()) {
            Object2IntMap.Entry entry = (Object2IntMap.Entry)var2.next();
            int n = entry.getIntValue();
            class07049 class070492 = class047822.method_66347((UUID)entry.getKey());
            if (class070492 == null) continue;
            this.i.put((Object)class070492, n);
            this.u.add(class070492);
            var2.remove();
        }
    }

    public int N(class07049 class070493, int n) {
        boolean bl = !this.i.containsKey((Object)class070493);
        int n3 = this.i.computeInt((Object)class070493, (class070492, n2) -> Math.min(150, (n2 == null ? 0 : n2) + n));
        if (bl) {
            int n4 = this.R.removeInt((Object)class070493.method_5667());
            this.i.put((Object)class070493, n3 += n4);
            this.u.add(class070493);
        }
        this.L();
        return n3;
    }

    public void N(class07049 class070492) {
        this.i.removeInt((Object)class070492);
        this.u.remove(class070492);
        this.L();
    }

    public Optional<class07438> N() {
        return Optional.ofNullable(this.u()).filter(class070492 -> class070492 instanceof class07438).map(class070492 -> (class07438)class070492);
    }
}

