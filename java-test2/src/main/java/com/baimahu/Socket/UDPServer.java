package com.baimahu.Socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) throws Exception{
        System.out.println("UDP server is started");
        DatagramSocket datagramSocket = new DatagramSocket(666);

        byte[] receiveBytes = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveBytes, receiveBytes.length);
        datagramSocket.receive(receivePacket);

        String str = new String(receivePacket.getData());
        System.out.println("get info: " + str);
        // System.out.println(receivePacket.getPort());\
        //System.out.println(str.getClass());

        // should add trim
        int receiveNum = Integer.parseInt(str.trim());
        System.out.println("sent info: " + receiveNum);
        byte[] sendBytes = String.valueOf(receiveNum * receiveNum).getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendBytes, sendBytes.length, receivePacket.getAddress(), receivePacket.getPort());
        datagramSocket.send(sendPacket);

    }
}
