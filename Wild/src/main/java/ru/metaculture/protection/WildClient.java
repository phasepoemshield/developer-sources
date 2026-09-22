package ru.metaculture.protection;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import java.util.stream.Stream;
import lombok.Generated;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.resource.ResourceReloader.Synchronizer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;
import org.lwjgl.glfw.GLFW;
import org.wild.module.api.Module;
import ru.metaculture.profile.Profile;
import ru.metaculture.sdk.NotCompile;

public class WildClient implements ClientModInitializer {
   public static WildClient O00000000;
   public ModuleManager O000000000;
   private static final File O0000000000OOO = new File(System.getProperty("wild.root", "C:/WildClient"));
   public final String O0000000000 = "Wild";
   public final String O00000000000 = "v1";
   public final String O000000000000 = "1.21.8";
   public final File O0000000000000 = O0000000000OOO;
   public final File O000000000000O = this.O0000000000000;
   public final String O00000000000O = "wild";
   public boolean O00000000000O0 = false;
   public static String O00000000000OO = null;
   public ThemeManager O0000000000O;
   public ListenerRegistry O0000000000O0;
   public ConfigManager O0000000000O00;
   public FriendCommand O0000000000O0O;
   public ClickGuiScreen O0000000000OO;
   public ModernClickGuiScreen O0000000000OO0;
   private final DiscordRpcManager O000000000O = new DiscordRpcManager();
   private CommandManager O000000000O0;
   private IrcWebSocketClient O000000000O00;
   private static RenderEngine O000000000O000;
   private static RenderManager O000000000O00O;
   private static FontObject O000000000O0O;
   static volatile boolean O000000000O0O0 = false;
   private static volatile boolean O000000000O0OO = false;
   private static volatile boolean O000000000OO = false;
   private static volatile Thread O000000000OO0;
   private static volatile boolean O000000000OO00 = false;
   private static int O000000000OO0O = -1;
   private static int O000000000OOO = -1;
   private static volatile boolean O000000000OOO0 = false;
   private String O000000000OOOO = ".";

   public static RenderManager O00000000() {
      O000000000000O();
      return O000000000O00O;
   }

   public static File O000000000() {
      return O0000000000OOO;
   }

   public static RenderEngine O0000000000() {
      O000000000000O();
      return O000000000O000;
   }

   public static void O00000000(int i, int j) {
      O000000000OO0O = i;
      O000000000OOO = j;
      O0000O00O0O000.O00000000().O000000000000();
      O0000O0O000OOO.O0000000000();
      if (O000000000O000 != null) {
         O000000000O000.O000000000000(i, j);
      }

      O0000O00OO000.O00000000().O00000000(i, j);
      BlurRenderer.O00000000().O000000000(i, j);
      O0000O0O00O0.O00000000().O00000000(i, j);
      O0000O0O00O00.O00000000().O00000000(i, j);
      O0000O0O00O000.O00000000().O00000000(i, j);
      O0000O0O000OO0.O00000000().O00000000(i, j);

      try {
         O0000O00000O.O00000000().O00000000(i, j);
      } catch (Throwable var8) {
      }

      try {
         O0000O00000O0.O00000000().O00000000(i, j);
      } catch (Throwable var7) {
      }

      try {
         O00000OOOO0O0.O00000000().O00000000000();
      } catch (Throwable var6) {
      }

      try {
         O00000OO0O0O0O.O000000000000();
      } catch (Throwable var5) {
      }

      try {
         if (MinecraftAccessor.a_ != null && MinecraftAccessor.a_.currentScreen instanceof MainMenuScreen var2) {
            var2.O00000000(i, j);
         }
      } catch (Throwable var4) {
      }

      if (O00000000 != null && O00000000.O0000000000OO0 != null) {
         O00000000.O0000000000OO0.O00000000(i, j);
      }
   }

