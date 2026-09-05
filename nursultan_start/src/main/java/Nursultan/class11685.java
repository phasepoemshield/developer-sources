/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11328
 *  Nursultan.class11894
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class03448
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class07001
 *  minecraft.class07709
 *  minecraft.class07741
 */
package Nursultan;

import Nursultan.class11328;
import Nursultan.class11894;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class07001;
import minecraft.class07709;
import minecraft.class07741;

public class class11685 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    public class11328 L() {
        return (class11328)this.N_0;
    }

    public class11685(class11328 class113282, class06584 class065842) {
        this.R();
        this.N_0 = class113282;
        this.N_1 = class065842;
    }

    private static class07709 y(class06584 class065842) {
        if (class065842.R() || (class03448)class06202.Nq().T_3 == null) {
            return null;
        }
        return class06584.L.encodeStart((DynamicOps)class11894.N(), (Object)class065842).result().orElse(null);
    }

    private static boolean y(class07709 class077092, class06584 class065842) {
        if (class077092 == null || class065842.R()) {
            return false;
        }
        return class11685.N(class077092, class11685.y(class065842));
    }

    public class06584 y() {
        return (class06584)this.N_1;
    }

    public class11685 N(boolean bl) {
        this.N_2 = bl;
        return this;
    }

    private static boolean N(class07709 class077092, class07709 class077093) {
        class07001 class070012;
        if (class077092 instanceof class07001) {
            class070012 = (class07001)class077092;
            if (class077093 instanceof class07001) {
                class07001 class070013 = (class07001)class077093;
                if (!class070012.i().equals(class070013.i())) {
                    return false;
                }
                for (String string : class070012.i()) {
                    if (class11685.N(class070012.N(string), class070013.N(string))) continue;
                    return false;
                }
                return true;
            }
        }
        if (class077092 instanceof class07741) {
            class070012 = (class07741)class077092;
            if (class077093 instanceof class07741) {
                class07741 class077412 = (class07741)class077093;
                if (class070012.size() != class077412.size()) {
                    return false;
                }
                ArrayList arrayList = new ArrayList(class077412);
                for (class07709 class077094 : class070012) {
                    int n = -1;
                    for (int i = 0; i < arrayList.size(); ++i) {
                        if (!class11685.N(class077094, (class07709)arrayList.get(i))) continue;
                        n = i;
                        break;
                    }
                    if (n == -1) {
                        return false;
                    }
                    arrayList.remove(n);
                }
                return true;
            }
        }
        return class077092 != null && class077092.equals((Object)class077093);
    }

    public static class11685 N(class06584 class065843) {
        class065843 = class065843.t();
        class07709 class077092 = class11685.y(class065843);
        return new class11685(class065842 -> class11685.y(class077092, class065842), class065843);
    }

    public boolean N() {
        return (Boolean)this.N_2;
    }

    private void R() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = false;
        }
    }
}

