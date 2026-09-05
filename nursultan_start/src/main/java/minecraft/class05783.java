/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class01301
 *  minecraft.class05630
 *  minecraft.class05834
 *  minecraft.class06202
 *  minecraft.class06532
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Locale;
import minecraft.class00570;
import minecraft.class01285;
import minecraft.class01301;
import minecraft.class05630;
import minecraft.class05834;
import minecraft.class06202;
import minecraft.class06532;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class05783
implements class01285 {
    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        class05630 class056302 = (class05630)class06202.Nq().i_7;
        Object[] objectArray = new Object[3];
        Object object = objectArray[0] = (Boolean)class056302.s().method_41753() != false ? "improved-transparency" : "";
        objectArray[1] = class056302.U().method_41753() == class01301.field_18162 ? "" : (class056302.U().method_41753() == class01301.field_18163 ? " fast-clouds" : " fancy-clouds");
        objectArray[2] = class056302.a().method_41753();
        class058342.y(String.format(Locale.ROOT, "%s%s B: %d", objectArray));
        class06532 class065322 = (class06532)class056302.c().method_41753();
        if (class065322 == class06532.field_64665) {
            class058342.y(String.format(Locale.ROOT, "Filtering: %s %dx", class065322.N().getString(), class056302.H()));
        } else {
            class058342.y(String.format(Locale.ROOT, "Filtering: %s", class065322.N().getString()));
        }
    }

    public boolean method_72753(boolean bl) {
        return true;
    }
}

