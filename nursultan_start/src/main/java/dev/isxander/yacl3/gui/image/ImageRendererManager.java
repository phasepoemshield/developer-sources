/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  dev.isxander.yacl3.impl.utils.YACLConstants
 *  dev.isxander.yacl3.platform.YACLConfig
 *  minecraft.class01894
 *  minecraft.class06202
 */
package dev.isxander.yacl3.gui.image;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.isxander.yacl3.gui.image.ImageRenderer;
import dev.isxander.yacl3.gui.image.ImageRendererFactory;
import dev.isxander.yacl3.gui.image.ImageRendererFactory$ImageSupplier;
import dev.isxander.yacl3.gui.image.ImageRendererManager$CompletedSupplier;
import dev.isxander.yacl3.gui.image.ImageRendererManager$PreloadedImageFactory;
import dev.isxander.yacl3.gui.image.impl.AnimatedDynamicTextureImage;
import dev.isxander.yacl3.impl.utils.YACLConstants;
import dev.isxander.yacl3.platform.YACLConfig;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class06202;

public class ImageRendererManager {
    private static final ExecutorService SINGLE_THREAD_EXECUTOR = Executors.newSingleThreadExecutor(runnable -> new Thread(runnable, "YACL Image Prep"));
    private static final Map<class01894, CompletableFuture<ImageRenderer>> IMAGE_CACHE = new ConcurrentHashMap<class01894, CompletableFuture<ImageRenderer>>();
    static final Map<class01894, ImageRenderer> PRELOADED_IMAGE_CACHE = new ConcurrentHashMap<class01894, ImageRenderer>();
    static final List<ImageRendererManager$PreloadedImageFactory> PRELOADED_IMAGE_FACTORIES = Stream.of(((YACLConfig)YACLConfig.HANDLER.instance()).preloadComplexImageFormats ? new ImageRendererManager$PreloadedImageFactory(class018942 -> class018942.N().endsWith(".webp"), AnimatedDynamicTextureImage::createWEBPFromTexture) : null, ((YACLConfig)YACLConfig.HANDLER.instance()).preloadComplexImageFormats ? new ImageRendererManager$PreloadedImageFactory(class018942 -> class018942.N().endsWith(".gif"), AnimatedDynamicTextureImage::createGIFFromTexture) : null).filter(Objects::nonNull).toList();

    public static void closeAll() {
        SINGLE_THREAD_EXECUTOR.shutdownNow();
        IMAGE_CACHE.values().removeIf(completableFuture -> {
            if (completableFuture.isDone()) {
                ((ImageRenderer)completableFuture.join()).close();
            }
            return true;
        });
    }

    @Deprecated
    public static <T extends ImageRenderer> CompletableFuture<T> registerImage(class01894 class018942, ImageRendererFactory imageRendererFactory) {
        return ImageRendererManager.registerOrGetImage(class018942, () -> imageRendererFactory);
    }

    private static <T extends ImageRenderer> void completeImageFactory(class01894 class018942, Supplier<Optional<ImageRendererFactory$ImageSupplier>> supplier, CompletableFuture<ImageRenderer> completableFuture) {
        ImageRenderer imageRenderer;
        RenderSystem.assertOnRenderThread();
        ImageRendererFactory$ImageSupplier imageRendererFactory$ImageSupplier = supplier.get().orElse(null);
        if (imageRendererFactory$ImageSupplier == null) {
            return;
        }
        if (completableFuture.isDone()) {
            YACLConstants.LOGGER.error("Image '{}' was already completed", (Object)class018942);
            return;
        }
        try {
            imageRenderer = imageRendererFactory$ImageSupplier.completeImage();
        }
        catch (Exception exception) {
            YACLConstants.LOGGER.error("Failed to create image '{}'", (Object)class018942, (Object)exception);
            return;
        }
        completableFuture.complete(imageRenderer);
    }

    static Optional<ImageRendererFactory$ImageSupplier> safelyPrepareFactory(class01894 class018942, ImageRendererFactory imageRendererFactory) {
        try {
            return Optional.of(imageRendererFactory.prepareImage());
        }
        catch (Exception exception) {
            YACLConstants.LOGGER.error("Failed to prepare image '{}'", (Object)class018942, (Object)exception);
            IMAGE_CACHE.remove(class018942);
            return Optional.empty();
        }
    }

    public static <T extends ImageRenderer> Optional<T> getImage(class01894 class018942) {
        if (PRELOADED_IMAGE_CACHE.containsKey(class018942)) {
            return Optional.of(PRELOADED_IMAGE_CACHE.get(class018942));
        }
        if (IMAGE_CACHE.containsKey(class018942)) {
            return Optional.ofNullable(IMAGE_CACHE.get(class018942).getNow(null));
        }
        return Optional.empty();
    }

    public static <T extends ImageRenderer> CompletableFuture<T> registerOrGetImage(class01894 class018942, Supplier<ImageRendererFactory> supplier) {
        if (PRELOADED_IMAGE_CACHE.containsKey(class018942)) {
            return CompletableFuture.completedFuture(PRELOADED_IMAGE_CACHE.get(class018942));
        }
        if (IMAGE_CACHE.containsKey(class018942)) {
            return IMAGE_CACHE.get(class018942);
        }
        CompletableFuture completableFuture = new CompletableFuture();
        IMAGE_CACHE.put(class018942, completableFuture);
        ImageRendererFactory imageRendererFactory = supplier.get();
        SINGLE_THREAD_EXECUTOR.submit(() -> {
            Supplier<Optional<ImageRendererFactory$ImageSupplier>> supplier = imageRendererFactory.requiresOffThreadPreparation() ? new ImageRendererManager$CompletedSupplier<Optional<ImageRendererFactory$ImageSupplier>>(ImageRendererManager.safelyPrepareFactory(class018942, imageRendererFactory)) : () -> ImageRendererManager.safelyPrepareFactory(class018942, imageRendererFactory);
            class06202.Nq().execute(() -> ImageRendererManager.completeImageFactory(class018942, supplier, completableFuture));
        });
        return completableFuture;
    }
}

