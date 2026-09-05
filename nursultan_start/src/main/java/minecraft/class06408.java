/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01711
 *  minecraft.class01724
 *  minecraft.class01747
 *  minecraft.class01752
 *  minecraft.class03099
 *  minecraft.class03102
 *  minecraft.class07684
 *  minecraft.class07701
 */
package minecraft;

import java.io.PrintWriter;
import minecraft.class01711;
import minecraft.class01724;
import minecraft.class01747;
import minecraft.class01752;
import minecraft.class03099;
import minecraft.class03102;
import minecraft.class06388;
import minecraft.class07684;
import minecraft.class07701;

class class06408
extends class01724<class07701> {
    final /* synthetic */ PrintWriter N;
    final /* synthetic */ class07684 y;

    class06408(class06388 class063882, class01747 class017472, class03102 class031022, boolean bl, PrintWriter printWriter, class07684 class076842) {
        this.N = printWriter;
        this.y = class076842;
        super(class017472, class031022, bl);
    }

    public void N(class07701 class077012, class01752<class07701> class017522, class03099 class030992) {
        this.N.println(this.y.N());
        super.N((class01711)class077012, class017522, class030992);
    }
}

