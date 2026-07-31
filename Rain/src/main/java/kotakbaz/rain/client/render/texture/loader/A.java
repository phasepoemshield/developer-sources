/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture.loader;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import kotakbaz.rain.client.render.texture.b_0;
import kotakbaz.rain.client.render.texture.loader.B;
import kotakbaz.rain.client.render.texture.loader.C;
import kotakbaz.rain.client.render.texture.texture.a_0;

public final class A {
    public static final Function<InputStream, B> a = inputStream -> decompileMode -> {
        try (InputStream inputStream2 = inputStream;){
            kotakbaz.rain.client.render.texture.builder.A a2;
            block12: {
                ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputStream2);
                try {
                    kotakbaz.rain.client.render.texture.utils.gif.a_0 a_02 = decompileMode.b.decompile(imageInputStream);
                    a2 = new kotakbaz.rain.client.render.texture.builder.A(a_02.a.stream().map(bufferedImage -> {
                        try {
                            return C.B.load((BufferedImage)bufferedImage, kotakbaz.rain.client.render.texture.texture.B.A, a_0.a, kotakbaz.rain.client.render.texture.texture.b_0.a);
                        }
                        catch (Exception exception) {
                            throw new RuntimeException(exception);
                        }
                    }).collect(Collectors.toList()), a_02.A);
                    if (imageInputStream == null) break block12;
                }
                catch (Throwable throwable) {
                    if (imageInputStream != null) {
                        try {
                            imageInputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                imageInputStream.close();
            }
            return a2;
        }
    };
    public static BiFunction<String, b_0, B> A = (path, pathMode) -> a.apply(pathMode.b.apply((String)path));
    public static Function<URL, B> b = url -> {
        try {
            return a.apply(url.openStream());
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    };
}

