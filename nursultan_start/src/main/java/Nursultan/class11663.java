/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02255
 *  minecraft.class05018
 *  minecraft.class08238
 *  minecraft.class08523
 *  minecraft.class08859
 *  minecraft.class08861
 *  minecraft.class08893
 *  org.lwjgl.opengl.EXTDebugLabel
 */
package Nursultan;

import java.util.function.Supplier;
import minecraft.class02255;
import minecraft.class05018;
import minecraft.class08238;
import minecraft.class08523;
import minecraft.class08859;
import minecraft.class08861;
import minecraft.class08893;
import org.lwjgl.opengl.EXTDebugLabel;

public class class11663
extends class08859 {
    public boolean y() {
        return true;
    }

    public void N(class08238 class082382) {
        EXTDebugLabel.glLabelObjectEXT((int)35656, (int)class082382.y(), (CharSequence)class05018.N((String)class082382.L(), (int)256, (boolean)true));
    }

    public void N(class08861 class088612) {
        EXTDebugLabel.glLabelObjectEXT((int)32884, (int)class088612.N, (CharSequence)class05018.N((String)class088612.y.toString(), (int)256, (boolean)true));
    }

    public void N(class02255 class022552) {
        EXTDebugLabel.glLabelObjectEXT((int)35648, (int)class022552.method_1270(), (CharSequence)class05018.N((String)class022552.method_68404(), (int)256, (boolean)true));
    }

    public void N(class08523 class085232) {
        Supplier var2 = class085232.L;
        if (var2 != null) {
            EXTDebugLabel.glLabelObjectEXT((int)37201, (int)class085232.u, (CharSequence)class05018.N((String)((String)var2.get()), (int)256, (boolean)true));
        }
    }

    public void N(class08893 class088932) {
        EXTDebugLabel.glLabelObjectEXT((int)5890, (int)class088932.N, (CharSequence)class05018.N((String)class088932.getLabel(), (int)256, (boolean)true));
    }
}

