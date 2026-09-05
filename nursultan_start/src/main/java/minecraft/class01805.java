/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01455
 *  minecraft.class03194
 *  minecraft.class05974
 *  minecraft.class07209
 */
package minecraft;

import java.util.Set;
import minecraft.class00500;
import minecraft.class01455;
import minecraft.class03194;
import minecraft.class05974;
import minecraft.class07209;

class class01805
implements class01455 {
    final /* synthetic */ Set N;
    final /* synthetic */ class05974 y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class01805(class03194 class031942, Set set, class05974 class059742) {
        this.N = set;
        this.y = class059742;
    }

    public void N(class07209 class072092, class00500 class005002) {
        this.N.add(class072092.method_10062());
        this.y.method_8652(class072092, class005002, 19);
    }

    public boolean N(class07209 class072092) {
        return this.N.contains(class072092);
    }
}

