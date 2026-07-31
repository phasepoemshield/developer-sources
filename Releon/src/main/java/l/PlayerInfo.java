package l;

import java.awt.Color;
import java.util.Objects;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.BlockPos;

public class PlayerInfo extends Helper119 {
   public PlayerInfo() {
      super("Player Info", 0, 200, 60, 12, true);
   }

   @Override
   public void method310(DrawContext var1) {
      BlockPos var2 = Objects.requireNonNull(mc.player).getBlockPos();
      Helper175 var3 = Helper103.method927(14, Helper101.DEFAULT);
      String var4 = "Bps: " + Helper147.method1235(Helper165.method1364(mc.player) * 20.0, 0.25);
      String var5 = "Tps: " + Helper147.method1235(Helper128.TPS, 0.1F);
      String var6 = "Xyz: " + var2.getX() + ", " + var2.getY() + ", " + var2.getZ();
      String var7 = var6 + " • " + var5 + " • " + var4;
      float var8 = var3.method1479(var7);
      float var9 = 6.0F;
      float var10 = 4.0F;
      float var11 = var8 + var9 * 2.0F;
      this.method975((int)var11);
      this.method976(12);
      int var12 = -15723752;
      int var13 = Hud.method1824().method1827();
      short var14 = 190;
      Helper12.method361(var1.getMatrices(), this.method981(), this.method982() + 1.0F, var11, 12.0F, 3.0F, var14, var12, var13);
      if (!Hud.method1824().method1838()) {
         rectangle.method677(
            Helper80.method841(var1.getMatrices(), this.method981(), this.method982() + 1.0F, var11, 12.0)
               .method826(3.0F)
               .method835(0.7F)
               .method839(Helper133.method1106(var13, 90))
               .method823(Helper133.method1106(var12, var14))
               .method840()
         );
      }

      var3.method1475(
         var1.getMatrices(),
         var7,
         this.method981() + var9,
         this.method982() + var10 + 1.0F,
         new Color(225, 225, 255, 255).getRGB(),
         new Color(255, 255, 255, 255).getRGB()
      );
   }
}
