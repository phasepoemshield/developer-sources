package fun.nexisdlc.client.utils;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.win32.StdCallLibrary;
import org.lwjgl.glfw.GLFWNativeWin32;

public class DWMApi {

    private interface Dwmapi extends StdCallLibrary {
        Dwmapi INSTANCE = Native.load("dwmapi", Dwmapi.class);
        WinNT.HRESULT DwmSetWindowAttribute(WinDef.HWND hwnd, int dwAttribute, Pointer pvAttribute, int cbAttribute);
    }

    public static void setDarkMode(long glfwWindowHandle) {
        if (!setAttribute(glfwWindowHandle, 20, 1)) {
            setAttribute(glfwWindowHandle, 19, 1);
            setAttribute(glfwWindowHandle, 34, 0x00000000);
        }
    }

    public static void setLightMode(long glfwWindowHandle) {
        if (!setAttribute(glfwWindowHandle, 20, 0)) {
            setAttribute(glfwWindowHandle, 19, 0);
            setAttribute(glfwWindowHandle, 34, 0x00FFFFFF);
        }
    }

    private static boolean setAttribute(long glfwWindowHandle, int attribute, int value) {
        if (!System.getProperty("os.name").toLowerCase().contains("win")) return false;
        try {
            WinDef.HWND hwnd = new WinDef.HWND(new Pointer(GLFWNativeWin32.glfwGetWin32Window(glfwWindowHandle)));
            Pointer ptr = new Pointer(Native.malloc(4));
            ptr.setInt(0, value);
            WinNT.HRESULT result = Dwmapi.INSTANCE.DwmSetWindowAttribute(hwnd, attribute, ptr, 4);
            Native.free(Pointer.nativeValue(ptr));
            return result.equals(WinNT.S_OK);
        } catch (Exception e) {
            return false;
        }
    }
}
