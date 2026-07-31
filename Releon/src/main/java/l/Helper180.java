package l;

import net.minecraft.client.util.math.MatrixStack.Entry;
import net.minecraft.util.math.Vec3d;

public class Helper180 {
   final Entry entry;
   final Vec3d start;
   final Vec3d end;
   final int colorStart;
   final int colorEnd;
   final float width;

   public Helper180(Entry var1, Vec3d var2, Vec3d var3, int var4, int var5, float var6) {
      this.entry = var1;
      this.start = var2;
      this.end = var3;
      this.colorStart = var4;
      this.colorEnd = var5;
      this.width = var6;
   }

   public Entry method1524() {
      return this.entry;
   }

   public Vec3d method1525() {
      return this.start;
   }

   public Vec3d method1526() {
      return this.end;
   }

   public int method1527() {
      return this.colorStart;
   }

   public int method1528() {
      return this.colorEnd;
   }

   public float method1529() {
      return this.width;
   }
}
