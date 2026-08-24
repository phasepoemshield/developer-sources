package org.zenith.module;

import org.zenith.core.CloudResponse;
import org.zenith.event.Event19;
import org.zenith.event.PlayerMoveEvent;
import org.zenith.setting.Setting;
import org.zenith.util.Item;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.util.MathUtils;
import org.zenith.module.Module;
import org.zenith.core.ItemRegistry;
import org.zenith.ZenithClient;
import org.zenith.core.ItemSpec;
import org.zenith.core.NbtEditor;
import org.zenith.core.ColorAnimator;
import org.zenith.core.ServiceException;
import org.zenith.render.ScreenProjection;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.InventoryUtils;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.EffectEngine;

import org.zenith.event.EventRender2;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.NumberSetting;
import org.zenith.setting.StringSetting2;

import org.zenith.client.screens.shulker.ShulkerTooltipComponent;
import org.zenith.utility.render.display.base.BlurHudDrawContext;
import org.zenith.utility.render.display.base.CustomDrawContext;
import org.zenith.utility.render.display.base.GradientRadius;
import org.zenith.utility.render.display.base.GuiSprite;

















import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import java.util.Optional;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipData;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.joml.Vector4d;

@ModuleInfo(
   name = "ShulkerPreview",
   category = Category.MISC,
   description = "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u0447\u0442\u043e \u043d\u0430\u0445\u043e\u0434\u0438\u0442\u0441\u044f \u0432 \u0448\u0430\u043b\u043a\u0435\u0440\u0435"
)
public class ShulkerPreview extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final ShulkerPreview shulkerPreview = new ShulkerPreview();
   public final BooleanSetting alwaysShow = new BooleanSetting("module.shulkerPreview.alwaysShow", "module.shulkerPreview.alwaysShow.desc", false);
   public final StringSetting2 previewKey = new StringSetting2(
      "module.shulkerPreview.previewKey", "module.shulkerPreview.previewKey.desc", -1, () -> !this.alwaysShow.isEnabled()
   );
   public final BooleanSetting worldDisplay = new BooleanSetting("module.shulkerPreview.worldDisplay", "module.shulkerPreview.worldDisplay.desc", true);
   public final NumberSetting worldScale = new NumberSetting(
      "module.shulkerPreview.worldScale", 0.7F, 0.3F, 1.5F, 0.05F, "module.shulkerPreview.worldScale.desc", "x", this.worldDisplay::isEnabled, null
   );

   public ShulkerPreview() {
   }

   public static Optional<TooltipData> InventoryUtils(ItemStack var0) {
      if (shulkerPreview.isEnabled() && shulkerPreview.int365()) {
         if (var0.getItem() instanceof BlockItem blockitem && blockitem.getBlock() instanceof ShulkerBoxBlock) {
            DefaultedList<ItemStack> defaultedlist = DefaultedList.ofSize(27, ItemStack.EMPTY);
            ContainerComponent containercomponent = var0.get(DataComponentTypes.CONTAINER);
            if (containercomponent != null) {
               containercomponent.copyTo(defaultedlist);
            }

            return Optional.of(new ShulkerPreview_Var159(defaultedlist));
         }

         return Optional.empty();
      } else {
         return Optional.empty();
      }
   }

   public static TooltipComponent on23(TooltipData var0) {
      return var0 instanceof ShulkerPreview_Var159 l1liii1i1l_ii1il11l111ii11iil
         ? new ShulkerTooltipComponent(l1liii1i1l_ii1il11l111ii11iil.getValue())
         : null;
   }

   public boolean int365() {
      if (this.alwaysShow.isEnabled()) {
         return true;
      } else {
         int i = this.previewKey.getKeyCode();
         return i == -1
            ? false
            : this.previewKey.isVisible()
               && EffectEngine.on23(EffectEngine.PlayerMoveEvent(i), i);
      }
   }

   @EventTarget
   public void ColorAnimator(EventRender2 var1) {
      if (this.worldDisplay.isEnabled()
         && this.int365()
         && minecraftClient3.player != null
         && minecraftClient3.world != null
         && minecraftClient3.getEntityRenderDispatcher().camera != null) {
         CustomDrawContext customdrawcontext = var1.Bot();
         if (customdrawcontext != null) {
            for (Entity entity : minecraftClient3.world.getEntities()) {
               if (entity instanceof ItemEntity) {
                  ItemEntity itementity = (ItemEntity)entity;
                  ItemStack itemstack = itementity.getStack();
                  if (!itemstack.isEmpty() && BotFeatureRegistry(itemstack)) {
                     this.on23(customdrawcontext, itementity, itemstack);
                  }
               }
            }
         }
      }
   }

   public void on23(CustomDrawContext var1, ItemEntity var2, ItemStack var3) {
      Vec3d vec3d = MathUtils.CloudResponse(var2);
      Box box = var2.getBoundingBox().offset(vec3d.subtract(var2.getPos()));
      Vector4d vector4d = this.ItemRegistry(box);
      if (vector4d != null) {
         DefaultedList defaultedlist = ServiceException(var3);
         ShulkerTooltipComponent shulkertooltipcomponent = new ShulkerTooltipComponent(defaultedlist);
         float f = this.worldScale.getCurrent();
         float f1 = (float)shulkertooltipcomponent.getWidth(minecraftClient3.textRenderer);
         float f2 = (float)shulkertooltipcomponent.getHeight(minecraftClient3.textRenderer);
         float f3 = ((float)vector4d.x + (float)vector4d.z) / 2.0F;
         float f4 = (float)vector4d.y - 4.0F - f2 * f / 2.0F;
         float f5 = f3 - f1 / 2.0F;
         float f6 = f4 - f2 / 2.0F;
         this.pushCenteredScale(var1, f3, f4, f, f);
         shulkertooltipcomponent.drawItems(
            minecraftClient3.textRenderer,
            Math.round(f5),
            Math.round(f6),
            shulkertooltipcomponent.getWidth(minecraftClient3.textRenderer),
            shulkertooltipcomponent.getHeight(minecraftClient3.textRenderer),
            var1
         );
         var1.popMatrix();
      }
   }

   public void pushCenteredScale(CustomDrawContext var1, float var2, float var3, float var4, float var5) {
      var1.pushMatrix();
      var1.getMatrices().translate(var2, var3, 0.0F);
      var1.getMatrices().scale(var4, var5, 1.0F);
      var1.getMatrices().translate(-var2, -var3, 0.0F);
   }

   public Vector4d ItemRegistry(Box var1) {
      Vector4d vector4d = null;

      for (Vec3d vec3d : this.ItemSpec(var1)) {
         if (this.NbtEditor(vec3d)) {
            Vec3d vec3d1 = ScreenProjection.Event19(vec3d);
            if (vec3d1 != null && !(vec3d1.z <= 0.0)) {
               if (vector4d == null) {
                  vector4d = new Vector4d(vec3d1.x, vec3d1.y, vec3d1.x, vec3d1.y);
               } else {
                  vector4d.x = Math.min(vector4d.x, vec3d1.x);
                  vector4d.y = Math.min(vector4d.y, vec3d1.y);
                  vector4d.z = Math.max(vector4d.z, vec3d1.x);
                  vector4d.w = Math.max(vector4d.w, vec3d1.y);
               }
            }
         }
      }

      return vector4d;
   }

   public Vec3d[] ItemSpec(Box var1) {
      return new Vec3d[]{
         new Vec3d(var1.minX, var1.minY, var1.minZ),
         new Vec3d(var1.minX, var1.maxY, var1.minZ),
         new Vec3d(var1.maxX, var1.minY, var1.minZ),
         new Vec3d(var1.maxX, var1.maxY, var1.minZ),
         new Vec3d(var1.minX, var1.minY, var1.maxZ),
         new Vec3d(var1.minX, var1.maxY, var1.maxZ),
         new Vec3d(var1.maxX, var1.minY, var1.maxZ),
         new Vec3d(var1.maxX, var1.maxY, var1.maxZ)
      };
   }

   public boolean NbtEditor(Vec3d var1) {
      if (minecraftClient3.gameRenderer != null && minecraftClient3.gameRenderer.getCamera() != null) {
         Vec3d vec3d = minecraftClient3.gameRenderer.getCamera().getPos();
         Vec3d vec3d1 = var1.subtract(vec3d);
         float f = minecraftClient3.gameRenderer.getCamera().getPitch();
         float f1 = minecraftClient3.gameRenderer.getCamera().getYaw();
         double d0 = Math.toRadians((double)f);
         double d1 = Math.toRadians((double)f1);
         Vec3d vec3d2 = new Vec3d(-Math.sin(d1) * Math.cos(d0), -Math.sin(d0), Math.cos(d1) * Math.cos(d0));
         return vec3d1.dotProduct(vec3d2) > 0.0;
      } else {
         return false;
      }
   }

   public static boolean BotFeatureRegistry(ItemStack var0) {
      if (var0.getItem() instanceof BlockItem blockitem && blockitem.getBlock() instanceof ShulkerBoxBlock) {
         return true;
      }

      return false;
   }

   public static DefaultedList<ItemStack> ServiceException(ItemStack var0) {
      DefaultedList defaultedlist = DefaultedList.ofSize(27, ItemStack.EMPTY);
      ContainerComponent containercomponent = var0.get(DataComponentTypes.CONTAINER);
      if (containercomponent != null) {
         containercomponent.copyTo(defaultedlist);
      }

      return defaultedlist;
   }
}
