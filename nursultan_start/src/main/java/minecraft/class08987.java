/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class01894
 *  minecraft.class03448
 *  minecraft.class05834
 *  minecraft.class06202
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07830
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Map;
import minecraft.class00570;
import minecraft.class01285;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class05834;
import minecraft.class06202;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07830;
import org.jspecify.annotations.Nullable;

public class class08987
implements class01285 {
    private static final Map<class07830, String> N = Maps.newEnumMap(Map.of(class07830.field_13194, "SW", class07830.field_13202, "S", class07830.field_13195, "OW", class07830.field_13200, "O", class07830.field_13197, "M", class07830.field_13203, "ML"));
    private static final class01894 y = class01894.y((String)"heightmaps");

    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        class06202 class062022 = class06202.Nq();
        class07049 class070492 = class062022.F();
        if (class070492 == null || (class03448)class062022.T_3 == null || class005702 == null) {
            return;
        }
        class07209 class072092 = class070492.method_24515();
        ArrayList<String> arrayList = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder("CH");
        for (class07830 class078302 : class07830.values()) {
            if (!class078302.y()) continue;
            stringBuilder.append(" ").append(N.get(class078302)).append(": ").append(class005702.N(class078302, class072092.method_10263(), class072092.method_10260()));
        }
        arrayList.add(stringBuilder.toString());
        stringBuilder.setLength(0);
        stringBuilder.append("SH");
        for (class07830 class078302 : class07830.values()) {
            if (!class078302.L()) continue;
            stringBuilder.append(" ").append(N.get(class078302)).append(": ");
            if (class005703 != null) {
                stringBuilder.append(class005703.N(class078302, class072092.method_10263(), class072092.method_10260()));
                continue;
            }
            stringBuilder.append("??");
        }
        arrayList.add(stringBuilder.toString());
        class058342.N(y, arrayList);
    }
}

