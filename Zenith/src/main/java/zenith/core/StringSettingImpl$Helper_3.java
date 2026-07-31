package zenith;

import java.util.function.Predicate;

class StringSetting$II1Il11l111II11IIl$3 extends StringSetting$II1Il11l111II11IIl {
   StringSetting$II1Il11l111II11IIl$3(int i, Predicate predicate) {
      super(i);
      this.I1II1I1I1111l1lI11 = predicate;
   }

   @Override
   public boolean ZenithInternal025(String s) {
      return s != null && this.I1II1I1I1111l1lI11.test(s);
   }
}
