/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10961
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11782
 *  minecraft.class00381
 *  minecraft.class02675
 *  minecraft.class04453
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class10961;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11782;
import minecraft.class00381;
import minecraft.class02675;
import minecraft.class04453;
import minecraft.class06202;

@class11080(L="AutoRespawn", y=class11072.PLAYER, N=class11106.AUTO)
public class AutoRespawn
extends class11067 {
    @class11782
    private void N(class10961 class109612) {
        class00381 var3 = class109612.N();
        if (var3 instanceof class02675) {
            class02675 class026752 = (class02675)var3;
            ((class06202)this.y_0).execute(() -> {
                if ((class04453)((class06202)this.y_0).T_4 != null && class026752.N() == ((class04453)((class06202)this.y_0).T_4).method_5628()) {
                    ((class04453)((class06202)this.y_0).T_4).K();
                }
            });
        }
    }
}

