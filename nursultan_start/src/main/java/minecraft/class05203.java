/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04927
 *  minecraft.class06839
 */
package minecraft;

import com.mojang.serialization.DataResult;
import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04927;
import minecraft.class05191;
import minecraft.class05222;
import minecraft.class06839;

public class class05203
extends class05222 {
    private final class04927 y;
    final /* synthetic */ class05191 N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class05203(class05191 class051912, class00392 class003922, List list, String string2, class06839 class068392) {
        this.N = class051912;
        super(class051912, list, class003922);
        this.y = new class04927((class01590)class05191.R((class05191)class051912).i_3, 10, 5, 44, 20, (class00392)class003922.L().i("\n").i(string2).i("\n"));
        this.y.method_1852(class051912.y.y(class068392));
        this.y.method_1863(string -> {
            DataResult dataResult = class068392.N(string);
            if (dataResult.isSuccess()) {
                this.y.method_1868(-2039584);
                this.N.y(this);
                this.N.y.N(class068392, (Object)((Integer)dataResult.getOrThrow()), null);
            } else {
                this.y.method_1868(-65536);
                this.N.N(this);
            }
        });
        this.field_25630.add(this.y);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        this.method_29989(class010542, this.method_73382(), this.method_73380());
        this.y.method_46421(this.method_73389() - 45);
        this.y.method_46419(this.method_73382());
        this.y.method_25394(class010542, n, n2, f);
    }
}

