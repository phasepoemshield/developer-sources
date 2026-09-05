/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  minecraft.class07209
 *  minecraft.class07321
 */
package minecraft;

import minecraft.class01296;
import minecraft.class07209;
import minecraft.class07321;

public interface class05029 {
    public void y(class07321 var1);

    public void N(class01296 var1, boolean var2);

    public void N(class07321 var1, boolean var2);

    public void N(class07209 var1);

    default public void N(class07209 class072092, boolean bl) {
        this.N(class01296.N((class07209)class072092), bl);
    }

    public int N();

    public boolean au_();
}

