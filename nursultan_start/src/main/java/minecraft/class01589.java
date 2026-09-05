/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00638
 *  minecraft.class00642
 *  minecraft.class02570
 *  minecraft.class02796
 *  minecraft.class04279
 *  minecraft.class04290
 *  minecraft.class05216
 *  minecraft.class07529
 *  minecraft.class07806
 *  minecraft.class07814
 *  minecraft.class07821
 *  minecraft.class07825
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00638;
import minecraft.class00642;
import minecraft.class01606;
import minecraft.class01610;
import minecraft.class02570;
import minecraft.class02796;
import minecraft.class04279;
import minecraft.class04290;
import minecraft.class05216;
import minecraft.class07529;
import minecraft.class07806;
import minecraft.class07814;
import minecraft.class07821;
import minecraft.class07825;

public class class01589
implements class07825 {
    private static final class00392 N = class00392.L((String)"disconnect.ignoring_status_request");
    private final class02796 y;
    private final class00642 L;

    public class01589(class02796 class027962, class00642 class006422) {
        this.y = class027962;
        this.L = class006422;
    }

    private void N(class07821 class078212, boolean bl) {
        this.L.method_56329(class04279.u);
        if (class078212.N() != class07529.y().comp_4027()) {
            class05216 class052162 = class078212.N() < 754 ? class00392.N((String)"multiplayer.disconnect.outdated_client", (Object[])new Object[]{class07529.y().comp_4025()}) : class00392.N((String)"multiplayer.disconnect.incompatible", (Object[])new Object[]{class07529.y().comp_4025()});
            this.L.method_10743((class00381)new class07814((class00392)class052162));
            this.L.method_10747((class00392)class052162);
        } else {
            this.L.method_56330(class04279.y, (class00638)new class01610(this.y, this.L, bl));
        }
    }

    public void N(class07821 class078212) {
        switch (class078212.u()) {
            case field_44975: {
                this.N(class078212, false);
                break;
            }
            case field_44974: {
                class07806 class078062 = this.y.NC();
                this.L.method_56329(class04290.u);
                if (this.y.A() && class078062 != null) {
                    this.L.method_56330(class04290.y, (class00638)new class01606(class078062, this.L));
                    break;
                }
                this.L.method_10747(N);
                break;
            }
            case field_48227: {
                if (!this.y.Nz()) {
                    this.L.method_56329(class04279.u);
                    class05216 class052162 = class00392.L((String)"multiplayer.disconnect.transfers_disabled");
                    this.L.method_10743((class00381)new class07814((class00392)class052162));
                    this.L.method_10747((class00392)class052162);
                    break;
                }
                this.N(class078212, true);
                break;
            }
            default: {
                throw new UnsupportedOperationException("Invalid intention " + String.valueOf(class078212.u()));
            }
        }
    }

    public boolean method_48106() {
        return this.L.method_10758();
    }

    public void method_10839(class02570 class025702) {
    }
}

