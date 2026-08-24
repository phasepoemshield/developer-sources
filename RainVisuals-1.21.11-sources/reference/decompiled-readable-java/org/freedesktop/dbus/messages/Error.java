/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.messages;

import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.freedesktop.dbus.connections.AbstractConnection;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.DBusExecutionException;
import org.freedesktop.dbus.exceptions.MessageFormatException;
import org.freedesktop.dbus.messages.Message;
import org.freedesktop.dbus.utils.CommonRegexPattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Error
extends Message {
    private static final String DEFAULT_NULL_EXCEPTION_ERROR_MSG = "Unsupported NULL Exception";
    private static final Logger LOGGER = LoggerFactory.getLogger(Error.class);

    protected Error(byte _endianess, String _dest, String _errorName, long _replyserial, String _sig, Object ... _args) throws DBusException {
        this(_endianess, null, _dest, _errorName, _replyserial, _sig, _args);
    }

    protected Error() {
    }

    /*
     * Unable to fully structure code
     */
    public DBusExecutionException getException() {
        try {
            c = Error.createExceptionClass(this.getName());
            if (null == c || !DBusExecutionException.class.isAssignableFrom(c)) {
                c = DBusExecutionException.class;
            }
            v0 = new Class[1];
            v0[0] = String.class;
            con = c.getConstructor(v0);
            args = this.getParameters();
            if (null == args) ** GOTO lbl18
            if (0 == args.length) {
lbl18:
                // 2 sources

                v1 = new Object[1];
                v1[0] = "";
                ex = con.newInstance(v1);
            } else {
                v2 = new Object[1];
                v2[0] = Arrays.stream(args).map((Function<Object, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, toString(java.lang.Object ), (Ljava/lang/Object;)Ljava/lang/String;)()).collect(Collectors.joining(" ")).trim();
                ex = con.newInstance(v2);
            }
            ex.setType(this.getName());
            return ex;
        }
        catch (Exception _ex1) {
            this.logger.debug("", _ex1);
            args = null;
            try {
                args = this.getParameters();
            }
            catch (Exception var4_6) {
                Error.LOGGER.trace("Cannot retrieve parameters", var4_6);
            }
            if (null == args) ** GOTO lbl-1000
            if (0 == args.length) lbl-1000:
            // 2 sources

            {
                ex = new DBusExecutionException("");
            } else {
                var2_4 = new DBusExecutionException(Arrays.stream(args).map((Function<Object, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, toString(java.lang.Object ), (Ljava/lang/Object;)Ljava/lang/String;)()).collect(Collectors.joining(" ")).trim());
            }
            var2_4.setType(this.getName());
            return var2_4;
        }
    }

    /*
     * WARNING - void declaration
     */
    protected Error(byte _endianess, String _source, String _dest, String _errorName, long _replyserial, String _sig, Object ... _args) throws DBusException {
        super(_endianess, (byte)3, (byte)0);
        void var8_7;
        void var7_6;
        if (null == _errorName) {
            throw new MessageFormatException("Must specify error name to Errors.");
        }
        ArrayList<Object> hargs = new ArrayList<Object>();
        hargs.add(this.createHeaderArgs((byte)4, "s", _errorName));
        hargs.add(this.createHeaderArgs((byte)5, "u", _replyserial));
        if (null != _source) {
            hargs.add(this.createHeaderArgs((byte)7, "s", _source));
        }
        if (null != _dest) {
            hargs.add(this.createHeaderArgs((byte)6, "s", _dest));
        }
        if (null != _sig) {
            hargs.add(this.createHeaderArgs((byte)8, "g", _sig));
            this.setArgs(_args);
        }
        this.padAndMarshall(hargs, this.getSerial(), (String)var7_6, (Object[])var8_7);
    }

    protected Error(byte _endianess, Message _m, Throwable _ex) throws DBusException {
        Object[] objectArray = new Object[1];
        objectArray[0] = _ex == null ? DEFAULT_NULL_EXCEPTION_ERROR_MSG : _ex.getMessage();
        this(_endianess, _m.getSource(), AbstractConnection.DOLLAR_PATTERN.matcher(Optional.ofNullable(_ex).orElse(new IOException(DEFAULT_NULL_EXCEPTION_ERROR_MSG)).getClass().getName()).replaceAll("."), _m.getSerial(), "s", objectArray);
    }

    /*
     * WARNING - void declaration
     */
    private static Class<? extends DBusExecutionException> createExceptionClass(String _name) {
        void var1_1;
        Class<?> c = null;
        String name = _name;
        if (name.startsWith("org.freedesktop.DBus.Error.")) {
            name = name.replace("org.freedesktop.DBus.Error.", "org.freedesktop.dbus.errors.");
        }
        do {
            try {
                c = Class.forName(name);
            }
            catch (ClassNotFoundException _exCnf) {
                void var3_3;
                LOGGER.trace("Could not find class for name {}", (Object)name, (Object)var3_3);
            }
            name = CommonRegexPattern.EXCEPTION_EXTRACT_PATTERN.matcher(name).replaceAll("\\$$1");
            if (null != c) break;
        } while (CommonRegexPattern.EXCEPTION_PARTIAL_PATTERN.matcher(name).matches());
        return var1_1;
    }

    protected Error(byte _endianess, String _source, Message _m, Throwable _ex) throws DBusException {
        Object[] objectArray = new Object[1];
        objectArray[0] = _ex == null ? DEFAULT_NULL_EXCEPTION_ERROR_MSG : _ex.getMessage();
        this(_endianess, _source, _m.getSource(), AbstractConnection.DOLLAR_PATTERN.matcher(Optional.ofNullable(_ex).orElse(new IOException(DEFAULT_NULL_EXCEPTION_ERROR_MSG)).getClass().getName()).replaceAll("."), _m.getSerial(), "s", objectArray);
    }

    public void throwException() throws DBusExecutionException {
        throw this.getException();
    }
}

