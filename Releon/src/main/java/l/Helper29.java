package l;

import com.google.gson.annotations.SerializedName;

public class Helper29 {
   @SerializedName("IP:PORT")
   public String ipPort = "";
   public Helper28 type = Helper28.SOCKS5;
   public String username = "";
   public String password = "";

   public Helper29() {
   }

   public Helper29(boolean var1, String var2, String var3, String var4) {
      this.type = var1 ? Helper28.SOCKS4 : Helper28.SOCKS5;
      this.ipPort = var2;
      this.username = var3;
      this.password = var4;
   }

   public int method475() {
      if (this.ipPort != null && !this.ipPort.isEmpty() && this.ipPort.contains(":")) {
         try {
            return Integer.parseInt(this.ipPort.split(":")[1]);
         } catch (ArrayIndexOutOfBoundsException | NumberFormatException var2) {
            return 0;
         }
      } else {
         return 0;
      }
   }

   public String method476() {
      return this.ipPort != null && !this.ipPort.isEmpty() && this.ipPort.contains(":") ? this.ipPort.split(":")[0] : "";
   }
}
