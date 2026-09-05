/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class05834
 *  minecraft.class06541
 *  minecraft.class07049
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import minecraft.class00570;
import minecraft.class01285;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class05834;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class07049;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class06185
implements class01285 {
    private static final class01894 N = class01894.y((String)"looking_at_entity");

    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        class07049 class070492 = (class07049)class06202.Nq().M_2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (class070492 != null) {
            arrayList.add(String.valueOf(class06541.field_1073) + "Targeted Entity");
            arrayList.add(String.valueOf(class04206.M.y((Object)class070492.method_5864())));
        }
        class058342.N(N, arrayList);
    }
}

