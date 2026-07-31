package zenith;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetDisplayNameHandler {
   private final GetDisplayNameHandler$Helper lll1lll1l1I1llII11lll;
   private final String IlI1lIl1lIlII1lIlI1I1l1Ill;
   private final long IlIIlI11IllI11;
   private final String Il1l1I11l111Ill1lI11ll1;

   public GetDisplayNameHandler(String s, String s1, long i) {
      this.lll1lll1l1I1llII11lll = GetDisplayNameHandler$Helper.EventImpl_2(s);
      this.IlI1lIl1lIlII1lIlI1I1l1Ill = s1;
      this.IlIIlI11IllI11 = i;
      this.Il1l1I11l111Ill1lI11ll1 = this.I1ll1l11ll1IIlllII();
   }

   public String getDisplayName() {
      return this.Illl1llIIIl1lI11Ill().getDisplayName();
   }

   public String getIcon() {
      return this.Illl1llIIIl1lI11Ill().getIcon();
   }

   public boolean l1lIlI11ll11l111() {
      Pattern pattern = Pattern.compile("(\\([^)]+\\))?\\s*#(\\d+)");
      Matcher matcher = pattern.matcher(this.IlI1lIl1lIlII1lIlI1I1l1Ill);

      while (matcher.find()) {
         String s = matcher.group(2);
         if (s != null && s.length() > 0) {
            try {
               int i = Integer.parseInt(s);
               if (i <= 63) {
                  return true;
               }
            } catch (NumberFormatException numberformatexception) {
               return true;
            }
         }
      }

      return false;
   }

   private String I1ll1l11ll1IIlllII() {
      ArrayList arraylist = new ArrayList();
      Pattern pattern = Pattern.compile("(\\([^)]+\\))?\\s*#(\\d+)");
      Matcher matcher = pattern.matcher(this.IlI1lIl1lIlII1lIlI1I1l1Ill);

      while (matcher.find()) {
         String s = matcher.group(1);
         String s1 = matcher.group(2);
         if (s1 != null && s1.length() > 0) {
            try {
               int i = Integer.parseInt(s1);
               if (i <= 63) {
                  arraylist.add(new IIlI1IIllllIIIl$EventBus(i, s));
               }
            } catch (NumberFormatException numberformatexception) {
            }
         }
      }

      if (arraylist.isEmpty()) {
         return "";
      } else {
         arraylist.sort(Comparator.comparingInt(iili1iilllliiil$l1i1illlili2 -> iili1iilllliiil$l1i1illlili2.lI1lIl1l11ll111Il11Il));
         int k = arraylist.size();
         ArrayList arraylist3 = new ArrayList();
         ArrayList arraylist4 = new ArrayList();
         ArrayList arraylist1 = new ArrayList();
         ArrayList arraylist2 = new ArrayList();

         for (IIlI1IIllllIIIl$EventBus iili1iilllliiil$l1i1illlili : arraylist) {
            if (iili1iilllliiil$l1i1illlili.lI1lIl1l11ll111Il11Il >= 1 && iili1iilllliiil$l1i1illlili.lI1lIl1l11ll111Il11Il <= 14) {
               arraylist3.add(iili1iilllliiil$l1i1illlili);
            } else if (iili1iilllliiil$l1i1illlili.lI1lIl1l11ll111Il11Il >= 15 && iili1iilllliiil$l1i1illlili.lI1lIl1l11ll111Il11Il <= 32) {
               arraylist4.add(iili1iilllliiil$l1i1illlili);
            } else if (iili1iilllliiil$l1i1illlili.lI1lIl1l11ll111Il11Il >= 33 && iili1iilllliiil$l1i1illlili.lI1lIl1l11ll111Il11Il <= 47) {
               arraylist1.add(iili1iilllliiil$l1i1illlili);
            } else if (iili1iilllliiil$l1i1illlili.lI1lIl1l11ll111Il11Il >= 48 && iili1iilllliiil$l1i1illlili.lI1lIl1l11ll111Il11Il <= 63) {
               arraylist2.add(iili1iilllliiil$l1i1illlili);
            }
         }

         ArrayList arraylist5 = new ArrayList();
         byte b0 = 4;
         if (k <= 4) {
            for (IIlI1IIllllIIIl$EventBus iili1iilllliiil$l1i1illlili1 : arraylist) {
               arraylist5.add(this.StringHolder_8(iili1iilllliiil$l1i1illlili1));
            }
         } else {
            ArrayList arraylist6 = new ArrayList();
            arraylist6.add(arraylist3);
            arraylist6.add(arraylist4);
            arraylist6.add(arraylist1);
            arraylist6.add(arraylist2);
            int[] aint = new int[4];

            for (int j = 0; j < 4 && arraylist5.size() < b0; j++) {
               if (!((List)arraylist6.get(j)).isEmpty()) {
                  arraylist5.add(this.StringHolder_8((IIlI1IIllllIIIl$EventBus)((List)arraylist6.get(j)).get(0)));
                  aint[j] = 1;
               }
            }

            for (int l = 0; l < 4 && arraylist5.size() < b0; l++) {
               while (aint[l] < ((List)arraylist6.get(l)).size() && arraylist5.size() < b0) {
                  arraylist5.add(this.StringHolder_8((IIlI1IIllllIIIl$EventBus)((List)arraylist6.get(l)).get(aint[l])));
                  aint[l]++;
               }
            }
         }

         String s2 = String.join(", ", arraylist5);
         if (k > 4) {
            s2 = s2 + "...";
         }

         return s2;
      }
   }

   private String StringHolder_8(IIlI1IIllllIIIl$EventBus iili1iilllliiil$l1i1illlili) {
      return iili1iilllliiil$l1i1illlili.ll11llll111Il1IIII != null && !iili1iilllliiil$l1i1illlili.ll11llll111Il1IIII.isEmpty()
         ? iili1iilllliiil$l1i1illlili.lI1lIl1l11ll111Il11Il + " " + iili1iilllliiil$l1i1illlili.ll11llll111Il1IIII
         : String.valueOf(iili1iilllliiil$l1i1illlili.lI1lIl1l11ll111Il11Il);
   }

   public GetDisplayNameHandler$Helper Illl1llIIIl1lI11Ill() {
      return this.lll1lll1l1I1llII11lll;
   }

   public String getMessage() {
      return this.IlI1lIl1lIlII1lIlI1I1l1Ill;
   }

   public long getTimestamp() {
      return this.IlIIlI11IllI11;
   }

   public String Il11I1IIII1l1lIlI1() {
      return this.Il1l1I11l111Ill1lI11ll1;
   }
}
