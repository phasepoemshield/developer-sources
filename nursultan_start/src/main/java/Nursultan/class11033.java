/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.EntityESP
 *  Nursultan.class09093
 *  Nursultan.class11791
 *  minecraft.class01054
 *  minecraft.class07049
 *  minecraft.class07079
 *  org.joml.Vector4f
 */
package Nursultan;

import Nursultan.EntityESP;
import Nursultan.class09093;
import Nursultan.class11045;
import Nursultan.class11791;
import minecraft.class01054;
import minecraft.class07049;
import minecraft.class07079;
import org.joml.Vector4f;

public class class11033
extends class11045<class07079> {
    public class11033(EntityESP entityESP, String string, boolean bl) {
        super(entityESP, string, bl);
    }

    @Override
    public boolean test(class07049 class070492) {
        return class11791.L().and(class11791.N()).test(class070492);
    }

    @Override
    public void N(class01054 class010542, class09093 class090932, Vector4f vector4f, class07079 class070792) {
        super.N(class010542, class090932, vector4f, class070792);
        if (class070792.method_16914()) {
            vector4f.y = Math.round(vector4f.y - 4.0f);
            this.N(class010542, class090932, vector4f, class070792, class070792.method_5797().L(), this.y(class070792), this.u(class070792));
        }
    }
}

