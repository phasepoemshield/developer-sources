/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07079
 *  minecraft.class07952
 *  minecraft.class08036
 */
package minecraft;

import java.util.Iterator;
import minecraft.class07079;
import minecraft.class07869;
import minecraft.class07952;
import minecraft.class08036;

class class07898
extends class07952<class08036> {
    final /* synthetic */ class07869 Z;

    public class07898(class07869 class078692) {
        this.Z = class078692;
        super((class07079)class078692, class08036.class, 20, true, true, null);
    }

    protected double Z() {
        return super.Z() * 0.5;
    }

    public boolean N() {
        if (this.Z.method_6109()) {
            return false;
        }
        if (super.N()) {
            Iterator var2 = this.Z.method_73183().N(class07869.class, this.Z.method_5829().L(8.0, 4.0, 8.0)).iterator();
            while (var2.hasNext()) {
                if (!((class07869)((Object)var2.next())).method_6109()) continue;
                return true;
            }
        }
        return false;
    }
}

