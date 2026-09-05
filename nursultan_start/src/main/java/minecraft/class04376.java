/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class02733
 *  minecraft.class04206
 *  minecraft.class05474
 *  minecraft.class05487
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07878
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Locale;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class02733;
import minecraft.class04206;
import minecraft.class05474;
import minecraft.class05487;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07878;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public interface class04376 {
    public static final class07211[] N = new class07211[]{class07211.field_11039, class07211.field_11034, class07211.field_11033, class07211.field_11036, class07211.field_11043, class07211.field_11035};

    public static void N(class07284 class072842, class07211 class072112, class07209 class072092, class07209 class072093, class00500 class005002, int n, int n2) {
        class00500 class005003 = class072842.method_8320(class072092);
        if ((n & 0x80) != 0 && class005003.N(class00869.Lf)) {
            return;
        }
        class00500 class005004 = class005003.N((class05487)class072842, (class08713)class072842, class072092, class072112, class072093, class005002, class072842.method_8409());
        class00891.N((class00500)class005003, (class00500)class005004, (class07284)class072842, (class07209)class072092, (int)n, (int)n2);
    }

    public static void N(class07299 class072992, class00500 class005002, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        try {
            class005002.N(class072992, class072092, class008912, class027332, bl);
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Exception while updating neighbours");
            class07074 class070742 = class070802.N("Block being updated");
            class070742.N("Source block type", () -> {
                try {
                    return String.format(Locale.ROOT, "ID #%s (%s // %s)", class04206.i.y((Object)class008912), class008912.w(), class008912.getClass().getCanonicalName());
                }
                catch (Throwable throwable) {
                    return "ID #" + String.valueOf(class04206.i.y((Object)class008912));
                }
            });
            class07074.N((class07074)class070742, (class05474)class072992, (class07209)class072092, (class00500)class005002);
            throw new class07878(class070802);
        }
    }

    public void N(class07211 var1, class00500 var2, class07209 var3, class07209 var4, int var5, int var6);

    default public void N(class07209 class072092, class00891 class008912, @Nullable class07211 class072112, @Nullable class02733 class027332) {
        for (class07211 class072113 : N) {
            if (class072113 == class072112) continue;
            this.N(class072092.method_10093(class072113), class008912, null);
        }
    }

    public void N(class00500 var1, class07209 var2, class00891 var3, @Nullable class02733 var4, boolean var5);

    public void N(class07209 var1, class00891 var2, @Nullable class02733 var3);
}

