/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01317
 *  minecraft.class04782
 *  minecraft.class06165
 *  minecraft.class07150
 *  minecraft.class07438
 *  minecraft.class07453
 *  minecraft.class07628
 *  minecraft.class07879
 *  minecraft.class08036
 */
package Nursultan;

import minecraft.class01317;
import minecraft.class04782;
import minecraft.class06165;
import minecraft.class07150;
import minecraft.class07438;
import minecraft.class07453;
import minecraft.class07628;
import minecraft.class07879;
import minecraft.class08036;

public class class10558
implements class01317 {
    final /* synthetic */ class06165 N;

    public class10558(class06165 class061652) {
        this.N = class061652;
    }

    public boolean method_18303(class07438 class074382, class04782 class047822) {
        class08036 class080362;
        if (class074382 instanceof class06165) {
            return false;
        }
        if (class074382 instanceof class07628 || class074382 instanceof class07879 || class074382 instanceof class07150) {
            return true;
        }
        if (class074382 instanceof class07453) {
            return !((class07453)class074382).NQ();
        }
        if (class074382 instanceof class08036 && ((class080362 = (class08036)class074382).method_7325() || class080362.method_68878())) {
            return false;
        }
        if (this.N.u(class074382)) {
            return false;
        }
        return !class074382.method_6113() && !class074382.method_21751();
    }
}

