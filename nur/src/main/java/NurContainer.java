import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.fabricmc.loader.api.metadata.ModOrigin;
import net.fabricmc.loader.api.metadata.ModOrigin.Kind;

final class NurContainer implements ModContainer {
   private final NurMeta meta;
   private final List<Path> roots;
   private final ModOrigin origin;

   NurContainer(NurMeta var1, List<Path> var2) {
      this.meta = var1;
      this.roots = var2;
      this.origin = new NurContainer.Origin(var2);
   }

   public ModMetadata getMetadata() {
      return this.meta;
   }

   public List<Path> getRootPaths() {
      return this.roots;
   }

   public Path getRootPath() {
      return this.roots.get(0);
   }

   public Path getPath(String var1) {
      String var3 = var1;

      while (var3.startsWith("/")) {
         var3 = var3.substring(1);
      }

      for (Path root : this.roots) {
         Path resolved = var3.isEmpty() ? root : root.resolve(var3);
         if (Files.exists(resolved)) {
            return resolved;
         }
      }

      Path var2 = this.getRootPath();
      return var3.isEmpty() ? var2 : var2.resolve(var3);
   }

   public Optional<Path> findPath(String var1) {
      String var3 = var1;

      while (var3.startsWith("/")) {
         var3 = var3.substring(1);
      }

      for (Path root : this.roots) {
         Path resolved = var3.isEmpty() ? root : root.resolve(var3);
         if (Files.exists(resolved)) {
            return Optional.of(resolved);
         }
      }

      return Optional.empty();
   }

   public ModOrigin getOrigin() {
      return this.origin;
   }

   public Optional<ModContainer> getContainingMod() {
      return Optional.empty();
   }

   public Collection<ModContainer> getContainedMods() {
      return Collections.emptyList();
   }

   @Override
   public String toString() {
      return this.meta.getId() + " " + this.meta.getVersion().getFriendlyString();
   }

   private static final class Origin implements ModOrigin {
      private final List<Path> paths;

      Origin(List<Path> var1) {
         this.paths = new ArrayList<>(var1);
      }

      public Kind getKind() {
         return Kind.PATH;
      }

      public List<Path> getPaths() {
         return this.paths;
      }

      public String getParentModId() {
         throw new UnsupportedOperationException();
      }

      public String getParentSubLocation() {
         throw new UnsupportedOperationException();
      }
   }
}
