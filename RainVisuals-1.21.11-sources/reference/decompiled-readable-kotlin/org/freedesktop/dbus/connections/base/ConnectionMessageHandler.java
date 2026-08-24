package org.freedesktop.dbus.connections.base;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import org.freedesktop.dbus.DBusAsyncReply;
import org.freedesktop.dbus.DBusCallInfo;
import org.freedesktop.dbus.DBusMatchRule;
import org.freedesktop.dbus.Marshalling;
import org.freedesktop.dbus.MethodTuple;
import org.freedesktop.dbus.RemoteInvocationHandler;
import org.freedesktop.dbus.annotations.DBusProperties;
import org.freedesktop.dbus.annotations.DBusProperty;
import org.freedesktop.dbus.connections.AbstractConnection;
import org.freedesktop.dbus.connections.config.ReceivingServiceConfig;
import org.freedesktop.dbus.connections.config.TransportConfig;
import org.freedesktop.dbus.errors.InvalidMethodArgument;
import org.freedesktop.dbus.errors.UnknownMethod;
import org.freedesktop.dbus.errors.UnknownObject;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.DBusExecutionException;
import org.freedesktop.dbus.interfaces.CallbackHandler;
import org.freedesktop.dbus.interfaces.DBusSigHandler;
import org.freedesktop.dbus.messages.DBusSignal;
import org.freedesktop.dbus.messages.Error;
import org.freedesktop.dbus.messages.ExportedObject;
import org.freedesktop.dbus.messages.Message;
import org.freedesktop.dbus.messages.MethodCall;
import org.freedesktop.dbus.messages.MethodReturn;
import org.freedesktop.dbus.propertyref.PropertyRef;
import org.freedesktop.dbus.types.Variant;
import org.freedesktop.dbus.utils.Util;

