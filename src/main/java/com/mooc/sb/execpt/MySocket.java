package com.mooc.sb.execpt;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/17 16:49
 **/
public class MySocket {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        serverSocket.accept();
    }
}
