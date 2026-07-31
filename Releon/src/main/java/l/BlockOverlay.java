package l;

import java.awt.Color;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;

public class BlockOverlay extends Helper242 {
   private final Setting7 shaderColor = new Setting7("Цвет шейдера", "Цвет волн на блоке")
      .method2555(new Color(115, 95, 255, 255).getRGB())
      .method2551(-9216001, -11555073, -42642, -13250400);
   private final Setting2 waveSpeed = new Setting2("Скорость волн", "Скорость анимации").method2086(0.8F).method2078(0.05F, 3.0F);
   private final Setting2 waveIntensity = new Setting2("Сила волн", "Яркость и контраст").method2086(1.0F).method2078(0.2F, 2.5F);
   private final Setting2 shaderAlpha = new Setting2("Прозрачность", "Прозрачность заливки").method2086(0.55F).method2078(0.05F, 1.0F);
   private final Setting2 moveSpeed = new Setting2("Скорость перемещения", "Плавность перехода между блоками").method2086(12.0F).method2078(1.0F, 30.0F);
   private Vec3d animatedPos;
   private long lastFrameNanos;

   public static BlockOverlay method2005() {
      return Helper222.method1979(BlockOverlay.class);
   }

   public BlockOverlay() {
      super("BlockOverlay", "Block Overlay", Helper269.RENDER);
      this.setup(new Helper264[]{this.shaderColor, this.waveSpeed, this.waveIntensity, this.shaderAlpha, this.moveSpeed});
   }

   @Override
   public void activate() {
      super.activate();
      this.animatedPos = null;
      this.lastFrameNanos = System.nanoTime();
   }

   @Override
   public void deactivate() {
      super.deactivate();
      this.animatedPos = null;
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      if (mc.crosshairTarget instanceof BlockHitResult var2 && var2.getType().equals(Type.BLOCK)) {
         BlockPos var7 = var2.getBlockPos();
         VoxelShape var4 = mc.world.getBlockState(var7).getOutlineShape(mc.world, var7);
         Vec3d var5 = this.method2006(Vec3d.of(var7));
         boolean var6 = Helper239.method2229(
            var1.method3708(),
            var5,
            var4,
            this.shaderColor.method2553(),
            this.waveSpeed.method2082(),
            this.waveIntensity.method2082(),
            this.shaderAlpha.method2082()
         );
         if (!var6) {
            this.method2007(var5, var4, true);
            return;
         }

         this.method2007(var5, var4, false);
      }
   }

   private Vec3d method2006(Vec3d var1) {
      long var2 = System.nanoTime();
      if (this.animatedPos == null) {
         this.animatedPos = var1;
         this.lastFrameNanos = var2;
         return this.animatedPos;
      } else {
         double var4 = Math.min((var2 - this.lastFrameNanos) / 1.0E9, 0.1);
         this.lastFrameNanos = var2;
         double var6 = 1.0 - Math.exp(-this.moveSpeed.method2082() * var4);
         this.animatedPos = this.animatedPos.lerp(var1, var6);
         if (this.animatedPos.squaredDistanceTo(var1) < 1.0E-6) {
            this.animatedPos = var1;
         }

         return this.animatedPos;
      }
   }

   private void method2007(Vec3d var1, VoxelShape var2, boolean var3) {
      for (Box var5 : var2.getBoundingBoxes()) {
         Helper183.method1546(var5.offset(var1).expand(0.002), this.shaderColor.method2553(), var3 ? 2.0F : 1.5F, true, var3, true);
      }
   }
}
