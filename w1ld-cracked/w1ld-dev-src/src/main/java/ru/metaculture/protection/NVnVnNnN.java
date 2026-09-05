package ru.metaculture.protection;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import java.util.stream.Stream;
import lombok.Generated;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3264;
import net.minecraft.class_3300;
import net.minecraft.class_3302.class_4045;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;
import org.lwjgl.glfw.GLFW;
import org.wild.module.api.Module;
import ru.metaculture.profile.Profile;
import ru.metaculture.sdk.NotCompile;

public class NVnVnNnN implements ClientModInitializer {
   public static NVnVnNnN UuUVuuUu;
   public uVvnVvvUVUv C00OOC00oO;
   private static final File uVUVnuvnuVuv = new File(System.getProperty("wild.root", "C:/WildClient"));
   public final String uUnuvNvvNU = "Wild";
   public final String vVvUvVVuuNvV = "v1";
   public final String uNNnnnuuuN = "1.21.8";
   public final File nuUnNvnuUu = uVUVnuvnuVuv;
   public final File VVuuUN = this.nuUnNvnuUu;
   public final String vNUvnnVnUvu = "wild";
   public boolean uVUuuVnNVU = false;
   public static String vuuuNvNuv = null;
   public VVNUvNvu nvUVNnuu;
   public UvNvVnU UuuNnUvUuv;
   public NnunnNUUUNVn nUUVuvU;
   public uNvUVUNvuUVV UnUNVVVNuv;
   public nNVvvnU vNVuvnUUnuUn;
   public nuUnNNVUUnU UvnvNVnnnnNU;
   private final vnnUnvVV NVNnnvnuunNv = new vnnUnvVV();
   private o0CO000c0 uVunuUNVVUUV;
   private vUUvvNUVNvNU UNnVVNvvnVvU;
   private static vnuUvuuNVNUU uNnUnnuNUnNu;
   private static UnVNvNnU NnUuNNU;
   private static nUVnuvUu nNvNUVU;
   static volatile boolean UnUNuUU = false;
   private static volatile boolean uUVuVvuNUvnu = false;
   private static volatile boolean UvUvUNuvNU = false;
   private static volatile Thread c0oOOCcCoC0;
   private static volatile boolean VVnVNnunVvu = false;
   private static int unNNVVNnvvV = -1;
   private static int NuunnvnN = -1;
   private static final long NVUunUNUN = 8000L;
   private static final long UUVNuUNUvUnV = 10000L;
   private static volatile boolean vuvnUnVnUNnV = false;
   private String nnuUVNUuvvVU = ".";

   public static UnVNvNnU UuUVuuUu() {
      uVUuuVnNVU();
      return NnUuNNU;
   }

   public static File C00OOC00oO() {
      return uVUVnuvnuVuv;
   }

   public static vnuUvuuNVNUU uUnuvNvvNU() {
      uVUuuVnNVU();
      return uNnUnnuNUnNu;
   }

   public static void UuUVuuUu(int var0, int var1) {
      unNNVVNnvvV = var0;
      NuunnvnN = var1;
      vvUnNVVnV.UuUVuuUu().uNNnnnuuuN();
      NnUuNVvUvvNn.uUnuvNvvNU();
      if (uNnUnnuNUnNu != null) {
         uNnUnnuNUnNu.uNNnnnuuuN(var0, var1);
      }

      nuVUnVnVvV.UuUVuuUu().UuUVuuUu(var0, var1);
      oocOO0CCC0O.UuUVuuUu().C00OOC00oO(var0, var1);
      NNUuUVvUUU.UuUVuuUu().UuUVuuUu(var0, var1);
      VVnVVnvnNuUn.UuUVuuUu().UuUVuuUu(var0, var1);
      uUvNNnvNvN.UuUVuuUu().UuUVuuUu(var0, var1);
      vuNUvnNUuV.UuUVuuUu().UuUVuuUu(var0, var1);

      try {
         OoCO0OO0OcO.UuUVuuUu().UuUVuuUu(var0, var1);
      } catch (Throwable var8) {
      }

      try {
         UnuNNUnvu.UuUVuuUu().UuUVuuUu(var0, var1);
      } catch (Throwable var7) {
      }

      try {
         uVvVnUU.UuUVuuUu().vVvUvVVuuNvV();
      } catch (Throwable var6) {
      }

      try {
         nvVnuNNvUuvv.uNNnnnuuuN();
      } catch (Throwable var5) {
      }

      try {
         if (O000c0oocoo.a_ != null && O000c0oocoo.a_.field_1755 instanceof VvVVnnNNNuV var2) {
            var2.UuUVuuUu(var0, var1);
         }
      } catch (Throwable var4) {
      }

      if (UuUVuuUu != null && UuUVuuUu.UvnvNVnnnnNU != null) {
         UuUVuuUu.UvnvNVnnnnNU.UuUVuuUu(var0, var1);
      }
   }

