package org.wild.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.AutoBuy;
import ru.metaculture.protection.UnHook;
import ru.metaculture.protection.WildClient;

@Mixin({HandledScreen.class})
public abstract class ChestScreenMixin extends Screen {
   @Shadow
   protected int x;
   @Shadow
   protected int y;
   @Shadow
   protected int backgroundWidth;
   @Unique
   private ButtonWidget autoBuyButton;

   protected ChestScreenMixin(Text text) {
      super(text);
   }

   @Inject(
      method = {"init"},
      at = {@At("TAIL")}
   )
   private void initAutoBuyButtons(CallbackInfo callbackInfo) {
      if (!UnHook.O000000000O0) {
         if ((Object)this instanceof GenericContainerScreen) {
            String var2 = this.getTitle().getString();
            if (var2 != null && (var2.contains("Аукцион") || var2.contains("Auction") || var2.contains("Поиск: "))) {
               AutoBuy var3 = this.getAutoBuyModule();
               if (var3 != null) {
                  byte var4 = 5;
                  byte var5 = 100;
                  byte var6 = 20;
                  int var7 = this.x + this.backgroundWidth / 2 - var5 / 2;
                  int var8 = this.y - var6 - var4;
                  this.autoBuyButton = ButtonWidget.builder(this.getButtonText(var3), buttonWidget -> {
                     var3.a_();
                     buttonWidget.setMessage(this.getButtonText(var3));
                  }).dimensions(var7, var8, var5, var6).build();
                  this.addDrawableChild(this.autoBuyButton);
               }
            }
         }
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void updateButtonStates(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      if ((Object)this instanceof GenericContainerScreen) {
         if (this.autoBuyButton != null) {
            this.autoBuyButton.visible = !UnHook.O000000000O0;
            this.autoBuyButton.active = !UnHook.O000000000O0;
         }

         if (!UnHook.O000000000O0) {
            AutoBuy var6 = this.getAutoBuyModule();
            if (var6 != null && this.autoBuyButton != null) {
               this.autoBuyButton.setMessage(this.getButtonText(var6));
            }
         }
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   private void onTick(CallbackInfo callbackInfo) {
      if (!UnHook.O000000000O0) {
         if ((Object)this instanceof GenericContainerScreen) {
            String var2 = this.getTitle().getString();
            if (var2 != null && (var2.contains("Аукцион") || var2.contains("Auction") || var2.contains("Поиск: "))) {
               AutoBuy var3 = this.getAutoBuyModule();
               if (var3 != null && var3.O0000000000000 && var3.O000000000O0O.O0000000000()) {
                  var3.O000000000O0O();
               }
            }
         }
      }
   }

   @Unique
   private Text getButtonText(AutoBuy o000000OO00O0O) {
      String var2 = o000000OO00O0O.O0000000000000 ? "§aON" : "§cOFF";
      return Text.of("AutoBuy: " + var2);
   }

   @Unique
   private AutoBuy getAutoBuyModule() {
      return WildClient.O00000000.O000000000.O00000000(AutoBuy.class);
   }
}
