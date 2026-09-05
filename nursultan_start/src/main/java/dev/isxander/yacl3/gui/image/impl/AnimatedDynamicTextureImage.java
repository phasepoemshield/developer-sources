/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twelvemonkeys.imageio.plugins.webp.WebPImageReaderSpi
 *  dev.isxander.yacl3.debug.DebugProperties
 *  minecraft.class01054
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class04674
 *  minecraft.class06202
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07878
 *  minecraft.class08247
 *  minecraft.class08280
 */
package dev.isxander.yacl3.gui.image.impl;

import com.twelvemonkeys.imageio.plugins.webp.WebPImageReaderSpi;
import dev.isxander.yacl3.debug.DebugProperties;
import dev.isxander.yacl3.gui.image.ImageRendererFactory;
import dev.isxander.yacl3.gui.image.ImageRendererFactory$ImageSupplier;
import dev.isxander.yacl3.gui.image.impl.AnimatedDynamicTextureImage$AnimFrame;
import dev.isxander.yacl3.gui.image.impl.AnimatedDynamicTextureImage$AnimFrameProvider;
import dev.isxander.yacl3.gui.image.impl.DynamicTextureImage;
import dev.isxander.yacl3.gui.utils.GuiUtils;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.IntStream;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataNode;
import minecraft.class01054;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class04674;
import minecraft.class06202;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07878;
import minecraft.class08247;
import minecraft.class08280;

