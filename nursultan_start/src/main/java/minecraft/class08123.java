/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01384
 *  minecraft.class01391
 *  minecraft.class01407
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class01423
 *  minecraft.class01434
 *  minecraft.class01999
 *  minecraft.class02020
 *  minecraft.class05885
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class07937
 *  minecraft.class07942
 *  minecraft.class08887
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider
 *  net.fabricmc.fabric.api.renderer.v1.render.FabricBlockModelRenderer
 *  net.fabricmc.fabric.api.renderer.v1.render.RenderLayerHelper
 *  net.fabricmc.fabric.impl.renderer.BatchingRenderCommandQueueExtension
 *  net.fabricmc.fabric.impl.renderer.DelegatingBlockVertexConsumerProviderImpl
 *  net.fabricmc.fabric.impl.renderer.ExtendedBlockCommand
 *  org.joml.Matrix4fc
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.util.Iterator;
import java.util.List;
import minecraft.class00500;
import minecraft.class01384;
import minecraft.class01391;
import minecraft.class01407;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class01423;
import minecraft.class01434;
import minecraft.class01999;
import minecraft.class02020;
import minecraft.class05885;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class07937;
import minecraft.class07942;
import minecraft.class08121;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider;
import net.fabricmc.fabric.api.renderer.v1.render.FabricBlockModelRenderer;
import net.fabricmc.fabric.api.renderer.v1.render.RenderLayerHelper;
import net.fabricmc.fabric.impl.renderer.BatchingRenderCommandQueueExtension;
import net.fabricmc.fabric.impl.renderer.DelegatingBlockVertexConsumerProviderImpl;
import net.fabricmc.fabric.impl.renderer.ExtendedBlockCommand;
import org.joml.Matrix4fc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class08123 {
    private final class01421 N = new class01421();

    private void N(class07937 class079372, class01422 class014222, class01999 class019992, class01434 class014342, CallbackInfo callbackInfo) {
        DelegatingBlockVertexConsumerProviderImpl delegatingBlockVertexConsumerProviderImpl = new DelegatingBlockVertexConsumerProviderImpl();
        for (ExtendedBlockCommand extendedBlockCommand : ((BatchingRenderCommandQueueExtension)class079372).fabric_getExtendedBlockCommands()) {
            this.N.N();
            this.N.L().N(extendedBlockCommand.matricesEntry());
            class019992.renderBlockAsEntity(extendedBlockCommand.state(), this.N, (class01407)class014222, extendedBlockCommand.lightCoords(), extendedBlockCommand.overlayCoords(), extendedBlockCommand.blockView(), extendedBlockCommand.pos());
            if (extendedBlockCommand.outlineColor() != 0) {
                class014342.N(extendedBlockCommand.outlineColor());
                class019992.renderBlockAsEntity(extendedBlockCommand.state(), this.N, (class01407)class014342, extendedBlockCommand.lightCoords(), extendedBlockCommand.overlayCoords(), extendedBlockCommand.blockView(), extendedBlockCommand.pos());
            }
            this.N.y();
        }
        for (ExtendedBlockCommand extendedBlockCommand : ((BatchingRenderCommandQueueExtension)class079372).fabric_getExtendedBlockStateModelCommands()) {
            delegatingBlockVertexConsumerProviderImpl.renderLayerFunction = extendedBlockCommand.renderLayerFunction();
            delegatingBlockVertexConsumerProviderImpl.vertexConsumerProvider = class014222;
            FabricBlockModelRenderer.render((class01423)extendedBlockCommand.matricesEntry(), (BlockVertexConsumerProvider)delegatingBlockVertexConsumerProviderImpl, (class08887)extendedBlockCommand.model(), (float)extendedBlockCommand.r(), (float)extendedBlockCommand.g(), (float)extendedBlockCommand.b(), (int)extendedBlockCommand.lightCoords(), (int)extendedBlockCommand.overlayCoords(), (class07295)extendedBlockCommand.blockView(), (class07209)extendedBlockCommand.pos(), (class00500)extendedBlockCommand.state());
            if (extendedBlockCommand.outlineColor() == 0) continue;
            class014342.N(extendedBlockCommand.outlineColor());
            delegatingBlockVertexConsumerProviderImpl.vertexConsumerProvider = class014342;
            FabricBlockModelRenderer.render((class01423)extendedBlockCommand.matricesEntry(), (BlockVertexConsumerProvider)delegatingBlockVertexConsumerProviderImpl, (class08887)extendedBlockCommand.model(), (float)extendedBlockCommand.r(), (float)extendedBlockCommand.g(), (float)extendedBlockCommand.b(), (int)extendedBlockCommand.lightCoords(), (int)extendedBlockCommand.overlayCoords(), (class07295)extendedBlockCommand.blockView(), (class07209)extendedBlockCommand.pos(), (class00500)extendedBlockCommand.state());
        }
    }

    private void N(class07937 class079372, class01422 class014222, class01999 class019992, class01434 class014342, CallbackInfo callbackInfo, Iterator iterator) {
        while (iterator.hasNext()) {
            class08121 class081212 = (class08121)((Object)iterator.next());
            class07942 class079422 = class081212.y();
            class00500 class005002 = class079422.L;
            class08887 class088872 = class019992.N(class005002);
            long l = class005002.y(class079422.N);
            this.N.N();
            this.N.N((Matrix4fc)class081212.N());
            class019992.y().render((class07295)class079422, class088872, class005002, class079422.y, this.N, RenderLayerHelper.movingDelegate((class01407)class014222), false, l, class01384.u);
            this.N.y();
        }
    }

    public void N(class07937 class079372, class01422 class014222, class01999 class019992, class01434 class014342) {
        Iterator iterator = class079372.M().iterator();
        while (true) {
            this.N(class079372, class014222, class019992, class014342, null, iterator);
            if (!iterator.hasNext()) break;
            class08121 class081212 = (class08121)((Object)iterator.next());
            class07942 class079422 = class081212.y();
            class00500 class005002 = class079422.L;
            List var9 = class019992.N(class005002).method_68512(class06069.y((long)class005002.y(class079422.N)));
            class01421 class014212 = new class01421();
            class014212.N((Matrix4fc)class081212.N());
            class019992.y().N((class07295)class079422, var9, class005002, class079422.y, class014212, class014222.method_73477(class05885.y((class00500)class005002)), false, class01384.u);
        }
        for (class08121 class081212 : class079372.R()) {
            this.N.N();
            this.N.L().N(class081212.N());
            class019992.N(class081212.y(), this.N, (class01407)class014222, class081212.L(), class081212.u());
            if (class081212.i() != 0) {
                class014342.N(class081212.i());
                class019992.N(class081212.y(), this.N, (class01407)class014342, class081212.L(), class081212.u());
            }
            this.N.y();
        }
        for (class08121 class081212 : class079372.B()) {
            class02020.N((class01423)class081212.N(), (class01391)class014222.method_73477(class081212.y()), (class08887)class081212.L(), (float)class081212.u(), (float)class081212.i(), (float)class081212.R(), (int)class081212.M(), (int)class081212.B());
            if (class081212.Z() == 0) continue;
            class014342.N(class081212.Z());
            class02020.N((class01423)class081212.N(), (class01391)class014342.method_73477(class081212.y()), (class08887)class081212.L(), (float)class081212.u(), (float)class081212.i(), (float)class081212.R(), (int)class081212.M(), (int)class081212.B());
        }
        this.N(class079372, class014222, class019992, class014342, null);
    }
}

