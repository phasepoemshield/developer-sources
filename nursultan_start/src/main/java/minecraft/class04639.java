/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class04453
 *  minecraft.class05834
 *  minecraft.class06202
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Locale;
import minecraft.class00570;
import minecraft.class01285;
import minecraft.class04453;
import minecraft.class05834;
import minecraft.class06202;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class04639
implements class01285 {
    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        class06202 class062022 = class06202.Nq();
        if ((class04453)class062022.T_4 == null) {
            return;
        }
        class058342.y(class062022.Nr().B() + String.format(Locale.ROOT, " (Mood %d%%)", Math.round(((class04453)class062022.T_4).m() * 100.0f)));
    }
}

