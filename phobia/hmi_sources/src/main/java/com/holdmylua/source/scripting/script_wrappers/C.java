/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_4184
 */
package com.holdmylua.source.scripting.script_wrappers;

import com.holdmylua.source.access.CameraAccessor;
import com.holdmylua.source.annotation.Safe;
import net.minecraft.class_310;
import net.minecraft.class_4184;

public class C {
    @Safe
    public void setCamPos(double x, double y, double z) {
        class_4184 class_41842 = class_310.method_1551().field_1773.method_19418();
        if (class_41842 instanceof CameraAccessor) {
            CameraAccessor camera = (CameraAccessor)class_41842;
            camera.hMI5_0$setPosValues((float)x, (float)y, (float)z);
        }
    }

    @Safe
    public void setCamRot(double x, double y, double z) {
        class_4184 class_41842 = class_310.method_1551().field_1773.method_19418();
        if (class_41842 instanceof CameraAccessor) {
            CameraAccessor camera = (CameraAccessor)class_41842;
            camera.hMI5_0$setRotationValues((float)x, (float)y, (float)z);
        }
    }
}

