/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01164
 *  minecraft.class01190
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06370
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01164;
import minecraft.class01190;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06370;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public interface class03481 {
    default public boolean L() {
        return false;
    }

    default public boolean i() {
        return false;
    }

    default public void u() {
    }

    public class01190 y();

    default public int N(float f) {
        return class04995.y((float)f);
    }

    default public boolean N(class03556<class01194> class035562, class01164 class011642) {
        if (!class035562.N(this.R())) {
            return false;
        }
        class07049 class070492 = class011642.N();
        if (class070492 != null) {
            if (class070492.method_7325()) {
                return false;
            }
            if (class070492.method_21749() && class035562.N(class06370.u)) {
                if (this.L() && class070492 instanceof class04770) {
                    class04770 class047702 = (class04770)class070492;
                    class06912.Nu.N(class047702);
                }
                return false;
            }
            if (class070492.method_33189()) {
                return false;
            }
        }
        if (class011642.y() != null) {
            return !class011642.y().N(class01210.S);
        }
        return true;
    }

    public int N();

    public void N(class04782 var1, class07209 var2, class03556<class01194> var3, @Nullable class07049 var4, @Nullable class07049 var5, float var6);

    public boolean N(class04782 var1, class07209 var2, class03556<class01194> var3, class01164 var4);

    default public class03530<class01194> R() {
        return class06370.N;
    }
}

