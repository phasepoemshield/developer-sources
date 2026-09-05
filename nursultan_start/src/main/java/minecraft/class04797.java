/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  minecraft.class00201
 *  minecraft.class00392
 *  minecraft.class00404
 *  minecraft.class04272
 *  minecraft.class04827
 *  minecraft.class04833
 *  minecraft.class05511
 *  minecraft.class05513
 *  minecraft.class05519
 *  minecraft.class05520
 *  minecraft.class05532
 *  minecraft.class06541
 *  minecraft.class07209
 *  minecraft.class07536
 *  minecraft.class08610
 *  org.apache.commons.lang3.exception.ExceptionUtils
 */
package minecraft;

import com.google.common.base.MoreObjects;
import java.util.Locale;
import java.util.Optional;
import minecraft.class00201;
import minecraft.class00392;
import minecraft.class00404;
import minecraft.class04272;
import minecraft.class04782;
import minecraft.class04827;
import minecraft.class04833;
import minecraft.class05511;
import minecraft.class05513;
import minecraft.class05519;
import minecraft.class05520;
import minecraft.class05532;
import minecraft.class06541;
import minecraft.class07209;
import minecraft.class07536;
import minecraft.class08610;
import org.apache.commons.lang3.exception.ExceptionUtils;

class class04797
implements class05532 {
    private int N = 0;
    private int y = 0;

    public void y(class05513 class055132, class05520 class055202) {
        if (!class055132.d()) {
            class04797.N(class055132, (Throwable)class055132.m());
            if (class055132.Y().L()) {
                this.N(class055132, class055202, false);
            }
            return;
        }
        class00201 class002012 = class055132.t();
        String string = "Flaky test " + String.valueOf(class055132) + " failed, attempt: " + this.N + "/" + class002012.z();
        if (class002012.U() > 1) {
            string = string + ", successes: " + this.y + " (" + class002012.U() + " required)";
        }
        class04797.N(class055132.M(), class06541.field_1054, string);
        if (class055132.w() - this.N + this.y >= class055132.k()) {
            class055202.N(class055132);
        } else {
            class04797.N(class055132, (Throwable)new class04827(this.N, this.y, class055132));
        }
    }

    private static Optional<class08610> y(class05513 class055132) {
        class04782 class047822 = class055132.M();
        return Optional.ofNullable(class055132.L()).flatMap(class072092 -> class047822.N((class07209)class072092, class00404.field_55993));
    }

    private static void y(class05513 class055132, String string) {
        class04797.N(class055132.M(), class06541.field_1060, string);
        class04833.y((class05513)class055132);
    }

    protected static void y(class05513 class055132, Throwable throwable) {
        String string = throwable.getMessage() + (String)(throwable.getCause() == null ? "" : " cause: " + class07536.L((Throwable)throwable.getCause()));
        String string2 = (class055132.b() ? "" : "(optional) ") + String.valueOf(class055132.y()) + " failed! " + string;
        class04797.N(class055132.M(), class055132.b() ? class06541.field_1061 : class06541.field_1054, string2);
        Throwable throwable2 = (Throwable)MoreObjects.firstNonNull((Object)ExceptionUtils.getRootCause((Throwable)throwable), (Object)throwable);
        if (throwable2 instanceof class05519) {
            class05519 class055192 = (class05519)throwable2;
            class055132.R().N(class055192.u(), class055192.y());
        }
        class04833.N((class05513)class055132);
    }

    protected static void N(class04782 class047822, class06541 class065412, String string) {
        class047822.method_18766(class047702 -> true).forEach(class047702 -> class047702.method_64398((class00392)class00392.y((String)string).N(class065412)));
    }

    private static /* synthetic */ void N(class00392 class003922, class08610 class086102) {
        class086102.N(class003922);
    }

    public void N(class05513 class055132) {
        ++this.N;
    }

    private void N(class05513 class055132, class05520 class055202, boolean bl) {
        class04272 class042722 = class055132.Y();
        Object object = String.format(Locale.ROOT, "[Run: %4d, Ok: %4d, Fail: %4d", this.N, this.y, this.N - this.y);
        if (!class042722.y()) {
            object = (String)object + String.format(Locale.ROOT, ", Left: %4d", class042722.u() - this.N);
        }
        object = (String)object + "]";
        String string = String.valueOf(class055132.y()) + " " + (bl ? "passed" : "failed") + "! " + class055132.E() + "ms";
        String string2 = String.format(Locale.ROOT, "%-53s%s", object, string);
        if (bl) {
            class04797.N(class055132, string2);
        } else {
            class04797.N(class055132.M(), class06541.field_1061, string2);
        }
        if (class042722.N(this.N, this.y)) {
            class055202.N(class055132);
        }
    }

    public void N(class05513 class055132, class05520 class055202) {
        ++this.y;
        if (class055132.Y().L()) {
            this.N(class055132, class055202, true);
            return;
        }
        if (!class055132.d()) {
            class04797.N(class055132, String.valueOf(class055132.y()) + " passed! (" + class055132.E() + "ms / " + class055132.s() + "gameticks)");
            return;
        }
        if (this.y >= class055132.k()) {
            class04797.N(class055132, String.valueOf(class055132) + " passed " + this.y + " times of " + this.N + " attempts.");
        } else {
            class04797.N(class055132.M(), class06541.field_1060, "Flaky test " + String.valueOf(class055132) + " succeeded, attempt: " + this.N + " successes: " + this.y);
            class055202.N(class055132);
        }
    }

    public void N(class05513 class055132, class05513 class055133, class05520 class055202) {
        class055133.N((class05532)this);
    }

    public static void N(class05513 class055132, String string) {
        class04797.y(class055132).ifPresent(class086102 -> class086102.W());
        class04797.y(class055132, string);
    }

    protected static void N(class05513 class055132, Throwable throwable) {
        Object object = throwable instanceof class05511 ? ((class05511)throwable).N() : class00392.y((String)class07536.L((Throwable)throwable));
        class04797.y(class055132).ifPresent(arg_0 -> class04797.N((class00392)object, arg_0));
        class04797.y(class055132, throwable);
    }
}

