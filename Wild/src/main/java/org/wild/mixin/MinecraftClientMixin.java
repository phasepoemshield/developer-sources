package org.wild.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.DownloadingTerrainScreen;
import net.minecraft.client.gui.screen.ProgressScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.DownloadingTerrainScreen.WorldEntryReason;
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.screen.world.LevelLoadingScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.BlurRenderer;
import ru.metaculture.protection.Event;
import ru.metaculture.protection.EventManager;
import ru.metaculture.protection.HitBox;
import ru.metaculture.protection.MainMenuScreen;
import ru.metaculture.protection.NoDelay;
import ru.metaculture.protection.O00000000OO0OO;
import ru.metaculture.protection.O0000000O000O;
import ru.metaculture.protection.O0000000O00OO;
import ru.metaculture.protection.O0000000O00OO0;
import ru.metaculture.protection.O0000000O0O0O0;
import ru.metaculture.protection.O000000O0OO0OO;
import ru.metaculture.protection.O00000OO0OOO00;
import ru.metaculture.protection.O00000OO0OOOO;
import ru.metaculture.protection.O0000O00O00000;
import ru.metaculture.protection.O0000O00OO00O0;
import ru.metaculture.protection.O0000O00OO0OO;
import ru.metaculture.protection.O0000O0O00O00;
import ru.metaculture.protection.ProtectionHandler;
import ru.metaculture.protection.PvPSafe;
import ru.metaculture.protection.UnHook;
import ru.metaculture.protection.WildClient;
import ru.metaculture.protection.WildMultiplayerScreen;

@Environment(EnvType.CLIENT)
@Mixin({MinecraftClient.class})
public abstract class MinecraftClientMixin {
   @Shadow
   private int itemUseCooldown;
   @Shadow
   private int attackCooldown;
   @Unique
   private boolean wild$hideOpenedScreen;
   @Unique
   private Screen wild$diagPreviousScreen;

