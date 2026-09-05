/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  minecraft.class07085
 *  minecraft.class08036
 *  minecraft.class08599
 */
package minecraft;

import minecraft.class06584;
import minecraft.class07085;
import minecraft.class08036;
import minecraft.class08599;

public class class08433
extends class08599 {
    private final class08036 R;

    public class08433(class08036 class080362) {
        this.R = class080362;
    }

    public boolean N() {
        return this.R.method_31548().y().R() && super.N();
    }

    public class06584 N(class07085 class070852) {
        if (class070852 == class07085.field_6173) {
            return this.R.method_31548().y();
        }
        return super.N(class070852);
    }

    public class06584 N(class07085 class070852, class06584 class065842) {
        if (class070852 == class07085.field_6173) {
            return this.R.method_31548().N(class065842);
        }
        return super.N(class070852, class065842);
    }
}

