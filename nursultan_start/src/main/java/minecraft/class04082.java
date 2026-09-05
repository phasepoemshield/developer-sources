/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class05543
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class04089;
import minecraft.class04099;
import minecraft.class05543;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import org.jspecify.annotations.Nullable;

public class class04082
implements class04099 {
    protected class05543 N;

    public class04082(class05543 class055432) {
        this.N = class055432;
    }

    @Override
    public boolean N(class07290 class072902, class07209 class072092, class04089 class040892) {
        class00500 class005002 = class072902.method_8320(class040892.N());
        return this.N(class072902, class072092, class040892.N(), class040892.y(), class005002) && this.N.N(class072902, class005002, class040892.N(), class040892.y());
    }

    protected boolean N(class07290 class072902, class07209 class072092, class07209 class072093, class07211 class072112, class00500 class005002) {
        return class005002.P() || class005002.N((class00891)this.N) || class005002.N(class00869.K) && class005002.Y().u();
    }

    @Override
    public @Nullable class00500 N(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return this.N.y(class005002, class072902, class072092, class072112);
    }
}

