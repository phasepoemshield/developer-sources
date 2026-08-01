package l;

public class Helper397 {
   public String name;
   public boolean starred;
   public float starAnim;
   boolean premium;
   String refreshToken;
   public String uuid;
   String accessToken;

   public Helper397(String var1, boolean var2, boolean var3, String var4, String var5, String var6) {
      this.name = var1;
      this.starred = var2;
      this.premium = var3;
      this.refreshToken = var4;
      this.uuid = var5;
      this.accessToken = var6;
      this.starAnim = var2 ? 1.0F : 0.0F;
   }
}