   @NotCompile
   public static void O00000000(boolean bl) {
      O0000O00O0O000.O00000000().O000000000000();
      if (!bl) {
         if (O000000000O000 != null) {
            O000000000O000.O000000000000(0, 0);
         }

         O0000O00OO000.O00000000().O00000000(0, 0);
      } else if (MinecraftAccessor.a_ != null && MinecraftAccessor.a_.getWindow() != null) {
         O00000000(MinecraftAccessor.a_.getWindow().getFramebufferWidth(), MinecraftAccessor.a_.getWindow().getFramebufferHeight());
      }

      BlurRenderer.O00000000().O00000000(bl);
      O0000O0O00O0.O00000000().O00000000(bl);
      O0000O0O00O00.O00000000().O00000000(bl);
      if (O00000000 != null && O00000000.O0000000000OO0 != null) {
         O00000000.O0000000000OO0.O00000000(bl);
      }
   }

   @NotCompile
   public void onInitializeClient() {
      O00000000 = this;
      O00000000(this::O000000000OO0O);
      O00000000(O00000O0OO000O::O00000000);
      O00000000(this::O000000000OOOO);
      O00000000((Runnable)(() -> O00000000000OO = Profile.getUsername()));
      this.O000000000 = O00000000(ModuleManager::new);
      this.O0000000000O0O = O00000000(FriendCommand::new);
      this.O0000000000O00 = O00000000(ConfigManager::new);
      this.O0000000000O = O00000000(ThemeManager::new);
      this.O0000000000O0 = O00000000(ListenerRegistry::new);
      if (this.O0000000000O0 != null) {
         O00000000((Runnable)(this.O0000000000O0::O00000000));
      }

      if (this.O0000000000O != null) {
         O00000000((Runnable)(this.O0000000000O::O00000000));
      }

      O00000000((Runnable)(() -> AutoLoginManager.O00000000(MinecraftClient.getInstance())));
      O00000000((Runnable)(O0000O00O00OOO::O00000000));
      O00000000((Runnable)(() -> O0000O00O00O00.O00000000(MinecraftClient.getInstance())));
      O00000000((Runnable)(() -> EventManager.O00000000(TpsTracker.class)));
      O00000000(this::O00000000000O);
      if (this.O0000000000O != null) {
         O00000000((Runnable)(() -> {
            O00000OO000O0O.O00000000O0O0 = this.O0000000000O.O000000000();
            O00000OO000O0O.O00000000O0O00 = this.O0000000000O.O000000000();
            O00000OO000O0O.O00000000O0OO = this.O0000000000O.O0000000000();
         }));
      }

      O00000000(this.O000000000O::O00000000);
      O00000000((Runnable)(() -> O000000O00000O.O00000000().O000000000()));
      if (this.O0000000000O00 != null) {
         O00000000((Runnable)(() -> {
            this.O0000000000O00.O000000000();
            if (this.O0000000000O00.O0000000000("default") != null) {
               this.O0000000000O00.O00000000("default");
            }
         }));
      }

      O00000000((Runnable)(ru.metaculture.protection.O000000000O0O0::O00000000));
      O00000000(this::O00000000O);
      O00000000((Runnable)(() -> {
         RenderManager.O00000000 = O000000O000O0O::O00000000;
         RenderManager.O000000000 = O000000O000O0O::O000000000;
      }));
      O00000000((Runnable)(() -> Runtime.getRuntime().addShutdownHook(new Thread(WildClient::O000000000000, "Wild-Client-Shutdown"))));
      this.O0000000000OO = O00000000(ClickGuiScreen::new);
      this.O0000000000OO0 = O00000000(ModernClickGuiScreen::new);
      O00000000((Runnable)(() -> BlurRenderer.O00000000().O000000000()));
      O00000000((Runnable)(O0000000O00000::O00000000));
      O00000000((Runnable)(() -> EventManager.O00000000(this)));
      O00000000(this::O000000000OOO);
      O00000000(this::O000000000OOO0);
      if (this.O000000000 != null && this.O0000000000O00 != null && this.O0000000000O != null && this.O0000000000O0 != null) {
         O000000000O0OO = true;
         ProtectionHandler.O00000000();
      }
   }

