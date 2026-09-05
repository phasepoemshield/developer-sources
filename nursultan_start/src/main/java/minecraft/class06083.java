/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  minecraft.class00570
 *  minecraft.class00760
 *  minecraft.class01285
 *  minecraft.class04782
 *  minecraft.class05834
 *  minecraft.class06202
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class07428
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00570;
import minecraft.class00760;
import minecraft.class01285;
import minecraft.class04782;
import minecraft.class05834;
import minecraft.class06202;
import minecraft.class07049;
import minecraft.class07299;
import minecraft.class07428;
import org.jspecify.annotations.Nullable;

public class class06083
implements class01285 {
    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        class04782 class047822;
        class07049 class070492 = class06202.Nq().F();
        class04782 class047823 = class047822 = class072992 instanceof class04782 ? (class04782)class072992 : null;
        if (class070492 == null || class047822 == null) {
            return;
        }
        class00760 class007602 = class047822.method_14178().b();
        if (class007602 != null) {
            Object2IntMap var10 = class007602.y();
            int n = class007602.N();
            class058342.y("SC: " + n + ", " + Stream.of(class07428.values()).map(class074282 -> Character.toUpperCase(class074282.N().charAt(0)) + ": " + var10.getInt(class074282)).collect(Collectors.joining(", ")));
        }
    }
}

