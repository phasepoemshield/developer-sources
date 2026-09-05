/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 */
package minecraft;

import com.mojang.datafixers.types.templates.Hook;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import minecraft.class06689;

class class06690
implements Hook.HookFunction {
    class06690() {
    }

    public <T> T apply(DynamicOps<T> dynamicOps, T t) {
        return class06689.N(new Dynamic(dynamicOps, t), class06689.N, class06689.y);
    }
}

