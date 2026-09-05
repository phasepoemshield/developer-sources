/*
 * Decompiled with CFR 0.152.
 */
package net.raphimc.viabedrock.api.resourcepack.content;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import net.raphimc.viabedrock.api.resourcepack.content.InMemoryContent;

public class ZipContent
extends InMemoryContent {
    public ZipContent(byte[] zipData) throws IOException {
        ZipEntry zipEntry;
        ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(zipData));
        while ((zipEntry = zipInputStream.getNextEntry()) != null) {
            if (zipEntry.isDirectory()) continue;
            this.content.put(zipEntry.getName(), zipInputStream.readAllBytes());
        }
    }
}

