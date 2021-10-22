package com.example.perfromance._1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Files {

    static final int MAX_LINE_LENGTH = 2000;
    static String LINEEND = System.getProperty("line.separator");

    static String readLine(DataInputStream reader) throws IOException {
        StringBuffer myline = new StringBuffer(MAX_LINE_LENGTH + 1);
        boolean skipLF = (LINEEND.length() > 1);

        char nextChar;
        try {
            nextChar = (char) reader.readByte();
        } catch (EOFException e) {
            // Expected - end of file
            return null;
        }

        while ((nextChar != LINEEND.charAt(0))
                && (myline.length() < MAX_LINE_LENGTH)) {
            myline.append(nextChar);
            nextChar = (char) reader.readByte();
        }
        if (skipLF && nextChar == LINEEND.charAt(0)) {
            // Skip the Windows line feed
            reader.readByte();
        }
        return myline.toString();
    }

    static void copySlow(File in_file, File out_file) {
        try {
            DataInputStream reader = new DataInputStream(new FileInputStream(
                    in_file));
            DataOutputStream writer = new DataOutputStream(
                    new FileOutputStream(out_file));

            try {
                String line = null;
                for (int i = 0; (line = readLine(reader)) != null; i++) {
                    if ((i % 100) == 0) {
                        System.out.print('.');
                    }
                    writer.writeBytes(line);
                    writer.writeBytes(LINEEND);
                }
            } catch (EOFException e) {
                // Done copy
            } catch (IOException e) {
                // rethrow for outer try block, but close the files
                throw e;
            } finally {
                reader.close();
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void copyFast(File in_file, File out_file) {
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(
                    in_file));
            BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(
                    out_file));

            try {
                int i;
                String line;
                for (i = 0; (line = reader.readLine()) != null; ++i) {
                    if ((i % 100) == 0) {
                        System.out.print('.');
                    }
                    writer.write(line);
                    writer.newLine();
                }
            } catch (IOException e) {
                // rethrow for outer try block, but close the files
                throw e;
            } finally {
                reader.close();
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String INPUT = "infile";
    static String OUTPUT = "outfile";

    public static void main(String args[]) {
        System.out
                .println("Started.....");

        String line = "";

        // Create input file, perform copy tests, cleanup
        File inputFile;
        try {
            // Create temporary input file
            inputFile = File.createTempFile(INPUT, null);

            // Create 1000 lines of data
            try {
                for (int i = 0; i < MAX_LINE_LENGTH; i++) {
                    line += (char) ('A' + i % 26);
                }
                BufferedWriter writer = new BufferedWriter(new FileWriter(
                        inputFile));
                for (int i = 0; i < 1000; i++) {
                    writer.write(line);
                    writer.newLine();
                }
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out
                    .print("\nUsing unbuffered DataInputStream/DataOutputStream");
            // Create temporary output file
            File slowOutputFile = File.createTempFile(OUTPUT, null);
            copySlow(inputFile, slowOutputFile);

            System.out.print("\nUsing BufferedReader/BufferedWriter");
            // Create temporary output file
            File fastOutputFile = File.createTempFile(OUTPUT, null);
            copyFast(inputFile, fastOutputFile);

            // Cleanup temporary files
            inputFile.delete();
            slowOutputFile.delete();
            fastOutputFile.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\nFinished");
    }

}