   @NotCompile
   public static void UuUVuuUu(boolean var0) {
      vvUnNVVnV.UuUVuuUu().uNNnnnuuuN();
      if (!var0) {
         if (uNnUnnuNUnNu != null) {
            uNnUnnuNUnNu.uNNnnnuuuN(0, 0);
         }

         nuVUnVnVvV.UuUVuuUu().UuUVuuUu(0, 0);
      } else if (O000c0oocoo.a_ != null && O000c0oocoo.a_.method_22683() != null) {
         int var1 = O000c0oocoo.a_.method_22683().method_4489();
         int var2 = O000c0oocoo.a_.method_22683().method_4506();
         if (var1 == unNNVVNnvvV && var2 == NuunnvnN) {
            unNNVVNnvvV = var1;
            NuunnvnN = var2;
            vvUnNVVnV.UuUVuuUu().uNNnnnuuuN();
            if (uNnUnnuNUnNu != null) {
               uNnUnnuNUnNu.uNNnnnuuuN(var1, var2);
            }

            nuVUnVnVvV.UuUVuuUu().UuUVuuUu(var1, var2);
         } else {
            UuUVuuUu(var1, var2);
         }
      }

      oocOO0CCC0O.UuUVuuUu().UuUVuuUu(var0);
      NNUuUVvUUU.UuUVuuUu().UuUVuuUu(var0);
      VVnVVnvnNuUn.UuUVuuUu().UuUVuuUu(var0);
      if (UuUVuuUu != null && UuUVuuUu.UvnvNVnnnnNU != null) {
         UuUVuuUu.UvnvNVnnnnNU.UuUVuuUu(var0);
      }
   }

   @NotCompile
   public void onInitializeClient() {
      UuUVuuUu = this;
      UuUVuuUu(this::NVUunUNUN);
      UuUVuuUu(unnNUVnUnv::UuUVuuUu);
      UuUVuuUu(this::nnuUVNUuvvVU);
      UuUVuuUu((Runnable)(() -> vuuuNvNuv = Profile.getUsername()));
      this.C00OOC00oO = UuUVuuUu(uVvnVvvUVUv::new);
      this.UnUNVVVNuv = UuUVuuUu(uNvUVUNvuUVV::new);
      this.nUUVuvU = UuUVuuUu(NnunnNUUUNVn::new);
      this.nvUVNnuu = UuUVuuUu(VVNUvNvu::new);
      this.UuuNnUvUuv = UuUVuuUu(UvNvVnU::new);
      if (this.UuuNnUvUuv != null) {
         UuUVuuUu(this.UuuNnUvUuv::UuUVuuUu);
      }

      if (this.nvUVNnuu != null) {
         UuUVuuUu(this.nvUVNnuu::UuUVuuUu);
      }

      UuUVuuUu((Runnable)(() -> NUNUnUuNNuuN.UuUVuuUu(class_310.method_1551())));
      UuUVuuUu(nuVnVuunU::UuUVuuUu);
      UuUVuuUu((Runnable)(() -> ocoOOOoc.UuUVuuUu(class_310.method_1551())));
      UuUVuuUu((Runnable)(() -> NUvnVVNvvu.UuUVuuUu(UVVNuuUvuu.class)));
      UuUVuuUu(this::vuuuNvNuv);
      if (this.nvUVNnuu != null) {
         UuUVuuUu((Runnable)(() -> {
            UUVNUUUnNUv.NVuNUuVnVUN = this.nvUVNnuu.C00OOC00oO();
            UUVNUUUnNUv.NVuunNnvvvVu = this.nvUVNnuu.C00OOC00oO();
            UUVNUUUnNUv.VUuuVUnun = this.nvUVNnuu.uUnuvNvvNU();
         }));
      }

      UuUVuuUu(UuvvNVnu::UuUVuuUu);
      UuUVuuUu(vnnNNUNNVV::UuUVuuUu);
      UuUVuuUu(this.NVNnnvnuunNv::UuUVuuUu);
      UuUVuuUu((Runnable)(() -> VnVvnNNuVuUu.UuUVuuUu().C00OOC00oO()));
      if (this.nUUVuvU != null) {
         UuUVuuUu((Runnable)(() -> {
            this.nUUVuvU.C00OOC00oO();
            if (this.nUUVuvU.uUnuvNvvNU("default") != null) {
               this.nUUVuvU.UuUVuuUu("default");
            }
         }));
      }

      UuUVuuUu(VvNvUNnUuUv::UuUVuuUu);
      UuUVuuUu(uNvNvUNUnuu::UuUVuuUu);
      UuUVuuUu(this::nVVUuvuNnUN);
      UuUVuuUu((Runnable)(() -> {
         UnVNvNnU.UuUVuuUu = cCOo0cOcO::UuUVuuUu;
         UnVNvNnU.C00OOC00oO = cCOo0cOcO::C00OOC00oO;
      }));
      UuUVuuUu((Runnable)(() -> Runtime.getRuntime().addShutdownHook(new Thread(NVnVnNnN::nNnVnUNVV, "Wild-Client-Shutdown"))));
      this.vNVuvnUUnuUn = UuUVuuUu(nNVvvnU::new);
      this.UvnvNVnnnnNU = UuUVuuUu(nuUnNNVUUnU::new);
      UuUVuuUu((Runnable)(() -> oocOO0CCC0O.UuUVuuUu().C00OOC00oO()));
      UuUVuuUu(NvuUNuUnUUVv::UuUVuuUu);
      UuUVuuUu((Runnable)(() -> NUvnVVNvvu.UuUVuuUu(this)));
      UuUVuuUu(this::UUVNuUNUvUnV);
      UuUVuuUu(this::vuvnUnVnUNnV);
      if (this.C00OOC00oO != null && this.nUUVuvU != null && this.nvUVNnuu != null && this.UuuNnUvUuv != null) {
         uUVuVvuNUvnu = true;
         VUUnVnVNNU.UuUVuuUu();
      }
   }

