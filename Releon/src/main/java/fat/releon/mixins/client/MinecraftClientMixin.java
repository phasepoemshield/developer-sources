package fat.releon.mixins.client;

import fat.releon.Releon;
import fat.releon.utils.client.window.WindowStyle;
import l.Helper103;
import l.Exception3;
import l.Helper124;
import l.Helper210;
import l.Helper211;
import l.Helper284;
import l.Event4;
import l.Helper399;
import l.NoInteract;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.RunArgs;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult.Success;
import net.minecraft.util.ActionResult.SwingSource;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({MinecraftClient.class})
public abstract class MinecraftClientMixin {
   @Shadow
   @Nullable
   public ClientPlayerInteractionManager interactionManager;
   @Shadow
   @Nullable
   public ClientPlayerEntity player;
   @Shadow
   @Final
   public GameRenderer gameRenderer;
   @Shadow
   @Nullable
   public Screen currentScreen;

   public MinecraftClientMixin() {
   }

   @Shadow
   @Nullable
   public abstract ClientPlayNetworkHandler getNetworkHandler();

   @Inject(
      at = {@At("TAIL")},
      method = {"<init>"}
   )
   private void onInit(RunArgs var1, CallbackInfo var2) {
      if (!rich$isSelfDestructUnhookedClient()) {
         Helper103.init();
         Helper210.method1805();
      }
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"stop"}
   )
   private void stop(CallbackInfo var1) {
      Helper211.method1807("Stopping for MinecraftClient");
      if (Releon.method71().method39()) {
         try {
            Releon.method71().method29().method896();
         } catch (Exception var6) {
            Helper211.method1813("Error occurred while saving files: " + var6.getMessage() + " " + var6.getCause());
         } finally {
            Releon.method71().method29().method895();
         }
      }
   }

   @Inject(
      method = {"doItemUse"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/util/Hand;values()[Lnet/minecraft/util/Hand;"
      )},
      cancellable = true
   )
   public void doItemUseHook(CallbackInfo var1) {
      if (NoInteract.method4130().isState()) {
         for (Hand var5 : Hand.values()) {
            if (!this.player.getStackInHand(var5).isEmpty()) {
               ActionResult var6 = this.interactionManager.interactItem(this.player, var5);
               if (var6.isAccepted()) {
                  if (var6 instanceof Success var7 && var7.swingSource().equals(SwingSource.CLIENT)) {
                     this.gameRenderer.firstPersonRenderer.resetEquipProgress(var5);
                     this.player.swingHand(var5);
                  }

                  var1.cancel();
               }
            }
         }
      }
   }

   @Inject(
      method = {"setScreen"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void setScreenHook(Screen var1, CallbackInfo var2) {
      if (!rich$isSelfDestructUnhookedClient()) {
         Helper284 var3 = Helper284.method2781();
         if (var1 == null && this.currentScreen != null && !(this.currentScreen instanceof HandledScreen) && var3.method2789() && !var3.method2788()) {
            var2.cancel();
         } else {
            if (var1 instanceof HandledScreen && var3.method2789()) {
               var3.method2790(false);
            }

            if (var1 == null && this.currentScreen instanceof HandledScreen && var3.method2785() && !var3.method2788()) {
               var3.method2784();
               var2.cancel();
            } else {
               Event4 var4 = new Event4(var1);
               Helper124.method1026(var4);
               Releon.method71().method26().method788().forEach(var1x -> var1x.method556(var4));
               Screen var5 = var4.method3646();
               if (var1 != var5) {
                  MinecraftClient.getInstance().setScreen(var5);
                  var2.cancel();
               }
            }
         }
      }
   }

   @Inject(
      method = {"onResolutionChanged"},
      at = {@At("TAIL")}
   )
   private void applyDarkMode(CallbackInfo var1) {
      if (!rich$isSelfDestructUnhookedClient()) {
         String var2 = System.getProperty("os.name", "").toLowerCase();
         if (var2.contains("win")) {
            MinecraftClient var3 = MinecraftClient.getInstance();
            WindowStyle.method234(var3.getWindow().getHandle());
         }
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   private void onTick(CallbackInfo var1) {
      if (!rich$isSelfDestructUnhookedClient()) {
         ;
      }
   }

   @Inject(
      method = {"updateWindowTitle"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onUpdateWindowTitle(CallbackInfo var1) {
      if (!rich$isSelfDestructUnhookedClient()) {
         ;
      }
   }

   @Inject(
      method = {"handleInputEvents"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;getInventory()Lnet/minecraft/entity/player/PlayerInventory;"
      )},
      cancellable = true
   )
   public void handleInputEventsHook(CallbackInfo var1) {
      Helper399 var2 = new Helper399();
      Helper124.method1026(var2);
      if (var2.method581()) {
         var1.cancel();
      }
   }

   private static boolean rich$isSelfDestructUnhookedClient() {
      try {
         Class var0 = Class.forName("l.雨小");
         return var0.getField("unhooked").getBoolean(null);
      } catch (Throwable var1) {
         return false;
      }
   }
}
