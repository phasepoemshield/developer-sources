package zenith;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class AutocraftHolder {
   private static final int lIlI11I11l1 = 2;
   private static final int l1l1IlI1ll1I1Il = 2;
   private final Autocraft IlII1I1I1llllI11;
   private String l1lII1I1111 = "";
   private int IllIIlllll1 = 0;
   private final Set<String> llll1Il11Il1II11Ill1I1l1II = new HashSet<>();
   private final Map<String, Integer> lIl11lIIIlI1lI1llll = new HashMap<>();

   public AutocraftHolder(Autocraft Autocraft) {
      this.IlII1I1I1llllI11 = Autocraft;
   }

   public void reset() {
      this.llll1Il11Il1II11Ill1I1l1II.clear();
      this.lIl11lIIIlI1lI1llll.clear();
      this.l1lIlI1I1IIIIIlIIIlII11II();
   }

   public void l1lIlI1I1IIIIIlIIIlII11II() {
      this.l1lII1I1111 = "";
      this.IllIIlllll1 = 0;
   }

   public int l11I111Il11I() {
      return 2;
   }

   public boolean EventBus(StringHolder_14 ill111l1iiill1ll1illi, String s) {
      String s1 = this.ZenithInternal028(ill111l1iiill1ll1illi, s);
      if (!s1.isBlank() && !s1.equals(this.l1lII1I1111)) {
         this.l1lII1I1111 = s1;
         this.IllIIlllll1 = 2;
      }

      if (this.IllIIlllll1 > 0) {
         this.IllIIlllll1--;
         return true;
      } else {
         return false;
      }
   }

   public boolean EventTarget(StringHolder_14 ill111l1iiill1ll1illi, String s) {
      String s1 = this.ZenithInternal028(ill111l1iiill1ll1illi, s);
      return !s1.isBlank() && this.llll1Il11Il1II11Ill1I1l1II.contains(s1);
   }

   public boolean ZenithInternal095(StringHolder_14 ill111l1iiill1ll1illi, String s) {
      String s1 = this.ZenithInternal028(ill111l1iiill1ll1illi, s);
      return !s1.isBlank() && this.lIl11lIIIlI1lI1llll.getOrDefault(s1, 0) >= 2;
   }

   public int Event(StringHolder_14 ill111l1iiill1ll1illi, String s) {
      String s1 = this.ZenithInternal028(ill111l1iiill1ll1illi, s);
      if (s1.isBlank()) {
         return 0;
      } else {
         int i = this.lIl11lIIIlI1lI1llll.getOrDefault(s1, 0) + 1;
         this.lIl11lIIIlI1lI1llll.put(s1, i);
         return i;
      }
   }

   public void EventImpl_24(StringHolder_14 ill111l1iiill1ll1illi, String s) {
      String s1 = this.ZenithInternal028(ill111l1iiill1ll1illi, s);
      if (!s1.isBlank()) {
         this.lIl11lIIIlI1lI1llll.remove(s1);
         this.llll1Il11Il1II11Ill1I1l1II.remove(s1);
      }
   }

   public void StringHolder_8(StringHolder_14 ill111l1iiill1ll1illi, String s, String s1, String s2, boolean flag) {
      String s3 = this.ZenithInternal028(ill111l1iiill1ll1illi, s);
      if (!s3.isBlank()) {
         boolean flag1 = this.llll1Il11Il1II11Ill1I1l1II.add(s3);
         this.lIl11lIIIlI1lI1llll.put(s3, 2);
         if (flag && flag1) {
            this.IlII1I1I1llllI11.PacketHolder("Source empty: " + this.IlII1I1I1llllI11.ZenithInternal021(s1, s2));
         }
      }
   }

   private String ZenithInternal028(StringHolder_14 ill111l1iiill1ll1illi, String s) {
      if (ill111l1iiill1ll1illi != null && s != null && !s.isBlank()) {
         longHolder_2 iii11l1l1il111lii1i1iil = ill111l1iiill1ll1illi.GetServerHandler(s);
         long i = iii11l1l1il111lii1i1iil != null && iii11l1l1il111lii1i1iil.Il11I1IIIlI1111IIIIl()
            ? iii11l1l1il111lii1i1iil.I11Il1I1IIl1IIll1l1I1().asLong()
            : Long.MIN_VALUE;
         return ill111l1iiill1ll1illi.I1llI111I1IlIIlIlIII1lI1().toLowerCase(Locale.ROOT)
            + ":"
            + ill111l1iiill1ll1illi.GetSocketHandler().toLowerCase(Locale.ROOT)
            + ":"
            + s
            + ":"
            + i;
      } else {
         return "";
      }
   }
}
