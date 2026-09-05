/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  io.netty.handler.ssl.SslContext
 *  io.netty.handler.ssl.SslContextBuilder
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;
import org.slf4j.Logger;

public class class00439 {
    private static final String N = "MINECRAFT_MANAGEMENT_TLS_KEYSTORE_PASSWORD";
    private static final String y = "management.tls.keystore.password";
    private static final Logger L = LogUtils.getLogger();

    private static SslContext N(File file, String string) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        try (Object object = new FileInputStream(file);){
            keyStore.load((InputStream)object, string.toCharArray());
        }
        object = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        ((KeyManagerFactory)object).init(keyStore, string.toCharArray());
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        return SslContextBuilder.forServer((KeyManagerFactory)object).trustManager(trustManagerFactory).build();
    }

    public static void N() {
        L.info("To use TLS for the management server, please follow these steps:");
        L.info("1. Set the server property 'management-server-tls-enabled' to 'true' to enable TLS");
        L.info("2. Create a keystore file of type PKCS12 containing your server certificate and private key");
        L.info("3. Set the server property 'management-server-tls-keystore' to the path of your keystore file");
        L.info("4. Set the keystore password via the environment variable 'MINECRAFT_MANAGEMENT_TLS_KEYSTORE_PASSWORD', or system property 'management.tls.keystore.password', or server property 'management-server-tls-keystore-password'");
        L.info("5. Restart the server to apply the changes.");
    }

    public static SslContext N(String string, String string2) throws Exception {
        if (string.isEmpty()) {
            throw new IllegalArgumentException("TLS is enabled but keystore is not configured");
        }
        File file = new File(string);
        if (!file.exists() || !file.isFile()) {
            throw new IllegalArgumentException("Supplied keystore is not a file or does not exist: '" + string + "'");
        }
        String string3 = class00439.N(string2);
        return class00439.N(file, string3);
    }

    private static String N(String string) {
        String string2 = System.getenv().get(N);
        if (string2 != null) {
            return string2;
        }
        String string3 = System.getProperty(y, null);
        if (string3 != null) {
            return string3;
        }
        return string;
    }
}

