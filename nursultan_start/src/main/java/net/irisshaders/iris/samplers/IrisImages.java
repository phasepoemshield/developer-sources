/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  net.irisshaders.iris.gl.image.GlImage
 *  net.irisshaders.iris.gl.image.ImageHolder
 *  net.irisshaders.iris.gl.texture.InternalTextureFormat
 *  net.irisshaders.iris.shadows.ShadowRenderTargets
 *  net.irisshaders.iris.targets.RenderTarget
 *  net.irisshaders.iris.targets.RenderTargets
 */
package net.irisshaders.iris.samplers;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import net.irisshaders.iris.gl.image.GlImage;
import net.irisshaders.iris.gl.image.ImageHolder;
import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import net.irisshaders.iris.shadows.ShadowRenderTargets;
import net.irisshaders.iris.targets.RenderTarget;
import net.irisshaders.iris.targets.RenderTargets;

public class IrisImages {
    public static void addCustomImages(ImageHolder imageHolder, Set<GlImage> set) {
        set.forEach(glImage -> imageHolder.addTextureImage(() -> ((GlImage)glImage).getId(), glImage.getInternalFormat(), glImage.getName()));
    }

    public static boolean hasShadowImages(ImageHolder imageHolder) {
        if (imageHolder == null) {
            return false;
        }
        return imageHolder.hasImage("shadowcolorimg0") || imageHolder.hasImage("shadowcolorimg1");
    }

    public static void addShadowColorImages(ImageHolder imageHolder, ShadowRenderTargets shadowRenderTargets, ImmutableSet<Integer> immutableSet) {
        if (imageHolder == null) {
            return;
        }
        for (int i = 0; i < shadowRenderTargets.getNumColorTextures(); ++i) {
            int n = i;
            IntSupplier intSupplier = immutableSet == null ? () -> shadowRenderTargets.getColorTextureId(n) : () -> immutableSet.contains((Object)n) ? shadowRenderTargets.getOrCreate(n).getAltTexture() : shadowRenderTargets.getOrCreate(n).getMainTexture();
            InternalTextureFormat internalTextureFormat = shadowRenderTargets.getColorTextureFormat(n);
            imageHolder.addTextureImage(intSupplier, internalTextureFormat, "shadowcolorimg" + i);
        }
    }

    public static void addRenderTargetImages(ImageHolder imageHolder, Supplier<ImmutableSet<Integer>> supplier, RenderTargets renderTargets) {
        for (int i = 0; i < renderTargets.getRenderTargetCount(); ++i) {
            int n = i;
            String string = "colorimg" + i;
            if (!imageHolder.hasImage(string)) continue;
            renderTargets.createIfUnsure(n);
            IntSupplier intSupplier = () -> {
                ImmutableSet immutableSet = (ImmutableSet)supplier.get();
                RenderTarget renderTarget = renderTargets.getOrCreate(n);
                if (immutableSet.contains((Object)n)) {
                    return renderTarget.getAltTexture();
                }
                return renderTarget.getMainTexture();
            };
            InternalTextureFormat internalTextureFormat = renderTargets.getOrCreate(i).getInternalFormat();
            imageHolder.addTextureImage(intSupplier, internalTextureFormat, string);
        }
    }

    public static boolean hasRenderTargetImages(ImageHolder imageHolder, RenderTargets renderTargets) {
        for (int i = 0; i < renderTargets.getRenderTargetCount(); ++i) {
            if (imageHolder == null || !imageHolder.hasImage("colorimg" + i)) continue;
            return true;
        }
        return false;
    }
}

