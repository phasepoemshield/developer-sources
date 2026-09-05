/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AutoJoin
 *  Nursultan.class10990
 *  Nursultan.class10996
 *  Nursultan.class11281
 *  Nursultan.class11322
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00381
 *  minecraft.class00486
 *  minecraft.class00524
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07510
 *  minecraft.class07843
 *  minecraft.class08036
 *  minecraft.class08082
 */
package Nursultan;

import Nursultan.AutoJoin;
import Nursultan.class10990;
import Nursultan.class10996;
import Nursultan.class11127;
import Nursultan.class11281;
import Nursultan.class11322;
import Nursultan.class11499;
import Nursultan.class11505;
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.Objects;
import minecraft.class00381;
import minecraft.class00486;
import minecraft.class00524;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07510;
import minecraft.class07843;
import minecraft.class08036;
import minecraft.class08082;

public class class11112
extends class11127 {
    public class11112(AutoJoin autoJoin, String string, boolean bl) {
        super(autoJoin, string, bl);
    }

    private void B() {
        int n2 = class11281.R((class06581)class06570.jJ);
        if (!class11281.y((int)n2)) {
            class11322.i((int)n2);
            class11499 class114992 = class11505.N();
            ((class03443)((class06202)this.N_0).T_2).N((class03448)((class06202)this.N_0).T_3, n -> new class07843(class07050.field_5808, n, class114992.y(), class114992.R()));
        }
    }

    private void y(class00524 class005242) {
        if ((class04453)((class06202)this.N_0).T_4 == null || (class03443)((class06202)this.N_0).T_2 == null) {
            return;
        }
        List var2 = class005242.L();
        for (int i = 0; i < var2.size(); ++i) {
            if (!((class06584)var2.get(i)).d().getString().equals("\u2694 \u0414\u0443\u044d\u043b\u0438 1.16.5 \u2694")) continue;
            ((class03443)((class06202)this.N_0).T_2).N(class005242.N(), i, 0, class07510.field_7790, (class08036)((class04453)((class06202)this.N_0).T_4));
            break;
        }
    }

    public void y(Object object) {
        Object object2 = object;
        Objects.requireNonNull(object2);
        Object object3 = object2;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class10990.class, class10996.class}, (Object)object3, (int)n)) {
            case 0: {
                class10990 class109902 = (class10990)object3;
                this.N(class109902);
                break;
            }
            case 1: {
                class10996 class109962 = (class10996)object3;
                if (((class04453)((class06202)this.N_0).T_4).field_6012 % 10 != 0) break;
                this.B();
                break;
            }
        }
    }

    private void N(class10990 class109902) {
        class00381 class003812 = class109902.u();
        Objects.requireNonNull(class003812);
        class00381 var2 = class003812;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class08082.class, class00486.class, class00524.class}, (Object)var2, (int)n)) {
            case 0: {
                if (((class08082)var2).N().getString().contains("\u0425\u0430\u0431")) break;
                ((class06202)this.N_0).execute(() -> ((AutoJoin)this.y_0).N(false));
                break;
            }
            case 1: {
                class00486 class004862 = (class00486)var2;
                ((class06202)this.N_0).execute(() -> {
                    if ((class04453)((class06202)this.N_0).T_4 != null) {
                        this.B();
                    }
                });
                break;
            }
            case 2: {
                class00524 class005242 = (class00524)var2;
                ((class06202)this.N_0).execute(() -> this.y(class005242));
                break;
            }
        }
    }
}

