/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import oxxxde.\u062b\u064f;
import oxxxde.\u062c\u0634;
import oxxxde.\u062c\u0648;
import oxxxde.\u0630\u0635;
import oxxxde.\u0632\u0622;
import oxxxde.\u0632\u064c;
import oxxxde.\u0636\u0648;
import oxxxde.\u0637\u0632;

public final class \u0636\u064f {
    public static Function<URL, \u0632\u064c> URL;
    public static BiFunction<String, \u062c\u0648, \u0632\u064c> PATH;
    public static final Function<InputStream, \u0632\u064c> INPUT_STREAM;

    static {
        INPUT_STREAM = inputStream -> decompileMode -> {
            \u0630\u0635 \u0630\u06352;
            ImageInputStream iis;
            InputStream stream;
            block12: {
                stream = inputStream;
                iis = ImageIO.createImageInputStream(stream);
                \u0637\u0632 gifData = decompileMode.gifDecompiler.decompile(iis);
                \u0630\u06352 = new \u0630\u0635(gifData.images.stream().map(bufferedImage -> {
                    try {
                        return \u062b\u064f.BUFFERED_IMAGE.load((BufferedImage)bufferedImage, \u0636\u0648.RGBA, \u0632\u0622.DEFAULT, \u062c\u0634.DEFAULT);
                    }
                    catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }).collect(Collectors.toList()), gifData.updateDelay);
                if (iis == null) break block12;
                iis.close();
            }
            if (stream != null) {
                stream.close();
            }
            return \u0630\u06352;
            {
                catch (Throwable throwable) {
                    try {
                        if (iis != null) {
                            try {
                                iis.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (Throwable throwable3) {
                        throw throwable3;
                    }
                    finally {
                    }
                }
            }
        };
        PATH = (path, pathMode) -> INPUT_STREAM.apply(pathMode.streamCreateFunction.apply((String)path));
        URL = url -> {
            try {
                return INPUT_STREAM.apply(url.openStream());
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }
}

