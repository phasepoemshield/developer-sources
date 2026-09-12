package Nursultan;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import minecraft.class00392;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06541;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.nfd.NFDFilterItem;
import org.lwjgl.util.nfd.NativeFileDialog;
import org.lwjgl.util.nfd.NFDFilterItem.Buffer;

@class11080(
   L = "ClientSounds",
   y = class11072.MISC,
   N = class11106.CLIENT
)
public class ClientSounds extends class11067 {
   public Object L_0;
   public Object L_1;
   public Object L_2;
   public Object L_3;
   public Object L_4;
   public Object L_5;
   public Object L_6;
   public static Object u_0 = LogManager.getLogger(String.class);

   public ClientSounds() {
      this.j();
      this.L_0 = class11524.N(this, "toggle-sounds", true);
      this.L_1 = new class11535("custom", false);
      this.L_2 = new class11535("default", true);
      this.L_3 = (class11517)class11524.N(this, "sound-type", (class11535)this.L_1, (class11535)this.L_2).N(var1 -> {
         this.j();
         return ((class11507)this.L_0).i();
      });
      this.L_4 = (class11532)class11524.N(this, "select-enable-sound", () -> this.y(false)).N(var1 -> {
         this.j();
         return ((class11535)this.L_1).U() && ((class11507)this.L_0).i();
      });
      this.L_5 = (class11532)class11524.N(this, "select-disable-sound", () -> this.y(true)).N(var1 -> {
         this.j();
         return ((class11535)this.L_1).U() && ((class11507)this.L_0).i();
      });
      this.L_6 = class11524.N(this, "volume", 100.0F, 50.0F, 100.0F, 1.0F);
   }

   static {
      s();
   }

   private static void s() {
      u_0 = null;
   }

   public class11504 m() {
      this.j();
      return (class11504)this.L_6;
   }

   private void j() {
   }

   private void y(boolean var1) {
      try {
         MemoryStack var2 = MemoryStack.stackPush();

         label116: {
            label124: {
               try {
                  Path var3 = Paths.get(System.getProperty("user.home"), "Downloads");
                  Buffer var4 = NFDFilterItem.malloc(1, var2);
                  ((NFDFilterItem)var4.get(0)).name(var2.UTF8("WAV files")).spec(var2.UTF8("wav"));
                  PointerBuffer var5 = var2.mallocPointer(1);
                  if (1 == NativeFileDialog.NFD_OpenDialog(var5, var4, var3.toAbsolutePath().toString())) {
                     long var6 = var5.get(0);
                     if (var6 == 0L) {
                        break label124;
                     }

                     try {
                        Path var9 = Paths.get(MemoryUtil.memUTF8(var6));
                        if (!N(var9)) {
                           break label116;
                        }

                        Path var10 = ((Path)class11518.N_0).resolve("sounds");
                        Files.createDirectories(var10);
                        String var11 = var1 ? "custom-disable-sound.wav" : "custom-enable-sound.wav";
                        Path var12 = var10.resolve(var11);
                        Files.copy(var9, var12, StandardCopyOption.REPLACE_EXISTING);
                        class11886.N(var12);
                     } finally {
                        NativeFileDialog.NFD_FreePath(var6);
                     }
                  }
               } catch (Throwable var20) {
                  if (var2 != null) {
                     try {
                        var2.close();
                     } catch (Throwable var18) {
                        var20.addSuppressed(var18);
                     }
                  }

                  throw var20;
               }

               if (var2 != null) {
                  var2.close();
               }

               return;
            }

            if (var2 != null) {
               var2.close();
            }

            return;
         }

         if (var2 != null) {
            var2.close();
         }
      } catch (Exception var21) {
         class11303.N(new class11288(this), (class00392)class11921.N("error-please-report").N(class06541.field_1061));
         ((Logger)u_0).error(var21, var21);
      }
   }

   private static boolean N(Path var0) {
      String var1 = var0.getFileName().toString();
      int var2 = var1.lastIndexOf(46);
      return var2 >= 0 && var1.substring(var2 + 1).equalsIgnoreCase("wav");
   }

   @class11782
   public void N(class11403 var1) {
      this.j();
      if (((class11507)this.L_0).i() && (class03448)((class06202)super.y_0).T_3 != null) {
         class11067 var2 = var1.N();
         if (var2.R().N()) {
            boolean var3 = var2.U();
            if (((class11535)this.L_2).U()) {
               class11886.N(
                  var3
                     ? (class11901)class11901.staticFields_0ec612a2dc0263a258b66e8d510834aaf[0]
                     : (class11901)class11901.staticFields_0ec612a2dc0263a258b66e8d510834aaf[1]
               );
            } else {
               Path var5 = ((Path)class11518.N_0).resolve("sounds").resolve(var3 ? "custom-enable-sound.wav" : "custom-disable-sound.wav");
               if (!Files.exists(var5)) {
                  class11303.N(new class11288(this), (class00392)class11921.N("sound-does-not-exist").N(class06541.field_1061));
               } else {
                  class11886.y(var5);
               }
            }
         }
      }
   }
}