   public nuUnNNVUUnU vVvUvVVuuNvV() {
      if (this.UvnvNVnnnnNU == null) {
         this.UvnvNVnnnnNU = UuUVuuUu(nuUnNNVUUnU::new);
      }

      return this.UvnvNVnnnnNU;
   }

   private static <T> T UuUVuuUu(Supplier<T> var0) {
      try {
         return (T)var0.get();
      } catch (nvUnvV var2) {
         throw VUUnVnVNNU.UuUVuuUu(var2);
      } catch (Throwable var3) {
         System.out.println("[Client] init failed: " + var3.getClass().getSimpleName() + ": " + var3.getMessage());
         return null;
      }
   }

   @NotCompile
   private void NVUunUNUN() {
      if (!uVUVnuvnuVuv.exists() && !uVUVnuvnuVuv.mkdirs()) {
         System.out.println("[Client] cannot create root directory: " + uVUVnuvnuVuv.getAbsolutePath());
      } else {
         File var1 = new File(FabricLoader.getInstance().getGameDir().toFile(), "Wild");
         UuUVuuUu(var1.toPath(), uVUVnuvnuVuv.toPath());
      }
   }

   private static void UuUVuuUu(Path var0, Path var1) {
      try {
         if (var0 == null || var1 == null || !Files.isDirectory(var0) || Files.isSameFile(var0, var1)) {
            return;
         }
      } catch (IOException var8) {
         return;
      }

      try (Stream var2 = Files.walk(var0)) {
         var2.forEach(var2x -> {
            try {
               Path var3 = var0.relativize(var2x);
               Path var4 = var1.resolve(var3);
               if (Files.isDirectory(var2x)) {
                  Files.createDirectories(var4);
               } else if (!Files.exists(var4)) {
                  Path var5 = var4.getParent();
                  if (var5 != null) {
                     Files.createDirectories(var5);
                  }

                  Files.copy(var2x, var4, StandardCopyOption.COPY_ATTRIBUTES);
               }
            } catch (Throwable var6) {
            }
         });
      } catch (Throwable var7) {
      }
   }

