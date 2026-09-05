/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class01207
 *  minecraft.class01603
 *  minecraft.class02055
 *  minecraft.class04206
 *  minecraft.class04999
 *  minecraft.class05715
 *  minecraft.class06904
 *  minecraft.class07001
 *  minecraft.class07717
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class01207;
import minecraft.class01603;
import minecraft.class02055;
import minecraft.class04206;
import minecraft.class04999;
import minecraft.class05715;
import minecraft.class06904;
import minecraft.class07001;
import minecraft.class07717;
import org.slf4j.Logger;

public class class05633
implements class06904 {
    private static final Logger N = LogUtils.getLogger();
    private static final String y = class01603.field_14190.N() + "/minecraft/structure/";

    public static class07001 y(String string, class07001 class070012) {
        class01207 class012072 = new class01207();
        int n = class07717.y((class07001)class070012, (int)500);
        int n2 = 4650;
        if (n < 4650) {
            N.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{n, 4650, string});
        }
        class07001 class070013 = class05715.field_19217.N(class04999.N(), class070012, n);
        class012072.N((class02055)class04206.i, class070013);
        return class012072.N(new class07001());
    }

    public class07001 N(String string, class07001 class070012) {
        if (string.startsWith(y)) {
            return class05633.y(string, class070012);
        }
        return class070012;
    }
}

