/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AntiAFK
 *  Nursultan.class11512
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11807
 */
package Nursultan;

import Nursultan.AntiAFK;
import Nursultan.class11512;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11683;
import Nursultan.class11688;
import Nursultan.class11691;
import Nursultan.class11705;
import Nursultan.class11722;
import Nursultan.class11787;
import Nursultan.class11798;
import Nursultan.class11801;
import Nursultan.class11807;
import java.util.List;

public class class11672
extends class11807<AntiAFK>
implements class11801<AntiAFK> {
    public Object y_0;
    public Object y_1;
    public Object y_2;

    public class11672(AntiAFK antiAFK, class11688 class116882, class11705 class117052, String string, boolean bl) {
        super((Object)antiAFK, string, bl);
        this.N();
        this.y_1 = class116882;
        this.y_2 = class117052;
    }

    public void y(Object object) {
        this.N();
        ((List)((class11523)this.y_0).i()).forEach(class117872 -> class117872.y(object));
    }

    @Override
    public void N(AntiAFK antiAFK) {
        this.N();
        this.y_0 = (class11523)class11524.y((class11512)((class11512)((class11798)((Object)this)).N_1), (String)"action", (class11535[])new class11787[]{new class11722("jump", false), new class11683("command", true), new class11691("swing", false), (class11688)((Object)this.y_1), (class11705)((Object)this.y_2)}).N(class115362 -> this.U());
    }

    private void N() {
    }
}

