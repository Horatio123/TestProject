package com.baimahu.Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception{
        System.out.println("start a server");
        ServerSocket serverSocket = new ServerSocket(999);

        System.out.println("waiting for request");
        Socket socket = serverSocket.accept();

        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = bufferedReader.readLine();
        System.out.println("information from client is: " + str);

        String location = str.substring(10, 17);
        System.out.println("sent info to client: " + location);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
        PrintWriter printWriter = new PrintWriter(outputStreamWriter);
        printWriter.println(location);
        // outputStreamWriter.write(location);
        outputStreamWriter.flush();
    }
}
