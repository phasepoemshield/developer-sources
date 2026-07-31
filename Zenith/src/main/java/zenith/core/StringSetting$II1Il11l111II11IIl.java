package zenith;

import java.util.function.Predicate;

public abstract class StringSetting$II1Il11l111II11IIl {
   private final int l1llI11ll11IlIlI1l1l1llI;

   public StringSetting$II1Il11l111II11IIl() {
      this.l1llI11ll11IlIlI1l1l1llI = Integer.MAX_VALUE;
   }

   public abstract boolean ZenithInternal025(String s);

   public static StringSetting$II1Il11l111II11IIl lI11I111IlIIIlII11l11I1II1() {
      return new StringSetting$II1Il11l111II11IIl$1(Integer.MAX_VALUE);
   }

   public static StringSetting$II1Il11l111II11IIl SocketFactoryHolder_2(int i) {
      return new StringSetting$II1Il11l111II11IIl$2(i, i);
   }

   public static StringSetting$II1Il11l111II11IIl StringHolder_8(int i, Predicate<String> predicate) {
      return new StringSetting$II1Il11l111II11IIl$3(i, predicate);
   }

   public StringSetting$II1Il11l111II11IIl(int i) {
      this.l1llI11ll11IlIlI1l1l1llI = i;
   }

   public int l1l1IIl11IIl1lIlI1Il1lIIl1I1l1() {
      return this.l1llI11ll11IlIlI1l1l1llI;
   }
}
