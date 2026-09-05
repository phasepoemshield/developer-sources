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
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06584;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08217;

public interface class08200 {
    public static final Codec<class08200> u = class04206.Nl.T().dispatch(class08200::N, class08217::N);
    public static final class02362<class04247, class08200> i = class02389.N((class05946)class04227.m).y(class08200::N, class08217::y);

    public boolean N(class07299 var1, class06584 var2, class07438 var3);

    public class08217<? extends class08200> N();
}

