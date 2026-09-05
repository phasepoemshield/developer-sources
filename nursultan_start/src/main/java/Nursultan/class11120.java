/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  minecraft.class06889
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class11126;
import Nursultan.class11499;
import Nursultan.class11505;
import minecraft.class06889;
import minecraft.class07438;

public class class11120
extends class11126 {
    public class11120(String string) {
        super(string, false);
    }

    @Override
    public int compare(class07438 class074382, class07438 class074383) {
        float f = class11505.N((class11499)class11505.L(), (class06889)class074382.method_73189()).M().lengthSquared();
        float f2 = class11505.N((class11499)class11505.L(), (class06889)class074383.method_73189()).M().lengthSquared();
        return Float.compare(f, f2);
    }
}

