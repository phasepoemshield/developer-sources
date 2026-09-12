import net.fabricmc.loader.api.Version;

final class NurVersion implements Version {
   private final String raw;

   NurVersion(String var1) {
      this.raw = var1;
   }

   public String getFriendlyString() {
      return this.raw;
   }

   public int compareTo(Version var1) {
      return this.raw.compareTo(var1.getFriendlyString());
   }

   @Override
   public String toString() {
      return this.raw;
   }
}
