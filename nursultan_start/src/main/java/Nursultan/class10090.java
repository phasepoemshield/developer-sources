/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01820
 *  minecraft.class03019
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07321
 *  minecraft.class08050
 */
package Nursultan;

import minecraft.class00500;
import minecraft.class01820;
import minecraft.class03019;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07321;
import minecraft.class08050;

public class class10090
implements class01820 {
    final /* synthetic */ class08050 N;
    final /* synthetic */ class07218 y;
    final /* synthetic */ class07321 L;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10090(class03019 class030192, class08050 class080502, class07218 class072182, class07321 class073212) {
        this.N = class080502;
        this.y = class072182;
        this.L = class073212;
    }

    public String toString() {
        return "ChunkBlockColumn " + String.valueOf(this.L);
    }

    public class00500 N(int n) {
        return this.N.method_8320((class07209)this.y.method_10099(n));
    }

    public void N(int n, class00500 class005002) {
        if (this.N.w().L(n)) {
            this.N.N((class07209)this.y.method_10099(n), class005002);
            if (!class005002.Y().W()) {
                this.N.u((class07209)this.y);
            }
        }
    }
}

