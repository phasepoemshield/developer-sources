/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonSyntaxException
 *  io.netty.buffer.ByteBuf
 *  io.netty.handler.codec.DecoderException
 *  minecraft.class01663
 *  minecraft.class08314
 */
package minecraft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import minecraft.class01663;
import minecraft.class02362;
import minecraft.class08314;

class class02402
implements class02362<ByteBuf, JsonElement> {
    private static final Gson y = new GsonBuilder().disableHtmlEscaping().create();
    final /* synthetic */ int N;

    class02402(int n) {
        this.N = n;
    }

    public JsonElement decode(ByteBuf byteBuf) {
        String string = class01663.N((ByteBuf)byteBuf, (int)this.N);
        try {
            return class08314.N((String)string);
        }
        catch (JsonSyntaxException jsonSyntaxException) {
            throw new DecoderException("Failed to parse JSON", (Throwable)jsonSyntaxException);
        }
    }

    public void encode(ByteBuf byteBuf, JsonElement jsonElement) {
        String string = y.toJson(jsonElement);
        class01663.N((ByteBuf)byteBuf, (CharSequence)string, (int)this.N);
    }
}

