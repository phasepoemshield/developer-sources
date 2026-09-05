/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_156$class_158
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 */
package ruhack.phobia.a;

import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import net.minecraft.class_156;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import ruhack.phobia.fl;

@Mixin(value={class_156.class_158.class})
public class bk {
    @ModifyVariable(method={"method_60932"}, at=@At(value="HEAD"), argsOnly=true)
    private Path phobia$redirectPackPath(Path path) {
        return fl.redirectPackFolder(path);
    }

    @ModifyVariable(method={"method_672"}, at=@At(value="HEAD"), argsOnly=true)
    private File phobia$redirectPackFile(File file) {
        return fl.redirectPackFolder(file.toPath()).toFile();
    }

    @ModifyVariable(method={"method_673"}, at=@At(value="HEAD"), argsOnly=true)
    private URI phobia$redirectPackUri(URI uri) {
        if (!"file".equalsIgnoreCase(uri.getScheme())) {
            return uri;
        }
        try {
            return fl.redirectPackFolder(Path.of(uri)).toUri();
        }
        catch (IllegalArgumentException ignored) {
            return uri;
        }
    }
}

