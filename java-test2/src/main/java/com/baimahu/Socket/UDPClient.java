package com.baimahu.Socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket();

        int num = 8;
        byte[] sendBytes = String.valueOf(num).getBytes();
        System.out.println("sent info: " + num);
        InetAddress inetAddress = InetAddress.getLocalHost();
        DatagramPacket sendPacket = new DatagramPacket(sendBytes, sendBytes.length, inetAddress, 666);
        datagramSocket.send(sendPacket);

        byte[] receiveByte = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveByte, receiveByte.length);
        datagramSocket.receive(receivePacket);
        String str = new String(receivePacket.getData());
        System.out.println("receive from server: " + str);

    }
}
