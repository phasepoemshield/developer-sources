package zenith;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FileHolder_2 implements ZenithInternal076 {
   public static final File l1I11IIIl11lIIllI1II1lI1I1 = new File(ZenithClient.AhHelper, "configs");
   private static final ScheduledExecutorService llIl11llIllllIl11ll11I1I1lI1 = Executors.newSingleThreadScheduledExecutor(runnable -> {
      Thread thread = new Thread(runnable, "Config-AutoSave");
      thread.setDaemon(true);
      thread.setPriority(1);
      return thread;
   });
   private final String I11Il1I1lllI1ll11III = "siMunids";

   public FileHolder_2() {
      l1I11IIIl11lIIllI1II1lI1I1.mkdirs();
      this.SecretKeySpecHolder("current_config");
      EventBus.StringHolder_8(this);
      llIl11llIllllIl11ll11I1I1lI1.scheduleAtFixedRate(() -> {
         try {
            this.save();
         } catch (Exception exception) {
         }
      }, 5L, 5L, TimeUnit.MINUTES);
   }

   public boolean SecretKeySpecHolder(String s) {
      return this.StringHolder_8(s, ZenithInternal134$Helper.lIII1Il1l1I1l1111l1IllIl);
   }

   public boolean StringHolder_8(String s, ZenithInternal134$Helper lillll1l1ii1il1il$ii1il11l111ii11iil) {
      try {
         if (s == null) {
            return false;
         } else {
            IsPriorityHandler lillllii11iiill11i = this.GetSettingsHandler(s);
            if (lillllii11iiill11i == null) {
               return false;
            } else {
               try {
                  boolean flag;
                  try (BufferedReader bufferedreader = new BufferedReader(new FileReader(lillllii11iiill11i.getFile()))) {
                     String s1 = bufferedreader.readLine();
                     if (s1 == null || s1.isBlank()) {
                        return false;
                     }

                     byte[] abyte = Base64.getDecoder().decode(s1);
                     byte[] abyte1 = SecureRandomHolder.EventBus(abyte, "siMunids");
                     String s2 = new String(abyte1, StandardCharsets.UTF_8);
                     JsonObject jsonobject = JsonParser.parseString(s2).getAsJsonObject();
                     if (lillll1l1ii1il1il$ii1il11l111ii11iil == ZenithInternal134$Helper.IllIIlIIl11111Il1I1l1I11l1) {
                        JsonObject jsonobject1 = new JsonObject();
                        if (jsonobject.has("Styles")) {
                           jsonobject1.add("Styles", jsonobject.get("Styles"));
                        }

                        lillllii11iiill11i.load(jsonobject1);
                        this.IsBindingHandler();
                        return true;
                     }

                     if (lillll1l1ii1il1il$ii1il11l111ii11iil == ZenithInternal134$Helper.lI1II1lII1IlIIIlll1Ill1) {
                        HashMap hashmap = new HashMap();

                        for (Module ll111il1lliill11x : ZenithClient.getInstance()
                           .getModuleManager()
                           .getModules()) {
                           hashmap.put(ll111il1lliill11x.getName(), ll111il1lliill11x.Elytramotion());
                        }

                        lillllii11iiill11i.load(jsonobject);

                        for (Module ll111il1lliill11 : ZenithClient.getInstance()
                           .getModuleManager()
                           .getModules()) {
                           Integer integer = (Integer)hashmap.get(ll111il1lliill11.getName());
                           if (integer != null) {
                              ll111il1lliill11.setKeyCode(integer);
                           }
                        }

                        this.IsBindingHandler();
                        return true;
                     }

                     lillllii11iiill11i.load(jsonobject);
                     this.IsBindingHandler();
                     flag = true;
                  }

                  return flag;
               } catch (Exception exception) {
                  exception.printStackTrace();
                  return false;
               }
            }
         }
      } catch (Exception exception1) {
         return false;
      }
   }

   private void IsBindingHandler() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && ZenithClient.getInstance().ZenithInternal017() != null) {
         try {
            ZenithClient.getInstance()
               .ZenithInternal017()
               .getDispatcher()
               .execute("binds list", ZenithClient.getInstance().ZenithInternal017().getSource());
         } catch (Exception exception) {
         }
      }
   }

   public boolean StringHolder_24(String s) {
      try {
         if (s == null) {
            return false;
         } else {
            IsPriorityHandler lillllii11iiill11i = this.GetSettingsHandler(s);
            if (lillllii11iiill11i == null) {
               lillllii11iiill11i = new IsPriorityHandler(s);
            }

            String s1 = new GsonBuilder().setPrettyPrinting().create().toJson(lillllii11iiill11i.save());
            String s2 = Base64.getEncoder().encodeToString(SecureRandomHolder.StringHolder_8(s1.getBytes(), "siMunids"));

            try (FileWriter filewriter = new FileWriter(lillllii11iiill11i.getFile())) {
               filewriter.write(s2);
            }

            return true;
         }
      } catch (Exception exception) {
         return false;
      }
   }

   public IsPriorityHandler GetSettingsHandler(String s) {
      if (s == null) {
         return null;
      } else {
         s = s.replace("." + "Zenith".toLowerCase(), "");
         File file1 = new File(l1I11IIIl11lIIllI1II1lI1I1, s + "." + "Zenith".toLowerCase());
         return file1.exists() ? new IsPriorityHandler(s) : null;
      }
   }

   public List<String> StringHolder_29() {
      File[] afile = l1I11IIIl11lIIllI1II1lI1I1.listFiles();
      ArrayList arraylist = new ArrayList();
      if (afile != null) {
         for (File file1 : afile) {
            arraylist.add(file1.getName());
         }
      }

      return arraylist;
   }

   public boolean StringHolder_17(String s) {
      if (s == null) {
         return false;
      } else {
         IsPriorityHandler lillllii11iiill11i = this.GetSettingsHandler(s);
         if (lillllii11iiill11i == null) {
            return false;
         } else {
            File file1 = lillllii11iiill11i.getFile();
            return file1.exists() && file1.delete();
         }
      }
   }

   public synchronized boolean ByteBufferHolder_2(String s, String s1) {
      if (s != null && s1 != null) {
         String s2 = s.replace("." + "Zenith".toLowerCase(), "").trim();
         String s3 = s1.replace("." + "Zenith".toLowerCase(), "").trim();
         if (s2.isEmpty() || s3.isEmpty()) {
            return false;
         } else if (s2.equalsIgnoreCase(s3)) {
            return true;
         } else {
            IsPriorityHandler lillllii11iiill11ix = this.GetSettingsHandler(s2);
            if (lillllii11iiill11ix != null && this.GetSettingsHandler(s3) == null) {
               try {
                  IsPriorityHandler lillllii11iiill11ix = new IsPriorityHandler(s3);
                  Files.copy(lillllii11iiill11ix.getFile().toPath(), lillllii11iiill11ix.getFile().toPath(), StandardCopyOption.REPLACE_EXISTING);
                  if (!lillllii11iiill11ix.getFile().delete()) {
                     lillllii11iiill11ix.getFile().delete();
                     return false;
                  } else {
                     return true;
                  }
               } catch (Exception exception) {
                  return false;
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public void save() {
      this.StringHolder_24("current_config");
   }

   public String longHolder_2() {
      return "siMunids";
   }
}
