/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class07049
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class07049;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public interface class00807 {
    default public boolean method_8649(class07049 class070492) {
        return false;
    }

    default public boolean N(class07209 class072092, boolean bl, @Nullable class07049 class070492) {
        return this.method_30093(class072092, bl, class070492, 512);
    }

    default public boolean N(class07209 class072092, boolean bl) {
        return this.N(class072092, bl, null);
    }

    default public boolean method_8652(class07209 class072092, class00500 class005002, int n) {
        return this.method_30092(class072092, class005002, n, 512);
    }

    public boolean method_30092(class07209 var1, class00500 var2, int var3, int var4);

    public boolean method_8650(class07209 var1, boolean var2);

    public boolean method_30093(class07209 var1, boolean var2, @Nullable class07049 var3, int var4);
}