// $VF: Compiled from ConnectionMessageHandler.java
public abstract sealed class ConnectionMessageHandler extends ConnectionMethodInvocation permits AbstractConnection {
   private boolean handleDBusBoundProperties(ExportedObject _methodCall, MethodCall _exportObject, Object[] _params) throws DBusException {
      if (_params.length == 2 && _params[0] instanceof String && _params[1] instanceof String && _methodCall.getName().equals("Get")) {
         PropertyRef var12 = new PropertyRef((String)_params[1], null, DBusProperty.Access.READ);
         Method var14 = _exportObject.getPropertyMethods().get(var12);
         if (var14 != null) {
            Object var16 = _exportObject.getObject().get();
            this.getReceivingService().execMethodCallHandler(() -> {
               _methodCall.setArgs(new Object[0]);
               this.invokeMethodAndReply(_methodCall, var14, var16, 1 == (_methodCall.getFlags() & 1));
            });
            return true;
         }
      } else if (_params.length == 3 && _params[0] instanceof String && _params[1] instanceof String && _methodCall.getName().equals("Set")) {
         PropertyRef var11 = new PropertyRef((String)_params[1], null, DBusProperty.Access.WRITE);
         Method var13 = _exportObject.getPropertyMethods().get(var11);
         if (var13 != null) {
            Object var15 = _exportObject.getObject().get();
            Class<?> var17 = PropertyRef.typeForMethod(var13);
            AtomicBoolean isVariant = new AtomicBoolean(false);
            Object val = Optional.ofNullable(_params[2]).map(v -> {
               if (v instanceof Variant<?> va) {
                  isVariant.set(true);
                  return va.getValue();
               } else {
                  return v;
               }
            }).orElse(null);
            this.getReceivingService().execMethodCallHandler(() -> {
               try {
                  Object myVal = val;
                  Parameter[] parameters = var13.getParameters();
                  if (parameters.length != 1) {
                     throw new InvalidMethodArgument("Expected method with one argument, but found " + parameters.length);
                  }

                  if (Collection.class.isAssignableFrom(parameters[0].getType()) && isVariant.get() && myVal != null && myVal.getClass().isArray()) {
                     if (Set.class.isAssignableFrom(parameters[0].getType())) {
                        myVal = new LinkedHashSet<>(Arrays.asList(Util.toObjectArray(myVal)));
                     } else {
                        myVal = new ArrayList<>(Arrays.asList(Util.toObjectArray(myVal)));
                     }
                  }

                  _methodCall.setArgs(Marshalling.deSerializeParameters(new Object[]{myVal}, new Type[]{var17}, this));
                  this.invokeMethodAndReply(_methodCall, var13, var15, 1 == (_methodCall.getFlags() & 1));
               } catch (Exception var9x) {
                  this.getLogger().debug("Failed to invoke method call on Properties", var9x);
                  this.handleException(_methodCall, new UnknownMethod("Failure in de-serializing message: " + var9x));
               }
            });
            return true;
         }
      } else if (_params.length == 1 && _params[0] instanceof String && _methodCall.getName().equals("GetAll")) {
         Set<Entry<PropertyRef, Method>> allPropertyMethods = _exportObject.getPropertyMethods().entrySet();
         if (!allPropertyMethods.isEmpty()) {
            Object object = _exportObject.getObject().get();
            Method meth = null;
            if (object instanceof DBusProperties) {
               meth = _exportObject.getMethods().get(new MethodTuple(_methodCall.getName(), _methodCall.getSig()));
               if (null == meth) {
                  this.sendMessage(
                     this.getMessageFactory()
                        .createError(
                           _methodCall,
                           new UnknownMethod(
                              String.format("The method `%s.%s' does not exist on this object.", _methodCall.getInterface(), _methodCall.getName())
                           )
                        )
                  );
                  return true;
               }
            } else {
               try {
                  meth = Properties.class.getDeclaredMethod("GetAll", String.class);
               } catch (NoSuchMethodException | SecurityException var10) {
                  this.getLogger().debug("Properties GetAll failed", var10);
                  this.handleException(
                     _methodCall,
                     new DBusExecutionException(
                        String.format("Error Executing Method %s.%s: %s", _methodCall.getInterface(), _methodCall.getName(), var10.getMessage())
                     )
                  );
               }
            }

            Method originalMeth = meth;
            this.getReceivingService()
               .execMethodCallHandler(
                  () -> {
                     Map<String, Object> resultMap = new HashMap<>();

                     for (Entry<PropertyRef, Method> propEn : allPropertyMethods) {
                        Method propMeth = propEn.getValue();
                        if (propEn.getKey().getAccess() == DBusProperty.Access.READ) {
                           try {
                              _methodCall.setArgs(new Object[0]);
                              Object _ex = this.invokeMethod(_methodCall, propMeth, object);
                              resultMap.put(propEn.getKey().getName(), _ex);
                           } catch (Throwable var12x) {
                              this.getLogger().debug("", var12x);
                              this.handleException(_methodCall, new UnknownMethod("Failure in de-serializing message: " + var12x));
                              return;
                           }
                        }
                     }

                     if (object instanceof DBusProperties) {
                        resultMap.putAll((Map<? extends String, ? extends Object>)this.setupAndInvoke(_methodCall, originalMeth, object, true));
                     }

                     try {
                        this.invokedMethodReply(_methodCall, originalMeth, resultMap);
                     } catch (DBusExecutionException var10x) {
                        this.getLogger().debug("Error invoking method call", var10x);
                        this.handleException(_methodCall, var10x);
                     } catch (Throwable var11x) {
                        this.getLogger().debug("Failed to invoke method call", var11x);
                        this.handleException(
                           _methodCall,
                           new DBusExecutionException(
                              String.format("Error Executing Method %s.%s: %s", _methodCall.getInterface(), _methodCall.getName(), var11x.getMessage())
                           )
                        );
                     }
                  }
               );
            return true;
         }
      }

      return false;
   }

