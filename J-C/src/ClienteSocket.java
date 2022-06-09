

import java.net.*;

public class ClienteSocket {
    public void iniciaConexao(){
        String ip = "192.168.56.1";
        int porta = 1234;
        try{
            Socket cliente = new Socket(ip, porta);
            while(cliente.isConnected()){
                cliente.getInputStream().read();
                cliente.getOutputStream().write("Hello World".getBytes());
            }
            cliente.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
