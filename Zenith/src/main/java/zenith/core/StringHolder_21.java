package zenith;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.text.MutableText;
import net.minecraft.text.OrderedText;

public final class StringHolder_21 implements ZenithInternal076 {
   private static final String IIllllI111I1IIIIll1 = "ёйцукенгшщзхъфывапролджэячсмитьбю";
   private static final String II11I1lI1l = "`qwertyuiop[]asdfghjkl;'zxcvbnm,.";

   public static String byteHolder_2(double d0) {
      return String.format(Locale.US, "%.1f", d0);
   }

   public static Text Event(Text Text) {
      OrderedText OrderedText = Text.asOrderedText();
      MutableText MutableText = Text.empty();
      StringBuilder stringbuilder = new StringBuilder();
      Style[] aStyle = new Style[]{Style.EMPTY};
      boolean[] aboolean = new boolean[]{true};
      OrderedText.accept((j, Style, i) -> {
         if (aboolean[0] && Character.isWhitespace(i)) {
            return true;
         } else {
            aboolean[0] = false;
            if (!Style.equals(aStyle[0])) {
               if (stringbuilder.length() > 0) {
                  MutableText.append(Text.literal(stringbuilder.toString()).setStyle(aStyle[0]));
                  stringbuilder.setLength(0);
               }

               aStyle[0] = Style;
            }

            stringbuilder.appendCodePoint(i);
            return true;
         }
      });
      if (stringbuilder.length() > 0) {
         MutableText.append(Text.literal(stringbuilder.toString()).setStyle(aStyle[0]));
      }

      return MutableText;
   }

   public static MutableText StringHolder_8(Text Text, Text Text, Text Text) {
      String s = Text.getString();
      String s1 = Textxx.getString();
      if (s1 != null && !s1.isEmpty()) {
         int i = s.indexOf(s1);
         if (i == -1) {
            return Text.copy();
         } else {
            int j = i + s1.length();
            int k = s.codePointCount(0, i);
            int l = s.codePointCount(0, j);
            OrderedText OrderedText = Text.asOrderedText();
            ArrayList arraylist = new ArrayList();
            OrderedText.accept((k1, Style, j1) -> {
               arraylist.add(new StringHolder$Helper_8(new String(Character.toChars(j1)), Style));
               return true;
            });
            MutableText MutableText = Text.empty();

            for (int i1 = 0; i1 < arraylist.size(); i1++) {
               if (i1 == k) {
                  MutableText.append(Textx.copy());
               }

               if (i1 < k || i1 >= l) {
                  StringHolder$Helper_8 l1l1i1ill1ll$ii1il11l111ii11iil = (StringHolder$Helper_8)arraylist.get(i1);
                  MutableText.append(
                     Text.literal(l1l1i1ill1ll$ii1il11l111ii11iil.text()).setStyle(l1l1i1ill1ll$ii1il11l111ii11iil.l1l11l111IIl11lI1I1111lII1())
                  );
               }
            }

            return MutableText;
         }
      } else {
         return Text.copy();
      }
   }

   public static MutableText StringHolder_8(Text Text, String s, Text Text) {
      if (Text != null && s != null && !s.isEmpty()) {
         OrderedText OrderedText = Text.asOrderedText();
         ArrayList arraylist = new ArrayList();
         StringBuilder stringbuilder = new StringBuilder();
         OrderedText.accept((j1, Style, i1) -> {
            String s2 = new String(Character.toChars(i1));
            arraylist.add(new StringHolder$Helper_8(s2, Style));
            stringbuilder.append(s2);
            return true;
         });
         String s1 = stringbuilder.toString();
         int i = s1.indexOf(s);
         if (i == -1) {
            return Text.copy();
         } else {
            int j = i + s.length();
            int k = s1.codePointCount(0, j);
            MutableText MutableText = Text.empty();
            MutableText.append(Textx.copy());

            for (int l = k; l < arraylist.size(); l++) {
               StringHolder$Helper_8 l1l1i1ill1ll$ii1il11l111ii11iil = (StringHolder$Helper_8)arraylist.get(l);
               MutableText.append(
                  Text.literal(l1l1i1ill1ll$ii1il11l111ii11iil.text()).setStyle(l1l1i1ill1ll$ii1il11l111ii11iil.l1l11l111IIl11lI1I1111lII1())
               );
            }

            return MutableText;
         }
      } else {
         return Text == null ? Text.empty() : Text.copy();
      }
   }

