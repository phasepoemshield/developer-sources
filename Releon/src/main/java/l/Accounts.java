package l;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Accounts extends Helper95 {
   private final Helper377 accountRepository;

   public Accounts(Helper377 var1) {
      super("Accounts");
      this.accountRepository = var1;
   }

   @Override
   public void method584(File var1) {
      Gson var2 = new GsonBuilder().setPrettyPrinting().create();
      File var3 = new File(var1, this.getName() + ".json");

      try {
         try (FileWriter var4 = new FileWriter(var3)) {
            Helper398 var5 = new Helper398();
            var5.accounts = this.accountRepository.accountList;
            var5.currentAccount = this.accountRepository.currentAccount;
            var2.toJson(var5, var4);
         }
      } catch (IOException | JsonIOException var9) {
         throw new Helper111("Failed to save accounts to file", var9);
      }
   }

   @Override
   public void method583(File var1) {
      Gson var2 = new Gson();
      File var3 = new File(var1, this.getName() + ".json");

      try {
         try (FileReader var4 = new FileReader(var3)) {
            Helper398 var5 = (Helper398)var2.fromJson(var4, Helper398.class);
            this.accountRepository.accountList.clear();
            if (var5.accounts != null) {
               this.accountRepository.accountList.addAll(var5.accounts);
            }

            if (var5.currentAccount != null) {
               this.accountRepository.currentAccount = var5.currentAccount;
            }
         }
      } catch (IOException var9) {
         throw new Helper122("Failed to load accounts from file", var9);
      } catch (JsonSyntaxException var10) {
         throw new Helper122("JSON syntax error, accounts config cannot be loaded", var10);
      } catch (JsonIOException var11) {
         throw new Helper122("JSON IO error, accounts config cannot be loaded", var11);
      }
   }
}
