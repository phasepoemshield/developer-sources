/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet
 *  minecraft.class01487
 *  minecraft.class04995
 *  minecraft.class06584
 *  minecraft.class08036
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import minecraft.class01487;
import minecraft.class04995;
import minecraft.class06584;
import minecraft.class08036;

public class class02296 {
    static final String N = "server_data";
    static Codec<class02296> y = RecordCodecBuilder.create(instance -> instance.group((App)class01487.L.lenientOptionalFieldOf("rewarded_players", Set.of()).forGetter(class022962 -> class022962.i), (App)Codec.LONG.lenientOptionalFieldOf("state_updating_resumes_at", (Object)0L).forGetter(class022962 -> class022962.R), (App)class06584.y.listOf().lenientOptionalFieldOf("items_to_eject", List.of()).forGetter(class022962 -> class022962.M), (App)Codec.INT.lenientOptionalFieldOf("total_ejections_needed", (Object)0).forGetter(class022962 -> class022962.Z)).apply(instance, class02296::new));
    private static final int u = 128;
    private final Set<UUID> i = new ObjectLinkedOpenHashSet();
    private long R;
    private final List<class06584> M = new ObjectArrayList();
    private long B;
    private int Z;
    boolean L;

    long L() {
        return this.R;
    }

    class06584 M() {
        if (this.M.isEmpty()) {
            return class06584.E;
        }
        this.Z();
        return Objects.requireNonNullElse(this.M.remove(this.M.size() - 1), class06584.E);
    }

    class02296() {
    }

    class02296(Set<UUID> set, long l, List<class06584> list, int n) {
        this.i.addAll(set);
        this.R = l;
        this.M.addAll(list);
        this.Z = n;
    }

    public float B() {
        if (this.Z == 1) {
            return 1.0f;
        }
        return 1.0f - class04995.R((float)this.u().size(), (float)1.0f, (float)this.Z);
    }

    private void Z() {
        this.L = true;
    }

    void i() {
        this.Z = 0;
        this.Z();
    }

    List<class06584> u() {
        return this.M;
    }

    void y(long l) {
        this.R = l;
        this.Z();
    }

    Set<UUID> y() {
        return this.i;
    }

    public void y(class08036 class080362) {
        Iterator<UUID> var2;
        this.i.add(class080362.method_5667());
        if (this.i.size() > 128 && (var2 = this.i.iterator()).hasNext()) {
            var2.next();
            var2.remove();
        }
        this.Z();
    }

    void N(long l) {
        this.B = l;
    }

    void N(List<class06584> list) {
        this.M.clear();
        this.M.addAll(list);
        this.Z = this.M.size();
        this.Z();
    }

    boolean N(class08036 class080362) {
        return this.i.contains(class080362.method_5667());
    }

    long N() {
        return this.B;
    }

    void N(class02296 class022962) {
        this.R = class022962.L();
        this.M.clear();
        this.M.addAll(class022962.M);
        this.i.clear();
        this.i.addAll(class022962.i);
    }

    class06584 R() {
        if (this.M.isEmpty()) {
            return class06584.E;
        }
        return Objects.requireNonNullElse(this.M.get(this.M.size() - 1), class06584.E);
    }
}

