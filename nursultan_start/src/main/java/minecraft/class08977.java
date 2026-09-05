/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class05834
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00570;
import minecraft.class01285;
import minecraft.class05834;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class08977
implements class01285 {
    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        class06202 class062022 = class06202.Nq();
        String string = "GPU: " + (class062022.yE() > 100.0 ? String.valueOf(class06541.field_1061) + "100%" : Math.round(class062022.yE()) + "%");
        class058342.y(string);
    }

    public boolean method_72753(boolean bl) {
        return true;
    }
}

