/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02680
 *  minecraft.class04206
 *  minecraft.class04782
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07310
 *  minecraft.class07324
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import minecraft.class02680;
import minecraft.class04206;
import minecraft.class04782;
import minecraft.class05645;
import minecraft.class05660;
import minecraft.class05663;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07310;
import minecraft.class07324;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class05637
implements class05663 {
    private final Map<class05946<class05660>, class06581> N;
    private final int y;
    private final int L;
    private final int u;

    public class05637(int n, int n2, int n3, Map<class05946<class05660>, class06581> map) {
        Set var5 = class04206.l.B();
        this.N(var5).filter(class059462 -> !map.containsKey(class059462)).findAny().ifPresent(class059462 -> {
            throw new IllegalStateException("Missing trade for villager type: " + String.valueOf(class059462));
        });
        this.N = map;
        this.y = n;
        this.L = n2;
        this.u = n3;
    }

    private Stream N(Set set) {
        return Stream.empty();
    }

    private Object N(Object object, CallbackInfoReturnable callbackInfoReturnable) {
        if (object == null) {
            callbackInfoReturnable.setReturnValue(null);
        }
        return object;
    }

    @Override
    public @Nullable class07324 N(class04782 class047822, class07049 class070492, class06069 class060692) {
        if (class070492 instanceof class05645) {
            class05946 var5 = ((class05645)class070492).t().N().i().orElse(null);
            if (var5 == null) {
                return null;
            }
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
            if (callbackInfoReturnable.isCancelled()) {
                return (class07324)callbackInfoReturnable.getReturnValue();
            }
            class02680 class026802 = new class02680((class07310)this.N(this.N.get(var5), callbackInfoReturnable), this.y);
            return new class07324(class026802, new class06584((class07310)class06570.Ty), this.L, this.u, 0.05f);
        }
        return null;
    }
}

