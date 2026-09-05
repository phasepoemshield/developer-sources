/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class00772
 *  minecraft.class01285
 *  minecraft.class01894
 *  minecraft.class03448
 *  minecraft.class05795
 *  minecraft.class05834
 *  minecraft.class06202
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07529
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class00570;
import minecraft.class00772;
import minecraft.class01285;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class05795;
import minecraft.class05834;
import minecraft.class06202;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07529;
import org.jspecify.annotations.Nullable;

public class class01629
implements class01285 {
    public static final class01894 N = class01894.y((String)"light");

    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        class06202 class062022 = class06202.Nq();
        class07049 class070492 = class062022.F();
        if (class070492 == null || (class03448)class062022.T_3 == null) {
            return;
        }
        class07209 class072092 = class070492.method_24515();
        int n = ((class03448)class062022.T_3).method_8398().L().N(class072092, 0);
        int n2 = ((class03448)class062022.T_3).method_8314(class00772.field_9284, class072092);
        int n3 = ((class03448)class062022.T_3).method_8314(class00772.field_9282, class072092);
        String string = "Client Light: " + n + " (" + n2 + " sky, " + n3 + " block)";
        if (class07529.NX) {
            Object object;
            if (class005703 != null) {
                class05795 class057952 = class005703.J().method_22336();
                object = "Server Light: (" + class057952.N(class00772.field_9284).L(class072092) + " sky, " + class057952.N(class00772.field_9282).L(class072092) + " block)";
            } else {
                object = "Server Light: (?? sky, ?? block)";
            }
            class058342.N(N, List.of(string, object));
        } else {
            class058342.N(N, string);
        }
    }
}

