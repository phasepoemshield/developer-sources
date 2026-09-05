/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class04782
 *  minecraft.class05834
 *  minecraft.class06202
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07209
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Locale;
import minecraft.class00570;
import minecraft.class01285;
import minecraft.class04782;
import minecraft.class05834;
import minecraft.class06202;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07209;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class06380
implements class01285 {
    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        class07049 class070492 = class06202.Nq().F();
        if (class070492 == null || class005703 == null || !(class072992 instanceof class04782)) {
            return;
        }
        class04782 class047822 = (class04782)class072992;
        class07209 class072092 = class070492.method_24515();
        if (class047822.L(class072092.method_10264())) {
            float f = class047822.method_76332(class072092);
            long l = class005703.n();
            class07052 class070522 = new class07052(class047822.y(), class047822.method_8532(), l, f);
            class058342.y(String.format(Locale.ROOT, "Local Difficulty: %.2f // %.2f (Day %d)", Float.valueOf(class070522.y()), Float.valueOf(class070522.u()), class047822.method_75003()));
        }
    }
}

