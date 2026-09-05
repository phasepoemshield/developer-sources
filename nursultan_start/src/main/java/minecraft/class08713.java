/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00763
 *  minecraft.class00891
 *  minecraft.class04298
 *  minecraft.class04309
 *  minecraft.class04651
 *  minecraft.class07209
 */
package minecraft;

import minecraft.class00763;
import minecraft.class00891;
import minecraft.class04298;
import minecraft.class04309;
import minecraft.class04651;
import minecraft.class07209;

public interface class08713 {
    default public void N(class07209 class072092, class00891 class008912, int n, class00763 class007632) {
        this.method_8397().N(this.N(class072092, (Object)class008912, n, class007632));
    }

    default public void N(class07209 class072092, class00891 class008912, int n) {
        this.method_8397().N(this.N(class072092, (Object)class008912, n));
    }

    default public void N(class07209 class072092, class04651 class046512, int n, class00763 class007632) {
        this.method_8405().N(this.N(class072092, (Object)class046512, n, class007632));
    }

    default public void N(class07209 class072092, class04651 class046512, int n) {
        this.method_8405().N(this.N(class072092, (Object)class046512, n));
    }

    public <T> class04309<T> N(class07209 var1, T var2, int var3, class00763 var4);

    public <T> class04309<T> N(class07209 var1, T var2, int var3);

    public class04298<class00891> method_8397();

    public class04298<class04651> method_8405();
}

