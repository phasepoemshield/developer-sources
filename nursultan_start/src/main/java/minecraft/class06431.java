/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongSets
 *  it.unimi.dsi.fastutil.longs.LongSets$EmptySet
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class01296
 *  minecraft.class01894
 *  minecraft.class03448
 *  minecraft.class04782
 *  minecraft.class04889
 *  minecraft.class04995
 *  minecraft.class05834
 *  minecraft.class06202
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07321
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.LongSets;
import java.util.List;
import java.util.Locale;
import minecraft.class00570;
import minecraft.class01285;
import minecraft.class01296;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class04782;
import minecraft.class04889;
import minecraft.class04995;
import minecraft.class05834;
import minecraft.class06202;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07321;
import org.jspecify.annotations.Nullable;

public class class06431
implements class01285 {
    public static final class01894 N = class01894.y((String)"position");

    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        class06202 class062022 = class06202.Nq();
        class07049 class070492 = class062022.F();
        if (class070492 == null) {
            return;
        }
        class07209 class072092 = class062022.F().method_24515();
        class07321 class073212 = new class07321(class072092);
        class07211 class072112 = class070492.method_5735();
        String string = switch (class04889.N[class072112.ordinal()]) {
            case 1 -> "Towards negative Z";
            case 2 -> "Towards positive Z";
            case 3 -> "Towards negative X";
            case 4 -> "Towards positive X";
            default -> "Invalid";
        };
        LongSets.EmptySet emptySet = class072992 instanceof class04782 ? ((class04782)class072992).method_17984() : LongSets.EMPTY_SET;
        class058342.N(N, List.of(String.format(Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", class062022.F().method_23317(), class062022.F().method_23318(), class062022.F().method_23321()), String.format(Locale.ROOT, "Block: %d %d %d", class072092.method_10263(), class072092.method_10264(), class072092.method_10260()), String.format(Locale.ROOT, "Chunk: %d %d %d [%d %d in r.%d.%d.mca]", class073212.B, class01296.N((int)class072092.method_10264()), class073212.Z, class073212.U(), class073212.E(), class073212.Z(), class073212.z()), String.format(Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", class072112, string, Float.valueOf(class04995.R((float)class070492.method_36454())), Float.valueOf(class04995.R((float)class070492.method_36455()))), String.valueOf(((class03448)class062022.T_3).method_27983().N()) + " FC: " + emptySet.size()));
    }
}

