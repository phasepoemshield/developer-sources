package l;

import net.minecraft.text.Text;

public class Helper198 {
   final Text title;
   final Text text;
   final Helper467 anim;
   final long startTime;
   final long removeTime;
   private final int accentColor;
   private final int progressColor;
   private final Helper196 type;

   public Helper198(Text var1, Text var2, Helper467 var3, long var4, long var6, int var8, int var9, Helper196 var10) {
      this.title = var1;
      this.text = var2;
      this.anim = var3;
      this.startTime = var4;
      this.removeTime = var6;
      this.accentColor = var8;
      this.progressColor = var9;
      this.type = var10;
   }

   public boolean method1657() {
      return System.currentTimeMillis() > this.removeTime;
   }

   public Text method1658() {
      return this.title;
   }

   public Text method1659() {
      return this.text;
   }

   public Helper467 method1660() {
      return this.anim;
   }

   public long method1661() {
      return this.startTime;
   }

   public long method1662() {
      return this.removeTime;
   }

   public int method1663() {
      return this.accentColor;
   }

   public int method1664() {
      return this.progressColor;
   }

   public Helper196 method1665() {
      return this.type;
   }
}
