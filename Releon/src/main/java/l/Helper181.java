package l;

import net.minecraft.client.util.math.MatrixStack.Entry;
import net.minecraft.util.Identifier;
import org.joml.Vector4i;

public class Helper181 {
   final Entry entry;
   final Identifier id;
   final float x;
   final float y;
   final float width;
   final float height;
   final Vector4i color;

   public Helper181(Entry var1, Identifier var2, float var3, float var4, float var5, float var6, Vector4i var7) {
      this.entry = var1;
      this.id = var2;
      this.x = var3;
      this.y = var4;
      this.width = var5;
      this.height = var6;
      this.color = var7;
   }

   public Entry method1530() {
      return this.entry;
   }

   public Identifier method1531() {
      return this.id;
   }

   public float method1532() {
      return this.x;
   }

   public float method1533() {
      return this.y;
   }

   public float method1534() {
      return this.width;
   }

   public float method1535() {
      return this.height;
   }

   public Vector4i method1536() {
      return this.color;
   }
}
