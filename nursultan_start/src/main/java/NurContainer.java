/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.metadata.ModMetadata
 *  net.fabricmc.loader.api.metadata.ModOrigin
 *  net.fabricmc.loader.api.metadata.ModOrigin$Kind
 */
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.fabricmc.loader.api.metadata.ModOrigin;

final class NurContainer
implements ModContainer {
    private final NurMeta meta;
    private final List<Path> roots;
    private final ModOrigin origin;

    NurContainer(NurMeta nurMeta, List<Path> list) {
        this.meta = nurMeta;
        this.roots = list;
        this.origin = new Origin(list);
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

    public Path getPath(String string) {
        Path path = this.getRootPath();
        String string2 = string;
        while (string2.startsWith("/")) {
            string2 = string2.substring(1);
        }
        return string2.isEmpty() ? path : path.resolve(string2);
    }

    public Optional<Path> findPath(String string) {
        Path path = this.getPath(string);
        return Files.exists(path, new LinkOption[0]) ? Optional.of(path) : Optional.empty();
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

    public String toString() {
        return this.meta.getId() + " " + this.meta.getVersion().getFriendlyString();
    }

    private static final class Origin
    implements ModOrigin {
        private final List<Path> paths;

        Origin(List<Path> list) {
            this.paths = new ArrayList<Path>(list);
        }

        public ModOrigin.Kind getKind() {
            return ModOrigin.Kind.PATH;
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

