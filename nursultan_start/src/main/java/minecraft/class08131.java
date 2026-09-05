/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00999
 *  minecraft.class01391
 *  minecraft.class01422
 *  minecraft.class01423
 *  minecraft.class05536
 *  minecraft.class07311
 *  minecraft.class07937
 *  net.irisshaders.iris.mixinterface.ModelStorage
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.util.List;
import java.util.Map;
import minecraft.class00999;
import minecraft.class01391;
import minecraft.class01422;
import minecraft.class01423;
import minecraft.class05536;
import minecraft.class07311;
import minecraft.class07937;
import net.irisshaders.iris.mixinterface.ModelStorage;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08131 {
    private void N(class07937 class079372, class01422 class014222, CallbackInfo callbackInfo) {
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
        CapturedRenderingState.INSTANCE.setCurrentEntity(0);
        CapturedRenderingState.INSTANCE.setCurrentBlockEntity(0);
    }

    private void N(class07937 class079372, class01422 class014222, CallbackInfo callbackInfo, class05536 class055362) {
        ((ModelStorage)class055362).iris$set();
    }

    public void N(class07937 class079372, class01422 class014222) {
        for (Map.Entry<class07311, List<class05536>> entry : class079372.W().N.entrySet()) {
            class01391 class013912 = class014222.method_73477(entry.getKey());
            for (class05536 class055362 : entry.getValue()) {
                class00999 class009992 = class055362.y();
                class01423 class014232 = class055362.N();
                this.N(class079372, class014222, null, class055362);
                class009992.render(class014232, class013912);
            }
        }
        this.N(class079372, class014222, null);
    }
}

