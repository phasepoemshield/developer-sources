/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00558
 *  minecraft.class00753
 *  minecraft.class00763
 *  minecraft.class00891
 *  minecraft.class01011
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class02796
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04309
 *  minecraft.class04376
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class05087
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07086
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00558;
import minecraft.class00753;
import minecraft.class00763;
import minecraft.class00891;
import minecraft.class01011;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class02796;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04309;
import minecraft.class04376;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class05087;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07086;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public interface class07284
extends class01011,
class05487,
class08713 {
    public void method_32888(class03556<class01194> var1, class06889 var2, class01164 var3);

    public @Nullable class02796 method_8503();

    public void method_8406(class07126 var1, double var2, double var4, double var6, double var8, double var10, double var12);

    default public class07086 y() {
        return this.method_8401().s();
    }

    default public void N(@Nullable class07049 class070492, class03556<class01194> class035562, class07209 class072092) {
        this.N(class035562, class072092, new class01164(class070492, null));
    }

    default public void N(class03556<class01194> class035562, class07209 class072092, class01164 class011642) {
        this.method_32888(class035562, class06889.y((class00753)class072092), class011642);
    }

    default public void N(@Nullable class07049 class070492, class07209 class072092, class04891 class048912, class04911 class049112) {
        this.method_8396(class070492, class072092, class048912, class049112, 1.0f, 1.0f);
    }

    default public void N(int n, class07209 class072092, int n2) {
        this.method_8444(null, n, class072092, n2);
    }

    default public void N(@Nullable class07049 class070492, class03556<class01194> class035562, class06889 class068892) {
        this.method_32888(class035562, class068892, new class01164(class070492, null));
    }

    default public long N() {
        return this.method_8401().y();
    }

    default public void N(class05946<class01194> class059462, class07209 class072092, class01164 class011642) {
        this.N((class03556<class01194>)this.method_30349().L(class04227.c).y(class059462), class072092, class011642);
    }

    default public <T> class04309<T> N(class07209 class072092, T t, int n) {
        return new class04309(t, class072092, this.N() + (long)n, this.method_39224());
    }

    default public <T> class04309<T> N(class07209 class072092, T t, int n, class00763 class007632) {
        return new class04309(t, class072092, this.N() + (long)n, class007632, this.method_39224());
    }

    default public boolean N(int n, int n2) {
        return this.method_8398().L(n, n2);
    }

    default public void method_8408(class07209 class072092, class00891 class008912) {
    }

    public void method_8444(@Nullable class07049 var1, int var2, class07209 var3, int var4);

    public class05087 method_8401();

    public class00558 method_8398();

    public void method_8396(@Nullable class07049 var1, class07209 var2, class04891 var3, class04911 var4, float var5, float var6);

    default public void method_42308(class07211 class072112, class07209 class072092, class07209 class072093, class00500 class005002, int n, int n2) {
        class04376.N((class07284)this, (class07211)class072112, (class07209)class072092, (class07209)class072093, (class00500)class005002, (int)n, (int)(n2 - 1));
    }

    public long method_39224();

    public class06069 method_8409();
}

