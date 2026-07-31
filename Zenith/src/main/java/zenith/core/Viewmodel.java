package zenith;

import net.minecraft.util.Arm;
import net.minecraft.client.util.math.MatrixStack;

@ModuleInfo(
   name = "ViewModel",
   category = Category.RENDER,
   description = "Настройка позиции"
)
public final class Viewmodel extends Module {
   public static final Viewmodel lIll1lll1lI1I = new Viewmodel();
   public final ContainerSetting llII11l111l1lI1lll1 = new ContainerSetting(
      "module.viewModel.rightArm",
      "module.viewModel.rightArm.desc",
      () -> true,
      new NumberSetting("module.viewModel.rightArmX", 0.0F, -1.0F, 1.0F, 0.1F, "module.viewModel.rightArmX.desc", "b"),
      new NumberSetting("module.viewModel.rightArmY", 0.0F, -1.0F, 1.0F, 0.1F, "module.viewModel.rightArmY.desc", "b"),
      new NumberSetting("module.viewModel.rightArmZ", 0.0F, -1.0F, 1.0F, 0.1F, "module.viewModel.rightArmZ.desc", "b"),
      new BooleanSetting("module.viewModel.jerkOff", "module.viewModel.jerkOff.desc", false)
   );
   public final ContainerSetting l1lIIl1Il1l1IIIl1IIlI = new ContainerSetting(
      "module.viewModel.leftArm",
      "module.viewModel.leftArm.desc",
      () -> true,
      new NumberSetting("module.viewModel.leftArmX", 0.0F, -1.0F, 1.0F, 0.1F, "module.viewModel.leftArmX.desc", "b"),
      new NumberSetting("module.viewModel.leftArmY", 0.0F, -1.0F, 1.0F, 0.1F, "module.viewModel.leftArmY.desc", "b"),
      new NumberSetting("module.viewModel.leftArmZ", 0.0F, -1.0F, 1.0F, 0.1F, "module.viewModel.leftArmZ.desc", "b")
   );
   public final ContainerSetting I1l1IIIlIlll1I = new ContainerSetting(
      "module.viewModel.sizeList",
      "module.viewModel.sizeList.desc",
      () -> true,
      new NumberSetting("module.viewModel.rightArmSize", 1.0F, 0.5F, 1.5F, 0.05F, "module.viewModel.rightArmSize.desc", "x"),
      new NumberSetting("module.viewModel.leftArmSize", 1.0F, 0.5F, 1.5F, 0.05F, "module.viewModel.leftArmSize.desc", "x")
   );
   public final ButtonSetting IlII1l1lIIIl111IlIII1II = new ButtonSetting("module.viewModel.reset", "W", () -> {
      NumberSetting illil1lill1llll11 = this.I1l1IIIlIlll1I.SocketFactoryHolder(0);
      NumberSetting illil1lill1llll111 = this.I1l1IIIlIlll1I.SocketFactoryHolder(1);
      NumberSetting illil1lill1llll112 = this.llII11l111l1lI1lll1.SocketFactoryHolder(0);
      NumberSetting illil1lill1llll113 = this.llII11l111l1lI1lll1.SocketFactoryHolder(1);
      NumberSetting illil1lill1llll114 = this.llII11l111l1lI1lll1.SocketFactoryHolder(2);
      NumberSetting illil1lill1llll115 = this.l1lIIl1Il1l1IIIl1IIlI.SocketFactoryHolder(0);
      NumberSetting illil1lill1llll116 = this.l1lIIl1Il1l1IIIl1IIlI.SocketFactoryHolder(1);
      NumberSetting illil1lill1llll117 = this.l1lIIl1Il1l1IIIl1IIlI.SocketFactoryHolder(2);
      illil1lill1llll11.longHolder_4(1.0F);
      illil1lill1llll111.longHolder_4(1.0F);
      illil1lill1llll112.longHolder_4(0.0F);
      illil1lill1llll113.longHolder_4(0.0F);
      illil1lill1llll114.longHolder_4(0.0F);
      illil1lill1llll115.longHolder_4(0.0F);
      illil1lill1llll116.longHolder_4(0.0F);
      illil1lill1llll117.longHolder_4(0.0F);
   });

   private Viewmodel() {
   }

   public void StringHolder_8(MatrixStack MatrixStack, Arm Arm) {
      if (this.Spider()) {
         if (Arm == Arm.RIGHT) {
            NumberSetting illil1lill1llll11 = this.I1l1IIIlIlll1I.SocketFactoryHolder(0);
            MatrixStack.scale(
               illil1lill1llll11.lll1lI1llll1IIllIIIII1lll(), illil1lill1llll11.lll1lI1llll1IIllIIIII1lll(), illil1lill1llll11.lll1lI1llll1IIllIIIII1lll()
            );
         } else {
            NumberSetting illil1lill1llll111 = this.I1l1IIIlIlll1I.SocketFactoryHolder(1);
            MatrixStack.scale(
               illil1lill1llll111.lll1lI1llll1IIllIIIII1lll(), illil1lill1llll111.lll1lI1llll1IIllIIIII1lll(), illil1lill1llll111.lll1lI1llll1IIllIIIII1lll()
            );
         }
      } else {
         MatrixStack.scale(1.0F, 1.0F, 1.0F);
      }
   }

   public void EventBus(MatrixStack MatrixStack, Arm Arm) {
      if (this.Spider()) {
         if (Arm == Arm.RIGHT) {
            NumberSetting illil1lill1llll11 = this.llII11l111l1lI1lll1.SocketFactoryHolder(0);
            NumberSetting illil1lill1llll111 = this.llII11l111l1lI1lll1.SocketFactoryHolder(1);
            NumberSetting illil1lill1llll112 = this.llII11l111l1lI1lll1.SocketFactoryHolder(2);
            MatrixStack.translate(
               illil1lill1llll11.lll1lI1llll1IIllIIIII1lll(), illil1lill1llll111.lll1lI1llll1IIllIIIII1lll(), illil1lill1llll112.lll1lI1llll1IIllIIIII1lll()
            );
         } else {
            NumberSetting illil1lill1llll113 = this.l1lIIl1Il1l1IIIl1IIlI.SocketFactoryHolder(0);
            NumberSetting illil1lill1llll114 = this.l1lIIl1Il1l1IIIl1IIlI.SocketFactoryHolder(1);
            NumberSetting illil1lill1llll115 = this.l1lIIl1Il1l1IIIl1IIlI.SocketFactoryHolder(2);
            MatrixStack.translate(
               -illil1lill1llll113.lll1lI1llll1IIllIIIII1lll(), illil1lill1llll114.lll1lI1llll1IIllIIIII1lll(), illil1lill1llll115.lll1lI1llll1IIllIIIII1lll()
            );
         }
      } else {
         MatrixStack.translate(0.0F, 0.0F, 0.0F);
      }
   }
}
