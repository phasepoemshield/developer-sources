/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10990
 *  Nursultan.class11459
 *  Nursultan.class11796
 *  Nursultan.class11815
 *  Nursultan.class11822
 *  Nursultan.class11825
 *  Nursultan.class11826
 *  Nursultan.class11920
 *  Nursultan.class11938
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00482
 *  minecraft.class03132
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06685
 *  minecraft.class06702
 *  minecraft.class07254
 *  minecraft.class07262
 *  minecraft.class08068
 */
package Nursultan;

import Nursultan.class10990;
import Nursultan.class11459;
import Nursultan.class11796;
import Nursultan.class11815;
import Nursultan.class11822;
import Nursultan.class11825;
import Nursultan.class11826;
import Nursultan.class11920;
import Nursultan.class11938;
import java.lang.runtime.SwitchBootstraps;
import java.util.UUID;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00482;
import minecraft.class03132;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06685;
import minecraft.class06702;
import minecraft.class07254;
import minecraft.class07262;
import minecraft.class08068;

public class class09313
implements class07262,
class11826<class10990> {
    public Object N_0;
    public Object N_1;

    private void L() {
    }

    public class09313() {
        this.L();
        this.N_0 = class11938.U();
        this.N_1 = class06202.Nq();
    }

    static {
        class09313.y();
        class09313.N();
    }

    private static void y() {
    }

    public void N(UUID uUID, class00392 class003922, float f, class06685 class066852, class06702 class067022, boolean bl, boolean bl2, boolean bl3) {
        if (!class003922.getString().toLowerCase().contains("pvp") || (class04453)((class06202)this.N_1).T_4 == null) {
            return;
        }
        class11815 class118152 = (class11815)((class11796)((class11822)((class04453)((class06202)this.N_1).T_4)).dataManager()).y().N();
        class118152.N(uUID);
        class118152.N(true);
    }

    public void listen(class10990 class109902) {
        class00381 var2 = class109902.u();
        class11920.N((class00381)var2, class119202 -> ((class06202)this.N_1).execute(() -> {
            if ((class04453)((class06202)this.N_1).T_4 == null) {
                return;
            }
            ((class11796)((class11825)((class04453)((class06202)this.N_1).T_4)).dataManager()).N().N(class119202);
        }));
        class00381 var3 = var2;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class07254.class, class03132.class, class08068.class, class00482.class}, (Object)var3, (int)n)) {
            case 0: {
                class07254 class072542 = (class07254)var3;
                ((class06202)this.N_1).execute(() -> this.N(class072542));
                break;
            }
            case 1: {
                class03132 class031322 = (class03132)var3;
                ((class06202)this.N_1).execute(() -> {
                    ((class11459)this.N_0).N(class031322.N());
                    ((class11459)this.N_0).N();
                });
                break;
            }
            case 2: {
                class08068 class080682 = (class08068)var3;
                ((class06202)this.N_1).execute(() -> ((class11459)((class11459)this.N_0)).L());
                break;
            }
            case 3: {
                class00482 class004822 = (class00482)var3;
                ((class06202)this.N_1).execute(() -> ((class11459)((class11459)this.N_0)).N());
                break;
            }
        }
    }

    private static void N() {
    }

    public void N(UUID uUID) {
        if ((class04453)((class06202)this.N_1).T_4 == null) {
            return;
        }
        class11815 class118152 = (class11815)((class11796)((class11825)((class04453)((class06202)this.N_1).T_4)).dataManager()).y().N();
        if (!class118152.N() || class118152.y() == null || !class118152.y().equals(uUID)) {
            return;
        }
        class118152.N(null);
        class118152.N(false);
    }

    private void N(class07254 class072542) {
        class072542.N((class07262)this);
    }
}

