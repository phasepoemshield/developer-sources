/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06889
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;
import minecraft.class01182;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06889;
import minecraft.class07299;

public interface class01190 {
    public static final Codec<class01190> L = class04206.n.T().dispatch(class01190::N, class01182::N);
    public static final class02362<class04247, class01190> u = class02389.N((class05946)class04227.NU).y(class01190::N, class01182::y);

    public class01182<? extends class01190> N();

    public Optional<class06889> N(class07299 var1);
}

