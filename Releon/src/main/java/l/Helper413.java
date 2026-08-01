package l;

import java.io.File;

public class Helper413 implements Helper390 {
   private final String clientName;
   private final String userName;
   private final String role;
   private final File clientDir;
   private final File filesDir;

   public Helper413(String var1, String var2, String var3, File var4, File var5) {
      this.clientName = var1;
      this.userName = var2;
      this.role = var3;
      this.clientDir = var4;
      this.filesDir = var5;
   }

   @Override
   public String userName() {
      return this.userName;
   }

   @Override
   public String method3924() {
      return String.format("Welcome! Client: %s Version: %s Branch: %s", this.clientName, "Baflllik && HZeed", Helper209.method1793());
   }

   @Override
   public File method3927() {
      return this.clientDir;
   }

   @Override
   public String method3922() {
      return this.clientName;
   }

   @Override
   public String method3923() {
      return this.role;
   }

   @Override
   public File method3925() {
      return this.clientDir;
   }

   @Override
   public File method3926() {
      return this.filesDir;
   }
}
