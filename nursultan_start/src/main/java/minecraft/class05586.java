/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class01894
 *  minecraft.class03448
 *  minecraft.class04206
 *  minecraft.class04688
 *  minecraft.class05834
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class07049
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.Map;
import minecraft.class00570;
import minecraft.class01285;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class04206;
import minecraft.class04688;
import minecraft.class05834;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class07049;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class05586
implements class01285 {
    private static final class01894 N = class01894.y((String)"looking_at_fluid");

    private String N(Map.Entry<class08092<?>, Comparable<?>> entry) {
        class08092<?> class080922 = entry.getKey();
        Comparable<?> comparable = entry.getValue();
        Object object = class07536.N(class080922, comparable);
        if (Boolean.TRUE.equals(comparable)) {
            object = String.valueOf(class06541.field_1060) + (String)object;
        } else if (Boolean.FALSE.equals(comparable)) {
            object = String.valueOf(class06541.field_1061) + (String)object;
        }
        return class080922.R() + ": " + (String)object;
    }

    public void method_72751(class05834 class058342, @Nullable class07299 class072992, @Nullable class00570 class005702, @Nullable class00570 class005703) {
        class07299 class072993;
        class07049 class070492 = class06202.Nq().F();
        Object object = class072993 = class07529.NX ? class072992 : (class03448)class06202.Nq().T_3;
        if (class070492 == null || class072993 == null) {
            return;
        }
        class07089 class070892 = class070492.method_5745(20.0, 0.0f, true);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (class070892.N() == class07113.field_1332) {
            class07209 class072092 = ((class06183)class070892).u();
            class04688 class046882 = class072993.method_8316(class072092);
            arrayList.add(String.valueOf(class06541.field_1073) + "Targeted Fluid: " + class072092.method_10263() + ", " + class072092.method_10264() + ", " + class072092.method_10260());
            arrayList.add(String.valueOf(class04206.L.y((Object)class046882.N())));
            for (Map.Entry<class08092<?>, Comparable<?>> entry : class046882.L().entrySet()) {
                arrayList.add(this.N(entry));
            }
            class046882.E().map(class035302 -> "#" + String.valueOf(class035302.y())).forEach(arrayList::add);
        }
        class058342.N(N, arrayList);
    }
}

