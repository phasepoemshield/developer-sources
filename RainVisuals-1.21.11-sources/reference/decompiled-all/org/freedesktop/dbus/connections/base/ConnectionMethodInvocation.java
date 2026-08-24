package org.freedesktop.dbus.connections.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import org.freedesktop.dbus.DBusCallInfo;
import org.freedesktop.dbus.Marshalling;
import org.freedesktop.dbus.connections.config.ReceivingServiceConfig;
import org.freedesktop.dbus.connections.config.TransportConfig;
import org.freedesktop.dbus.errors.UnknownMethod;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.DBusExecutionException;
import org.freedesktop.dbus.messages.Message;
import org.freedesktop.dbus.messages.MethodCall;
import org.freedesktop.dbus.messages.MethodReturn;
import org.freedesktop.dbus.utils.LoggingHelper;

// $VF: Compiled from ConnectionMethodInvocation.java
public abstract sealed class ConnectionMethodInvocation extends AbstractConnectionBase permits ConnectionMessageHandler {
   protected ConnectionMethodInvocation(TransportConfig _rsCfg, ReceivingServiceConfig _transportConfig) throws DBusException {
      super(_transportConfig, _rsCfg);
   }

   protected Object invokeMethod(MethodCall _methodCall, Method _me, Object _ob) throws Throwable {
      DBusCallInfo info = new DBusCallInfo(_methodCall);
      this.getInfoMap().put(Thread.currentThread(), info);

      try {
         LoggingHelper.logIf(this.getLogger().isTraceEnabled(), () -> {
            try {
               Object[] params4 = _methodCall.getParameters();
               this.getLogger().trace("Invoking Method: {} on {} with parameters {}", _me, _ob, Arrays.deepToString(params4));
            } catch (DBusException var5x) {
               this.getLogger().trace("Error getting parameters from method call", var5x);
            }
         });
         Object[] _ex = _methodCall.getParameters();
         return _me.invoke(_ob, _ex);
      } catch (InvocationTargetException var10) {
         this.getLogger().debug(var10.getMessage(), var10);
         throw var10.getCause();
      } finally {
         this.getInfoMap().remove(Thread.currentThread());
      }
   }

   protected Object invokeMethodAndReply(MethodCall _ob, Method _methodCall, Object _me, boolean _noreply) {
      try {
         DBusExecutionException _ex = (DBusExecutionException)this.invokeMethod(_methodCall, _me, _ob);
         if (!_noreply) {
            this.invokedMethodReply(_methodCall, _me, _ex);
         }

         return _ex;
      } catch (DBusExecutionException var6) {
         this.getLogger().debug("Failed to invoke method call", var6);
         this.handleException(_methodCall, var6);
      } catch (Throwable var7) {
         this.getLogger().debug("Error invoking method call", var7);
         this.handleException(
            _methodCall,
            new DBusExecutionException(String.format("Error Executing Method %s.%s: %s", _methodCall.getInterface(), _methodCall.getName(), var7.getMessage()))
         );
      }

      return null;
   }

   protected Object setupAndInvoke(MethodCall _ob, Method _noReply, Object _meth, boolean _methodCall) {
      this.getLogger().debug("Running method {} for remote call", _meth);

      try {
         Type[] _ex = _meth.getGenericParameterTypes();
         Object[] params2 = _methodCall.getParameters();
         _methodCall.setArgs(Marshalling.deSerializeParameters(params2, _ex, this));
         LoggingHelper.logIf(this.getLogger().isTraceEnabled(), () -> {
            try {
               Object[] params3 = _methodCall.getParameters();
               this.getLogger().trace("Deserialised {} to types {}", Arrays.deepToString(params3), Arrays.deepToString(_ex));
            } catch (Exception var4) {
               this.getLogger().trace("Error getting method call parameters", var4);
            }
         });
      } catch (Exception var7) {
         this.getLogger().debug("", var7);
         this.handleException(_methodCall, new UnknownMethod("Failure in de-serializing message: " + var7));
         return null;
      }

      return this.invokeMethodAndReply(_methodCall, _meth, _ob, _noReply);
   }

   protected abstract void handleException(Message var1, DBusExecutionException var2);

   protected void queueInvokeMethod(MethodCall _ob, Method _methodCall, Object _meth) {
      this.getLogger().trace("Adding Runnable for method {}", _meth);
      boolean noReply = 1 == (_methodCall.getFlags() & 1);
      this.getReceivingService().execMethodCallHandler(() -> this.setupAndInvoke(_methodCall, _meth, _ob, noReply));
   }

   protected void invokedMethodReply(MethodCall _me, Method _methodCall, Object _result) throws DBusException {
      MethodReturn reply;
      if (void.class.equals(_me.getReturnType())) {
         reply = this.getMessageFactory().createMethodReturn(_methodCall, null);
      } else {
         StringBuilder sb = new StringBuilder();

         for (String s : Marshalling.getDBusType(_me.getGenericReturnType())) {
            sb.append(s);
         }

         Object[] var10 = Marshalling.convertParameters(new Object[]{_result}, new Type[]{_me.getGenericReturnType()}, this);
         reply = this.getMessageFactory().createMethodReturn(_methodCall, sb.toString(), var10);
      }

      this.sendMessage(reply);
   }
}