   public static Text StringHolder_8(Text Text, boolean flag) {
      OrderedText OrderedText = Text.asOrderedText();
      MutableText MutableText = Text.empty();
      StringBuilder stringbuilder = new StringBuilder();
      Style[] aStyle = new Style[]{Style.EMPTY};
      int[] aint = new int[]{0};
      boolean[] aboolean = new boolean[]{false};
      OrderedText.accept((j, Style, i) -> {
         if (aint[0] > 2) {
            aboolean[0] = true;
            return false;
         } else {
            if (!Stylex.equals(aStyle[0])) {
               if (!stringbuilder.isEmpty()) {
                  MutableText.append(Text.literal(stringbuilder.toString()).setStyle(aStyle[0]));
                  stringbuilder.setLength(0);
               }

               aStyle[0] = Stylex;
            }

            stringbuilder.appendCodePoint(i);
            if (Character.isWhitespace(i)) {
               aint[0]++;
            }

            return true;
         }
      });
      if (stringbuilder.length() > 0) {
         MutableText.append(Text.literal(stringbuilder.toString()).setStyle(aStyle[0]));
      }

      if (flag && aboolean[0]) {
         Style Style = aStyle[0] != null ? aStyle[0] : Text.getStyle();
         MutableText.append(Text.literal("…").setStyle(Style));
      }

      return MutableText;
   }

   public static Text StringHolder_8(Text Text, int i, boolean flag) {
      if (i <= 0) {
         return Text.empty();
      } else {
         OrderedText OrderedText = Text.asOrderedText();
         MutableText MutableText = Text.empty();
         StringBuilder stringbuilder = new StringBuilder();
         Style[] aStyle = new Style[]{Style.EMPTY};
         int[] aint = new int[]{0};
         boolean[] aboolean = new boolean[]{false};
         OrderedText.accept((l, Style, k) -> {
            if (aint[0] >= i) {
               aboolean[0] = true;
               return false;
            } else {
               if (!Stylex.equals(aStyle[0])) {
                  if (stringbuilder.length() > 0) {
                     MutableText.append(Text.literal(stringbuilder.toString()).setStyle(aStyle[0]));
                     stringbuilder.setLength(0);
                  }

                  aStyle[0] = Stylex;
               }

               stringbuilder.appendCodePoint(k);
               aint[0]++;
               return true;
            }
         });
         if (stringbuilder.length() > 0) {
            MutableText.append(Text.literal(stringbuilder.toString()).setStyle(aStyle[0]));
         }

         if (flag && aboolean[0]) {
            Style Style = aStyle[0] != null ? aStyle[0] : Text.getStyle();
            return MutableText.append(Text.literal("…").setStyle(Style));
         } else {
            return MutableText;
         }
      }
   }

   public static MutableText EventBus(Text Text, String s, String s1) {
      return StringHolder_8(Text, s, (Function<List<StringHolder$Helper_8>, Text>)(list -> {
         Style Style = list.get(0).l1l11l111IIl11lI1I1111lII1() != null ? list.get(0).l1l11l111IIl11lI1I1111lII1() : Style.EMPTY;
         return Text.literal(s1).setStyle(Style);
      }));
   }

   public static MutableText EventBus(Text Text, String s, Text Text) {
      return StringHolder_8(Text, s, (Function<List<StringHolder$Helper_8>, Text>)(list -> Textx.copy()));
   }

   private static MutableText StringHolder_8(Text Text, String s, Function<List<StringHolder$Helper_8>, Text> function) {
      OrderedText OrderedText = Text.asOrderedText();
      MutableText MutableText = Text.empty();
      ArrayList arraylist = new ArrayList();
      Runnable runnable = () -> {
         if (!arraylist.isEmpty()) {
            StringBuilder stringbuilder = new StringBuilder();

            for (StringHolder$Helper_8 l1l1i1ill1ll$ii1il11l111ii11iilx : arraylist) {
               stringbuilder.append(l1l1i1ill1ll$ii1il11l111ii11iilx.text());
            }

            String s2 = stringbuilder.toString();
            if (s2.equals(s)) {
               MutableText.append((Text)function.apply(arraylist));
            } else {
               for (StringHolder$Helper_8 l1l1i1ill1ll$ii1il11l111ii11iil : arraylist) {
                  MutableText.append(
                     Text.literal(l1l1i1ill1ll$ii1il11l111ii11iil.text()).setStyle(l1l1i1ill1ll$ii1il11l111ii11iil.l1l11l111IIl11lI1I1111lII1())
                  );
               }
            }

            arraylist.clear();
         }
      };
      OrderedText.accept((j, Style, i) -> {
         String s1 = new String(Character.toChars(i));
         boolean flag = Character.isLetterOrDigit(i) || i == 95;
         if (flag) {
            arraylist.add(new StringHolder$Helper_8(s1, Style));
         } else {
            runnable.run();
            MutableText.append(Text.literal(s1).setStyle(Style));
         }

         return true;
      });
      runnable.run();
      return MutableText;
   }

