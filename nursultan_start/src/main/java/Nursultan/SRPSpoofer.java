/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10990
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11782
 *  minecraft.class00381
 *  minecraft.class00642
 *  minecraft.class06666
 *  minecraft.class07367
 *  minecraft.class07369
 */
package Nursultan;

import Nursultan.class10990;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11782;
import java.util.UUID;
import minecraft.class00381;
import minecraft.class00642;
import minecraft.class06666;
import minecraft.class07367;
import minecraft.class07369;

@class11080(L="SRPSpoofer", y=class11072.MISC, N=class11106.BASE)
public class SRPSpoofer
extends class11067 {
    @class11782
    public void N(class10990 class109902) {
        class00381 var3 = class109902.u();
        if (!(var3 instanceof class06666)) {
            return;
        }
        class06666 class066662 = (class06666)var3;
        class109902.N();
        UUID uUID = class066662.N();
        class00642 class006422 = class109902.L();
        class006422.method_10743((class00381)new class07367(uUID, class07369.field_13016));
        class006422.method_10743((class00381)new class07367(uUID, class07369.field_13017));
    }
}

