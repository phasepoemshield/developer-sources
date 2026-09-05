/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00379
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00860
 *  minecraft.class00861
 *  minecraft.class06237
 *  minecraft.class06695
 *  minecraft.class06889
 *  minecraft.class07211
 *  minecraft.class07236
 *  minecraft.class07482
 *  minecraft.class07490
 *  minecraft.class08036
 *  minecraft.class08044
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00379;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00860;
import minecraft.class00861;
import minecraft.class06237;
import minecraft.class06695;
import minecraft.class06889;
import minecraft.class07211;
import minecraft.class07236;
import minecraft.class07482;
import minecraft.class07490;
import minecraft.class08036;
import minecraft.class08044;
import org.jspecify.annotations.Nullable;

class class00876
implements class06237 {
    final /* synthetic */ class00379 N;
    final /* synthetic */ class00379 y;
    final /* synthetic */ class06695 L;

    public class00392 method_5476() {
        if (this.N.method_16914()) {
            return this.N.method_5476();
        }
        if (this.y.method_16914()) {
            return this.y.method_5476();
        }
        return class00392.L((String)"container.chestDouble");
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class00876(class00861 class008612, class00379 class003792, class00379 class003793, class06695 class066952) {
        this.N = class003792;
        this.y = class003793;
        this.L = class066952;
    }

    public @Nullable class07482 createMenu(int n, class08044 class080442, class08036 class080362) {
        if (this.N.N(class080362) && this.y.N(class080362)) {
            this.N.y(class080442.z);
            this.y.y(class080442.z);
            return class07490.y((int)n, (class08044)class080442, (class06695)this.L);
        }
        class07211 class072112 = class00860.E((class00500)this.N.w());
        class07236.N((class06889)this.N.d().method_46558().y((double)class072112.P() / 2.0, 0.0, (double)class072112.T() / 2.0), (class08036)class080362, (class00392)this.method_5476());
        return null;
    }
}

