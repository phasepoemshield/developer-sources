/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class04782
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 */
package minecraft;

import java.util.List;
import java.util.UUID;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class04488;
import minecraft.class04782;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;

public interface class04514 {
    public static final class04514 N = (class047822, class044882, class072092, d, bl) -> class044882.N(class047822, class080362 -> class080362.method_24515().method_19771((class00753)class072092, d) && !class080362.method_68878() && !class080362.method_7325()).stream().filter(class080362 -> !bl || class04514.N((class07299)class047822, class072092.method_46558(), class080362.method_33571())).map(class07049::method_5667).toList();
    public static final class04514 y = (class047822, class044882, class072092, d, bl) -> class044882.N(class047822, class080362 -> class080362.method_24515().method_19771((class00753)class072092, d) && !class080362.method_7325()).stream().filter(class080362 -> !bl || class04514.N((class07299)class047822, class072092.method_46558(), class080362.method_33571())).map(class07049::method_5667).toList();
    public static final class04514 L = (class047822, class044882, class072092, d, bl) -> {
        class00734 class007342 = new class00734(class072092).M(d);
        return class044882.N(class047822, class07078.yz, class007342, class07438::method_5805).stream().filter(class078812 -> !bl || class04514.N((class07299)class047822, class072092.method_46558(), class078812.method_33571())).map(class07049::method_5667).toList();
    };

    private static boolean N(class07299 class072992, class06889 class068892, class06889 class068893) {
        class06183 class061832 = class072992.N(new class05862(class068893, class068892, class05849.field_23142, class05835.field_1348, class06092.N()));
        return class061832.u().equals((Object)class07209.method_49638((class00737)class068892)) || class061832.N() == class07113.field_1333;
    }

    public List<UUID> detect(class04782 var1, class04488 var2, class07209 var3, double var4, boolean var6);
}

