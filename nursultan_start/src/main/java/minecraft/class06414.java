/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class06386;
import minecraft.class07209;

public class class06414
implements class06386 {
    public static final Codec<class06414> N = RecordCodecBuilder.create(instance -> instance.group((App)class07209.field_25064.optionalFieldOf("exit").forGetter(class064142 -> class064142.y), (App)Codec.BOOL.fieldOf("exact").forGetter(class064142 -> class064142.L)).apply(instance, class06414::new));
    private final Optional<class07209> y;
    private final boolean L;

    public boolean L() {
        return this.L;
    }

    private class06414(Optional<class07209> optional, boolean bl) {
        this.y = optional;
        this.L = bl;
    }

    public Optional<class07209> y() {
        return this.y;
    }

    public static class06414 N() {
        return new class06414(Optional.empty(), false);
    }

    public static class06414 N(class07209 class072092, boolean bl) {
        return new class06414(Optional.of(class072092), bl);
    }
}

