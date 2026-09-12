package Nursultan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class class09674 {
   private static final Properties Z;
   private String z;
   public boolean N = true;
   public boolean y = true;
   public boolean L = true;
   public boolean u = true;
   public class09684 i = class09684.LAST_TO_FIRST;
   public class09664 R = class09664.NORMAL;
   public class09688 M = class09688.PROPORTIONAL;
   public static boolean B;

   class09674(String var1) {
      this.z = var1;
   }

   public void y() {
      try {
         File var1 = new File(this.z);
         boolean var2 = var1.exists();
         File var3 = var1.getParentFile();
         if (!var3.exists()) {
            var3.mkdirs();
         }

         FileWriter var4 = new FileWriter(var1);
         N(var4, "RMBTweak", this.N);
         N(var4, "LMBTweakWithItem", this.y);
         N(var4, "LMBTweakWithoutItem", this.L);
         N(var4, "WheelTweak", this.u);
         N(var4, "WheelSearchOrder", String.valueOf(this.i.ordinal()));
         N(var4, "WheelScrollDirection", String.valueOf(this.R.ordinal()));
         N(var4, "ScrollItemScaling", String.valueOf(this.M.ordinal()));
         N(var4, "Debug", B);
         var4.close();
         if (!var2) {
            class09673.N("Created the config file.");
         }
      } catch (IOException var5) {
         class09673.N("Failed to write the config file: " + this.z);
         var5.printStackTrace();
      }
   }

   private static int N(String var0, int var1) {
      try {
         return Integer.parseInt(var0);
      } catch (NumberFormatException var3) {
         return var1;
      }
   }

   private static void N(FileWriter var0, String var1, boolean var2) throws IOException {
      N(var0, var1, var2 ? "1" : "0");
   }

   private static void N(FileWriter var0, String var1, String var2) throws IOException {
      var0.write(var1 + "=" + var2 + "\n");
   }

   public void N() {
      Properties var1 = new Properties(Z);

      try {
         FileReader var2 = new FileReader(this.z);
         var1.load(var2);
         var2.close();
      } catch (FileNotFoundException var3) {
         class09673.N("Generating the config file at: " + this.z);
         this.y();
         return;
      } catch (IOException var4) {
         class09673.N("Failed to read the config file: " + this.z);
         var4.printStackTrace();
      }

      this.N = N(var1.getProperty("RMBTweak"), 1) != 0;
      this.y = N(var1.getProperty("LMBTweakWithItem"), 1) != 0;
      this.L = N(var1.getProperty("LMBTweakWithoutItem"), 1) != 0;
      this.u = N(var1.getProperty("WheelTweak"), 1) != 0;
      this.i = class09684.N(N(var1.getProperty("WheelSearchOrder"), 1));
      this.R = class09664.N(N(var1.getProperty("WheelScrollDirection"), 0));
      this.M = class09688.N(N(var1.getProperty("ScrollItemScaling"), 0));
      B = N(var1.getProperty("Debug"), 0) != 0;
   }
}
