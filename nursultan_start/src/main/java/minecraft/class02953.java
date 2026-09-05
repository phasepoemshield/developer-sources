/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class03757
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06942
 *  minecraft.class07050
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 */
package minecraft;

import minecraft.class00753;
import minecraft.class03757;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06942;
import minecraft.class07050;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;

public class class02953
extends class06942 {
    private final class07211 y;

    public class07211 L() {
        return class07211.field_11033;
    }

    public class02953(class07299 class072992, class07209 class072092, class07211 class072112, class06584 class065842, class07211 class072113) {
        super(class072992, null, class07050.field_5808, class065842, new class06183(class06889.L((class00753)class072092), class072113, class072092, false));
        this.y = class072112;
    }

    public class07211[] i() {
        switch (class03757.N[this.y.ordinal()]) {
            default: {
                return new class07211[]{class07211.field_11033, class07211.field_11043, class07211.field_11034, class07211.field_11035, class07211.field_11039, class07211.field_11036};
            }
            case 2: {
                return new class07211[]{class07211.field_11033, class07211.field_11036, class07211.field_11043, class07211.field_11034, class07211.field_11035, class07211.field_11039};
            }
            case 3: {
                return new class07211[]{class07211.field_11033, class07211.field_11043, class07211.field_11034, class07211.field_11039, class07211.field_11036, class07211.field_11035};
            }
            case 4: {
                return new class07211[]{class07211.field_11033, class07211.field_11035, class07211.field_11034, class07211.field_11039, class07211.field_11036, class07211.field_11043};
            }
            case 5: {
                return new class07211[]{class07211.field_11033, class07211.field_11039, class07211.field_11035, class07211.field_11036, class07211.field_11043, class07211.field_11034};
            }
            case 6: 
        }
        return new class07211[]{class07211.field_11033, class07211.field_11034, class07211.field_11035, class07211.field_11036, class07211.field_11043, class07211.field_11039};
    }

    public boolean y() {
        return this.N();
    }

    public boolean N() {
        return this.method_8045().method_8320(this.method_30344().u()).N((class06942)this);
    }

    public class07209 method_8037() {
        return this.method_30344().u();
    }

    public float method_8044() {
        return this.y.u() * 90;
    }

    public class07211 method_8042() {
        return this.y.z() == class07185.field_11052 ? class07211.field_11043 : this.y;
    }

    public boolean method_8046() {
        return false;
    }
}

