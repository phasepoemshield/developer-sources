package zenith.zov.utility.mixin.render;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import net.minecraft.util.Formatting;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.item.tooltip.TooltipData;
import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.client.gui.tooltip.TooltipPositioner;
import net.minecraft.client.gui.tooltip.HoveredTooltipPositioner;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.PatternHolder_2;
import zenith.ShulkerLook;
import zenith.ShulkerLook$II1Il11l111II11IIl;
import zenith.AhHelper;

@Mixin({DrawContext.class})
public abstract class MixinDrawContext {
   @Invoker("drawTooltip")
   protected abstract void invokeDrawTooltip(TextRenderer TextRenderer, List<TooltipComponent> list, int i, int j, TooltipPositioner TooltipPositioner, @Nullable Identifier Identifier);

   @ModifyVariable(
      method = {"drawStackCount(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/item/ItemStack;IILjava/lang/String;)V"},
      at = @At("HEAD"),
      ordinal = 0,
      argsOnly = true
   )
   private String modifyCountText(String s, TextRenderer TextRenderer, ItemStack ItemStack, int j, int k, @Nullable String s1) {
      if (AhHelper.Ill1lII1l1ll1I1lIl1lIl.Spider() && AhHelper.Ill1lII1l1ll1I1lIl1lIl.I1III1I11l() && s1 == null) {
         int i = PatternHolder_2.ZenithInternal044(ItemStack);
         if (i > 1) {
            return String.valueOf(i);
         }
      }

      return s;
   }

   @Inject(
      method = {"drawTooltip(Lnet/minecraft/client/font/TextRenderer;Ljava/util/List;Ljava/util/Optional;IILnet/minecraft/util/Identifier;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void filterShulkerTooltip(
      TextRenderer TextRenderer, List<Text> list, Optional<TooltipData> optional, int i, int j, @Nullable Identifier Identifier, CallbackInfo callbackinfo
   ) {
      if (optional != null) {
         TooltipData TooltipData = (TooltipData)optional.orElse(null);
         if (TooltipData instanceof ShulkerLook$II1Il11l111II11IIl) {
            ArrayList arraylist = new ArrayList(2);
            if (list != null && !list.isEmpty()) {
               arraylist.add(TooltipComponent.of(((Text)list.get(0)).asOrderedText()));
            }

            TooltipComponent TooltipComponent = ShulkerLook.StringHolder_8(TooltipData);
            if (TooltipComponent != null) {
               arraylist.add(TooltipComponent);
            }

            if (list != null && list.size() > 1) {
               Integer integer = Formatting.DARK_GRAY.getColorValue();

               for (int k = 1; k < list.size(); k++) {
                  Text Text = (Text)list.get(k);
                  if (integer != null && Text.getStyle().getColor() != null && Text.getStyle().getColor().getRgb() == integer
                     )
                   {
                     arraylist.add(TooltipComponent.of(Text.asOrderedText()));
                  }
               }
            }

            if (!arraylist.isEmpty()) {
               this.invokeDrawTooltip(TextRenderer, arraylist, i, j, HoveredTooltipPositioner.INSTANCE, Identifier);
               callbackinfo.cancel();
            }
         }
      }
   }
}
