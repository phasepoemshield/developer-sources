/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  org.joml.Vector2i
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.targets;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.opengl.GlStateManager;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives;
import net.irisshaders.iris.shaderpack.properties.PackShadowDirectives;
import net.irisshaders.iris.shaderpack.properties.PackShadowDirectives$SamplingSettings;
import net.irisshaders.iris.shadows.ShadowRenderTargets;
import net.irisshaders.iris.targets.ClearPass;
import net.irisshaders.iris.targets.ClearPassInformation;
import net.irisshaders.iris.targets.RenderTarget;
import net.irisshaders.iris.targets.RenderTargets;
import org.joml.Vector2i;
import org.joml.Vector4f;

public class ClearPassCreator {
    public static ImmutableList<ClearPass> createClearPasses(RenderTargets renderTargets, boolean bl, PackRenderTargetDirectives packRenderTargetDirectives) {
        int n2 = GlStateManager._getInteger((int)34852);
        HashMap<Vector2i, Map> hashMap = new HashMap<Vector2i, Map>();
        packRenderTargetDirectives.getRenderTargetSettings().forEach((n, packRenderTargetDirectives$RenderTargetSettings) -> {
            int n2 = n;
            if (bl || packRenderTargetDirectives$RenderTargetSettings.shouldClear()) {
                Vector4f vector4f = n2 == 0 ? null : (n2 == 1 ? new Vector4f(1.0f, 1.0f, 1.0f, 1.0f) : new Vector4f(0.0f, 0.0f, 0.0f, 0.0f));
                RenderTarget renderTarget = renderTargets.get(n2);
                if (renderTarget == null) {
                    return;
                }
                Vector4f vector4f2 = packRenderTargetDirectives$RenderTargetSettings.getClearColor().orElse(vector4f);
                hashMap.computeIfAbsent(new Vector2i(renderTarget.getWidth(), renderTarget.getHeight()), vector2i -> new HashMap()).computeIfAbsent(new ClearPassInformation(vector4f2, renderTarget.getWidth(), renderTarget.getHeight()), clearPassInformation -> new IntArrayList()).add(n2);
            }
        });
        ArrayList arrayList = new ArrayList();
        hashMap.forEach((vector2i, map) -> map.forEach((clearPassInformation, intList) -> {
            int n2 = 0;
            while (n2 < intList.size()) {
                int[] nArray = new int[Math.min(intList.size() - n2, n2)];
                for (int i = 0; i < nArray.length; ++i) {
                    nArray[i] = intList.getInt(n2);
                    ++n2;
                }
                arrayList.add(new ClearPass(clearPassInformation.getColor(), clearPassInformation::getWidth, clearPassInformation::getHeight, renderTargets.createClearFramebuffer(true, nArray), 16384));
                arrayList.add(new ClearPass(clearPassInformation.getColor(), clearPassInformation::getWidth, clearPassInformation::getHeight, renderTargets.createClearFramebuffer(false, nArray), 16384));
            }
        }));
        return ImmutableList.copyOf(arrayList);
    }

    public static ImmutableList<ClearPass> createShadowClearPasses(ShadowRenderTargets shadowRenderTargets, boolean bl, PackShadowDirectives packShadowDirectives) {
        if (shadowRenderTargets == null) {
            return ImmutableList.of();
        }
        int n = GlStateManager._getInteger((int)34852);
        HashMap<Vector4f, IntList> hashMap = new HashMap<Vector4f, IntList>();
        for (int i = 0; i < shadowRenderTargets.getRenderTargetCount(); ++i) {
            if (shadowRenderTargets.get(i) == null) continue;
            PackShadowDirectives$SamplingSettings packShadowDirectives$SamplingSettings = (PackShadowDirectives$SamplingSettings)packShadowDirectives.getColorSamplingSettings().get(i);
            if (!bl && !packShadowDirectives$SamplingSettings.getClear()) continue;
            Vector4f vector4f2 = packShadowDirectives$SamplingSettings.getClearColor();
            hashMap.computeIfAbsent(vector4f2, vector4f -> new IntArrayList()).add(i);
        }
        ArrayList arrayList = new ArrayList();
        hashMap.forEach((vector4f, intList) -> {
            int n2 = 0;
            while (n2 < intList.size()) {
                int[] nArray = new int[Math.min(intList.size() - n2, n)];
                for (int i = 0; i < nArray.length; ++i) {
                    nArray[i] = intList.getInt(n2);
                    ++n2;
                }
                arrayList.add(new ClearPass((Vector4f)vector4f, shadowRenderTargets::getResolution, shadowRenderTargets::getResolution, shadowRenderTargets.createFramebufferWritingToAlt(nArray), 16384));
                arrayList.add(new ClearPass((Vector4f)vector4f, shadowRenderTargets::getResolution, shadowRenderTargets::getResolution, shadowRenderTargets.createFramebufferWritingToMain(nArray), 16384));
            }
        });
        return ImmutableList.copyOf(arrayList);
    }
}

