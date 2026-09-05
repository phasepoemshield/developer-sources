/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00167
 *  minecraft.class01894
 *  minecraft.class02052
 *  minecraft.class02067
 *  minecraft.class02081
 *  minecraft.class03702
 *  minecraft.class04237
 *  minecraft.class05913
 *  minecraft.class07211
 *  minecraft.class07536
 *  minecraft.class08505
 *  minecraft.class08511
 *  minecraft.class08534
 *  minecraft.class08626
 *  minecraft.class08823
 *  minecraft.class08923
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package minecraft;

import java.util.List;
import java.util.Map;
import minecraft.class00167;
import minecraft.class01894;
import minecraft.class02052;
import minecraft.class02067;
import minecraft.class02081;
import minecraft.class03702;
import minecraft.class04237;
import minecraft.class05913;
import minecraft.class07211;
import minecraft.class07536;
import minecraft.class08505;
import minecraft.class08511;
import minecraft.class08534;
import minecraft.class08626;
import minecraft.class08823;
import minecraft.class08923;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class class08256 {
    private static final String y = "missingno";
    public static final class01894 N = class01894.y((String)"builtin/missing");

    public static class00167 N() {
        class02052 class020522 = new class02052(0.0f, 0.0f, 16.0f, 16.0f);
        Map map = class07536.N_74(class07211.class, class072112 -> new class02067(class072112, -1, y, class020522, class08511.field_57029));
        class02081 class020812 = new class02081((Vector3fc)new Vector3f(0.0f, 0.0f, 0.0f), (Vector3fc)new Vector3f(16.0f, 16.0f, 16.0f), map);
        return new class04237((class08534)new class08505(List.of(class020812)), null, null, class03702.N, new class08823().N("particle", y).N(y, new class05913(class08626.N, class08923.L())).N(), null);
    }
}

