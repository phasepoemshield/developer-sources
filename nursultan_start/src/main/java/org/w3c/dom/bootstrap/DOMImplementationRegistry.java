/*
 * Decompiled with CFR 0.152.
 */
package org.w3c.dom.bootstrap;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.DOMImplementationList;
import org.w3c.dom.DOMImplementationSource;

public final class DOMImplementationRegistry {
    public static final String PROPERTY = "org.w3c.dom.DOMImplementationSourceList";
    private static final int DEFAULT_LINE_LENGTH = 80;
    private List<DOMImplementationSource> sources;
    private static final String FALLBACK_CLASS = "com.sun.org.apache.xerces.internal.dom.DOMXSImplementationSourceImpl";
    private static final String DEFAULT_PACKAGE = "com.sun.org.apache.xerces.internal.dom";

    private DOMImplementationRegistry(List<DOMImplementationSource> list) {
        this.sources = list;
    }

    public static DOMImplementationRegistry newInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException, ClassCastException {
        ArrayList<DOMImplementationSource> arrayList = new ArrayList<DOMImplementationSource>();
        ClassLoader classLoader = DOMImplementationRegistry.getClassLoader();
        String string = DOMImplementationRegistry.getSystemProperty(PROPERTY);
        if (string == null) {
            string = DOMImplementationRegistry.getServiceValue(classLoader);
        }
        if (string == null) {
            string = FALLBACK_CLASS;
        }
        if (string != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(string);
            while (stringTokenizer.hasMoreTokens()) {
                String string2 = stringTokenizer.nextToken();
                boolean bl = false;
                if (System.getSecurityManager() != null && string2 != null && string2.startsWith(DEFAULT_PACKAGE)) {
                    bl = true;
                }
                Class<?> clazz = null;
                clazz = classLoader != null && !bl ? classLoader.loadClass(string2) : Class.forName(string2);
                try {
                    DOMImplementationSource dOMImplementationSource = (DOMImplementationSource)clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
                    arrayList.add(dOMImplementationSource);
                }
                catch (NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
                    throw new InstantiationException(reflectiveOperationException.getMessage());
                }
            }
        }
        return new DOMImplementationRegistry(arrayList);
    }

    public DOMImplementation getDOMImplementation(String string) {
        int n = this.sources.size();
        Object var3_3 = null;
        for (int i = 0; i < n; ++i) {
            DOMImplementationSource dOMImplementationSource = this.sources.get(i);
            DOMImplementation dOMImplementation = dOMImplementationSource.getDOMImplementation(string);
            if (dOMImplementation == null) continue;
            return dOMImplementation;
        }
        return null;
    }

    public DOMImplementationList getDOMImplementationList(String string) {
        final ArrayList<DOMImplementation> arrayList = new ArrayList<DOMImplementation>();
        int n = this.sources.size();
        for (int i = 0; i < n; ++i) {
            DOMImplementationSource dOMImplementationSource = this.sources.get(i);
            DOMImplementationList dOMImplementationList = dOMImplementationSource.getDOMImplementationList(string);
            for (int j = 0; j < dOMImplementationList.getLength(); ++j) {
                DOMImplementation dOMImplementation = dOMImplementationList.item(j);
                arrayList.add(dOMImplementation);
            }
        }
        return new DOMImplementationList(){

            @Override
            public DOMImplementation item(int n) {
                if (n >= 0 && n < arrayList.size()) {
                    try {
                        return (DOMImplementation)arrayList.get(n);
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        return null;
                    }
                }
                return null;
            }

            @Override
            public int getLength() {
                return arrayList.size();
            }
        };
    }

    public void addSource(DOMImplementationSource dOMImplementationSource) {
        if (dOMImplementationSource == null) {
            throw new NullPointerException();
        }
        if (!this.sources.contains(dOMImplementationSource)) {
            this.sources.add(dOMImplementationSource);
        }
    }

    private static ClassLoader getClassLoader() {
        try {
            ClassLoader classLoader = DOMImplementationRegistry.getContextClassLoader();
            if (classLoader != null) {
                return classLoader;
            }
        }
        catch (Exception exception) {
            return DOMImplementationRegistry.class.getClassLoader();
        }
        return DOMImplementationRegistry.class.getClassLoader();
    }

    private static String getServiceValue(ClassLoader classLoader) {
        block5: {
            String string = "META-INF/services/org.w3c.dom.DOMImplementationSourceList";
            try {
                BufferedReader bufferedReader;
                InputStream inputStream = DOMImplementationRegistry.getResourceAsStream(classLoader, string);
                if (inputStream == null) break block5;
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"), 80);
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 80);
                }
                String string2 = bufferedReader.readLine();
                bufferedReader.close();
                if (string2 != null && string2.length() > 0) {
                    return string2;
                }
            }
            catch (Exception exception) {
                return null;
            }
        }
        return null;
    }

    private static ClassLoader getContextClassLoader() {
        return AccessController.doPrivileged(new PrivilegedAction<ClassLoader>(){

            @Override
            public ClassLoader run() {
                ClassLoader classLoader = null;
                try {
                    classLoader = Thread.currentThread().getContextClassLoader();
                }
                catch (SecurityException securityException) {
                    // empty catch block
                }
                return classLoader;
            }
        });
    }

    private static String getSystemProperty(final String string) {
        return AccessController.doPrivileged(new PrivilegedAction<String>(){

            @Override
            public String run() {
                return System.getProperty(string);
            }
        });
    }

    private static InputStream getResourceAsStream(final ClassLoader classLoader, final String string) {
        return AccessController.doPrivileged(new PrivilegedAction<InputStream>(){

            @Override
            public InputStream run() {
                InputStream inputStream = classLoader == null ? ClassLoader.getSystemResourceAsStream(string) : classLoader.getResourceAsStream(string);
                return inputStream;
            }
        });
    }
}

