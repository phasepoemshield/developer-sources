package org.zenith.module;

import org.zenith.core.TextScanner;
import org.zenith.event.Event19;
import org.zenith.event.Event49;
import org.zenith.event.MovementInputEvent;
import org.zenith.util.Item;
import org.zenith.utility.render.display.base.CornerRadius;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.ColorAnimator;
import org.zenith.render.ScreenProjection;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;

import org.zenith.event.EventInjectAddEntity;
import org.zenith.event.EventRender2;

import org.zenith.base.font.Font;
import org.zenith.base.font.Fonts;
import org.zenith.client.screens.nlgui.style.ZenithStyle;
import org.zenith.utility.render.display.base.CustomDrawContext;
import org.zenith.utility.render.display.base.GuiSprite;














import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.item.Items;
import net.minecraft.util.math.Vec3d;

@ModuleInfo(
   name = "FireWorkESP",
   category = Category.RENDER,
   description = "\u0415\u0441\u043f \u043d\u0430 \u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a\u0438"
)
public final class FireWorkESP extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final FireWorkESP fireWorkESP = new FireWorkESP();
   public final Map<Vec3d, Long> map17 = new ConcurrentHashMap<>();

   public void on23(CustomDrawContext var1, Vec3d var2, long var3) {
      if (var1 != null) {
         Vec3d vec3d = ScreenProjection.Event19(var2);
         if (vec3d != null && !(vec3d.z <= 0.0) && !(vec3d.z >= 1.0)) {
            if (ScreenProjection.Event49(var2)) {
               ZenithStyle zenithstyle = ZenithClient.on23().TextScanner().getCurrentStyle();
               Font font = Fonts.MEDIUM.getFont(7.0F);
               String s = String.format("%.1f\u0441", (double)var3 / 1000.0);
               float f = 11.2F;
               float f1 = 2.0F;
               float f2 = font.width(s);
               float f3 = (float)vec3d.x;
               float f4 = (float)vec3d.y;
               float f5 = f + f1 + f2;
               float f6 = f3 - f5 / 2.0F;
               float f7 = f4 - f / 2.0F;
               float f8 = EntityESP.entityESP.getSize();
               this.pushCenteredScale(var1, f3, f4, f8, f8);
               var1.drawRoundedRect(
                  f6 - f1,
                  f7 - f1,
                  f5 + f1 * 2.0F,
                  f + f1 * 2.0F,
                  org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(2.0F),
                  zenithstyle.getSurfaceDisableBackground().getColor()
               );
               float f9 = f7 + (f - f) / 2.0F;
               var1.pushMatrix();
               var1.getMatrices().translate(f6, f9, 0.0F);
               var1.getMatrices().scale(0.7F, 0.7F, 1.0F);
               var1.drawItem(Items.FIREWORK_ROCKET.getDefaultStack(), 0, 0);
               var1.popMatrix();
               float f10 = f6 + f + f1;
               float f11 = f4 - font.height() / 2.0F;
               var1.drawText(font, s, f10, f11, zenithstyle.getTextEnable().getColor());
               this.pop(var1);
            }
         }
      }
   }

   public FireWorkESP() {
   }

   @EventTarget
   public void ColorAnimator(EventInjectAddEntity var1) {
      if (minecraftClient3.player != null && minecraftClient3.world != null) {
         if (var1.ElytraFly() instanceof FireworkRocketEntity fireworkrocketentity) {
            this.map17.put(fireworkrocketentity.getPos(), System.currentTimeMillis());
         }
      }
   }

   @EventTarget
   public void ColorAnimator(EventRender2 var1) {
      if (minecraftClient3.player != null && minecraftClient3.world != null) {
         long i = System.currentTimeMillis();
         var iterator = this.map17.entrySet().iterator();

         while (iterator.hasNext()) {
            var entry = (Entry)iterator.next();
            long j = i - (Long)entry.getValue();
            if (j > 10000L) {
               iterator.remove();
            } else {
               this.on23(var1.Bot(), (Vec3d)entry.getKey(), j);
            }
         }
      }
   }

   public void pushCenteredScale(CustomDrawContext var1, float var2, float var3, float var4, float var5) {
      var1.pushMatrix();
      var1.getMatrices().translate(var2, var3, 0.0F);
      var1.getMatrices().scale(var4, var5, 1.0F);
      var1.getMatrices().translate(-var2, -var3, 0.0F);
   }

   public void pop(CustomDrawContext var1) {
      var1.popMatrix();
   }

   @Override
   public void onEnable() {
      super.onEnable();
      this.map17.clear();
   }

   @Override
   public void onDisable() {
      super.onDisable();
      this.map17.clear();
   }
}
