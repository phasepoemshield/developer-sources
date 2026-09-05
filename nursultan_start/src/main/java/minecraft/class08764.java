/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04474
 *  minecraft.class05442
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06584
 *  minecraft.class07089
 *  minecraft.class07209
 *  minecraft.class07282
 *  minecraft.class08966
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00500;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04474;
import minecraft.class05442;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class07089;
import minecraft.class07209;
import minecraft.class07282;
import minecraft.class08762;
import minecraft.class08966;
import org.jspecify.annotations.Nullable;

public class class08764 {
    private final class06202 N;
    private @Nullable class08762 y;

    public void L() {
        if (this.y != null) {
            this.y();
        }
        this.y = ((class05630)this.N.i_7).T.N(this);
    }

    public class08764(class06202 class062022, class05630 class056302) {
        this.N = class062022;
    }

    public class06202 i() {
        return this.N;
    }

    public void u() {
        if (this.y != null) {
            if ((class03448)this.N.T_3 != null) {
                this.y.N();
            } else {
                this.y();
            }
        } else if ((class03448)this.N.T_3 != null) {
            this.L();
        }
    }

    public void y() {
        if (this.y == null) {
            return;
        }
        this.y.y();
        this.y = null;
    }

    public void N(double d, double d2) {
        if (this.y != null) {
            this.y.N(d, d2);
        }
    }

    public void N(class08966 class089662) {
        ((class05630)this.N.i_7).T = class089662;
        ((class05630)this.N.i_7).Np();
        if (this.y != null) {
            this.y.y();
            this.y = class089662.N(this);
        }
    }

    public void N(class04474 class044742) {
        if (this.y != null) {
            this.y.N(class044742);
        }
    }

    public static class00392 N(String string) {
        return class00392.u((String)("key." + string)).N(class06541.field_1067);
    }

    public void N(class06584 class065842, class06584 class065843, class05442 class054422) {
    }

    public void N(class06584 class065842) {
        if (this.y != null) {
            this.y.N(class065842);
        }
    }

    public void N() {
        if (this.y != null) {
            this.y.L();
        }
    }

    public void N(class03448 class034482, class07209 class072092, class00500 class005002, float f) {
        if (this.y != null) {
            this.y.N(class034482, class072092, class005002, f);
        }
    }

    public void N(@Nullable class03448 class034482, @Nullable class07089 class070892) {
        if (this.y != null && class070892 != null && class034482 != null) {
            this.y.N(class034482, class070892);
        }
    }

    public boolean R() {
        if ((class03443)this.N.T_2 == null) {
            return false;
        }
        return ((class03443)this.N.T_2).U() == class07282.field_9215;
    }
}

