package l;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class Helper466 implements Helper94, Helper160 {
   public List<Helper298> wayList = new ArrayList<>();

   public Helper466(Helper124 var1) {
      var1.method1016(this);
   }

   public boolean method4985() {
      return this.wayList.isEmpty();
   }

   public void method4986(String var1, BlockPos var2, String var3) {
      this.wayList.add(new Helper298(var1, var2, var3));
   }

   public boolean method4987(String var1) {
      return this.wayList.stream().anyMatch(var1x -> var1x.method2934().equalsIgnoreCase(var1));
   }

   public void method4988(String var1) {
      this.wayList.removeIf(var1x -> var1x.method2934().equalsIgnoreCase(var1));
   }

   public void method4989() {
      if (!this.method4985()) {
         this.wayList.clear();
      }
   }

   @Helper104
   public void onDraw(Event20 var1) {
      if (!this.method4985() && mc.getNetworkHandler() != null && mc.getNetworkHandler().getServerInfo() != null) {
         MatrixStack var2 = var1.method4058().getMatrices();
         this.wayList
            .forEach(
               var1x -> {
                  Vec3d var2x = var1x.method2935().toCenterPos();
                  Vec3d var3 = Helper148.method1251(var2x);
                  if (Helper148.method1255(var2x) && var1x.method2936().equalsIgnoreCase(mc.getNetworkHandler().getServerInfo().address)) {
                     String var4 = var1x.method2934()
                        + " - "
                        + Helper147.method1235(mc.getEntityRenderDispatcher().camera.getPos().distanceTo(var2x), 0.1F)
                        + "m";
                     Helper175 var5 = Helper103.method927(14, Helper101.SEMI);
                     float var6 = var5.method1481(var4) / 4.0F;
                     float var7 = var5.method1479(var4);
                     float var8 = 3.0F;
                     double var9 = var3.getX() - var7 / 2.0F;
                     double var11 = var3.getY() - var6 / 2.0F;
                     rectangle.method677(
                        Helper80.method841(var2, var9 - var8, var11 - var8, var7 + var8 * 2.0F, var6 + var8 * 2.0F)
                           .method826(4.0F)
                           .method835(2.0F)
                           .method839(new Color(0, 0, 0, 255).getRGB())
                           .method825(
                              new Color(0, 0, 0, 255).getRGB(),
                              new Color(0, 0, 0, 255).getRGB(),
                              new Color(0, 0, 0, 255).getRGB(),
                              new Color(0, 0, 0, 255).getRGB()
                           )
                           .method840()
                     );
                     var5.method1474(var2, var4, var9, var11 + 0.5, Helper133.method1160());
                  }
               }
            );
      }
   }
}
