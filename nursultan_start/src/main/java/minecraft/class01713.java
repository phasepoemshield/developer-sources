/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00743
 *  minecraft.class02903
 *  minecraft.class02950
 *  minecraft.class03729
 *  minecraft.class04782
 *  minecraft.class05838
 *  minecraft.class05857
 *  minecraft.class06482
 *  minecraft.class06584
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import minecraft.class00743;
import minecraft.class01740;
import minecraft.class02903;
import minecraft.class02950;
import minecraft.class03729;
import minecraft.class04782;
import minecraft.class05838;
import minecraft.class05857;
import minecraft.class06482;
import minecraft.class06584;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class01713 {
    private final @Nullable class01740[] N;
    private WeakReference<@Nullable class06482> y = new WeakReference<Object>(null);

    public class01713(int n) {
        this.N = new class01740[n];
    }

    private Optional<class03729<class05857>> N(class02903 class029032, class04782 class047822) {
        Optional var3 = class047822.method_64577().N(class05838.N, (class02950)class029032, (class07299)class047822);
        this.N(class029032, (class03729<class05857>)((class03729)var3.orElse(null)));
        return var3;
    }

    private void N(int n) {
        if (n > 0) {
            class01740 class017402 = this.N[n];
            System.arraycopy(this.N, 0, this.N, 1, n);
            this.N[0] = class017402;
        }
    }

    private void N(class02903 class029032, @Nullable class03729<class05857> class037292) {
        class00743 class007432 = class00743.method_10213((int)class029032.N(), (Object)class06584.E);
        for (int i = 0; i < class029032.N(); ++i) {
            class007432.set(i, (Object)class029032.N(i).L(1));
        }
        System.arraycopy(this.N, 0, this.N, 1, this.N.length - 1);
        this.N[0] = new class01740((class00743<class06584>)class007432, class029032.R(), class029032.M(), class037292);
    }

    private void N(class04782 class047822) {
        class06482 class064822 = class047822.method_64577();
        if (class064822 != this.y.get()) {
            this.y = new WeakReference<class06482>(class064822);
            Arrays.fill((Object[])this.N, null);
        }
    }

    public Optional<class03729<class05857>> N(class04782 class047822, class02903 class029032) {
        if (class029032.y()) {
            return Optional.empty();
        }
        this.N(class047822);
        for (int i = 0; i < this.N.length; ++i) {
            class01740 class017402 = this.N[i];
            if (class017402 == null || !class017402.N(class029032)) continue;
            this.N(i);
            return Optional.ofNullable(class017402.u());
        }
        return this.N(class029032, class047822);
    }
}