   private void handleMessage(MethodCall _methodCall) throws DBusException {
      this.getLogger().debug("Handling incoming method call: {}", _methodCall);
      Method meth = null;
      Object o = null;
      if (null == _methodCall.getInterface()
         || _methodCall.getInterface().equals("org.freedesktop.DBus.Peer")
         || _methodCall.getInterface().equals("org.freedesktop.DBus.Introspectable")) {
         ExportedObject exportObject = this.getExportedObjects().get(null);
         if (null != exportObject && null == exportObject.getObject().get()) {
            this.unExportObject(null);
            exportObject = null;
         }

         if (exportObject != null) {
            meth = exportObject.getMethods().get(new MethodTuple(_methodCall.getName(), _methodCall.getSig()));
         }

         if (meth != null) {
            o = new GlobalHandler(this, _methodCall.getPath());
         }
      }

      if (o == null) {
         ExportedObject var7 = this.getExportedObjects().get(_methodCall.getPath());
         this.getLogger().debug("Found exported object: {}", var7 == null ? "<no object found>" : var7);
         if (var7 != null && var7.getObject().get() == null) {
            this.getLogger()
               .info(
                  "Unexporting {} implicitly (object present: {}, reference present: {})", _methodCall.getPath(), var7 != null, var7.getObject().get() == null
               );
            this.unExportObject(_methodCall.getPath());
            var7 = null;
         }

         if (var7 == null) {
            var7 = this.getFallbackContainer().get(_methodCall.getPath());
            this.getLogger().debug("Found {} in fallback container", var7 == null ? "no" : var7);
         }

         if (var7 == null) {
            this.getLogger().debug("No object found for method {}", _methodCall.getPath());
            this.sendMessage(
               this.getMessageFactory().createError(_methodCall, new UnknownObject(_methodCall.getPath() + " is not an object provided by this process."))
            );
            return;
         }

         if (this.getLogger().isTraceEnabled()) {
            this.getLogger().trace("Searching for method {}  with signature {}", _methodCall.getName(), _methodCall.getSig());
            this.getLogger().trace("List of methods on {}: ", var7);

            for (MethodTuple mt : var7.getMethods().keySet()) {
               this.getLogger().trace("   {} => {}", mt, var7.getMethods().get(mt));
            }
         }

         Object[] var8 = _methodCall.getParameters();
         if (this.handleDBusBoundProperties(var7, _methodCall, var8)) {
            return;
         }

         if (meth == null) {
            meth = var7.getMethods().get(new MethodTuple(_methodCall.getName(), _methodCall.getSig()));
            if (null == meth) {
               this.sendMessage(
                  this.getMessageFactory()
                     .createError(
                        _methodCall,
                        new UnknownMethod(String.format("The method `%s.%s' does not exist on this object.", _methodCall.getInterface(), _methodCall.getName()))
                     )
               );
               return;
            }
         }

         o = var7.getObject().get();
      }

      if (ExportedObject.isExcluded(meth)) {
         this.sendMessage(
            this.getMessageFactory()
               .createError(
                  _methodCall, new UnknownMethod(String.format("The method `%s.%s' is not exported.", _methodCall.getInterface(), _methodCall.getName()))
               )
         );
      } else {
         this.queueInvokeMethod(_methodCall, meth, o);
      }
   }

   protected void handleMessage(MethodReturn _mr) {
      this.getLogger().debug("Handling incoming method return: {}", _mr);
      MethodCall m = null;
      if (null != this.getPendingCalls()) {
         synchronized (this.getPendingCalls()) {
            if (this.getPendingCalls().containsKey(_mr.getReplySerial())) {
               m = this.getPendingCalls().remove(_mr.getReplySerial());
            }
         }

         if (null != m) {
            m.setReply(_mr);
            _mr.setCall(m);
            CallbackHandler _exDe = this.getCallbackManager().getCallback(m);
            DBusAsyncReply<?> asr = this.getCallbackManager().getCallbackReply(m);
            this.getCallbackManager().removeCallback(m);
            if (null != _exDe) {
               final CallbackHandler<Object> fcbh = _exDe;
               final DBusAsyncReply<?> fasr = asr;
               if (fasr == null) {
                  this.getLogger().debug("Cannot add runnable for method, given method callback was null");
                  return;
               }

               this.getLogger().trace("Adding Runnable for method {} with callback handler {}", fcbh, fasr.getMethod());
               Runnable r = new Runnable()               // $VF: Compiled from ConnectionMessageHandler.java
 {
                  @Override
                  public synchronized void run() {
                     try {
                        ConnectionMessageHandler.this.getLogger().trace("Running Callback for {}", _mr);
                        DBusCallInfo info = new DBusCallInfo(_mr);
                        ConnectionMessageHandler.this.getInfoMap().put(Thread.currentThread(), info);
                        Object convertRV = RemoteInvocationHandler.convertRV(_mr.getParameters(), fasr.getMethod(), fasr.getConnection());
                        fcbh.handle(convertRV);
                        ConnectionMessageHandler.this.getInfoMap().remove(Thread.currentThread());
                     } catch (Exception var3) {
                        ConnectionMessageHandler.this.getLogger().debug("Exception while running callback.", var3);
                     }
                  }
               };
               this.getReceivingService().execMethodReturnHandler(r);
            }
         } else {
            try {
               this.sendMessage(
                  this.getMessageFactory()
                     .createError(_mr, new DBusExecutionException("Spurious reply. No message with the given serial id was awaiting a reply."))
               );
            } catch (DBusException var8) {
               this.getLogger().trace("Could not send error message", var8);
            }
         }
      }
   }

   protected ConnectionMessageHandler(TransportConfig _transportConfig, ReceivingServiceConfig _rsCfg) throws DBusException {
      super(_transportConfig, _rsCfg);
   }

   @Override
   protected void handleException(Message _exception, DBusExecutionException _methodOrSignal) {
      try {
         this.sendMessage(this.getMessageFactory().createError(_methodOrSignal, _exception));
      } catch (DBusException var4) {
         this.getLogger().warn("Exception caught while processing previous error.", var4);
      }
   }

