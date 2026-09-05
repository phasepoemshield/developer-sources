/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class01894
 *  minecraft.class03222
 *  minecraft.class04084
 *  minecraft.class04751
 *  minecraft.class04782
 *  minecraft.class05834
 *  minecraft.class06202
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08088
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import minecraft.class00570;
import minecraft.class01285;
import minecraft.class01894;
import minecraft.class03222;
import minecraft.class04084;
import minecraft.class04751;
import minecraft.class04782;
import minecraft.class05834;
import minecraft.class06202;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08088;
import org.jspecify.annotations.Nullable;

public class class08975
implements class01285 {
    private static final class01894 N = class01894.y((String)"chunk_generation");

    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        class04782 class047822;
        class07049 class070492 = class06202.Nq().F();
        class04782 class047823 = class047822 = class072992 instanceof class04782 ? (class04782)class072992 : null;
        if (class070492 == null || class047822 == null) {
            return;
        }
        class07209 class072092 = class070492.method_24515();
        class04751 class047512 = class047822.method_14178();
        ArrayList<String> arrayList = new ArrayList<String>();
        class08088 class080882 = class047512.U();
        class04084 class040842 = class047512.W();
        class080882.N(arrayList, class040842, class072092);
        class03222 class032222 = class040842.y();
        class080882.u().N(arrayList, class072092, class032222);
        if (class005703 != null && class005703.j()) {
            arrayList.add("Blending: Old");
        }
        class058342.N(N, arrayList);
    }
}