   public static MutableText EventBus(Text Text, String s) {
      if (s != null && !s.isEmpty()) {
         OrderedText OrderedText = Text.asOrderedText();
         ArrayList arraylist = new ArrayList();
         StringBuilder stringbuilder = new StringBuilder();
         OrderedText.accept((l, Style, k) -> {
            String s2 = new String(Character.toChars(k));
            arraylist.add(new StringHolder$Helper_8(s2, Style));
            stringbuilder.append(s2);
            return true;
         });
         String s1 = stringbuilder.toString();
         int i = s1.indexOf(s);
         if (i == -1) {
            return Text.empty();
         } else {
            MutableText MutableText = Text.empty();

            for (int j = 0; j < i; j++) {
               StringHolder$Helper_8 l1l1i1ill1ll$ii1il11l111ii11iil = (StringHolder$Helper_8)arraylist.get(j);
               MutableText.append(
                  Text.literal(l1l1i1ill1ll$ii1il11l111ii11iil.text()).setStyle(l1l1i1ill1ll$ii1il11l111ii11iil.l1l11l111IIl11lI1I1111lII1())
               );
            }

            return MutableText;
         }
      } else {
         return Text.empty();
      }
   }

   public static MutableText EventTarget(Text Text, String s, Text Text) {
      String s1 = Text.getString();
      int i = s1.indexOf(s);
      if (i == -1) {
         return Text.copy();
      } else {
         OrderedText OrderedText = Text.asOrderedText();
         ArrayList arraylist = new ArrayList();
         StringBuilder stringbuilder = new StringBuilder();
         OrderedText.accept((k2, Style, j2) -> {
            String s2 = new String(Character.toChars(j2));
            arraylist.add(new StringHolder$Helper_8(s2, Style));
            stringbuilder.append(s2);
            return true;
         });
         s1 = stringbuilder.toString();
         int j = i + s.length();

         while (j < s1.length()) {
            int k = s1.codePointAt(j);
            if (!Character.isWhitespace(k)) {
               break;
            }

            j += Character.charCount(k);
         }

         if (j >= s1.length()) {
            return Text.copy();
         } else {
            int l1 = j;

            while (l1 < s1.length()) {
               int l = s1.codePointAt(l1);
               if (Character.isWhitespace(l)) {
                  break;
               }

               l1 += Character.charCount(l);
            }

            MutableText MutableText = StringHolder_8(Textx, 1);
            if (MutableText.getString().isEmpty()) {
               MutableText = StringHolder_8(Textx, 0);
            }

            int i1 = s1.codePointCount(0, j);
            int j1 = s1.codePointCount(0, l1);
            MutableText MutableTextx = Text.empty();

            for (int k1 = 0; k1 < i1; k1++) {
               StringHolder$Helper_8 l1l1i1ill1ll$ii1il11l111ii11iilx = (StringHolder$Helper_8)arraylist.get(k1);
               MutableTextx.append(
                  Text.literal(l1l1i1ill1ll$ii1il11l111ii11iilx.text()).setStyle(l1l1i1ill1ll$ii1il11l111ii11iilx.l1l11l111IIl11lI1I1111lII1())
               );
            }

            MutableTextx.append(MutableText.copy());

            for (int i2 = j1; i2 < arraylist.size(); i2++) {
               StringHolder$Helper_8 l1l1i1ill1ll$ii1il11l111ii11iil = (StringHolder$Helper_8)arraylist.get(i2);
               MutableTextx.append(
                  Text.literal(l1l1i1ill1ll$ii1il11l111ii11iil.text()).setStyle(l1l1i1ill1ll$ii1il11l111ii11iil.l1l11l111IIl11lI1I1111lII1())
               );
            }

            return MutableTextx;
         }
      }
   }

