/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11142
 *  Nursultan.class11389
 *  Nursultan.class11400
 *  Nursultan.class11552
 *  Nursultan.class11554
 *  Nursultan.class11591
 *  Nursultan.class11782
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11142;
import Nursultan.class11389;
import Nursultan.class11400;
import Nursultan.class11552;
import Nursultan.class11554;
import Nursultan.class11591;
import Nursultan.class11782;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@class11080(L="ClickAction", y=class11072.MISC, N=class11106.BASE)
public class ClickAction
extends class11067 {
    public Object L_0;

    public ClickAction() {
        this.s();
        this.L_0 = new ArrayList();
        this.N((class11142)new class11554(this));
        this.N((class11142)new class11591(this));
        this.N((class11142)new class11552(this));
    }

    private void s() {
    }

    private void N(class11142 class111422) {
        this.s();
        ((List)this.L_0).add(class111422);
    }

    @class11782(u=true)
    public void N(class11400 class114002) {
        this.s();
        Iterator iterator = ((List)this.L_0).iterator();
        while (iterator.hasNext()) {
            ((class11142)iterator.next()).N((class11389)class114002);
        }
    }
}

