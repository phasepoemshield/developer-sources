package jnr.posix.util;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

// $VF: Compiled from ProcessMaker.java
public interface ProcessMaker {
   File directory();

   ProcessMaker redirectInput(File var1);

   ProcessMaker inheritIO();

   ProcessMaker redirectOutput(File var1);

   ProcessMaker redirectInput(ProcessMaker.Redirect var1);

   ProcessMaker.Redirect redirectOutput();

   List<String> command();

   ProcessMaker.Redirect redirectInput();

   ProcessMaker redirectErrorStream(boolean var1);

   Map<String, String> environment();

   boolean redirectErrorStream();

   ProcessMaker redirectOutput(ProcessMaker.Redirect var1);

   Process start() throws IOException;

   ProcessMaker environment(String[] var1);

   ProcessMaker command(String... var1);

   ProcessMaker command(List<String> var1);

   ProcessMaker.Redirect redirectError();

   ProcessMaker directory(File var1);

   ProcessMaker redirectError(File var1);

   ProcessMaker redirectError(ProcessMaker.Redirect var1);

   // $VF: Compiled from ProcessMaker.java
   class Redirect {
      public static final ProcessMaker.Redirect INHERIT = new ProcessMaker.Redirect(ProcessMaker.Redirect.Type.INHERIT);
      private final File file;
      private final ProcessMaker.Redirect.Type type;
      public static final ProcessMaker.Redirect PIPE = new ProcessMaker.Redirect(ProcessMaker.Redirect.Type.PIPE);

      private Redirect(ProcessMaker.Redirect.Type type, File file) {
         this.type = type;
         this.file = file;
      }

      private Redirect(ProcessMaker.Redirect.Type type) {
         this(type, null);
      }

      public static ProcessMaker.Redirect appendTo(File file) {
         return new ProcessMaker.Redirect(ProcessMaker.Redirect.Type.APPEND, file);
      }

      public static ProcessMaker.Redirect from(File file) {
         return new ProcessMaker.Redirect(ProcessMaker.Redirect.Type.READ, file);
      }

      public File file() {
         return this.file;
      }

      public ProcessMaker.Redirect.Type type() {
         return this.type;
      }

      public static ProcessMaker.Redirect to(File file) {
         return new ProcessMaker.Redirect(ProcessMaker.Redirect.Type.WRITE, file);
      }

      // $VF: Compiled from ProcessMaker.java
      private enum Type {
         APPEND,
         PIPE,
         INHERIT,
         WRITE,
         READ;
      }
   }
}
