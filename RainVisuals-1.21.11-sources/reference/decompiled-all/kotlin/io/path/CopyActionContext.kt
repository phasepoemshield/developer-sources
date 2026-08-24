package kotlin.io.path

import java.nio.file.Path

// $VF: Compiled from CopyActionContext.kt
@ExperimentalPathApi
@SinceKotlin(version = "1.8")
public interface CopyActionContext {
   public abstract fun Path.copyToIgnoringExistingDirectory(target: Path, followLinks: Boolean): CopyActionResult {
   }
}
