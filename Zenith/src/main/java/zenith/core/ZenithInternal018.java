package zenith;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface ZenithInternal018 {
   Map<Integer, ListHolder_9> l1llI1I111IIIIlIIllllllI1I = new ConcurrentHashMap<>();

   void zenith$simulate();

   static ListHolder_9 StringHolder_6(int i) {
      return l1llI1I111IIIIlIIllllllI1I.get(i);
   }

   static void StringHolder_8(int i, ListHolder_9 lii1ii1lll1i1lll1llill11i11l) {
      if (lii1ii1lll1i1lll1llill11i11l == null) {
         l1llI1I111IIIIlIIllllllI1I.remove(i);
      } else {
         l1llI1I111IIIIlIIllllllI1I.put(i, lii1ii1lll1i1lll1llill11i11l);
      }
   }

   static void StringHolder_27(int i) {
      l1llI1I111IIIIlIIllllllI1I.remove(i);
   }
}
