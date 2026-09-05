/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.longs.LongCollection
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  minecraft.class05715
 *  minecraft.class06555
 *  minecraft.class08413
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongCollection;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import minecraft.class05715;
import minecraft.class06555;
import minecraft.class08413;

public class class04917
extends class06555 {
    private final LongSet y;
    private final LongSet L;
    private static final Codec<LongSet> u = Codec.LONG_STREAM.xmap(LongOpenHashSet::toSet, LongCollection::longStream);
    public static final Codec<class04917> N = RecordCodecBuilder.create(instance -> instance.group((App)u.fieldOf("All").forGetter(class049172 -> class049172.y), (App)u.fieldOf("Remaining").forGetter(class049172 -> class049172.L)).apply(instance, class04917::new));

    public boolean L(long l) {
        return this.L.contains(l);
    }

    public class04917() {
        this((LongSet)new LongOpenHashSet(), (LongSet)new LongOpenHashSet());
    }

    private class04917(LongSet longSet, LongSet longSet2) {
        this.y = longSet;
        this.L = longSet2;
    }

    public void u(long l) {
        if (this.L.remove(l)) {
            this.method_80();
        }
    }

    public boolean y(long l) {
        return this.y.contains(l);
    }

    public static class08413<class04917> N(String string) {
        return new class08413(string, class04917::new, N, class05715.field_45084);
    }

    public LongSet N() {
        return this.y;
    }

    public void N(long l) {
        this.y.add(l);
        this.L.add(l);
        this.method_80();
    }
}

