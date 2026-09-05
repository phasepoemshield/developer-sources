/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00500
 *  minecraft.class05885
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08388
 *  minecraft.class08743
 *  net.caffeinemc.mods.sodium.client.render.helper.ListStorage
 *  net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext$BlockEmitter
 *  net.caffeinemc.mods.sodium.client.services.PlatformModelAccess
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  net.fabricmc.fabric.api.renderer.v1.model.FabricBlockModelPart
 *  net.fabricmc.fabric.api.renderer.v1.model.FabricBlockStateModel
 *  net.fabricmc.fabric.mixin.renderer.client.block.model.BlockStateModelMixin
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class05885;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08388;
import minecraft.class08743;
import minecraft.class08877;
import net.caffeinemc.mods.sodium.client.render.helper.ListStorage;
import net.caffeinemc.mods.sodium.client.render.model.AbstractBlockRenderContext;
import net.caffeinemc.mods.sodium.client.services.PlatformModelAccess;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.model.FabricBlockModelPart;
import net.fabricmc.fabric.api.renderer.v1.model.FabricBlockStateModel;
import net.fabricmc.fabric.mixin.renderer.client.block.model.BlockStateModelMixin;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface class08887
extends FabricBlockStateModel,
BlockStateModelMixin {
    default public void emitQuads(QuadEmitter quadEmitter, class07295 class072952, class07209 class072092, class00500 class005002, class06069 class060692, /*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Nullable Predicate predicate) {
        ListStorage listStorage;
        List var7 = PlatformModelAccess.getInstance().collectPartsOf(this, class072952, class072092, class005002, class060692, quadEmitter instanceof ListStorage ? (listStorage = (ListStorage)quadEmitter) : null);
        int n = var7.size();
        if (quadEmitter instanceof AbstractBlockRenderContext.BlockEmitter) {
            AbstractBlockRenderContext.BlockEmitter blockEmitter = (AbstractBlockRenderContext.BlockEmitter)quadEmitter;
            class08743 class087432 = class05885.N((class00500)class005002);
            for (int i = 0; i < n; ++i) {
                if (PlatformModelAccess.getInstance().getPartRenderType((class08877)var7.get(i), class005002, class087432) == class087432) continue;
                blockEmitter.markInvalidToDowngrade();
                break;
            }
        }
        for (int i = 0; i < n; ++i) {
            ((FabricBlockModelPart)var7.get(i)).emitQuads(quadEmitter, predicate);
        }
    }

    public void method_68513(class06069 var1, List<class08877> var2);

    default public List<class08877> method_68512(class06069 class060692) {
        ObjectArrayList objectArrayList = new ObjectArrayList();
        this.method_68513(class060692, (List<class08877>)objectArrayList);
        return objectArrayList;
    }

    public class08388 method_68511();
}

