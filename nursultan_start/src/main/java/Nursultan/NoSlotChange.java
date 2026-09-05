/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10990
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11322
 *  Nursultan.class11782
 *  Nursultan.class11938
 *  java.lang.MatchException
 *  minecraft.class00381
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06664
 */
package Nursultan;

import Nursultan.class10990;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11322;
import Nursultan.class11782;
import Nursultan.class11938;
import minecraft.class00381;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06664;

@class11080(L="NoSlotChange", y=class11072.COMBAT, N=class11106.OTHER)
public class NoSlotChange
extends class11067 {
    @class11782
    private void N(class10990 class109902) {
        class00381 var4 = class109902.u();
        if (var4 instanceof class06664) {
            int n;
            class06664 class066642 = (class06664)var4;
            try {
                n = class066642.N();
            }
            catch (Throwable throwable) {
                throw new MatchException(throwable.toString(), throwable);
            }
            class109902.N();
            class11938.Z().N(() -> {
                int n2 = ((class04453)((class06202)this.y_0).T_4).method_31548().N();
                class11322.i((int)n);
                class11322.i((int)n2);
            });
        }
    }
}

