/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10205
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class01894
 *  minecraft.class03512
 *  minecraft.class05715
 *  minecraft.class06069
 *  minecraft.class06555
 *  minecraft.class08413
 */
package minecraft;

import Nursultan.class10205;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import minecraft.class01894;
import minecraft.class03512;
import minecraft.class05715;
import minecraft.class06069;
import minecraft.class06555;
import minecraft.class08413;

public class class03470
extends class06555 {
    public static final Codec<class03470> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("salt").forGetter(class03470::y), (App)Codec.BOOL.optionalFieldOf("include_world_seed", (Object)true).forGetter(class03470::L), (App)Codec.BOOL.optionalFieldOf("include_sequence_id", (Object)true).forGetter(class03470::u), (App)Codec.unboundedMap((Codec)class01894.N, (Codec)class03512.N).fieldOf("sequences").forGetter(class034702 -> class034702.R)).apply(instance, class03470::new));
    public static final class08413<class03470> y = new class08413("random_sequences", class03470::new, N, class05715.field_45082);
    private int L;
    private boolean u = true;
    private boolean i = true;
    private final Map<class01894, class03512> R = new Object2ObjectOpenHashMap();

    private boolean L() {
        return this.u;
    }

    private class03512 L(class01894 class018942, long l) {
        return this.y(class018942, l, this.L, this.u, this.i);
    }

    public class03470() {
    }

    private class03470(int n, boolean bl, boolean bl2, Map<class01894, class03512> map) {
        this.L = n;
        this.u = bl;
        this.i = bl2;
        this.R.putAll(map);
    }

    private boolean u() {
        return this.i;
    }

    private class03512 y(class01894 class018942, long l, int n, boolean bl, boolean bl2) {
        long l2 = (bl ? l : 0L) ^ (long)n;
        return new class03512(l2, bl2 ? Optional.of(class018942) : Optional.empty());
    }

    public void y(class01894 class018942, long l) {
        this.R.put(class018942, this.L(class018942, l));
    }

    private int y() {
        return this.L;
    }

    public void N(BiConsumer<class01894, class03512> biConsumer) {
        this.R.forEach(biConsumer);
    }

    public void N(int n, boolean bl, boolean bl2) {
        this.L = n;
        this.u = bl;
        this.i = bl2;
    }

    public int N() {
        int n = this.R.size();
        this.R.clear();
        return n;
    }

    public void N(class01894 class018942, long l, int n, boolean bl, boolean bl2) {
        this.R.put(class018942, this.y(class018942, l, n, bl, bl2));
    }

    public class06069 N(class01894 class018943, long l) {
        class06069 class060692 = this.R.computeIfAbsent(class018943, class018942 -> this.L((class01894)class018942, l)).N();
        return new class10205(this, class060692);
    }
}

