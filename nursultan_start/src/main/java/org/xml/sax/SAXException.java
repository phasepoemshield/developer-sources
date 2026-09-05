/*
 * Decompiled with CFR 0.152.
 */
package org.xml.sax;

import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;

public class SAXException
extends Exception {
    private static final ObjectStreamField[] serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("exception", Exception.class)};
    static final long serialVersionUID = 583241635256073760L;

    public SAXException() {
    }

    public SAXException(String string) {
        super(string);
    }

    public SAXException(Exception exception) {
        super(exception);
    }

    public SAXException(String string, Exception exception) {
        super(string, exception);
    }

    @Override
    public String getMessage() {
        String string = super.getMessage();
        Throwable throwable = super.getCause();
        if (string == null && throwable != null) {
            return throwable.getMessage();
        }
        return string;
    }

    public Exception getException() {
        return this.getExceptionInternal();
    }

    @Override
    public Throwable getCause() {
        return super.getCause();
    }

    @Override
    public String toString() {
        Throwable throwable = super.getCause();
        if (throwable != null) {
            return super.toString() + "\n" + throwable.toString();
        }
        return super.toString();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putField = objectOutputStream.putFields();
        putField.put("exception", this.getExceptionInternal());
        objectOutputStream.writeFields();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        ObjectInputStream.GetField getField = objectInputStream.readFields();
        Exception exception = (Exception)getField.get("exception", null);
        Throwable throwable = super.getCause();
        if (throwable == null && exception != null) {
            try {
                super.initCause(exception);
            }
            catch (IllegalStateException illegalStateException) {
                throw new InvalidClassException("Inconsistent state: two causes");
            }
        }
    }

    private Exception getExceptionInternal() {
        Throwable throwable = super.getCause();
        if (throwable instanceof Exception) {
            return (Exception)throwable;
        }
        return null;
    }
}

