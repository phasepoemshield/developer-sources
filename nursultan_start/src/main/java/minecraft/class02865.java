/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00423
 *  minecraft.class00648
 *  minecraft.class04262
 *  minecraft.class04291
 */
package minecraft;

import java.util.List;
import minecraft.class00423;
import minecraft.class00648;
import minecraft.class02898;
import minecraft.class04262;
import minecraft.class04291;

class class02865
implements class04262 {
    final /* synthetic */ class00648 N;
    final /* synthetic */ class00423 y;
    final /* synthetic */ List L;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class02865(class00648 class006482, class00423 class004232, List list) {
        this.N = class006482;
        this.y = class004232;
        this.L = list;
    }

    public class00423 y() {
        return this.y;
    }

    public class00648 N() {
        return this.N;
    }

    public void N(class04291 class042912) {
        for (int i = 0; i < this.L.size(); ++i) {
            class02898 class028982 = (class02898)((Object)this.L.get(i));
            class042912.accept(class028982.N(), i);
        }
    }
}

