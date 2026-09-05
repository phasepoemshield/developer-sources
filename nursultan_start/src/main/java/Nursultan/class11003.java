/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Scaffold
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11908
 *  minecraft.class06889
 */
package Nursultan;

import Nursultan.Scaffold;
import Nursultan.class11019;
import Nursultan.class11053;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11908;
import minecraft.class06889;

public class class11003
extends class11053 {
    public class11003(Scaffold scaffold, String string, boolean bl) {
        super(scaffold, string, bl);
    }

    @Override
    public class11499 N(class11019 class110192, class06889 class068892, class11499 class114992) {
        float f = Math.clamp((float)class114992.y(), (float)-45.0f, (float)45.0f);
        float f2 = Math.clamp((float)class114992.R(), (float)-45.0f, (float)45.0f);
        class11499 class114993 = class11505.N().N(f, f2);
        class114993 = class114993.N(class11908.y((float)2.0f), class11908.y((float)1.0f));
        return class114993.N(true);
    }
}

