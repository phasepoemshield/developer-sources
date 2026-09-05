/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00002
 *  minecraft.class00022
 *  minecraft.class00124
 *  minecraft.class00137
 *  minecraft.class01894
 *  minecraft.class03620
 *  minecraft.class03621
 *  minecraft.class06069
 *  minecraft.class09033
 *  minecraft.class09038
 */
package minecraft;

import minecraft.class00002;
import minecraft.class00022;
import minecraft.class00124;
import minecraft.class00137;
import minecraft.class01894;
import minecraft.class03620;
import minecraft.class03621;
import minecraft.class06069;
import minecraft.class09023;
import minecraft.class09033;
import minecraft.class09038;

class class08996
implements class00124<class00002> {
    final /* synthetic */ class01894 N;
    final /* synthetic */ class00002 y;
    final /* synthetic */ class09023 L;

    class08996(class09023 class090232, class01894 class018942, class00002 class000022) {
        this.L = class090232;
        this.N = class018942;
        this.y = class000022;
    }

    public int i() {
        class00137 class001372 = this.L.N.get(this.N);
        return class001372 == null ? 0 : class001372.i();
    }

    public void N(class09038 class090382) {
        class00137 class001372 = this.L.N.get(this.N);
        if (class001372 == null) {
            return;
        }
        class001372.N(class090382);
    }

    public class00002 y(class06069 class060692) {
        class00137 class001372 = this.L.N.get(this.N);
        if (class001372 == null) {
            return class09033.y;
        }
        class00002 class000022 = class001372.y(class060692);
        return new class00002(class000022.N(), (class03621)new class03620(new class03621[]{class000022.L(), this.y.L()}), (class03621)new class03620(new class03621[]{class000022.u(), this.y.u()}), this.y.i(), class00022.field_5474, class000022.M() || this.y.M(), class000022.B(), class000022.Z());
    }
}

