/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06145
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class07299
 *  minecraft.class08038
 */
package Nursultan;

import Nursultan.class11223;
import Nursultan.class11228;
import Nursultan.class11241;
import java.util.List;
import java.util.Optional;
import minecraft.class00734;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06145;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07299;
import minecraft.class08038;

@FunctionalInterface
public interface class11264 {
    public static final class11264 N = null;

    private static /* synthetic */ class11241 N(class11228 class112282, class11241 class112412, class07049 class070492, class06889 class068892, class06889 class068893, List list, int n) {
        Optional<class11223> var8;
        class06889 class068894 = class068892.i(class068893);
        if (class112412 != null && (var8 = class112412.N()).isPresent() && var8.get().y().N() != class07113.field_1333) {
            class068894 = var8.get().N();
        }
        class06202 class062022 = class06202.Nq();
        class06145 class061452 = class08038.N((class07299)((class03448)class062022.T_3), (class07049)((class04453)class062022.T_4), (class06889)class068892, (class06889)class068894, (class00734)new class00734(class068892, class068894).M(1.0), class07049::method_49108, (float)0.0f);
        if (class061452 != null) {
            list.add(class068894);
            return new class11241(list, Optional.of(new class11223(class068894, (class07089)class061452, n, class070492)));
        }
        return class112412;
    }

    public class11241 predict(class11228 var1, class11241 var2, class07049 var3, class06889 var4, class06889 var5, List<class06889> var6, int var7);
}

