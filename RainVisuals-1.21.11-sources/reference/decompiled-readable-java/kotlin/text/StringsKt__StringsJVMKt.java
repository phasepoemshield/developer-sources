/*
 * Decompiled with CFR 0.152.
 */
package kotlin.text;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.internal.InlineOnly;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0011\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0007\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\n\u001a \u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\r\u001a(\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0011\u001a0\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0012\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0015\u001a(\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0016\u001a(\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\b\u0003\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0002*\u00020\u0002H\u0007\u00a2\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001a\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0007\u00a2\u0006\u0004\b\u001a\u0010\u001e\u001a\u001c\u0010 \u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\b \u0010!\u001a\u001c\u0010\"\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\b\"\u0010!\u001a$\u0010%\u001a\u00020\u000e*\u00020\u00022\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\b%\u0010&\u001a#\u0010*\u001a\u00020\u000e*\u00020\u00022\u0006\u0010'\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020(\u00a2\u0006\u0004\b*\u0010+\u001a\u0013\u0010,\u001a\u00020\u0002*\u00020\u0013H\u0007\u00a2\u0006\u0004\b,\u0010\u0015\u001a'\u0010,\u001a\u00020\u0002*\u00020\u00132\b\b\u0002\u0010-\u001a\u00020\u000e2\b\b\u0002\u0010$\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\b,\u0010\u0016\u001a \u0010/\u001a\u00020(*\u0004\u0018\u00010.2\b\u0010'\u001a\u0004\u0018\u00010.H\u0087\u0004\u00a2\u0006\u0004\b/\u00100\u001a'\u0010/\u001a\u00020(*\u0004\u0018\u00010.2\b\u0010'\u001a\u0004\u0018\u00010.2\u0006\u0010)\u001a\u00020(H\u0007\u00a2\u0006\u0004\b/\u00101\u001a\u001c\u0010/\u001a\u00020(*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b/\u00102\u001a\u001c\u0010/\u001a\u00020(*\u00020\u00022\u0006\u00103\u001a\u00020.H\u0087\b\u00a2\u0006\u0004\b/\u00104\u001a\u0013\u00105\u001a\u00020\u0002*\u00020\u0002H\u0007\u00a2\u0006\u0004\b5\u0010\u001b\u001a\u001b\u00105\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0007\u00a2\u0006\u0004\b5\u0010\u001e\u001a\u0013\u00106\u001a\u00020\u0002*\u00020\bH\u0007\u00a2\u0006\u0004\b6\u0010\n\u001a1\u00106\u001a\u00020\u0002*\u00020\b2\b\b\u0002\u0010-\u001a\u00020\u000e2\b\b\u0002\u0010$\u001a\u00020\u000e2\b\b\u0002\u00107\u001a\u00020(H\u0007\u00a2\u0006\u0004\b6\u00108\u001a\u0013\u00109\u001a\u00020\b*\u00020\u0002H\u0007\u00a2\u0006\u0004\b9\u0010:\u001a1\u00109\u001a\u00020\b*\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u000e2\b\b\u0002\u0010$\u001a\u00020\u000e2\b\b\u0002\u00107\u001a\u00020(H\u0007\u00a2\u0006\u0004\b9\u0010;\u001a#\u0010=\u001a\u00020(*\u00020\u00022\u0006\u0010<\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020(\u00a2\u0006\u0004\b=\u0010>\u001a'\u0010?\u001a\u00020(*\u0004\u0018\u00010\u00022\b\u0010'\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010)\u001a\u00020(\u00a2\u0006\u0004\b?\u0010>\u001a6\u0010C\u001a\u00020\u0002*\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0016\u0010B\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010A0@\"\u0004\u0018\u00010AH\u0087\b\u00a2\u0006\u0004\bC\u0010D\u001a,\u0010C\u001a\u00020\u0002*\u00020\u00022\u0016\u0010B\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010A0@\"\u0004\u0018\u00010AH\u0087\b\u00a2\u0006\u0004\bC\u0010E\u001a>\u0010C\u001a\u00020\u0002*\u00020F2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010C\u001a\u00020\u00022\u0016\u0010B\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010A0@\"\u0004\u0018\u00010AH\u0087\b\u00a2\u0006\u0004\bC\u0010G\u001a4\u0010C\u001a\u00020\u0002*\u00020F2\u0006\u0010C\u001a\u00020\u00022\u0016\u0010B\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010A0@\"\u0004\u0018\u00010AH\u0087\b\u00a2\u0006\u0004\bC\u0010H\u001a\u0014\u0010I\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u00a2\u0006\u0004\bI\u0010\u001b\u001a\u0011\u0010J\u001a\u00020(*\u00020.\u00a2\u0006\u0004\bJ\u0010K\u001a\u0014\u0010L\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u00a2\u0006\u0004\bL\u0010\u001b\u001a\u001c\u0010L\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0087\b\u00a2\u0006\u0004\bL\u0010\u001e\u001a$\u0010P\u001a\u00020\u000e*\u00020\u00022\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020\u000eH\u0081\b\u00a2\u0006\u0004\bP\u0010Q\u001a$\u0010P\u001a\u00020\u000e*\u00020\u00022\u0006\u0010R\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u000eH\u0081\b\u00a2\u0006\u0004\bP\u0010S\u001a$\u0010T\u001a\u00020\u000e*\u00020\u00022\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020\u000eH\u0081\b\u00a2\u0006\u0004\bT\u0010Q\u001a$\u0010T\u001a\u00020\u000e*\u00020\u00022\u0006\u0010R\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u000eH\u0081\b\u00a2\u0006\u0004\bT\u0010S\u001a$\u0010V\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010U\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\bV\u0010&\u001a;\u0010Y\u001a\u00020(*\u00020.2\u0006\u0010W\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020.2\u0006\u0010X\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020(\u00a2\u0006\u0004\bY\u0010Z\u001a;\u0010Y\u001a\u00020(*\u00020\u00022\u0006\u0010W\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010X\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020(\u00a2\u0006\u0004\bY\u0010[\u001a\u0019\u0010]\u001a\u00020\u0002*\u00020.2\u0006\u0010\\\u001a\u00020\u000e\u00a2\u0006\u0004\b]\u0010^\u001a+\u0010a\u001a\u00020\u0002*\u00020\u00022\u0006\u0010_\u001a\u00020M2\u0006\u0010`\u001a\u00020M2\b\b\u0002\u0010)\u001a\u00020(\u00a2\u0006\u0004\ba\u0010b\u001a+\u0010a\u001a\u00020\u0002*\u00020\u00022\u0006\u0010c\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020(\u00a2\u0006\u0004\ba\u0010e\u001a+\u0010f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010_\u001a\u00020M2\u0006\u0010`\u001a\u00020M2\b\b\u0002\u0010)\u001a\u00020(\u00a2\u0006\u0004\bf\u0010b\u001a+\u0010f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010c\u001a\u00020\u00022\u0006\u0010d\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020(\u00a2\u0006\u0004\bf\u0010e\u001a)\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00020j*\u00020.2\u0006\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020\u000e\u00a2\u0006\u0004\bk\u0010l\u001a#\u0010n\u001a\u00020(*\u00020\u00022\u0006\u0010m\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020(\u00a2\u0006\u0004\bn\u0010>\u001a+\u0010n\u001a\u00020(*\u00020\u00022\u0006\u0010m\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020(\u00a2\u0006\u0004\bn\u0010o\u001a\u001c\u0010p\u001a\u00020\u0002*\u00020\u00022\u0006\u0010-\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\bp\u0010q\u001a$\u0010p\u001a\u00020\u0002*\u00020\u00022\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\bp\u0010r\u001a\u001e\u0010s\u001a\u00020\b*\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0087\b\u00a2\u0006\u0004\bs\u0010t\u001a\u0014\u0010u\u001a\u00020\u0013*\u00020\u0002H\u0087\b\u00a2\u0006\u0004\bu\u0010v\u001a:\u0010u\u001a\u00020\u0013*\u00020\u00022\u0006\u0010w\u001a\u00020\u00132\b\b\u0002\u0010x\u001a\u00020\u000e2\b\b\u0002\u0010-\u001a\u00020\u000e2\b\b\u0002\u0010$\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\bu\u0010y\u001a'\u0010u\u001a\u00020\u0013*\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u000e2\b\b\u0002\u0010$\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\bu\u0010z\u001a\u0014\u0010{\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b{\u0010\u001b\u001a\u001c\u0010{\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0087\b\u00a2\u0006\u0004\b{\u0010\u001e\u001a\u001e\u0010}\u001a\u00020g*\u00020\u00022\b\b\u0002\u0010|\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\b}\u0010~\u001a\u0014\u0010\u007f\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u00a2\u0006\u0004\b\u007f\u0010\u001b\u001a\u001c\u0010\u007f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0087\b\u00a2\u0006\u0004\b\u007f\u0010\u001e\u001a\u0016\u0010\u0080\u0001\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u00a2\u0006\u0005\b\u0080\u0001\u0010\u001b\u001a\u001e\u0010\u0080\u0001\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0087\b\u00a2\u0006\u0005\b\u0080\u0001\u0010\u001e\"*\u0010\u0085\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00020\u0081\u0001j\t\u0012\u0004\u0012\u00020\u0002`\u0082\u0001*\u00020F8F\u00a2\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\u00a8\u0006\u0086\u0001"}, d2={"Ljava/lang/StringBuffer;", "stringBuffer", "", "String", "(Ljava/lang/StringBuffer;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "stringBuilder", "(Ljava/lang/StringBuilder;)Ljava/lang/String;", "", "bytes", "([B)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "([BLjava/nio/charset/Charset;)Ljava/lang/String;", "", "offset", "length", "([BII)Ljava/lang/String;", "([BIILjava/nio/charset/Charset;)Ljava/lang/String;", "", "chars", "([C)Ljava/lang/String;", "([CII)Ljava/lang/String;", "", "codePoints", "([III)Ljava/lang/String;", "capitalize", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Locale;", "locale", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "index", "codePointAt", "(Ljava/lang/String;I)I", "codePointBefore", "beginIndex", "endIndex", "codePointCount", "(Ljava/lang/String;II)I", "other", "", "ignoreCase", "compareTo", "(Ljava/lang/String;Ljava/lang/String;Z)I", "concatToString", "startIndex", "", "contentEquals", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "(Ljava/lang/String;Ljava/lang/StringBuffer;)Z", "charSequence", "(Ljava/lang/String;Ljava/lang/CharSequence;)Z", "decapitalize", "decodeToString", "throwOnInvalidSequence", "([BIIZ)Ljava/lang/String;", "encodeToByteArray", "(Ljava/lang/String;)[B", "(Ljava/lang/String;IIZ)[B", "suffix", "endsWith", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "equals", "", "", "args", "format", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lkotlin/String$Companion;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "intern", "isBlank", "(Ljava/lang/CharSequence;)Z", "lowercase", "", "ch", "fromIndex", "nativeIndexOf", "(Ljava/lang/String;CI)I", "str", "(Ljava/lang/String;Ljava/lang/String;I)I", "nativeLastIndexOf", "codePointOffset", "offsetByCodePoints", "thisOffset", "otherOffset", "regionMatches", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "(Ljava/lang/String;ILjava/lang/String;IIZ)Z", "n", "repeat", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "oldChar", "newChar", "replace", "(Ljava/lang/String;CCZ)Ljava/lang/String;", "oldValue", "newValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "replaceFirst", "Ljava/util/regex/Pattern;", "regex", "limit", "", "split", "(Ljava/lang/CharSequence;Ljava/util/regex/Pattern;I)Ljava/util/List;", "prefix", "startsWith", "(Ljava/lang/String;Ljava/lang/String;IZ)Z", "substring", "(Ljava/lang/String;I)Ljava/lang/String;", "(Ljava/lang/String;II)Ljava/lang/String;", "toByteArray", "(Ljava/lang/String;Ljava/nio/charset/Charset;)[B", "toCharArray", "(Ljava/lang/String;)[C", "destination", "destinationOffset", "(Ljava/lang/String;[CIII)[C", "(Ljava/lang/String;II)[C", "toLowerCase", "flags", "toPattern", "(Ljava/lang/String;I)Ljava/util/regex/Pattern;", "toUpperCase", "uppercase", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "getCASE_INSENSITIVE_ORDER", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER", "kotlin-stdlib"}, xs="kotlin/text/StringsKt")
class StringsKt__StringsJVMKt
extends StringsKt__StringNumberConversionsKt {
    @InlineOnly
    private static final int nativeLastIndexOf(String $this$nativeLastIndexOf, char ch, int fromIndex) {
        Intrinsics.checkNotNullParameter($this$nativeLastIndexOf, "<this>");
        return $this$nativeLastIndexOf.lastIndexOf(ch, fromIndex);
    }

    @InlineOnly
    private static final boolean contentEquals(String $this$contentEquals, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter($this$contentEquals, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        return $this$contentEquals.contentEquals(charSequence);
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    private static final String lowercase(String $this$lowercase) {
        Intrinsics.checkNotNullParameter($this$lowercase, "<this>");
        String string = $this$lowercase.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        return string;
    }

    public static final boolean regionMatches(@NotNull String $this$regionMatches, int thisOffset, @NotNull String other, int otherOffset, int length, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$regionMatches, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !ignoreCase ? $this$regionMatches.regionMatches(thisOffset, other, otherOffset, length) : $this$regionMatches.regionMatches(ignoreCase, thisOffset, other, otherOffset, length);
    }

    public static final int compareTo(@NotNull String $this$compareTo, @NotNull String other, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$compareTo, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (ignoreCase) {
            return $this$compareTo.compareToIgnoreCase(other);
        }
        return $this$compareTo.compareTo(other);
    }

    public static /* synthetic */ boolean startsWith$default(String string, String string2, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return StringsKt.startsWith(string, string2, bl);
    }

    @InlineOnly
    private static final String format(StringCompanionObject $this$format, String format, Object ... args2) {
        Intrinsics.checkNotNullParameter($this$format, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args2, "args");
        String string = String.format(format, Arrays.copyOf(args2, args2.length));
        Intrinsics.checkNotNullExpressionValue(string, "format(...)");
        return string;
    }

    @InlineOnly
    private static final String substring(String $this$substring, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$substring, "<this>");
        String string = $this$substring.substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
        return string;
    }

    @InlineOnly
    private static final Pattern toPattern(String $this$toPattern, int flags) {
        Intrinsics.checkNotNullParameter($this$toPattern, "<this>");
        Pattern pattern = Pattern.compile($this$toPattern, flags);
        Intrinsics.checkNotNullExpressionValue(pattern, "compile(...)");
        return pattern;
    }

    @InlineOnly
    private static final int nativeLastIndexOf(String $this$nativeLastIndexOf, String str, int fromIndex) {
        Intrinsics.checkNotNullParameter($this$nativeLastIndexOf, "<this>");
        Intrinsics.checkNotNullParameter(str, "str");
        return $this$nativeLastIndexOf.lastIndexOf(str, fromIndex);
    }

    @InlineOnly
    private static final char[] toCharArray(String $this$toCharArray) {
        Intrinsics.checkNotNullParameter($this$toCharArray, "<this>");
        char[] cArray = $this$toCharArray.toCharArray();
        Intrinsics.checkNotNullExpressionValue(cArray, "toCharArray(...)");
        return cArray;
    }

    @NotNull
    public static final String replaceFirst(@NotNull String $this$replaceFirst, char oldChar, char newChar, boolean ignoreCase) {
        String string;
        Intrinsics.checkNotNullParameter($this$replaceFirst, "<this>");
        int index = StringsKt.indexOf$default((CharSequence)$this$replaceFirst, oldChar, 0, ignoreCase, 2, null);
        if (index < 0) {
            string = $this$replaceFirst;
        } else {
            String string2 = $this$replaceFirst;
            int n = index + 1;
            CharSequence charSequence = String.valueOf(newChar);
            string = ((Object)StringsKt.replaceRange((CharSequence)string2, index, n, charSequence)).toString();
        }
        return string;
    }

    @InlineOnly
    private static final int offsetByCodePoints(String $this$offsetByCodePoints, int index, int codePointOffset) {
        Intrinsics.checkNotNullParameter($this$offsetByCodePoints, "<this>");
        return $this$offsetByCodePoints.offsetByCodePoints(index, codePointOffset);
    }

    /*
     * Enabled aggressive block sorting
     */
    @DeprecatedSinceKotlin(warningSince="1.5")
    @Deprecated(message="Use replaceFirstChar instead.", replaceWith=@ReplaceWith(expression="replaceFirstChar { it.lowercase(locale) }", imports={}))
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.4")
    @LowPriorityInOverloadResolution
    @NotNull
    public static final String decapitalize(@NotNull String $this$decapitalize, @NotNull Locale locale) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter($this$decapitalize, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        boolean bl = ((CharSequence)$this$decapitalize).length() > 0;
        if (bl) {
            if (!Character.isLowerCase($this$decapitalize.charAt(0))) {
                StringBuilder stringBuilder = new StringBuilder();
                String string3 = $this$decapitalize;
                int n = 0;
                int n2 = 1;
                String string4 = string3.substring(n, n2);
                Intrinsics.checkNotNullExpressionValue(string4, "substring(...)");
                string3 = string4;
                Intrinsics.checkNotNull(string3, "null cannot be cast to non-null type java.lang.String");
                String string5 = string3.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(string5, "toLowerCase(...)");
                StringBuilder stringBuilder2 = stringBuilder.append(string5);
                string3 = $this$decapitalize;
                n = 1;
                String string6 = string3.substring(n);
                Intrinsics.checkNotNullExpressionValue(string6, "substring(...)");
                string2 = stringBuilder2.append(string6).toString();
                return string2;
            }
        }
        string2 = string;
        return string2;
    }

    @InlineOnly
    private static final String String(byte[] bytes, int offset, int length, Charset charset) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bytes, offset, length, charset);
    }

    @SinceKotlin(version="1.5")
    public static final boolean contentEquals(@Nullable CharSequence $this$contentEquals, @Nullable CharSequence other, boolean ignoreCase) {
        return ignoreCase ? StringsKt.contentEqualsIgnoreCaseImpl($this$contentEquals, other) : StringsKt.contentEquals($this$contentEquals, other);
    }

    @NotNull
    public static final String replaceFirst(@NotNull String $this$replaceFirst, @NotNull String oldValue, @NotNull String newValue, boolean ignoreCase) {
        String string;
        Intrinsics.checkNotNullParameter($this$replaceFirst, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int index = StringsKt.indexOf$default((CharSequence)$this$replaceFirst, oldValue, 0, ignoreCase, 2, null);
        if (index < 0) {
            string = $this$replaceFirst;
        } else {
            String string2 = $this$replaceFirst;
            int n = index + oldValue.length();
            string = ((Object)StringsKt.replaceRange((CharSequence)string2, index, n, (CharSequence)newValue)).toString();
        }
        return string;
    }

    @SinceKotlin(version="1.4")
    @InlineOnly
    private static final String format(StringCompanionObject $this$format, Locale locale, String format, Object ... args2) {
        Intrinsics.checkNotNullParameter($this$format, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args2, "args");
        String string = String.format(locale, format, Arrays.copyOf(args2, args2.length));
        Intrinsics.checkNotNullExpressionValue(string, "format(...)");
        return string;
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.4")
    @NotNull
    public static final String decodeToString(@NotNull byte[] $this$decodeToString) {
        Intrinsics.checkNotNullParameter($this$decodeToString, "<this>");
        return new String($this$decodeToString, Charsets.UTF_8);
    }

    public static /* synthetic */ char[] toCharArray$default(String string, int n, int n2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n = 0;
        }
        if ((n3 & 2) != 0) {
            n2 = string.length();
        }
        return StringsKt.toCharArray(string, n, n2);
    }

    @DeprecatedSinceKotlin(warningSince="1.5")
    @Deprecated(message="Use uppercase() instead.", replaceWith=@ReplaceWith(expression="uppercase(Locale.getDefault())", imports={"java.util.Locale"}))
    @InlineOnly
    private static final String toUpperCase(String $this$toUpperCase) {
        Intrinsics.checkNotNullParameter($this$toUpperCase, "<this>");
        String string = $this$toUpperCase.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(string, "toUpperCase(...)");
        return string;
    }

    static /* synthetic */ Pattern toPattern$default(String $this$toPattern_u24default, int flags, int n, Object object) {
        if ((n & 1) != 0) {
            flags = 0;
        }
        Intrinsics.checkNotNullParameter($this$toPattern_u24default, "<this>");
        Pattern pattern = Pattern.compile($this$toPattern_u24default, flags);
        Intrinsics.checkNotNullExpressionValue(pattern, "compile(...)");
        return pattern;
    }

    @SinceKotlin(version="1.4")
    @NotNull
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static final String concatToString(@NotNull char[] $this$concatToString) {
        Intrinsics.checkNotNullParameter($this$concatToString, "<this>");
        return new String($this$concatToString);
    }

    /*
     * WARNING - void declaration
     */
    public static final boolean regionMatches(@NotNull CharSequence $this$regionMatches, int thisOffset, @NotNull CharSequence other, int otherOffset, int length, boolean ignoreCase) {
        void var5_5;
        Intrinsics.checkNotNullParameter($this$regionMatches, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if ($this$regionMatches instanceof String) {
            if (other instanceof String) {
                return StringsKt.regionMatches((String)$this$regionMatches, thisOffset, (String)other, otherOffset, length, ignoreCase);
            }
        }
        return StringsKt.regionMatchesImpl($this$regionMatches, thisOffset, other, otherOffset, length, (boolean)var5_5);
    }

    public static /* synthetic */ int compareTo$default(String string, String string2, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return StringsKt.compareTo(string, string2, bl);
    }

    @Deprecated(message="Use lowercase() instead.", replaceWith=@ReplaceWith(expression="lowercase(Locale.getDefault())", imports={"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince="1.5")
    @InlineOnly
    private static final String toLowerCase(String $this$toLowerCase) {
        Intrinsics.checkNotNullParameter($this$toLowerCase, "<this>");
        String string = $this$toLowerCase.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        return string;
    }

    @NotNull
    @SinceKotlin(version="1.4")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    public static final char[] toCharArray(@NotNull String $this$toCharArray, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$toCharArray, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$toCharArray.length());
        String string = $this$toCharArray;
        char[] cArray = new char[endIndex - startIndex];
        int n = 0;
        string.getChars(startIndex, endIndex, cArray, n);
        return cArray;
    }

    @NotNull
    public static final String replace(@NotNull String $this$replace, @NotNull String oldValue, @NotNull String newValue, boolean ignoreCase) {
        String string;
        Intrinsics.checkNotNullParameter($this$replace, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        String $this$replace_u24lambda_u242 = string = $this$replace;
        boolean bl = false;
        int occurrenceIndex = StringsKt.indexOf((CharSequence)$this$replace_u24lambda_u242, oldValue, 0, ignoreCase);
        if (occurrenceIndex < 0) {
            return $this$replace_u24lambda_u242;
        }
        int oldValueLength = oldValue.length();
        int searchStep = RangesKt.coerceAtLeast(oldValueLength, 1);
        int newLengthHint = $this$replace_u24lambda_u242.length() - oldValueLength + newValue.length();
        if (newLengthHint < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder stringBuilder = new StringBuilder(newLengthHint);
        int i = 0;
        do {
            stringBuilder.append($this$replace_u24lambda_u242, i, occurrenceIndex).append(newValue);
            i = occurrenceIndex + oldValueLength;
            if (occurrenceIndex >= $this$replace_u24lambda_u242.length()) break;
        } while ((occurrenceIndex = StringsKt.indexOf((CharSequence)$this$replace_u24lambda_u242, oldValue, occurrenceIndex + searchStep, ignoreCase)) > 0);
        String string2 = stringBuilder.append($this$replace_u24lambda_u242, i, $this$replace_u24lambda_u242.length()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final String replace(@NotNull String $this$replace, char oldChar, char newChar, boolean ignoreCase) {
        StringBuilder stringBuilder;
        Intrinsics.checkNotNullParameter($this$replace, "<this>");
        if (!ignoreCase) {
            String string = $this$replace.replace(oldChar, newChar);
            Intrinsics.checkNotNullExpressionValue(string, "replace(...)");
            return string;
        }
        int n = $this$replace.length();
        StringBuilder $this$replace_u24lambda_u241 = stringBuilder = new StringBuilder(n);
        boolean bl = false;
        CharSequence $this$forEach$iv = $this$replace;
        boolean $i$f$forEach = false;
        for (int i = 0; i < $this$forEach$iv.length(); ++i) {
            void var12_12;
            char element$iv;
            char c = element$iv = $this$forEach$iv.charAt(i);
            boolean bl2 = false;
            $this$replace_u24lambda_u241.append(CharsKt.equals(c, oldChar, ignoreCase) ? newChar : var12_12);
        }
        String string = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @InlineOnly
    @SinceKotlin(version="1.4")
    private static final String format(String $this$format, Locale locale, Object ... args2) {
        Intrinsics.checkNotNullParameter($this$format, "<this>");
        Intrinsics.checkNotNullParameter(args2, "args");
        String string = String.format(locale, $this$format, Arrays.copyOf(args2, args2.length));
        Intrinsics.checkNotNullExpressionValue(string, "format(...)");
        return string;
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.4")
    @NotNull
    public static final String concatToString(@NotNull char[] $this$concatToString, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$concatToString, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$concatToString.length);
        return new String($this$concatToString, startIndex, endIndex - startIndex);
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ char[] toCharArray$default(String $this$toCharArray_u24default, char[] destination, int destinationOffset, int startIndex, int endIndex, int n, Object object) {
        void var1_1;
        void var2_2;
        if ((n & 2) != 0) {
            destinationOffset = 0;
        }
        if ((n & 4) != 0) {
            startIndex = 0;
        }
        if ((n & 8) != 0) {
            endIndex = $this$toCharArray_u24default.length();
        }
        Intrinsics.checkNotNullParameter($this$toCharArray_u24default, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        $this$toCharArray_u24default.getChars(startIndex, endIndex, destination, (int)var2_2);
        return var1_1;
    }

    public static /* synthetic */ boolean regionMatches$default(String string, int n, String string2, int n2, int n3, boolean bl, int n4, Object object) {
        if ((n4 & 0x10) != 0) {
            bl = false;
        }
        return StringsKt.regionMatches(string, n, string2, n2, n3, bl);
    }

    @InlineOnly
    private static final String String(char[] chars, int offset, int length) {
        Intrinsics.checkNotNullParameter(chars, "chars");
        return new String(chars, offset, length);
    }

    public static /* synthetic */ String concatToString$default(char[] cArray, int n, int n2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n = 0;
        }
        if ((n3 & 2) != 0) {
            n2 = cArray.length;
        }
        return StringsKt.concatToString(cArray, n, n2);
    }

    @InlineOnly
    private static final String intern(String $this$intern) {
        Intrinsics.checkNotNullParameter($this$intern, "<this>");
        String string = $this$intern.intern();
        Intrinsics.checkNotNullExpressionValue(string, "intern(...)");
        return string;
    }

    public static /* synthetic */ boolean endsWith$default(String string, String string2, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return StringsKt.endsWith(string, string2, bl);
    }

    public static /* synthetic */ String replaceFirst$default(String string, char c, char c2, boolean bl, int n, Object object) {
        if ((n & 4) != 0) {
            bl = false;
        }
        return StringsKt.replaceFirst(string, c, c2, bl);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, Pattern pattern, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 0;
        }
        return StringsKt.split(charSequence, pattern, n);
    }

    @InlineOnly
    private static final String String(byte[] bytes, int offset, int length) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new String(bytes, offset, length, Charsets.UTF_8);
    }

    @NotNull
    public static final List<String> split(@NotNull CharSequence $this$split, @NotNull Pattern regex, int limit) {
        Intrinsics.checkNotNullParameter($this$split, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        StringsKt.requireNonNegativeLimit(limit);
        String[] stringArray = regex.split($this$split, limit == 0 ? -1 : limit);
        Intrinsics.checkNotNullExpressionValue(stringArray, "split(...)");
        return ArraysKt.asList((Object[])stringArray);
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    private static final String lowercase(String $this$lowercase, Locale locale) {
        Intrinsics.checkNotNullParameter($this$lowercase, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String string = $this$lowercase.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        return string;
    }

    /*
     * WARNING - void declaration
     */
    public static final boolean startsWith(@NotNull String $this$startsWith, @NotNull String prefix, int startIndex, boolean ignoreCase) {
        void var3_3;
        Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!ignoreCase) {
            return $this$startsWith.startsWith(prefix, startIndex);
        }
        return StringsKt.regionMatches($this$startsWith, startIndex, prefix, 0, prefix.length(), (boolean)var3_3);
    }

    public static /* synthetic */ String replace$default(String string, char c, char c2, boolean bl, int n, Object object) {
        if ((n & 4) != 0) {
            bl = false;
        }
        return StringsKt.replace(string, c, c2, bl);
    }

    public static /* synthetic */ boolean equals$default(String string, String string2, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return StringsKt.equals(string, string2, bl);
    }

    static /* synthetic */ byte[] toByteArray$default(String $this$toByteArray_u24default, Charset charset, int n, Object object) {
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$toByteArray_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] byArray = $this$toByteArray_u24default.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
        return byArray;
    }

    public static /* synthetic */ String decodeToString$default(byte[] byArray, int n, int n2, boolean bl, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n = 0;
        }
        if ((n3 & 2) != 0) {
            n2 = byArray.length;
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return StringsKt.decodeToString(byArray, n, n2, bl);
    }

    @DeprecatedSinceKotlin(warningSince="1.5")
    @Deprecated(message="Use lowercase() instead.", replaceWith=@ReplaceWith(expression="lowercase(locale)", imports={}))
    @InlineOnly
    private static final String toLowerCase(String $this$toLowerCase, Locale locale) {
        Intrinsics.checkNotNullParameter($this$toLowerCase, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String string = $this$toLowerCase.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        return string;
    }

    public static final boolean endsWith(@NotNull String $this$endsWith, @NotNull String suffix, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$endsWith, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!ignoreCase) {
            return $this$endsWith.endsWith(suffix);
        }
        return StringsKt.regionMatches($this$endsWith, $this$endsWith.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    /*
     * WARNING - void declaration
     */
    public static final boolean equals(@Nullable String $this$equals, @Nullable String other, boolean ignoreCase) {
        void var1_1;
        if ($this$equals == null) {
            return other == null;
        }
        return !ignoreCase ? $this$equals.equals(other) : $this$equals.equalsIgnoreCase((String)var1_1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean isBlank(@NotNull CharSequence $this$isBlank) {
        int it;
        Intrinsics.checkNotNullParameter($this$isBlank, "<this>");
        if ($this$isBlank.length() == 0) return true;
        Iterable $this$all$iv = StringsKt.getIndices($this$isBlank);
        boolean $i$f$all = false;
        if ($this$all$iv instanceof Collection && ((Collection)$this$all$iv).isEmpty()) {
            return true;
        }
        Iterator iterator2 = $this$all$iv.iterator();
        do {
            int element$iv;
            if (!iterator2.hasNext()) return true;
            it = element$iv = ((IntIterator)iterator2).nextInt();
            boolean bl = false;
        } while (CharsKt.isWhitespace($this$isBlank.charAt(it)));
        return false;
    }

    @InlineOnly
    private static final int codePointAt(String $this$codePointAt, int index) {
        Intrinsics.checkNotNullParameter($this$codePointAt, "<this>");
        return $this$codePointAt.codePointAt(index);
    }

    public static /* synthetic */ boolean regionMatches$default(CharSequence charSequence, int n, CharSequence charSequence2, int n2, int n3, boolean bl, int n4, Object object) {
        if ((n4 & 0x10) != 0) {
            bl = false;
        }
        return StringsKt.regionMatches(charSequence, n, charSequence2, n2, n3, bl);
    }

    @InlineOnly
    private static final String String(StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    @InlineOnly
    private static final String String(StringBuilder stringBuilder) {
        Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        return new String(stringBuilder);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.4")
    @NotNull
    public static final String decodeToString(@NotNull byte[] $this$decodeToString, int startIndex, int endIndex, boolean throwOnInvalidSequence) {
        Intrinsics.checkNotNullParameter($this$decodeToString, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$decodeToString.length);
        if (!throwOnInvalidSequence) {
            return new String($this$decodeToString, startIndex, endIndex - startIndex, Charsets.UTF_8);
        }
        CharsetDecoder decoder = Charsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
        String string = decoder.decode(ByteBuffer.wrap($this$decodeToString, startIndex, endIndex - startIndex)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final Comparator<String> getCASE_INSENSITIVE_ORDER(@NotNull StringCompanionObject $this$CASE_INSENSITIVE_ORDER) {
        Intrinsics.checkNotNullParameter($this$CASE_INSENSITIVE_ORDER, "<this>");
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    /*
     * Enabled aggressive block sorting
     */
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.4")
    @NotNull
    public static final byte[] encodeToByteArray(@NotNull String $this$encodeToByteArray, int startIndex, int endIndex, boolean throwOnInvalidSequence) {
        byte[] byArray;
        byte[] byArray2;
        Intrinsics.checkNotNullParameter($this$encodeToByteArray, "<this>");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$encodeToByteArray.length());
        if (!throwOnInvalidSequence) {
            String string = $this$encodeToByteArray.substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
            String string2 = string;
            Charset charset = Charsets.UTF_8;
            Intrinsics.checkNotNull(string2, "null cannot be cast to non-null type java.lang.String");
            byte[] byArray3 = string2.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(byArray3, "getBytes(...)");
            return byArray3;
        }
        CharsetEncoder encoder = Charsets.UTF_8.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
        ByteBuffer byteBuffer = encoder.encode(CharBuffer.wrap($this$encodeToByteArray, startIndex, endIndex));
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            int n = byteBuffer.remaining();
            byte[] byArray4 = byteBuffer.array();
            Intrinsics.checkNotNull(byArray4);
            if (n == byArray4.length) {
                byte[] byArray5 = byteBuffer.array();
                Intrinsics.checkNotNull(byArray5);
                byArray2 = byArray5;
                return byArray2;
            }
        }
        byte[] it = byArray = new byte[byteBuffer.remaining()];
        boolean bl = false;
        byteBuffer.get(it);
        byArray2 = byArray;
        return byArray2;
    }

    public static final boolean startsWith(@NotNull String $this$startsWith, @NotNull String prefix, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!ignoreCase) {
            return $this$startsWith.startsWith(prefix);
        }
        return StringsKt.regionMatches($this$startsWith, 0, prefix, 0, prefix.length(), ignoreCase);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Deprecated(message="Use replaceFirstChar instead.", replaceWith=@ReplaceWith(expression="replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports={"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince="1.5")
    @NotNull
    public static final String decapitalize(@NotNull String $this$decapitalize) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter($this$decapitalize, "<this>");
        boolean bl = ((CharSequence)$this$decapitalize).length() > 0;
        if (bl) {
            if (!Character.isLowerCase($this$decapitalize.charAt(0))) {
                StringBuilder stringBuilder = new StringBuilder();
                String string3 = $this$decapitalize;
                int n = 0;
                int n2 = 1;
                String string4 = string3.substring(n, n2);
                Intrinsics.checkNotNullExpressionValue(string4, "substring(...)");
                string3 = string4;
                Intrinsics.checkNotNull(string3, "null cannot be cast to non-null type java.lang.String");
                String string5 = string3.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(string5, "toLowerCase(...)");
                StringBuilder stringBuilder2 = stringBuilder.append(string5);
                string3 = $this$decapitalize;
                n = 1;
                String string6 = string3.substring(n);
                Intrinsics.checkNotNullExpressionValue(string6, "substring(...)");
                string2 = stringBuilder2.append(string6).toString();
                return string2;
            }
        }
        string2 = string;
        return string2;
    }

    @NotNull
    public static final String repeat(@NotNull CharSequence $this$repeat, int n) {
        String string;
        boolean bl;
        Intrinsics.checkNotNullParameter($this$repeat, "<this>");
        boolean bl2 = bl = n >= 0;
        if (!bl) {
            boolean bl3 = false;
            String string2 = "Count 'n' must be non-negative, but was " + n + '.';
            throw new IllegalArgumentException(string2.toString());
        }
        block0 : switch (n) {
            case 0: {
                string = "";
                break;
            }
            case 1: {
                string = ((Object)$this$repeat).toString();
                break;
            }
            default: {
                switch ($this$repeat.length()) {
                    case 0: {
                        string = "";
                        break block0;
                    }
                    case 1: {
                        char c;
                        char c2 = c = $this$repeat.charAt(0);
                        boolean bl4 = false;
                        int n2 = 0;
                        char[] cArray = new char[n];
                        while (n2 < n) {
                            int n3 = n2++;
                            cArray[n3] = c2;
                        }
                        char[] cArray2 = cArray;
                        string = new String(cArray2);
                        break block0;
                    }
                }
                StringBuilder sb = new StringBuilder(n * $this$repeat.length());
                IntIterator intIterator = new IntRange(1, n).iterator();
                while (intIterator.hasNext()) {
                    int i = intIterator.nextInt();
                    sb.append($this$repeat);
                }
                String string3 = sb.toString();
                Intrinsics.checkNotNull(string3);
                string = string3;
            }
        }
        return string;
    }

    @InlineOnly
    private static final boolean contentEquals(String $this$contentEquals, StringBuffer stringBuilder) {
        Intrinsics.checkNotNullParameter($this$contentEquals, "<this>");
        Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        return $this$contentEquals.contentEquals(stringBuilder);
    }

    @InlineOnly
    private static final int codePointCount(String $this$codePointCount, int beginIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$codePointCount, "<this>");
        return $this$codePointCount.codePointCount(beginIndex, endIndex);
    }

    @InlineOnly
    private static final String String(char[] chars) {
        Intrinsics.checkNotNullParameter(chars, "chars");
        return new String(chars);
    }

    public static /* synthetic */ boolean startsWith$default(String string, String string2, int n, boolean bl, int n2, Object object) {
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return StringsKt.startsWith(string, string2, n, bl);
    }

    @InlineOnly
    private static final String String(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new String(bytes, Charsets.UTF_8);
    }

    @InlineOnly
    private static final String format(String $this$format, Object ... args2) {
        Intrinsics.checkNotNullParameter($this$format, "<this>");
        Intrinsics.checkNotNullParameter(args2, "args");
        String string = String.format($this$format, Arrays.copyOf(args2, args2.length));
        Intrinsics.checkNotNullExpressionValue(string, "format(...)");
        return string;
    }

    @DeprecatedSinceKotlin(warningSince="1.5")
    @Deprecated(message="Use replaceFirstChar instead.", replaceWith=@ReplaceWith(expression="replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports={}))
    @SinceKotlin(version="1.4")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @NotNull
    @LowPriorityInOverloadResolution
    public static final String capitalize(@NotNull String $this$capitalize, @NotNull Locale locale) {
        String string;
        Intrinsics.checkNotNullParameter($this$capitalize, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        boolean bl = ((CharSequence)$this$capitalize).length() > 0;
        if (bl) {
            char firstChar = $this$capitalize.charAt(0);
            if (Character.isLowerCase(firstChar)) {
                int n;
                String string2;
                StringBuilder stringBuilder = new StringBuilder();
                StringBuilder $this$capitalize_u24lambda_u245 = stringBuilder;
                boolean bl2 = false;
                char titleChar = Character.toTitleCase(firstChar);
                if (titleChar != Character.toUpperCase(firstChar)) {
                    $this$capitalize_u24lambda_u245.append(titleChar);
                } else {
                    string2 = $this$capitalize;
                    n = 0;
                    int n2 = 1;
                    String string3 = string2.substring(n, n2);
                    Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
                    string2 = string3;
                    Intrinsics.checkNotNull(string2, "null cannot be cast to non-null type java.lang.String");
                    String string4 = string2.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(string4, "toUpperCase(...)");
                    $this$capitalize_u24lambda_u245.append(string4);
                }
                string2 = $this$capitalize;
                n = 1;
                String string5 = string2.substring(n);
                Intrinsics.checkNotNullExpressionValue(string5, "substring(...)");
                $this$capitalize_u24lambda_u245.append(string5);
                String string6 = stringBuilder.toString();
                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                return string6;
            }
        }
        return string;
    }

    @InlineOnly
    private static final String String(int[] codePoints, int offset, int length) {
        Intrinsics.checkNotNullParameter(codePoints, "codePoints");
        return new String(codePoints, offset, length);
    }

    @SinceKotlin(version="1.5")
    public static final boolean contentEquals(@Nullable CharSequence $this$contentEquals, @Nullable CharSequence other) {
        return $this$contentEquals instanceof String && other != null ? ((String)$this$contentEquals).contentEquals(other) : StringsKt.contentEqualsImpl($this$contentEquals, other);
    }

    @SinceKotlin(version="1.4")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @NotNull
    public static final byte[] encodeToByteArray(@NotNull String $this$encodeToByteArray) {
        Intrinsics.checkNotNullParameter($this$encodeToByteArray, "<this>");
        String string = $this$encodeToByteArray;
        byte[] byArray = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
        return byArray;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(String string, int n, int n2, boolean bl, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n = 0;
        }
        if ((n3 & 2) != 0) {
            n2 = string.length();
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return StringsKt.encodeToByteArray(string, n, n2, bl);
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @InlineOnly
    private static final String uppercase(String $this$uppercase) {
        Intrinsics.checkNotNullParameter($this$uppercase, "<this>");
        String string = $this$uppercase.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(string, "toUpperCase(...)");
        return string;
    }

    @InlineOnly
    private static final int codePointBefore(String $this$codePointBefore, int index) {
        Intrinsics.checkNotNullParameter($this$codePointBefore, "<this>");
        return $this$codePointBefore.codePointBefore(index);
    }

    @InlineOnly
    private static final byte[] toByteArray(String $this$toByteArray, Charset charset) {
        Intrinsics.checkNotNullParameter($this$toByteArray, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] byArray = $this$toByteArray.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
        return byArray;
    }

    @InlineOnly
    private static final String substring(String $this$substring, int startIndex) {
        Intrinsics.checkNotNullParameter($this$substring, "<this>");
        String string = $this$substring.substring(startIndex);
        Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
        return string;
    }

    @InlineOnly
    private static final int nativeIndexOf(String $this$nativeIndexOf, String str, int fromIndex) {
        Intrinsics.checkNotNullParameter($this$nativeIndexOf, "<this>");
        Intrinsics.checkNotNullParameter(str, "str");
        return $this$nativeIndexOf.indexOf(str, fromIndex);
    }

    @Deprecated(message="Use uppercase() instead.", replaceWith=@ReplaceWith(expression="uppercase(locale)", imports={}))
    @DeprecatedSinceKotlin(warningSince="1.5")
    @InlineOnly
    private static final String toUpperCase(String $this$toUpperCase, Locale locale) {
        Intrinsics.checkNotNullParameter($this$toUpperCase, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String string = $this$toUpperCase.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(string, "toUpperCase(...)");
        return string;
    }

    @InlineOnly
    private static final int nativeIndexOf(String $this$nativeIndexOf, char ch, int fromIndex) {
        Intrinsics.checkNotNullParameter($this$nativeIndexOf, "<this>");
        return $this$nativeIndexOf.indexOf(ch, fromIndex);
    }

    /*
     * WARNING - void declaration
     */
    @InlineOnly
    private static final char[] toCharArray(String $this$toCharArray, char[] destination, int destinationOffset, int startIndex, int endIndex) {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$toCharArray, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        $this$toCharArray.getChars(startIndex, endIndex, destination, destinationOffset);
        return var1_1;
    }

    @Deprecated(message="Use replaceFirstChar instead.", replaceWith=@ReplaceWith(expression="replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports={"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince="1.5")
    @NotNull
    public static final String capitalize(@NotNull String $this$capitalize) {
        Intrinsics.checkNotNullParameter($this$capitalize, "<this>");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        return StringsKt.capitalize($this$capitalize, locale);
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @InlineOnly
    private static final String uppercase(String $this$uppercase, Locale locale) {
        Intrinsics.checkNotNullParameter($this$uppercase, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String string = $this$uppercase.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(string, "toUpperCase(...)");
        return string;
    }

    public static /* synthetic */ String replace$default(String string, String string2, String string3, boolean bl, int n, Object object) {
        if ((n & 4) != 0) {
            bl = false;
        }
        return StringsKt.replace(string, string2, string3, bl);
    }

    public static /* synthetic */ String replaceFirst$default(String string, String string2, String string3, boolean bl, int n, Object object) {
        if ((n & 4) != 0) {
            bl = false;
        }
        return StringsKt.replaceFirst(string, string2, string3, bl);
    }

    @InlineOnly
    private static final String String(byte[] bytes, Charset charset) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bytes, charset);
    }
}

