/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.utils.YACLConstants
 *  dev.isxander.yacl3.platform.YACLPlatform
 *  minecraft.class01073
 *  minecraft.class01080
 *  minecraft.class01081
 *  minecraft.class01089
 *  minecraft.class01894
 *  net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener
 */
package dev.isxander.yacl3.gui.image;

import dev.isxander.yacl3.gui.image.ImageRenderer;
import dev.isxander.yacl3.gui.image.ImageRendererFactory;
import dev.isxander.yacl3.gui.image.ImageRendererFactory$ImageSupplier;
import dev.isxander.yacl3.gui.image.ImageRendererManager;
import dev.isxander.yacl3.gui.image.YACLImageReloadListener$CompletableFutureCollector;
import dev.isxander.yacl3.gui.image.YACLImageReloadListener$SupplierPreparation;
import dev.isxander.yacl3.impl.utils.YACLConstants;
import dev.isxander.yacl3.platform.YACLPlatform;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class01073;
import minecraft.class01080;
import minecraft.class01081;
import minecraft.class01089;
import minecraft.class01894;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;

public class YACLImageReloadListener
implements class01081,
IdentifiableResourceReloadListener {
    private CompletableFuture<List<Optional<YACLImageReloadListener$SupplierPreparation>>> prepare(class01089 class010892, Executor executor) {
        Map map = class010892.y("textures", class018942 -> ImageRendererManager.PRELOADED_IMAGE_FACTORIES.stream().anyMatch(imageRendererManager$PreloadedImageFactory -> imageRendererManager$PreloadedImageFactory.predicate().test((class01894)class018942)));
        return map.keySet().stream().map(class018942 -> {
            ImageRendererFactory imageRendererFactory = ImageRendererManager.PRELOADED_IMAGE_FACTORIES.stream().filter(imageRendererManager$PreloadedImageFactory -> imageRendererManager$PreloadedImageFactory.predicate().test((class01894)class018942)).map(imageRendererManager$PreloadedImageFactory -> imageRendererManager$PreloadedImageFactory.factory().apply((class01894)class018942)).findAny().orElseThrow();
            return CompletableFuture.supplyAsync(() -> ImageRendererManager.safelyPrepareFactory(class018942, imageRendererFactory).map(imageRendererFactory$ImageSupplier -> new YACLImageReloadListener$SupplierPreparation((class01894)class018942, (ImageRendererFactory$ImageSupplier)imageRendererFactory$ImageSupplier)), executor);
        }).collect(YACLImageReloadListener$CompletableFutureCollector.allOf());
    }

    public class01894 getFabricId() {
        return this.getId();
    }

    private CompletableFuture<Void> apply(List<Optional<YACLImageReloadListener$SupplierPreparation>> list, Executor executor) {
        return CompletableFuture.allOf((CompletableFuture[])list.stream().flatMap(Optional::stream).map(yACLImageReloadListener$SupplierPreparation -> CompletableFuture.supplyAsync(() -> {
            ImageRenderer imageRenderer;
            try {
                imageRenderer = yACLImageReloadListener$SupplierPreparation.supplier().completeImage();
            }
            catch (Exception exception) {
                YACLConstants.LOGGER.error("Failed to create image '{}'", (Object)yACLImageReloadListener$SupplierPreparation.location(), (Object)exception);
                return Optional.empty();
            }
            ImageRendererManager.PRELOADED_IMAGE_CACHE.put(yACLImageReloadListener$SupplierPreparation.location(), imageRenderer);
            YACLConstants.LOGGER.info("Successfully loaded image '{}'", (Object)yACLImageReloadListener$SupplierPreparation.location());
            return Optional.of(imageRenderer);
        }, executor)).toArray(CompletableFuture[]::new));
    }

    public class01894 getId() {
        return YACLPlatform.rl((String)"image_reload_listener");
    }

    public CompletableFuture<Void> method_25931(class01073 class010732, Executor executor, class01080 class010802, Executor executor2) {
        return this.reload0(class010732.N(), executor, class010802, executor2);
    }

    private CompletableFuture<Void> reload0(class01089 class010892, Executor executor, class01080 class010802, Executor executor2) {
        return ((CompletableFuture)this.prepare(class010892, executor).thenCompose(arg_0 -> ((class01080)class010802).N(arg_0))).thenCompose(list -> this.apply((List<Optional<YACLImageReloadListener$SupplierPreparation>>)list, executor2));
    }
}

