/*
 * Decompiled with CFR 0.152.
 */
package org.xml.sax.helpers;

import com.sun.org.apache.xerces.internal.parsers.SAXParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.AccessController;
import java.util.Iterator;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import jdk.xml.internal.SecuritySupport;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.NewInstance;

@Deprecated(since="9")
public final class XMLReaderFactory {
    private static final String property = "org.xml.sax.driver";

    private XMLReaderFactory() {
    }

    public static XMLReader createXMLReader() throws SAXException {
        XMLReader xMLReader;
        String string = null;
        ClassLoader classLoader = SecuritySupport.getClassLoader();
        try {
            string = SecuritySupport.getSystemProperty(property);
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        if (string == null && (xMLReader = XMLReaderFactory.findServiceProvider(XMLReader.class, classLoader)) != null) {
            return xMLReader;
        }
        if (string == null) {
            string = XMLReaderFactory.jarLookup(classLoader);
        }
        if (string == null) {
            return new SAXParser();
        }
        return XMLReaderFactory.loadClass(classLoader, string);
    }

    public static XMLReader createXMLReader(String string) throws SAXException {
        return XMLReaderFactory.loadClass(SecuritySupport.getClassLoader(), string);
    }

    private static XMLReader loadClass(ClassLoader classLoader, String string) throws SAXException {
        try {
            return NewInstance.newInstance(XMLReader.class, classLoader, string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new SAXException("SAX2 driver class " + string + " not found", classNotFoundException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new SAXException("SAX2 driver class " + string + " found but cannot be loaded", illegalAccessException);
        }
        catch (InstantiationException instantiationException) {
            throw new SAXException("SAX2 driver class " + string + " loaded but cannot be instantiated (no empty public constructor?)", instantiationException);
        }
        catch (ClassCastException classCastException) {
            throw new SAXException("SAX2 driver class " + string + " does not implement XMLReader", classCastException);
        }
    }

    private static String jarLookup(ClassLoader classLoader) {
        ClassLoader classLoader2 = Objects.requireNonNull(classLoader);
        String string = null;
        String string2 = "META-INF/services/org.xml.sax.driver";
        try {
            InputStream inputStream = SecuritySupport.getResourceAsStream(classLoader2, string2);
            if (inputStream == null) {
                inputStream = SecuritySupport.getResourceAsStream(null, string2);
            }
            if (inputStream != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF8"));
                string = bufferedReader.readLine();
                inputStream.close();
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return string;
    }

    private static <T> T findServiceProvider(Class<T> clazz, ClassLoader classLoader) throws SAXException {
        ClassLoader classLoader2 = Objects.requireNonNull(classLoader);
        try {
            return (T)AccessController.doPrivileged(() -> {
                ServiceLoader serviceLoader = ServiceLoader.load(clazz, classLoader2);
                Iterator iterator = serviceLoader.iterator();
                if (iterator.hasNext()) {
                    return iterator.next();
                }
                return null;
            });
        }
        catch (ServiceConfigurationError serviceConfigurationError) {
            RuntimeException runtimeException = new RuntimeException("Provider for " + String.valueOf(clazz) + " cannot be created", serviceConfigurationError);
            throw new SAXException("Provider for " + String.valueOf(clazz) + " cannot be created", runtimeException);
        }
    }
}

