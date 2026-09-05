/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10990
 *  Nursultan.class10996
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11369
 *  Nursultan.class11403
 *  Nursultan.class11428
 *  Nursultan.class11431
 *  Nursultan.class11446
 *  Nursultan.class11512
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  Nursultan.class11807
 *  Nursultan.class11901
 */
package Nursultan;

import Nursultan.class10990;
import Nursultan.class10996;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11369;
import Nursultan.class11403;
import Nursultan.class11428;
import Nursultan.class11431;
import Nursultan.class11446;
import Nursultan.class11512;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11782;
import Nursultan.class11807;
import Nursultan.class11901;
import java.util.List;

@class11080(L="Notifications", y=class11072.VISUAL, N=class11106.INTERFACE)
public class Notifications
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;

    public Notifications() {
        this.s();
        this.L_0 = new class11446(this, "module-toggle", true);
        this.L_1 = new class11428(this, "armor-durability", false);
        this.L_2 = new class11431(this, "irc-ping", false);
        this.L_3 = class11524.y((class11512)this, (String)"notifications", (class11535[])new class11807[]{(class11807)this.L_0, (class11807)this.L_1, (class11807)this.L_2});
    }

    private void s() {
    }

    @class11782
    public void N(class10996 class109962) {
        this.s();
        ((List)((class11523)this.L_3).i()).forEach(class118072 -> class118072.y((Object)class109962));
    }

    @class11782
    public void N(class11369 class113692) {
        this.s();
        if (class113692.N() != (class11901)class11901.staticFields_0ec612a2dc0263a258b66e8d510834aaf[2]) {
            return;
        }
        ((List)((class11523)this.L_3).i()).forEach(class118072 -> class118072.y((Object)class113692));
    }

    @class11782
    public void N(class10990 class109902) {
        this.s();
        ((List)((class11523)this.L_3).i()).forEach(class118072 -> class118072.y((Object)class109902));
    }

    @class11782
    public void N(class11403 class114032) {
        this.s();
        ((List)((class11523)this.L_3).i()).forEach(class118072 -> class118072.y((Object)class114032));
    }
}

