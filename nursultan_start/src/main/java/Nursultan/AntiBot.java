/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11357
 *  Nursultan.class11371
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11782
 *  Nursultan.class11783
 *  Nursultan.class11812
 *  Nursultan.class11907
 *  Nursultan.class11938
 *  minecraft.class03448
 *  minecraft.class04477
 *  minecraft.class06202
 *  minecraft.class07049
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11357;
import Nursultan.class11371;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11782;
import Nursultan.class11783;
import Nursultan.class11812;
import Nursultan.class11907;
import Nursultan.class11938;
import minecraft.class03448;
import minecraft.class04477;
import minecraft.class06202;
import minecraft.class07049;

@class11080(L="AntiBot", y=class11072.COMBAT, N=class11106.OTHER)
public class AntiBot
extends class11067 {
    public Object L_0;

    public AntiBot() {
        this.m();
        this.L_0 = class11524.N((class11512)this, (String)"no-bot-interaction", (boolean)false);
    }

    public boolean Z() {
        if ((class03448)((class06202)this.y_0).T_3 != null) {
            ((class03448)((class06202)this.y_0).T_3).method_18456().stream().filter(class11907::N).forEach(class044772 -> ((class11812)((class11783)class044772).dataManager()).M().N((Object)true));
        }
        return super.Z();
    }

    public boolean i() {
        if ((class03448)((class06202)this.y_0).T_3 != null) {
            ((class03448)((class06202)this.y_0).T_3).method_18456().forEach(class044772 -> ((class11812)((class11783)class044772).dataManager()).M().N((Object)false));
        }
        return super.i();
    }

    private void m() {
    }

    @class11782
    public void N(class11357 class113572) {
        this.m();
        if (((Boolean)((class11507)this.L_0).i()).booleanValue() && ((Boolean)((class11812)((class11783)class113572.L()).dataManager()).M().N()).booleanValue()) {
            class113572.N();
        }
    }

    @class11782
    public void N(class11371 class113712) {
        class07049 class070492 = class113712.N();
        if (!(class070492 instanceof class04477)) {
            return;
        }
        class04477 class044772 = (class04477)class070492;
        class11938.Z().N(() -> {
            if (class11907.N((class04477)class044772)) {
                ((class11812)((class11783)class044772).dataManager()).M().N((Object)true);
            }
        });
    }
}

