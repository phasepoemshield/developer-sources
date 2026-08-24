package org.zenith.module;

import org.zenith.core.ItemRegistry;
import org.zenith.core.EnchantItemSpec;
import org.zenith.core.FileLogger;
import org.zenith.core.ImageEncoder;
import org.zenith.event.RefreshCacheEvent;
import org.zenith.setting.Setting;
import org.zenith.util.Item;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.ItemSpec;
import org.zenith.util.ScreenUtils;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.StyledTextBuilder;

import org.zenith.event.EventTriggerKeyEvent;
import org.zenith.event.MovementInputEvent;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.StringSetting2;





import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Items;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;
import net.minecraft.util.PlayerInput;

@ModuleInfo(
   name = "ElytraHelper",
   description = "\u041f\u043e\u043c\u043e\u0449\u043d\u0438\u043a \u0434\u043b\u044f \u044d\u043b\u0438\u0442\u0440",
   category = Category.MISC
)
public final class ElytraHelper extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final ElytraHelper elytraHelper = new ElytraHelper();
   public final StringSetting2 elytraSetting = new StringSetting2("module.elytraHelper.elytraSetting", "module.elytraHelper.elytraSetting.desc");
   public final StringSetting2 fireworkSetting = new StringSetting2("module.elytraHelper.fireworkSetting", "module.elytraHelper.fireworkSetting.desc");
   public final BooleanSetting startSetting = new BooleanSetting(
      "module.elytraHelper.startSetting", "module.elytraHelper.startSetting.desc", false
   );
   public final BooleanSetting sprintSetting = new BooleanSetting(
      "module.elytraHelper.sprintSetting", "module.elytraHelper.sprintSetting.desc", false, this.startSetting::isEnabled
   );
   public final BooleanSetting onlyHotBar = new BooleanSetting("module.elytraHelper.onlyHotBar", "module.elytraHelper.onlyHotBar.desc", false);

   @Override
   public void onEnable() {
      StyledTextBuilder.RefreshCacheEvent(
         "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u0431\u043e\u043b\u044c\u0448\u0435 \u0441 \u0432\u043a\u043b \u0441\u043f\u0440\u0438\u043d\u0442\u043e\u043c + \u043d\u0430\u0434\u043e \u0431\u044b\u0442\u044c \u043d\u0430 \u0432\u0435\u0440\u0441\u0438\u0438 1.21.1 \u0438 \u043d\u0438\u0436\u0435 \u043d\u043e \u043d\u0430 \u0445\u0432 \u0431\u0430\u043d\u0438\u0442"
      );
      super.onEnable();
   }

   public ElytraHelper() {
   }

   @EventTarget
   public void ItemSpec(MovementInputEvent var1) {
      if (minecraftClient3.player.isAlive() && minecraftClient3.player.currentScreenHandler instanceof PlayerScreenHandler) {
         if (ZenithClient.on23().FileLogger().ImageEncoder()
            && this.startSetting.isEnabled()
            && Objects.requireNonNull(minecraftClient3.player).getEquippedStack(EquipmentSlot.CHEST).getItem().equals(Items.ELYTRA)) {
            if (minecraftClient3.player.isOnGround()) {
               var1.EnchantItemSpec(true);
            } else if (!minecraftClient3.player.isGliding()) {
               if (this.sprintSetting.isEnabled()
                  && minecraftClient3.player.canSprint()
                  && !minecraftClient3.player.horizontalCollision
                  && !minecraftClient3.player.isBlind()
                  && !minecraftClient3.player.isUsingItem()
                  && !minecraftClient3.player.isSubmergedInWater()) {
                  minecraftClient3.player.setSprinting(true);
               }

               var1.EnchantItemSpec(!minecraftClient3.player.lastPlayerInput.jump());
            } else if (minecraftClient3.player.isGliding() && minecraftClient3.player.horizontalCollision) {
               var1.on23(
                  new PlayerInput(
                     false,
                     var1.NoSweetSlow().backward(),
                     var1.NoSweetSlow().left(),
                     var1.NoSweetSlow().right(),
                     var1.NoSweetSlow().jump(),
                     var1.NoSweetSlow().sneak(),
                     var1.NoSweetSlow().sprint()
                  )
               );
            }
         }
      }
   }

   @EventTarget
   public void on23(EventTriggerKeyEvent var1) {
      if (var1.ItemRegistry(this.elytraSetting.getKeyCode())) {
         this.double24();
      } else if (var1.ItemRegistry(this.fireworkSetting.getKeyCode()) && minecraftClient3.player.isGliding()) {
         ScreenUtils.on23(Items.FIREWORK_ROCKET, Hand.OFF_HAND);
      }
   }

   public void double24() {
      Slot slot = this.double25();
      if (slot != null) {
         ScreenUtils.on23(slot, 6, true, false);
      }
   }

   public Slot double25() {
      return Objects.requireNonNull(minecraftClient3.player).getEquippedStack(EquipmentSlot.CHEST).getItem().equals(Items.ELYTRA)
         ? ScreenUtils.on23(
            List.of(
               Items.NETHERITE_CHESTPLATE,
               Items.DIAMOND_CHESTPLATE,
               Items.CHAINMAIL_CHESTPLATE,
               Items.IRON_CHESTPLATE,
               Items.GOLDEN_CHESTPLATE,
               Items.LEATHER_CHESTPLATE
            ),
            Comparator.comparingInt(var0 -> var0.id)
         )
         : ScreenUtils.on23(
            minecraftClient3.player.playerScreenHandler, Items.ELYTRA, Comparator.comparingInt(var0 -> var0.id), var0 -> true
         );
   }

   public boolean double26() {
      return this.onlyHotBar.isEnabled();
   }
}
