package fat.releon.utils.client.window;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.win32.StdCallLibrary;
import java.lang.reflect.Method;
import java.util.Locale;
import l.SelfDestruct;

public class WindowStyle {
   public WindowStyle() {
   }

   public static void method234(long var0) {
      if (!SelfDestruct.unhooked) {
         if (method235()) {
            try {
               long var2 = method236(var0);
               if (var2 == 0L) {
                  return;
               }

               HWND var4 = new HWND(new Pointer(var2));
               byte var5 = 20;
               Memory var6 = new Memory(4L);
               var6.setInt(0L, 1);
               WindowStyle.DwmApi.INSTANCE.DwmSetWindowAttribute(var4, var5, var6, 4);
            } catch (Throwable var7) {
            }
         }
      }
   }

   private static boolean method235() {
      return System.getProperty("os.name", "").toLowerCase(Locale.ROOT).startsWith("windows");
   }

   private static long method236(long var0) throws Exception {
      Class var2 = Class.forName("org.lwjgl.glfw.GLFWNativeWin32");
      Method var3 = var2.getMethod("glfwGetWin32Window", long.class);
      return (Long)var3.invoke(null, var0);
   }

   public interface DwmApi extends StdCallLibrary {
      WindowStyle.DwmApi INSTANCE = (WindowStyle.DwmApi)Native.loadLibrary("dwmapi", WindowStyle.DwmApi.class);

      int DwmSetWindowAttribute(HWND var1, int var2, Pointer var3, int var4);
   }
}
