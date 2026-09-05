/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class05630
 *  minecraft.class05834
 *  minecraft.class06202
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Locale;
import minecraft.class00570;
import minecraft.class01285;
import minecraft.class05630;
import minecraft.class05834;
import minecraft.class06202;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class08947
implements class01285 {
    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        class06202 class062022 = class06202.Nq();
        int n = class062022.NG().N();
        class05630 class056302 = (class05630)class062022.i_7;
        class058342.N(String.format(Locale.ROOT, "%d fps T: %s%s", class062022.Nx(), n == 260 ? "inf" : Integer.valueOf(n), (Boolean)class056302.NN().method_41753() != false ? " vsync" : ""));
    }

    public boolean method_72753(boolean bl) {
        return true;
    }
}

