package rainpatch;

import java.awt.Desktop;
import java.net.URI;
import net.fabricmc.api.ClientModInitializer;

// $VF: Compiled from RainPatchEntryPoint.java
public final class RainPatchEntryPoint implements ClientModInitializer {
   private static final String LINK = "https://t.me/wtfcrashdami";

   public void onInitializeClient() {
      System.out.println("Leaked by LORDMAKAVTOJJ && t.me/wtfcrashdami");
      System.setProperty("rain.debug.usernamX", "https://t.me/wtfcrashdami".replace("https://", ""));
      openLink();

      try {
         Class var1 = Class.forName("oxxxde.صص");
         Object var2 = var1.getField("INSTANCE").get(null);
         var1.getMethod("onInitializeClient").invoke(var2);
      } catch (Throwable var3) {
         var3.printStackTrace();
      }
   }

   private static void openLink() {
      try {
         if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(URI.create("https://t.me/wtfcrashdami"));
            return;
         }
      } catch (Throwable var2) {
      }

      try {
         if (System.getProperty("os.name", "").toLowerCase().contains("win")) {
            Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "start", "", "https://t.me/wtfcrashdami"});
         }
      } catch (Throwable var1) {
      }
   }
}
