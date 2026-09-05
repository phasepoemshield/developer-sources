/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class07267
 *  minecraft.class08394
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.joml.Vector3f
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class03780;
import minecraft.class07267;
import minecraft.class08394;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.joml.Vector3f;

@Environment(value=EnvType.CLIENT)
public class class03777
extends class03780 {
    public static final float N = 4.5f;
    private static final Vector3f y = new Vector3f(1.0f, 1.0f, 1.0f);
    private static final int i = 16;
    private static final int R = 16;
    private final class01894 M;

    public class03777(class07267 class072672, boolean bl, boolean bl2) {
        super(class072672, bl, bl2, (class00392)class00392.L((String)"hanging_sign.edit"));
        String string = "textures/gui/hanging_signs/" + this.u.y() + ".png";
        this.M = this.N(string, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[java.lang.String]");
            return class01894.y((String)((String)objectArray[0]));
        });
    }

    @Override
    protected Vector3f y() {
        return y;
    }

    private class01894 N(String string2, Operation operation) {
        if (this.u.y().indexOf(58) != -1) {
            return class01894.N((String)this.u.y()).N(string -> "textures/gui/hanging_signs/" + string + ".png");
        }
        return (class01894)operation.call(new Object[]{string2});
    }

    @Override
    protected float N() {
        return 125.0f;
    }

    @Override
    protected void N(class01054 class010542) {
        class010542.i().translate(0.0f, -13.0f);
        class010542.i().scale(4.5f, 4.5f);
        class010542.N(class08394.Na, this.M, -8, -8, 0.0f, 0.0f, 16, 16, 16, 16);
    }
}

