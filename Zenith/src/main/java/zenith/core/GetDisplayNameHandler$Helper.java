package zenith;

public enum GetDisplayNameHandler$Helper {
   I1II1I1llIl11("Груз", "C"),
   IIlII1llIllllI1lI("Босс", "B"),
   l111lIII11I11l1II("Контейнер", "D"),
   lIIIlIlll1l1l1IIll1IlI1("Золотая лихорадка", "E"),
   I1IIIIllll("Посылка", "F"),
   ll1lllllllII1Il1l1("Корабль", "G"),
   IIIlIIlII("Цветочная поляна", "H"),
   I11111lIIll11Il1("Цветочная поляна", "H"),
   Il11I1Il1lI11lllll1I1I1l("Смертельная шахта", "I"),
   IlII1IIll1("Смертельная шахта", "I"),
   II1lIIlll1llII1lI1II1Illl1l("Опытный Тыпо", "J"),
   l1I1IllIIIlI11("Голосование", "K"),
   l1ll1111lllI1l("Неизвестно", "A");

   private final String I1111lI1lIIIl111I1l11l;
   private final String I1IlllIl11I1l;

   private GetDisplayNameHandler$Helper(String s1, String s2) {
      this.I1111lI1lIIIl111I1l11l = s1;
      this.I1IlllIl11I1l = s2;
   }

   public static GetDisplayNameHandler$Helper EventImpl_2(String s) {
      if (s == null) {
         return l1ll1111lllI1l;
      } else {
         try {
            return valueOf(s.toUpperCase());
         } catch (IllegalArgumentException illegalargumentexception) {
            return l1ll1111lllI1l;
         }
      }
   }

   public String getDisplayName() {
      return this.I1111lI1lIIIl111I1l11l;
   }

   public String getIcon() {
      return this.I1IlllIl11I1l;
   }
}
