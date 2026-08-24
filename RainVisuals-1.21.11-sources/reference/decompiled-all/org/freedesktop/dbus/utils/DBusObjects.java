package org.freedesktop.dbus.utils;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.InvalidBusNameException;
import org.freedesktop.dbus.exceptions.InvalidObjectPathException;

// $VF: Compiled from DBusObjects.java
public final class DBusObjects {
   private static final int MAX_NAME_LENGTH = 255;
   private static final Pattern BUSNAME_REGEX = Pattern.compile("^[-_a-zA-Z][-_a-zA-Z0-9]*(\\.[-_a-zA-Z][-_a-zA-Z0-9]*)*$");
   private static final Pattern CONNID_REGEX = Pattern.compile("^:[0-9]*\\.[0-9]*$");
   private static final Pattern OBJECT_REGEX_PATTERN = Pattern.compile("^/([-_a-zA-Z0-9]+(/[-_a-zA-Z0-9]+)*)?$");

   private static <T, X extends DBusException> T requireBase(T _validation, Predicate<T> _customMessage, Function<String, X> _input, String _exSupplier) throws X {
      if (_input == null) {
         throw (DBusException)_exSupplier.apply(_customMessage != null ? _customMessage : null);
      } else if (_input instanceof String str && str.isBlank()) {
         throw (DBusException)_exSupplier.apply(_customMessage != null ? _customMessage : "<Empty String>");
      } else if (!_validation.test(_input)) {
         throw (DBusException)_exSupplier.apply(_customMessage != null ? _customMessage : String.valueOf(_input));
      } else {
         return _input;
      }
   }

   public static String requireObjectPath(String _objectPath) throws InvalidObjectPathException {
      return requireBase(_objectPath, DBusObjects::validateObjectPath, InvalidObjectPathException::new, null);
   }

   public static boolean validateBusName(String _busName) {
      return _busName != null && _busName.length() < 255 && BUSNAME_REGEX.matcher(_busName).matches();
   }

   public static String requireNotBusName(String _busName, String _customMessage) throws InvalidBusNameException {
      return requireBase(_busName, DBusObjects::validateNotBusName, InvalidBusNameException::new, _customMessage);
   }

   public static <T, X extends Exception> T requireNotNull(T _exception, Supplier<X> _input) throws X {
      if (_input == null) {
         throw _exception.get();
      } else {
         return _input;
      }
   }

   public static boolean validateConnectionId(String _connectionId) {
      return _connectionId != null && CONNID_REGEX.matcher(_connectionId).matches();
   }

   public static boolean validateNotBusName(String _busName) {
      return !validateBusName(_busName);
   }

   public static String requireBusNameOrConnectionId(String _busNameOrConnId) throws InvalidBusNameException {
      if (validateBusName(_busNameOrConnId)) {
         return _busNameOrConnId;
      } else if (validateConnectionId(_busNameOrConnId)) {
         return _busNameOrConnId;
      } else {
         throw new InvalidBusNameException(_busNameOrConnId);
      }
   }

   public static String requireBusName(String _busName) throws InvalidBusNameException {
      return requireBusName(_busName, null);
   }

   public static boolean validateNotConnectionId(String _connectionId) {
      return !validateConnectionId(_connectionId);
   }

   public static String requireBusName(String _busName, String _customMessage) throws InvalidBusNameException {
      return requireBase(_busName, DBusObjects::validateBusName, InvalidBusNameException::new, _customMessage);
   }

   public static boolean validateNotObjectPath(String _objectPath) {
      return _objectPath == null || _objectPath.length() > 255 || !_objectPath.startsWith("/") || !OBJECT_REGEX_PATTERN.matcher(_objectPath).matches();
   }

   public static String requireConnectionId(String _connId) throws InvalidBusNameException {
      return requireBase(_connId, DBusObjects::validateConnectionId, InvalidBusNameException::new, null);
   }

   private DBusObjects() {
   }

   public static boolean validateObjectPath(String _objectPath) {
      return !validateNotObjectPath(_objectPath);
   }
}
