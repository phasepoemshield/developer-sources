/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.security.PrivateKey;
import java.security.Signature;
import minecraft.class03959;
import org.slf4j.Logger;

public interface class03954 {
    public static final Logger N = LogUtils.getLogger();

    public byte[] sign(class03959 var1);

    default public byte[] N(byte[] byArray) {
        return this.sign(class039342 -> class039342.update(byArray));
    }

    public static class03954 N(PrivateKey privateKey, String string) {
        return class039592 -> {
            try {
                Signature signature = Signature.getInstance(string);
                signature.initSign(privateKey);
                class039592.update(signature::update);
                return signature.sign();
            }
            catch (Exception exception) {
                throw new IllegalStateException("Failed to sign message", exception);
            }
        };
    }
}