public class AnimatedDynamicTextureImage
extends DynamicTextureImage {
    private int currentFrame;
    private double lastFrameTime;
    private final double[] frameDelays;
    private final int frameCount;
    private final int packCols;
    private final int packRows;
    private final int frameWidth;
    private final int frameHeight;

    public AnimatedDynamicTextureImage(class08280 class082802, int n, int n2, int n3, double[] dArray, int n4, int n5, class01894 class018942) {
        super(class082802, class018942, false);
        this.frameWidth = n;
        this.frameHeight = n2;
        this.frameCount = n3;
        this.frameDelays = dArray;
        this.packCols = n4;
        this.packRows = n5;
    }

    @Override
    public int render(class01054 class010542, int n, int n2, int n3, float f) {
        if (this.image == null) {
            return 0;
        }
        float f2 = (float)n3 / (float)this.frameWidth;
        int n4 = (int)((float)this.frameHeight * f2);
        int n5 = this.currentFrame % this.packCols;
        int n6 = (int)Math.floor((double)this.currentFrame / (double)this.packCols);
        GuiUtils.pushPose(class010542);
        GuiUtils.translate2D(class010542, n, n2);
        GuiUtils.scale2D(class010542, f2, f2);
        GuiUtils.blitGuiTex(class010542, this.uniqueLocation, 0, 0, this.frameWidth * n5, this.frameHeight * n6, this.frameWidth, this.frameHeight, this.width, this.height, DebugProperties.IMAGE_FILTERING);
        GuiUtils.popPose(class010542);
        if (this.frameCount > 1) {
            double d = class04674.y() * 1000.0;
            if (this.lastFrameTime == 0.0) {
                this.lastFrameTime = d;
            }
            if (d - this.lastFrameTime >= this.frameDelays[this.currentFrame]) {
                ++this.currentFrame;
                this.lastFrameTime = d;
            }
            if (this.currentFrame >= this.frameCount - 1) {
                this.currentFrame = 0;
            }
        }
        return n4;
    }

    private static ImageRendererFactory$ImageSupplier createFromImageReader(ImageReader imageReader, AnimatedDynamicTextureImage$AnimFrameProvider animatedDynamicTextureImage$AnimFrameProvider, class01894 class018942) throws Exception {
        if (imageReader.isSeekForwardOnly()) {
            throw new RuntimeException("Image reader is not seekable");
        }
        int n2 = imageReader.getNumImages(true);
        int n3 = IntStream.range(0, n2).map(n -> {
            try {
                return imageReader.getWidth(n);
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }).max().orElseThrow();
        int n4 = IntStream.range(0, n2).map(n -> {
            try {
                return imageReader.getHeight(n);
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }).max().orElseThrow();
        double d = (double)n3 / (double)n4;
        int n5 = (int)Math.ceil(Math.sqrt(n2) / Math.sqrt(d));
        int n6 = (int)Math.ceil((double)n2 / (double)n5);
        class08280 class082802 = new class08280(class08247.field_4997, n3 * n5, n4 * n6, false);
        BufferedImage bufferedImage = null;
        Graphics graphics = null;
        double[] dArray = new double[n2];
        for (int i = 0; i < n2; ++i) {
            AnimatedDynamicTextureImage$AnimFrame animatedDynamicTextureImage$AnimFrame = animatedDynamicTextureImage$AnimFrameProvider.get(i);
            if (n2 > 1) {
                dArray[i] = animatedDynamicTextureImage$AnimFrame.durationMS;
            }
            if (bufferedImage == null) {
                bufferedImage = imageReader.read(i);
                graphics = bufferedImage.createGraphics();
            } else {
                BufferedImage bufferedImage2 = imageReader.read(i);
                graphics.drawImage(bufferedImage2, animatedDynamicTextureImage$AnimFrame.xOffset, animatedDynamicTextureImage$AnimFrame.yOffset, null);
            }
            int n7 = (n3 - bufferedImage.getWidth()) / 2;
            int n8 = (n4 - bufferedImage.getHeight()) / 2;
            for (int j = 0; j < bufferedImage.getWidth(); ++j) {
                for (int k = 0; k < bufferedImage.getHeight(); ++k) {
                    int n9 = bufferedImage.getRGB(j, k);
                    int n10 = i % n5;
                    int n11 = (int)Math.floor((double)i / (double)n5);
                    GuiUtils.setPixelARGB(class082802, n3 * n10 + j + n7, n4 * n11 + k + n8, n9);
                }
            }
        }
        if (graphics != null) {
            graphics.dispose();
        }
        imageReader.dispose();
        return () -> new AnimatedDynamicTextureImage(class082802, n3, n4, n2, dArray, n5, n6, class018942);
    }

    public static ImageRendererFactory createWEBPFromTexture(class01894 class018942) {
        return () -> {
            class01089 class010892 = class06202.Nq().Nm();
            class01079 class010792 = (class01079)class010892.method_14486(class018942).orElseThrow();
            return AnimatedDynamicTextureImage.createWEBPSupplier(class010792.method_14482(), class018942);
        };
    }

    public static ImageRendererFactory createGIFFromTexture(class01894 class018942) {
        return () -> {
            class01089 class010892 = class06202.Nq().Nm();
            class01079 class010792 = (class01079)class010892.method_14486(class018942).orElseThrow();
            return AnimatedDynamicTextureImage.createGIFSupplier(class010792.method_14482(), class018942);
        };
    }

    private static ImageRendererFactory$ImageSupplier createWEBPSupplier(InputStream inputStream, class01894 class018942) {
        Object object;
        block9: {
            InputStream inputStream2 = inputStream;
            try {
                ImageReader imageReader = new WebPImageReaderSpi().createReaderInstance();
                imageReader.setInput(ImageIO.createImageInputStream(inputStream));
                int n2 = imageReader.getNumImages(true);
                AnimatedDynamicTextureImage$AnimFrameProvider animatedDynamicTextureImage$AnimFrameProvider = n -> null;
                if (n2 > 1) {
                    object = Class.forName("com.twelvemonkeys.imageio.plugins.webp.WebPImageReader");
                    Field field = ((Class)object).getDeclaredField("frames");
                    field.setAccessible(true);
                    List list = (List)field.get(imageReader);
                    Class<?> clazz = Class.forName("com.twelvemonkeys.imageio.plugins.webp.AnimationFrame");
                    Field field2 = clazz.getDeclaredField("duration");
                    field2.setAccessible(true);
                    Field field3 = clazz.getDeclaredField("bounds");
                    field3.setAccessible(true);
                    animatedDynamicTextureImage$AnimFrameProvider = n -> {
                        Rectangle rectangle = (Rectangle)field3.get(list.get(n));
                        return new AnimatedDynamicTextureImage$AnimFrame((Integer)field2.get(list.get(n)), rectangle.x, rectangle.y);
                    };
                }
                object = AnimatedDynamicTextureImage.createFromImageReader(imageReader, animatedDynamicTextureImage$AnimFrameProvider, class018942);
                if (inputStream2 == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Throwable throwable3) {
                    class07080 class070802 = class07080.N((Throwable)throwable3, (String)"Failed to load WEBP image");
                    class07074 class070742 = class070802.N("YACL Gui");
                    class070742.N("Image identifier", (Object)class018942.toString());
                    throw new class07878(class070802);
                }
            }
            inputStream2.close();
        }
        return object;
    }

    public static ImageRendererFactory createGIFFromPath(Path path, class01894 class018942) {
        return () -> AnimatedDynamicTextureImage.createGIFSupplier(new FileInputStream(path.toFile()), class018942);
    }

    public static ImageRendererFactory createWEBPFromPath(Path path, class01894 class018942) {
        return () -> AnimatedDynamicTextureImage.createWEBPSupplier(new FileInputStream(path.toFile()), class018942);
    }

    private static ImageRendererFactory$ImageSupplier createGIFSupplier(InputStream inputStream, class01894 class018942) {
        ImageRendererFactory$ImageSupplier imageRendererFactory$ImageSupplier;
        block8: {
            InputStream inputStream2 = inputStream;
            try {
                ImageReader imageReader = ImageIO.getImageReadersBySuffix("gif").next();
                imageReader.setInput(ImageIO.createImageInputStream(inputStream));
                AnimatedDynamicTextureImage$AnimFrameProvider animatedDynamicTextureImage$AnimFrameProvider = n -> {
                    IIOMetadata iIOMetadata = imageReader.getImageMetadata(n);
                    String string = iIOMetadata.getNativeMetadataFormatName();
                    IIOMetadataNode iIOMetadataNode = (IIOMetadataNode)iIOMetadata.getAsTree(string);
                    IIOMetadataNode iIOMetadataNode2 = (IIOMetadataNode)iIOMetadataNode.getElementsByTagName("GraphicControlExtension").item(0);
                    int n2 = Integer.parseInt(iIOMetadataNode2.getAttribute("delayTime")) * 10;
                    return new AnimatedDynamicTextureImage$AnimFrame(n2, 0, 0);
                };
                imageRendererFactory$ImageSupplier = AnimatedDynamicTextureImage.createFromImageReader(imageReader, animatedDynamicTextureImage$AnimFrameProvider, class018942);
                if (inputStream2 == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception exception) {
                    class07080 class070802 = class07080.N((Throwable)exception, (String)"Failed to load GIF image");
                    class07074 class070742 = class070802.N("YACL Gui");
                    class070742.N("Image identifier", (Object)class018942.toString());
                    throw new class07878(class070802);
                }
            }
            inputStream2.close();
        }
        return imageRendererFactory$ImageSupplier;
    }
}

