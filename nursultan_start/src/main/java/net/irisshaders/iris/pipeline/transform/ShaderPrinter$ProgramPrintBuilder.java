/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 *  org.apache.commons.io.FilenameUtils
 */
package net.irisshaders.iris.pipeline.transform;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pipeline.transform.PatchShaderType;
import net.irisshaders.iris.pipeline.transform.ShaderPrinter;
import org.apache.commons.io.FilenameUtils;

public class ShaderPrinter$ProgramPrintBuilder {
    private final boolean isActive = Iris.getIrisConfig().areDebugOptionsEnabled();
    private final String prefix = this.isActive ? String.format("%03d_", ++ShaderPrinter.programCounter) : null;
    private final List<String> sources = this.isActive ? new ArrayList(PatchShaderType.values().length * 2) : null;
    private String name;
    private boolean done = false;

    private void addItem(String string, String string2) {
        if (string2 != null && this.sources != null) {
            this.sources.add(this.prefix + this.name + string);
            this.sources.add(string2);
        }
    }

    public ShaderPrinter$ProgramPrintBuilder(String string) {
        this.setName(string);
    }

    public ShaderPrinter$ProgramPrintBuilder setName(String string) {
        this.name = string;
        return this;
    }

    public void print() {
        if (this.done) {
            return;
        }
        this.done = true;
        if (this.isActive) {
            if (!ShaderPrinter.outputLocationCleared) {
                try {
                    if (Files.exists(ShaderPrinter.debugOutDir, new LinkOption[0])) {
                        try (Stream<Path> stream = Files.list(ShaderPrinter.debugOutDir).filter(path -> !FilenameUtils.getExtension((String)path.toString()).contains("properties"));){
                            stream.forEach(path -> {
                                try {
                                    Files.delete(path);
                                }
                                catch (IOException iOException) {
                                    throw new RuntimeException(iOException);
                                }
                            });
                        }
                    }
                    Files.createDirectories(ShaderPrinter.debugOutDir, new FileAttribute[0]);
                }
                catch (IOException iOException) {
                    Iris.logger.warn("Failed to initialize debug patched shader source location", (Throwable)iOException);
                }
                ShaderPrinter.outputLocationCleared = true;
            }
            try {
                for (int i = 0; i < this.sources.size(); i += 2) {
                    Files.writeString(ShaderPrinter.debugOutDir.resolve(this.sources.get(i)), (CharSequence)this.sources.get(i + 1), new OpenOption[0]);
                }
            }
            catch (IOException iOException) {
                Iris.logger.warn("Failed to write debug patched shader source", (Throwable)iOException);
            }
        }
    }

    public ShaderPrinter$ProgramPrintBuilder addSource(PatchShaderType patchShaderType, String string) {
        if (this.sources == null) {
            return this;
        }
        this.addItem(patchShaderType.extension, string);
        return this;
    }

    public ShaderPrinter$ProgramPrintBuilder addSources(Map<PatchShaderType, String> map) {
        if (map == null) {
            return this;
        }
        for (Map.Entry<PatchShaderType, String> entry : map.entrySet()) {
            this.addSource(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public ShaderPrinter$ProgramPrintBuilder addJson(String string) {
        if (this.sources == null) {
            return this;
        }
        this.addItem(".json", string);
        return this;
    }
}