   public static void UuUVuuUu(class_310 var0) {
      if (var0 != null && var0.method_22683() != null && GLFW.glfwGetCurrentContext() != 0L) {
         int var1 = var0.method_22683().method_4489();
         int var2 = var0.method_22683().method_4506();
         if (!var0.method_22683().method_65966() && var1 > 0 && var2 > 0) {
            try {
               uVUuuVnNVU();
            } catch (Throwable var4) {
               return;
            }

            if (unNNVVNnvvV != var1 || NuunnvnN != var2) {
               UuUVuuUu(var1, var2);
            }
         }
      }
   }

   private static void UuUVuuUu(Runnable var0) {
      try {
         var0.run();
      } catch (nvUnvV var2) {
         throw VUUnVnVNNU.UuUVuuUu(var2);
      } catch (Throwable var3) {
      }
   }

   @NotCompile
   private void UUVNuUNUvUnV() {
      try {
         ResourceManagerHelper.get(class_3264.field_14188).registerReloadListener(new IdentifiableResourceReloadListener() {
            private final class_2960 UuUVuuUu = class_2960.method_60655("wild", "font_reload");

            public class_2960 UuUVuuUu() {
               return this.UuUVuuUu;
            }

            public CompletableFuture<Void> UuUVuuUu(class_4045 var1, class_3300 var2x, Executor var3, Executor var4) {
               return CompletableFuture.completedFuture(null).<Object>thenCompose(var1::method_18352).thenAcceptAsync(var0 -> {
                  class_310 var1x = class_310.method_1551();
                  if (var1x != null) {
                     var1x.execute(() -> {
                        try {
                           if (NVnVnNnN.UnUNuUU) {
                              vNvnnVvvVUu.UuUVuuUu();
                           }
                        } catch (Throwable var1xx) {
                        }
                     });
                  }
               }, var4);
            }
         });
      } catch (Throwable var2) {
      }
   }

   @NotCompile
   private void vuvnUnVnUNnV() {
      try {
         ResourceManagerHelper.get(class_3264.field_14188).registerReloadListener(new IdentifiableResourceReloadListener() {
            private final class_2960 UuUVuuUu = class_2960.method_60655("wild", "theme_shader_reload");

            public class_2960 UuUVuuUu() {
               return this.UuUVuuUu;
            }

            public CompletableFuture<Void> UuUVuuUu(class_4045 var1, class_3300 var2x, Executor var3, Executor var4) {
               return CompletableFuture.completedFuture(null).<Object>thenCompose(var1::method_18352).thenAcceptAsync(var0 -> {
                  class_310 var1x = class_310.method_1551();
                  if (var1x != null) {
                     var1x.execute(() -> {
                        try {
                           COCc00CCc.UuUVuuUu();
                        } catch (Throwable var9) {
                        }

                        try {
                           UNnnUuUuuNuN.C00OOC00oO();
                        } catch (Throwable var8) {
                        }

                        try {
                           UNnnUuUuuNuN.UuUVuuUu();
                        } catch (Throwable var7) {
                        }

                        try {
                           uVvVnUU.UuUVuuUu().vVvUvVVuuNvV();
                        } catch (Throwable var6) {
                        }

                        try {
                           nvVnuNNvUuvv.uNNnnnuuuN();
                        } catch (Throwable var5) {
                        }

                        try {
                           uUvNNnvNvN.UuUVuuUu().close();
                        } catch (Throwable var4x) {
                        }

                        try {
                           vuNUvnNUuV.UuUVuuUu().close();
                        } catch (Throwable var3x) {
                        }

                        try {
                           OoCO0OO0OcO.UuUVuuUu().UuUVuuUu(0, 0);
                        } catch (Throwable var2xx) {
                        }

                        try {
                           UnuNNUnvu.UuUVuuUu().UuUVuuUu(0, 0);
                        } catch (Throwable var1xx) {
                        }
                     });
                  }
               }, var4);
            }
         });
      } catch (Throwable var2) {
      }
   }

   @NotCompile
   private void nnuUVNUuvvVU() {
      String var1 = System.getProperty("wild.loader.pid");
      if (var1 == null || var1.isBlank()) {
         var1 = System.getenv("WILD_LOADER_PID");
      }

      if (var1 != null && !var1.isBlank()) {
         try {
            long var2 = Long.parseLong(var1.trim());
            long var4 = ProcessHandle.current().pid();
            if (var2 <= 0L || var2 == var4) {
               return;
            }

            ProcessHandle.of(var2).ifPresent(var0 -> {
               if (var0.isAlive()) {
                  var0.destroy();
               }
            });
         } catch (Throwable var6) {
         }
      }
   }

