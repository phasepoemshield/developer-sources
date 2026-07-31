package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Helper321 {
   private static final int PORT = 20001;
   private static final int RECONNECT_DELAY = 2000;
   private static final String MODE_CHECKER = "Checker";
   private static final String MODE_BUYER = "Buyer";
   private ServerSocket serverSocket = null;
   private Socket clientSocket = null;
   private PrintWriter clientOut = null;
   private BufferedReader clientIn = null;
   private List<Socket> connections = new ArrayList<>();
   private Map<Socket, PrintWriter> outs = new ConcurrentHashMap<>();
   private Map<Socket, BufferedReader> ins = new ConcurrentHashMap<>();
   private Map<Socket, Boolean> clientInAuction = new ConcurrentHashMap<>();
   private ExecutorService executorService = Executors.newFixedThreadPool(10);
   private volatile boolean running = false;
   private volatile boolean isClientMode = false;
   private long lastReconnectAttempt = 0L;
   private ConcurrentLinkedQueue<Helper317> queue = new ConcurrentLinkedQueue<>();
   private ConcurrentLinkedQueue<Helper317> priorityQueue = new ConcurrentLinkedQueue<>();

   public Helper321() {
   }

   public void method3172(String var1) {
      this.running = true;
      this.isClientMode = "Checker".equalsIgnoreCase(var1);
      this.executorService.execute(() -> this.method3174(var1));
   }

   public void method3173() {
      this.running = false;
      this.executorService.shutdownNow();
      this.executorService = Executors.newFixedThreadPool(10);
      this.method3182();
   }

   private void method3174(String var1) {
      while (this.running) {
         if ("Buyer".equalsIgnoreCase(var1)) {
            this.method3175();
         } else if ("Checker".equalsIgnoreCase(var1)) {
            long var2 = System.currentTimeMillis();
            if ((this.clientSocket == null || this.clientSocket.isClosed()) && var2 - this.lastReconnectAttempt >= 2000L) {
               this.method3176();
               this.lastReconnectAttempt = var2;
            }
         }

         try {
            Thread.sleep(500L);
         } catch (InterruptedException var4) {
         }
      }
   }

   private void method3175() {
      if (this.serverSocket == null || this.serverSocket.isClosed()) {
         try {
            this.serverSocket = new ServerSocket(20001);
            Helper238.method2186("Сервер запущен на порту 20001");
            this.executorService.execute(this::method3177);
         } catch (IOException var2) {
            Helper238.method2186("Ошибка запуска сервера");
         }
      }
   }

   private void method3176() {
      try {
         this.clientSocket = new Socket("localhost", 20001);
         this.clientSocket.setTcpNoDelay(true);
         this.clientSocket.setSoTimeout(0);
         this.clientSocket.setKeepAlive(true);
         this.clientOut = new PrintWriter(this.clientSocket.getOutputStream(), true);
         this.clientIn = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));
         this.clientOut.println("connect");
         this.executorService.execute(this::method3180);
         Helper238.method2186("Подключено к покупающему аккаунту");
      } catch (IOException var2) {
         this.clientSocket = null;
         this.clientOut = null;
         this.clientIn = null;
      }
   }

   private void method3177() {
      try {
         while (this.running && this.serverSocket != null && !this.serverSocket.isClosed()) {
            Socket var1 = this.serverSocket.accept();
            var1.setTcpNoDelay(true);
            var1.setKeepAlive(true);
            var1.setSoTimeout(0);
            this.connections.add(var1);
            PrintWriter var2 = new PrintWriter(var1.getOutputStream(), true);
            BufferedReader var3 = new BufferedReader(new InputStreamReader(var1.getInputStream()));
            this.outs.put(var1, var2);
            this.ins.put(var1, var3);
            this.clientInAuction.put(var1, false);
            Helper238.method2186("Подключен аккаунт с проверяющим");
            this.executorService.execute(() -> this.method3178(var1));
         }
      } catch (IOException var4) {
      }
   }

   private void method3178(Socket var1) {
      try {
         BufferedReader var2 = this.ins.get(var1);

         String var3;
         while ((var3 = var2.readLine()) != null) {
            if (var3.startsWith("buy:")) {
               this.method3179(var3);
            } else if (var3.equals("enter_auction")) {
               this.clientInAuction.put(var1, true);
            } else if (var3.equals("leave_auction")) {
               this.clientInAuction.put(var1, false);
            } else if (var3.equals("ping")) {
               PrintWriter var4 = this.outs.get(var1);
               if (var4 != null) {
                  var4.println("pong");
               }
            }
         }
      } catch (IOException var8) {
      } finally {
         this.method3181(var1);
      }
   }

   private void method3179(String var1) {
      try {
         String[] var2 = var1.substring(4).split("\\|");
         if (var2.length == 2) {
            String var3 = var2[0];
            int var4 = Integer.parseInt(var2[1]);
            Helper317 var5 = new Helper317(var3, var4);
            this.priorityQueue.add(var5);
         }
      } catch (NumberFormatException var6) {
      }
   }

   private void method3180() {
      try {
         String var1;
         try {
            while ((var1 = this.clientIn.readLine()) != null) {
               if (var1.equals("update_now")) {
                  Helper325.method3233();
               } else if (var1.startsWith("switch_server:")) {
                  String var2 = var1.substring(14);
                  Helper357.method3573(var2);
               } else if (var1.equals("open_auction")) {
                  Helper357.method3574();
               } else if (var1.equals("pong")) {
               }
            }
         } catch (IOException var11) {
         }
      } finally {
         this.method3183();
         if (this.running && this.isClientMode) {
            try {
               Thread.sleep(2000L);
            } catch (InterruptedException var10) {
            }
         }
      }
   }

   private void method3181(Socket var1) {
      this.connections.remove(var1);
      this.outs.remove(var1);
      this.ins.remove(var1);
      this.clientInAuction.remove(var1);

      try {
         var1.close();
      } catch (IOException var3) {
      }
   }

   private void method3182() {
      this.queue.clear();
      this.priorityQueue.clear();
      if (this.serverSocket != null) {
         try {
            this.serverSocket.close();
         } catch (IOException var3) {
         }

         this.serverSocket = null;
      }

      for (Socket var2 : new ArrayList<>(this.connections)) {
         this.method3181(var2);
      }

      this.method3183();
   }

   private void method3183() {
      if (this.clientSocket != null) {
         try {
            this.clientSocket.close();
         } catch (IOException var2) {
         }

         this.clientSocket = null;
      }

      this.clientOut = null;
      this.clientIn = null;
   }

   public void method3184(String var1) {
      ArrayList<java.net.Socket> var2 = new ArrayList<>();

      for (Socket var4 : new ArrayList<>(this.connections)) {
         PrintWriter var5 = this.outs.get(var4);
         if (var5 != null) {
            try {
               var5.println(var1);
               if (var5.checkError()) {
                  var2.add(var4);
               }
            } catch (Exception var7) {
               var2.add(var4);
            }
         }
      }

      for (Socket var9 : var2) {
         this.method3181(var9);
      }
   }

   public void method3185(String var1, int var2) {
      if (this.clientOut != null) {
         try {
            this.clientOut.println("buy:" + var1 + "|" + var2);
            if (this.clientOut.checkError()) {
               this.method3183();
            }
         } catch (Exception var4) {
         }
      }
   }

   public void method3186() {
      if (this.clientOut != null) {
         try {
            this.clientOut.println("enter_auction");
         } catch (Exception var2) {
         }
      }
   }

   public void method3187() {
      if (this.clientOut != null) {
         try {
            this.clientOut.println("leave_auction");
         } catch (Exception var2) {
         }
      }
   }

   public void method3188() {
      this.method3184("update_now");
   }

   public void method3189() {
      this.method3184("open_auction");
   }

   public long method3190() {
      return this.clientInAuction.values().stream().filter(Boolean::booleanValue).count();
   }

   public boolean method3191() {
      return !this.connections.isEmpty();
   }

   public boolean method3192() {
      return this.clientSocket != null && !this.clientSocket.isClosed() && this.clientOut != null;
   }

   public Helper317 method3193() {
      Helper317 var1 = this.priorityQueue.poll();
      if (var1 == null) {
         var1 = this.queue.poll();
      }

      return var1;
   }

   public int method3194() {
      return this.priorityQueue.size() + this.queue.size();
   }

   public boolean method3195() {
      return this.priorityQueue.isEmpty() && this.queue.isEmpty();
   }

   public void method3196() {
      this.queue.clear();
      this.priorityQueue.clear();
   }
}
