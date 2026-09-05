/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class00780
 *  minecraft.class01285
 *  minecraft.class01894
 *  minecraft.class03448
 *  minecraft.class03556
 *  minecraft.class04782
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
import minecraft.class00780;
import minecraft.class01285;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class05834;
import minecraft.class06202;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07529;
import org.jspecify.annotations.Nullable;

public class class08949
implements class01285 {
    private static final class01894 N = class01894.y((String)"biome");

    private static String N(class03556<class00780> class035562) {
        return (String)class035562.u().map(class059462 -> class059462.N().toString(), class007802 -> "[unregistered " + String.valueOf(class007802) + "]");
    }

    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        class06202 class062022 = class06202.Nq();
        class07049 class070492 = class062022.F();
        if (class070492 == null || (class03448)class062022.T_3 == null) {
            return;
        }
        class07209 class072092 = class070492.method_24515();
        if (((class03448)class062022.T_3).L(class072092.method_10264())) {
            if (class07529.NX && class072992 instanceof class04782) {
                class058342.N(N, List.of("Biome: " + class08949.N((class03556<class00780>)((class03448)class062022.T_3).i(class072092)), "Server Biome: " + class08949.N((class03556<class00780>)class072992.i(class072092))));
            } else {
                class058342.y("Biome: " + class08949.N((class03556<class00780>)((class03448)class062022.T_3).i(class072092)));
            }
        }
    }
}

