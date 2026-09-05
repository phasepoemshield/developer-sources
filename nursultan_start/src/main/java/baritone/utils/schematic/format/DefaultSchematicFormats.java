/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.schematic.format.ISchematicFormat
 *  org.apache.commons.io.FilenameUtils
 */
package baritone.utils.schematic.format;

import baritone.api.schematic.format.ISchematicFormat;
import baritone.utils.schematic.format.DefaultSchematicFormats$1;
import baritone.utils.schematic.format.DefaultSchematicFormats$2;
import baritone.utils.schematic.format.DefaultSchematicFormats$3;
import java.io.File;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.FilenameUtils;

public abstract sealed class DefaultSchematicFormats
extends Enum<DefaultSchematicFormats>
implements ISchematicFormat
permits DefaultSchematicFormats$1, DefaultSchematicFormats$2, DefaultSchematicFormats$3 {
    public static final /* enum */ DefaultSchematicFormats MCEDIT = new DefaultSchematicFormats$1("schematic");
    public static final /* enum */ DefaultSchematicFormats SPONGE = new DefaultSchematicFormats$2("schem");
    public static final /* enum */ DefaultSchematicFormats LITEMATICA = new DefaultSchematicFormats$3("litematic");
    private final String extension;
    private static final /* synthetic */ DefaultSchematicFormats[] $VALUES;

    DefaultSchematicFormats(String string2) {
        this.extension = string2;
    }

    static {
        $VALUES = DefaultSchematicFormats.$values();
    }

    public static DefaultSchematicFormats[] values() {
        return (DefaultSchematicFormats[])$VALUES.clone();
    }

    public static DefaultSchematicFormats valueOf(String string) {
        return Enum.valueOf(DefaultSchematicFormats.class, string);
    }

    private static /* synthetic */ DefaultSchematicFormats[] $values() {
        return new DefaultSchematicFormats[]{MCEDIT, SPONGE, LITEMATICA};
    }

    public boolean isFileType(File file) {
        return this.extension.equalsIgnoreCase(FilenameUtils.getExtension((String)file.getAbsolutePath()));
    }

    public List<String> getFileExtensions() {
        return Collections.singletonList(this.extension);
    }
}

