/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.external.com.google.gdata.util.common.base.Escaper
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.external.com.google.gdata.util.common.base.PercentEscaper
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.external.com.google.gdata.util.common.base.Escaper;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.external.com.google.gdata.util.common.base.PercentEscaper;

public abstract class UriEncoder {
    private static final CharsetDecoder UTF8Decoder = Charset.forName("UTF-8").newDecoder().onMalformedInput(CodingErrorAction.REPORT);
    private static final String SAFE_CHARS = "-_.!~*'()@:$&,;=[]/";
    private static final Escaper escaper = new PercentEscaper("-_.!~*'()@:$&,;=[]/", false);

    public static String decode(String string) {
        try {
            return URLDecoder.decode(string, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new YAMLException((Throwable)unsupportedEncodingException);
        }
    }

    public static String decode(ByteBuffer byteBuffer) throws CharacterCodingException {
        CharBuffer charBuffer = UTF8Decoder.decode(byteBuffer);
        return charBuffer.toString();
    }

    public static String encode(String string) {
        return escaper.escape(string);
    }
}

