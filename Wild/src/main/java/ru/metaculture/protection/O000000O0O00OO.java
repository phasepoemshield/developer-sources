package ru.metaculture.protection;

import net.minecraft.entity.Entity;
import org.joml.Vector2f;

public class O000000O0O00OO implements MinecraftAccessor {
   public float O00000000;
   public float O000000000;

   public O000000O0O00OO(Entity entity) {
      this.O00000000 = entity.getYaw();
      this.O000000000 = entity.getPitch();
   }

   public O000000O0O00OO(float f, float g) {
      this.O00000000 = f;
      this.O000000000 = g;
   }

   public float O00000000(O000000O0O00OO o000000O0O00OO) {
      float var2 = O0000O00OO0OO0.O000000000000O(o000000O0O00OO.O00000000 - this.O00000000);
      float var3 = o000000O0O00OO.O000000000 - this.O000000000;
      return (float)Math.hypot(Math.abs(var2), Math.abs(var3));
   }

   public double O000000000(O000000O0O00OO o000000O0O00OO) {
      double var2 = O0000O00OO0OO0.O000000000000O(o000000O0O00OO.O00000000 - this.O00000000);
      double var4 = O0000O00OO0OO0.O000000000000O(o000000O0O00OO.O000000000 - this.O000000000);
      return Math.hypot(var2, var4);
   }

   public static Vector2f O00000000() {
      return new Vector2f(O000000000(), O0000000000());
   }

   public static float O000000000() {
      return O0000O00OO0OO0.O000000000000O(a_.gameRenderer.getCamera().getYaw() + (a_.gameRenderer.getCamera().isThirdPerson() ? 180 : 0));
   }

   public static float O0000000000() {
      return (a_.gameRenderer.getCamera().isThirdPerson() ? -1 : 1) * a_.gameRenderer.getCamera().getPitch();
   }
}
