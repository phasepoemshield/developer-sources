/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02233
 *  minecraft.class05216
 *  minecraft.class05936
 *  minecraft.class08844
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02233;
import minecraft.class05216;
import minecraft.class05936;
import minecraft.class08653;
import minecraft.class08844;

public interface class08657 {
    public static final int N = 182;
    public static final int y = 5;
    public static final int L = 24;
    public static final class08657 u = new class08653();

    public void y(class01054 var1, class02233 var2);

    default public int y(class08844 class088442) {
        return class088442.s() - 24 - 5;
    }

    default public int N(class08844 class088442) {
        return (class088442.P() - 182) / 2;
    }

    public static void N(class01054 class010542, class01590 class015902, int n) {
        class05216 class052162 = class00392.N((String)"gui.experience.level", (Object[])new Object[]{n});
        int n2 = (class010542.N() - class015902.N((class05936)class052162)) / 2;
        int n3 = class010542.y() - 24;
        Objects.requireNonNull(class015902);
        int n4 = n3 - 9 - 2;
        class010542.N(class015902, (class00392)class052162, n2 + 1, n4, -16777216, false);
        class010542.N(class015902, (class00392)class052162, n2 - 1, n4, -16777216, false);
        class010542.N(class015902, (class00392)class052162, n2, n4 + 1, -16777216, false);
        class010542.N(class015902, (class00392)class052162, n2, n4 - 1, -16777216, false);
        class010542.N(class015902, (class00392)class052162, n2, n4, -8323296, false);
    }

    public void N(class01054 var1, class02233 var2);
}

