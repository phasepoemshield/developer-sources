/*
 * Decompiled with CFR 0.152.
 */
package org.xml.sax;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class InputSource {
    private String publicId;
    private String systemId;
    private InputStream byteStream;
    private String encoding;
    private Reader characterStream;

    public InputSource(Reader reader) {
        this.setCharacterStream(reader);
    }

    public InputSource(InputStream inputStream) {
        this.setByteStream(inputStream);
    }

    public InputSource(String string) {
        this.setSystemId(string);
    }

    public InputSource() {
    }

    public boolean isEmpty() {
        return this.publicId == null && this.systemId == null && this.isStreamEmpty();
    }

    public String getEncoding() {
        return this.encoding;
    }

    public void setSystemId(String string) {
        this.systemId = string;
    }

    public InputStream getByteStream() {
        return this.byteStream;
    }

    public void setEncoding(String string) {
        this.encoding = string;
    }

    public Reader getCharacterStream() {
        return this.characterStream;
    }

    public void setByteStream(InputStream inputStream) {
        this.byteStream = inputStream;
    }

    public void setCharacterStream(Reader reader) {
        this.characterStream = reader;
    }

    private boolean isStreamEmpty() {
        boolean bl = true;
        try {
            int n;
            if (this.byteStream != null) {
                this.byteStream.reset();
                n = this.byteStream.available();
                if (n > 0) {
                    return false;
                }
            }
            if (this.characterStream != null) {
                this.characterStream.reset();
                n = this.characterStream.read();
                this.characterStream.reset();
                if (n != -1) {
                    return false;
                }
            }
        }
        catch (IOException iOException) {
            return false;
        }
        return bl;
    }

    public void setPublicId(String string) {
        this.publicId = string;
    }

    public String getPublicId() {
        return this.publicId;
    }

    public String getSystemId() {
        return this.systemId;
    }
}

