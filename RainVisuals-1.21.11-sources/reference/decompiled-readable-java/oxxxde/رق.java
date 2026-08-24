/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ru.ocz.protection.annotation.Compile
 */
package oxxxde;

import java.net.URI;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.HexFormat;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062c\u0632;
import oxxxde.\u0631\u063a;
import ru.ocz.protection.annotation.Compile;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0004\b\f\u0010\u000bJ/\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0003\u00a2\u0006\u0004\b\n\u0010\u000fJ#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012\u00a2\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012\u00a2\u0006\u0004\b\u0018\u0010\u0016J-\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0015\u0010\u001dJ-\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u0017\u00a2\u0006\u0004\b\u0015\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010+\u001a\n **\u0004\u0018\u00010)0)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,\u00a8\u0006-"}, d2={"Loxxxde/\u0631\u0642;", "", "<init>", "()V", "Ljava/net/URI;", "uri", "", "method", "body", "Ljava/net/http/HttpRequest$Builder;", "signedBuilder", "(Ljava/net/URI;Ljava/lang/String;Ljava/lang/String;)Ljava/net/http/HttpRequest$Builder;", "cloudSignedBuilder", "", "cloudIdentity", "(Ljava/net/URI;Ljava/lang/String;Ljava/lang/String;Z)Ljava/net/http/HttpRequest$Builder;", "Ljava/net/http/HttpRequest;", "request", "Ljava/net/http/HttpResponse;", "response", "", "requireValidResponse", "(Ljava/net/http/HttpRequest;Ljava/net/http/HttpResponse;)V", "", "requireValidBinaryResponse", "", "statusCode", "Ljava/net/http/HttpHeaders;", "headers", "(Ljava/net/http/HttpRequest;ILjava/net/http/HttpHeaders;Ljava/lang/String;)V", "(Ljava/net/http/HttpRequest;ILjava/net/http/HttpHeaders;[B)V", "requestTarget", "(Ljava/net/URI;)Ljava/lang/String;", "payload", "hmac", "(Ljava/lang/String;)Ljava/lang/String;", "HMAC_ALGORITHM", "Ljava/lang/String;", "Ljava/security/SecureRandom;", "secureRandom", "Ljava/security/SecureRandom;", "Ljava/util/HexFormat;", "kotlin.jvm.PlatformType", "hexFormat", "Ljava/util/HexFormat;", "rain-visuals"})
public final class \u0631\u0642 {
    @NotNull
    private static final String HMAC_ALGORITHM = "HmacSHA256";
    @NotNull
    private static final SecureRandom secureRandom;
    @NotNull
    public static final \u0631\u0642 INSTANCE;
    private static final HexFormat hexFormat;

    /*
     * Unable to fully structure code
     */
    private final String requestTarget(URI uri) {
        var3_2 = uri.getRawPath();
        if (var3_2 == null) ** GOTO lbl-1000
        p0 = var5_3 = var3_2;
        $i$a$-takeIf-SocialRequestSigner$requestTarget$path$1 = false;
        var4_6 = ((CharSequence)p0).length() > 0 ? var5_3 : null;
        if (var4_6 != null) {
            v0 = var4_6;
        } else lbl-1000:
        // 2 sources

        {
            v0 = "/";
        }
        path = v0;
        var3_2 = uri.getRawQuery();
        if (var3_2 == null) ** GOTO lbl-1000
        it = var3_2;
        $i$a$-let-SocialRequestSigner$requestTarget$1 = false;
        var4_6 = path + "?" + (String)var6_4;
        if (var4_6 != null) {
            v1 = var4_6;
        } else lbl-1000:
        // 2 sources

        {
            v1 = var2_7;
        }
        return v1;
    }

