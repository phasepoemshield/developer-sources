/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01076
 *  minecraft.class06386
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import minecraft.class01076;
import minecraft.class06386;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public class class04685
implements class06386 {
    public static final Codec<class04685> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.BOOL.fieldOf("crystal_invulnerable").orElse((Object)false).forGetter(class046852 -> class046852.y), (App)class01076.N.listOf().fieldOf("spikes").forGetter(class046852 -> class046852.L), (App)class07209.field_25064.optionalFieldOf("crystal_beam_target").forGetter(class046852 -> Optional.ofNullable(class046852.u))).apply(instance, class04685::new));
    private final boolean y;
    private final List<class01076> L;
    private final @Nullable class07209 u;

    public @Nullable class07209 L() {
        return this.u;
    }

    public class04685(boolean bl, List<class01076> list, @Nullable class07209 class072092) {
        this(bl, list, Optional.ofNullable(class072092));
    }

    private class04685(boolean bl, List<class01076> list, Optional<class07209> optional) {
        this.y = bl;
        this.L = list;
        this.u = optional.orElse(null);
    }

    public List<class01076> y() {
        return this.L;
    }

    public boolean N() {
        return this.y;
    }
}

