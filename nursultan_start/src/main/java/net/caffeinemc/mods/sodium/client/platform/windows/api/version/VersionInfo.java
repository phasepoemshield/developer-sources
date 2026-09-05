/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryUtil
 */
package net.caffeinemc.mods.sodium.client.platform.windows.api.version;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.Locale;
import net.caffeinemc.mods.sodium.client.platform.windows.api.version.LanguageCodePage;
import net.caffeinemc.mods.sodium.client.platform.windows.api.version.QueryResult;
import net.caffeinemc.mods.sodium.client.platform.windows.api.version.Version;
import net.caffeinemc.mods.sodium.client.platform.windows.api.version.VersionFixedFileInfoStruct;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;

public class VersionInfo
implements Closeable {
    private final ByteBuffer pBlock;

    VersionInfo(ByteBuffer byteBuffer) {
        this.pBlock = byteBuffer;
    }

    @Override
    public void close() {
        MemoryUtil.memAlignedFree((ByteBuffer)this.pBlock);
    }

    long address() {
        return MemoryUtil.memAddress((ByteBuffer)this.pBlock);
    }

    public static VersionInfo allocate(int n) {
        return new VersionInfo(MemoryUtil.memAlignedAlloc((int)16, (int)n));
    }

    public @Nullable VersionFixedFileInfoStruct queryFixedFileInfo() {
        QueryResult queryResult = Version.query(this.pBlock, "\\");
        if (queryResult == null) {
            return null;
        }
        return VersionFixedFileInfoStruct.from(queryResult.address());
    }

    public @Nullable LanguageCodePage queryEnglishTranslation() {
        QueryResult queryResult = Version.query(this.pBlock, "\\VarFileInfo\\Translation");
        if (queryResult == null) {
            return null;
        }
        return VersionInfo.findEnglishTranslationEntry(queryResult);
    }

    private static String getStringFileInfoPath(String string, LanguageCodePage languageCodePage) {
        return String.format(Locale.ROOT, "\\StringFileInfo\\%04x%04x\\%s", languageCodePage.languageId(), languageCodePage.codePage(), string);
    }

    public @Nullable String queryValue(String string, LanguageCodePage languageCodePage) {
        QueryResult queryResult = Version.query(this.pBlock, VersionInfo.getStringFileInfoPath(string, languageCodePage));
        if (queryResult == null) {
            return null;
        }
        return MemoryUtil.memUTF16((long)queryResult.address());
    }

    private static @Nullable LanguageCodePage findEnglishTranslationEntry(QueryResult queryResult) {
        LanguageCodePage languageCodePage = null;
        for (int i = 0; i < queryResult.length(); i += 4) {
            languageCodePage = LanguageCodePage.decode(queryResult.address() + (long)i);
            if (languageCodePage.codePage() != 1200) continue;
            if (languageCodePage.languageId() != 1033) continue;
            return languageCodePage;
        }
        return languageCodePage;
    }
}

