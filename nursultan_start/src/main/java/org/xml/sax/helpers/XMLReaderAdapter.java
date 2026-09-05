/*
 * Decompiled with CFR 0.152.
 */
package org.xml.sax.helpers;

import java.io.IOException;
import java.util.Locale;
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
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class XMLReaderAdapter
implements Parser,
ContentHandler {
    XMLReader xmlReader;
    DocumentHandler documentHandler;
    AttributesAdapter qAtts;

    public XMLReaderAdapter() throws SAXException {
        this.setup(XMLReaderFactory.createXMLReader());
    }

    public XMLReaderAdapter(XMLReader xMLReader) {
        this.setup(xMLReader);
    }

    private void setup(XMLReader xMLReader) {
        if (xMLReader == null) {
            throw new NullPointerException("XMLReader must not be null");
        }
        this.xmlReader = xMLReader;
        this.qAtts = new AttributesAdapter(this);
    }

    @Override
    public void setLocale(Locale locale) throws SAXException {
        throw new SAXNotSupportedException("setLocale not supported");
    }

    @Override
    public void setEntityResolver(EntityResolver entityResolver) {
        this.xmlReader.setEntityResolver(entityResolver);
    }

    @Override
    public void setDTDHandler(DTDHandler dTDHandler) {
        this.xmlReader.setDTDHandler(dTDHandler);
    }

    @Override
    public void setDocumentHandler(DocumentHandler documentHandler) {
        this.documentHandler = documentHandler;
    }

    @Override
    public void setErrorHandler(ErrorHandler errorHandler) {
        this.xmlReader.setErrorHandler(errorHandler);
    }

    @Override
    public void parse(String string) throws IOException, SAXException {
        this.parse(new InputSource(string));
    }

    @Override
    public void parse(InputSource inputSource) throws IOException, SAXException {
        this.setupXMLReader();
        this.xmlReader.parse(inputSource);
    }

    private void setupXMLReader() throws SAXException {
        this.xmlReader.setFeature("http://xml.org/sax/features/namespace-prefixes", true);
        try {
            this.xmlReader.setFeature("http://xml.org/sax/features/namespaces", false);
        }
        catch (SAXException sAXException) {
            // empty catch block
        }
        this.xmlReader.setContentHandler(this);
    }

    @Override
    public void setDocumentLocator(Locator locator) {
        if (this.documentHandler != null) {
            this.documentHandler.setDocumentLocator(locator);
        }
    }

    @Override
    public void startDocument() throws SAXException {
        if (this.documentHandler != null) {
            this.documentHandler.startDocument();
        }
    }

    @Override
    public void endDocument() throws SAXException {
        if (this.documentHandler != null) {
            this.documentHandler.endDocument();
        }
    }

    @Override
    public void startPrefixMapping(String string, String string2) {
    }

    @Override
    public void endPrefixMapping(String string) {
    }

    @Override
    public void startElement(String string, String string2, String string3, Attributes attributes) throws SAXException {
        if (this.documentHandler != null) {
            this.qAtts.setAttributes(attributes);
            this.documentHandler.startElement(string3, this.qAtts);
        }
    }

    @Override
    public void endElement(String string, String string2, String string3) throws SAXException {
        if (this.documentHandler != null) {
            this.documentHandler.endElement(string3);
        }
    }

    @Override
    public void characters(char[] cArray, int n, int n2) throws SAXException {
        if (this.documentHandler != null) {
            this.documentHandler.characters(cArray, n, n2);
        }
    }

    @Override
    public void ignorableWhitespace(char[] cArray, int n, int n2) throws SAXException {
        if (this.documentHandler != null) {
            this.documentHandler.ignorableWhitespace(cArray, n, n2);
        }
    }

    @Override
    public void processingInstruction(String string, String string2) throws SAXException {
        if (this.documentHandler != null) {
            this.documentHandler.processingInstruction(string, string2);
        }
    }

    @Override
    public void skippedEntity(String string) throws SAXException {
    }

    final class AttributesAdapter
    implements AttributeList {
        private Attributes attributes;

        AttributesAdapter(XMLReaderAdapter xMLReaderAdapter) {
        }

        void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }

        @Override
        public int getLength() {
            return this.attributes.getLength();
        }

        @Override
        public String getName(int n) {
            return this.attributes.getQName(n);
        }

        @Override
        public String getType(int n) {
            return this.attributes.getType(n);
        }

        @Override
        public String getValue(int n) {
            return this.attributes.getValue(n);
        }

        @Override
        public String getType(String string) {
            return this.attributes.getType(string);
        }

        @Override
        public String getValue(String string) {
            return this.attributes.getValue(string);
        }
    }
}

