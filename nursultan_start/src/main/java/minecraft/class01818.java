/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import minecraft.class01894;
import minecraft.class06069;
import minecraft.class07209;

public interface class01818 {
    public void N(StringBuilder var1);

    public class06069 N(int var1, int var2, int var3);

    public class06069 N(long var1);

    public class06069 N(String var1);

    default public class06069 N(class01894 class018942) {
        return this.N(class018942.toString());
    }

    default public class06069 N(class07209 class072092) {
        return this.N(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }
}

