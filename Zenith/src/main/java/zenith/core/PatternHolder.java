package zenith;

import zenith.hud.*;

import java.awt.Color;
import java.util.regex.Pattern;
import net.minecraft.util.math.MathHelper;

public final class PatternHolder {
   public static final int Ill11lllIIlI1111I = -43691;
   private static final Pattern I11lIIIIIlI1IllI1 = Pattern.compile("(?i)§[0-9a-f-or]", 0);

   public static int BlockPosHolder_2(int i) {
      return i >> 16 & 0xFF;
   }

   public static int GetSlotIdHandler_2(int i) {
      return i >> 8 & 0xFF;
   }

   public static int ScreenHolder(int i) {
      return i & 0xFF;
   }

   public static int EventImpl_27(int i) {
      return i >> 24 & 0xFF;
   }

   public static float ZenithInternal125(int i) {
      return (float)BlockPosHolder_2(i) / 255.0F;
   }

   public static float ZenithInternal062(int i) {
      return (float)GetSlotIdHandler_2(i) / 255.0F;
   }

   public static float ZenithInternal111(int i) {
      return (float)ScreenHolder(i) / 255.0F;
   }

   public static float ZenithInternal055(int i) {
      return (float)EventImpl_27(i) / 255.0F;
   }

   public static int[] EventImpl_25(int i) {
      return new int[]{BlockPosHolder_2(i), GetSlotIdHandler_2(i), ScreenHolder(i), EventImpl_27(i)};
   }

   public static int[] EventImpl_32(int i) {
      return new int[]{BlockPosHolder_2(i), GetSlotIdHandler_2(i), ScreenHolder(i)};
   }

   public static float[] GetSlotIdHandler(int i) {
      return new float[]{ZenithInternal125(i), ZenithInternal062(i), ZenithInternal111(i), ZenithInternal055(i)};
   }

   public static float[] BlockHolder(int i) {
      return new float[]{ZenithInternal125(i), ZenithInternal062(i), ZenithInternal111(i)};
   }

   public static boolean StringHolder_23(String s) {
      return s != null && s.matches("(?i)^[a-f0-9]{6}$");
   }

   public static ByteBufferHolder StringHolder_8(String s, ByteBufferHolder il1iliilli1l1iill) {
      if (!StringHolder_23(s)) {
         return il1iliilli1l1iill;
      } else {
         int i = Integer.parseInt(s, 16);
         int j = i >> 16 & 0xFF;
         int k = i >> 8 & 0xFF;
         int l = i & 0xFF;
         return new ByteBufferHolder(new Color(j, k, l));
      }
   }

   public static String ZenithInternal045(ByteBufferHolder il1iliilli1l1iill) {
      int i = il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII();
      return String.format("%06X", i & 16777215);
   }

   public static ByteBufferHolder StringHolder_8(int i, int j, ByteBufferHolder il1iliilli1l1iill, ByteBufferHolder il1iliilli1l1iill1) {
      int k = (int)((System.currentTimeMillis() / (long)i + (long)j) % 360L);
      k = (k >= 180 ? 360 - k : k) * 2;
      return EventBus(il1iliilli1l1iill, il1iliilli1l1iill1, (float)k / 360.0F);
   }

   public static ByteBufferHolder StringHolder_8(int i, int j, ByteBufferHolder... ail1iliilli1l1iill) {
      int k = (int)((System.currentTimeMillis() / (long)i + (long)j) % 360L);
      k = (k > 180 ? 360 - k : k) + 180;
      int l = (int)((float)k / 360.0F * (float)ail1iliilli1l1iill.length);
      if (l == ail1iliilli1l1iill.length) {
         l--;
      }

      ByteBufferHolder il1iliilli1l1iill = ail1iliilli1l1iill[l];
      ByteBufferHolder il1iliilli1l1iill1 = ail1iliilli1l1iill[l == ail1iliilli1l1iill.length - 1 ? 0 : l + 1];
      return EventBus(il1iliilli1l1iill, il1iliilli1l1iill1, (float)k / 360.0F * (float)ail1iliilli1l1iill.length - (float)l);
   }

   public static ByteBufferHolder EventBus(ByteBufferHolder il1iliilli1l1iill, ByteBufferHolder il1iliilli1l1iill1, float f) {
      return il1iliilli1l1iill.StringHolder_8(il1iliilli1l1iill1, f);
   }

   public static String ArmorHud(String s) {
      return s != null && !s.isEmpty() ? I11lIIIIIlI1IllI1.matcher(s).replaceAll("") : null;
   }

   public static int EventBus(int i, float f) {
      return EventTarget(BlockPosHolder_2(i), GetSlotIdHandler_2(i), ScreenHolder(i), Math.round((float)EventImpl_27(i) * f));
   }

   private static int EventTarget(int i, int j, int k, int l) {
      return MathHelper.clamp(l, 0, 255) << 24
         | MathHelper.clamp(i, 0, 255) << 16
         | MathHelper.clamp(j, 0, 255) << 8
         | MathHelper.clamp(k, 0, 255);
   }

   public static int ZenithInternal127(int i) {
      return ZenithClient.getInstance().floatHolder_3().getClientColor(i).lllIlll1Ill111l111Il11II11lII();
   }

   private PatternHolder() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
