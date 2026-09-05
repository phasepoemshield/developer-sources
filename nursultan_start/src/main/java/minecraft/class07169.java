/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class07079
 *  minecraft.class07086
 *  minecraft.class07952
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class00734;
import minecraft.class07079;
import minecraft.class07086;
import minecraft.class07144;
import minecraft.class07185;
import minecraft.class07211;
import minecraft.class07952;
import minecraft.class08036;

class class07169
extends class07952<class08036> {
    final /* synthetic */ class07144 Z;

    public class07169(class07144 class071442, class07144 class071443) {
        this.Z = class071442;
        super((class07079)class071443, class08036.class, true);
    }

    public boolean N() {
        if (this.Z.method_73183().y() == class07086.field_5801) {
            return false;
        }
        return super.N();
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
}

