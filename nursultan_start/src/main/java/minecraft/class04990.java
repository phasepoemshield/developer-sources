/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class05834
 *  minecraft.class06202
 *  minecraft.class06431
 *  minecraft.class07209
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Locale;
import minecraft.class00570;
import minecraft.class01285;
import minecraft.class05834;
import minecraft.class06202;
import minecraft.class06431;
import minecraft.class07209;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class04990
implements class01285 {
    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        class06202 class062022 = class06202.Nq();
        if (class062022.F() == null) {
            return;
        }
        class07209 class072092 = class062022.F().method_24515();
        class058342.N(class06431.N, String.format(Locale.ROOT, "Section-relative: %02d %02d %02d", class072092.method_10263() & 0xF, class072092.method_10264() & 0xF, class072092.method_10260() & 0xF));
    }

    public boolean method_72753(boolean bl) {
        return true;
    }
}

