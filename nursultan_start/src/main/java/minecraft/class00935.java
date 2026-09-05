/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class03504
 *  minecraft.class05247
 *  minecraft.class08388
 *  minecraft.class08626
 *  minecraft.class08985
 */
package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import minecraft.class00910;
import minecraft.class00924;
import minecraft.class01894;
import minecraft.class03504;
import minecraft.class05247;
import minecraft.class08388;
import minecraft.class08626;
import minecraft.class08985;

public class class00935 {
    static final class05247 N = class05247.N((float)8.0f);
    final class08626 y;
    final class03504 L;
    private final class08985 u;
    private final Map<class01894, class08985> i = new HashMap<class01894, class08985>();
    private final Function<class01894, class08985> R;

    public class00935(class08626 class086262) {
        this.y = class086262;
        this.L = class03504.y((class01894)class086262.i());
        class08388 class083882 = class086262.L();
        this.u = this.N(class083882);
        this.R = class018942 -> {
            class08388 class083883 = class086262.N(class018942);
            if (class083883 == class083882) {
                return this.u;
            }
            return this.N(class083883);
        };
    }

    public class08985 N(class01894 class018942) {
        return this.i.computeIfAbsent(class018942, this.R);
    }

    private class08985 N(class08388 class083882) {
        return new class00910(new class00924(this, class083882));
    }
}

