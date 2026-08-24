package oxxxde;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;

// $VF: Compiled from heavy
public enum جو {
   OUTSIDE_JAR(path -> {
      try {
         return Files.newInputStream(Paths.get(path));
      } catch (Exception var2) {
         throw new RuntimeException(var2);
      }
   }),
   INSIDE_JAR(path -> جو.class.getClassLoader().getResourceAsStream(path));

   public final Function<String, InputStream> streamCreateFunction;

   جو(Function<String, InputStream> streamCreateFunction) {
      this.streamCreateFunction = streamCreateFunction;
   }
}
