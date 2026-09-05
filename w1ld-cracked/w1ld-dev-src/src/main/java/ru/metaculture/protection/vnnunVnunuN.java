package ru.metaculture.protection;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.FloatControl.Type;

public class vnnunVnunuN {
   private static final int UuUVuuUu = 16;
   private static final ExecutorService C00OOC00oO = Executors.newFixedThreadPool(2, var0 -> {
      Thread var1 = new Thread(var0, "Wild-Audio");
      var1.setDaemon(true);
      return var1;
   });
   private static final List<Clip> uUnuvNvvNU = Collections.synchronizedList(new ArrayList<>());
   private static volatile Clip vVvUvVVuuNvV = null;

   public static void UuUVuuUu() {
      try {
         synchronized (uUnuvNvvNU) {
            for (Clip var2 : uUnuvNvvNU) {
               try {
                  if (var2 != null) {
                     if (var2.isRunning()) {
                        var2.stop();
                     }

                     if (var2.isOpen()) {
                        var2.close();
                     }
                  }
               } catch (Throwable var6) {
               }
            }

            uUnuvNvvNU.clear();
         }

         Clip var9 = vVvUvVVuuNvV;
         if (var9 != null) {
            try {
               if (var9.isRunning()) {
                  var9.stop();
               }

               if (var9.isOpen()) {
                  var9.close();
               }
            } catch (Throwable var5) {
            }
         }

         vVvUvVVuuNvV = null;
         C00OOC00oO.shutdownNow();
         C00OOC00oO.awaitTermination(500L, TimeUnit.MILLISECONDS);
      } catch (Throwable var8) {
      }
   }

   public static void UuUVuuUu(String var0, float var1, boolean var2) {
      Clip var3 = vVvUvVVuuNvV;
      if (var3 != null) {
         try {
            if (var3.isRunning()) {
               var3.stop();
            }

            if (var3.isOpen()) {
               var3.close();
            }
         } catch (Throwable var5) {
         }
      }

      String var4 = "/assets/" + "wild" + "/sound/mp3/" + var0;
      C00OOC00oO.submit(() -> {
         try {
            try (
               InputStream var3x = NVnVnNnN.class.getResourceAsStream(var4);
               BufferedInputStream var4x = var3x != null ? new BufferedInputStream(var3x) : null;
               AudioInputStream var5x = var4x != null ? AudioSystem.getAudioInputStream(var4x) : null;
            ) {
               if (var5x != null) {
                  Clip var6 = AudioSystem.getClip();
                  var6.open(var5x);
                  vVvUvVVuuNvV = var6;

                  try {
                     FloatControl var7 = (FloatControl)var6.getControl(Type.MASTER_GAIN);
                     float var8 = var7.getMinimum();
                     float var9 = var7.getMaximum();
                     float var10 = (float)(var8 * (1.0 - var1 / 100.0) + var9 * (var1 / 100.0));
                     var7.setValue(var10);
                  } catch (Throwable var14) {
                  }

                  if (var2) {
                     var6.addLineListener(var1xx -> {
                        if (var1xx.getType() == javax.sound.sampled.LineEvent.Type.STOP) {
                           if (var6 == vVvUvVVuuNvV) {
                              try {
                                 var6.setFramePosition(0);
                                 var6.start();
                              } catch (Throwable var4xx) {
                              }
                           } else {
                              try {
                                 if (var6.isOpen()) {
                                    var6.close();
                                 }
                              } catch (Throwable var3xx) {
                              }
                           }
                        }
                     });
                  } else {
                     var6.addLineListener(var1xx -> {
                        if (var1xx.getType() == javax.sound.sampled.LineEvent.Type.STOP) {
                           try {
                              if (var6.isOpen()) {
                                 var6.close();
                              }
                           } catch (Throwable var3xx) {
                           }

                           if (var6 == vVvUvVVuuNvV) {
                              vVvUvVVuuNvV = null;
                           }
                        }
                     });
                  }

                  var6.start();
                  return;
               }

               System.err.println("[SoundUtil] mp3 not found: " + var4);
            }
         } catch (Throwable var18) {
            System.err.println("[SoundUtil] mp3 error: " + var18);
         }
      });
   }

   public static void UuUVuuUu(String var0, float var1) {
      synchronized (uUnuvNvvNU) {
         for (int var3 = uUnuvNvvNU.size() - 1; var3 >= 0; var3--) {
            Clip var4 = uUnuvNvvNU.get(var3);
            if (var4 == null) {
               uUnuvNvvNU.remove(var3);
            } else if (!var4.isRunning()) {
               try {
                  if (var4.isOpen()) {
                     var4.close();
                  }
               } catch (Throwable var7) {
               }

               uUnuvNvvNU.remove(var3);
            }
         }
      }

      Objects.requireNonNull(NVnVnNnN.UuUVuuUu);
      String var9 = "/assets/" + "wild" + "/sound/wav/" + var0 + ".wav";
      C00OOC00oO.submit(() -> {
         try {
            try (
               InputStream var2 = vnnunVnunuN.class.getResourceAsStream(var9);
               BufferedInputStream var3x = var2 != null ? new BufferedInputStream(var2) : null;
               AudioInputStream var4x = var3x != null ? AudioSystem.getAudioInputStream(var3x) : null;
            ) {
               if (var4x != null) {
                  Clip var5 = AudioSystem.getClip();
                  var5.open(var4x);
                  float var6 = var1 < 0.0F ? 0.0F : Math.min(1.0F, var1);

                  try {
                     FloatControl var7x = (FloatControl)var5.getControl(Type.MASTER_GAIN);
                     double var8 = var6 <= 0.0F ? -80.0 : Math.log(var6) / Math.log(10.0) * 20.0;
                     var7x.setValue((float)var8);
                  } catch (Throwable var15) {
                  }

                  var5.addLineListener(var1xx -> {
                     if (var1xx.getType() == javax.sound.sampled.LineEvent.Type.STOP) {
                        try {
                           if (var5.isOpen()) {
                              var5.close();
                           }
                        } catch (Throwable var8x) {
                        }

                        List var2x = uUnuvNvvNU;
                        synchronized (uUnuvNvvNU){} // $VF: monitorenter 
                        boolean var6x = false /* VF: Semaphore variable */;

                        try {
                           var6x = true;
                           uUnuvNvvNU.remove(var5);
                           // $VF: monitorexit
                           var6x = false;
                        } finally {
                           if (var6x) {
                              // $VF: monitorexit
                           }
                        }
                     }
                  });
                  synchronized (uUnuvNvvNU) {
                     while (uUnuvNvvNU.size() >= 16) {
                        Clip var22 = uUnuvNvvNU.remove(0);

                        try {
                           if (var22.isRunning()) {
                              var22.stop();
                           }

                           if (var22.isOpen()) {
                              var22.close();
                           }
                        } catch (Throwable var14) {
                        }
                     }

                     uUnuvNvvNU.add(var5);
                  }

                  var5.start();
                  return;
               }
            }
         } catch (Throwable var20) {
            System.err.println("[SoundUtil] wav error: " + var20);
         }
      });
   }

   static {
      Runtime.getRuntime().addShutdownHook(new Thread(vnnunVnunuN::UuUVuuUu, "Wild-SoundUtil-Shutdown"));
   }
}
