/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11353
 *  Nursultan.class11783
 *  Nursultan.class11812
 *  Nursultan.class11826
 *  minecraft.class03448
 *  minecraft.class04477
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class09340;
import Nursultan.class11353;
import Nursultan.class11783;
import Nursultan.class11812;
import Nursultan.class11826;
import java.util.Iterator;
import minecraft.class03448;
import minecraft.class04477;
import minecraft.class06202;

public class class09352
implements class11826<class11353> {
    public Object N_0;

    private void L() {
    }

    public class09352() {
        this.L();
        this.N_0 = class06202.Nq();
    }

    private void N(String string, boolean bl) {
        if ((class03448)((class06202)this.N_0).T_3 == null) {
            return;
        }
        for (class04477 class044772 : ((class03448)((class06202)this.N_0).T_3).method_18456()) {
            if (!string.equals(class044772.method_5820())) continue;
            ((class11812)((class11783)class044772).dataManager()).i().N((Object)bl);
        }
    }

    private void N() {
        if ((class03448)((class06202)this.N_0).T_3 == null) {
            return;
        }
        Iterator var1 = ((class03448)((class06202)this.N_0).T_3).method_18456().iterator();
        while (var1.hasNext()) {
            ((class11812)((class11783)((class04477)var1.next())).dataManager()).i().N((Object)false);
        }
    }

    public void listen(class11353 class113532) {
        switch (((int[])class09340.N_0)[class113532.u().ordinal()]) {
            case 1: {
                this.N(class113532.y().y(), true);
                break;
            }
            case 2: {
                this.N(class113532.y().y(), false);
                break;
            }
            case 3: {
                this.N();
            }
        }
    }
}

