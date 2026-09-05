/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10958
 *  Nursultan.class10963
 *  Nursultan.class10990
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11512
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11546
 *  Nursultan.class11582
 *  Nursultan.class11782
 */
package Nursultan;

import Nursultan.class10958;
import Nursultan.class10963;
import Nursultan.class10990;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11512;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11546;
import Nursultan.class11582;
import Nursultan.class11782;
import java.util.List;

@class11080(L="ChatHelper", y=class11072.MISC, N=class11106.HELPER)
public class ChatHelper
extends class11067 {
    public Object L_0;
    public Object L_1;

    public ChatHelper() {
        this.s();
        this.L_0 = new class11582(this, "better-commands", true);
        this.L_1 = class11524.y((class11512)this, (String)"chat-addons", (class11535[])new class11546[]{(class11546)this.L_0});
    }

    private void s() {
    }

    @class11782
    public void N(class10963 class109632) {
        this.s();
        ((List)((class11523)this.L_1).i()).forEach(class115462 -> class115462.y((Object)class109632));
    }

    @class11782
    public void N(class10958 class109582) {
        this.s();
        ((List)((class11523)this.L_1).i()).forEach(class115462 -> class115462.y((Object)class109582));
    }

    @class11782
    public void N(class10990 class109902) {
        this.s();
        ((List)((class11523)this.L_1).i()).forEach(class115462 -> class115462.y((Object)class109902));
    }
}