   @NotCompile
   private void nVVUuvuNnUN() {
      Configurator.setLevel("com.mojang.authlib.yggdrasil.YggdrasilServicesKeyInfo", Level.OFF);
      Configurator.setLevel("net.minecraft.client.texture.PlayerSkinProvider", Level.ERROR);
      Configurator.setLevel("net.minecraft.client.network.ClientPlayNetworkHandler", Level.ERROR);
      Configurator.setLevel("net.minecraft.client.world.ClientChunkManager", Level.ERROR);
      Configurator.setLevel("net.minecraft.block.entity.BlockEntity", Level.ERROR);
   }

   @NotCompile
   public static void uNNnnnuuuN() {
      if (!VVnVNnunVvu) {
         VVnVNnunVvu = true;
         System.out.println("[Wild] shutdown: begin");
         UuUVuuUu((Runnable)(() -> {
            if (UuUVuuUu != null && UuUVuuUu.nUUVuvU != null) {
               UuUVuuUu.nUUVuvU.vVvUvVVuuNvV();
            }
         }));
         UuUVuuUu(VvNvUNnUuUv::uUnuvNvvNU);
         UuUVuuUu(NVnVnNnN::uUVVvVVNvvn);
         UuUVuuUu(vnnUnvVV::C00OOC00oO);
         UuUVuuUu(vUUvvNUVNvNU::C00OOC00oO);
         UuUVuuUu(UuvvNVnu::C00OOC00oO);
         UuUVuuUu((Runnable)(() -> {
            Thread var0 = c0oOOCcCoC0;
            c0oOOCcCoC0 = null;
            UvUvUNuvNU = false;
            if (var0 != null) {
               var0.interrupt();
            }
         }));
         UuUVuuUu(uUNNNVNVvNV::UuUVuuUu);
         UuUVuuUu(UVVNuuUvuu::nuUnNvnuUu);
         UuUVuuUu(AutoBuy::NnUuNNU);
         UuUVuuUu(VuUvvnuUu::UnUNuUU);
         UuUVuuUu(NuUvVVvUVVUV::C00OOC00oO);
         UuUVuuUu(nUNvUnnVN::C00OOC00oO);
         UuUVuuUu(VVVVUN::UvnvNVnnnnNU);
         UuUVuuUu(VVUuNVVnNVUV::vVvUvVVuuNvV);
         UuUVuuUu(nNvunNUnV::uUnuvNvvNU);
         UuUVuuUu(VUnUUUVVnvVV::uUnuvNvvNU);
         UuUVuuUu(vnnunVnunuN::UuUVuuUu);
         UuUVuuUu(HitSounds::UuuNnUvUuv);
         UuUVuuUu(VnVnuUn::C00OOC00oO);
         UuUVuuUu((Runnable)(() -> uUvNNnvNvN.UuUVuuUu().close()));
         UuUVuuUu((Runnable)(() -> vuNUvnNUuV.UuUVuuUu().close()));
         UuUVuuUu(uVvVnUU.UuUVuuUu()::vVvUvVVuuNvV);
         UuUVuuUu((Runnable)(() -> NnUuNVvUvvNn.uUnuvNvvNU()));
         System.out.println("[Wild] shutdown: done");
      }
   }

   @NotCompile
   private static void nNnVnUNVV() {
      UuUVuuUu(8000L, "shutdown hook");
      uNNnnnuuuN();
   }

   @NotCompile
   public static void nuUnNvnuUu() {
      UuUVuuUu(10000L, "stop() returned without System.exit");
   }

   private static synchronized void UuUVuuUu(long var0, String var2) {
      if (!vuvnUnVnUNnV) {
         vuvnUnVnUNnV = true;
         Thread var3 = new Thread(() -> {
            try {
               Thread.sleep(var0);
            } catch (InterruptedException var4) {
               Thread.currentThread().interrupt();
               return;
            }

            System.out.println("[Wild] shutdown: process still alive " + var0 + "ms after " + var2);
            nuunNvv();
            System.out.println("[Wild] shutdown: force-exit failsafe -> halt(0)");
            Runtime.getRuntime().halt(0);
         }, "Wild-ForceExit-Watchdog");
         var3.setDaemon(true);
         var3.setPriority(10);
         var3.start();
      }
   }

