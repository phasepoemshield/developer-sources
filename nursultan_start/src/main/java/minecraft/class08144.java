/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01407
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class01434
 *  minecraft.class02862
 *  minecraft.class03662
 *  minecraft.class07311
 *  minecraft.class07937
 *  minecraft.class08915
 *  net.caffeinemc.mods.sodium.client.render.frapi.render.ItemRenderContext
 *  net.caffeinemc.mods.sodium.client.render.frapi.render.MeshItemCommand
 *  net.caffeinemc.mods.sodium.client.render.frapi.render.SubmitNodeCollectionExtension
 *  net.irisshaders.iris.mixinterface.ModelStorage
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import minecraft.class01407;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class01434;
import minecraft.class02862;
import minecraft.class03662;
import minecraft.class07311;
import minecraft.class07937;
import minecraft.class08109;
import minecraft.class08915;
import net.caffeinemc.mods.sodium.client.render.frapi.render.ItemRenderContext;
import net.caffeinemc.mods.sodium.client.render.frapi.render.MeshItemCommand;
import net.caffeinemc.mods.sodium.client.render.frapi.render.SubmitNodeCollectionExtension;
import net.irisshaders.iris.mixinterface.ModelStorage;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08144 {
    private final class01421 N;
    private final ItemRenderContext y = new ItemRenderContext();

    public class08144() {
        this.N = new class01421();
    }

    private void y(class07937 class079372, class01422 class014222, class01434 class014342, CallbackInfo callbackInfo) {
        for (MeshItemCommand meshItemCommand : ((SubmitNodeCollectionExtension)class079372).sodium_getMeshItemCommands()) {
            this.N.N();
            this.N.L().N(meshItemCommand.positionMatrix());
            this.y.renderItem(meshItemCommand.displayContext(), this.N, (class01407)class014222, meshItemCommand.lightCoords(), meshItemCommand.overlayCoords(), meshItemCommand.tintLayers(), meshItemCommand.quads(), meshItemCommand.mesh(), meshItemCommand.renderType(), meshItemCommand.glintType(), meshItemCommand.renderTypeGetter(), false);
            if (meshItemCommand.outlineColor() != 0) {
                class014342.N(meshItemCommand.outlineColor());
                this.y.renderItem(meshItemCommand.displayContext(), this.N, (class01407)class014342, meshItemCommand.lightCoords(), meshItemCommand.overlayCoords(), meshItemCommand.tintLayers(), meshItemCommand.quads(), meshItemCommand.mesh(), meshItemCommand.renderType(), class08915.field_55341, meshItemCommand.renderTypeGetter(), true);
            }
            this.N.y();
        }
    }

    public void N(class07937 class079372, class01422 class014222, class01434 class014342) {
        for (class08109 class081092 : class079372.z()) {
            this.N(class079372, class014222, class014342, null, class081092);
            this.N.N();
            this.N.L().N(class081092.N());
            class02862.N((class03662)class081092.y(), (class01421)this.N, (class01407)class014222, (int)class081092.L(), (int)class081092.u(), (int[])class081092.R(), class081092.M(), (class07311)class081092.B(), (class08915)class081092.Z());
            if (class081092.i() != 0) {
                class014342.N(class081092.i());
                class02862.N((class03662)class081092.y(), (class01421)this.N, (class01407)class014342, (int)class081092.L(), (int)class081092.u(), (int[])class081092.R(), class081092.M(), (class07311)class081092.B(), (class08915)class08915.field_55341);
            }
            this.N.y();
        }
        this.N(class079372, class014222, class014342, null);
        this.y(class079372, class014222, class014342, null);
    }

    private void N(class07937 class079372, class01422 class014222, class01434 class014342, CallbackInfo callbackInfo) {
        CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
        CapturedRenderingState.INSTANCE.setCurrentEntity(0);
        CapturedRenderingState.INSTANCE.setCurrentBlockEntity(0);
    }

    private void N(class07937 class079372, class01422 class014222, class01434 class014342, CallbackInfo callbackInfo, class08109 class081092) {
        ((ModelStorage)class081092).iris$set();
    }
}

