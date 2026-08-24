package oxxxde;

import java.io.InputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

// $VF: Compiled from heavy
public final class رس {
   public static final تئ<String> IN_JAR = new تئ<String>()   // $VF: Compiled from heavy
 {
      public String getContent(String path) throws Exception {
         InputStream inputStream = رس.class.getClassLoader().getResourceAsStream(path);
         String content = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
         inputStream.close();
         return content;
      }
   };
   public static final تئ<InputStream> INPUT_STREAM = new تئ<InputStream>()   // $VF: Compiled from heavy
 {
      public String getContent(InputStream path) throws Exception {
         String content = IOUtils.toString(path, StandardCharsets.UTF_8);
         path.close();
         return content;
      }
   };
   public static final تئ<URI> URI = new تئ<URI>()   // $VF: Compiled from heavy
 {
      public String getContent(URI path) throws Exception {
         InputStream inputStream = path.toURL().openStream();
         String content = IOUtils.toString(path, StandardCharsets.UTF_8);
         inputStream.close();
         return content;
      }
   };
}
