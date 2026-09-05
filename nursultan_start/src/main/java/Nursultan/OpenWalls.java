/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10980
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11782
 *  Nursultan.class11892
 *  Nursultan.class11907
 *  minecraft.class00500
 *  minecraft.class00748
 *  minecraft.class00891
 *  minecraft.class04453
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class05982
 *  minecraft.class06109
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07113
 *  minecraft.class07209
 */
package Nursultan;

import Nursultan.class10980;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11782;
import Nursultan.class11892;
import Nursultan.class11907;
import minecraft.class00500;
import minecraft.class00748;
import minecraft.class00891;
import minecraft.class04453;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class05982;
import minecraft.class06109;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07113;
import minecraft.class07209;

@class11080(L="OpenWalls", y=class11072.MISC, N=class11106.BASE)
public class OpenWalls
extends class11067 {
    private boolean N(class00500 class005002, class07209 class072092) {
        class00891 class008912 = class005002.i();
        return class008912 instanceof class05982 || class008912 instanceof class06109 || class008912 instanceof class00748;
    }

    @class11782
    public void N(class10980 class109802) {
        class11499 class114992;
        class06889 class068892;
        class06889 class068893 = ((class04453)((class06202)this.y_0).T_4).method_33571();
        class06183 class061832 = class11892.N((class05862)new class05862(class068893, class068892 = ((class04453)((class06202)this.y_0).T_4).method_5631((class114992 = class11505.L()).R(), class114992.y()).L(((class04453)((class06202)this.y_0).T_4).method_55754()).i(class068893), class05849.field_17558, class05835.field_1348, (class07049)((class04453)((class06202)this.y_0).T_4)), this::N);
        if (class061832.N() == class07113.field_1333) {
            return;
        }
        if (class11907.N((class07050)class109802.L(), (class06183)class061832)) {
            class109802.N();
        }
    }
}