   private static void nuunNvv() {
      try {
         for (Entry var1 : Thread.getAllStackTraces().entrySet()) {
            Thread var2 = (Thread)var1.getKey();
            if (var2 != null && !var2.isDaemon() && var2.isAlive() && var2 != Thread.currentThread()) {
               StackTraceElement[] var3 = (StackTraceElement[])var1.getValue();
               StringBuilder var4 = new StringBuilder("[Wild] shutdown: blocking thread \"").append(var2.getName()).append("\" state=").append(var2.getState());
               int var5 = Math.min(6, var3 == null ? 0 : var3.length);

               for (int var6 = 0; var6 < var5; var6++) {
                  var4.append(System.lineSeparator()).append("    at ").append(var3[var6]);
               }

               System.out.println(var4);
            }
         }
      } catch (Throwable var7) {
      }
   }

   private static void uUVVvVVNvvn() {
      if (UuUVuuUu != null && UuUVuuUu.C00OOC00oO != null && UuUVuuUu.C00OOC00oO.UuUVuuUu != null) {
         for (Module var1 : UuUVuuUu.C00OOC00oO.UuUVuuUu) {
            if (var1 != null && var1.nuUnNvnuUu) {
               try {
                  var1.nuUnNvnuUu = false;
                  var1.C00OOC00oO();
               } catch (Throwable var3) {
               }
            }
         }
      }
   }

