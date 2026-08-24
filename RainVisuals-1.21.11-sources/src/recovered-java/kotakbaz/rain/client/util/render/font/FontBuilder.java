/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.font;

import com.google.gson.Gson;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import kotakbaz.rain.client.render.texture.texture.GLTexture;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.client.util.render.font.FontData;
import kotakbaz.rain.client.util.render.font.MsdfGlyph;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062a\u062e;
import oxxxde.\u062b\u064f;
import oxxxde.\u062c\u0634;
import oxxxde.\u0630\u0646;
import oxxxde.\u0632\u0622;
import oxxxde.\u0632\u062b;
import oxxxde.\u0632\u0644;
import oxxxde.\u0636\u0648;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0012\u00a8\u0006\u0015"}, d2={"Loxxxde/\u0638\u0633;", "", "<init>", "()V", "", "fontName", "find", "(Ljava/lang/String;)Lkotakbaz/rain/client/util/render/font/FontBuilder;", "Loxxxde/\u062c\u064b;", "build", "()Lkotakbaz/rain/client/util/render/font/Font;", "Loxxxde/\u0627\u062d;", "loadFontData", "()Lkotakbaz/rain/client/util/render/font/FontData;", "Loxxxde/\u0636;", "loadFontTexture", "()Lkotakbaz/rain/client/render/texture/texture/GLTexture;", "name", "Ljava/lang/String;", "dataPath", "atlasPath", "rain-visuals"})
public final class FontBuilder {
    @NotNull
    private String atlasPath = "";
    @NotNull
    private String dataPath = "";
    @NotNull
    private String name = "";

    @NotNull
    public final Font build() {
        FontData data = this.loadFontData();
        GLTexture texture = this.loadFontTexture();
        float atlasWidth = data.getAtlas().getWidth();
        float atlasHeight = data.getAtlas().getHeight();
        HashMap glyphs = new HashMap(data.getGlyphs().size());
        Iterable $this$forEach$iv = data.getGlyphs();
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            FontData.GlyphData glyph = (FontData.GlyphData)element$iv;
            boolean bl = false;
            ((Map)glyphs).put(glyph.getUnicode(), new MsdfGlyph(glyph, atlasWidth, atlasHeight));
        }
        HashMap<Object, Map> kernings = new HashMap<Object, Map>();
        Iterable $this$forEach$iv2 = data.getKernings();
        boolean $i$f$forEach2 = false;
        for (Object element$iv : $this$forEach$iv2) {
            Map map;
            \u062a\u062e kerning = (\u062a\u062e)element$iv;
            boolean bl = false;
            Intrinsics.checkNotNullExpressionValue(kernings.computeIfAbsent(kerning.getLeftChar(), arg_0 -> FontBuilder.build$lambda$1$1(FontBuilder::build$lambda$1$0, arg_0)), "computeIfAbsent(...)");
            map.put(kerning.getRightChar(), Float.valueOf(kerning.getAdvance()));
        }
        return new Font(this.name, texture, data.getAtlas(), data.getMetrics(), glyphs, (Map<Integer, ? extends Map<Integer, Float>>)kernings);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final GLTexture loadFontTexture() {
        InputStream inputStream = \u0632\u0644.fromAssets(this.atlasPath);
        if (inputStream == null) {
            throw new IllegalStateException(("Font atlas file not found: " + this.atlasPath).toString());
        }
        InputStream stream = inputStream;
        Closeable closeable = stream;
        Throwable throwable = null;
        try {
            InputStream it = (InputStream)closeable;
            boolean bl = false;
            \u0630\u0646 info = \u062b\u064f.INPUT_STREAM.load(it, \u0636\u0648.RGBA, \u0632\u0622.SMOOTH, \u062c\u0634.DEFAULT);
            GLTexture gLTexture = GLTexture.of("font_" + StringsKt.replace$default(this.name, '/', '_', false, 4, null), info);
            Intrinsics.checkNotNullExpressionValue(gLTexture, "of(...)");
            GLTexture gLTexture2 = gLTexture;
            return gLTexture2;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            CloseableKt.closeFinally(closeable, throwable);
        }
    }

    private static final Map build$lambda$1$0(Integer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new HashMap();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final FontData loadFontData() {
        InputStream inputStream = \u0632\u0644.fromAssets(this.dataPath);
        if (inputStream == null) {
            throw new IllegalStateException(("Font data file not found: " + this.dataPath).toString());
        }
        InputStream stream = inputStream;
        Closeable closeable = stream;
        Throwable throwable = null;
        try {
            FontData fontData;
            InputStream it = (InputStream)closeable;
            boolean bl = false;
            Closeable closeable2 = new InputStreamReader(it, StandardCharsets.UTF_8);
            Throwable throwable2 = null;
            try {
                InputStreamReader reader = (InputStreamReader)closeable2;
                boolean bl2 = false;
                FontData fontData2 = new Gson().fromJson((Reader)reader, FontData.class);
                if (fontData2 == null) {
                    throw new IllegalStateException(("Failed to parse font data: " + this.dataPath).toString());
                }
                fontData = fontData2;
            }
            catch (Throwable throwable3) {
                try {
                    try {
                        throwable2 = throwable3;
                        throw throwable3;
                    }
                    catch (Throwable throwable4) {
                        CloseableKt.closeFinally(closeable2, throwable2);
                        throw throwable4;
                    }
                }
                catch (Throwable throwable5) {
                    throwable = throwable5;
                    throw throwable5;
                }
            }
            CloseableKt.closeFinally(closeable2, throwable2);
            FontData fontData3 = fontData;
            return fontData3;
        }
        finally {
            CloseableKt.closeFinally(closeable, throwable);
        }
    }

    @NotNull
    public final FontBuilder find(@NotNull String fontName) {
        Intrinsics.checkNotNullParameter(fontName, "fontName");
        this.name = fontName;
        this.dataPath = "assets/" + \u0632\u062b.getCLIENT_ID() + "/fonts/" + fontName + ".json";
        this.atlasPath = "assets/" + \u0632\u062b.getCLIENT_ID() + "/fonts/" + fontName + ".png";
        return this;
    }

    private static final Map build$lambda$1$1(Function1 $tmp0, Object p0) {
        return (Map)$tmp0.invoke(p0);
    }
}

