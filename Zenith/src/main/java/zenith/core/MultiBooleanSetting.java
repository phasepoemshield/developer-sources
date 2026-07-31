package zenith;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiBooleanSetting extends Setting {
   private final List<MultiBooleanSetting$II1Il11l111II11IIl> III1Il1llIlIl11l1IlllI1Il;

   public MultiBooleanSetting(String s) {
      this(s, "");
   }

   public MultiBooleanSetting(String s, String s1) {
      super(s, s1);
      this.III1Il1llIlIl11l1IlllI1Il = new ArrayList<>();
   }

   public MultiBooleanSetting(String s, MultiBooleanSetting$II1Il11l111II11IIl... al11i1111l1i$ii1il11l111ii11iil) {
      this(s, "", al11i1111l1i$ii1il11l111ii11iil);
   }

   public MultiBooleanSetting(String s, String s1, MultiBooleanSetting$II1Il11l111II11IIl... al11i1111l1i$ii1il11l111ii11iil) {
      super(s, s1);
      this.III1Il1llIlIl11l1IlllI1Il = new ArrayList<>(Arrays.asList(al11i1111l1i$ii1il11l111ii11iil));
   }

   public static MultiBooleanSetting ZenithInternal095(String s, List<String> list) {
      return StringHolder_8(s, "", list);
   }

   public MultiBooleanSetting$II1Il11l111II11IIl EventImpl_3(String s) {
      return this.III1Il1llIlIl11l1IlllI1Il
         .stream()
         .filter(
            l11i1111l1i$ii1il11l111ii11iil -> l11i1111l1i$ii1il11l111ii11iil.ll1I1IlIIIIII().equalsIgnoreCase(s)
               || l11i1111l1i$ii1il11l111ii11iil.getName().equalsIgnoreCase(s)
         )
         .findFirst()
         .orElse(null);
   }

   public static MultiBooleanSetting StringHolder_8(String s, String s1, List<String> list) {
      MultiBooleanSetting$II1Il11l111II11IIl[] al11i1111l1i$ii1il11l111ii11iil = list.stream()
         .map(s2 -> new MultiBooleanSetting$II1Il11l111II11IIl(s2, true))
         .toArray(MultiBooleanSetting$II1Il11l111II11IIl[]::new);
      return new MultiBooleanSetting(s, s1, al11i1111l1i$ii1il11l111ii11iil);
   }

   public MultiBooleanSetting$II1Il11l111II11IIl ReadingThread(int i) {
      return this.III1Il1llIlIl11l1IlllI1Il.get(i);
   }

   public boolean EventImpl_30(String s) {
      MultiBooleanSetting$II1Il11l111II11IIl l11i1111l1i$ii1il11l111ii11iil = this.EventImpl_3(s);
      return l11i1111l1i$ii1il11l111ii11iil != null && l11i1111l1i$ii1il11l111ii11iil.Spider();
   }

   public boolean ConstructorHolder(int i) {
      if (i >= this.Ill1l1IlIll().size()) {
         return false;
      } else {
         MultiBooleanSetting$II1Il11l111II11IIl l11i1111l1i$ii1il11l111ii11iil = this.ReadingThread(i);
         return l11i1111l1i$ii1il11l111ii11iil != null && l11i1111l1i$ii1il11l111ii11iil.Spider();
      }
   }

   public List<MultiBooleanSetting$II1Il11l111II11IIl> llI11IllI1111Il() {
      return this.III1Il1llIlIl11l1IlllI1Il.stream().filter(MultiBooleanSetting$II1Il11l111II11IIl::Spider).collect(Collectors.toList());
   }

   @Override
   public void safe(JsonObject jsonobject) {
      StringBuilder stringbuilder = new StringBuilder();
      int i = 0;

      for (MultiBooleanSetting$II1Il11l111II11IIl l11i1111l1i$ii1il11l111ii11iil : this.Ill1l1IlIll()) {
         if (this.EventImpl_3(l11i1111l1i$ii1il11l111ii11iil.getName()).Spider()) {
            stringbuilder.append(l11i1111l1i$ii1il11l111ii11iil.getName()).append("\n");
         }

         i++;
      }

      jsonobject.addProperty(this.I1llIl1Il1lIII, stringbuilder.toString());
   }

   @Override
   public void load(JsonObject jsonobject) {
      this.Ill1l1IlIll().forEach(l11i1111l1i$ii1il11l111ii11iil -> l11i1111l1i$ii1il11l111ii11iilx.StringHolder_11(false));
      String[] astring = jsonobject.get(String.valueOf(this.I1llIl1Il1lIII)).getAsString().split("\n");

      for (String s : astring) {
         MultiBooleanSetting$II1Il11l111II11IIl l11i1111l1i$ii1il11l111ii11iil = this.EventImpl_3(s);
         if (l11i1111l1i$ii1il11l111ii11iil != null) {
            this.EventImpl_3(s).StringHolder_11(true);
         }
      }
   }

   public List<String> lIIll1ll11111I1llII111IllI1ll() {
      return this.III1Il1llIlIl11l1IlllI1Il
         .stream()
         .filter(MultiBooleanSetting$II1Il11l111II11IIl::Spider)
         .map(MultiBooleanSetting$II1Il11l111II11IIl::ll1I1IlIIIIII)
         .toList();
   }

   public List<MultiBooleanSetting$II1Il11l111II11IIl> Ill1l1IlIll() {
      return this.III1Il1llIlIl11l1IlllI1Il;
   }
}
