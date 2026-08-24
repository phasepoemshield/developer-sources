package org.zenith.module;

import org.zenith.core.BotFeaturesDto;
import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;

import org.zenith.setting.BooleanSetting3;
import org.zenith.setting.NumberSetting;
import org.zenith.setting.StringSetting;





import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Arm;

@ModuleInfo(
   name = "ViewModel",
   category = Category.RENDER,
   description = "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u043f\u043e\u0437\u0438\u0446\u0438\u0438"
)
public final class ViewModel extends Module {
   public static final ViewModel viewModel = new ViewModel();
   public final BooleanSetting3 rightArm = new BooleanSetting3(
      "module.viewModel.rightArm",
      "module.viewModel.rightArm.desc",
      () -> true,
      new NumberSetting("module.viewModel.rightArmX", 0.0F, -1.0F, 1.0F, 0.1F, "module.viewModel.rightArmX.desc", "b"),
      new NumberSetting("module.viewModel.rightArmY", 0.0F, -1.0F, 1.0F, 0.1F, "module.viewModel.rightArmY.desc", "b"),
      new NumberSetting("module.viewModel.rightArmZ", 0.0F, -1.0F, 1.0F, 0.1F, "module.viewModel.rightArmZ.desc", "b")
   );
   public final BooleanSetting3 leftArm = new BooleanSetting3(
      "module.viewModel.leftArm",
      "module.viewModel.leftArm.desc",
      () -> true,
      new NumberSetting("module.viewModel.leftArmX", 0.0F, -1.0F, 1.0F, 0.1F, "module.viewModel.leftArmX.desc", "b"),
      new NumberSetting("module.viewModel.leftArmY", 0.0F, -1.0F, 1.0F, 0.1F, "module.viewModel.leftArmY.desc", "b"),
      new NumberSetting("module.viewModel.leftArmZ", 0.0F, -1.0F, 1.0F, 0.1F, "module.viewModel.leftArmZ.desc", "b")
   );
   public final BooleanSetting3 sizeList = new BooleanSetting3(
      "module.viewModel.sizeList",
      "module.viewModel.sizeList.desc",
      () -> true,
      new NumberSetting("module.viewModel.rightArmSize", 1.0F, 0.5F, 1.5F, 0.05F, "module.viewModel.rightArmSize.desc", "x"),
      new NumberSetting("module.viewModel.leftArmSize", 1.0F, 0.5F, 1.5F, 0.05F, "module.viewModel.leftArmSize.desc", "x")
   );
    public final StringSetting reset = new StringSetting("module.viewModel.reset", "W", () -> {
       NumberSetting rightArmSize = this.sizeList.BotFeaturesDto(0);
       NumberSetting leftArmSize = this.sizeList.BotFeaturesDto(1);
       NumberSetting rightArmX = this.rightArm.BotFeaturesDto(0);
       NumberSetting rightArmY = this.rightArm.BotFeaturesDto(1);
       NumberSetting rightArmZ = this.rightArm.BotFeaturesDto(2);
       NumberSetting leftArmX = this.leftArm.BotFeaturesDto(0);
       NumberSetting leftArmY = this.leftArm.BotFeaturesDto(1);
       NumberSetting leftArmZ = this.leftArm.BotFeaturesDto(2);
       rightArmSize.setCurrent(1.0F);
       leftArmSize.setCurrent(1.0F);
       rightArmX.setCurrent(0.0F);
       rightArmY.setCurrent(0.0F);
       rightArmZ.setCurrent(0.0F);
       leftArmX.setCurrent(0.0F);
       leftArmY.setCurrent(0.0F);
       leftArmZ.setCurrent(0.0F);
    });

   public ViewModel() {
   }

   public void on23(MatrixStack var1, Arm var2) {
      if (this.isEnabled()) {
         if (var2 == Arm.RIGHT) {
            NumberSetting lilliiill11llilll1ll1lx = this.sizeList.BotFeaturesDto(0);
            var1.scale(lilliiill11llilll1ll1lx.getCurrent(), lilliiill11llilll1ll1lx.getCurrent(), lilliiill11llilll1ll1lx.getCurrent());
         } else {
            NumberSetting lilliiill11llilll1ll1l = this.sizeList.BotFeaturesDto(1);
            var1.scale(lilliiill11llilll1ll1l.getCurrent(), lilliiill11llilll1ll1l.getCurrent(), lilliiill11llilll1ll1l.getCurrent());
         }
      } else {
         var1.scale(1.0F, 1.0F, 1.0F);
      }
   }

   public void UiAnimation(MatrixStack var1, Arm var2) {
      if (this.isEnabled()) {
         if (var2 == Arm.RIGHT) {
            NumberSetting lilliiill11llilll1ll1lxxxxx = this.rightArm.BotFeaturesDto(0);
            NumberSetting lilliiill11llilll1ll1lx = this.rightArm.BotFeaturesDto(1);
            NumberSetting lilliiill11llilll1ll1lxx = this.rightArm.BotFeaturesDto(2);
            var1.translate(lilliiill11llilll1ll1lxxxxx.getCurrent(), lilliiill11llilll1ll1lx.getCurrent(), lilliiill11llilll1ll1lxx.getCurrent());
         } else {
            NumberSetting lilliiill11llilll1ll1lxx = this.leftArm.BotFeaturesDto(0);
            NumberSetting lilliiill11llilll1ll1lx = this.leftArm.BotFeaturesDto(1);
            NumberSetting lilliiill11llilll1ll1lxxx = this.leftArm.BotFeaturesDto(2);
            var1.translate(-lilliiill11llilll1ll1lxx.getCurrent(), lilliiill11llilll1ll1lx.getCurrent(), lilliiill11llilll1ll1lxxx.getCurrent());
         }
      } else {
         var1.translate(0.0F, 0.0F, 0.0F);
      }
   }
}
