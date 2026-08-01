package zenith;

import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.text.MutableText;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public final class TextHolder implements ZenithInternal076 {
   public static final Text ll1l1lIIIIII1Il1lll1 = Text.empty();

   public static void StringHolder_8(StringHolder$Helper_3 il111ili1li1i1iiil11lll11l1i$ii1il11l111ii11iil, String s) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
         ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
         MutableText MutableText = StringHolder_8(
               zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(),
               zenithstyle.getSecondaryPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(),
               zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1()
            )
            .append(Text.literal(" "))
            .append(StringHolder_8(s, il111ili1li1i1iiil11lll11l1i$ii1il11l111ii11iil, zenithstyle));
         l11I1I1ll1Illll1I1l1111l1II.player.sendMessage(MutableText, false);
      }
   }

   public static void StringHolder_26(String s) {
      StringHolder_8(StringHolder$Helper_3.II11I1I1II1Ill1ll1l11lI1, s);
   }

   public static void floatHolder_11(String s) {
      StringHolder_8(StringHolder$Helper_3.llIIII1I1I11IIlI1l1ll1lIII11ll, s);
   }

   public static void EventImpl_27(String s) {
      StringHolder_8(StringHolder$Helper_3.IIlIllllI1lIlll11l, s);
   }

   private static MutableText StringHolder_8(ByteBufferHolder il1iliilli1l1iill, ByteBufferHolder il1iliilli1l1iill1, ByteBufferHolder il1iliilli1l1iill2) {
      return Text.empty()
         .append(StringHolder_8("[ ", il1iliilli1l1iill2, false))
         .append(StringHolder_8("Zenith", il1iliilli1l1iill.StringHolder_24(0.12F), il1iliilli1l1iill1.StringHolder_24(0.08F), true, 0))
         .append(StringHolder_8(" ]", il1iliilli1l1iill2, false));
   }

   private static MutableText StringHolder_8(
      StringHolder$Helper_3 il111ili1li1i1iiil11lll11l1i$ii1il11l111ii11iil, SetColorHandler_3 llliili1l1ii11i1lii1
   ) {
      ByteBufferHolder il1iliilli1l1iill = il111ili1li1i1iiil11lll11l1i$ii1il11l111ii11iil.l1IllIl1l1llIlI11I11Il1l1l1lI1()
         .StringHolder_8(llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(), 0.15F)
         .StringHolder_24(0.08F);
      ByteBufferHolder il1iliilli1l1iill1 = il1iliilli1l1iill.StringHolder_8(llliili1l1ii11i1lii1.l11II1lIlIIIlll11lIII(), 0.25F);
      return Text.empty()
         .append(StringHolder_8("<", llliili1l1ii11i1lii1.I111llllll1ll1l1Il(), false))
         .append(
            StringHolder_8(il111ili1li1i1iiil11lll11l1i$ii1il11l111ii11iil.llI11ll1l1I1Il1ll1II1l11l1(), il1iliilli1l1iill, il1iliilli1l1iill1, true, 0)
         )
         .append(StringHolder_8(">", llliili1l1ii11i1lii1.I111llllll1ll1l1Il(), false));
   }

   private static MutableText StringHolder_8(
      String s, StringHolder$Helper_3 il111ili1li1i1iiil11lll11l1i$ii1il11l111ii11iil, ZenithStyle zenithstyle
   ) {
      String s1 = s == null ? "" : s;
      int i = Math.min(8, s1.codePointCount(0, s1.length()));
      ByteBufferHolder il1iliilli1l1iill = il111ili1li1i1iiil11lll11l1i$ii1il11l111ii11iil.l1IllIl1l1llIlI11I11Il1l1l1lI1()
         .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), 0.3F)
         .StringHolder_24(0.12F);
      ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getTextEnable()
         .l1IllIl1l1llIlI11I11Il1l1l1lI1()
         .StringHolder_8(zenithstyle.getSecondaryPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), 0.15F);
      return StringHolder_8(s1, il1iliilli1l1iill, il1iliilli1l1iill1, false, i);
   }

   private static MutableText StringHolder_8(String s, ByteBufferHolder il1iliilli1l1iill, boolean flag) {
      return Text.literal(s).setStyle(Style.EMPTY.withColor(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII()).withBold(flag));
   }

   private static MutableText StringHolder_8(String s, ByteBufferHolder il1iliilli1l1iill, ByteBufferHolder il1iliilli1l1iill1, boolean flag, int i) {
      MutableText MutableText = Text.empty();
      if (s != null && !s.isEmpty()) {
         int j = s.codePointCount(0, s.length());
         int[] aint = new int[]{0};
         s.codePoints()
            .forEach(
               i1 -> {
                  float f = j <= 1 ? 0.0F : (float)aint[0] / (float)(j - 1);
                  ByteBufferHolder il1iliilli1l1iill4 = il1iliilli1l1iill.StringHolder_8(il1iliilli1l1iill1, f);
                  boolean flag2 = flag || aint[0] < i;
                  MutableText.append(
                     Text.literal(new String(Character.toChars(i1)))
                        .setStyle(Style.EMPTY.withColor(il1iliilli1l1iill4.lllIlll1Ill111l111Il11II11lII()).withBold(flag2))
                  );
                  aint[0]++;
               }
            );
         return MutableText;
      } else {
         return MutableText;
      }
   }

   private TextHolder() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