    public final void requireValidBinaryResponse(@NotNull HttpRequest request, @NotNull HttpResponse<byte[]> response) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        int n = response.statusCode();
        HttpHeaders httpHeaders = response.headers();
        Intrinsics.checkNotNullExpressionValue(httpHeaders, "headers(...)");
        byte[] byArray = response.body();
        Intrinsics.checkNotNullExpressionValue(byArray, "body(...)");
        this.requireValidResponse(request, n, httpHeaders, byArray);
    }

    private static final SecurityException requireValidResponse$lambda$4() {
        return new SecurityException("Signed request does not contain a nonce");
    }

    public final void requireValidResponse(@NotNull HttpRequest request, int statusCode, @NotNull HttpHeaders headers, @NotNull String body) {
        Object object;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        String requestNonce = request.headers().firstValue("X-Rain-Nonce").orElseThrow(\u0631\u0642::requireValidResponse$lambda$0);
        String suppliedSignature = headers.firstValue("X-Rain-Response-Signature").orElseThrow(\u0631\u0642::requireValidResponse$lambda$1);
        URI uRI = request.uri();
        Intrinsics.checkNotNullExpressionValue(uRI, "uri(...)");
        String target = this.requestTarget(uRI);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        String string = body;
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset, "UTF_8");
        byte[] byArray = string.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
        String bodyHash = hexFormat.formatHex(messageDigest.digest(byArray));
        String[] stringArray = new String[4];
        stringArray[0] = String.valueOf(statusCode);
        stringArray[1] = target;
        stringArray[2] = requestNonce;
        stringArray[3] = bodyHash;
        String signaturePayload = CollectionsKt.joinToString$default(CollectionsKt.listOf(stringArray), "\n", null, null, 0, null, null, 62, null);
        String expectedSignature = this.hmac(signaturePayload);
        Object object2 = this;
        try {
            \u0631\u0642 $this$requireValidResponse_u24lambda_u242 = object2;
            boolean bl = false;
            object = Result.constructor-impl(hexFormat.parseHex(suppliedSignature));
        }
        catch (Throwable bl) {
            object = Result.constructor-impl(ResultKt.createFailure(bl));
        }
        object2 = object;
        byte[] suppliedBytes = (byte[])(Result.isFailure-impl(object2) ? null : object2);
        byte[] expectedBytes = hexFormat.parseHex(expectedSignature);
        if (!(suppliedBytes != null && suppliedBytes.length == expectedBytes.length && MessageDigest.isEqual(suppliedBytes, expectedBytes))) {
            boolean bl = false;
            String string2 = "Social API response signature is invalid";
            throw new IllegalArgumentException(string2.toString());
        }
    }

    @NotNull
    public final HttpRequest.Builder signedBuilder(@NotNull URI uri, @NotNull String method, @NotNull String body) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        return this.signedBuilder(uri, method, body, false);
    }

    private static final SecurityException requireValidResponse$lambda$1() {
        return new SecurityException("Social API response is not signed");
    }

    private static final SecurityException requireValidResponse$lambda$0() {
        return new SecurityException("Signed request does not contain a nonce");
    }

    public static /* synthetic */ HttpRequest.Builder signedBuilder$default(\u0631\u0642 \u0631\u06422, URI uRI, String string, String string2, int n, Object object) {
        if ((n & 4) != 0) {
            string2 = "";
        }
        return \u0631\u06422.signedBuilder(uRI, string, string2);
    }

    @Compile
    private final HttpRequest.Builder signedBuilder(URI uRI, String string, String string2, boolean bl) {
        long l = System.currentTimeMillis();
        String string3 = String.valueOf(l);
        byte[] byArray = new byte[16];
        secureRandom.nextBytes(byArray);
        String string4 = hexFormat.formatHex(byArray);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset, "UTF_8");
        byte[] byArray2 = string2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(byArray2, "getBytes(...)");
        String string5 = hexFormat.formatHex(messageDigest.digest(byArray2));
        String string6 = this.requestTarget(uRI);
        Object[] objectArray = new Object[5];
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string7 = string.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(string7, "toUpperCase(...)");
        objectArray[0] = string7;
        objectArray[1] = string6;
        objectArray[2] = string3;
        objectArray[3] = string4;
        objectArray[4] = string5;
        String string8 = CollectionsKt.joinToString$default(CollectionsKt.listOf(objectArray), "\n", null, null, 0, null, null, 62, null);
        String string9 = this.hmac(string8);
        HttpRequest.Builder builder = HttpRequest.newBuilder(uRI).header("X-Rain-Timestamp", string3).header("X-Rain-Nonce", string4).header("X-Rain-Signature", string9);
        if (bl) {
            String string10 = String.valueOf(\u0631\u063a.getUid());
            Intrinsics.checkNotNull(string10);
            String string11 = \u0631\u063a.getUsername();
            Intrinsics.checkNotNull(string11);
            builder.header("X-Rain-User-Uid", string10);
            builder.header("X-Rain-User-Name", string11);
            String string12 = \u062c\u0632.INSTANCE.publicKeyBase64();
            builder.header("X-Rain-Cloud-Public-Key", string12);
            String string13 = \u062c\u0632.INSTANCE.signBase64(\u0631\u0642.lamda$signedBuilder$1_3ec98000(string8, string10, string11));
            builder.header("X-Rain-Cloud-Signature", string13);
        }
        HttpRequest.Builder builder2 = builder;
        Intrinsics.checkNotNullExpressionValue(builder2, "also(...)");
        return builder2;
    }

    public final void requireValidResponse(@NotNull HttpRequest request, @NotNull HttpResponse<String> response) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        int n = response.statusCode();
        HttpHeaders httpHeaders = response.headers();
        Intrinsics.checkNotNullExpressionValue(httpHeaders, "headers(...)");
        String string = response.body();
        Intrinsics.checkNotNullExpressionValue(string, "body(...)");
        this.requireValidResponse(request, n, httpHeaders, string);
    }

    @NotNull
    public final HttpRequest.Builder cloudSignedBuilder(@NotNull URI uri, @NotNull String method, @NotNull String body) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(body, "body");
        return this.signedBuilder(uri, method, body, true);
    }

    public static /* synthetic */ HttpRequest.Builder cloudSignedBuilder$default(\u0631\u0642 \u0631\u06422, URI uRI, String string, String string2, int n, Object object) {
        if ((n & 4) != 0) {
            string2 = "";
        }
        return \u0631\u06422.cloudSignedBuilder(uRI, string, string2);
    }

    private static final SecurityException requireValidResponse$lambda$5() {
        return new SecurityException("Social API response is not signed");
    }

    private \u0631\u0642() {
    }

    private final String hmac(String payload) {
        Mac mac = Mac.getInstance(HMAC_ALGORITHM);
        String string = "/vgNOx5p0Ujq/7gsCYmXBgmSkxNUmoLq4UZ+ThDHfo6APaPAYmyLPWzcS7j0AEng";
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset, "UTF_8");
        byte[] byArray = string.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
        mac.init(new SecretKeySpec(byArray, HMAC_ALGORITHM));
        String string2 = payload;
        Charset charset2 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset2, "UTF_8");
        byte[] byArray2 = string2.getBytes(charset2);
        Intrinsics.checkNotNullExpressionValue(byArray2, "getBytes(...)");
        string = hexFormat.formatHex(mac.doFinal(byArray2));
        Intrinsics.checkNotNullExpressionValue(string, "formatHex(...)");
        return string;
    }

    static {
        INSTANCE = new \u0631\u0642();
        secureRandom = new SecureRandom();
        hexFormat = HexFormat.of();
    }

    public final void requireValidResponse(@NotNull HttpRequest request, int statusCode, @NotNull HttpHeaders headers, @NotNull byte[] body) {
        Object object;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        String requestNonce = request.headers().firstValue("X-Rain-Nonce").orElseThrow(\u0631\u0642::requireValidResponse$lambda$4);
        String suppliedSignature = headers.firstValue("X-Rain-Response-Signature").orElseThrow(\u0631\u0642::requireValidResponse$lambda$5);
        URI uRI = request.uri();
        Intrinsics.checkNotNullExpressionValue(uRI, "uri(...)");
        String target = this.requestTarget(uRI);
        String bodyHash = hexFormat.formatHex(MessageDigest.getInstance("SHA-256").digest(body));
        String[] stringArray = new String[4];
        stringArray[0] = String.valueOf(statusCode);
        stringArray[1] = target;
        stringArray[2] = requestNonce;
        stringArray[3] = bodyHash;
        String signaturePayload = CollectionsKt.joinToString$default(CollectionsKt.listOf(stringArray), "\n", null, null, 0, null, null, 62, null);
        String expectedSignature = this.hmac(signaturePayload);
        Object object2 = this;
        try {
            \u0631\u0642 $this$requireValidResponse_u24lambda_u246 = object2;
            boolean bl = false;
            object = Result.constructor-impl(hexFormat.parseHex(suppliedSignature));
        }
        catch (Throwable bl) {
            object = Result.constructor-impl(ResultKt.createFailure(bl));
        }
        object2 = object;
        byte[] suppliedBytes = (byte[])(Result.isFailure-impl(object2) ? null : object2);
        byte[] expectedBytes = hexFormat.parseHex(expectedSignature);
        if (!(suppliedBytes != null && suppliedBytes.length == expectedBytes.length && MessageDigest.isEqual(suppliedBytes, expectedBytes))) {
            boolean bl = false;
            String string = "Social API response signature is invalid";
            throw new IllegalArgumentException(string.toString());
        }
    }

    static /* synthetic */ String lamda$signedBuilder$1_3ec98000(String string, String string2, String string3) {
        return string + "\n" + string2 + "\n" + string3;
    }
}

