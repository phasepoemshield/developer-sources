/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11817
 *  Nursultan.class11907
 *  minecraft.class02834
 *  minecraft.class07049
 *  minecraft.class07085
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class11817;
import Nursultan.class11907;
import minecraft.class02834;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07438;

public class class11785
extends class11817 {
    public class11785(String string, boolean bl) {
        super(string, bl);
    }

    public boolean test(class07049 class070492) {
        if (this.U()) {
            return true;
        }
        if (!class070492.method_5767()) {
            return true;
        }
        if (class070492 instanceof class07438) {
            class07438 class074382 = (class07438)class070492;
            return !class11907.N((class07438)class074382) || this.N(class074382);
        }
        return false;
    }

    public boolean N(class07438 class074382) {
        for (class07085 class070852 : class02834.field_49219) {
            if (class074382.method_6118(class070852).R()) continue;
            return true;
        }
        return false;
    }
}

