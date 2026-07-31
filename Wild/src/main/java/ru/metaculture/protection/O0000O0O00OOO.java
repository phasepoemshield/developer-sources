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

public class O0000O0O00OOO {
   private static final int O00000000 = 16;
   private static final ExecutorService O000000000 = Executors.newFixedThreadPool(2, runnable -> {
      Thread var1 = new Thread(runnable, "Wild-Audio");
      var1.setDaemon(true);
      return var1;
   });
   private static final List<Clip> O0000000000 = Collections.synchronizedList(new ArrayList<>());
   private static volatile Clip O00000000000 = null;

   public static void O00000000() {
      try {
         synchronized (O0000000000) {
            for (Clip var2 : O0000000000) {
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

            O0000000000.clear();
         }

         Clip var9 = O00000000000;
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

         O00000000000 = null;
         O000000000.shutdownNow();
         O000000000.awaitTermination(500L, TimeUnit.MILLISECONDS);
      } catch (Throwable var8) {
      }
   }

   public static void O00000000(String string, float f, boolean bl) {
      Clip var3 = O00000000000;
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

      String var4 = "/assets/" + "wild" + "/sound/mp3/" + string;
      O000000000.submit(() -> {
         try {
            try (
               InputStream var3x = WildClient.class.getResourceAsStream(var4);
               BufferedInputStream var4x = var3x != null ? new BufferedInputStream(var3x) : null;
               AudioInputStream var5x = var4x != null ? AudioSystem.getAudioInputStream(var4x) : null;
            ) {
               if (var5x != null) {
                  Clip var6 = AudioSystem.getClip();
                  var6.open(var5x);
                  O00000000000 = var6;

                  try {
                     FloatControl var7 = (FloatControl)var6.getControl(Type.MASTER_GAIN);
                     float var8 = var7.getMinimum();
                     float var9 = var7.getMaximum();
                     float var10 = (float)(var8 * (1.0 - f / 100.0) + var9 * (f / 100.0));
                     var7.setValue(var10);
                  } catch (Throwable var14) {
                  }

                  if (bl) {
                     var6.addLineListener(lineEvent -> {
                        if (lineEvent.getType() == javax.sound.sampled.LineEvent.Type.STOP) {
                           if (var6 == O00000000000) {
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
                     var6.addLineListener(lineEvent -> {
                        if (lineEvent.getType() == javax.sound.sampled.LineEvent.Type.STOP) {
                           try {
                              if (var6.isOpen()) {
                                 var6.close();
                              }
                           } catch (Throwable var3xx) {
                           }

                           if (var6 == O00000000000) {
                              O00000000000 = null;
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

   public static void O00000000(String string, float f) {
      synchronized (O0000000000) {
         for (int var3 = O0000000000.size() - 1; var3 >= 0; var3--) {
            Clip var4 = O0000000000.get(var3);
            if (var4 == null) {
               O0000000000.remove(var3);
            } else if (!var4.isRunning()) {
               try {
                  if (var4.isOpen()) {
                     var4.close();
                  }
               } catch (Throwable var7) {
               }

               O0000000000.remove(var3);
            }
         }
      }

      Objects.requireNonNull(WildClient.O00000000);
      String var9 = "/assets/" + "wild" + "/sound/wav/" + string + ".wav";
      O000000000.submit(() -> {
         try {
            try (
               InputStream var2 = O0000O0O00OOO.class.getResourceAsStream(var9);
               BufferedInputStream var3x = var2 != null ? new BufferedInputStream(var2) : null;
               AudioInputStream var4x = var3x != null ? AudioSystem.getAudioInputStream(var3x) : null;
            ) {
               if (var4x != null) {
                  Clip var5 = AudioSystem.getClip();
                  var5.open(var4x);
                  float var6 = f < 0.0F ? 0.0F : Math.min(1.0F, f);

                  try {
                     FloatControl var7x = (FloatControl)var5.getControl(Type.MASTER_GAIN);
                     double var8 = var6 <= 0.0F ? -80.0 : Math.log(var6) / Math.log(10.0) * 20.0;
                     var7x.setValue((float)var8);
                  } catch (Throwable var15) {
                  }

                  var5.addLineListener(lineEvent -> {
                     if (lineEvent.getType() == javax.sound.sampled.LineEvent.Type.STOP) {
                        try {
                           if (var5.isOpen()) {
                              var5.close();
                           }
                        } catch (Throwable var5x) {
                        }

                        synchronized (O0000000000) {
                           O0000000000.remove(var5);
                        }
                     }
                  });
                  synchronized (O0000000000) {
                     while (O0000000000.size() >= 16) {
                        Clip var22 = O0000000000.remove(0);

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

                     O0000000000.add(var5);
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
      Runtime.getRuntime().addShutdownHook(new Thread(O0000O0O00OOO::O00000000, "Wild-SoundUtil-Shutdown"));
   }
}
