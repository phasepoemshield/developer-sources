package l;

import fat.releon.Releon;
import java.util.ArrayList;
import java.util.List;

public class Helper90 {
   private final List<Helper95> clientFiles = new ArrayList<>();

   public Helper90() {
   }

   public void method891(Releon var1) {
      this.method892(
         new AutoCfg(var1.method17(), var1.method26()),
         new EntityESP(var1.method21()),
         new BlockESP(var1.method21()),
         new Macro2(var1.method22()),
         new Way(var1.method23()),
         new Prefix(),
         new Friends(),
         new Staff2(),
         new ProxyProxyconfig()
      );
   }

   public void method892(Helper95... var1) {
      this.clientFiles.addAll(List.of(var1));
   }

   public List<Helper95> method893() {
      return this.clientFiles;
   }
}
