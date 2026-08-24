/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0004\u0017\u0018\u0016\u0019B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001a"}, d2={"Lkotlin/text/HexFormat;", "", "", "upperCase", "Lkotlin/text/HexFormat$BytesHexFormat;", "bytes", "Lkotlin/text/HexFormat$NumberHexFormat;", "number", "<init>", "(ZLkotlin/text/HexFormat$BytesHexFormat;Lkotlin/text/HexFormat$NumberHexFormat;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/text/HexFormat$BytesHexFormat;", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat;", "Lkotlin/text/HexFormat$NumberHexFormat;", "getNumber", "()Lkotlin/text/HexFormat$NumberHexFormat;", "Z", "getUpperCase", "()Z", "Companion", "Builder", "BytesHexFormat", "NumberHexFormat", "kotlin-stdlib"})
@SinceKotlin(version="1.9")
@ExperimentalStdlibApi
public final class HexFormat {
    @NotNull
    private static final HexFormat UpperCase;
    @NotNull
    private final NumberHexFormat number;
    @NotNull
    public static final Companion Companion;
    @NotNull
    private static final HexFormat Default;
    private final boolean upperCase;
    @NotNull
    private final BytesHexFormat bytes;

    public final boolean getUpperCase() {
        return this.upperCase;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public String toString() {
        void var2_2;
        StringBuilder stringBuilder;
        StringBuilder $this$toString_u24lambda_u240 = stringBuilder = new StringBuilder();
        boolean bl = false;
        StringBuilder stringBuilder2 = $this$toString_u24lambda_u240.append("HexFormat(");
        Intrinsics.checkNotNullExpressionValue(stringBuilder2, "append(...)");
        Intrinsics.checkNotNullExpressionValue(stringBuilder2.append('\n'), "append(...)");
        StringBuilder stringBuilder3 = $this$toString_u24lambda_u240.append("    upperCase = ").append(this.upperCase);
        Intrinsics.checkNotNullExpressionValue(stringBuilder3, "append(...)");
        StringBuilder stringBuilder4 = stringBuilder3;
        StringBuilder stringBuilder5 = stringBuilder4.append(",");
        Intrinsics.checkNotNullExpressionValue(stringBuilder5, "append(...)");
        Intrinsics.checkNotNullExpressionValue(stringBuilder5.append('\n'), "append(...)");
        StringBuilder stringBuilder6 = $this$toString_u24lambda_u240.append("    bytes = BytesHexFormat(");
        Intrinsics.checkNotNullExpressionValue(stringBuilder6, "append(...)");
        Intrinsics.checkNotNullExpressionValue(stringBuilder6.append('\n'), "append(...)");
        Intrinsics.checkNotNullExpressionValue(this.bytes.appendOptionsTo$kotlin_stdlib($this$toString_u24lambda_u240, "        ").append('\n'), "append(...)");
        StringBuilder stringBuilder7 = $this$toString_u24lambda_u240.append("    ),");
        Intrinsics.checkNotNullExpressionValue(stringBuilder7, "append(...)");
        Intrinsics.checkNotNullExpressionValue(stringBuilder7.append('\n'), "append(...)");
        StringBuilder stringBuilder8 = $this$toString_u24lambda_u240.append("    number = NumberHexFormat(");
        Intrinsics.checkNotNullExpressionValue(stringBuilder8, "append(...)");
        Intrinsics.checkNotNullExpressionValue(stringBuilder8.append('\n'), "append(...)");
        Intrinsics.checkNotNullExpressionValue(this.number.appendOptionsTo$kotlin_stdlib($this$toString_u24lambda_u240, "        ").append('\n'), "append(...)");
        StringBuilder stringBuilder9 = $this$toString_u24lambda_u240.append("    )");
        Intrinsics.checkNotNullExpressionValue(stringBuilder9, "append(...)");
        Intrinsics.checkNotNullExpressionValue(stringBuilder9.append('\n'), "append(...)");
        var2_2.append(")");
        String string = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public HexFormat(boolean upperCase, @NotNull BytesHexFormat bytes, @NotNull NumberHexFormat number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.upperCase = upperCase;
        this.bytes = bytes;
        this.number = number;
    }

    static {
        Companion = new Companion(null);
        Default = new HexFormat(false, BytesHexFormat.Companion.getDefault$kotlin_stdlib(), NumberHexFormat.Companion.getDefault$kotlin_stdlib());
        UpperCase = new HexFormat(true, BytesHexFormat.Companion.getDefault$kotlin_stdlib(), NumberHexFormat.Companion.getDefault$kotlin_stdlib());
    }

    @NotNull
    public final BytesHexFormat getBytes() {
        return this.bytes;
    }

    @NotNull
    public final NumberHexFormat getNumber() {
        return this.number;
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2={"Lkotlin/text/HexFormat$Companion;", "", "<init>", "()V", "Lkotlin/text/HexFormat;", "Default", "Lkotlin/text/HexFormat;", "getDefault", "()Lkotlin/text/HexFormat;", "UpperCase", "getUpperCase", "kotlin-stdlib"})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final HexFormat getDefault() {
            return Default;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        @NotNull
        public final HexFormat getUpperCase() {
            return UpperCase;
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0001\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006J,\u0010\f\u001a\u00020\t2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\f\u0010\rJ,\u0010\u000f\u001a\u00020\t2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001f"}, d2={"Lkotlin/text/HexFormat$Builder;", "", "<init>", "()V", "Lkotlin/text/HexFormat;", "build", "()Lkotlin/text/HexFormat;", "Lkotlin/Function1;", "Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "bytes", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "number", "_bytes", "Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "_number", "Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "getNumber", "()Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "", "upperCase", "Z", "getUpperCase", "()Z", "setUpperCase", "(Z)V", "kotlin-stdlib"})
    public static final class Builder {
        @Nullable
        private NumberHexFormat.Builder _number;
        @Nullable
        private BytesHexFormat.Builder _bytes;
        private boolean upperCase = Companion.getDefault().getUpperCase();

        @InlineOnly
        private final void bytes(Function1<? super BytesHexFormat.Builder, Unit> builderAction) {
            Intrinsics.checkNotNullParameter(builderAction, "builderAction");
            builderAction.invoke(this.getBytes());
        }

        @NotNull
        public final BytesHexFormat.Builder getBytes() {
            if (this._bytes == null) {
                this._bytes = new BytesHexFormat.Builder();
            }
            BytesHexFormat.Builder builder = this._bytes;
            Intrinsics.checkNotNull(builder);
            return builder;
        }

        @NotNull
        @PublishedApi
        public final HexFormat build() {
            Object object;
            Object object2 = this._bytes;
            if (object2 == null || (object2 = ((BytesHexFormat.Builder)object2).build$kotlin_stdlib()) == null) {
                object2 = BytesHexFormat.Companion.getDefault$kotlin_stdlib();
            }
            if ((object = this._number) == null || (object = ((NumberHexFormat.Builder)object).build$kotlin_stdlib()) == null) {
                object = NumberHexFormat.Companion.getDefault$kotlin_stdlib();
            }
            return new HexFormat(this.upperCase, (BytesHexFormat)object2, (NumberHexFormat)object);
        }

        public final boolean getUpperCase() {
            return this.upperCase;
        }

        @PublishedApi
        public Builder() {
        }

        public final void setUpperCase(boolean bl) {
            this.upperCase = bl;
        }

        @InlineOnly
        private final void number(Function1<? super NumberHexFormat.Builder, Unit> builderAction) {
            Intrinsics.checkNotNullParameter(builderAction, "builderAction");
            builderAction.invoke(this.getNumber());
        }

        @NotNull
        public final NumberHexFormat.Builder getNumber() {
            if (this._number == null) {
                this._number = new NumberHexFormat.Builder();
            }
            NumberHexFormat.Builder builder = this._number;
            Intrinsics.checkNotNull(builder);
            return builder;
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00060\fj\u0002`\r2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000f\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001d\u0010\u0014\u00a8\u0006 "}, d2={"Lkotlin/text/HexFormat$BytesHexFormat;", "", "", "bytesPerLine", "bytesPerGroup", "", "groupSeparator", "byteSeparator", "bytePrefix", "byteSuffix", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "appendOptionsTo$kotlin_stdlib", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "appendOptionsTo", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getBytePrefix", "getByteSeparator", "getByteSuffix", "I", "getBytesPerGroup", "()I", "getBytesPerLine", "getGroupSeparator", "Companion", "Builder", "kotlin-stdlib"})
    public static final class BytesHexFormat {
        @NotNull
        private final String byteSuffix;
        @NotNull
        private final String groupSeparator;
        private final int bytesPerGroup;
        private final int bytesPerLine;
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final String bytePrefix;
        @NotNull
        private final String byteSeparator;
        @NotNull
        private static final BytesHexFormat Default = new BytesHexFormat(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /*
         * WARNING - void declaration
         */
        @NotNull
        public final StringBuilder appendOptionsTo$kotlin_stdlib(@NotNull StringBuilder sb, @NotNull String indent) {
            void var1_1;
            Intrinsics.checkNotNullParameter(sb, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            StringBuilder stringBuilder = sb.append(indent).append("bytesPerLine = ").append(this.bytesPerLine);
            Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
            StringBuilder stringBuilder2 = stringBuilder;
            StringBuilder stringBuilder3 = stringBuilder2.append(",");
            Intrinsics.checkNotNullExpressionValue(stringBuilder3, "append(...)");
            Intrinsics.checkNotNullExpressionValue(stringBuilder3.append('\n'), "append(...)");
            StringBuilder stringBuilder4 = sb.append(indent).append("bytesPerGroup = ").append(this.bytesPerGroup);
            Intrinsics.checkNotNullExpressionValue(stringBuilder4, "append(...)");
            stringBuilder2 = stringBuilder4;
            StringBuilder stringBuilder5 = stringBuilder2.append(",");
            Intrinsics.checkNotNullExpressionValue(stringBuilder5, "append(...)");
            Intrinsics.checkNotNullExpressionValue(stringBuilder5.append('\n'), "append(...)");
            StringBuilder stringBuilder6 = sb.append(indent).append("groupSeparator = \"").append(this.groupSeparator);
            Intrinsics.checkNotNullExpressionValue(stringBuilder6, "append(...)");
            stringBuilder2 = stringBuilder6;
            StringBuilder stringBuilder7 = stringBuilder2.append("\",");
            Intrinsics.checkNotNullExpressionValue(stringBuilder7, "append(...)");
            Intrinsics.checkNotNullExpressionValue(stringBuilder7.append('\n'), "append(...)");
            StringBuilder stringBuilder8 = sb.append(indent).append("byteSeparator = \"").append(this.byteSeparator);
            Intrinsics.checkNotNullExpressionValue(stringBuilder8, "append(...)");
            stringBuilder2 = stringBuilder8;
            StringBuilder stringBuilder9 = stringBuilder2.append("\",");
            Intrinsics.checkNotNullExpressionValue(stringBuilder9, "append(...)");
            Intrinsics.checkNotNullExpressionValue(stringBuilder9.append('\n'), "append(...)");
            StringBuilder stringBuilder10 = sb.append(indent).append("bytePrefix = \"").append(this.bytePrefix);
            Intrinsics.checkNotNullExpressionValue(stringBuilder10, "append(...)");
            stringBuilder2 = stringBuilder10;
            StringBuilder stringBuilder11 = stringBuilder2.append("\",");
            Intrinsics.checkNotNullExpressionValue(stringBuilder11, "append(...)");
            Intrinsics.checkNotNullExpressionValue(stringBuilder11.append('\n'), "append(...)");
            sb.append(indent).append("byteSuffix = \"").append(this.byteSuffix).append("\"");
            return var1_1;
        }

        public final int getBytesPerGroup() {
            return this.bytesPerGroup;
        }

        @NotNull
        public final String getByteSeparator() {
            return this.byteSeparator;
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder;
            StringBuilder $this$toString_u24lambda_u240 = stringBuilder = new StringBuilder();
            boolean bl = false;
            StringBuilder stringBuilder2 = $this$toString_u24lambda_u240.append("BytesHexFormat(");
            Intrinsics.checkNotNullExpressionValue(stringBuilder2, "append(...)");
            Intrinsics.checkNotNullExpressionValue(stringBuilder2.append('\n'), "append(...)");
            Intrinsics.checkNotNullExpressionValue(this.appendOptionsTo$kotlin_stdlib($this$toString_u24lambda_u240, "    ").append('\n'), "append(...)");
            $this$toString_u24lambda_u240.append(")");
            String string = stringBuilder.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        @NotNull
        public final String getBytePrefix() {
            return this.bytePrefix;
        }

        @NotNull
        public final String getGroupSeparator() {
            return this.groupSeparator;
        }

        @NotNull
        public final String getByteSuffix() {
            return this.byteSuffix;
        }

        public BytesHexFormat(int bytesPerLine, int bytesPerGroup, @NotNull String groupSeparator, @NotNull String byteSeparator, @NotNull String bytePrefix, @NotNull String byteSuffix) {
            Intrinsics.checkNotNullParameter(groupSeparator, "groupSeparator");
            Intrinsics.checkNotNullParameter(byteSeparator, "byteSeparator");
            Intrinsics.checkNotNullParameter(bytePrefix, "bytePrefix");
            Intrinsics.checkNotNullParameter(byteSuffix, "byteSuffix");
            this.bytesPerLine = bytesPerLine;
            this.bytesPerGroup = bytesPerGroup;
            this.groupSeparator = groupSeparator;
            this.byteSeparator = byteSeparator;
            this.bytePrefix = bytePrefix;
            this.byteSuffix = byteSuffix;
        }

        public final int getBytesPerLine() {
            return this.bytesPerLine;
        }

        @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\t\b\u0000\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\b\u0005\u0010\u0006R*\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR*\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR*\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010 \u001a\u00020\b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000f\u00a8\u0006#"}, d2={"Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "", "<init>", "()V", "Lkotlin/text/HexFormat$BytesHexFormat;", "build$kotlin_stdlib", "()Lkotlin/text/HexFormat$BytesHexFormat;", "build", "", "value", "bytePrefix", "Ljava/lang/String;", "getBytePrefix", "()Ljava/lang/String;", "setBytePrefix", "(Ljava/lang/String;)V", "byteSeparator", "getByteSeparator", "setByteSeparator", "byteSuffix", "getByteSuffix", "setByteSuffix", "", "bytesPerGroup", "I", "getBytesPerGroup", "()I", "setBytesPerGroup", "(I)V", "bytesPerLine", "getBytesPerLine", "setBytesPerLine", "groupSeparator", "getGroupSeparator", "setGroupSeparator", "kotlin-stdlib"})
        public static final class Builder {
            @NotNull
            private String byteSuffix;
            @NotNull
            private String groupSeparator;
            private int bytesPerLine = Companion.getDefault$kotlin_stdlib().getBytesPerLine();
            @NotNull
            private String bytePrefix;
            @NotNull
            private String byteSeparator;
            private int bytesPerGroup = Companion.getDefault$kotlin_stdlib().getBytesPerGroup();

            /*
             * WARNING - void declaration
             */
            public final void setByteSuffix(@NotNull String value) {
                void var1_1;
                block3: {
                    block2: {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (StringsKt.contains$default((CharSequence)value, '\n', false, 2, null)) break block2;
                        if (!StringsKt.contains$default((CharSequence)value, '\r', false, 2, null)) break block3;
                    }
                    throw new IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was " + value);
                }
                this.byteSuffix = var1_1;
            }

            /*
             * WARNING - void declaration
             */
            public final void setBytePrefix(@NotNull String value) {
                void var1_1;
                block3: {
                    block2: {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (StringsKt.contains$default((CharSequence)value, '\n', false, 2, null)) break block2;
                        if (!StringsKt.contains$default((CharSequence)value, '\r', false, 2, null)) break block3;
                    }
                    throw new IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was " + value);
                }
                this.bytePrefix = var1_1;
            }

            @NotNull
            public final String getByteSeparator() {
                return this.byteSeparator;
            }

            @NotNull
            public final String getGroupSeparator() {
                return this.groupSeparator;
            }

            @NotNull
            public final String getByteSuffix() {
                return this.byteSuffix;
            }

            public final void setBytesPerGroup(int value) {
                if (value <= 0) {
                    throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was " + value);
                }
                this.bytesPerGroup = value;
            }

            @NotNull
            public final BytesHexFormat build$kotlin_stdlib() {
                return new BytesHexFormat(this.bytesPerLine, this.bytesPerGroup, this.groupSeparator, this.byteSeparator, this.bytePrefix, this.byteSuffix);
            }

            public final void setBytesPerLine(int value) {
                if (value <= 0) {
                    throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was " + value);
                }
                this.bytesPerLine = value;
            }

            @NotNull
            public final String getBytePrefix() {
                return this.bytePrefix;
            }

            public final int getBytesPerGroup() {
                return this.bytesPerGroup;
            }

            public final void setGroupSeparator(@NotNull String string) {
                Intrinsics.checkNotNullParameter(string, "<set-?>");
                this.groupSeparator = string;
            }

            /*
             * WARNING - void declaration
             */
            public final void setByteSeparator(@NotNull String value) {
                void var1_1;
                block3: {
                    block2: {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (StringsKt.contains$default((CharSequence)value, '\n', false, 2, null)) break block2;
                        if (!StringsKt.contains$default((CharSequence)value, '\r', false, 2, null)) break block3;
                    }
                    throw new IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was " + value);
                }
                this.byteSeparator = var1_1;
            }

            public final int getBytesPerLine() {
                return this.bytesPerLine;
            }

            public Builder() {
                this.groupSeparator = Companion.getDefault$kotlin_stdlib().getGroupSeparator();
                this.byteSeparator = Companion.getDefault$kotlin_stdlib().getByteSeparator();
                this.bytePrefix = Companion.getDefault$kotlin_stdlib().getBytePrefix();
                this.byteSuffix = Companion.getDefault$kotlin_stdlib().getByteSuffix();
            }
        }

        @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2={"Lkotlin/text/HexFormat$BytesHexFormat$Companion;", "", "<init>", "()V", "Lkotlin/text/HexFormat$BytesHexFormat;", "Default", "Lkotlin/text/HexFormat$BytesHexFormat;", "getDefault$kotlin_stdlib", "()Lkotlin/text/HexFormat$BytesHexFormat;", "kotlin-stdlib"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
                this();
            }

            private Companion() {
            }

            @NotNull
            public final BytesHexFormat getDefault$kotlin_stdlib() {
                return Default;
            }
        }
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00060\tj\u0002`\n2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\f\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011\u00a8\u0006\u001a"}, d2={"Lkotlin/text/HexFormat$NumberHexFormat;", "", "", "prefix", "suffix", "", "removeLeadingZeros", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "appendOptionsTo$kotlin_stdlib", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "appendOptionsTo", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getPrefix", "Z", "getRemoveLeadingZeros", "()Z", "getSuffix", "Companion", "Builder", "kotlin-stdlib"})
    public static final class NumberHexFormat {
        @NotNull
        private final String prefix;
        @NotNull
        private final String suffix;
        private final boolean removeLeadingZeros;
        @NotNull
        private static final NumberHexFormat Default;
        @NotNull
        public static final Companion Companion;

        @NotNull
        public String toString() {
            StringBuilder stringBuilder;
            StringBuilder $this$toString_u24lambda_u240 = stringBuilder = new StringBuilder();
            boolean bl = false;
            StringBuilder stringBuilder2 = $this$toString_u24lambda_u240.append("NumberHexFormat(");
            Intrinsics.checkNotNullExpressionValue(stringBuilder2, "append(...)");
            Intrinsics.checkNotNullExpressionValue(stringBuilder2.append('\n'), "append(...)");
            Intrinsics.checkNotNullExpressionValue(this.appendOptionsTo$kotlin_stdlib($this$toString_u24lambda_u240, "    ").append('\n'), "append(...)");
            $this$toString_u24lambda_u240.append(")");
            String string = stringBuilder.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        @NotNull
        public final String getPrefix() {
            return this.prefix;
        }

        /*
         * WARNING - void declaration
         */
        @NotNull
        public final StringBuilder appendOptionsTo$kotlin_stdlib(@NotNull StringBuilder sb, @NotNull String indent) {
            void var1_1;
            Intrinsics.checkNotNullParameter(sb, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            StringBuilder stringBuilder = sb.append(indent).append("prefix = \"").append(this.prefix);
            Intrinsics.checkNotNullExpressionValue(stringBuilder, "append(...)");
            StringBuilder stringBuilder2 = stringBuilder;
            StringBuilder stringBuilder3 = stringBuilder2.append("\",");
            Intrinsics.checkNotNullExpressionValue(stringBuilder3, "append(...)");
            Intrinsics.checkNotNullExpressionValue(stringBuilder3.append('\n'), "append(...)");
            StringBuilder stringBuilder4 = sb.append(indent).append("suffix = \"").append(this.suffix);
            Intrinsics.checkNotNullExpressionValue(stringBuilder4, "append(...)");
            stringBuilder2 = stringBuilder4;
            StringBuilder stringBuilder5 = stringBuilder2.append("\",");
            Intrinsics.checkNotNullExpressionValue(stringBuilder5, "append(...)");
            Intrinsics.checkNotNullExpressionValue(stringBuilder5.append('\n'), "append(...)");
            sb.append(indent).append("removeLeadingZeros = ").append(this.removeLeadingZeros);
            return var1_1;
        }

        public NumberHexFormat(@NotNull String prefix, @NotNull String suffix, boolean removeLeadingZeros) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            this.prefix = prefix;
            this.suffix = suffix;
            this.removeLeadingZeros = removeLeadingZeros;
        }

        public final boolean getRemoveLeadingZeros() {
            return this.removeLeadingZeros;
        }

        static {
            Companion = new Companion(null);
            Default = new NumberHexFormat("", "", false);
        }

        @NotNull
        public final String getSuffix() {
            return this.suffix;
        }

        @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\t\b\u0000\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\b\u0005\u0010\u0006R*\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f\u00a8\u0006\u001a"}, d2={"Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "", "<init>", "()V", "Lkotlin/text/HexFormat$NumberHexFormat;", "build$kotlin_stdlib", "()Lkotlin/text/HexFormat$NumberHexFormat;", "build", "", "value", "prefix", "Ljava/lang/String;", "getPrefix", "()Ljava/lang/String;", "setPrefix", "(Ljava/lang/String;)V", "", "removeLeadingZeros", "Z", "getRemoveLeadingZeros", "()Z", "setRemoveLeadingZeros", "(Z)V", "suffix", "getSuffix", "setSuffix", "kotlin-stdlib"})
        public static final class Builder {
            @NotNull
            private String suffix;
            @NotNull
            private String prefix = Companion.getDefault$kotlin_stdlib().getPrefix();
            private boolean removeLeadingZeros;

            /*
             * WARNING - void declaration
             */
            public final void setSuffix(@NotNull String value) {
                void var1_1;
                block3: {
                    block2: {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (StringsKt.contains$default((CharSequence)value, '\n', false, 2, null)) break block2;
                        if (!StringsKt.contains$default((CharSequence)value, '\r', false, 2, null)) break block3;
                    }
                    throw new IllegalArgumentException("LF and CR characters are prohibited in suffix, but was " + value);
                }
                this.suffix = var1_1;
            }

            public Builder() {
                this.suffix = Companion.getDefault$kotlin_stdlib().getSuffix();
                this.removeLeadingZeros = Companion.getDefault$kotlin_stdlib().getRemoveLeadingZeros();
            }

            @NotNull
            public final String getSuffix() {
                return this.suffix;
            }

            @NotNull
            public final NumberHexFormat build$kotlin_stdlib() {
                return new NumberHexFormat(this.prefix, this.suffix, this.removeLeadingZeros);
            }

            @NotNull
            public final String getPrefix() {
                return this.prefix;
            }

            public final boolean getRemoveLeadingZeros() {
                return this.removeLeadingZeros;
            }

            /*
             * WARNING - void declaration
             */
            public final void setPrefix(@NotNull String value) {
                void var1_1;
                block3: {
                    block2: {
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (StringsKt.contains$default((CharSequence)value, '\n', false, 2, null)) break block2;
                        if (!StringsKt.contains$default((CharSequence)value, '\r', false, 2, null)) break block3;
                    }
                    throw new IllegalArgumentException("LF and CR characters are prohibited in prefix, but was " + value);
                }
                this.prefix = var1_1;
            }

            public final void setRemoveLeadingZeros(boolean bl) {
                this.removeLeadingZeros = bl;
            }
        }

        @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2={"Lkotlin/text/HexFormat$NumberHexFormat$Companion;", "", "<init>", "()V", "Lkotlin/text/HexFormat$NumberHexFormat;", "Default", "Lkotlin/text/HexFormat$NumberHexFormat;", "getDefault$kotlin_stdlib", "()Lkotlin/text/HexFormat$NumberHexFormat;", "kotlin-stdlib"})
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final NumberHexFormat getDefault$kotlin_stdlib() {
                return Default;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
                this();
            }
        }
    }
}

