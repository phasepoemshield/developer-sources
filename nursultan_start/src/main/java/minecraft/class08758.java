/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00381
 *  minecraft.class00642
 *  minecraft.class01929
 *  minecraft.class02796
 *  minecraft.class03713
 *  minecraft.class04159
 *  minecraft.class04188
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04770
 *  minecraft.class04773
 *  minecraft.class04782
 *  minecraft.class05042
 *  minecraft.class05960
 *  minecraft.class07001
 *  minecraft.class07109
 *  minecraft.class07209
 *  minecraft.class08299
 *  minecraft.class08308
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.lang.runtime.SwitchBootstraps;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import minecraft.class00381;
import minecraft.class00642;
import minecraft.class01929;
import minecraft.class02796;
import minecraft.class03713;
import minecraft.class04159;
import minecraft.class04188;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04770;
import minecraft.class04773;
import minecraft.class04782;
import minecraft.class05042;
import minecraft.class05960;
import minecraft.class07001;
import minecraft.class07109;
import minecraft.class07209;
import minecraft.class08299;
import minecraft.class08308;
import minecraft.class08733;
import minecraft.class08738;
import minecraft.class08772;
import minecraft.class08773;
import minecraft.class08774;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class08758
implements class04188 {
    static final Logger N = LogUtils.getLogger();
    public static final class04159 y = new class04159("prepare_spawn");
    public static final int L = 3;
    final class02796 u;
    final class08774 i;
    final class08773 R;
    private @Nullable class08733 M;

    public void L() {
        class08733 class087332 = this.M;
        if (class087332 instanceof class08772) {
            ((class08772)class087332).N();
        }
        this.M = null;
    }

    public class08758(class02796 class027962, class08774 class087742) {
        this.u = class027962;
        this.i = class087742;
        this.R = class027962.yI();
    }

    public void y() {
        class08733 class087332 = this.M;
        if (class087332 instanceof class08738) {
            ((class08738)class087332).N();
        }
    }

    public class04770 N(class00642 class006422, class03713 class037132) {
        class08733 class087332 = this.M;
        if (class087332 instanceof class08738) {
            return ((class08738)class087332).N(class006422, class037132);
        }
        throw new IllegalStateException("Player spawn was not ready");
    }

    public boolean N() {
        class08733 class087332 = this.M;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class08772.class, class08738.class}, (Object)class087332, (int)n)) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                class08738 var4_3 = ((class08772)class087332).y();
                if (var4_3 != null) {
                    this.M = var4_3;
                    yield true;
                }
                yield false;
            }
            case 1 -> {
                class08738 var4_4 = (class08738)class087332;
                yield true;
            }
            case -1 -> false;
        };
    }

    public class04159 method_52375() {
        return y;
    }

    public void method_52376(Consumer<class00381<?>> consumer) {
        try (class04495 class044952 = new class04495(N);){
            Optional<class08299> optional = this.u.Nm().L(this.i).map(class070012 -> class08308.N((class04490)class044952, (class01929)this.u.yt(), (class07001)class070012));
            class04773 class047732 = optional.flatMap(class082992 -> class082992.N(class04773.N)).orElse(class04773.y);
            class05042 class050422 = this.u.yn().o().N();
            class04782 class047822 = class047732.N().map(arg_0 -> ((class02796)this.u).N(arg_0)).orElseGet(() -> {
                class04782 class047822 = this.u.N(class050422.N());
                return class047822 != null ? class047822 : this.u.NY();
            });
            CompletableFuture completableFuture = class047732.y().map(CompletableFuture::completedFuture).orElseGet(() -> class05960.N((class04782)class047822, (class07209)class050422.y()));
            class07109 class071092 = class047732.L().orElse(new class07109(class050422.u(), class050422.i()));
            this.M = new class08772(this, class047822, completableFuture, class071092);
        }
    }
}

