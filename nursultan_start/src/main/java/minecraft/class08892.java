/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02255
 *  minecraft.class05018
 *  minecraft.class08238
 *  minecraft.class08523
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.KHRDebug
 */
package minecraft;

import java.util.function.Supplier;
import minecraft.class02255;
import minecraft.class05018;
import minecraft.class08238;
import minecraft.class08523;
import minecraft.class08859;
import minecraft.class08861;
import minecraft.class08893;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.KHRDebug;

class class08892
extends class08859 {
    private final int N = GL11.glGetInteger((int)33512);

    class08892() {
    }

    @Override
    public boolean y() {
        return true;
    }

    @Override
    public void N(class08861 class088612) {
        KHRDebug.glObjectLabel((int)32884, (int)class088612.N, (CharSequence)class05018.N((String)class088612.y.toString(), (int)this.N, (boolean)true));
    }

    @Override
    public void N(Supplier<String> supplier) {
        KHRDebug.glPushDebugGroup((int)33354, (int)0, (CharSequence)supplier.get());
    }

    @Override
    public void N() {
        KHRDebug.glPopDebugGroup();
    }

    @Override
    public void N(class02255 class022552) {
        KHRDebug.glObjectLabel((int)33506, (int)class022552.method_1270(), (CharSequence)class05018.N((String)class022552.method_68404(), (int)this.N, (boolean)true));
    }

    @Override
    public void N(class08523 class085232) {
        Supplier var2 = class085232.L;
        if (var2 != null) {
            KHRDebug.glObjectLabel((int)33504, (int)class085232.u, (CharSequence)class05018.N((String)((String)var2.get()), (int)this.N, (boolean)true));
        }
    }

    @Override
    public void N(class08238 class082382) {
        KHRDebug.glObjectLabel((int)33505, (int)class082382.y(), (CharSequence)class05018.N((String)class082382.L(), (int)this.N, (boolean)true));
    }

    @Override
    public void N(class08893 class088932) {
        KHRDebug.glObjectLabel((int)5890, (int)class088932.N, (CharSequence)class05018.N((String)class088932.getLabel(), (int)this.N, (boolean)true));
    }
}

