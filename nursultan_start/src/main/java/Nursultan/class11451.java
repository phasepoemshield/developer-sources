/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10969
 *  Nursultan.class10972
 *  minecraft.class02777
 */
package Nursultan;

import Nursultan.class10969;
import Nursultan.class10972;
import Nursultan.class11417;
import minecraft.class02777;

public class class11451
extends class11417 {
    public class11451(String string, boolean bl) {
        super(string, bl);
    }

    public void y(Object object) {
        class10972 class109722;
        if (object instanceof class10972 && (class109722 = (class10972)object).L() instanceof class02777) {
            class109722.N();
            return;
        }
        if (object instanceof class10969) {
            class109722 = (class10969)object;
            class109722.N();
        }
    }
}

