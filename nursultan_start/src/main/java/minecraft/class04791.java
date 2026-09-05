/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class04837
 *  minecraft.class05908
 *  minecraft.class05919
 *  minecraft.class06841
 *  minecraft.class07049
 *  minecraft.class07491
 *  minecraft.class07709
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import minecraft.class04793;
import minecraft.class04794;
import minecraft.class04820;
import minecraft.class04821;
import minecraft.class04837;
import minecraft.class05908;
import minecraft.class05919;
import minecraft.class06841;
import minecraft.class07049;
import minecraft.class07491;
import minecraft.class07709;
import org.jspecify.annotations.Nullable;

public class class04791
implements class04794 {
    private static final Codec<class06841<class07709>> L = class06841.N(class068502 -> class068502.y(class04820::new).N(class04793::new));
    public static final MapCodec<class04791> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)L.fieldOf("target").forGetter(class047912 -> class047912.u)).apply(instance, class04791::new));
    public static final Codec<class04791> y = L.xmap(class04791::new, class047912 -> class047912.u);
    private final class06841<class07709> u;

    private class04791(class06841<class07709> class068412) {
        this.u = class068412;
    }

    @Override
    public Set<class07491<?>> y() {
        return Set.of(this.u.N());
    }

    private static /* synthetic */ class06841 N(class04791 class047912) {
        return class047912.u;
    }

    @Override
    public class04837 N() {
        return class04821.L;
    }

    public static class04794 N(class05919 class059192) {
        return new class04791((class06841<class07709>)new class04793((class07491<? extends class07049>)class059192.N()));
    }

    @Override
    public @Nullable class07709 N(class05908 class059082) {
        return (class07709)this.u.N(class059082);
    }
}

