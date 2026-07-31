package l;

import net.minecraft.client.gui.widget.ButtonWidget;

public class Helper301 {
   public static boolean proxyEnabled = false;
   public static Helper29 proxy = new Helper29();
   public static Helper29 lastUsedProxy = new Helper29();
   public static ButtonWidget proxyMenuButton;

   public Helper301() {
   }

   public static String method2984() {
      return lastUsedProxy.ipPort.isEmpty() ? "none" : lastUsedProxy.method476();
   }
}
