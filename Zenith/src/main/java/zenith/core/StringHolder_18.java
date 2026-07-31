package zenith;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class StringHolder_18 {
   private static final String II1IIll1IlI1llII1lIlI1I1 = "protection.zenith";
   private static final String IIIlI1I1111l1I1IIll = "playTimeZnth";
   private final File IllI1lIlllll11I11l = new File(ZenithClient.AhHelper, "protection.zenith");
   private final long III111Il11l1I1l1II11l = System.currentTimeMillis();
   private long Il1IIlI11IIIIIlIl1lIIIIlI1Il;
   private long Illl1IIIIlIIIll1lllIlI;
   private String l11l1lII = this.ZenithInternal068();

   public StringHolder_18() {
      this.load();
   }

   private String ZenithInternal068() {
      LocalDate localdate = LocalDate.now();
      WeekFields weekfields = WeekFields.of(Locale.getDefault());
      int i = localdate.get(weekfields.weekOfWeekBasedYear());
      int j = localdate.get(weekfields.weekBasedYear());
      return j + "-W" + i;
   }

   private void load() {
      if (!this.IllI1lIlllll11I11l.exists()) {
         this.Il1IIlI11IIIIIlIl1lIIIIlI1Il = 0L;
         this.Illl1IIIIlIIIll1lllIlI = 0L;
      } else {
         try {
            try (BufferedReader bufferedreader = new BufferedReader(new FileReader(this.IllI1lIlllll11I11l))) {
               String s = bufferedreader.readLine();
               if (s == null || s.isEmpty()) {
                  this.Il1IIlI11IIIIIlIl1lIIIIlI1Il = 0L;
                  this.Illl1IIIIlIIIll1lllIlI = 0L;
                  return;
               }

               String s1 = SecureRandomHolder.SecureRandomHolder_2(s, "playTimeZnth");
               Gson gson = new Gson();
               JsonObject jsonobject = (JsonObject)gson.fromJson(s1, JsonObject.class);
               if (jsonobject != null) {
                  this.Il1IIlI11IIIIIlIl1lIIIIlI1Il = jsonobject.has("totalSeconds") ? jsonobject.get("totalSeconds").getAsLong() : 0L;
                  if (jsonobject.has("weeklyData")) {
                     JsonObject jsonobject1 = jsonobject.getAsJsonObject("weeklyData");
                     this.Illl1IIIIlIIIll1lllIlI = jsonobject1.has(this.l11l1lII) ? jsonobject1.get(this.l11l1lII).getAsLong() : 0L;
                  }

                  return;
               }

               this.Il1IIlI11IIIIIlIl1lIIIIlI1Il = 0L;
               this.Illl1IIIIlIIIll1lllIlI = 0L;
            }
         } catch (Exception exception) {
            this.Il1IIlI11IIIIIlIl1lIIIIlI1Il = 0L;
            this.Illl1IIIIlIIIll1lllIlI = 0L;
         }
      }
   }

   public void save() {
      long i = this.ZenithInternal147();
      long j = this.Il1IIlI11IIIIIlIl1lIIIIlI1Il + i;
      String s = this.ZenithInternal068();
      long k;
      if (s.equals(this.l11l1lII)) {
         k = this.Illl1IIIIlIIIll1lllIlI + i;
      } else {
         k = i;
      }

      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("totalSeconds", j);
      JsonObject jsonobject1 = new JsonObject();
      jsonobject1.addProperty(s, k);
      jsonobject.add("weeklyData", jsonobject1);

      try {
         String s1 = new Gson().toJson(jsonobject);
         String s2 = SecureRandomHolder.ListHolder_6(s1, "playTimeZnth");

         try (FileWriter filewriter = new FileWriter(this.IllI1lIlllll11I11l)) {
            filewriter.write(s2);
         }
      } catch (Exception exception) {
      }
   }

   public long ZenithInternal147() {
      return (System.currentTimeMillis() - this.III111Il11l1I1l1II11l) / 1000L;
   }

   public long StringHolder_21() {
      String s = this.ZenithInternal068();
      return s.equals(this.l11l1lII) ? this.Illl1IIIIlIIIll1lllIlI + this.ZenithInternal147() : this.ZenithInternal147();
   }

   public long ScreenImpl() {
      return this.Il1IIlI11IIIIIlIl1lIIIIlI1Il + this.ZenithInternal147();
   }

   public static String byteHolder_2(long i) {
      long j = i / 3600L;
      long k = i % 3600L / 60L;
      return j > 0L ? j + "h " + k + "m" : k + "m";
   }
}
