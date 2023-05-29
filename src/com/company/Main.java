package com.company;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.math.*;
import java.util.WeakHashMap;

public class Main {

    public static String binaryToHexa(String binary)
    {
        int i=0;
        String hexa = "";
        String answer="";
        while (i<3) {
            hexa=binary.substring(i*4,4+(i*4));
            hexa = hexa.replaceAll("0000", "0");
            hexa = hexa.replaceAll("0001", "1");
            hexa = hexa.replaceAll("0010", "2");
            hexa = hexa.replaceAll("0011", "3");
            hexa = hexa.replaceAll("0100", "4");
            hexa = hexa.replaceAll("0101", "5");
            hexa = hexa.replaceAll("0110", "6");
            hexa = hexa.replaceAll("0111", "7");
            hexa = hexa.replaceAll("1000", "8");
            hexa = hexa.replaceAll("1001", "9");
            hexa = hexa.replaceAll("1010", "A");
            hexa = hexa.replaceAll("1011", "B");
            hexa = hexa.replaceAll("1100", "C");
            hexa = hexa.replaceAll("1101", "D");
            hexa = hexa.replaceAll("1110", "E");
            hexa = hexa.replaceAll("1111", "F");
            answer=answer+hexa;
            i++;
        }
        return answer;
    }

    public static String stringtoascii(String S)
    {
        S = S.replaceAll("A", "41");
        S = S.replaceAll("B", "42");
        S = S.replaceAll("C", "43");
        S = S.replaceAll("D", "44");
        S = S.replaceAll("E", "45");
        S = S.replaceAll("F", "46");
        S = S.replaceAll("G", "47");
        S = S.replaceAll("H", "48");
        S = S.replaceAll("I", "49");
        S = S.replaceAll("J", "4A");
        S = S.replaceAll("K", "4B");
        S = S.replaceAll("L", "4C");
        S = S.replaceAll("M", "4D");
        S = S.replaceAll("N", "4E");
        S = S.replaceAll("O", "4F");
        S = S.replaceAll("P", "50");
        S = S.replaceAll("Q", "51");
        S = S.replaceAll("R", "52");
        S = S.replaceAll("S", "53");
        S = S.replaceAll("T", "54");
        S = S.replaceAll("U", "55");
        S = S.replaceAll("V", "56");
        S = S.replaceAll("W", "57");
        S = S.replaceAll("X", "58");
        S = S.replaceAll("Y", "59");
        S = S.replaceAll("Z", "5A");


        return S;
    }



