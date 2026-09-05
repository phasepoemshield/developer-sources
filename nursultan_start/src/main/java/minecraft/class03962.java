/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.yggdrasil.ServicesKeySet
 *  com.mojang.authlib.yggdrasil.ServicesKeyType
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.logging.LogUtils;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Collection;
import minecraft.class03959;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public interface class03962 {
    public static final class03962 N = (class039592, byArray) -> true;
    public static final Logger y = LogUtils.getLogger();

    public boolean validate(class03959 var1, byte[] var2);

    private static boolean N(class03959 class039592, byte[] byArray, Signature signature) throws SignatureException {
        class039592.update(signature::update);
        return signature.verify(byArray);
    }

    public static class03962 N(PublicKey publicKey, String string) {
        return (class039592, byArray) -> {
            try {
                Signature signature = Signature.getInstance(string);
                signature.initVerify(publicKey);
                return class03962.N(class039592, byArray, signature);
            }
            catch (Exception exception) {
                y.error("Failed to verify signature", (Throwable)exception);
                return false;
            }
        };
    }

    public static @Nullable class03962 N(ServicesKeySet servicesKeySet, ServicesKeyType servicesKeyType) {
        Collection var2 = servicesKeySet.keys(servicesKeyType);
        if (var2.isEmpty()) {
            return null;
        }
        return (class039592, byArray) -> var2.stream().anyMatch(servicesKeyInfo -> {
            Signature signature = servicesKeyInfo.signature();
            try {
                return class03962.N(class039592, byArray, signature);
            }
            catch (SignatureException signatureException) {
                y.error("Failed to verify Services signature", (Throwable)signatureException);
                return false;
            }
        });
    }

    default public boolean N(byte[] byArray, byte[] byArray2) {
        return this.validate(class039342 -> class039342.update(byArray), byArray2);
    }
}

