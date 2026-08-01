package zenith;

import java.util.List;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

@ModuleInfo(
   name = "NoPush",
   description = "No Push",
   category = Category.MOVEMENT
)
public final class Nopush extends Module {
   private final MultiBooleanSetting lI11lIIl1l111II1I1llI1llI = MultiBooleanSetting.StringHolder_8(
      "module.noPush.ignoreSetting",
      "module.noPush.ignoreSetting.desc",
      List.of(
         "module.noPush.ignoreSetting.water",
         "module.noPush.ignoreSetting.blocks",
         "module.noPush.ignoreSetting.entities",
         "module.noPush.ignoreSetting.snow",
         "module.noPush.ignoreSetting.berries"
      )
   );
   public static final Nopush lI1II1IlI1lI1llllllIll1l1 = new Nopush();

   private Nopush() {
   }

   @EventTarget
   public void StringHolder_8(ZenithInternal127 lilili1lilli111illllliill) {
      switch (lilili1lilli111illllliill.Wallbypass()) {
         case IlIlllI1I1lI1lI1:
            lilili1lilli111illllliill.EventBus(this.lI11lIIl1l111II1I1llI1llI.ConstructorHolder(2));
            break;
         case llII1IlIl1l1IIl1llI11Ill:
            lilili1lilli111illllliill.EventBus(this.lI11lIIl1l111II1I1llI1llI.ConstructorHolder(0));
            break;
         case l1l1IIlI11l11I1l1l:
            lilili1lilli111illllliill.EventBus(this.lI11lIIl1l111II1I1llI1llI.ConstructorHolder(1));
      }
   }

   @EventTarget
   public void StringHolder_8(BlockHolder illl1ilili1il11ll11) {
      Block Block = illl1ilili1il11ll11.Strafe();
      if (Block.equals(Blocks.POWDER_SNOW)) {
         illl1ilili1il11ll11.EventBus(this.lI11lIIl1l111II1I1llI1llI.ConstructorHolder(3));
      } else if (Block.equals(Blocks.SWEET_BERRY_BUSH)) {
         illl1ilili1il11ll11.EventBus(this.lI11lIIl1l111II1I1llI1llI.ConstructorHolder(4));
      }
   }
}
