/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class07079
 *  minecraft.class07438
 *  minecraft.class07542
 *  minecraft.class07952
 */
package minecraft;

import minecraft.class00734;
import minecraft.class07079;
import minecraft.class07144;
import minecraft.class07185;
import minecraft.class07211;
import minecraft.class07438;
import minecraft.class07542;
import minecraft.class07952;

class class07181
extends class07952<class07438> {
    public class07181(class07144 class071442) {
        super((class07079)class071442, class07438.class, 10, true, false, (class074382, class047822) -> class074382 instanceof class07542);
    }

    protected class00734 N(double d) {
        class07211 class072112 = ((class07144)this.i).E();
        if (class072112.z() == class07185.field_11048) {
            return this.i.method_5829().L(4.0, d, d);
        }
        if (class072112.z() == class07185.field_11051) {
            return this.i.method_5829().L(d, d, 4.0);
        }
        return this.i.method_5829().L(d, 4.0, d);
    }

    public boolean N() {
        if (this.i.method_5781() == null) {
            return false;
        }
        return super.N();
    }
}