    public static void main(String[] args) throws FileNotFoundException {


        System.out.println("SIC/XE Project");
        System.out.println("For the code read from file samplecode.txt: check the output locations in file out.txt and the symbol table in symbTable.txt");
        File samplecode = new File("samplecode.txt");
        File out = new File("out.txt");
        File symbTable = new File("symbTable.txt");
        File HTMERD = new File("HTMERD.txt");
        Scanner scanCode = new Scanner(samplecode);
        Scanner outfile = new Scanner(out);
        PrintWriter outprint = new PrintWriter(out);
        PrintWriter symbTableprint = new PrintWriter(symbTable);
        PrintWriter htmerd = new PrintWriter(HTMERD);
        ArrayList<String> location = new ArrayList<>();
        ArrayList<String> col1 = new ArrayList<>();  //---symbols-------
        ArrayList<String> col2 = new ArrayList<>();  //---instructions---
        ArrayList<String> col3 = new ArrayList<>();  //---operands-------
        ArrayList<String> menomenics = new ArrayList<>();
        ArrayList<String> format = new ArrayList<>();
        ArrayList<String> opcode = new ArrayList<>();

        // Instrucion set
        menomenics.add("ADD");
        format.add("3/4");
        opcode.add("18");

        menomenics.add("ADDF");
        format.add("3/4");
        opcode.add("58");

        menomenics.add("ADDR");
        format.add("2");
        opcode.add("90");

        menomenics.add("AND");
        format.add("3/4");
        opcode.add("40");

        menomenics.add("CLEAR");
        format.add("2");
        opcode.add("B4");

        menomenics.add("COMP");
        format.add("3/4");
        opcode.add("28");

        menomenics.add("COMPF");
        format.add("3/4");
        opcode.add("88");

        menomenics.add("COMPR");
        format.add("2");
        opcode.add("A0");

        menomenics.add("DIV");
        format.add("3/4");
        opcode.add("24");

        menomenics.add("DIVF");
        format.add("3/4");
        opcode.add("64");

        menomenics.add("DIVR");
        format.add("2");
        opcode.add("9C");

        menomenics.add("FIX");
        format.add("1");
        opcode.add("C4");

        menomenics.add("FLOAT");
        format.add("1");
        opcode.add("C0");

        menomenics.add("HIO");
        format.add("1");
        opcode.add("F4");

        menomenics.add("J");
        format.add("3/4");
        opcode.add("3C");

        menomenics.add("JEQ");
        format.add("3/4");
        opcode.add("30");

        menomenics.add("JGT");
        format.add("3/4");
        opcode.add("34");

        menomenics.add("JLT");
        format.add("3/4");
        opcode.add("38");

        menomenics.add("JSUB");
        format.add("3/4");
        opcode.add("48");

        menomenics.add("LDA");
        format.add("3/4");
        opcode.add("00");

        menomenics.add("LDB");
        format.add("3/4");
        opcode.add("68");

        menomenics.add("LDCH");
        format.add("3/4");
        opcode.add("50");

        menomenics.add("LDF");
        format.add("3/4");
        opcode.add("70");

        menomenics.add("LDL");
        format.add("3/4");
        opcode.add("08");

        menomenics.add("LDS");
        format.add("3/4");
        opcode.add("6C");

        menomenics.add("LDT");
        format.add("3/4");
        opcode.add("74");

        menomenics.add("LDX");
        format.add("3/4");
        opcode.add("04");

        menomenics.add("LPS");
        format.add("3/4");
        opcode.add("D0");

        menomenics.add("MUL");
        format.add("3/4");
        opcode.add("20");

        menomenics.add("MULF");
        format.add("3/4");
        opcode.add("60");

        menomenics.add("MULR");
        format.add("2");
        opcode.add("98");

        menomenics.add("NORM");
        format.add("1");
        opcode.add("C8");

        menomenics.add("OR");
        format.add("3/4");
        opcode.add("44");

        menomenics.add("RD");
        format.add("3/4");
        opcode.add("D8");

        menomenics.add("RMO");
        format.add("2");
        opcode.add("AC");

        menomenics.add("RSUB");
        format.add("3/4");
        opcode.add("4C");

        menomenics.add("SHIFTL");
        format.add("2");
        opcode.add("A4");

        menomenics.add("SHIFTR");
        format.add("2");
        opcode.add("A8");

        menomenics.add("SIO");
        format.add("1");
        opcode.add("F0");

        menomenics.add("SSK");
        format.add("3/4");
        opcode.add("EC");

        menomenics.add("STA");
        format.add("3/4");
        opcode.add("0C");

        menomenics.add("STB");
        format.add("3/4");
        opcode.add("78");

        menomenics.add("STCH");
        format.add("3/4");
        opcode.add("54");

        menomenics.add("STF");
        format.add("3/4");
        opcode.add("80");

        menomenics.add("STI");
        format.add("3/4");
        opcode.add("D4");

        menomenics.add("STL");
        format.add("3/4");
        opcode.add("14");

        menomenics.add("STS");
        format.add("3/4");
        opcode.add("7C");

        menomenics.add("STSW");
        format.add("3/4");
        opcode.add("E8");

        menomenics.add("STT");
        format.add("3/4");
        opcode.add("84");

        menomenics.add("STX");
        format.add("3/4");
        opcode.add("10");

        menomenics.add("SUB");
        format.add("3/4");
        opcode.add("1C");

        menomenics.add("SUBF");
        format.add("3/4");
        opcode.add("5C");

        menomenics.add("SUBR");
        format.add("2");
        opcode.add("94");

        menomenics.add("SVC");
        format.add("2");
        opcode.add("B0");

        menomenics.add("TD");
        format.add("3/4");
        opcode.add("E0");

        menomenics.add("TIO");
        format.add("1");
        opcode.add("F8");

        menomenics.add("TIX");
        format.add("3/4");
        opcode.add("2C");

        menomenics.add("TIXR");
        format.add("2");
        opcode.add("B8");

        menomenics.add("WD");
        format.add("3/4");
        opcode.add("DC");


        //-----------Reading assembly code from file------------
        while (scanCode.hasNext()) {
            String line = scanCode.nextLine();
            //System.out.println(line);
            String[] codecols = line.split(" ");
            //System.out.println(codecols.length);
            //System.out.println(codecols[codecols.length - 2]);
            if (codecols.length == 3) {
                col1.add(codecols[0]);
                col2.add(codecols[1]);
                col3.add(codecols[2]);
            }
            else {

                    col1.add(null);
                    col2.add(codecols[codecols.length - 2]);
                    col3.add(codecols[codecols.length - 1]);

            }
        }
        System.out.println(col2);






        //---------------------------------getting opcodes and formats for my sample code
        int i=0;
        int j=0;
        ArrayList<String> sampleopcode = new ArrayList<String>();
        ArrayList<String> sampleformat = new ArrayList<String>();
        while (i<col2.size()-1)
        {
            //System.out.println(col2.get(i));
            j=0;
            if(col2.get(i).equals("RSUB"))
            {
                sampleopcode.add("4C");
                sampleformat.add("3");
            }
            else while (j<menomenics.size())
            {
                if(menomenics.get(j).equals(col2.get(i)))
                {
                    sampleopcode.add(opcode.get(j));
                    sampleformat.add(format.get(j));
                    if(sampleformat.get(i).equals("3/4")) sampleformat.set(i,"3");
                    break;
                }
                else if (col2.get(i).equals("BASE")) {sampleformat.add(null);sampleopcode.add(null); break;}

                else if (col2.get(i).charAt(0)=='+'||col2.get(i).charAt(0)=='&'||col2.get(i).charAt(0)=='$')        ////////////////
                {

                    if(menomenics.get(j).equals(col2.get(i).substring(1)))
                    {
                        sampleopcode.add(opcode.get(j));
                        if(col2.get(i).charAt(0)=='+') sampleformat.add("4");                                       ///////////////
                        else if(col2.get(i).charAt(0)=='&') sampleformat.add("5");
                        else if(col2.get(i).charAt(0)=='$') sampleformat.add("6");
                        break;
                    }
                    else ;
                }
                else if (col2.get(i).equals("START")||                                                              //////////////
                        col2.get(i).equals("RESW")||
                        col2.get(i).equals("RESB")||
                        col2.get(i).equals("BYTE")||
                        col2.get(i).equals("WORD"))
                {
                    sampleopcode.add(null);
                    sampleformat.add(null);
                    break;
                }
                else ;

                j++;
            }
            i++;

        }

        //------------------------ Looping on instructions in menomenics array list then finding the corresponding format or location increment ------------


        location.add(col3.get(0));
        location.add(col3.get(0));
         i = 2;
         j = 0;
        int count = 0;
        String debug = "";
        while (i < col2.size()) {
            int locparse = Integer.parseInt(location.get(i - 1));
            j = 0;
            String inst = col2.get(i - 1);
            if (inst.equals("RESW")) {
                String words = col3.get(i - 1);
                try {
                    int bytes = Integer.parseInt(words);
                    bytes = bytes * 3;
                    location.add(Integer.toString(locparse + bytes));
                } catch (NumberFormatException e) {
                    System.out.println("ERROR");
                }
            }
            else if(inst.equals("BASE"))
            {
                location.add(Integer.toString(locparse + 0));
            }

            else if (inst.equals("RESB")) {
                String bytes = col3.get(i - 1);
                try {
                    int x = Integer.parseInt(bytes);
                    location.add(Integer.toString(locparse + x));
                } catch (NumberFormatException e) {
                    System.out.println("ERROR");
                }
            }
            else if (inst.equals("BYTE")) {
                int bytes = 0;
                char x = col3.get(i - 1).charAt(0);
                if (x == 'C') {
                    bytes = col3.get(i - 1).length() - 3;
                    location.add(Integer.toString(locparse + bytes));
                } else if (x == 'X') {
                    int c = 0;
                    int length_col3 = col3.get(i - 1).length(); //length of whole column
                    for (int n = 0; n < (col3.get(i - 1).length()); n++) {
                        if (col3.get(i - 1).charAt(n) == 'X')
                            c++; //Number of X's
                    }
                    c = c + (c * 2) + (c - 1); //length of uncounted characters
                    // c-1:number of commas
                    // c*2: number of single quotes
                    bytes = length_col3 - c;
                    bytes = bytes / 2;
                    location.add(Integer.toString(locparse + bytes));

                }
            }
            else if (inst.equals("WORD")) {
                location.add(Integer.toString(locparse + 3));
            }
            else if (sampleformat.get(i-1)=="5") {
                location.add(Integer.toString(locparse + 3)); //break;
            }
            else if (sampleformat.get(i-1)=="6") {
                location.add(Integer.toString(locparse + 4)); //break;
            }
            else if (sampleformat.get(i-1)=="4") {
                location.add(Integer.toString(locparse + 4)); //break;
            }
            else if (sampleformat.get(i-1)=="1") {
                location.add(Integer.toString(locparse + 1));
                System.out.println("Hi i am format 1");
            }
            else if (sampleformat.get(i-1)=="2") {
                location.add(Integer.toString(locparse + 2));
            }
            else if (sampleformat.get(i-1)=="3") {
                location.add(Integer.toString(locparse + 3));
            }


            i++;
        }





        for (i = 0; i < location.size(); i++) {
            String hex = Integer.toHexString(Integer.parseInt(location.get(i)));

            if (hex.length() == 1)
                hex = "000" + hex;
            else if (hex.length() == 2)
                hex = "00" + hex;
            else if (hex.length() == 3)
                hex = "0" + hex;
            location.set(i, hex.toUpperCase(Locale.ROOT));
        }
        System.out.println(col1);
        System.out.println(col2);
        System.out.println(col3);
        System.out.println(location);
        System.out.println(format);






        //----------------------------------Pass 2-------------------------------------
        i = 0;


        ArrayList<String> binaryOpcode = new ArrayList<String>();
        while(i<opcode.size())
        {
            binaryOpcode.add(opcode.get(i));
            i++;
        }
        i=0;
        while (i < opcode.size()) {
            try {
                String bin = binaryOpcode.get(i);
                bin = bin.replaceAll("0", "0000");
                bin = bin.replaceAll("1", "0001");
                bin = bin.replaceAll("2", "0010");
                bin = bin.replaceAll("3", "0011");
                bin = bin.replaceAll("4", "0100");
                bin = bin.replaceAll("5", "0101");
                bin = bin.replaceAll("6", "0110");
                bin = bin.replaceAll("7", "0111");
                bin = bin.replaceAll("8", "1000");
                bin = bin.replaceAll("9", "1001");
                bin = bin.replaceAll("A", "1010");
                bin = bin.replaceAll("B", "1011");
                bin = bin.replaceAll("C", "1100");
                bin = bin.replaceAll("D", "1101");
                bin = bin.replaceAll("E", "1110");
                bin = bin.replaceAll("F", "1111");
                binaryOpcode.set(i, bin);
                //System.out.println(opcode.get(i));
                i++;
            } catch (NumberFormatException e) {
                System.out.println("error");
                i++;
            }
        }
        i=0;

        ArrayList<String> binSampleOpcode = new ArrayList<String>();

        while(i<sampleopcode.size())                                                                                ///////////////
        {
            binSampleOpcode.add(sampleopcode.get(i));
            try {
                String bin = binSampleOpcode.get(i);
                bin = bin.replaceAll("0", "0000");
                bin = bin.replaceAll("1", "0001");
                bin = bin.replaceAll("2", "0010");
                bin = bin.replaceAll("3", "0011");
                bin = bin.replaceAll("4", "0100");
                bin = bin.replaceAll("5", "0101");
                bin = bin.replaceAll("6", "0110");
                bin = bin.replaceAll("7", "0111");
                bin = bin.replaceAll("8", "1000");
                bin = bin.replaceAll("9", "1001");
                bin = bin.replaceAll("A", "1010");
                bin = bin.replaceAll("B", "1011");
                bin = bin.replaceAll("C", "1100");
                bin = bin.replaceAll("D", "1101");
                bin = bin.replaceAll("E", "1110");
                bin = bin.replaceAll("F", "1111");
                binSampleOpcode.set(i, bin);

            } catch (NumberFormatException e) {
                System.out.println("error");

            }catch (NullPointerException e1) {


            }
            i++;
        }
        System.out.println(sampleopcode);
        System.out.println(sampleformat);
        System.out.println(binSampleOpcode);



        ArrayList<String> ObjectCode= new ArrayList<String>();
        ArrayList<String> Registers= new ArrayList<String>();
        ArrayList<String> RegNumbers= new ArrayList<String>();
        Registers.add("X"); RegNumbers.add("1");
        Registers.add("A"); RegNumbers.add("0");
        Registers.add("PC"); RegNumbers.add("8");
        Registers.add("B"); RegNumbers.add("3");
        Registers.add("S"); RegNumbers.add("4");
        Registers.add("T"); RegNumbers.add("5");
        Registers.add("F"); RegNumbers.add("6");
        Registers.add("L"); RegNumbers.add("2");
        Registers.add("SW"); RegNumbers.add("9");


        i=0;
        j=0;
        int z=0;


        while (i<sampleformat.size())
        {
            if(sampleformat.get(i)=="1")
            {
                ObjectCode.add(sampleopcode.get(i));
            }
            else if(sampleformat.get(i)=="2")
            {
                if (col3.get(i).contains(","))
                {
                    String[] regs = col3.get(i).split(",");
                    j=0;
                    while (j<Registers.size())
                    {
                        if (Registers.get(j).equals(regs[0])) {break;}
                        j++;
                    }
                    z=0;
                    while (z<Registers.size())
                    {
                        if (Registers.get(z).equals(regs[1])) {break;}
                        z++;
                    }

                    ObjectCode.add(sampleopcode.get(i)+RegNumbers.get(j)+RegNumbers.get(z));
                }
                else
                {

                    j=0;
                    while (j<Registers.size())
                    {

                        if (Registers.get(j).equals(col3.get(i))) {ObjectCode.add(sampleopcode.get(i)+RegNumbers.get(j)+"0"); break;}
                        j++;
                    }
                }
            }
            else if (col2.get(i).equals("RSUB"))
                ObjectCode.add("4F0000");
            else if(sampleformat.get(i)=="3") {
                String objcode = "";
                String subopcode = binSampleOpcode.get(i);
                subopcode = subopcode.substring(0, 6);
                objcode = objcode + subopcode;
                if (col3.get(i).charAt(0) == '#') {
                    objcode = objcode + "0" + "1";
                } else if (col3.get(i).charAt(0) == '@') {
                    objcode = objcode + "1" + "0";
                } else {
                    objcode = objcode + "1" + "1";
                }
                if (col3.get(i).contains(",X")) {
                    objcode = objcode + "1";
                } else objcode = objcode + "0";
                //base or pc address

                int displacement = 0;
                int decimaloperand = 0;
                int nextline;
                boolean flag=false;
                j = 0;
                int displacement1;
                while (j < col1.size()) {
                    if (col3.get(i).charAt(0)=='#'||col3.get(i).charAt(0)=='@')
                    {
                        if(col3.get(i).substring(1).equals(col1.get(j)))
                            decimaloperand = Integer.parseInt(location.get(j), 16);

                        try {
                           Integer.parseInt(col3.get(i).substring(1));
                           flag=true;
                        }
                        catch (NumberFormatException e)
                        {
                            flag=false;
                        }
                        if(flag==true)
                        {
                             //displacement1=Integer.parseInt(col3.get(i).substring(1));
                             //ObjectCode.add(objcode+displacement1);
                             break;

                        }



                    }
                    else if (col3.get(i).contains(",X"))
                    {
                        if(col3.get(i).substring(0,col3.get(i).length()-2).equals(col1.get(j)))
                            decimaloperand=Integer.parseInt(location.get(j),16) ;
                    }
                    else if (col3.get(i).equals(col1.get(j))) {
                        decimaloperand = Integer.parseInt(location.get(j), 16);
                        //System.out.println(decimaloperand);
                    }
                    j++;
                }
                nextline = Integer.parseInt(location.get(i + 1), 16);
                if (!flag)
                    displacement = decimaloperand - nextline;
                else if (flag)
                    displacement=Integer.parseInt(col3.get(i).substring(1));
                //String disp = Integer.toHexString(displacement);
                //disp = disp.toUpperCase(Locale.ROOT);
                //System.out.println(disp);
                if(flag) objcode = objcode + "00";
                else if(displacement>-2048 & displacement<2047)
                    objcode = objcode + "01";
                else
                    {
                        objcode = objcode + "10";
                        int k=0;
                        int locationcol3base=0;
                        String col3base="";
                        while (k<col2.size())
                        {
                            if(col2.get(k).equals("BASE"))
                              col3base=col3.get(k);
                            k++;
                        }
                        k=0;

                        while (k<col1.size())
                        {
                            if(col1.get(k)!=null && col1.get(k).equals(col3base))
                                locationcol3base=Integer.parseInt(location.get(k), 16);
                                k++;
                        }
                        displacement= decimaloperand-locationcol3base;

                    }
                String disp = Integer.toHexString(displacement);
                disp = disp.toUpperCase(Locale.ROOT);
                if(disp.length()==2)
                    disp="0"+disp;
                else if(disp.length()==1)
                    disp="00"+disp;
                else if(disp.length()>3)
                    disp=disp.substring(5,8);
                objcode=objcode+"0";
                objcode=binaryToHexa(objcode);
                ObjectCode.add(objcode+disp);

            }
            else if(sampleformat.get(i)=="4") {

                String objcode = "";
                String subopcode=binSampleOpcode.get(i);
                subopcode=subopcode.substring(0,6);
                objcode = objcode + subopcode;
                boolean flag=false;
                if(col3.get(i).charAt(0)=='#')
                {
                    objcode=objcode+"0"+"1";
                }
                else if(col3.get(i).charAt(0)=='@')
                {
                    objcode=objcode+"1"+"0";
                }
                else {
                    objcode=objcode+"1"+"1";
                }

                if (col3.get(i).contains(",X"))
                {
                    objcode=objcode+"1";
                }
                else objcode=objcode+"0";

                objcode=objcode+"001";

                String address="";
                j=0;
                while (j<col1.size())
                {
                    if (col3.get(i).charAt(0)=='#'||col3.get(i).charAt(0)=='@')
                    {
                        if(col3.get(i).substring(1).equals(col1.get(j)))
                        address=location.get(j);
                try {
                    Integer.parseInt(col3.get(i).substring(1));
                    flag=true;
                }
                catch (NumberFormatException e)
                {
                    flag=false;
                }
                if(flag==true)
                {

                    break;

                }
                    }
                    else if (col3.get(i).contains(",X"))
                    {
                        if(col3.get(i).substring(0,col3.get(i).length()-2).equals(col1.get(j)))
                            address=location.get(j);
                    }

                    else if(col3.get(i).equals(col1.get(j)))
                       address=location.get(j);
                    j++;
                }

                if (flag)
                    address=Integer.toHexString(Integer.parseInt(col3.get(i).substring(1)));
                if (address.length()<5){
                    address="0"+address;}


                objcode=binaryToHexa(objcode);
                ObjectCode.add(objcode+address);

            }
//            else if(sampleformat.get(i)=="5") {
//                String objcode = "";
//                String subopcode = binSampleOpcode.get(i);
//                subopcode = subopcode.substring(0, 6);
//                objcode = objcode + subopcode;
////
//
//
//
//
//                //base or pc address
//
//                int displacement = 0;
//                int decimaloperand = 0;
//                int nextline;
//                boolean flag=false;
//                j = 0;
//                int displacement1;
//                while (j < col1.size()) {
//                    if (col3.get(i).charAt(0)=='#'||col3.get(i).charAt(0)=='@')
//                    {
//                        if(col3.get(i).substring(1).equals(col1.get(j)))
//                            decimaloperand = Integer.parseInt(location.get(j), 16);
//
//                        try {
//                            Integer.parseInt(col3.get(i).substring(1));
//                            flag=true;
//                        }
//                        catch (NumberFormatException e)
//                        {
//                            flag=false;
//                        }
//                        if(flag==true)
//                        {
//                            //displacement1=Integer.parseInt(col3.get(i).substring(1));
//                            //ObjectCode.add(objcode+displacement1);
//                            break;
//
//                        }
//
//
//
//                    }
//                    else if (col3.get(i).contains(",X"))
//                    {
//                        if(col3.get(i).substring(0,col3.get(i).length()-2).equals(col1.get(j)))
//                            decimaloperand=Integer.parseInt(location.get(j),16) ;
//                    }
//                    else if (col3.get(i).equals(col1.get(j))) {
//                        decimaloperand = Integer.parseInt(location.get(j), 16);
//                        //System.out.println(decimaloperand);
//                    }
//                    j++;
//                }
//                nextline = Integer.parseInt(location.get(i + 1), 16);
//                if (!flag)
//                    displacement = decimaloperand - nextline;
//                else if (flag)
//                    displacement=Integer.parseInt(col3.get(i).substring(1));
//                //String disp = Integer.toHexString(displacement);
//                //disp = disp.toUpperCase(Locale.ROOT);
//                //System.out.println(disp);
//                if(flag) objcode = objcode + "00";
//                else if(displacement>-2048 & displacement<2047)
//                    objcode = objcode + "01";
//                else
//                {
//                    objcode = objcode + "10";
//                    int k=0;
//                    int locationcol3base=0;
//                    String col3base="";
//                    while (k<col2.size())
//                    {
//                        if(col2.get(k).equals("BASE"))
//                            col3base=col3.get(k);
//                        k++;
//                    }
//                    k=0;
//
//                    while (k<col1.size())
//                    {
//                        if(col1.get(k)!=null && col1.get(k).equals(col3base))
//                            locationcol3base=Integer.parseInt(location.get(k), 16);
//                        k++;
//                    }
//                    displacement= decimaloperand-locationcol3base;
//
//                }
//
//                String disp = Integer.toHexString(displacement);
//                disp = disp.toUpperCase(Locale.ROOT);
//                if(disp.length()==2)
//                    disp="0"+disp;
//                else if(disp.length()==1)
//                    disp="00"+disp;
//                else if(disp.length()>3)
//                    disp=disp.substring(5,8);
//
//                if(displacement%2!=0) F1="0";
//                if(displacement>0) F1="0";
//                if(displacement==0) F3="1";
//                objcode = objcode + F1 + F2;
//                if (col3.get(i).contains(",X")) {
//                    objcode = objcode + "1";
//                } else objcode = objcode + "0";
//
//
//                objcode=objcode+F3;
//                objcode=binaryToHexa(objcode);
//                ObjectCode.add(objcode+disp);
//
//            }
            else if(sampleformat.get(i)=="5") {
                String objcode = "";
                String subopcode = binSampleOpcode.get(i);
                subopcode = subopcode.substring(0, 6);
                objcode = objcode + subopcode;
                String F1="1",F2="1",F3="0";
                String xflag="0";
                String bflag="0";
                String pflag="0";

                if (col3.get(i).contains(",X")) {
                    xflag="1";
                } else xflag="0";;
                //base or pc address

                int displacement = 0;
                int decimaloperand = 0;
                int nextline;
                boolean flag=false;
                j = 0;
                int displacement1;
                while (j < col1.size()) {
                    if (col3.get(i).charAt(0)=='#'||col3.get(i).charAt(0)=='@')
                    {
                        if(col3.get(i).substring(1).equals(col1.get(j)))
                            decimaloperand = Integer.parseInt(location.get(j), 16);

                        try {
                            Integer.parseInt(col3.get(i).substring(1));
                            flag=true;
                        }
                        catch (NumberFormatException e)
                        {
                            flag=false;
                        }
                        if(flag==true)
                        {
                            //displacement1=Integer.parseInt(col3.get(i).substring(1));
                            //ObjectCode.add(objcode+displacement1);
                            break;

                        }



                    }
                    else
                        if (col3.get(i).contains(",X"))
                    {
                        if(col3.get(i).substring(0,col3.get(i).length()-2).equals(col1.get(j)))
                            decimaloperand=Integer.parseInt(location.get(j),16) ;
                    }
                    else if (col3.get(i).equals(col1.get(j))) {
                        decimaloperand = Integer.parseInt(location.get(j), 16);
                        //System.out.println(decimaloperand);
                    }
                    j++;
                }
                nextline = Integer.parseInt(location.get(i + 1), 16);
                if (!flag)
                    displacement = decimaloperand - nextline;
                else if (flag)
                    displacement=Integer.parseInt(col3.get(i).substring(1));
                //String disp = Integer.toHexString(displacement);
                //disp = disp.toUpperCase(Locale.ROOT);
                //System.out.println(disp);
                if(flag) {
                    bflag="0";
                    pflag="0";
                }
                else if(displacement>-2048 & displacement<2047)
                {
                    bflag="0";
                    pflag="1";
                }
                else
                {
                    bflag="1";
                    pflag="0";
                    int k=0;
                    int locationcol3base=0;
                    String col3base="";
                    while (k<col2.size())
                    {
                        if(col2.get(k).equals("BASE"))
                            col3base=col3.get(k);
                        k++;
                    }
                    k=0;

                    while (k<col1.size())
                    {
                        if(col1.get(k)!=null && col1.get(k).equals(col3base))
                            locationcol3base=Integer.parseInt(location.get(k), 16);
                        k++;
                    }
                    displacement= decimaloperand-locationcol3base;

                }
                String disp = Integer.toHexString(displacement);
                disp = disp.toUpperCase(Locale.ROOT);
                if(disp.length()==2)
                    disp="0"+disp;
                else if(disp.length()==1)
                    disp="00"+disp;
                else if(disp.length()>3)
                    disp=disp.substring(5,8);
                if(displacement%2!=0) F1="0";
                if(displacement>0) F1="0";
                if(displacement==0) F3="1";
                objcode=objcode+F1+F2+xflag+bflag+pflag+F3;
                objcode=binaryToHexa(objcode);
                ObjectCode.add(objcode+disp);

            }
            else if (sampleformat.get(i)=="6")
            {
                String objcode = "";
                boolean flag=false;
                String subopcode=binSampleOpcode.get(i);
                subopcode=subopcode.substring(0,6);
                objcode = objcode + subopcode;
                if(col3.get(i).charAt(0)=='#')
                {
                    objcode=objcode+"0"+"1";
                }
                else if(col3.get(i).charAt(0)=='@')
                {
                    objcode=objcode+"1"+"0";
                }
                else {
                    objcode=objcode+"1"+"1";
                }

                if (col3.get(i).contains(",X"))
                {
                    objcode=objcode+"1";
                }
                else objcode=objcode+"0";

                String address="";
                j=0;
                while (j<col1.size())
                {
                    if (col3.get(i).charAt(0)=='#'||col3.get(i).charAt(0)=='@')
                    {
                        if(col3.get(i).substring(1).equals(col1.get(j)))
                            address=location.get(j);
                        try {
                            Integer.parseInt(col3.get(i).substring(1));
                            flag=true;
                        }
                        catch (NumberFormatException e)
                        {
                            flag=false;
                        }
                        if(flag)
                        {
                            break;
                        }
                    }
                    else if (col3.get(i).contains(",X"))
                    {
                        if(col3.get(i).substring(0,col3.get(i).length()-2).equals(col1.get(j)))
                            address=location.get(j);
                    }

                    else if(col3.get(i).equals(col1.get(j)))
                        address=location.get(j);
                    j++;
                }

                if (flag)
                    address=Integer.toHexString(Integer.parseInt(col3.get(i).substring(1)));
                if (address.length()<5){
                    address="0"+address;}

                //objcode=binaryToHexa(objcode);


                int addressint=Integer.parseInt(address);
                String F4="";
                String F5="";
                String F6="";
                if(addressint%2==0)
                    F4="0";
                else{ F4="1";}

                objcode=objcode+F4;

                if(addressint==0)
                    F5="0";
                else{F5="1";}
                objcode=objcode+F5;
                int m=0;
                while (m<col2.size())
                {
                    if (col3.get(i).equals(col3.get(m))){
                        if(col2.get(i).equals("BASE"))
                        {
                            F6="0";
                        }
                        else F6="1";
                    }
                    m++;
                }
                objcode=objcode+F6;
                objcode=binaryToHexa(objcode);
                ObjectCode.add(objcode+address);

            }


            else if (col2.get(i).equals("BASE")||col2.get(i).equals("RESB")||col2.get(i).equals("RESW")||col2.get(i).equals("START")||col2.get(i).equals("END")||col2.get(i).equals("EXTREF")||col2.get(i).equals("EXTDEF")||col2.get(i).equals("EQU")||col2.get(i).equals("LTORG")||col2.get(i).equals("CSECT"))
                ObjectCode.add("No object code");

            else if(col2.get(i).equals("BYTE")) {
                String x="";
                if (col3.get(i).charAt(0)=='X') {
                    int countX=0;
                    while (countX<col3.get(i).length())
                    {
                        x += col3.get(i).substring(2+countX,4+countX);
                        countX+=6;
                    }
                    ObjectCode.add(x);
                }


                else if (col3.get(i).charAt(0)=='C') {
                    x = col3.get(i).substring(2,5);
                    x=stringtoascii(x);
                    ObjectCode.add(x);
                }
            }

            else if(col2.get(i).equals("WORD")) {
                String x = col3.get(i);
                String wordoperand = Integer.toHexString(Integer.parseInt(x));
                if (wordoperand.length() == 5)
                    wordoperand = "0" + wordoperand;
                else if (wordoperand.length() == 4)
                    wordoperand = "00" + wordoperand;
                else if (wordoperand.length() == 3)
                    wordoperand = "000" + wordoperand;
                else if (wordoperand.length() == 2)
                    wordoperand = "0000" + wordoperand;
                else if (wordoperand.length() == 1)
                    wordoperand = "00000" + wordoperand;

                ObjectCode.add(wordoperand);
            }
            else ObjectCode.add("NOT YET");
            i++;

        }
        ObjectCode.add("No Object code");
        System.out.println(ObjectCode);

        System.out.println(col1.size());
        System.out.println(ObjectCode.size());




        //--------HETMERD RECORD------------
        String endrecordlocation="";
        endrecordlocation=location.get(0);
        if (endrecordlocation.length()==5)
            endrecordlocation="0"+endrecordlocation;
        else if (endrecordlocation.length()==4)
            endrecordlocation="00"+endrecordlocation;
        else if (endrecordlocation.length()==3)
            endrecordlocation="000"+endrecordlocation;
        else if (endrecordlocation.length()==2)
            endrecordlocation="0000"+endrecordlocation;
        else if (endrecordlocation.length()==1)
            endrecordlocation="00000"+endrecordlocation;

        String programname="";
        programname=col1.get(0);
        if(programname.length()==5)
            programname=programname+"X";
        else if(programname.length()==4)
            programname=programname+"XX";
        else if(programname.length()==3)
            programname=programname+"XXX";
        else if(programname.length()==2)
            programname=programname+"XXXX";
        else if(programname.length()==1)
            programname=programname+"XXXXX";

        String sizeofprogram="";
        int size;
        j=0;

        while (j<location.size())
        {
            sizeofprogram=location.get(j);
            j++;
        }
        System.out.println(sizeofprogram);
        size=Integer.parseInt(sizeofprogram,16)-Integer.parseInt(endrecordlocation,16);
        sizeofprogram=Integer.toHexString(size);
        sizeofprogram=sizeofprogram.toUpperCase(Locale.ROOT);
        if(sizeofprogram.length()==5)
            sizeofprogram="0"+sizeofprogram;
        else if(sizeofprogram.length()==4)
            sizeofprogram="00"+sizeofprogram;
        else if (sizeofprogram.length()==3)
            sizeofprogram="000"+sizeofprogram;
        else if (sizeofprogram.length()==2)
            sizeofprogram="0000"+sizeofprogram;
        else if (sizeofprogram.length()==1)
            sizeofprogram="00000"+sizeofprogram;

        //System.out.println(size);
        //-----HEAD RECORD--------------
        htmerd.println("H"+" "+programname+" "+endrecordlocation+" "+sizeofprogram);


        //------TEXT RECORD--------
        int sizerecord=0;
        int sizerecord1=0;
        String textrecord="";
        String startingaddress="";
        i=1;
        while (i<col2.size())
        {

            if(sizerecord1==0) startingaddress=location.get(i-1);
            if(!(col2.get(i).equals("RESW")) && !(col2.get(i).equals("RESB")) && !(col2.get(i).equals("END")))
            {

                sizerecord1= (int) Math.ceil(textrecord.length()/2.0);
                if(!col2.get(i).equals("BASE")) sizerecord= (int) Math.ceil((textrecord+ObjectCode.get(i)).length()/2.0);
                if(col2.get(i).equals("BASE"));
                else if(sizerecord<=30)
                    textrecord+=ObjectCode.get(i);
                else
                {
                    htmerd.println("T"+" 00"+ startingaddress+" " +Integer.toHexString(sizerecord1).toUpperCase(Locale.ROOT)+" "+ textrecord);
                    textrecord=ObjectCode.get(i);
                    sizerecord1=0;
                    sizerecord=0;
                }

            }

            else
            {
                if(!textrecord.equals(""))
                    htmerd.println("T"+" 00"+startingaddress+" " +Integer.toHexString(sizerecord)+" "+ textrecord);
                textrecord="";
                sizerecord=0;
            }
            i++;
        }


        //MODIFICATION RECORD------------
        i=0;
        String addressmodified="";
        int modified;
        while (i<sampleformat.size()) {
            if (col2.get(i).charAt(0)=='+' && col3.get(i).charAt(0) != '#')
            {
                addressmodified = location.get(i);
                modified = Integer.parseInt(addressmodified,16);
                modified = modified + 1;
                addressmodified = Integer.toHexString(modified);
                if(addressmodified.length()==5)
                    addressmodified="0"+addressmodified;
                else if(addressmodified.length()==4)
                    addressmodified="00"+addressmodified;
                else if(addressmodified.length()==3)
                    addressmodified="000"+addressmodified;
                else if(addressmodified.length()==2)
                    addressmodified="0000"+addressmodified;
                else if(addressmodified.length()==1)
                    addressmodified="00000"+addressmodified;
                htmerd.println("M"+" "+"05"+" "+addressmodified );
            }
            i++;
        }



        //---------END RECORD------------
        htmerd.println("E"+" "+endrecordlocation);


        for (i = 0; i < col1.size(); i++) {
            if (col2.get(i).equals("BASE"))
            {
                outprint.println("NULL" + " " + col1.get(i) + " " + col2.get(i) + " " + col3.get(i)+"\t\t"+ObjectCode.get(i));
            }
            else
                outprint.println(location.get(i) + " " + col1.get(i) + " " + col2.get(i) + " " + col3.get(i)+"\t\t"+ObjectCode.get(i));
            if (col1.get(i) != null) {
                symbTableprint.println(col1.get(i) + " " + location.get(i));
            }
        }




        htmerd.close();
        outprint.close();
        symbTableprint.close();
    }}