   private void handleMessage(DBusSignal _useThreadPool, boolean _signal) {
      this.getLogger().debug("Handling incoming signal: {}", _signal);
      List<DBusSigHandler<? extends DBusSignal>> handlers = new ArrayList<>();
      List<DBusSigHandler<DBusSignal>> genericHandlers = new ArrayList<>();

      for (Entry<DBusMatchRule, Queue<DBusSigHandler<? extends DBusSignal>>> e : this.getHandledSignals().entrySet()) {
         if (e.getKey().matches(_signal, false)) {
            handlers.addAll(e.getValue());
         }
      }

      for (Entry<DBusMatchRule, Queue<DBusSigHandler<DBusSignal>>> var11 : this.getGenericHandledSignals().entrySet()) {
         if (((DBusMatchRule)var11.getKey()).matches(_signal, false)) {
            genericHandlers.addAll((Collection<? extends DBusSigHandler<DBusSignal>>)var11.getValue());
         }
      }

      if (!handlers.isEmpty() || !genericHandlers.isEmpty()) {
         AbstractConnectionBase var10 = this;

         for (DBusSigHandler<? extends DBusSignal> h : handlers) {
            this.getLogger().trace("Adding Runnable for signal {} with handler {}", _signal, h);
            Runnable command = () -> {
               try {
                  DBusSignal rs;
                  if (_signal.getClass().equals(DBusSignal.class)) {
                     rs = _signal.createReal(var10);
                  } else {
                     rs = _signal;
                  }

                  if (rs == null) {
                     return;
                  }

                  h.handle(rs);
               } catch (DBusException var5) {
                  this.getLogger().warn("Exception while running signal handler '{}' for signal '{}':", h, _signal, var5);
                  this.handleException(
                     _signal,
                     new DBusExecutionException("Error handling signal " + _signal.getInterface() + "." + _signal.getName() + ": " + var5.getMessage())
                  );
               }
            };
            if (_useThreadPool) {
               this.getReceivingService().execSignalHandler(command);
            } else {
               command.run();
            }
         }

         for (DBusSigHandler<DBusSignal> var14 : genericHandlers) {
            this.getLogger().trace("Adding Runnable for signal {} with handler {}", _signal, var14);
            Runnable var15 = () -> var14.handle(_signal);
            if (_useThreadPool) {
               this.getReceivingService().execSignalHandler(var15);
            } else {
               var15.run();
            }
         }
      }
   }

   void handleMessage(Message _message) throws DBusException {
      if (_message instanceof DBusSignal sig) {
         this.handleMessage(sig, true);
      } else if (_message instanceof MethodCall mc) {
         this.handleMessage(mc);
      } else if (_message instanceof MethodReturn mr) {
         this.handleMessage(mr);
      } else if (_message instanceof Error err) {
         this.handleMessage(err);
      }
   }

   protected void handleMessage(Error _err) {
      this.getLogger().debug("Handling incoming error: {}", _err);
      MethodCall m = null;
      if (this.getPendingCalls() != null) {
         synchronized (this.getPendingCalls()) {
            if (this.getPendingCalls().containsKey(_err.getReplySerial())) {
               m = this.getPendingCalls().remove(_err.getReplySerial());
            }
         }

         if (m != null) {
            m.setReply(_err);
            CallbackHandler<?> cbh = this.getCallbackManager().removeCallback(m);
            this.getLogger().trace("{} = pendingCallbacks.remove({})", cbh, m);
            if (null != cbh) {
               final CallbackHandler<?> fcbh = cbh;
               this.getLogger().trace("Adding Error Runnable with callback handler {}", fcbh);
               Runnable command = new Runnable()               // $VF: Compiled from ConnectionMessageHandler.java
 {
                  @Override
                  public synchronized void run() {
                     try {
                        ConnectionMessageHandler.this.getLogger().trace("Running Error Callback for {}", _err);
                        DBusCallInfo info = new DBusCallInfo(_err);
                        ConnectionMessageHandler.this.getInfoMap().put(Thread.currentThread(), info);
                        fcbh.handleError(_err.getException());
                        ConnectionMessageHandler.this.getInfoMap().remove(Thread.currentThread());
                     } catch (Exception _ex) {
                        ConnectionMessageHandler.this.getLogger().debug("Exception while running error callback.", _ex);
                     }
                  }
               };
               this.getReceivingService().execErrorHandler(command);
            }
         } else {
            this.getPendingErrorQueue().add(_err);
         }
      }
   }
}
