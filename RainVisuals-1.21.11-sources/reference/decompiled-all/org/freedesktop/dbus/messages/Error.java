package org.freedesktop.dbus.messages;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import org.freedesktop.dbus.connections.AbstractConnection;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.DBusExecutionException;
import org.freedesktop.dbus.exceptions.MessageFormatException;
import org.freedesktop.dbus.utils.CommonRegexPattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from Error.java
public class Error extends Message {
   private static final String DEFAULT_NULL_EXCEPTION_ERROR_MSG = "Unsupported NULL Exception";
   private static final Logger LOGGER = LoggerFactory.getLogger(Error.class);

   protected Error(byte _endianess, String _dest, String _replyserial, long _sig, String _errorName, Object... _args) throws DBusException {
      this(_endianess, null, _dest, _errorName, _replyserial, _sig, _args);
   }

   protected Error() {
   }

   public DBusExecutionException getException() {
      try {
         Class<? extends DBusExecutionException> c = createExceptionClass(this.getName());
         if (null == c || !DBusExecutionException.class.isAssignableFrom(c)) {
            c = DBusExecutionException.class;
         }

         Constructor<? extends DBusExecutionException> var7 = c.getConstructor(String.class);
         Object[] _ex2 = this.getParameters();
         DBusExecutionException var8;
         if (null != _ex2 && 0 != _ex2.length) {
            var8 = (DBusExecutionException)var7.newInstance(Arrays.stream(_ex2).map(Objects::toString).collect(Collectors.joining(" ")).trim());
         } else {
            var8 = (DBusExecutionException)var7.newInstance("");
         }

         var8.setType(this.getName());
         return var8;
      } catch (Exception var6) {
         this.logger.debug("", var6);
         Object[] args = null;

         try {
            args = this.getParameters();
         } catch (Exception var5) {
            LOGGER.trace("Cannot retrieve parameters", var5);
         }

         DBusExecutionException ex;
         if (null != args && 0 != args.length) {
            ex = new DBusExecutionException(Arrays.stream(args).map(Objects::toString).collect(Collectors.joining(" ")).trim());
         } else {
            ex = new DBusExecutionException("");
         }

         ex.setType(this.getName());
         return ex;
      }
   }

   protected Error(byte _source, String _errorName, String _args, String _endianess, long _dest, String _sig, Object... _replyserial) throws DBusException {
      super(_endianess, (byte)3, (byte)0);
      if (null == _errorName) {
         throw new MessageFormatException("Must specify error name to Errors.");
      }

      List<Object> hargs = new ArrayList();
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

      this.padAndMarshall(hargs, this.getSerial(), _sig, _args);
   }

   protected Error(byte _endianess, Message _m, Throwable _ex) throws DBusException {
      this(
         _endianess,
         _m.getSource(),
         AbstractConnection.DOLLAR_PATTERN
            .matcher(Optional.ofNullable(_ex).orElse(new IOException("Unsupported NULL Exception")).getClass().getName())
            .replaceAll("."),
         _m.getSerial(),
         "s",
         _ex == null ? "Unsupported NULL Exception" : _ex.getMessage()
      );
   }

   private static Class<? extends DBusExecutionException> createExceptionClass(String _name) {
      Class<? extends DBusExecutionException> c = null;
      String name = _name;
      if (name.startsWith("org.freedesktop.DBus.Error.")) {
         name = name.replace("org.freedesktop.DBus.Error.", "org.freedesktop.dbus.errors.");
      }

      do {
         try {
            c = Class.forName(name);
         } catch (ClassNotFoundException var4) {
            LOGGER.trace("Could not find class for name {}", name, var4);
         }

         name = CommonRegexPattern.EXCEPTION_EXTRACT_PATTERN.matcher(name).replaceAll("\\$$1");
      } while (null == c && CommonRegexPattern.EXCEPTION_PARTIAL_PATTERN.matcher(name).matches());

      return c;
   }

   protected Error(byte _m, String _source, Message _endianess, Throwable _ex) throws DBusException {
      this(
         _endianess,
         _source,
         _m.getSource(),
         AbstractConnection.DOLLAR_PATTERN
            .matcher(Optional.ofNullable(_ex).orElse(new IOException("Unsupported NULL Exception")).getClass().getName())
            .replaceAll("."),
         _m.getSerial(),
         "s",
         _ex == null ? "Unsupported NULL Exception" : _ex.getMessage()
      );
   }

   public void throwException() throws DBusExecutionException {
      throw this.getException();
   }
}
