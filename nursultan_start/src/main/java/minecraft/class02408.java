/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class01226
 *  minecraft.class01683
 *  minecraft.class02457
 *  minecraft.class02575
 *  minecraft.class05462
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class06937
 *  minecraft.class07510
 *  org.joml.Vector2i
 */
package minecraft;

import minecraft.class00381;
import minecraft.class01226;
import minecraft.class01683;
import minecraft.class02419;
import minecraft.class02457;
import minecraft.class02575;
import minecraft.class05462;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06937;
import minecraft.class07510;
import org.joml.Vector2i;

public class class02408
implements class02457 {
    private final class06202 N;
    private final class02419 y;

    public class02408(class06202 class062022) {
        this.N = class062022;
        this.y = new class02419();
    }

    public void y(class06937 class069372) {
        this.N(class069372.i(), class069372.u);
    }

    public void N(class06584 class065842, int n) {
        this.N(class065842, n, -1);
    }

    private void N(class06584 class065842, int n, int n2) {
        if (this.N.NE() != null && n2 < class05462.W((class06584)class065842)) {
            class01683 class016832 = this.N.NE();
            class05462.N((class06584)class065842, (int)n2);
            class016832.N((class00381)new class02575(n, n2));
        }
    }

    public void N(class06937 class069372, class07510 class075102) {
        if (class075102 == class07510.field_7794 || class075102 == class07510.field_7791) {
            this.N(class069372.i(), class069372.u);
        }
    }

    public boolean N(class06937 class069372) {
        return class069372.i().N(class01226.LE);
    }

    public boolean N(double d, double d2, int n, class06584 class065842) {
        int n2;
        int n3;
        int n4;
        int n5 = class05462.W((class06584)class065842);
        if (n5 == 0) {
            return false;
        }
        Vector2i vector2i = this.y.N(d, d2);
        int n6 = n4 = vector2i.y == 0 ? -vector2i.x : vector2i.y;
        if (n4 != 0 && (n3 = class05462.R((class06584)class065842)) != (n2 = class02419.N(n4, n3, n5))) {
            this.N(class065842, n, n2);
        }
        return true;
    }
}

