/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01222
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04271
 *  minecraft.class05449
 */
package minecraft;

import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01222;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04271;
import minecraft.class05449;
import minecraft.class07845;

public class class07827
implements class00381<class07845> {
    public static final class02362<class00667, class07827> N = class00381.N(class07827::N, class07827::new);
    private final byte[] y;
    private final byte[] L;

    public class07827(SecretKey secretKey, PublicKey publicKey, byte[] byArray) throws class05449 {
        this.y = class01222.N((Key)publicKey, (byte[])secretKey.getEncoded());
        this.L = class01222.N((Key)publicKey, (byte[])byArray);
    }

    private class07827(class00667 class006672) {
        this.y = class006672.y();
        this.L = class006672.y();
    }

    public void method_65081(class07845 class078452) {
        class078452.N(this);
    }

    public SecretKey N(PrivateKey privateKey) throws class05449 {
        return class01222.N((PrivateKey)privateKey, (byte[])this.y);
    }

    private void N(class00667 class006672) {
        class006672.N(this.y);
        class006672.N(this.L);
    }

    public boolean N(byte[] byArray, PrivateKey privateKey) {
        try {
            return Arrays.equals(byArray, class01222.y((Key)privateKey, (byte[])this.L));
        }
        catch (class05449 class054492) {
            return false;
        }
    }

    public class02897<class07827> method_65080() {
        return class04271.B;
    }
}

