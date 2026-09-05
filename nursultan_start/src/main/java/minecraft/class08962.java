/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class03448
 *  minecraft.class05834
 *  minecraft.class06202
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00570;
import minecraft.class01285;
import minecraft.class03448;
import minecraft.class05834;
import minecraft.class06202;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class08962
implements class01285 {
    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        class06202 class062022 = class06202.Nq();
        if ((class03448)class062022.T_3 != null) {
            class058342.y(((class03448)class062022.T_3).method_31419());
        }
        if (class072992 != null && class072992 != (class03448)class062022.T_3) {
            class058342.y(class072992.method_31419());
        }
    }

    public boolean method_72753(boolean bl) {
        return true;
    }
}

