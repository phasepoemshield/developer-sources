package zenith;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;

public class TypeHolder extends CreateGsonHandler<String> {
   private static final Type llIllIlIIIlIl1I1l1l = new TypeTokenImpl$2().getType();
   private final List<GetSettingsHandler> l1111IIIII1l = new CopyOnWriteArrayList<>();
   private final Map<String, String> II1IIIII11lIIlIl1l11l = new ConcurrentHashMap<>();
   private Map<String, JsonObject> lIl1lllI1IlIl11lI1llllIll = new HashMap<>();

   public TypeHolder() {
      super("friends.json", "", new TypeTokenImpl$2().getType(), ConcurrentHashMap::newKeySet);
      KeySetView keysetview = ConcurrentHashMap.newKeySet();
      keysetview.addAll(this.items);
      this.items = keysetview;
      this.SecureRandomHolder();
   }

   public boolean EventBus(Entity Entity) {
      if (!(Entity instanceof PlayerEntity PlayerEntity)) {
         return false;
      } else {
         String s = PlayerEntity.getGameProfile().getName();
         return this.getItems().contains(s) || this.StringHolder_22(s);
      }
   }

   public boolean StringHolder_15(String s) {
      return this.getItems().contains(s) || this.StringHolder_22(s);
   }

   public boolean StringHolder_22(String s) {
      return s != null && !s.isEmpty() ? this.II1IIIII11lIIlIl1l11l.containsValue(s) : false;
   }

   public void StringHolder_8(GetSettingsHandler i11ll1111lil11i, StringHolder_22 l1liil1ili1iiii1lliii1l1li) {
      if (i11ll1111lil11i != null && i11ll1111lil11i.Autoexplosion() != null && !i11ll1111lil11i.Autoexplosion().isEmpty()) {
         if (l1liil1ili1iiii1lliii1l1li != null) {
            String s = l1liil1ili1iiii1lliii1l1li.Containerhelper();
            if (s != null && !s.isEmpty()) {
               this.II1IIIII11lIIlIl1l11l.put(i11ll1111lil11i.Autoexplosion(), s);
            } else {
               this.II1IIIII11lIIlIl1l11l.remove(i11ll1111lil11i.Autoexplosion());
            }
         }
      }
   }

   public void ZenithInternal033(String s) {
      this.getItems().remove(s);
   }

   public void StringHolder_4(List<GetSettingsHandler> list) {
      if (list == null) {
         list = List.of();
      }

      HashSet hashset = new HashSet();

      for (GetSettingsHandler i11ll1111lil11i : list) {
         if (i11ll1111lil11i != null && i11ll1111lil11i.Autoexplosion() != null && !i11ll1111lil11i.Autoexplosion().isEmpty()) {
            hashset.add(i11ll1111lil11i.Autoexplosion());
         }
      }

      this.l1111IIIII1l.removeIf(i11ll1111lil11i4 -> !hashset.contains(i11ll1111lil11i4.Autoexplosion()));
      this.II1IIIII11lIIlIl1l11l.keySet().removeIf(s -> !hashset.contains(s));

      for (GetSettingsHandler i11ll1111lil11i3 : list) {
         if (i11ll1111lil11i3 != null && i11ll1111lil11i3.Autoexplosion() != null && !i11ll1111lil11i3.Autoexplosion().isEmpty()) {
            GetSettingsHandler i11ll1111lil11i1 = this.ZenithInternal100(i11ll1111lil11i3.Autoexplosion());
            if (i11ll1111lil11i1 != null) {
               i11ll1111lil11i1.ZenithInternal016(i11ll1111lil11i3.Autoswap());
               i11ll1111lil11i1.setRole(i11ll1111lil11i3.Autototem());
               this.StringHolder_8(i11ll1111lil11i1);
            } else {
               GetSettingsHandler i11ll1111lil11i2 = new GetSettingsHandler(
                  i11ll1111lil11i3.Autoexplosion(), i11ll1111lil11i3.Autoswap(), i11ll1111lil11i3.Autototem()
               );
               this.StringHolder_8(i11ll1111lil11i2);
               this.l1111IIIII1l.add(i11ll1111lil11i2);
            }
         }
      }
   }

