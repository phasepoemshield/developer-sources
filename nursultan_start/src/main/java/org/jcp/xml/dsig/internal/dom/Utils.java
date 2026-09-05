/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessController;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.xml.crypto.XMLCryptoContext;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public final class Utils {
    private static final Logger LOG = LoggerFactory.getLogger(Utils.class);
    private static final String SECVAL_PROP_NAME = "org.jcp.xml.dsig.secureValidation";
    private static final boolean SECVAL_SYSPROP_SET;
    private static final boolean SECVAL_SYSPROP;

    private Utils() {
    }

    public static byte[] readBytesFromStream(InputStream inputStream) throws IOException {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();){
            int n;
            byte[] byArray = new byte[1024];
            while ((n = inputStream.read(byArray)) != -1) {
                byteArrayOutputStream.write(byArray, 0, n);
                if (n >= 1024) continue;
                break;
            }
            byte[] byArray2 = byteArrayOutputStream.toByteArray();
            return byArray2;
        }
    }

    static Set<Node> toNodeSet(Iterator<?> iterator) {
        HashSet<Node> hashSet = new HashSet<Node>();
        while (iterator.hasNext()) {
            Node node = (Node)iterator.next();
            hashSet.add(node);
            if (node.getNodeType() != 1) continue;
            NamedNodeMap namedNodeMap = node.getAttributes();
            int n = namedNodeMap.getLength();
            for (int i = 0; i < n; ++i) {
                hashSet.add(namedNodeMap.item(i));
            }
        }
        return hashSet;
    }

    public static String parseIdFromSameDocumentURI(String string) {
        if (string.length() == 0) {
            return null;
        }
        String string2 = string.substring(1);
        if (string2.startsWith("xpointer(id(")) {
            int n = string2.indexOf(39);
            int n2 = string2.indexOf(39, n + 1);
            if (n >= 0 && n2 >= 0) {
                string2 = string2.substring(n + 1, n2);
            }
        }
        return string2;
    }

    public static boolean sameDocumentURI(String string) {
        return string != null && (string.length() == 0 || string.charAt(0) == '#');
    }

    private static String privilegedGetProperty(String string) {
        if (System.getSecurityManager() == null) {
            return System.getProperty(string);
        }
        return AccessController.doPrivileged(() -> System.getProperty(string));
    }

    static boolean secureValidation(XMLCryptoContext xMLCryptoContext) {
        if (SECVAL_SYSPROP_SET) {
            return SECVAL_SYSPROP;
        }
        if (xMLCryptoContext == null) {
            return false;
        }
        return Utils.getBoolean(xMLCryptoContext, SECVAL_PROP_NAME);
    }

    private static boolean getBoolean(XMLCryptoContext xMLCryptoContext, String string) {
        Boolean bl = (Boolean)xMLCryptoContext.getProperty(string);
        return bl != null && bl != false;
    }

    static {
        String string = Utils.privilegedGetProperty(SECVAL_PROP_NAME);
        SECVAL_SYSPROP_SET = string != null;
        SECVAL_SYSPROP = Boolean.parseBoolean(string);
        if (SECVAL_SYSPROP_SET && !SECVAL_SYSPROP) {
            LOG.warn("Secure validation mode disabled");
        }
    }
}

