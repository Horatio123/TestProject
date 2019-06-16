package com.baimahu.Socket;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{
        String ip = "localhost";
        int port = 999;

        System.out.println("start a client");
        Socket socket = new Socket(ip, port);

        String outPut = "I live in baimahu";

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
        System.out.println("sent message to server: " + outPut);
        PrintWriter printWriter = new PrintWriter(outputStreamWriter);
        printWriter.println(outPut);
        //outputStreamWriter.write(outPut);
        outputStreamWriter.flush();

        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = bufferedReader.readLine();
        System.out.println("get info from server: " + str);
    }
}
