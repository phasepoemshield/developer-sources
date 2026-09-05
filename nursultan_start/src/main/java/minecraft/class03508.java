/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03793
 *  minecraft.class03978
 *  minecraft.class06338
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class03793;
import minecraft.class03978;
import minecraft.class06338;
import org.jspecify.annotations.Nullable;

public final class class03508 {
    public static Codec<class03508> N = RecordCodecBuilder.create(instance -> instance.group((App)class03978.N.lenientOptionalFieldOf("event").forGetter(class035082 -> Optional.ofNullable(class035082.L)), (App)class03793.N.fieldOf("selector").forGetter(class03508::N), (App)class06338.T.fieldOf("event_delay").orElse((Object)0).forGetter(class03508::L)).apply(instance, (optional, class037932, n) -> new class03508(optional.orElse(null), (class03793)class037932, (int)n, true)));
    public static final String y = "listener";
    @Nullable class03978 L;
    private int i;
    final class03793 u;
    private boolean R;

    public int L() {
        return this.i;
    }

    private class03508(@Nullable class03978 class039782, class03793 class037932, int n, boolean bl) {
        this.L = class039782;
        this.i = n;
        this.u = class037932;
        this.R = bl;
    }

    public class03508() {
        this(null, new class03793(), 0, false);
    }

    public boolean i() {
        return this.R;
    }

    public void u() {
        this.i = Math.max(0, this.i - 1);
    }

    public @Nullable class03978 y() {
        return this.L;
    }

    public void N(@Nullable class03978 class039782) {
        this.L = class039782;
    }

    public void N(boolean bl) {
        this.R = bl;
    }

    public class03793 N() {
        return this.u;
    }

    public void N(int n) {
        this.i = n;
    }
}