   public ModernClickGuiScreen O00000000000() {
      if (this.O0000000000OO0 == null) {
         this.O0000000000OO0 = O00000000(ModernClickGuiScreen::new);
      }

      return this.O0000000000OO0;
   }

   private static <T> T O00000000(Supplier<T> supplier) {
      try {
         return (T)supplier.get();
      } catch (GuardException var2) {
         throw ProtectionHandler.O00000000(var2);
      } catch (Throwable var3) {
         System.out.println("[Client] init failed: " + var3.getClass().getSimpleName() + ": " + var3.getMessage());
         return null;
      }
   }

   @NotCompile
   private void O000000000OO0O() {
      if (!O0000000000OOO.exists() && !O0000000000OOO.mkdirs()) {
         System.out.println("[Client] cannot create root directory: " + O0000000000OOO.getAbsolutePath());
      } else {
         File var1 = new File(FabricLoader.getInstance().getGameDir().toFile(), "Wild");
         O00000000(var1.toPath(), O0000000000OOO.toPath());
      }
   }

   private static void O00000000(Path path, Path path2) {
      try {
         if (path == null || path2 == null || !Files.isDirectory(path) || Files.isSameFile(path, path2)) {
            return;
         }
      } catch (IOException var8) {
         return;
      }

      try (Stream var2 = Files.walk(path)) {
         var2.forEach(path3 -> {
            try {
               Path var3 = path.relativize((Path)path3);
               Path var4 = path2.resolve(var3);
               if (Files.isDirectory((Path)path3)) {
                  Files.createDirectories(var4);
               } else if (!Files.exists(var4)) {
                  Path var5 = var4.getParent();
                  if (var5 != null) {
                     Files.createDirectories(var5);
                  }

                  Files.copy((Path)path3, var4, StandardCopyOption.COPY_ATTRIBUTES);
               }
            } catch (Throwable var6) {
            }
         });
      } catch (Throwable var7) {
      }
   }

   public static void O00000000(MinecraftClient minecraftClient) {
      if (minecraftClient != null && minecraftClient.getWindow() != null && GLFW.glfwGetCurrentContext() != 0L) {
         int var1 = minecraftClient.getWindow().getFramebufferWidth();
         int var2 = minecraftClient.getWindow().getFramebufferHeight();
         if (!minecraftClient.getWindow().hasZeroWidthOrHeight() && var1 > 0 && var2 > 0) {
            try {
               O000000000000O();
            } catch (Throwable var4) {
               return;
            }

            if (O000000000OO0O != var1 || O000000000OOO != var2) {
               O00000000(var1, var2);
            }
         }
      }
   }

   private static void O00000000(Runnable runnable) {
      try {
         runnable.run();
      } catch (GuardException var2) {
         throw ProtectionHandler.O00000000(var2);
      } catch (Throwable var3) {
      }
   }

   @NotCompile
   private void O000000000OOO() {
      try {
         ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(new IdentifiableResourceReloadListener() {
            private final Identifier O00000000 = Identifier.of("wild", "font_reload");

            public Identifier getFabricId() {
               return this.O00000000;
            }

            public CompletableFuture<Void> reload(Synchronizer synchronizer, ResourceManager resourceManager, Executor executor, Executor executor2) {
               return CompletableFuture.completedFuture(null).<Object>thenCompose(synchronizer::whenPrepared).thenAcceptAsync(object -> {
                  MinecraftClient var1 = MinecraftClient.getInstance();
                  if (var1 != null) {
                     var1.execute(() -> {
                        try {
                           if (WildClient.O000000000O0O0) {
                              FontRegistry.O00000000();
                           }
                        } catch (Throwable var1x) {
                        }
                     });
                  }
               }, executor2);
            }
         });
      } catch (Throwable var2) {
      }
   }

