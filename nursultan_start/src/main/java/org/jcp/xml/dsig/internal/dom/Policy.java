/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import java.net.URI;
import java.net.URISyntaxException;
import java.security.AccessController;
import java.security.Security;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class Policy {
    private static Set<URI> disallowedAlgs;
    private static int maxTrans;
    private static int maxRefs;
    private static Set<String> disallowedRefUriSchemes;
    private static Map<String, Integer> minKeyMap;
    private static boolean noDuplicateIds;
    private static boolean noRMLoops;

    private Policy() {
    }

    private static void initialize() {
        String[] stringArray;
        disallowedAlgs = new HashSet<URI>();
        maxTrans = Integer.MAX_VALUE;
        maxRefs = Integer.MAX_VALUE;
        disallowedRefUriSchemes = new HashSet<String>();
        minKeyMap = new HashMap<String, Integer>();
        noDuplicateIds = false;
        noRMLoops = false;
        String string = AccessController.doPrivileged(() -> Security.getProperty("jdk.xml.dsig.secureValidationPolicy"));
        if (string == null || string.isEmpty()) {
            return;
        }
        block18: for (String string2 : stringArray = string.split(",")) {
            String string3;
            String[] stringArray2 = string2.split("\\s");
            switch (string3 = stringArray2[0]) {
                case "disallowAlg": {
                    if (stringArray2.length != 2) {
                        Policy.error(string2);
                    }
                    disallowedAlgs.add(URI.create(stringArray2[1]));
                    continue block18;
                }
                case "maxTransforms": {
                    if (stringArray2.length != 2) {
                        Policy.error(string2);
                    }
                    maxTrans = Integer.parseUnsignedInt(stringArray2[1]);
                    continue block18;
                }
                case "maxReferences": {
                    if (stringArray2.length != 2) {
                        Policy.error(string2);
                    }
                    maxRefs = Integer.parseUnsignedInt(stringArray2[1]);
                    continue block18;
                }
                case "disallowReferenceUriSchemes": {
                    if (stringArray2.length == 1) {
                        Policy.error(string2);
                    }
                    for (int i = 1; i < stringArray2.length; ++i) {
                        String string4 = stringArray2[i];
                        disallowedRefUriSchemes.add(string4.toLowerCase(Locale.ROOT));
                    }
                    continue block18;
                }
                case "minKeySize": {
                    if (stringArray2.length != 3) {
                        Policy.error(string2);
                    }
                    minKeyMap.put(stringArray2[1], Integer.parseUnsignedInt(stringArray2[2]));
                    continue block18;
                }
                case "noDuplicateIds": {
                    if (stringArray2.length != 1) {
                        Policy.error(string2);
                    }
                    noDuplicateIds = true;
                    continue block18;
                }
                case "noRetrievalMethodLoops": {
                    if (stringArray2.length != 1) {
                        Policy.error(string2);
                    }
                    noRMLoops = true;
                    continue block18;
                }
                default: {
                    Policy.error(string2);
                }
            }
        }
    }

    public static boolean restrictAlg(String string) {
        try {
            URI uRI = new URI(string);
            return disallowedAlgs.contains(uRI);
        }
        catch (URISyntaxException uRISyntaxException) {
            return false;
        }
    }

    public static boolean restrictNumTransforms(int n) {
        return n > maxTrans;
    }

    public static boolean restrictNumReferences(int n) {
        return n > maxRefs;
    }

    public static boolean restrictReferenceUriScheme(String string) {
        String string2;
        if (string != null && (string2 = URI.create(string).getScheme()) != null) {
            return disallowedRefUriSchemes.contains(string2.toLowerCase(Locale.ROOT));
        }
        return false;
    }

    public static boolean restrictKey(String string, int n) {
        return n < minKeyMap.getOrDefault(string, 0);
    }

    public static boolean restrictDuplicateIds() {
        return noDuplicateIds;
    }

    public static boolean restrictRetrievalMethodLoops() {
        return noRMLoops;
    }

    public static Set<URI> disabledAlgs() {
        return Collections.unmodifiableSet(disallowedAlgs);
    }

    public static int maxTransforms() {
        return maxTrans;
    }

    public static int maxReferences() {
        return maxRefs;
    }

    public static Set<String> disabledReferenceUriSchemes() {
        return Collections.unmodifiableSet(disallowedRefUriSchemes);
    }

    public static int minKeySize(String string) {
        return minKeyMap.getOrDefault(string, 0);
    }

    private static void error(String string) {
        throw new IllegalArgumentException("Invalid jdk.xml.dsig.secureValidationPolicy entry: " + string);
    }

    static {
        try {
            Policy.initialize();
        }
        catch (Exception exception) {
            throw new SecurityException("Cannot initialize the secure validation policy", exception);
        }
    }
}

