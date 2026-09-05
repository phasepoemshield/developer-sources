/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01407
 *  minecraft.class01422
 *  minecraft.class01590
 *  minecraft.class06202
 *  minecraft.class07937
 *  net.irisshaders.iris.mixinterface.ModelStorage
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  net.irisshaders.iris.vertices.ImmediateState
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import minecraft.class01407;
import minecraft.class01422;
import minecraft.class01590;
import minecraft.class06202;
import minecraft.class07937;
import minecraft.class08113;
import net.irisshaders.iris.mixinterface.ModelStorage;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08105 {
    private boolean N = false;

    private void N(class07937 class079372, class01422 class014222, CallbackInfo callbackInfo) {
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
        CapturedRenderingState.INSTANCE.setCurrentEntity(0);
        CapturedRenderingState.INSTANCE.setCurrentBlockEntity(0);
        this.N = false;
        ImmediateState.isRenderingBEs = false;
    }

    private void N(class07937 class079372, class01422 class014222, CallbackInfo callbackInfo, class08113 class081132) {
        ((ModelStorage)class081132).iris$set();
        if (((ModelStorage)class081132).iris$wasBE()) {
            this.N = true;
            ImmediateState.isRenderingBEs = true;
        } else if (this.N) {
            this.N = false;
            ImmediateState.isRenderingBEs = false;
        }
    }

    public void N(class07937 class079372, class01422 class014222) {
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        for (class08113 class081132 : class079372.u()) {
            this.N(class079372, class014222, null, class081132);
            if (class081132.z() == 0) {
                class015902.N(class081132.u(), class081132.y(), class081132.L(), class081132.B(), class081132.i(), class081132.N(), (class01407)class014222, class081132.R(), class081132.Z(), class081132.M());
                continue;
            }
            class015902.N(class081132.u(), class081132.y(), class081132.L(), class081132.B(), class081132.z(), class081132.N(), (class01407)class014222, class081132.M());
        }
        this.N(class079372, class014222, null);
    }
}

