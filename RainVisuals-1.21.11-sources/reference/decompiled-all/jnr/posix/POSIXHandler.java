package jnr.posix;

import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import jnr.constants.platform.Errno;

// $VF: Compiled from POSIXHandler.java
public interface POSIXHandler {
   int getPID();

   boolean isVerbose();

   void error(Errno var1, String var2, String var3);

   void warn(POSIXHandler.WARNING_ID var1, String var2, Object... var3);

   PrintStream getOutputStream();

   File getCurrentWorkingDirectory();

   void unimplementedError(String var1);

   void error(Errno var1, String var2);

   String[] getEnv();

   PrintStream getErrorStream();

   InputStream getInputStream();

   // $VF: Compiled from POSIXHandler.java
   enum WARNING_ID {
      DUMMY_VALUE_USED("DUMMY_VALUE_USED");

      private String messageID;

      WARNING_ID(String messageID) {
         this.messageID = messageID;
      }
   }
}
