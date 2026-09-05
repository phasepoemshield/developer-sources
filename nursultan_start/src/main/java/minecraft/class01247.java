/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class class01247 {
    public static final class01247 N = new class01247((List<String>)ImmutableList.of((Object)"vanilla"), (List<String>)ImmutableList.of());
    public static final Codec<class01247> y = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.listOf().fieldOf("Enabled").forGetter(class012472 -> class012472.L), (App)Codec.STRING.listOf().fieldOf("Disabled").forGetter(class012472 -> class012472.u)).apply(instance, class01247::new));
    private final List<String> L;
    private final List<String> u;

    public class01247(List<String> list, List<String> list2) {
        this.L = ImmutableList.copyOf(list);
        this.u = ImmutableList.copyOf(list2);
    }

    public List<String> y() {
        return this.u;
    }

    public List<String> N() {
        return this.L;
    }
}

