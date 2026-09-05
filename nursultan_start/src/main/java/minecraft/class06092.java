/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class04688
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07322
 *  minecraft.class07438
 *  minecraft.class07504
 *  minecraft.class08036
 *  minecraft.class08220
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class04688;
import minecraft.class06093;
import minecraft.class06123;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07322;
import minecraft.class07438;
import minecraft.class07504;
import minecraft.class08036;
import minecraft.class08220;
import org.jspecify.annotations.Nullable;

public interface class06092 {
    public boolean L();

    default public boolean i() {
        return false;
    }

    public boolean u();

    public static class06092 y() {
        return class06123.y;
    }

    public boolean N(class06581 var1);

    public static class06092 N() {
        return class06123.N;
    }

    public boolean N(class04688 var1, class04688 var2);

    public class00494 N(class00500 var1, class07322 var2, class07209 var3);

    public static class06092 N(class07049 class070492) {
        class07049 class070493 = class070492;
        Objects.requireNonNull(class070493);
        class07049 class070494 = class070493;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class07504.class}, (Object)class070494, (int)n)) {
            case 0 -> {
                class07504 var3_3 = (class07504)class070494;
                if (class07504.N((class07299)var3_3.method_73183())) {
                    yield new class08220(var3_3, false);
                }
                yield new class06093(class070492, false, false);
            }
            default -> new class06093(class070492, false, false);
        };
    }

    public static class06092 N(class07049 class070492, boolean bl) {
        return new class06093(class070492, bl, false);
    }

    public static class06092 N(@Nullable class08036 class080362) {
        return new class06093(class080362 != null ? class080362.method_21752() : false, true, class080362 != null ? class080362.method_23318() : -1.7976931348623157E308, class080362 instanceof class07438 ? class080362.method_6047() : class06584.E, false, (class07049)class080362);
    }

    public static class06092 N(@Nullable class07049 class070492, double d) {
        return new class06093(class070492 != null ? class070492.method_21752() : false, true, class070492 != null ? d : -1.7976931348623157E308, class070492 instanceof class07438 ? ((class07438)class070492).method_6047() : class06584.E, false, class070492);
    }

    public boolean N(class00494 var1, class07209 var2, boolean var3);
}

