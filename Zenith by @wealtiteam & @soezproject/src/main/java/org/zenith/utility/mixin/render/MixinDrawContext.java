package org.zenith.utility.mixin.render;

import org.zenith.base.font.Font;
import org.zenith.event.EventMotion;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.util.Item;

import org.zenith.module.ShulkerPreview_Var159;

import org.zenith.module.AHHelper;
import org.zenith.module.ShulkerPreview;

import org.zenith.module.AHHelper;
import org.zenith.base.font.MsdfRenderer;
import org.zenith.util.ItemCountUtils;
import org.zenith.module.ShulkerPreview;
import org.zenith.module.ShulkerPreview_Var159;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;















import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.tooltip.HoveredTooltipPositioner;
import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.client.gui.tooltip.TooltipPositioner;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipData;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({DrawContext.class})
public abstract class MixinDrawContext {
   public MixinDrawContext() {
   }

   @Inject(
      method = {"draw()V"},
      at = {@At("HEAD")}
   )
   public void zenith_flushMsdfTextBatch(CallbackInfo var1) {
      MsdfRenderer.flushBatch();
   }

   @Invoker("drawTooltip")
   protected abstract void invokeDrawTooltip(
      TextRenderer var1, List<TooltipComponent> var2, int var3, int var4, TooltipPositioner var5, @Nullable Identifier var6
   );

   @ModifyVariable(
      method = {"drawStackOverlay(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/item/ItemStack;IILjava/lang/String;)V"},
      at = @At("HEAD"),
      ordinal = 0,
      argsOnly = true
   )
   public String zenith_showRealLotCount(@Nullable String var1, TextRenderer var2, ItemStack var3, int var4, int var5) {
      if (var1 != null) {
         return var1;
      } else if (!AHHelper.aHHelper.float42()) {
         return null;
      } else if (var3 != null && !var3.isEmpty() && this.zenith_isContainerScreenOpen()) {
         int i = ItemCountUtils.EventMotion(var3);
         return i > 1 && i != var3.getCount() ? String.valueOf(i) : null;
      } else {
         return null;
      }
   }

   @Unique
   public boolean zenith_isContainerScreenOpen() {
      MinecraftClient minecraftclient = MinecraftClient.getInstance();
      return minecraftclient.currentScreen instanceof HandledScreen;
   }

   @Inject(
      method = {"drawTooltip(Lnet/minecraft/client/font/TextRenderer;Ljava/util/List;Ljava/util/Optional;IILnet/minecraft/util/Identifier;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void filterShulkerTooltip(
      TextRenderer var1, List<Text> var2, Optional<TooltipData> var3, int var4, int var5, @Nullable Identifier var6, CallbackInfo var7
   ) {
      if (var3 != null) {
         TooltipData tooltipdata = (TooltipData)var3.orElse(null);
         if (tooltipdata instanceof ShulkerPreview_Var159) {
            java.util.List<TooltipComponent> arraylist = new ArrayList<>(2);
            if (var2 != null && !var2.isEmpty()) {
               arraylist.add(TooltipComponent.of(var2.get(0).asOrderedText()));
            }

            TooltipComponent tooltipcomponent = ShulkerPreview.on23(tooltipdata);
            if (tooltipcomponent != null) {
               arraylist.add(tooltipcomponent);
            }

            if (var2 != null && var2.size() > 1) {
               Integer integer = Formatting.DARK_GRAY.getColorValue();

               for (int i = 1; i < var2.size(); i++) {
                  Text text = (Text)var2.get(i);
                  if (integer != null && text.getStyle().getColor() != null && text.getStyle().getColor().getRgb() == integer) {
                     arraylist.add(TooltipComponent.of(text.asOrderedText()));
                  }
               }
            }

            if (!arraylist.isEmpty()) {
               this.invokeDrawTooltip(var1, arraylist, var4, var5, HoveredTooltipPositioner.INSTANCE, var6);
               var7.cancel();
            }
         }
      }
   }
}