   private static MutableText StringHolder_8(Text Text, int i) {
      OrderedText OrderedText = Text.asOrderedText();
      ArrayList arraylist = new ArrayList();
      StringBuilder stringbuilder = new StringBuilder();
      OrderedText.accept((k2, Style, j2) -> {
         String s1 = new String(Character.toChars(j2));
         arraylist.add(new StringHolder$Helper_8(s1, Style));
         stringbuilder.append(s1);
         return true;
      });
      String s = stringbuilder.toString();
      int j = 0;

      for (int k = 0; k < s.length(); j++) {
         while (k < s.length()) {
            int l = s.codePointAt(k);
            if (!Character.isWhitespace(l)) {
               break;
            }

            k += Character.charCount(l);
         }

         if (k >= s.length()) {
            break;
         }

         int i2 = k;

         while (true) {
            if (k < s.length()) {
               int i1 = s.codePointAt(k);
               if (!Character.isWhitespace(i1)) {
                  k += Character.charCount(i1);
                  continue;
               }
            }

            if (j == i) {
               int j1 = s.codePointCount(0, i2);
               int k1 = s.codePointCount(0, k);
               MutableText MutableText = Text.empty();

               for (int l1 = j1; l1 < k1; l1++) {
                  StringHolder$Helper_8 l1l1i1ill1ll$ii1il11l111ii11iil = (StringHolder$Helper_8)arraylist.get(l1);
                  MutableText.append(
                     Text.literal(l1l1i1ill1ll$ii1il11l111ii11iil.text()).setStyle(l1l1i1ill1ll$ii1il11l111ii11iil.l1l11l111IIl11lI1I1111lII1())
                  );
               }

               return MutableText;
            }
            break;
         }
      }

      return Text.empty();
   }

   public static MutableText EventTarget(Text Text, String s) {
      OrderedText OrderedText = Text.asOrderedText();
      int[] aint = new int[]{0};
      OrderedText.accept((j, Style, k) -> {
         aint[0]++;
         return true;
      });
      if (aint[0] == 0) {
         return Text.copy();
      } else {
         int i = aint[0] - 1;
         MutableText MutableText = Text.empty();
         StringBuilder stringbuilder = new StringBuilder();
         Style[] aStyle = new Style[]{null};
         int[] aint1 = new int[]{0};
         OrderedText.accept((l, Style, k) -> {
            boolean flag = aint1[0] == i;
            if (aStyle[0] == null || !aStyle[0].equals(Style)) {
               StringHolder_8(MutableText, stringbuilder, aStyle[0]);
               aStyle[0] = Style;
            }

            if (flag) {
            }

            stringbuilder.appendCodePoint(k);
            aint1[0]++;
            return true;
         });
         StringHolder_8(MutableText, stringbuilder, aStyle[0]);
         return MutableText;
      }
   }

   private static void StringHolder_8(MutableText MutableText, StringBuilder stringbuilder, Style Style) {
      if (stringbuilder.length() != 0) {
         MutableText MutableTextx = Text.literal(stringbuilder.toString());
         if (Style != null) {
            MutableTextx.setStyle(Style);
         }

         MutableText.append(MutableTextx);
         stringbuilder.setLength(0);
      }
   }

   public static Text StringHolder_8(Text Text, String s, boolean flag) {
      if (s != null && !s.isEmpty()) {
         OrderedText OrderedText = Text.asOrderedText();
         MutableText MutableText = Text.empty();
         StringBuilder stringbuilder = new StringBuilder();
         Style[] aStyle = new Style[]{Style.EMPTY};
         StringBuilder stringbuilder1 = new StringBuilder();
         boolean[] aboolean = new boolean[]{false};
         OrderedText.accept((j, Style, i) -> {
            String s2 = new String(Character.toChars(i));
            if (stringbuilder1.toString().contains(s)) {
               aboolean[0] = true;
               return false;
            } else {
               stringbuilder1.append(s2);
               if (!Stylex.equals(aStyle[0])) {
                  if (stringbuilder.length() > 0) {
                     MutableText.append(Text.literal(stringbuilder.toString()).setStyle(aStyle[0]));
                     stringbuilder.setLength(0);
                  }

                  aStyle[0] = Stylex;
               }

               stringbuilder.append(s2);
               return true;
            }
         });
         if (stringbuilder.length() > 0) {
            MutableText.append(Text.literal(stringbuilder.toString()).setStyle(aStyle[0]));
         }

         if (flag && aboolean[0]) {
            Style Style = aStyle[0] != null ? aStyle[0] : Text.getStyle();
            MutableText.append(Text.literal("…").setStyle(Style));
         }

         return MutableText;
      } else {
         return Text;
      }
   }

   public static String ZenithInternal059(String s) {
      if (s.isEmpty()) {
         return s;
      } else {
         char[] achar = new char[s.length()];

         for (int i = 0; i < s.length(); i++) {
            char c0 = s.charAt(i);
            boolean flag = c0 >= 1040 && c0 <= 1071 || c0 == 1025;
            char c1 = Character.toLowerCase(c0);
            int j = "ёйцукенгшщзхъфывапролджэячсмитьбю".indexOf(c1);
            if (j != -1) {
               char c2 = "`qwertyuiop[]asdfghjkl;'zxcvbnm,.".charAt(j);
               achar[i] = flag ? Character.toUpperCase(c2) : c2;
            } else {
               achar[i] = c0;
            }
         }

         return new String(achar);
      }
   }

   private StringHolder_21() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
