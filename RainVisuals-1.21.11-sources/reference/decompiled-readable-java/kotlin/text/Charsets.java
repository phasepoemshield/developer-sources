/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0011\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0006\u00a8\u0006\u0016"}, d2={"Lkotlin/text/Charsets;", "", "<init>", "()V", "Ljava/nio/charset/Charset;", "ISO_8859_1", "Ljava/nio/charset/Charset;", "US_ASCII", "UTF_16", "UTF_16BE", "UTF_16LE", "UTF32", "()Ljava/nio/charset/Charset;", "UTF_32", "UTF32_BE", "UTF_32BE", "UTF32_LE", "UTF_32LE", "UTF_8", "utf_32", "utf_32be", "utf_32le", "kotlin-stdlib"})
public final class Charsets {
    @NotNull
    @JvmField
    public static final Charset UTF_16BE;
    @Nullable
    private static volatile Charset utf_32;
    @Nullable
    private static volatile Charset utf_32le;
    @NotNull
    @JvmField
    public static final Charset US_ASCII;
    @Nullable
    private static volatile Charset utf_32be;
    @JvmField
    @NotNull
    public static final Charset UTF_16;
    @NotNull
    @JvmField
    public static final Charset ISO_8859_1;
    @NotNull
    public static final Charsets INSTANCE;
    @NotNull
    @JvmField
    public static final Charset UTF_8;
    @JvmField
    @NotNull
    public static final Charset UTF_16LE;

    private Charsets() {
    }

    @JvmName(name="UTF32")
    @NotNull
    public final Charset UTF32() {
        Charset charset = utf_32;
        if (charset == null) {
            Charset charset2;
            Charsets charsets;
            Charsets $this$_get_UTF_32__u24lambda_u240 = charsets = this;
            boolean bl = false;
            Charset charset3 = Charset.forName("UTF-32");
            Intrinsics.checkNotNullExpressionValue(charset3, "forName(...)");
            utf_32 = charset2 = charset3;
            charset = charset2;
        }
        return charset;
    }

    @NotNull
    @JvmName(name="UTF32_LE")
    public final Charset UTF32_LE() {
        Charset charset = utf_32le;
        if (charset == null) {
            Charset charset2;
            Charsets charsets;
            Charsets $this$_get_UTF_32LE__u24lambda_u241 = charsets = this;
            boolean bl = false;
            Charset charset3 = Charset.forName("UTF-32LE");
            Intrinsics.checkNotNullExpressionValue(charset3, "forName(...)");
            utf_32le = charset2 = charset3;
            charset = charset2;
        }
        return charset;
    }

    static {
        INSTANCE = new Charsets();
        Charset charset = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charset, "forName(...)");
        UTF_8 = charset;
        Charset charset2 = Charset.forName("UTF-16");
        Intrinsics.checkNotNullExpressionValue(charset2, "forName(...)");
        UTF_16 = charset2;
        Charset charset3 = Charset.forName("UTF-16BE");
        Intrinsics.checkNotNullExpressionValue(charset3, "forName(...)");
        UTF_16BE = charset3;
        Charset charset4 = Charset.forName("UTF-16LE");
        Intrinsics.checkNotNullExpressionValue(charset4, "forName(...)");
        UTF_16LE = charset4;
        Charset charset5 = Charset.forName("US-ASCII");
        Intrinsics.checkNotNullExpressionValue(charset5, "forName(...)");
        US_ASCII = charset5;
        Charset charset6 = Charset.forName("ISO-8859-1");
        Intrinsics.checkNotNullExpressionValue(charset6, "forName(...)");
        ISO_8859_1 = charset6;
    }

    @JvmName(name="UTF32_BE")
    @NotNull
    public final Charset UTF32_BE() {
        Charset charset = utf_32be;
        if (charset == null) {
            Charset charset2;
            Charsets charsets;
            Charsets $this$_get_UTF_32BE__u24lambda_u242 = charsets = this;
            boolean bl = false;
            Charset charset3 = Charset.forName("UTF-32BE");
            Intrinsics.checkNotNullExpressionValue(charset3, "forName(...)");
            utf_32be = charset2 = charset3;
            charset = charset2;
        }
        return charset;
    }
}