   public static void VVuuUN() {
      if (!UvUvUNuvNU) {
         synchronized (NVnVnNnN.class) {
            if (UvUvUNuvNU) {
               return;
            }

            UvUvUNuvNU = true;
         }

         Thread var3 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
               try {
                  double var0 = UVVNuuUvuu.UuUVuuUu();
                  if (var0 <= 0.0) {
                     var0 = 20.0;
                  }

                  double var2 = 1.0 / var0;
                  long var4 = (long)(var2 * 1000.0);
                  class_310 var6 = class_310.method_1551();
                  if (var6 != null && !var6.method_18854()) {
                     var6.execute(() -> NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)(new uNNNVVvnnNUN())));
                  } else {
                     NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)(new uNNNVVvnnNUN()));
                  }

                  Thread.sleep(Math.max(var4, 1L));
               } catch (nvUnvV var8) {
                  throw VUUnVnVNNU.UuUVuuUu(var8);
               } catch (InterruptedException var9) {
                  Thread.currentThread().interrupt();
                  break;
               } catch (Throwable var10) {
                  try {
                     Thread.sleep(100L);
                  } catch (InterruptedException var7) {
                     Thread.currentThread().interrupt();
                     break;
                  }
               }
            }
         }, "TPS");
         var3.setDaemon(true);
         c0oOOCcCoC0 = var3;
         var3.start();
      }
   }

   public static boolean vNUvnnVnUvu() {
      NVnVnNnN var0 = UuUVuuUu;
      return var0 != null && var0.C00OOC00oO != null;
   }

   public static void uVUuuVnNVU() {
      if (!UnUNuUU) {
         vvUVNVvvNUv();
      }
   }

   private static synchronized void vvUVNVvvNUv() {
      if (!UnUNuUU) {
         if (GLFW.glfwGetCurrentContext() != 0L) {
            uNnUnnuNUnNu = new vnuUvuuNVNUU();
            NnUuNNU = new UnVNvNnU(uNnUnnuNUnNu);
            vNvnnVvvVUu.UuUVuuUu(uNnUnnuNUnNu, NnUuNNU);
            nNvNUVU = vNvnnVvvVUu.UuUVuuUu;
            UnUNuUU = true;
         }
      }
   }

   @NotCompile
   public void vuuuNvNuv() {
      this.uVunuUNVVUUV = new o0CO000c0();
   }

   public static void nvUVNnuu() {
      VUUnVnVNNU.UuUVuuUu();
      if (uUVuVvuNUvnu) {
         VvuuVNVUn.NVnVnNnN var0 = VvuuVNVUn.UuUVuuUu();

         try {
            if (O000c0oocoo.a_ == null || O000c0oocoo.a_.method_22683() == null) {
               return;
            }

            int var1 = O000c0oocoo.a_.method_22683().method_4489();
            int var2 = O000c0oocoo.a_.method_22683().method_4506();
            if (var1 <= 0 || var2 <= 0) {
               UuUVuuUu(var1, var2);
               return;
            }

            try {
               uVUuuVnNVU();
            } catch (Throwable var28) {
               return;
            }

            vvUnNVVnV.UuUVuuUu().C00OOC00oO();
            nNuUNVu var3 = nNuUNVu.UuUVuuUu();
            var3.UuUVuuUu(O000c0oocoo.a_, NnUuNNU, var1, var2);
            boolean var4 = false;

            try {
               NnUuNNU.UuUVuuUu(var1, var2);
               var4 = true;
               NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)(new uVNnNvUnNUNu(O000c0oocoo.a_, NnUuNNU, nNvNUVU, var1, var2)));
            } catch (Throwable var26) {
            } finally {
               if (var4) {
                  try {
                     NnUuNNU.C00OOC00oO();
                  } catch (Throwable var25) {
                     NnUuNNU.UuUVuuUu();
                  }
               }
            }
         } catch (Throwable var29) {
         } finally {
            VvuuVNVUn.uUnuvNvvNU(var0);
         }
      }
   }

   @Generated
   public uVvnVvvUVUv UuuNnUvUuv() {
      return this.C00OOC00oO;
   }

   @Generated
   public String nUUVuvU() {
      return "Wild";
   }

   @Generated
   public String UnUNVVVNuv() {
      return "v1";
   }

   @Generated
   public String vNVuvnUUnuUn() {
      return "1.21.8";
   }

   @Generated
   public File UvnvNVnnnnNU() {
      return this.nuUnNvnuUu;
   }

   @Generated
   public File uVUVnuvnuVuv() {
      return this.VVuuUN;
   }

   @Generated
   public String NVNnnvnuunNv() {
      return "wild";
   }

   @Generated
   public boolean uVunuUNVVUUV() {
      return this.uVUuuVnNVU;
   }

   @Generated
   public VVNUvNvu UNnVVNvvnVvU() {
      return this.nvUVNnuu;
   }

   @Generated
   public UvNvVnU uNnUnnuNUnNu() {
      return this.UuuNnUvUuv;
   }

   @Generated
   public NnunnNUUUNVn NnUuNNU() {
      return this.nUUVuvU;
   }

   @Generated
   public uNvUVUNvuUVV nNvNUVU() {
      return this.UnUNVVVNuv;
   }

   @Generated
   public nNVvvnU UnUNuUU() {
      return this.vNVuvnUUnuUn;
   }

   @Generated
   public vnnUnvVV uUVuVvuNUvnu() {
      return this.NVNnnvnuunNv;
   }

   @Generated
   public o0CO000c0 UvUvUNuvNU() {
      return this.uVunuUNVVUUV;
   }

   @Generated
   public vUUvvNUVNvNU c0oOOCcCoC0() {
      return this.UNnVVNvvnVvU;
   }

   @Generated
   public String VVnVNnunVvu() {
      return this.nnuUVNUuvvVU;
   }

   @Generated
   public void UuUVuuUu(uVvnVvvUVUv var1) {
      this.C00OOC00oO = var1;
   }

   @Generated
   public void C00OOC00oO(boolean var1) {
      this.uVUuuVnNVU = var1;
   }

   @Generated
   public void UuUVuuUu(VVNUvNvu var1) {
      this.nvUVNnuu = var1;
   }

   @Generated
   public void UuUVuuUu(UvNvVnU var1) {
      this.UuuNnUvUuv = var1;
   }

   @Generated
   public void UuUVuuUu(NnunnNUUUNVn var1) {
      this.nUUVuvU = var1;
   }

   @Generated
   public void UuUVuuUu(uNvUVUNvuUVV var1) {
      this.UnUNVVVNuv = var1;
   }

   @Generated
   public void UuUVuuUu(nNVvvnU var1) {
      this.vNVuvnUUnuUn = var1;
   }

   @Generated
   public void UuUVuuUu(nuUnNNVUUnU var1) {
      this.UvnvNVnnnnNU = var1;
   }

   @Generated
   public void UuUVuuUu(o0CO000c0 var1) {
      this.uVunuUNVVUUV = var1;
   }

   @Generated
   public void UuUVuuUu(vUUvvNUVNvNU var1) {
      this.UNnVVNvvnVvU = var1;
   }

   @Generated
   public static boolean unNNVVNnvvV() {
      return uUVuVvuNUvnu;
   }

   @Generated
   public static boolean NuunnvnN() {
      return VVnVNnunVvu;
   }

   @Generated
   public void UuUVuuUu(String var1) {
      this.nnuUVNUuvvVU = var1;
   }
}
