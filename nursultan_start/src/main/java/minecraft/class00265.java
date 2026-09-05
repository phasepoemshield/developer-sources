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
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00273;
import minecraft.class00299;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03767;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;

public interface class00265 {
    public static final Codec<class00265> u = class04206.Nd.T().dispatch(class00265::N, class00273::N);
    public static final class02362<class04247, class00265> i = class02389.N((class05946)class04227.NP).y(class00265::N, class00273::y);

    public class00299 i();

    public class00299 u();

    default public boolean N(class03767 class037672) {
        return this.u().N(class037672) && this.i().N(class037672);
    }

    public class00273<? extends class00265> N();
}

