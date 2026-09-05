/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class01894
 *  minecraft.class04453
 *  minecraft.class05834
 *  minecraft.class06202
 *  minecraft.class07299
 *  minecraft.class07512
 *  minecraft.class08036
 */
package squeek.appleskin.client;

import java.text.DecimalFormat;
import minecraft.class00570;
import minecraft.class01285;
import minecraft.class01894;
import minecraft.class04453;
import minecraft.class05834;
import minecraft.class06202;
import minecraft.class07299;
import minecraft.class07512;
import minecraft.class08036;
import squeek.appleskin.helpers.ExhaustionHelper;
import squeek.appleskin.helpers.FoodHelper;

public class DebugInfoHudEntry
implements class01285 {
    public static final class01894 ENTRY_ID = class01894.N((String)"appleskin", (String)"food_stats");
    public static final class01894 SECTION_ID = class01894.N((String)"appleskin", (String)"debug_info");
    private static final DecimalFormat saturationDF = new DecimalFormat("#.##");
    private static final DecimalFormat exhaustionValDF = new DecimalFormat("0.00");
    private static final DecimalFormat exhaustionMaxDF = new DecimalFormat("#.##");

    public void method_72751(class05834 class058342, class07299 class072992, class00570 class005702, class00570 class005703) {
        if (class072992 != null) {
            class06202 class062022 = class06202.Nq();
            if (class062022 == null || (class04453)class062022.T_4 == null) {
                return;
            }
            class07512 class075122 = ((class04453)class062022.T_4).method_7344();
            if (class075122 == null) {
                return;
            }
            float f = ExhaustionHelper.getExhaustion((class08036)((class04453)class062022.T_4));
            float f2 = FoodHelper.MAX_EXHAUSTION;
            class058342.N(SECTION_ID, "hunger: " + class075122.N() + ", sat: " + saturationDF.format(class075122.u()) + ", exh: " + exhaustionValDF.format(f) + "/" + exhaustionMaxDF.format(f2));
        }
    }
}

