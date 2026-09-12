package Nursultan;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.EXTThreadLocalContext;

public class class11886 {
   private static String[] B;
   public static Object N_0 = LogManager.getLogger(String.class);
   public static Object N_1;
   public static Object N_2 = Executors.newSingleThreadExecutor(var0 -> {
      Thread var1 = new Thread(var0, B[6]);
      var1.setDaemon(true);
      return var1;
   });
   public static Object N_3 = new class11932();
   public static Object N_4 = new HashMap();
   public static Object N_5 = new ArrayList();
   public static Object N_6;
   public static Object N_7;

   private static float L() {
      return class11938.u().NB().m().i() / 100.0F;
   }

   private static boolean M() {
      return !class11938.u().NB().U();
   }

   private class11886() {
      throw new UnsupportedOperationException(B[5]);
   }

   static {
      U();
      N();
   }

   private static int B() {
      for (int var1 : (List)N_5) {
         if (AL10.alGetSourcei(var1, 4112) != 4114) {
            return var1;
         }
      }

      if (((List)N_5).size() < 16) {
         int var3 = AL10.alGenSources();
         if (var3 != 0) {
            ((List)N_5).add(var3);
         }

         return var3;
      } else {
         int var2 = (Integer)((List)N_5).getFirst();
         AL10.alSourceStop(var2);
         return var2;
      }
   }

   private static boolean i() {
      if ((Boolean)N_6) {
         return true;
      } else if ((Boolean)N_7) {
         return false;
      } else {
         try {
            long var0 = ALC10.alcOpenDevice((ByteBuffer)null);
            if (var0 == 0L) {
               N_7 = true;
               ((Logger)N_0).error(B[1]);
               return false;
            } else {
               long var2 = ALC10.alcCreateContext(var0, (IntBuffer)null);
               if (var2 == 0L) {
                  N_7 = true;
                  ((Logger)N_0).error(B[2]);
                  ALC10.alcCloseDevice(var0);
                  return false;
               } else {
                  ALCCapabilities var4 = ALC.createCapabilities(var0);
                  if (var4.ALC_EXT_thread_local_context ? !EXTThreadLocalContext.alcSetThreadContext(var2) : !ALC10.alcMakeContextCurrent(var2)) {
                     N_7 = true;
                     ((Logger)N_0).error(B[3]);
                     ALC10.alcDestroyContext(var2);
                     ALC10.alcCloseDevice(var0);
                     return false;
                  } else {
                     AL.createCapabilities(var4);
                     N_6 = true;
                     return true;
                  }
               }
            }
         } catch (Throwable var5) {
            N_7 = true;
            ((Logger)N_0).error(B[4], var5);
            return false;
         }
      }
   }

   private static void U() {
      B = new String[7];
      B[0] = "Failed to load sound";
      B[1] = "Failed to open OpenAL device";
      B[2] = "Failed to create OpenAL context";
      B[3] = "Failed to make OpenAL context current";
      B[4] = "Failed to initialize OpenAL sound backend";
      B[5] = "This is a utility class and cannot be instantiated";
      B[6] = "nursultan-sound";
   }

   private static void y(String var0, class11916 var1, float var2) {
      if (i()) {
         Integer var3 = (Integer)((Map)N_4).get(var0);
         if (var3 == null) {
            var3 = N(var1);
            if (var3 == null) {
               return;
            }

            ((Map)N_4).put(var0, var3);
         }

         int var4 = B();
         if (var4 != 0) {
            AL10.alSourcei(var4, 4105, var3);
            AL10.alSourcef(var4, 4106, var2);
            AL10.alSourcePlay(var4);
         }
      }
   }

   public static void y(Path var0) {
      if (!M()) {
         N(var0.toString(), () -> Files.newInputStream(var0));
      }
   }

   private static Integer N(class11916 var0) {
      try {
         Integer var4;
         try (InputStream var1 = var0.open()) {
            class11885 var2 = ((class11932)N_3).N(var1);
            int var3 = AL10.alGenBuffers();
            AL10.alBufferData(var3, N(var2.L(), var2.y()), var2.u(), var2.N());
            var4 = var3;
         }

         return var4;
      } catch (Exception var7) {
         ((Logger)N_0).error(B[0], var7);
         return null;
      }
   }

   public static void N(class11901 var0) {
      if (!M()) {
         N(var0.name(), var0::N);
         class11938.L().L(new class11369(var0));
      }
   }

   private static int N(int var0, int var1) {
      boolean var2 = var1 == 8;
      if (var0 == 1) {
         return var2 ? 4352 : 4353;
      } else {
         return var2 ? 4354 : 4355;
      }
   }

   private static void N() {
      N_1 = 16;
      N_6 = false;
      N_7 = false;
   }

   public static void N(Path var0) {
      String var1 = var0.toString();
      ((ExecutorService)N_2).execute(() -> {
         Integer var1x = (Integer)((Map)N_4).remove(var1);
         if (var1x != null) {
            AL10.alDeleteBuffers(var1x);
         }
      });
   }

   private static void N(String var0, class11916 var1) {
      float var2 = L();
      ((ExecutorService)N_2).execute(() -> y(var0, var1, var2));
   }
}
