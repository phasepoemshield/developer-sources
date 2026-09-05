/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06202
 *  minecraft.class07536
 *  minecraft.class08280
 *  org.apache.commons.io.FilenameUtils
 */
package net.irisshaders.iris.pbr.util;

import java.io.File;
import minecraft.class06202;
import minecraft.class07536;
import minecraft.class08280;
import org.apache.commons.io.FilenameUtils;

public class TextureExporter {
    public static void exportTexture(String string, String string2, int n, int n2, int n3, int n4) {
        class08280 class082802 = new class08280(n3, n4, false);
        File file = new File((File)class06202.Nq().l_1, string);
        file.mkdirs();
        File file2 = new File(file, string2);
        class07536.Z().execute(() -> {
            try {
                class082802.N(file2);
            }
            catch (Exception exception) {
            }
            finally {
                class082802.close();
            }
        });
    }

    public static void exportTextures(String string, String string2, int n, int n2, int n3, int n4) {
        String string3 = FilenameUtils.getExtension((String)string2);
        String string4 = string2.substring(0, string2.length() - string3.length() - 1);
        for (int i = 0; i <= n2; ++i) {
            TextureExporter.exportTexture(string, string4 + "_" + i + "." + string3, n, i, n3 >> i, n4 >> i);
        }
    }
}

