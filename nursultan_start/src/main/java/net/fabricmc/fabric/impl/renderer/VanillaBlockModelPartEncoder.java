/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02022
 *  minecraft.class07211
 *  minecraft.class08877
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 *  net.fabricmc.fabric.api.renderer.v1.mesh.ShadeMode
 *  net.fabricmc.fabric.api.renderer.v1.model.ModelHelper
 *  net.fabricmc.fabric.api.util.TriState
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.renderer;

import java.util.List;
import java.util.function.Predicate;
import minecraft.class02022;
import minecraft.class07211;
import minecraft.class08877;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.mesh.ShadeMode;
import net.fabricmc.fabric.api.renderer.v1.model.ModelHelper;
import net.fabricmc.fabric.api.util.TriState;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class VanillaBlockModelPartEncoder {
    public static void emitQuads(class08877 class088772, QuadEmitter quadEmitter, Predicate<@Nullable class07211> predicate) {
        TriState triState = class088772.y() ? TriState.DEFAULT : TriState.FALSE;
        for (int i = 0; i <= 6; ++i) {
            class07211 class072112 = ModelHelper.faceFromIndex((int)i);
            if (predicate.test(class072112)) continue;
            List list = class088772.N(class072112);
            int n = list.size();
            for (int j = 0; j < n; ++j) {
                class02022 class020222 = (class02022)list.get(j);
                quadEmitter.cullFace(class072112);
                quadEmitter.fromBakedQuad(class020222);
                quadEmitter.ambientOcclusion(triState);
                quadEmitter.shadeMode(ShadeMode.VANILLA);
                quadEmitter.emit();
            }
        }
    }
}

