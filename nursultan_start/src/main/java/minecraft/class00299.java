/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03767
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class00297;
import minecraft.class00308;
import minecraft.class00311;
import minecraft.class00319;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03767;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06584;

public interface class00299 {
    public static final Codec<class00299> N = class04206.Nw.T().dispatch(class00299::N, class00319::N);
    public static final class02362<class04247, class00299> y = class02389.N((class05946)class04227.Nt).y(class00299::N, class00319::y);

    default public class06584 y(class00311 class003112) {
        return this.N(class003112, class00297.N).findFirst().orElse(class06584.E);
    }

    public <T> Stream<T> N(class00311 var1, class00308<T> var2);

    default public List<class06584> N(class00311 class003112) {
        return this.N(class003112, class00297.N).toList();
    }

    default public boolean N(class03767 class037672) {
        return true;
    }

    public class00319<? extends class00299> N();
}