   @Inject(
      method = {"stop"},
      at = {@At("HEAD")}
   )
   private void wild$onStop(CallbackInfo callbackInfo) {
      if (WildClient.O000000000OO0()) {
         O0000O0O00O00.O00000000().O0000000000();
         WildClient.O000000000000();
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   private void wild$coreTickHead(CallbackInfo callbackInfo) {
      O00000000OO0OO.O00000000().O000000000();
   }

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   private void initRenderer(CallbackInfo callbackInfo) {
      ProtectionHandler.O00000000();
      MinecraftClient var2 = (MinecraftClient)(Object)this;
      if (WildClient.O000000000OO0()) {
         O0000O00O00000.O000000000(var2);
         O0000O00O00000.O00000000(var2);
         O00000OO0OOO00.O00000000(var2);
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At("TAIL")}
   )
   private void wild$coreTickTail(CallbackInfo callbackInfo) {
      MinecraftClient.getInstance().getWindow().setTitle("MINTMEGAANTILEAK 1337 CRASHDAMMI");
      O00000000OO0OO.O00000000().O0000000000();
   }

   @Inject(
      method = {"tick"},
      at = {@At("TAIL")}
   )
   private void publishClientTick(CallbackInfo callbackInfo) {
      if (WildClient.O000000000OO0()) {
         MinecraftClient var2 = (MinecraftClient)(Object)this;
         if (!var2.isPaused()) {
            ClientPlayerEntity var3 = var2.player;
            ClientWorld var4 = var2.world;
            if (var3 != null && var4 != null) {
               try {
                  EventManager.O00000000((Event)(new O0000000O0O0O0(var2)));
               } catch (Throwable var6) {
               }
            }
         }
      }
   }

   @Inject(
      method = {"joinWorld(Lnet/minecraft/client/world/ClientWorld;Lnet/minecraft/client/gui/screen/DownloadingTerrainScreen$WorldEntryReason;)V"},
      at = {@At("TAIL")}
   )
   public void loadWorld(ClientWorld clientWorld, WorldEntryReason worldEntryReason, CallbackInfo callbackInfo) {
      O0000O00O00000.O00000000();
      if (clientWorld != null) {
         try {
            EventManager.O00000000((Event)(new O0000000O000O()));
            EventManager.O00000000((Event)(new O0000000O00OO0()));
         } catch (Throwable var5) {
         }
      }
   }

   @Inject(
      method = {"onResolutionChanged"},
      at = {@At("TAIL")}
   )
   private void wild$onResolutionChanged(CallbackInfo callbackInfo) {
      MinecraftClient var2 = (MinecraftClient)(Object)this;
      if (var2.getWindow() == null) {
         WildClient.O00000000(0, 0);
      } else {
         WildClient.O00000000(var2.getWindow().getFramebufferWidth(), var2.getWindow().getFramebufferHeight());
      }
   }

   @Inject(
      method = {"onWindowFocusChanged"},
      at = {@At("HEAD")}
   )
   private void wild$onWindowFocusChanged(boolean bl, CallbackInfo callbackInfo) {
      MinecraftClient var3 = (MinecraftClient)(Object)this;
      if (!bl && var3.mouse != null) {
         var3.mouse.unlockCursor();
      }

      WildClient.O00000000(bl);
   }

   @Inject(
      method = {"setScreen"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$replaceTitleScreen(Screen screen, CallbackInfo callbackInfo) {
      if (WildClient.O000000000OO0() && !UnHook.O000000000O0) {
         if (screen instanceof TitleScreen && !(screen instanceof MainMenuScreen)) {
            MainMenuScreen var9;
            try {
               var9 = new MainMenuScreen();
            } catch (Throwable var6) {
               return;
            }

            callbackInfo.cancel();
            ((MinecraftClient)(Object)this).setScreen(var9);
         } else if (screen instanceof MultiplayerScreen && !(screen instanceof WildMultiplayerScreen)) {
            MinecraftClient var8 = (MinecraftClient)(Object)this;

            WildMultiplayerScreen var4;
            try {
               Object var5 = var8.currentScreen instanceof MainMenuScreen ? var8.currentScreen : new MainMenuScreen();
               var4 = new WildMultiplayerScreen((Screen)var5);
            } catch (Throwable var7) {
               return;
            }

            callbackInfo.cancel();
            var8.setScreen(var4);
         } else {
            if (screen != null) {
               O0000000O00OO var3 = new O0000000O00OO(screen);
               EventManager.O00000000((Event)var3);
               if (var3.O00000000()) {
                  callbackInfo.cancel();
                  return;
               }

               if (var3.O000000000000()) {
                  this.wild$hideOpenedScreen = true;
               }
            }
         }
      }
   }

   @Inject(
      method = {"setScreen"},
      at = {@At("TAIL")}
   )
   private void wild$logScreenTransition(Screen screen, CallbackInfo callbackInfo) {
      if (WildClient.O000000000OO0()) {
         O0000O00OO0OO.O00000000(this.wild$diagPreviousScreen, screen);
      }
   }

   @Inject(
      method = {"setScreen"},
      at = {@At("TAIL")}
   )
   private void wild$hideOpenedScreen(Screen screen, CallbackInfo callbackInfo) {
      if (this.wild$hideOpenedScreen) {
         this.wild$hideOpenedScreen = false;
         MinecraftClient var3 = (MinecraftClient)(Object)this;
         if (screen != null && var3.currentScreen == screen) {
            var3.currentScreen = null;
            if (var3.mouse != null) {
               var3.mouse.lockCursor();
            }
         }
      }
   }

   @Inject(
      method = {"setScreen"},
      at = {@At("HEAD")}
   )
   private void wild$captureScreenTransition(Screen screen, CallbackInfo callbackInfo) {
      this.wild$diagPreviousScreen = ((MinecraftClient)(Object)this).currentScreen;
      MinecraftClient var3 = (MinecraftClient)(Object)this;
      if (WildClient.O000000000OO0() && !UnHook.O000000000O0) {
         BlurRenderer.O00000000().O000000000000();
      }

      if (WildClient.O000000000OO0() && !UnHook.O000000000O0) {
         if (!(screen instanceof TitleScreen) || screen instanceof MainMenuScreen) {
            if (!(screen instanceof MultiplayerScreen) || screen instanceof WildMultiplayerScreen) {
               if (wild$isLoadingScreen(screen)) {
                  O0000O0O00O00.O00000000().O0000000000();
               } else if (var3.world != null) {
                  O0000O0O00O00.O00000000().O0000000000();
               } else if (wild$isLoadingScreen(var3.currentScreen)) {
                  O0000O0O00O00.O00000000().O0000000000();
               } else {
                  Screen var4 = var3.currentScreen;
                  if (!(var4 instanceof O00000OO0OOOO) && !(screen instanceof O00000OO0OOOO)) {
                     try {
                        O0000O0O00O00.O00000000().O00000000(var4, screen);
                     } catch (Throwable var6) {
                        O0000O0O00O00.O00000000().O0000000000();
                     }
                  } else {
                     O0000O0O00O00.O00000000().O0000000000();
                  }
               }
            }
         }
      }
   }

   @Inject(
      method = {"setScreen"},
      at = {@At("TAIL")}
   )
   private void wild$restoreFramebufferAfterSetScreen(Screen screen, CallbackInfo callbackInfo) {
      if (WildClient.O000000000OO0() && !UnHook.O000000000O0 && screen != null) {
         if (!(screen instanceof O00000OO0OOOO)) {
            O0000O00OO00O0.O00000000((MinecraftClient)(Object)this);
         }
      }
   }

   private static boolean wild$isLoadingScreen(Screen screen) {
      return screen instanceof LevelLoadingScreen
         || screen instanceof DownloadingTerrainScreen
         || screen instanceof ConnectScreen
         || screen instanceof ProgressScreen;
   }

   @Inject(
      method = {"disconnect(Lnet/minecraft/client/gui/screen/Screen;Z)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$blockPvpSafeDisconnect(Screen screen, boolean bl, CallbackInfo callbackInfo) {
      if (PvPSafe.O0000000000(bl)) {
         callbackInfo.cancel();
      }
   }

   @Inject(
      method = {"doAttack"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onDoAttackHitbox(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
      MinecraftClient var2 = MinecraftClient.getInstance();
      if (var2 != null && var2.player != null && var2.world != null && var2.interactionManager != null) {
         if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
            HitBox var3 = (HitBox)WildClient.O00000000.O000000000.O000000000(HitBox.class);
            if (var3 != null && var3.O0000000000000 && HitBox.O000000000O.O000000000("Легит")) {
               LivingEntity var4 = var3.O0000000000O0();
               if (var4 != null) {
                  HitBox.O00000000(var4);
                  O000000O0OO0OO.O00000000(var4, true, HitBox.O000000000O000.O0000000000());
                  callbackInfoReturnable.setReturnValue(true);
               }
            }
         }
      }
   }

   @Inject(
      method = {"doAttack"},
      at = {@At("RETURN")}
   )
   private void onDoAttackNoDelay(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         NoDelay var2 = (NoDelay)WildClient.O00000000.O000000000.O000000000(NoDelay.class);
         if (var2 != null && var2.O0000000000000 && NoDelay.O000000000O00.O0000000000()) {
            this.attackCooldown = (int)NoDelay.O000000000O0OO.O0000000000();
         }
      }
   }

   @Inject(
      method = {"doItemUse"},
      at = {@At("RETURN")}
   )
   private void onDoItemUseNoDelay(CallbackInfo callbackInfo) {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         NoDelay var2 = (NoDelay)WildClient.O00000000.O000000000.O000000000(NoDelay.class);
         if (var2 != null && var2.O0000000000000 && NoDelay.O000000000O000.O0000000000()) {
            this.itemUseCooldown = (int)NoDelay.O000000000OO.O0000000000();
         }
      }
   }
}