   @NotCompile
   private void O000000000OOO0() {
      try {
         ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(new IdentifiableResourceReloadListener() {
            private final Identifier O00000000 = Identifier.of("wild", "theme_shader_reload");

            public Identifier getFabricId() {
               return this.O00000000;
            }

            public CompletableFuture<Void> reload(Synchronizer synchronizer, ResourceManager resourceManager, Executor executor, Executor executor2) {
               return CompletableFuture.completedFuture(null).<Object>thenCompose(synchronizer::whenPrepared).thenAcceptAsync(object -> {
                  MinecraftClient var1 = MinecraftClient.getInstance();
                  if (var1 != null) {
                     var1.execute(() -> {
                        try {
                           O00000OOOO0O0.O00000000().O00000000000();
                        } catch (Throwable var6) {
                        }

                        try {
                           O00000OO0O0O0O.O000000000000();
                        } catch (Throwable var5) {
                        }

                        try {
                           O0000O0O00O000.O00000000().close();
                        } catch (Throwable var4) {
                        }

                        try {
                           O0000O0O000OO0.O00000000().close();
                        } catch (Throwable var3) {
                        }

                        try {
                           O0000O00000O.O00000000().O00000000(0, 0);
                        } catch (Throwable var2x) {
                        }

                        try {
                           O0000O00000O0.O00000000().O00000000(0, 0);
                        } catch (Throwable var1x) {
                        }
                     });
                  }
               }, executor2);
            }
         });
      } catch (Throwable var2) {
      }
   }

