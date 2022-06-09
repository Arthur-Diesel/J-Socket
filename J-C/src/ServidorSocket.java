package br.com.up.projeto.socket;

import java.net.*;

public class ServidorSocket {
    public void iniciaServidor(){
        int porta = 1234;
        try{
            
            ServerSocket serverSocket = new ServerSocket(porta);
            Socket cliente = serverSocket.accept();
            Inet4Address clientAddress = (Inet4Address)cliente.getInetAddress();

            String ipCliente = clientAddress.getHostAddress();
            String hostCliente = clientAddress.getHostName();

            System.out.println("Cliente conectado!");
            System.out.println(ipCliente);
            System.out.println(hostCliente);

            while(cliente.isConnected()){
                cliente.getOutputStream().write("Hello World".getBytes());
                cliente.getInputStream().read();
            }

            serverSocket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
