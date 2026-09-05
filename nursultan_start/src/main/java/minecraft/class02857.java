/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01079
 *  minecraft.class01894
 */
package minecraft;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;
import minecraft.class01079;
import minecraft.class01894;

@FunctionalInterface
public interface class02857 {
    public static final class02857 L = class018942 -> Optional.empty();

    default public class01079 L(class01894 class018942) throws FileNotFoundException {
        return this.method_14486(class018942).orElseThrow(() -> new FileNotFoundException(class018942.toString()));
    }

    default public BufferedReader i(class01894 class018942) throws IOException {
        return this.L(class018942).method_43039();
    }

    default public InputStream u(class01894 class018942) throws IOException {
        return this.L(class018942).method_14482();
    }

    public static class02857 N(Map<class01894, class01079> map) {
        return class018942 -> Optional.ofNullable((class01079)map.get(class018942));
    }

    public Optional<class01079> method_14486(class01894 var1);
}

