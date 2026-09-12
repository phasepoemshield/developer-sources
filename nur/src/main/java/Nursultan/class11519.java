package Nursultan;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;

public class class11519 {
   public Object N_0;
   public Object N_1;
   public static Object y_0 = LogManager.getLogger(String.class);
   public static Object y_1 = ((Path)class11518.N_0).resolve("configs");
   public static Object y_2;

   public Path L() {
      return (Path)this.N_0;
   }

   public void L(Class<? extends class11488> var1) {
      ((List)this.N_1).stream().filter(var1x -> var1x.getClass() == var1).findFirst().ifPresent(this::N);
   }

   private void M() {
   }

   public class11519() {
      this.M();
      this.N_0 = ((Path)y_1).resolve(String.valueOf(((class11472)class11938.L_2).M()));
      this.N_1 = List.of(
         new class11493("friends.dat", 1),
         new class11329("waypoints.dat", 1),
         new class11506("macros.dat", 1),
         new class11537("nuker.dat", 1),
         new class11521("selected-preset.dat", 1),
         new class11495("accounts.dat", 1),
         new class11491("selected-account.dat", 1),
         new class11514("client-settings.dat", 1),
         new class11292("ui-layout.dat", 1),
         new class11516("autobuy.dat", 1),
         new class11511("blockesp.dat", 1)
      );
   }

   static {
      R();
   }

   public List<class11488> i() {
      return (List<class11488>)this.N_1;
   }

   public void u() {
      ((List)this.N_1).forEach(this::y);
   }

   public void y() {
      ((List)this.N_1).forEach(this::N);
   }

   public void y(class11488 var1) {
      Path var2 = ((Path)this.N_0).resolve(var1.u());
      Path var3 = ((Path)this.N_0).resolve(var1.u() + "." + UUID.randomUUID() + ".tmp");

      try {
         Files.createDirectories((Path)this.N_0);
         MessageBufferPacker var5 = MessagePack.newDefaultBufferPacker();

         byte[] var4;
         try {
            var1.y(var5);
            var4 = class11509.y(var5.toByteArray());
         } catch (Throwable var19) {
            if (var5 != null) {
               try {
                  var5.close();
               } catch (Throwable var18) {
                  var19.addSuppressed(var18);
               }
            }

            throw var19;
         }

         if (var5 != null) {
            var5.close();
         }

         Files.write(var3, class11498.N(var4), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
         Files.move(var3, var2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
      } catch (IOException var20) {
         ((Logger)y_0).error("Failed to save config {}", var1.u(), var20);
      } finally {
         try {
            Files.deleteIfExists(var3);
         } catch (IOException var17) {
         }
      }
   }

   public static void y(Class<? extends class11488> var0) {
      class11519 var1 = class11938.M();
      ((List)var1.N_1).stream().filter(var1x -> var1x.getClass() == var0).findFirst().ifPresent(var1::y);
   }

   public <T extends class11488> T N(Class<T> var1) {
      return ((List)this.N_1)
         .stream()
         .filter(var1::isInstance)
         .map(var1::cast)
         .findFirst()
         .orElseThrow(() -> new IllegalStateException("Config " + var1.getSimpleName() + " not registered"));
   }

   public Optional<class11531> N(class09378 var1) {
      return ((List)this.N_1).stream().filter(class11531.class::isInstance).map(class11531.class::cast).filter(var1x -> var1x.i() == var1).findFirst();
   }

   public void N(class11488 var1) {
      Path var2 = ((Path)this.N_0).resolve(var1.u());
      if (Files.exists(var2)) {
         try {
            byte[] var3 = Files.readAllBytes(var2);
            class11529.N(var1, class11498.N(var3));
         } catch (Exception var4) {
            ((Logger)y_0).error("Failed to load config {}", var1.u(), var4);
         }
      }
   }

   public List<class11531> N() {
      return ((List)this.N_1).stream().filter(class11531.class::isInstance).map(class11531.class::cast).toList();
   }

   private static void R() {
      y_0 = null;
      y_1 = null;
      y_2 = 1;
   }
}
