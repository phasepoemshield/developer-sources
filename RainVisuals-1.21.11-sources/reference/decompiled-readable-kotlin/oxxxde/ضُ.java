package oxxxde;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

// $VF: Compiled from heavy
public final class ضُ {
   public static Function<URL, زٌ> URL = url -> {
      try {
         return ضُ.INPUT_STREAM.apply(url.openStream());
      } catch (IOException e) {
         throw new RuntimeException(e);
      }
   };
   public static BiFunction<String, جو, زٌ> PATH = (path, pathMode) -> ضُ.INPUT_STREAM.apply(pathMode.streamCreateFunction.apply(path));
   public static final Function<InputStream, زٌ> INPUT_STREAM = inputStream -> decompileMode -> {
      try (
         InputStream stream = inputStream;
         ImageInputStream iis = ImageIO.createImageInputStream(stream);
      ) {
         طز gifData = decompileMode.gifDecompiler.decompile(iis);
         return new ذص(gifData.images.stream().map(bufferedImage -> {
            try {
               return ثُ.BUFFERED_IMAGE.load(bufferedImage, ضو.RGBA, زآ.DEFAULT, جش.DEFAULT);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }).collect(Collectors.toList()), gifData.updateDelay);
      }
   };
}
