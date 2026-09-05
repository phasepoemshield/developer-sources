/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09319
 *  Nursultan.class09348
 *  Nursultan.class10897
 *  Nursultan.class10932
 *  Nursultan.class10990
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11782
 */
package Nursultan;

import Nursultan.class09319;
import Nursultan.class09348;
import Nursultan.class10897;
import Nursultan.class10932;
import Nursultan.class10990;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11782;

@class11080(L="NoPush", y=class11072.MOVEMENT, N=class11106.TOOLS)
public class NoPush
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;

    public NoPush() {
        this.b();
        this.L_0 = new class10932("entity-push", true);
        this.L_1 = new class10932("block-push", true);
        this.L_2 = new class10897("fishing-rod", true);
        this.L_3 = class11524.y((class11512)this, (String)"apply-to", (class11535[])new class10932[]{(class10932)this.L_0, (class10932)this.L_1, (class10897)this.L_2});
    }

    private void b() {
    }

    @class11782
    public void N(class09319 class093192) {
        this.b();
        ((class10932)this.L_1).y((Object)class093192);
    }

    @class11782
    public void N(class09348 class093482) {
        this.b();
        ((class10932)this.L_0).y((Object)class093482);
    }

    @class11782
    public void N(class10990 class109902) {
        this.b();
        ((class10897)this.L_2).y((Object)class109902);
    }
}

