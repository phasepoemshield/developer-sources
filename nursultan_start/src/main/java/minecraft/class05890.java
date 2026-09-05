/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class01396
 *  minecraft.class04160
 *  minecraft.class04162
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05908
 *  minecraft.class05920
 *  minecraft.class05927
 *  minecraft.class06551
 *  minecraft.class06584
 *  minecraft.class06925
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class01396;
import minecraft.class04160;
import minecraft.class04162;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05908;
import minecraft.class05920;
import minecraft.class05927;
import minecraft.class06551;
import minecraft.class06584;
import minecraft.class06925;
import minecraft.class07209;

public class class05890
extends class01396<class05920> {
    public void N(class04770 class047702, class07209 class072092, class06584 class065842) {
        class04782 class047822 = class047702.method_51469();
        class00500 class005002 = class047822.method_8320(class072092);
        class04162 class041622 = new class04160(class047822).N(class06551.B, (Object)class072092.method_46558()).N(class06551.N, (Object)class047702).N(class06551.Z, (Object)class005002).N(class06551.U, (Object)class065842).N(class06925.s);
        class05908 class059082 = new class05927(class041622).N(Optional.empty());
        this.N_27(class047702, class059202 -> class059202.N(class059082));
    }

    public Codec<class05920> N() {
        return class05920.N;
    }
}

