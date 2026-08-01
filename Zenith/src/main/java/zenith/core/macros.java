package zenith;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;

public class macros extends CreateGsonHandler<StringHolder$Helper_13> implements ZenithInternal076 {
   public macros() {
      super("macros", "", new TypeTokenImpl$1_4().getType(), ArrayList::new);
      EventBus.StringHolder_8(this);
   }

   @Override
   protected Gson createGson() {
      return new GsonBuilder().registerTypeAdapter(StringHolder$Helper_13.class, new JsonDeserializerImpl$EventBus()).setPrettyPrinting().create();
   }

   public boolean isEmpty() {
      return this.items.isEmpty();
   }

   public void StringHolder_8(StringHolder$Helper_13 lll111l1$ii1il11l111ii11iil) {
      this.items.add(lll111l1$ii1il11l111ii11iil);
   }

   public void StringHolder_8(String s, int i, String s1) {
      this.items.add(new StringHolder$Helper_13(s, i, s1));
   }

   public void ZenithInternal024(String s) {
      this.items.removeIf(lll111l1$ii1il11l111ii11iil -> lll111l1$ii1il11l111ii11iil.name().equalsIgnoreCase(s));
   }

   public StringHolder$Helper_13 IsPriorityHandler(String s) {
      return this.items.stream().filter(lll111l1$ii1il11l111ii11iil -> lll111l1$ii1il11l111ii11iil.name().equalsIgnoreCase(s)).findFirst().orElse(null);
   }

   public boolean FileHolder_2(String s) {
      return this.IsPriorityHandler(s) != null;
   }

   public void clear() {
      this.items.clear();
   }

   @EventTarget
   public void StringHolder_8(KeyEvent i111liliill1iii1iiii1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
         for (StringHolder$Helper_13 lll111l1$ii1il11l111ii11iil : this.items) {
            if (i111liliill1iii1iiii1.StringHolder_5(lll111l1$ii1il11l111ii11iil.ZenithInternal120())) {
               this.EventBus(lll111l1$ii1il11l111ii11iil);
            }
         }
      }
   }

   private void EventBus(StringHolder$Helper_13 lll111l1$ii1il11l111ii11iil) {
      if (lll111l1$ii1il11l111ii11iil.TextHolder().startsWith("/")) {
         l11I1I1ll1Illll1I1l1111l1II.player.networkHandler.sendChatCommand(lll111l1$ii1il11l111ii11iil.TextHolder().substring(1));
      } else {
         l11I1I1ll1Illll1I1l1111l1II.player.networkHandler.sendChatMessage(lll111l1$ii1il11l111ii11iil.TextHolder());
      }
   }
}
