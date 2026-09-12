import java.util.Map;
import java.util.Optional;
import net.fabricmc.loader.api.metadata.ContactInformation;

final class NurContact implements ContactInformation {
   private final Map<String, String> map;

   NurContact(Map<String, String> var1) {
      this.map = var1;
   }

   public Optional<String> get(String var1) {
      return Optional.ofNullable(this.map.get(var1));
   }

   public Map<String, String> asMap() {
      return this.map;
   }
}
