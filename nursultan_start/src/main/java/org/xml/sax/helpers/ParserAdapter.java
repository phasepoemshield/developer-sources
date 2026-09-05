/*
 * Decompiled with CFR 0.152.
 */
package org.xml.sax.helpers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import jdk.xml.internal.SecuritySupport;
import org.xml.sax.AttributeList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.DocumentHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.NamespaceSupport;
import org.xml.sax.helpers.ParserFactory;

public class ParserAdapter
implements XMLReader,
DocumentHandler {
    private static final String FEATURES = "http://xml.org/sax/features/";
    private static final String NAMESPACES = "http://xml.org/sax/features/namespaces";
    private static final String NAMESPACE_PREFIXES = "http://xml.org/sax/features/namespace-prefixes";
    private static final String XMLNS_URIs = "http://xml.org/sax/features/xmlns-uris";
    private NamespaceSupport nsSupport;
    private AttributeListAdapter attAdapter;
    private boolean parsing = false;
    private String[] nameParts = new String[3];
    private Parser parser = null;
    private AttributesImpl atts = null;
    private boolean namespaces = true;
    private boolean prefixes = false;
    private boolean uris = false;
    Locator locator;
    EntityResolver entityResolver = null;
    DTDHandler dtdHandler = null;
    ContentHandler contentHandler = null;
    ErrorHandler errorHandler = null;

    public ParserAdapter() throws SAXException {
        String string = SecuritySupport.getSystemProperty("org.xml.sax.parser");
        try {
            this.setup(ParserFactory.makeParser());
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new SAXException("Cannot find SAX1 driver class " + string, classNotFoundException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new SAXException("SAX1 driver class " + string + " found but cannot be loaded", illegalAccessException);
        }
        catch (InstantiationException instantiationException) {
            throw new SAXException("SAX1 driver class " + string + " loaded but cannot be instantiated", instantiationException);
        }
        catch (ClassCastException classCastException) {
            throw new SAXException("SAX1 driver class " + string + " does not implement org.xml.sax.Parser");
        }
        catch (NullPointerException nullPointerException) {
            throw new SAXException("System property org.xml.sax.parser not specified");
        }
    }

    public ParserAdapter(Parser parser) {
        this.setup(parser);
    }

    private void setup(Parser parser) {
        if (parser == null) {
            throw new NullPointerException("Parser argument must not be null");
        }
        this.parser = parser;
        this.atts = new AttributesImpl();
        this.nsSupport = new NamespaceSupport();
        this.attAdapter = new AttributeListAdapter();
    }

    @Override
    public void setFeature(String string, boolean bl) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (string.equals(NAMESPACES)) {
            this.checkNotParsing("feature", string);
            this.namespaces = bl;
            if (!this.namespaces && !this.prefixes) {
                this.prefixes = true;
            }
        } else if (string.equals(NAMESPACE_PREFIXES)) {
            this.checkNotParsing("feature", string);
            this.prefixes = bl;
            if (!this.prefixes && !this.namespaces) {
                this.namespaces = true;
            }
        } else if (string.equals(XMLNS_URIs)) {
            this.checkNotParsing("feature", string);
            this.uris = bl;
        } else {
            throw new SAXNotRecognizedException("Feature: " + string);
        }
    }

    @Override
    public boolean getFeature(String string) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (string.equals(NAMESPACES)) {
            return this.namespaces;
        }
        if (string.equals(NAMESPACE_PREFIXES)) {
            return this.prefixes;
        }
        if (string.equals(XMLNS_URIs)) {
            return this.uris;
        }
        throw new SAXNotRecognizedException("Feature: " + string);
    }

    @Override
    public void setProperty(String string, Object object) throws SAXNotRecognizedException, SAXNotSupportedException {
        throw new SAXNotRecognizedException("Property: " + string);
    }

    @Override
    public Object getProperty(String string) throws SAXNotRecognizedException, SAXNotSupportedException {
        throw new SAXNotRecognizedException("Property: " + string);
    }

    @Override
    public void setEntityResolver(EntityResolver entityResolver) {
        this.entityResolver = entityResolver;
    }

    @Override
    public EntityResolver getEntityResolver() {
        return this.entityResolver;
    }

    @Override
    public void setDTDHandler(DTDHandler dTDHandler) {
        this.dtdHandler = dTDHandler;
    }

    @Override
    public DTDHandler getDTDHandler() {
        return this.dtdHandler;
    }

    @Override
    public void setContentHandler(ContentHandler contentHandler) {
        this.contentHandler = contentHandler;
    }

    @Override
    public ContentHandler getContentHandler() {
        return this.contentHandler;
    }

    @Override
    public void setErrorHandler(ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    @Override
    public ErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    @Override
    public void parse(String string) throws IOException, SAXException {
        this.parse(new InputSource(string));
    }

    @Override
    public void parse(InputSource inputSource) throws IOException, SAXException {
        if (this.parsing) {
            throw new SAXException("Parser is already in use");
        }
        this.setupParser();
        this.parsing = true;
        try {
            this.parser.parse(inputSource);
        }
        finally {
            this.parsing = false;
        }
        this.parsing = false;
    }

    @Override
    public void setDocumentLocator(Locator locator) {
        this.locator = locator;
        if (this.contentHandler != null) {
            this.contentHandler.setDocumentLocator(locator);
        }
    }

    @Override
    public void startDocument() throws SAXException {
        if (this.contentHandler != null) {
            this.contentHandler.startDocument();
        }
    }

    @Override
    public void endDocument() throws SAXException {
        if (this.contentHandler != null) {
            this.contentHandler.endDocument();
        }
    }

    @Override
    public void startElement(String string, AttributeList attributeList) throws SAXException {
        Object object;
        String string2;
        String string3;
        int n;
        ArrayList<SAXException> arrayList = null;
        if (!this.namespaces) {
            if (this.contentHandler != null) {
                this.attAdapter.setAttributeList(attributeList);
                this.contentHandler.startElement("", "", string.intern(), this.attAdapter);
            }
            return;
        }
        this.nsSupport.pushContext();
        int n2 = attributeList.getLength();
        for (n = 0; n < n2; ++n) {
            string3 = attributeList.getName(n);
            if (!string3.startsWith("xmlns")) continue;
            int n3 = string3.indexOf(58);
            if (n3 == -1 && string3.length() == 5) {
                string2 = "";
            } else {
                if (n3 != 5) continue;
                string2 = string3.substring(n3 + 1);
            }
            object = attributeList.getValue(n);
            if (!this.nsSupport.declarePrefix(string2, (String)object)) {
                this.reportError("Illegal Namespace prefix: " + string2);
                continue;
            }
            if (this.contentHandler == null) continue;
            this.contentHandler.startPrefixMapping(string2, (String)object);
        }
        this.atts.clear();
        for (n = 0; n < n2; ++n) {
            int n4;
            string3 = attributeList.getName(n);
            string2 = attributeList.getType(n);
            String string4 = attributeList.getValue(n);
            if (string3.startsWith("xmlns") && (object = (n4 = string3.indexOf(58)) == -1 && string3.length() == 5 ? "" : (n4 != 5 ? null : string3.substring(6))) != null) {
                if (!this.prefixes) continue;
                if (this.uris) {
                    this.atts.addAttribute("http://www.w3.org/XML/1998/namespace", (String)object, string3.intern(), string2, string4);
                    continue;
                }
                this.atts.addAttribute("", "", string3.intern(), string2, string4);
                continue;
            }
            try {
                object = this.processName(string3, true, true);
                this.atts.addAttribute(object[0], object[1], object[2], string2, string4);
                continue;
            }
            catch (SAXException sAXException) {
                if (arrayList == null) {
                    arrayList = new ArrayList<SAXException>();
                }
                arrayList.add(sAXException);
                this.atts.addAttribute("", string3, string3, string2, string4);
            }
        }
        if (arrayList != null && this.errorHandler != null) {
            for (n = 0; n < arrayList.size(); ++n) {
                this.errorHandler.error((SAXParseException)arrayList.get(n));
            }
        }
        if (this.contentHandler != null) {
            String[] stringArray = this.processName(string, false, false);
            this.contentHandler.startElement(stringArray[0], stringArray[1], stringArray[2], this.atts);
        }
    }

    @Override
    public void endElement(String string) throws SAXException {
        if (!this.namespaces) {
            if (this.contentHandler != null) {
                this.contentHandler.endElement("", "", string.intern());
            }
            return;
        }
        String[] stringArray = this.processName(string, false, false);
        if (this.contentHandler != null) {
            this.contentHandler.endElement(stringArray[0], stringArray[1], stringArray[2]);
            Enumeration<String> enumeration = this.nsSupport.getDeclaredPrefixes();
            while (enumeration.hasMoreElements()) {
                String string2 = enumeration.nextElement();
                this.contentHandler.endPrefixMapping(string2);
            }
        }
        this.nsSupport.popContext();
    }

    @Override
    public void characters(char[] cArray, int n, int n2) throws SAXException {
        if (this.contentHandler != null) {
            this.contentHandler.characters(cArray, n, n2);
        }
    }

    @Override
    public void ignorableWhitespace(char[] cArray, int n, int n2) throws SAXException {
        if (this.contentHandler != null) {
            this.contentHandler.ignorableWhitespace(cArray, n, n2);
        }
    }

    @Override
    public void processingInstruction(String string, String string2) throws SAXException {
        if (this.contentHandler != null) {
            this.contentHandler.processingInstruction(string, string2);
        }
    }

    private void setupParser() {
        if (!this.prefixes && !this.namespaces) {
            throw new IllegalStateException();
        }
        this.nsSupport.reset();
        if (this.uris) {
            this.nsSupport.setNamespaceDeclUris(true);
        }
        if (this.entityResolver != null) {
            this.parser.setEntityResolver(this.entityResolver);
        }
        if (this.dtdHandler != null) {
            this.parser.setDTDHandler(this.dtdHandler);
        }
        if (this.errorHandler != null) {
            this.parser.setErrorHandler(this.errorHandler);
        }
        this.parser.setDocumentHandler(this);
        this.locator = null;
    }

    private String[] processName(String string, boolean bl, boolean bl2) throws SAXException {
        String[] stringArray = this.nsSupport.processName(string, this.nameParts, bl);
        if (stringArray == null) {
            if (bl2) {
                throw this.makeException("Undeclared prefix: " + string);
            }
            this.reportError("Undeclared prefix: " + string);
            stringArray = new String[3];
            stringArray[1] = "";
            stringArray[0] = "";
            stringArray[2] = string.intern();
        }
        return stringArray;
    }

    void reportError(String string) throws SAXException {
        if (this.errorHandler != null) {
            this.errorHandler.error(this.makeException(string));
        }
    }

    private SAXParseException makeException(String string) {
        if (this.locator != null) {
            return new SAXParseException(string, this.locator);
        }
        return new SAXParseException(string, null, null, -1, -1);
    }

    private void checkNotParsing(String string, String string2) throws SAXNotSupportedException {
        if (this.parsing) {
            throw new SAXNotSupportedException("Cannot change " + string + " " + string2 + " while parsing");
        }
    }

    final class AttributeListAdapter
    implements Attributes {
        private AttributeList qAtts;

        AttributeListAdapter() {
        }

        void setAttributeList(AttributeList attributeList) {
            this.qAtts = attributeList;
        }

        @Override
        public int getLength() {
            return this.qAtts.getLength();
        }

        @Override
        public String getURI(int n) {
            return "";
        }

        @Override
        public String getLocalName(int n) {
            return "";
        }

        @Override
        public String getQName(int n) {
            return this.qAtts.getName(n).intern();
        }

        @Override
        public String getType(int n) {
            return this.qAtts.getType(n).intern();
        }

        @Override
        public String getValue(int n) {
            return this.qAtts.getValue(n);
        }

        @Override
        public int getIndex(String string, String string2) {
            return -1;
        }

        @Override
        public int getIndex(String string) {
            int n = ParserAdapter.this.atts.getLength();
            for (int i = 0; i < n; ++i) {
                if (!this.qAtts.getName(i).equals(string)) continue;
                return i;
            }
            return -1;
        }

        @Override
        public String getType(String string, String string2) {
            return null;
        }

        @Override
        public String getType(String string) {
            return this.qAtts.getType(string).intern();
        }

        @Override
        public String getValue(String string, String string2) {
            return null;
        }

        @Override
        public String getValue(String string) {
            return this.qAtts.getValue(string);
        }
    }
}

