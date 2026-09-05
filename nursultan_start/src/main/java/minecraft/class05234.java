/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class00642
 *  minecraft.class01285
 *  minecraft.class01683
 *  minecraft.class03106
 *  minecraft.class05834
 *  minecraft.class06202
 *  minecraft.class07299
 *  minecraft.class08337
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Locale;
import minecraft.class00570;
import minecraft.class00642;
import minecraft.class01285;
import minecraft.class01683;
import minecraft.class03106;
import minecraft.class05834;
import minecraft.class06202;
import minecraft.class07299;
import minecraft.class08337;
import org.jspecify.annotations.Nullable;

public class class05234
implements class01285 {
    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        String string;
        class06202 class062022 = class06202.Nq();
        class08337 class083372 = class062022.Na();
        class01683 class016832 = class062022.NE();
        if (class016832 == null || class072992 == null) {
            return;
        }
        class00642 class006422 = class016832.M();
        float f = class006422.method_10745();
        float f2 = class006422.method_10762();
        class03106 class031062 = class072992.method_54719();
        String string2 = class031062.z() ? " (frozen - stepping)" : (class031062.E() ? " (frozen)" : "");
        if (class083372 != null) {
            boolean bl = class083372.yW().N();
            if (bl) {
                string2 = " (sprinting)";
            }
            String string3 = bl ? "-" : String.format(Locale.ROOT, "%.1f", Float.valueOf(class031062.M()));
            string = String.format(Locale.ROOT, "Integrated server @ %.1f/%s ms%s, %.0f tx, %.0f rx", Float.valueOf(class083372.yE()), string3, string2, Float.valueOf(f), Float.valueOf(f2));
        } else {
            string = String.format(Locale.ROOT, "\"%s\" server%s, %.0f tx, %.0f rx", class016832.V(), string2, Float.valueOf(f), Float.valueOf(f2));
        }
        class058342.y(string);
    }

    public boolean method_72753(boolean bl) {
        return true;
    }
}