   @NotCompile
   private void O000000000OOOO() {
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

            ProcessHandle.of(var2).ifPresent(processHandle -> {
               if (processHandle.isAlive()) {
                  processHandle.destroy();
               }
            });
         } catch (Throwable var6) {
         }
      }
   }

   @NotCompile
   private void O00000000O() {
      Configurator.setLevel("com.mojang.authlib.yggdrasil.YggdrasilServicesKeyInfo", Level.OFF);
      Configurator.setLevel("net.minecraft.client.texture.PlayerSkinProvider", Level.ERROR);
      Configurator.setLevel("net.minecraft.client.network.ClientPlayNetworkHandler", Level.ERROR);
      Configurator.setLevel("net.minecraft.client.world.ClientChunkManager", Level.ERROR);
      Configurator.setLevel("net.minecraft.block.entity.BlockEntity", Level.ERROR);
   }

   @NotCompile
   public static void O000000000000() {
      if (!O000000000OO00) {
         O000000000OO00 = true;
         System.out.println("[Wild] shutdown: begin");
         O00000000O0();
         O00000000((Runnable)(() -> {
            if (O00000000 != null && O00000000.O0000000000O00 != null) {
               O00000000.O0000000000O00.O00000000000();
            }
         }));
         O00000000(WildClient::O00000000O00);
         O00000000(DiscordRpcManager::O000000000);
         O00000000(IrcWebSocketClient::O000000000);
         O00000000((Runnable)(() -> {
            Thread var0 = O000000000OO0;
            O000000000OO0 = null;
            O000000000OO = false;
            if (var0 != null) {
               var0.interrupt();
            }
         }));
         O00000000((Runnable)(O0000O00O00OO0::O00000000));
         O00000000(TpsTracker::O0000000000000);
         O00000000(AutoBuy::O000000000O00O);
         O00000000(O000000O0O0O00::O000000000O0O0);
         O00000000(O000000O0OO00O::O000000000);
         O00000000(MusicPlayerHud::O0000000000OO0);
         O00000000(AiRotationCommand::O00000000000);
         O00000000(CloudConfigService::O0000000000);
         O00000000(ru.metaculture.protection.O0000000000OOO::O0000000000);
         O00000000((Runnable)(O0000O0O00OOO::O00000000));
         O00000000(HitSounds::O0000000000O0);
         O00000000((Runnable)(O0000O000OO000::O000000000));
         O00000000((Runnable)(() -> O0000O0O00O000.O00000000().close()));
         O00000000((Runnable)(() -> O0000O0O000OO0.O00000000().close()));
         O00000000(O00000OOOO0O0.O00000000()::O00000000000);
         O00000000((Runnable)(() -> O0000O0O000OOO.O0000000000()));
         System.out.println("[Wild] shutdown: done");
      }
   }

   private static void O00000000O0() {
      if (!O000000000OOO0) {
         O000000000OOO0 = true;
         Thread var0 = new Thread(() -> {
            try {
               Thread.sleep(4000L);
            } catch (InterruptedException var1) {
               Thread.currentThread().interrupt();
            }

            System.out.println("[Wild] shutdown: force-exit failsafe -> halt(0)");
            Runtime.getRuntime();
            boolean var10001 = false;
         }, "Wild-ForceExit-Watchdog");
         var0.setDaemon(true);
         var0.setPriority(10);
         var0.start();
      }
   }

   private static void O00000000O00() {
      if (O00000000 != null && O00000000.O000000000 != null && O00000000.O000000000.O00000000 != null) {
         for (Module var1 : O00000000.O000000000.O00000000) {
            if (var1 != null && var1.O0000000000000) {
               try {
                  var1.O0000000000000 = false;
                  var1.O000000000();
               } catch (Throwable var3) {
               }
            }
         }
      }
   }

   public static void O0000000000000() {
      if (!O000000000OO) {
         synchronized (WildClient.class) {
            if (O000000000OO) {
               return;
            }

            O000000000OO = true;
         }

         Thread var3 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
               try {
                  double var0 = TpsTracker.O00000000();
                  if (var0 <= 0.0) {
                     var0 = 20.0;
                  }

                  double var2 = 1.0 / var0;
                  long var4 = (long)(var2 * 1000.0);
                  MinecraftClient var6 = MinecraftClient.getInstance();
                  if (var6 != null && !var6.isOnThread()) {
                     var6.execute(() -> EventManager.O00000000((Event)(new O0000000O00O0())));
                  } else {
                     EventManager.O00000000((Event)(new O0000000O00O0()));
                  }

                  Thread.sleep(Math.max(var4, 1L));
               } catch (GuardException var8) {
                  throw ProtectionHandler.O00000000(var8);
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
         O000000000OO0 = var3;
         var3.start();
      }
   }

   public static void O000000000000O() {
      if (!O000000000O0O0) {
         O00000000O000();
      }
   }

   private static synchronized void O00000000O000() {
      if (!O000000000O0O0) {
         if (GLFW.glfwGetCurrentContext() != 0L) {
            O000000000O000 = new RenderEngine();
            O000000000O00O = new RenderManager(O000000000O000);
            FontRegistry.O00000000(O000000000O000, O000000000O00O);
            O000000000O0O = FontRegistry.O00000000;
            O000000000O0O0 = true;
         }
      }
   }

   @NotCompile
   public void O00000000000O() {
      this.O000000000O0 = new CommandManager();
   }

   public static void O00000000000O0() {
      ProtectionHandler.O00000000();
      if (O000000000O0OO) {
         O0000O00O0OOO0.W373 var0 = O0000O00O0OOO0.O00000000();

         try {
            if (MinecraftAccessor.a_ == null || MinecraftAccessor.a_.getWindow() == null) {
               return;
            }

            int var1 = MinecraftAccessor.a_.getWindow().getFramebufferWidth();
            int var2 = MinecraftAccessor.a_.getWindow().getFramebufferHeight();
            if (var1 <= 0 || var2 <= 0) {
               O00000000(var1, var2);
               return;
            }

            try {
               O000000000000O();
            } catch (Throwable var28) {
               return;
            }

            O0000O00O0O000.O00000000().O000000000();
            O00000OO000O var3 = O00000OO000O.O00000000();
            var3.O00000000(MinecraftAccessor.a_, O000000000O00O, var1, var2);
            boolean var4 = false;

            try {
               O000000000O00O.O00000000(var1, var2);
               var4 = true;
               EventManager.O00000000((Event)(new O0000000OO00O0(MinecraftAccessor.a_, O000000000O00O, O000000000O0O, var1, var2)));
            } catch (Throwable var26) {
            } finally {
               if (var4) {
                  try {
                     O000000000O00O.O000000000();
                  } catch (Throwable var25) {
                     O000000000O00O.O00000000();
                  }
               }
            }
         } catch (Throwable var29) {
         } finally {
            O0000O00O0OOO0.O00000000(var0);
         }
      }
   }

   @Generated
   public ModuleManager O00000000000OO() {
      return this.O000000000;
   }

   @Generated
   public String O0000000000O() {
      return "Wild";
   }

   @Generated
   public String O0000000000O0() {
      return "v1";
   }

   @Generated
   public String O0000000000O00() {
      return "1.21.8";
   }

   @Generated
   public File O0000000000O0O() {
      return this.O0000000000000;
   }

   @Generated
   public File O0000000000OO() {
      return this.O000000000000O;
   }

   @Generated
   public String O0000000000OO0() {
      return "wild";
   }

   @Generated
   public boolean O0000000000OOO() {
      return this.O00000000000O0;
   }

   @Generated
   public ThemeManager O000000000O() {
      return this.O0000000000O;
   }

   @Generated
   public ListenerRegistry O000000000O0() {
      return this.O0000000000O0;
   }

   @Generated
   public ConfigManager O000000000O00() {
      return this.O0000000000O00;
   }

   @Generated
   public FriendCommand O000000000O000() {
      return this.O0000000000O0O;
   }

   @Generated
   public ClickGuiScreen O000000000O00O() {
      return this.O0000000000OO;
   }

   @Generated
   public DiscordRpcManager O000000000O0O() {
      return this.O000000000O;
   }

   @Generated
   public CommandManager O000000000O0O0() {
      return this.O000000000O0;
   }

   @Generated
   public IrcWebSocketClient O000000000O0OO() {
      return this.O000000000O00;
   }

   @Generated
   public String O000000000OO() {
      return this.O000000000OOOO;
   }

   @Generated
   public void O00000000(ModuleManager o0000000OO0OO) {
      this.O000000000 = o0000000OO0OO;
   }

   @Generated
   public void O000000000(boolean bl) {
      this.O00000000000O0 = bl;
   }

   @Generated
   public void O00000000(ThemeManager o000000000OO0) {
      this.O0000000000O = o000000000OO0;
   }

   @Generated
   public void O00000000(ListenerRegistry o000000O0O000O) {
      this.O0000000000O0 = o000000O0O000O;
   }

   @Generated
   public void O00000000(ConfigManager o000000000O000) {
      this.O0000000000O00 = o000000000O000;
   }

   @Generated
   public void O00000000(FriendCommand o00000000O000O) {
      this.O0000000000O0O = o00000000O000O;
   }

   @Generated
   public void O00000000(ClickGuiScreen o00000OO000O00) {
      this.O0000000000OO = o00000OO000O00;
   }

   @Generated
   public void O00000000(ModernClickGuiScreen o00000OOO0000O) {
      this.O0000000000OO0 = o00000OOO0000O;
   }

   @Generated
   public void O00000000(CommandManager o000000000OO) {
      this.O000000000O0 = o000000000OO;
   }

   @Generated
   public void O00000000(IrcWebSocketClient o0000O000OO00O) {
      this.O000000000O00 = o0000O000OO00O;
   }

   @Generated
   public static boolean O000000000OO0() {
      return O000000000O0OO;
   }

   @Generated
   public static boolean O000000000OO00() {
      return O000000000OO00;
   }

   @Generated
   public void O00000000(String string) {
      this.O000000000OOOO = string;
   }
}
