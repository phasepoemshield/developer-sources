/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.NoSlow
 *  Nursultan.class11354
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11929
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07843
 */
package Nursultan;

import Nursultan.NoSlow;
import Nursultan.class10915;
import Nursultan.class10971;
import Nursultan.class10996;
import Nursultan.class11354;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11929;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07843;

public class class10934
extends class10915 {
    public class10934(NoSlow noSlow, String string, boolean bl) {
        super(noSlow, string, bl);
    }

    public void y(Object object) {
        Object object2 = object;
        Objects.requireNonNull(object2);
        Object object3 = object2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class10971.class, class11354.class, class10996.class}, (Object)object3, (int)n2)) {
            case 0: {
                class10971 class109712 = (class10971)((Object)object3);
                if (!this.N()) break;
                class109712.N();
                break;
            }
            case 1: {
                class11354 class113542 = (class11354)object3;
                if (!this.N()) break;
                class113542.N(1.0f);
                break;
            }
            case 2: {
                class10996 class109962 = (class10996)object3;
                if (!((class04453)((class06202)this.N_0).T_4).method_6115() || !((class04453)((class06202)this.N_0).T_4).k()) {
                    return;
                }
                if (!this.N()) {
                    return;
                }
                class11499 class114992 = class11505.N();
                ((class03443)((class06202)this.N_0).T_2).N((class03448)((class06202)this.N_0).T_3, n -> new class07843(((class04453)((class06202)this.N_0).T_4).method_6058() == class07050.field_5808 ? class07050.field_5810 : class07050.field_5808, n, class114992.y(), class114992.R()));
                break;
            }
        }
    }

    private class06584 N(class07050 class070502) {
        return class070502 == class07050.field_5810 ? ((class04453)((class06202)this.N_0).T_4).method_6047() : ((class04453)((class06202)this.N_0).T_4).method_6079();
    }

    private boolean N() {
        return !this.N(this.N(((class04453)((class06202)this.N_0).T_4).method_6058()));
    }

    private boolean N(class06584 class065842) {
        return class11929.z((class06584)class065842) != 0;
    }
}

