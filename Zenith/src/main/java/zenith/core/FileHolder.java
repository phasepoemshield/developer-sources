package zenith;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class FileHolder {
   public static final File ll1I1IlIIIIII = new File(ZenithClient.AhHelper, "kits");
   private final String l1l1II1I1ll11l1IlI1lI11l1 = "kit";
   private final List<GetServerHandler> IIl111lI11I1Il1l1ll1l1111II11 = new ArrayList<>();

   public FileHolder() {
      ll1I1IlIIIIII.mkdirs();
      this.TimerUtilHolder();
   }

   public void TimerUtilHolder() {
      this.IIl111lI11I1Il1l1ll1l1111II11.clear();
      File[] afile = ll1I1IlIIIIII.listFiles();
      if (afile != null) {
         for (File file1 : afile) {
            if (file1.getName().endsWith("." + "Zenith".toLowerCase())) {
               GetServerHandler lll111iiili1il1l1ill1il1l = this.StringHolder_8(file1);
               if (lll111iiili1il1l1ill1il1l != null) {
                  this.IIl111lI11I1Il1l1ll1l1111II11.add(lll111iiili1il1l1ill1il1l);
               }
            }
         }
      }
   }

   public GetServerHandler EventImpl_19(String s) {
      if (s == null) {
         return null;
      } else {
         File file1 = new File(ll1I1IlIIIIII, s + "." + "Zenith".toLowerCase());
         return !file1.exists() ? null : this.StringHolder_8(file1);
      }
   }

   private GetServerHandler StringHolder_8(File file1) {
      if (file1 != null && file1.exists()) {
         try {
            GetServerHandler lll111iiili1il1l1ill1il1l;
            try (BufferedReader bufferedreader = new BufferedReader(new FileReader(file1))) {
               JsonParser jsonparser = new JsonParser();
               String s = bufferedreader.readLine();
               byte[] abyte = Base64.getDecoder().decode(s);
               byte[] abyte1 = SecureRandomHolder.EventBus(abyte, "kit");
               String s1 = new String(abyte1, StandardCharsets.UTF_8);
               JsonObject jsonobject = (JsonObject)jsonparser.parse(s1);
               String s2 = file1.getName().replace("." + "Zenith".toLowerCase(), "");
               String s3 = jsonobject.has("name") ? jsonobject.get("name").getAsString() : s2;
               String s4 = jsonobject.has("server") ? jsonobject.get("server").getAsString() : "HolyWorld";
               GetServerHandler lll111iiili1il1l1ill1il1lx = new GetServerHandler(s3, s4, file1);
               lll111iiili1il1l1ill1il1lx.load(jsonobject);
               lll111iiili1il1l1ill1il1l = lll111iiili1il1l1ill1il1lx;
            }

            return lll111iiili1il1l1ill1il1l;
         } catch (Exception exception) {
            exception.printStackTrace();
            return null;
         }
      } else {
         return null;
      }
   }

   public boolean StringHolder_8(GetServerHandler lll111iiili1il1l1ill1il1l) {
      try {
         if (lll111iiili1il1l1ill1il1l == null) {
            return false;
         } else {
            String s = new GsonBuilder().setPrettyPrinting().create().toJson(lll111iiili1il1l1ill1il1l.save());
            s = Base64.getEncoder().encodeToString(SecureRandomHolder.StringHolder_8(s.getBytes(), "kit"));

            try {
               FileWriter filewriter = new FileWriter(lll111iiili1il1l1ill1il1l.getFile());
               filewriter.write(s);
               filewriter.close();
               return true;
            } catch (IOException ioexception) {
               return false;
            }
         }
      } catch (Exception exception) {
         return false;
      }
   }

   public GetServerHandler EventTarget(String s, List<GetMaxSumBuyHandler> list) {
      GetServerHandler lll111iiili1il1l1ill1il1l = new GetServerHandler(s);
      lll111iiili1il1l1ill1il1l.ZenithInternal128(list);
      if (this.StringHolder_8(lll111iiili1il1l1ill1il1l)) {
         this.IIl111lI11I1Il1l1ll1l1111II11.add(lll111iiili1il1l1ill1il1l);
         return lll111iiili1il1l1ill1il1l;
      } else {
         return null;
      }
   }

   public GetServerHandler StringHolder_8(String s, List<GetMaxSumBuyHandler> list, String s1) {
      GetServerHandler lll111iiili1il1l1ill1il1l = new GetServerHandler(s, s1);
      lll111iiili1il1l1ill1il1l.ZenithInternal128(list);
      if (this.StringHolder_8(lll111iiili1il1l1ill1il1l)) {
         this.IIl111lI11I1Il1l1ll1l1111II11.add(lll111iiili1il1l1ill1il1l);
         return lll111iiili1il1l1ill1il1l;
      } else {
         return null;
      }
   }

   public boolean KeyEvent(String s) {
      if (s == null) {
         return false;
      } else {
         GetServerHandler lll111iiili1il1l1ill1il1l;
         if ((lll111iiili1il1l1ill1il1l = this.EventImpl_16(s)) != null) {
            File file1 = lll111iiili1il1l1ill1il1l.getFile();
            if (file1.exists() && file1.delete()) {
               this.IIl111lI11I1Il1l1ll1l1111II11.remove(lll111iiili1il1l1ill1il1l);
               return true;
            }
         }

         return false;
      }
   }

   public boolean EventBus(GetServerHandler lll111iiili1il1l1ill1il1l) {
      if (lll111iiili1il1l1ill1il1l == null) {
         return false;
      } else {
         File file1 = lll111iiili1il1l1ill1il1l.getFile();
         if (file1.exists() && file1.delete()) {
            this.IIl111lI11I1Il1l1ll1l1111II11.remove(lll111iiili1il1l1ill1il1l);
            return true;
         } else {
            return false;
         }
      }
   }

   public GetServerHandler EventImpl_16(String s) {
      return s == null
         ? null
         : this.IIl111lI11I1Il1l1ll1l1111II11
            .stream()
            .filter(lll111iiili1il1l1ill1il1l -> lll111iiili1il1l1ill1il1l.getName().equals(s))
            .findFirst()
            .orElse(null);
   }

   public GetServerHandler CallableImpl(String s, String s1) {
      return s == null
         ? null
         : this.IIl111lI11I1Il1l1ll1l1111II11
            .stream()
            .filter(lll111iiili1il1l1ill1il1l -> lll111iiili1il1l1ill1il1l.getName().equals(s) && lll111iiili1il1l1ill1il1l.EventImpl_6(s1))
            .findFirst()
            .orElse(null);
   }

   public List<GetServerHandler> EventImpl_38(String s) {
      return this.IIl111lI11I1Il1l1ll1l1111II11.stream().filter(lll111iiili1il1l1ill1il1l -> lll111iiili1il1l1ill1il1l.EventImpl_6(s)).toList();
   }

   public List<String> ZenithInternal022() {
      ArrayList arraylist = new ArrayList();

      for (GetServerHandler lll111iiili1il1l1ill1il1l : this.IIl111lI11I1Il1l1ll1l1111II11) {
         if (!arraylist.contains(lll111iiili1il1l1ill1il1l.getName())) {
            arraylist.add(lll111iiili1il1l1ill1il1l.getName());
         }
      }

      return arraylist;
   }

   public String longHolder_2() {
      return "kit";
   }

   public List<GetServerHandler> getKits() {
      return this.IIl111lI11I1Il1l1ll1l1111II11;
   }
}
