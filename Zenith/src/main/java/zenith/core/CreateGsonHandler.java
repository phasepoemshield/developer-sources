package zenith;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collection;
import java.util.function.Supplier;

public class CreateGsonHandler<T> {
   protected Collection<T> items;
   private final String fileName;
   private final String shifr;
   private final Type type;
   private final Supplier<Collection<T>> collectionSupplier;

   public CreateGsonHandler(String s, String s1, Type type, Supplier<Collection<T>> supplier) {
      this.fileName = s;
      this.shifr = s1;
      this.type = typex;
      this.collectionSupplier = supplier;
      File file1 = new File(ZenithClient.AhHelper, s);
      if (!file1.exists()) {
         try {
            file1.createNewFile();
            this.items = (Collection<T>)supplier.get();
         } catch (Exception exception) {
            this.items = (Collection<T>)supplier.get();
         }
      } else {
         this.load();
      }
   }

   protected Gson createGson() {
      return new GsonBuilder().create();
   }

   public void save() {
      Gson gson = this.createGson();
      String s = gson.toJson(this.items);

      try (FileWriter filewriter = new FileWriter(new File(ZenithClient.AhHelper, this.fileName))) {
         filewriter.write(this.shifr.isEmpty() ? s : Base64.getEncoder().encodeToString(SecureRandomHolder.StringHolder_8(s.getBytes(), this.shifr)));
      } catch (Exception exception) {
      }
   }

   public void load() {
      try (BufferedReader bufferedreader = new BufferedReader(new FileReader(new File(ZenithClient.AhHelper, this.fileName)))) {
         Gson gson = this.createGson();
         if (!this.shifr.isEmpty()) {
            String s = bufferedreader.readLine();
            if (s != null && !s.isEmpty()) {
               byte[] abyte = Base64.getDecoder().decode(s);
               byte[] abyte1 = SecureRandomHolder.EventBus(abyte, this.shifr);
               String s1 = new String(abyte1, StandardCharsets.UTF_8);
               this.items = (Collection<T>)gson.fromJson(s1, this.type);
            } else {
               this.items = this.collectionSupplier.get();
            }
         } else {
            this.items = (Collection<T>)gson.fromJson(bufferedreader, this.type);
         }

         if (this.items == null) {
            this.items = this.collectionSupplier.get();
         }
      } catch (Exception exception) {
         this.items = this.collectionSupplier.get();
      }
   }

   // $VF: renamed from: add (java.lang.Object) void
   public void method_98(T object) {
      this.items.add((T)object);
   }

   public void remove(T object) {
      this.items.remove(object);
   }

   public Collection<T> getItems() {
      return this.items;
   }
}