   public void EventBus(String s, String s1, String s2) {
      if (s != null && !s.isEmpty()) {
         if (this.ZenithInternal100(s) == null) {
            GetSettingsHandler i11ll1111lil11i = new GetSettingsHandler(s, s1 != null && !s1.isEmpty() ? s1 : "UID " + s, s2 == null ? "" : s2);
            this.StringHolder_8(i11ll1111lil11i);
            this.l1111IIIII1l.add(i11ll1111lil11i);
         }
      }
   }

   public boolean ZenithInternal087(String s) {
      if (s != null) {
         this.II1IIIII11lIIlIl1l11l.remove(s);
      }

      return this.l1111IIIII1l.removeIf(i11ll1111lil11i -> s != null && s.equalsIgnoreCase(i11ll1111lil11i.Autoexplosion()));
   }

   public GetSettingsHandler ZenithInternal100(String s) {
      if (s != null && !s.isEmpty()) {
         for (GetSettingsHandler i11ll1111lil11i : this.l1111IIIII1l) {
            if (s.equalsIgnoreCase(i11ll1111lil11i.Autoexplosion())) {
               return i11ll1111lil11i;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @Override
   public void save() {
      super.save();
      this.ZenithInternal032();
   }

   private void SecureRandomHolder() {
      File file1 = new File(ZenithClient.AhHelper, "cloud_friend_settings.json");
      if (!file1.exists()) {
         this.lIl1lllI1IlIl11lI1llllIll = new HashMap<>();
      } else {
         try (BufferedReader bufferedreader = new BufferedReader(new FileReader(file1))) {
            Gson gson = new Gson();
            Map map = (Map)gson.fromJson(bufferedreader, llIllIlIIIlIl1I1l1l);
            this.lIl1lllI1IlIl11lI1llllIll = (Map<String, JsonObject>)(map != null ? map : new HashMap<>());
         } catch (Exception exception) {
            this.lIl1lllI1IlIl11lI1llllIll = new HashMap<>();
         }
      }
   }

   private void ZenithInternal032() {
      HashMap hashmap = new HashMap();

      for (GetSettingsHandler i11ll1111lil11i : this.l1111IIIII1l) {
         if (i11ll1111lil11i.Autoexplosion() != null && !i11ll1111lil11i.Autoexplosion().isEmpty()) {
            JsonObject jsonobject = new JsonObject();

            for (Setting l1i111illi1i1 : i11ll1111lil11i.getSettings()) {
               try {
                  l1i111illi1i1.safe(jsonobject);
               } catch (Exception exception1) {
               }
            }

            hashmap.put(i11ll1111lil11i.Autoexplosion(), jsonobject);
         }
      }

      try (FileWriter filewriter = new FileWriter(new File(ZenithClient.AhHelper, "cloud_friend_settings.json"))) {
         new Gson().toJson(hashmap, filewriter);
      } catch (Exception exception) {
      }
   }

   private void StringHolder_8(GetSettingsHandler i11ll1111lil11i) {
      if (i11ll1111lil11i.Autoexplosion() != null && !i11ll1111lil11i.Autoexplosion().isEmpty()) {
         JsonObject jsonobject = this.lIl1lllI1IlIl11lI1llllIll.get(i11ll1111lil11i.Autoexplosion());
         if (jsonobject != null) {
            for (Setting l1i111illi1i1 : i11ll1111lil11i.getSettings()) {
               try {
                  if (jsonobject.has(l1i111illi1i1.getName())) {
                     l1i111illi1i1.load(jsonobject);
                  }
               } catch (Exception exception) {
               }
            }
         }
      }
   }

   public List<GetSettingsHandler> ZenithInternal001() {
      return this.l1111IIIII1l;
   }

   public Map<String, String> StringHolder_9() {
      return this.II1IIIII11lIIlIl1l11l;
   }
}
