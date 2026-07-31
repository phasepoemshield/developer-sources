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

public final class A {
    public static final Function<InputStream, B> a = inputStream -> b2 -> {
        try (InputStream inputStream2 = inputStream;){
            kotakbaz.rain.client.render.texture.builder.A a2;
            block12: {
                ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputStream2);
                try {
                    kotakbaz.rain.client.render.texture.utils.gif.A a3 = b2.b.decompile(imageInputStream);
                    a2 = new kotakbaz.rain.client.render.texture.builder.A(a3.a.stream().map(bufferedImage -> {
                        try {
                            return C.B.load((BufferedImage)bufferedImage, kotakbaz.rain.client.render.texture.texture.B.A, kotakbaz.rain.client.render.texture.texture.A.a, kotakbaz.rain.client.render.texture.texture.b_0.a);
                        }
                        catch (Exception exception) {
                            throw new RuntimeException(exception);
                        }
                    }).collect(Collectors.toList()), a3.A);
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
    public static BiFunction<String, b_0, B> A = (string, b_02) -> a.apply(b_02.b.apply((String)string));
    public static Function<URL, B> b = uRL -> {
        try {
            return a.apply(uRL.openStream());
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    };

    public A() {
        super();
    }
}

