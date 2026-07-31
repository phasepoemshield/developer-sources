package zenith;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class ModeSetting extends Setting {
   private final List<ModeOption> lllI11l11l11lIl111lII111 = new ArrayList<>();
   private ModeOption l1l1IIllI1IlIIlIII1l;

   public ModeSetting(String s, String s1) {
      super(s, s1);
   }

   public ModeSetting(String s, String s1, String... astring) {
      super(s, s1);

      for (String s2 : astring) {
         if (!s2.isEmpty()) {
            new ModeOption(this, s2);
         }
      }

      if (!this.lllI11l11l11lIl111lII111.isEmpty()) {
         this.l1l1IIllI1IlIIlIII1l = this.lllI11l11l11lIl111lII111.getFirst();
      }
   }

   public ModeSetting(String s, Supplier<Boolean> supplier, String... astring) {
      this(s, "", supplier, astring);
   }

   public ModeSetting(String s, String s1, Supplier<Boolean> supplier, String... astring) {
      super(s, s1);

      for (String s2 : astring) {
         if (!s2.isEmpty()) {
            new ModeOption(this, s2);
         }
      }

      if (!this.lllI11l11l11lIl111lII111.isEmpty()) {
         this.l1l1IIllI1IlIIlIII1l = this.lllI11l11l11lIl111lII111.getFirst();
      }

      this.StringHolder_8(supplier);
   }

   public void EventImpl_10(String s) {
      this.lllI11l11l11lIl111lII111
         .stream()
         .filter(liii11li1iliiiii1l1li$ii1il11l111ii11iil -> liii11li1iliiiii1l1li$ii1il11l111ii11iil.getName().equals(s))
         .findFirst()
         .ifPresent(liii11li1iliiiii1l1li$ii1il11l111ii11iil -> this.l1l1IIllI1IlIIlIII1l = liii11li1iliiiii1l1li$ii1il11l111ii11iil);
   }

   public String Il1I11IIlllIl111l11I1I11() {
      return this.l1l1IIllI1IlIIlIII1l != null ? this.l1l1IIllI1IlIIlIII1l.getName() : "";
   }

   public boolean ClearHeadersHandler(int i) {
      return this.lllI11l11l11lIl111lII111.get(i).isSelected();
   }

   public boolean EventImpl_15(String s) {
      return this.l1l1IIllI1IlIIlIII1l.getName().equals(s);
   }

   public ModeOption lIll1llIl11() {
      List list = this.lllI11l11l11lIl111lII111.stream().filter(ModeOption::isSelected).toList();
      return !list.isEmpty() ? (ModeOption)list.get(new Random().nextInt(list.size())) : null;
   }

   @Override
   public void safe(JsonObject jsonobject) {
      jsonobject.addProperty(String.valueOf(this.I1llIl1Il1lIII), this.Il1I11IIlllIl111l11I1I11());
   }

   @Override
   public void load(JsonObject jsonobject) {
      this.EventImpl_10(jsonobject.get(String.valueOf(this.I1llIl1Il1lIII)).getAsString());
   }

   public int getIndex() {
      return this.lllI11l11l11lIl111lII111.indexOf(this.l1l1IIllI1IlIIlIII1l);
   }

   public List<ModeOption> ll1lIIIIlII() {
      return this.lllI11l11l11lIl111lII111;
   }

   public ModeOption lII1I1l1IlIIl1I() {
      return this.l1l1IIllI1IlIIlIII1l;
   }

   public void StringHolder_8(ModeOption liii11li1iliiiii1l1li$ii1il11l111ii11iil) {
      this.l1l1IIllI1IlIIlIII1l = liii11li1iliiiii1l1li$ii1il11l111ii11iil;
   }
}
