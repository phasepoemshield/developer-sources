package org.newsclub.net.unix;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

// $VF: Compiled from PathUtil.java
@IgnoreJRERequirement
final class PathUtil {
   private PathUtil() {
      throw new IllegalStateException("No instances");
   }

   static boolean isPathInDefaultFileSystem(Path p) {
      FileSystem fs = p.getFileSystem();
      return fs == FileSystems.getDefault() && fs.getClass().getModule() == Object.class.getModule();
   }
}
