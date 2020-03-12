package com.company;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

	Socket s= new Socket("127.0.0.1", 9999 );
    InputStream inputStream= s.getInputStream();
        OutputStream outputStream = s.getOutputStream();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(OutputStream));
        BufferedReader br = new BufferedReader(new InputStreamReader(InputStream));

    }
}

