package zenith;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListHolder_10 {
   private final Map<String, StringHolder_31> llI1llI1lI1l1 = new HashMap<>();
   private final List<String> Il1I11IIlllIl111l11I1I11 = new ArrayList<>();
   private StringHolder_31 lIll1llIl11;
   private String ll1lIIIIlII;

   public ListHolder_10() {
      this.ZenithInternal090("ru");
      this.ZenithInternal090("en");
      this.ZenithInternal090("pl");
      this.ZenithInternal090("tr");
   }

   public void ZenithInternal090(String s) {
      if (!this.Il1I11IIlllIl111l11I1I11.contains(s)) {
         this.Il1I11IIlllIl111l11I1I11.add(s);
      }

      if (this.ll1lIIIIlII == null) {
         this.EventImpl_36(s);
      }
   }

   public void EventImpl_36(String s) {
      if (this.Il1I11IIlllIl111l11I1I11.contains(s)) {
         StringHolder_31 llill1liliililii = this.BlockPosHolder_2(s);
         if (llill1liliililii != null) {
            this.llI1llI1lI1l1.clear();
            this.llI1llI1lI1l1.put(s, llill1liliililii);
            this.lIll1llIl11 = llill1liliililii;
            this.ll1lIIIIlII = s;
         } else if (this.ll1lIIIIlII == null) {
            this.ll1lIIIIlII = s;
         }
      }
   }

   public void PlayerEntityHolder() {
      this.longHolder_6(true);
   }

   public void longHolder_6(boolean flag) {
      if (!this.Il1I11IIlllIl111l11I1I11.isEmpty()) {
         int i = this.Il1I11IIlllIl111l11I1I11.indexOf(this.ll1lIIIIlII);
         if (i < 0) {
            i = 0;
         }

         int j;
         if (flag) {
            j = (i + 1) % this.Il1I11IIlllIl111l11I1I11.size();
         } else {
            j = (i - 1 + this.Il1I11IIlllIl111l11I1I11.size()) % this.Il1I11IIlllIl111l11I1I11.size();
         }

         this.EventImpl_36(this.Il1I11IIlllIl111l11I1I11.get(j));
      }
   }

   public void LivingEntityHolder() {
      this.longHolder_6(false);
   }

   public String floatHolder() {
      return this.ll1lIIIIlII == null ? "ru" : this.ll1lIIIIlII;
   }

   public String translate(String s) {
      if (this.lIll1llIl11 == null && this.ll1lIIIIlII != null) {
         this.lIll1llIl11 = this.BlockPosHolder_2(this.ll1lIIIIlII);
      }

      return this.lIll1llIl11 == null ? s : this.lIll1llIl11.method_97(s);
   }

   private StringHolder_31 BlockPosHolder_2(String s) {
      StringHolder_31 llill1liliililiixx = this.llI1llI1lI1l1.get(s);
      if (llill1liliililiixx != null) {
         return llill1liliililiixx;
      } else {
         try {
            StringHolder_31 llill1liliililiix;
            try (InputStream inputstream = ListHolder_10.class.getResourceAsStream("/assets/zenith/languages/" + s + ".language")) {
               if (inputstream == null) {
                  return null;
               }

               StringHolder_31 llill1liliililiixx = new StringHolder_31(s, inputstream);
               this.llI1llI1lI1l1.put(s, llill1liliililiixx);
               llill1liliililiix = llill1liliililiixx;
            }

            return llill1liliililiix;
         } catch (IOException ioexception) {
            ioexception.printStackTrace();
            return null;
         }
      }
   }

   public String floatHolder_6() {
      return this.ll1lIIIIlII;
   }
}
