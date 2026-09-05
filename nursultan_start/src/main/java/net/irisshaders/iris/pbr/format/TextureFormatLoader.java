/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01894
 *  net.irisshaders.iris.Iris
 */
package net.irisshaders.iris.pbr.format;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Optional;
import java.util.Properties;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01894;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pbr.format.TextureFormat;
import net.irisshaders.iris.pbr.format.TextureFormat$Factory;
import net.irisshaders.iris.pbr.format.TextureFormatRegistry;

public class TextureFormatLoader {
    public static final class01894 LOCATION = class01894.y((String)"optifine/texture.properties");
    private static TextureFormat format;

    public static void reload(class01089 class010892) {
        TextureFormat textureFormat = TextureFormatLoader.loadFormat(class010892);
        boolean bl = !Objects.equals(format, textureFormat);
        format = textureFormat;
        if (bl) {
            TextureFormatLoader.onFormatChange();
        }
    }

    public static TextureFormat getFormat() {
        return format;
    }

    private static void onFormatChange() {
        try {
            Iris.reload();
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static TextureFormat loadFormat(class01089 class010892) {
        Optional optional = class010892.method_14486(LOCATION);
        if (!optional.isPresent()) return null;
        try (InputStream inputStream = ((class01079)optional.get()).method_14482();){
            Properties properties = new Properties();
            properties.load(inputStream);
            String string2 = properties.getProperty("format");
            if (string2 == null) return null;
            if (string2.isEmpty()) return null;
            String[] stringArray = string2.split("/");
            if (stringArray.length <= 0) return null;
            String string = stringArray[0];
            TextureFormat$Factory textureFormat$Factory = TextureFormatRegistry.INSTANCE.getFactory(string);
            if (textureFormat$Factory != null) {
                String string3 = stringArray.length > 1 ? stringArray[1] : null;
                TextureFormat textureFormat = textureFormat$Factory.createFormat(string, string3);
                return textureFormat;
            }
            Iris.logger.warn("Invalid texture format '" + string + "' in file '" + String.valueOf(LOCATION) + "'");
            return null;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
        catch (Exception exception) {
            Iris.logger.error("Failed to load texture format from file '" + String.valueOf(LOCATION) + "'", (Throwable)exception);
        }
        return null;
    }
}

