/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02362
 *  minecraft.class04247
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07126
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07103;
import minecraft.class07126;

public class class07092
implements class07126 {
    private static final Codec<class06584> N = Codec.withAlternative((Codec)class06584.L, (Codec)class06581.u, class06584::new);
    private final class07103<class07092> y;
    private final class06584 L;

    public class07092(class07103<class07092> class071032, class06584 class065842) {
        if (class065842.R()) {
            throw new IllegalArgumentException("Empty stacks are not allowed");
        }
        this.y = class071032;
        this.L = class065842;
    }

    public static class02362<? super class04247, class07092> y(class07103<class07092> class071032) {
        return class06584.z.N_10(class065842 -> new class07092(class071032, (class06584)class065842), class070922 -> class070922.L);
    }

    public static MapCodec<class07092> N(class07103<class07092> class071032) {
        return N.xmap(class065842 -> new class07092(class071032, (class06584)class065842), class070922 -> class070922.L).fieldOf("item");
    }

    public class06584 N() {
        return this.L;
    }

    public class07103<class07092> method_10295() {
        return this.y;
    }
}

