package jnr.posix.util;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import jnr.posix.POSIXHandler;

// $VF: Compiled from Java5ProcessMaker.java
public class Java5ProcessMaker implements ProcessMaker {
   private final POSIXHandler handler;
   private final ProcessBuilder builder;

   @Override
   public ProcessMaker command(List<String> command) {
      this.builder.command(command);
      return this;
   }

   private static void envIntoProcessBuilder(ProcessBuilder env, String[] pb) {
      if (env != null) {
         pb.environment().clear();

         for (String envLine : env) {
            if (envLine.indexOf(0) != -1) {
               envLine = envLine.replaceFirst("\u0000.*", "");
            }

            int index = envLine.indexOf(61);
            if (index != -1) {
               pb.environment().put(envLine.substring(0, index), envLine.substring(index + 1));
            }
         }
      }
   }

   @Override
   public List<String> command() {
      return this.builder.command();
   }

   @Override
   public ProcessMaker directory(File dir) {
      this.builder.directory(dir);
      return this;
   }

   @Override
   public ProcessMaker redirectOutput(ProcessMaker.Redirect destination) {
      this.handler.unimplementedError("redirectOutput");
      return this;
   }

   @Override
   public ProcessMaker.Redirect redirectError() {
      return ProcessMaker.Redirect.PIPE;
   }

   @Override
   public ProcessMaker command(String... command) {
      this.builder.command(command);
      return this;
   }

   @Override
   public boolean redirectErrorStream() {
      return false;
   }

   @Override
   public Map<String, String> environment() {
      return this.builder.environment();
   }

   public Java5ProcessMaker(POSIXHandler handler, String... command) {
      this.handler = handler;
      this.builder = new ProcessBuilder(command);
   }

   @Override
   public ProcessMaker redirectErrorStream(boolean redirectErrorStream) {
      this.handler.unimplementedError("redirectErrorStream");
      return this;
   }

   @Override
   public File directory() {
      return this.builder.directory();
   }

   public Java5ProcessMaker(POSIXHandler handler) {
      this.handler = handler;
      this.builder = new ProcessBuilder();
   }

   @Override
   public ProcessMaker redirectError(ProcessMaker.Redirect destination) {
      this.handler.unimplementedError("redirectError");
      return this;
   }

   @Override
   public Process start() throws IOException {
      return this.builder.start();
   }

   @Override
   public ProcessMaker inheritIO() {
      this.handler.unimplementedError("inheritIO");
      return this;
   }

   @Override
   public ProcessMaker redirectOutput(File file) {
      this.handler.unimplementedError("redirectOutput");
      return this;
   }

   @Override
   public ProcessMaker.Redirect redirectInput() {
      return ProcessMaker.Redirect.PIPE;
   }

   @Override
   public ProcessMaker redirectInput(File file) {
      this.handler.unimplementedError("redirectInput");
      return this;
   }

   @Override
   public ProcessMaker redirectInput(ProcessMaker.Redirect source) {
      this.handler.unimplementedError("redirectInput");
      return this;
   }

   @Override
   public ProcessMaker environment(String[] envLines) {
      envIntoProcessBuilder(this.builder, envLines);
      return this;
   }

   @Override
   public ProcessMaker.Redirect redirectOutput() {
      return ProcessMaker.Redirect.PIPE;
   }

   @Override
   public ProcessMaker redirectError(File file) {
      this.handler.unimplementedError("redirectError");
      return this;
   }
}
