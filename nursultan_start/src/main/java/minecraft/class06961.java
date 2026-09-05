/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.net.URI;
import java.net.URISyntaxException;

public class class06961 {
    public static final Codec<URI> N = Codec.STRING.comapFlatMap(string -> {
        try {
            return DataResult.success((Object)new URI((String)string));
        }
        catch (URISyntaxException uRISyntaxException) {
            return DataResult.error(uRISyntaxException::getMessage);
        }
    }, URI::toString);

    public static URI N(String string) {
        return URI.create("#/components/schemas/" + string);
    }
}

