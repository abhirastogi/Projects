import java.util.*;
import java.io.*;
class Bancroft
{
    static String sfaq="";
    static String uarray[];
    static int i=0;
    static String ankey;
    static String id;
    static String pass;
    static int flag=0;
    static String head[];
    
    static void main()throws IOException//Welcome screen
    {   int i=0;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\f\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t\t\t\t\t\t$$$$$$$ ");             
        System.out.println("\t\t\t\t\t\t\t$$   $$                                                 $$$    $     ");       
        System.out.println("\t\t\t\t\t\t\t$$   $$    $$$$$$$  $$$$$$   $$$$$$$  $$ $$     $$$     $  $  $$$$   ");
        System.out.println("\t\t\t\t\t\t\t$$$$$$$$        $   $    $  $         $$  $   $   $    $      $    ");
        System.out.println("\t\t\t\t\t\t\t$$     $$  $$$$$$$   $    $  $         $      $     $  $$$$    $          ");
        System.out.println("\t\t\t\t\t\t\t$$     $$  $     $   $    $  $         $       $   $    $      $  $ ");
        System.out.println("\t\t\t\t\t\t\t$$$$$$$$$  $$$$$$$   $    $  $$$$$$$   $        $$$     $      $$$   ");
        System.out.println("\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\n\t\t\t\t\t\t\t\t\t%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("\t\t\t\t\t\t\t\t\t%      1)Login                    %");
        System.out.println("\t\t\t\t\t\t\t\t\t%      2)Create Savings' Account  %");
        System.out.println("\t\t\t\t\t\t\t\t\t%      3)Help                     %");
        System.out.println("\t\t\t\t\t\t\t\t\t%      4)Exit                     %");
        System.out.println("\t\t\t\t\t\t\t\t\t%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        do{
            int ch=0;
            do{try{
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t");
                ch=Integer.parseInt(in.readLine());
                flag=0;}
                catch(Exception e)
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\tInvalid choice");
                    System.out.println("\t\t\t\t\t\t\t\t\t\tRe-enter choice");
                    flag=1;
                }
            }while(flag==1);
            flag=0;
            switch(ch)
            {
                case 1:
                {
                    signIn();
                }
                break;
                case 2:
                {
                    System.out.println("Loading...");
                    for(i=0;i<=100000000;i++)
                    {}
                    signUp();
                }
                break;
                case 3:
                {
                    faq();
                }
                break;
                case 4:
                {
                    flag=1;
                    while(flag==1)
                    {
                        System.out.println("\t\t\t\t\t\t\t\t\tDo you really want to exit?(Y/N)"); 
                        System.out.print("\t\t\t\t\t\t\t\t\t\t\t");
                        String ext=in.readLine();
                        if(ext.charAt(0)=='y'||ext.charAt(0)=='Y')
                        {break;
                        }
                        else if(ext.charAt(0)=='n'||ext.charAt(0)=='N')
                        {
                            main();
                        }
                        else 
                        {
                            System.out.println("\t\t\t\t\t\t\t\t\t\t    Wrong Input");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t     Re-Enter\n");
                            flag=1;
                        }
                    }
                    char copy=169;
                    System.out.println("\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\tThank you for using Bancroft");
                    System.out.println("\t\t\t\t\t\t\t\tBancroft v1.0 November 2010 "+copy+" Abhishek Rastogi");
                    System.out.println("\t\t\t\t\t\t\t\t      The Sanskaar Valley School, Bhopal");
                    System.out.println("\t\t\t\t\t\t\t\t              Class   10th B");
                    System.out.println("\t\t\t\t\t\t\t\t             Session 2010-2011");
                    System.out.println("\n\t\t\t\t\t\t    For Queries, Suggestions and Complaints contact info@bancroft.com ");             
                    System.exit(0);
                }
                break;
                default:
                {
                    System.out.println("\t\t\t\t\t\t\t\t\t\tWrong Input");
                    flag=1;
                }
            }
        }while(flag==1);
    }
    
    static void signIn()throws IOException//method for accepting username and password
    {
        int flag=0;
        BufferedReader signIn=new BufferedReader(new InputStreamReader(System.in));
        do
        {
            System.out.print("\t\t\tCustomer ID:");
            id=signIn.readLine();
            System.out.print("\t\t\t  Press ENTER to key-in your BPIN(password)!(it is case sensitive)");
            String ankey=signIn.readLine();
            System.out.print("\t\t\tBPIN(password):");
            pass=signIn.readLine();
            try
            {
                FileReader f=new FileReader(id+pass+".txt");
                BufferedReader br=new BufferedReader(f);
                flag=0;
            }
            catch(Exception E)
            {System.out.println("\t\t  Incorrect Ussername or Password");
                System.out.println("\t\t  Re-enter");
                flag=1;
            }
        }while(flag==1);
        FileReader farray=new FileReader(id+pass+".txt");
        BufferedReader brarray=new BufferedReader(farray);
        String uarray[]=new String[12];
        String tarray;
        for(int iarray=0;iarray<12;iarray++)
        {
            tarray=brarray.readLine();
            uarray[iarray]=tarray;
        }
        brarray.close();
        farray.close();
        System.out.print("\t\t\t  Press ENTER to view your Account");
        ankey=signIn.readLine();
        Calendar c=Calendar.getInstance();
        uarray[11]=c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR)+" "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE);
        FileWriter fw=new FileWriter(id+pass+".txt");
        BufferedWriter brw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(brw);
        for(int q=0;q<12;q++)
        {
            pw.println(uarray[q]);
        }
        pw.close();
        brw.close();
        account();
    }
    
    static void signUp()throws IOException//method for creating a new account
    {
        int flag=0;
        String acc=" ";
        String sacc=" ";
        int accno;
        System.out.println("\f");
        BufferedReader signUp=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\n\t\t\t\t|NEW SAVINGS' ACCOUNT|");
        System.out.println("\t\t\t\t----------------------");
        System.out.print("\n\tFirst Name:\t\t\t");
        String Fname=signUp.readLine();
        while(Fname.length()==0)
        {
            System.out.println("\t  First Name field is empty");
            System.out.println("\t  Re-Enter");
            System.out.print("\n\tFirst Name:\t\t\t");
            Fname=signUp.readLine();
        }
        System.out.print("\tMiddle Name:\t\t\t");
        String Midname=signUp.readLine();
        System.out.print("\tLast Name:\t\t\t");
        String Lname=signUp.readLine();
        while(Lname.length()==0)
        {
            System.out.println("\t  Last Name field is empty");
            System.out.println("\t  Re-Enter");
            System.out.print("\tLast Name:\t\t\t");
            Lname=signUp.readLine();
        }
        String gen;
        System.out.print("\tGender:(M/F):\t\t\t");
        gen=signUp.readLine();
        while(gen.length()==1)
        {
            if(gen.charAt(0)=='m'||gen.charAt(0)=='M'||gen.charAt(0)=='f'||gen.charAt(0)=='F')
            {break;
            }
            else
            {
                System.out.println("\t  Invalid Gender");
                System.out.println("\t  Re-Enter");
                System.out.print("\tGender:(M/F):\t\t\t");
                gen=signUp.readLine();
            }
        }
        String dob;
        do{ 
            flag=0;
            System.out.print("\tDate of Birth:(dd/mm/yyyy):\t");
            dob=signUp.readLine();
            if(dob.length()==10&&dob.charAt(2)=='/'&&dob.charAt(5)=='/')
            {flag=0;
            }
            else{
                System.out.println("\t  Wrong date input");
                System.out.println("\t  Re-enter:");
                flag=1;
            }
        }while(flag==1);
        flag=0;
        System.out.println("\t_________________________________________");
        System.out.print("\n\tPermanent Adress:\t\t");
        String addr=signUp.readLine();
        while(addr.length()==0)
        {
            System.out.println("\t  Address field is empty");
            System.out.println("\t  Re-Enter");
            System.out.print("\n\tPermanent Adress:\t\t");
            addr=signUp.readLine();
        }
        System.out.print("\tCity:\t\t\t\t");
        String city=signUp.readLine();
        while(city.length()==0)
        {
            System.out.println("\t  City field is empty");
            System.out.println("\t  Re-Enter");
            System.out.print("\tCity:\t\t\t\t");
            city=signUp.readLine();
        }
        System.out.print("\tPincode:\t\t\t");
        do{try{
            int pin=Integer.parseInt(signUp.readLine());
            System.out.println("\t_________________________________________");
            flag=0;}
            catch(Exception e)
            {
                System.out.println("\t  Invalid Pincode");
                System.out.println("\t  Re-enter Pincode");
                System.out.print("\tPincode:\t\t\t");
                flag=1;
            }
        }while(flag==1);
        String tep;int f;
        do
        {
            do{
                f=0;
                System.out.print("\n\tCustomer ID(8 characters):\t");
                acc=signUp.readLine();
                FileReader fuser=new FileReader("user.txt");
                BufferedReader d=new BufferedReader(fuser);
                while((tep=d.readLine())!=null)
                {
                    if (tep.equalsIgnoreCase(acc))
                    {f=1;
                        System.out.println("\t  ID Already Exist, Select another ID");
                        break;
                    }
                }
                d.close();
                fuser.close();
            }while(f==1);
            if(acc.length()!=8){
                System.out.println("\t  Invalid Customer ID");
                System.out.println("\t  Please Re-enter");
            }
        }while(acc.length()!=8);
        System.out.print("\tBPIN(password):\t\t\t");
        String pass=signUp.readLine();
        while(pass.length()==0)
        {
            System.out.println("\t  BIPINpassword) field is empty");
            System.out.println("\t  Re-Enter");
            System.out.print("\tBPIN(password):\t\t\t");
            pass=signUp.readLine();
        }
        System.out.print("\tRe-enter BPIN(password):\t");
        String pass1=signUp.readLine();
        if(pass.equals(pass1)==false)
        {
            while(pass.equals(pass1)==false)
            {
                System.out.println("\t  BPIN(password) doesn't match");
                System.out.print("\tRe-enter BPIN(password)\t\t");
                pass1=signUp.readLine();
            }
        }
        System.out.println("\t_________________________________________");
        double openAmt=0;
        int ctr=0;
        do
        {
            System.out.println("\n\tOpening Account Balance(Min.Rs.1,000 & Max.Rs.20,000)");
            System.out.print("\t  Rs.");
            do{
                try
                {
                    openAmt=Double.parseDouble(signUp.readLine());
                    flag=0;
                }
                catch(Exception e)
                {
                    System.out.println("\t  Wrong Input");
                    System.out.println("\t  Re-enter Opening Balance");
                    flag=1;
                }
            }while(flag==1);
            if(openAmt<1000)    
            {
                System.out.println("\t  The opening Balance Amount is less than Rs.1000");
                System.out.println("\t  Please Re-enter The Opening Balance Amount");
                System.out.print("\t");
                ctr=1;
            }
            if(openAmt>20000)
            {
                System.out.println("\t  The opening Balance Amount is greater than Rs.20000");
                System.out.println("\t  Please Re-enter The Opening Balance Amount");
                System.out.print("\t");
                ctr=1;
            }
            if(openAmt>=1000 && openAmt<=20000)
            break;
        }while(ctr==1);
        System.out.println("\t_________________________________________");
        FileWriter facpass=new FileWriter(acc+pass+".txt");
        BufferedWriter bacpass=new BufferedWriter(facpass);
        PrintWriter pacpass=new PrintWriter(bacpass);
        pacpass.println(Fname);                
        pacpass.println(Midname);              
        pacpass.println(Lname);                 
        pacpass.println(gen);
        pacpass.println(dob);
        pacpass.println(addr);
        pacpass.println(city);
        pacpass.println(acc);
        pacpass.println(pass);
        pacpass.println(openAmt);
        pacpass.close();
        bacpass.close();
        FileWriter fuser=new FileWriter("user.txt",true);
        BufferedWriter bruser=new BufferedWriter(fuser);
        PrintWriter puser=new PrintWriter(bruser);
        puser.println(acc);
        puser.close();
        bruser.close();
        FileReader fr=new FileReader("acc.txt");
        BufferedReader brr=new BufferedReader(fr);
        String temp=brr.readLine();
        accno=Integer.parseInt(temp);
        fr.close();
        accno=accno+1;
        String acnum="81206163630"+Integer.toString(accno);
        FileWriter fw=new FileWriter("acc.txt");
        BufferedWriter bur=new BufferedWriter(fw);
        PrintWriter p=new PrintWriter(bur);
        p.print(accno);
        p.close();
        bur.close();
        FileWriter facno=new FileWriter(acc+pass+".txt",true);
        BufferedWriter bacno=new BufferedWriter(facno);
        PrintWriter pacno=new PrintWriter(bacno);
        pacno.println(acnum);
        pacno.close();
        bacno.close();
        String head[]={ "Date", "Withdrawl" ,"Deposit","Description", "Closing Balance"};
        FileWriter faccsta=new FileWriter(acnum+".txt");
        BufferedWriter braccsta=new BufferedWriter(faccsta);
        PrintWriter paccsta=new PrintWriter(braccsta);
        paccsta.println("\t\t|ACCOUNT STATEMENT|");
        paccsta.println("\t\t-------------------");
        paccsta.print("\t|");
        paccsta.print(head[0]+"\t    "+"|"+head[1]+"\t\t"+"|"+head[2]+"\t"+"|"+head[3]+"\t\t"+"|"+head[4]+"|");
        paccsta.println();
        paccsta.println("\t____________________________________________________________________");
        paccsta.close();
        braccsta.close();
        System.out.print("\n\tGenerating Account");
        for( i=1;i<100000000;i++)
        {}
        System.out.print(".");
        for( i=1;i<100000000;i++)
        {}  
        System.out.print(".");
        for( i=1;i<100000000;i++)
        {}
        System.out.print(".");
        for( i=1;i<100000000;i++)
        {}
        System.out.println("\n\t  Your Account number is:\t"+acnum);
        System.out.println("\t_________________________________________");
        for( i=1;i<1000000000;i++)
        {}
        System.out.println("\n\n\tPress any key to continue");
        ankey=signUp.readLine();
        System.out.println("\f\t\t\tCongratulations");
        System.out.println("\n\t\tNow you can :");
        System.out.println("\t\t\t~ Deposit Amount in your Account");
        System.out.println("\t\t\t~ Withdraw as per your choice.");
        System.out.println("\t\t\t~ Update your Information");
        System.out.println("\t\t\t~ View your Account Statement any time");
        for( i=1;i<1000000000;i++)
        {}
        System.out.println("\n\nPress any key to continue...");
        ankey=signUp.readLine();
        main();
    } 
    
    static void account()throws IOException//method to view the account
    {
        BufferedReader Acc=new BufferedReader(new InputStreamReader(System.in));
        FileReader farray=new FileReader(id+pass+".txt");
        BufferedReader brarray=new BufferedReader(farray);
        String uarray[]=new String[12];
        String tarray;
        for(int iarray=0;iarray<12;iarray++)
        {
            tarray=brarray.readLine();
            uarray[iarray]=tarray;
        }
        brarray.close();
        farray.close();
        System.out.println("\fWelcome\t"+uarray[0]+" "+uarray[1]+" "+uarray[2]+"\t\t\t\t\t\t\t\t\tYour Account Number is:"+uarray[10]); 
        Calendar c=Calendar.getInstance();
        System.out.print("[Current Log in:"+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR)+" "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+" IST]");
        System.out.println("\t\t\t\t\t\t\t\tYour current Account Balance is Rs."+uarray[9]);
        System.out.print("[Last Log in:"+uarray[11]+" IST]");
        System.out.println("\n\n\t\t\t\t|HOME|");
        System.out.println("\t\t\t\t------");
        System.out.println("\n\n\t\t\t1)Deposit Amount");
        System.out.println("\t\t\t2)Withdraw Amount");
        System.out.println("\t\t\t3)View Account Statement");
        System.out.println("\t\t\t4)Check Account Details");
        System.out.println("\t\t\t5)Exit");
        do{
            System.out.print("\n\t\t\tEnter choice:");
            int choice1=0;
            do{try
                {
                    choice1=Integer.parseInt(Acc.readLine());
                    flag=0;
                }
                catch(Exception e)
                {
                    System.out.println("Invalid choice");
                    System.out.println("Re-enter choice");
                    flag=1;
                }
            }while(flag==1);
            flag=0;
            switch(choice1)
            {
                case 1:
                {
                    deposit();
                }
                break;
                case 2:
                {
                    withdraw();
                }
                break;
                case 3:
                {
                    accsta();
                }break;
                case 4:
                {accDetails();
                }
                break;
                case 5:
                {System.out.print("\n\n\t\t\t\tYou will be redirected in few moments");
                    for( i=1;i<100000000;i++)
                    {}
                    System.out.print(".");
                    for( i=1;i<100000000;i++)
                    {}
                    System.out.print(".");
                    for( i=1;i<100000000;i++)
                    {}
                    System.out.println(".");
                    for( i=1;i<100000000;i++)
                    {}
                    main();
                }
                break;
                default:
                {
                    System.out.println("\t  Wrong Input");
                    System.out.println("\t  Re-enter");
                    flag=1;
                }break;
            }    
        }while(flag==1);
    }   
    
    static void deposit()throws IOException//method to deposit amount
    {
        FileReader farray=new FileReader(id+pass+".txt");
        BufferedReader brarray=new BufferedReader(farray);
        String uarray[]=new String[12];
        String tarray;
        for(int iarray=0;iarray<12;iarray++)
        {
            tarray=brarray.readLine();
            uarray[iarray]=tarray;
        }
        brarray.close();
        farray.close();
        BufferedReader Deposit=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fWelcome\t"+uarray[0]+" "+uarray[1]+" "+uarray[2]+"\t\t\t\t\t\t\t\t\tYour Account Number is:"+uarray[10]); 
        Calendar c=Calendar.getInstance();
        System.out.print("[Current Log in:"+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR)+" "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+" IST]");
        System.out.println("\t\t\t\t\t\t\t\tYour current Account Balance is Rs."+uarray[9]);
        System.out.print("[Last Log in:"+uarray[11]+" IST]");
        System.out.println("\n\n\t\t\t\t|DEPOSIT AMOUNT|"); 
        System.out.println("\t\t\t\t----------------");
        System.out.print("\n\n\tEnter the amount(Max.Rs20,000):\t");
        double damt=0;
        do
        {
            do{
                try{
                    damt=Double.parseDouble(Deposit.readLine());
                    flag=0;
                }
                catch(Exception e)
                {
                    System.out.println("\t  Invalid Figure");
                    System.out.print("\t  Re-enter Figure:");
                    flag=1;
                }    
            }
            while(flag==1);
            if(damt>20000)
            {
                System.out.println("\t The Deposit amount is greater than Rs.20,000");
                System.out.print("\t Re-enter Figure:");
            }
        }while(damt>20000);
        double depamt=Double.parseDouble(uarray[9]);
        depamt=depamt+damt;
        String sdepamt=Double.toString(depamt);
        uarray[9]=sdepamt;
        System.out.println("\t Description:\t");
        System.out.print("\t");       
        String disc=Deposit.readLine();
        FileWriter fd=new FileWriter(id+pass+".txt");
        BufferedWriter brd=new BufferedWriter(fd);
        PrintWriter pd=new PrintWriter(brd);
        for(int q=0;q<12;q++)
        {
            pd.println(uarray[q]); 
        }
        pd.close();
        brd.close();
        String head[]={" "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR)," "," "+damt," "+disc," "+depamt};
        FileWriter fdep=new FileWriter(uarray[10]+".txt",true);
        BufferedWriter brdep=new BufferedWriter(fdep);
        PrintWriter pdep=new PrintWriter(brdep);
        pdep.print("\t");
        pdep.print(" "+head[0]+"\t\t\t "+head[2]+"\t\t "+head[3]+"\t\t\t "+head[4]);
        pdep.println();
        pdep.close();
        brdep.close();
        System.out.print("\n\n\t\t\tDepositing");
        for( i=1;i<100000000;i++)
        {}
        System.out.print(".");
        for( i=1;i<100000000;i++)
        {}
        System.out.print(".");
        for( i=1;i<100000000;i++)
        {}
        System.out.println(".");
        for( i=1;i<100000000;i++)
        {}
        account();
    }
    
    static void withdraw()throws IOException//method to withdraw amount
    {
        FileReader farray=new FileReader(id+pass+".txt");
        BufferedReader brarray=new BufferedReader(farray);
        String uarray[]=new String[12];
        String tarray;
        for(int iarray=0;iarray<12;iarray++)    
        {
            tarray=brarray.readLine();
            uarray[iarray]=tarray;
        }
        brarray.close();
        farray.close();
        BufferedReader Withdraw=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fWelcome\t"+uarray[0]+" "+uarray[1]+" "+uarray[2]+"\t\t\t\t\t\t\t\t\tYour Account Number is:"+uarray[10]); 
        Calendar c=Calendar.getInstance();
        System.out.print("[Current Log in:"+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR)+" "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+" IST]");
        System.out.println("\t\t\t\t\t\t\t\tYour current Account Balance is Rs."+uarray[9]);
        System.out.print("[Last Log in:"+uarray[11]+" IST]");
        System.out.println("\n\n\t\t\t\t|WITHDRAW AMOUNT|");
        System.out.println("\t\t\t\t-----------------");
        System.out.print("\n\n\tEnter the amount:");
        double wiamt=0;
        double wamt=0;
        do
        {
            do{try{
                System.out.print("\t");
                wamt=Double.parseDouble(Withdraw.readLine());
                flag=0;}
                catch(Exception e)
                {
                    System.out.println("\t  Invalid Figure");
                    System.out.println("\t  Re-enter Figure");
                    flag=1;
                }
            }while(flag==1);
            wiamt=Double.parseDouble(uarray[9]);
            wiamt=wiamt-wamt;
            if(wiamt<1000)
            {
                System.out.println("\n\t  Your Minimum Balance is getting below Rs.1000");
                System.out.println("\t  Please Re-enter Withdrawal balance");
            }
        }while(wiamt<1000);
        String swiamt=Double.toString(wiamt);
        uarray[9]=swiamt;
         System.out.println("\t Description:\t");
        System.out.print("\t");   
        String disc=Withdraw.readLine();
        FileWriter fw=new FileWriter(id+pass+".txt");
        BufferedWriter brw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(brw);
        for(int q=0;q<12;q++)
        {
            pw.println(uarray[q]);
        }
        pw.close();
        brw.close();
        String head[]={" "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR)," "+wamt," "," "+disc," "+wiamt};
        FileWriter fwi=new FileWriter(uarray[10]+".txt",true);
        BufferedWriter brwi=new BufferedWriter(fwi);
        PrintWriter pwi=new PrintWriter(brwi);
        pwi.print("\t");
        pwi.print(" "+head[0]+"   "+head[1]+"\t\t\t\t "+head[3]+"\t\t "+head[4]);
        pwi.println();
        pwi.close();
        brwi.close();
        System.out.print("\n\n\t\t\tWithdrawing");
        for( i=1;i<100000000;i++)
        {}
        System.out.print(".");
        for( i=1;i<100000000;i++)
        {}
        System.out.print(".");
        for( i=1;i<100000000;i++)
        {}
        System.out.println(".");
        for( i=1;i<100000000;i++)
        {}
        account();
    }
    
    static void accsta()throws IOException//method to update account statement
    {
        FileReader farray=new FileReader(id+pass+".txt");
        BufferedReader brarray=new BufferedReader(farray);
        String uarray[]=new String[12];
        String tarray;
        for(int iarray=0;iarray<12;iarray++)
        {
            tarray=brarray.readLine();
            uarray[iarray]=tarray;
        }
        brarray.close();
        farray.close();
        BufferedReader accSta=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fWelcome\t"+uarray[0]+" "+uarray[1]+" "+uarray[2]+"\t\t\t\t\t\t\t\t\tYour Account Number is:"+uarray[10]); 
        Calendar c=Calendar.getInstance();
        System.out.print("[Current Log in:"+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR)+" "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+" IST]");
        System.out.println("\t\t\t\t\t\t\t\tYour current Account Balance is Rs."+uarray[9]);
        System.out.print("[Last Log in:"+uarray[11]+" IST]");
        String taccsta;
        System.out.println();
        FileReader faccsta=new FileReader(uarray[10]+".txt");
        BufferedReader braccsta=new BufferedReader(faccsta);
        while((taccsta=braccsta.readLine())!=null)
        {
            System.out.println(taccsta);
        }
        braccsta.close();
        faccsta.close();
        System.out.println("\n\n\t\tBack(B)");
        char ctr=' ';
        do{
            System.out.print("\t\t");
            do{try{
                ctr=(char)accSta.read();
                flag=0;}
                catch(Exception e)
                {
                    System.out.println("\t\t  Invalid option");
                    System.out.println("\t\t  Re-enter option");
                    flag=1;}
                }while(flag==1);
                if(ctr=='b'||ctr=='B')
                {
                    account();
                }
                else
                {
                    System.out.println("\t\t  Invalid option");
                    System.out.println("\t\t  Re-enter option");
                    ctr=1;
                }
        }while(ctr==1);
    }
    
    static void accDetails()throws IOException//method to view account details
    {
        FileReader farray=new FileReader(id+pass+".txt");
        BufferedReader brarray=new BufferedReader(farray);
        String uarray[]=new String[12];
        String tarray;
        for(int iarray=0;iarray<12;iarray++)
        {
            tarray=brarray.readLine();
            uarray[iarray]=tarray;
        }
        brarray.close();
        farray.close();
        BufferedReader Accdetail=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fWelcome\t"+uarray[0]+" "+uarray[1]+" "+uarray[2]+"\t\t\t\t\t\t\t\t\tYour Account Number is:"+uarray[10]); 
        Calendar c=Calendar.getInstance();
        System.out.print("[Current Log in:"+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR)+" "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+" IST]");
        System.out.println("\t\t\t\t\t\t\t\tYour current Account Balance is Rs."+uarray[9]);
        System.out.print("[Last Log in:"+uarray[11]+" IST]");
        System.out.println("\n\n\t\t\t\t|ACCOUNT DETAILS|");
        System.out.println("\t\t\t\t-----------------");
        System.out.println("\n\t\tFirst Name:\t"+uarray[0]);
        System.out.println("\t\tMiddle Name:\t"+uarray[1]);
        System.out.println("\t\tLast Name:\t"+uarray[2]);
        System.out.println("\n\t\t__________________________________");
        System.out.println("\n\t\tGender:\t\t"+uarray[3]);
        System.out.println("\t\tDate of Birth:\t"+uarray[4]);
        System.out.println("\t\tAddress:\t"+uarray[5]);
        System.out.println("\t\tCity:\t\t"+uarray[6]);
        System.out.println("\n\t\t__________________________________");
        System.out.println("\n\t\tCustomer ID:\t"+uarray[7]);
        System.out.println("\t\tBPIN(passwrd):\t"+uarray[8]);
        System.out.println("\n\t\t__________________________________");
        System.out.println("\n\n\t\t\tEdit(E)");
        System.out.println("\t\t\tBack(B)");
        System.out.print("\t\t\t");
        do
        {
            char editacc=' ';
            do{try{
                editacc=(char)Accdetail.read();
                flag=0;}
                catch(Exception e)
                {
                    System.out.println("\t\t\t  Invalid character");
                    System.out.println("\t\t\t  Re-enter character");
                    flag=1;
                }
            }while(flag==1);
            flag=0;
            if(editacc=='e'||editacc=='E')
            {
                editAcc();
                flag=0;
            }
            else if(editacc=='b'||editacc=='B')
            {
                account();
                flag=0;
            }
            else
            {
                System.out.println("Wrong Input");
                flag=1;
            }
        }while(flag==1);
    }
    
    static void editAcc()throws IOException//method to edit account
    {
        FileReader farray=new FileReader(id+pass+".txt");
        BufferedReader brarray=new BufferedReader(farray);
        String uarray[]=new String[12];
        String tarray;  
        for(int iarray=0;iarray<12;iarray++)
        {
            tarray=brarray.readLine();
            uarray[iarray]=tarray;
        }
        brarray.close();
        farray.close();
        BufferedReader editacc=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fWelcome\t"+uarray[0]+" "+uarray[1]+" "+uarray[2]+"\t\t\t\t\t\t\t\t\tYour Account Number is:"+uarray[10]); 
        Calendar c=Calendar.getInstance();
        System.out.print("[Current Log in:"+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR)+" "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+" IST]");
        System.out.println("\t\t\t\t\t\t\t\tYour current Account Balance is Rs."+uarray[9]);
        System.out.print("[Last Log in:"+uarray[11]+" IST]");
        System.out.println("\n\n\t\t\t\t|EDIT ACCOUNT|");
        System.out.println("\t\t\t\t--------------");
        System.out.println("\t\tEdit: 1)Name");
        System.out.println("\t\t      2)Date of Birth");
        System.out.println("\t\t      3)Address");
        System.out.println("\t\t      4)BPIN(password)");
        System.out.println("\n\t\t      5)Back");
        do{
            System.out.print("\t\t");
            int chedit=0;
            do{try{
                chedit=Integer.parseInt(editacc.readLine());
                flag=0;}
                catch(Exception e)
                {
                    System.out.println("\t\t  Invalid option"); 
                    System.out.println("\t\t  Re-enter option");
                    flag=1;}
            }while(flag==1);
            switch(chedit)
            {
                case 1:
                {
                    name();
                    
                }break;
                case 2:
                {
                    DOB();
                }break;
                case 3:
                {
                    Adress();
                }break;
                case 4:
                {
                    BPIN();
                }break;
                case 5:
                {   
                    accDetails();
                }break;
                default:
                {
                    System.out.println("\t\t  Wrong Input");
                    System.out.println("\t\t  Re-enter");
                    flag=1;
                }
            }
        }while(flag==1);
    }
    
    static void name()throws IOException//method to edit name
    {
        FileReader farray=new FileReader(id+pass+".txt");
        BufferedReader brarray=new BufferedReader(farray);
        String uarray[]=new String[12];
        String tarray;
        for(int iarray=0;iarray<12;iarray++)
        {
            tarray=brarray.readLine();
            uarray[iarray]=tarray;
        }
        brarray.close();
        farray.close();
        BufferedReader Name=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fWelcome\t"+uarray[0]+" "+uarray[1]+" "+uarray[2]+"\t\t\t\t\t\t\t\t\tYour Account Number is:"+uarray[10]); 
        Calendar c=Calendar.getInstance();
        System.out.print("[Current Log in:"+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR)+" "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+" IST]");
        System.out.println("\t\t\t\t\t\t\t\tYour current Account Balance is Rs."+uarray[9]);
        System.out.print("[Last Log in:"+uarray[11]+" IST]");
        System.out.println("\n\n\t\t\t\t|EDIT NAME|");
        System.out.println("\t\t\t\t----------");
        System.out.print("\t\tFirst Name:\t");
        String fName=Name.readLine();
        uarray[0]=fName;
        System.out.print("\t\tMiddle Name:\t");
        String mName=Name.readLine();
        uarray[1]=mName;
        System.out.print("\t\tLast Name:\t");
        String lName=Name.readLine();
        uarray[2]=lName;
        System.out.print("\n\n\t\tUpdating Name");
        for( i=1;i<100000000;i++)
        {}
        System.out.print(".");
        for( i=1;i<100000000;i++)
        {}
        System.out.print(".");
        for( i=1;i<100000000;i++)
        {}
        System.out.println(".");
        for( i=1;i<100000000;i++)
        {}
        FileWriter fname=new FileWriter(id+pass+".txt");
        BufferedWriter brname=new BufferedWriter(fname);
        PrintWriter pname=new PrintWriter(brname);
        for(int q=0;q<12;q++)
        {
            pname.println(uarray[q]); 
        }
        pname.close();
        brname.close();
        accDetails();
    }
    
    static void DOB()throws IOException//method to edit date of birth
    {
        FileReader farray=new FileReader(id+pass+".txt");
        BufferedReader brarray=new BufferedReader(farray);
        String uarray[]=new String[12];
        String tarray;
        for(int iarray=0;iarray<12;iarray++)
        {
            tarray=brarray.readLine();
            uarray[iarray]=tarray;
        }
        brarray.close();
        farray.close();
        BufferedReader dob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fWelcome\t"+uarray[0]+" "+uarray[1]+" "+uarray[2]+"\t\t\t\t\t\t\t\t\tYour Account Number is:"+uarray[10]); 
        Calendar c=Calendar.getInstance();
        System.out.print("[Current Log in:"+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR)+" "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+" IST]");
        System.out.println("\t\t\t\t\t\t\t\tYour current Account Balance is Rs."+uarray[9]);
        System.out.print("[Last Log in:"+uarray[11]+" IST]");
        System.out.println("\n\n\t\t\t\t|EDIT DATE OF BIRTH|");
        System.out.println("\t\t\t\t--------------------");
        String dOb;
        do{
            flag=0;
            System.out.print("\t\tDate of Birth\t");
            dOb=dob.readLine();
            if(dOb.length()==10&&dOb.charAt(2)=='/'&&dOb.charAt(5)=='/')
            {flag=0;
            }
            else{
                System.out.println("\t\t  Wrong date input");
                System.out.println("\t\t  Re-enter:");
                flag=1;
            }
        }while(flag==1);
        flag=0;
        uarray[4]=dOb;
        System.out.print("\n\n\t\tUpdating Date of Birth");
        for( i=1;i<100000000;i++)
        {}
        System.out.print(".");
        for( i=1;i<100000000;i++)
        {}
        System.out.print(".");
        for( i=1;i<100000000;i++)
        {}
        System.out.println(".");
        for( i=1;i<100000000;i++)
        {}
        FileWriter fdob=new FileWriter(id+pass+".txt");
        BufferedWriter brdob=new BufferedWriter(fdob);
        PrintWriter pdob=new PrintWriter(brdob);
        for(int q=0;q<12;q++)
        {
            pdob.println(uarray[q]); 
        }
        pdob.close();
        brdob.close();
        accDetails();
    }
    
    static void Adress()throws IOException//method to edit address
    {
        FileReader farray=new FileReader(id+pass+".txt");
        BufferedReader brarray=new BufferedReader(farray);
        String uarray[]=new String[12];
        String tarray;
        for(int iarray=0;iarray<12;iarray++)
        {
            tarray=brarray.readLine();
            uarray[iarray]=tarray;
        }
        brarray.close();
        farray.close();
        BufferedReader adress=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fWelcome\t"+uarray[0]+" "+uarray[1]+" "+uarray[2]+"\t\t\t\t\t\t\t\t\tYour Account Number is:"+uarray[10]); 
        Calendar c=Calendar.getInstance();
        System.out.print("[Current Log in:"+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR)+" "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+" IST]");
        System.out.println("\t\t\t\t\t\t\t\tYour current Account Balance is Rs."+uarray[9]);
        System.out.print("[Last Log in:"+uarray[11]+" IST]");
        System.out.println("\n\n\t\t\t\t|EDIT ADDRESS|");
        System.out.println("\t\t\t\t--------------");
        System.out.print("\n\t\tAddress:\t");
        String add=adress.readLine();
        uarray[5]=add;
        System.out.print("\t\tCity:\t");
        String city=adress.readLine();
        uarray[6]=city;
        System.out.print("\n\n\t\tUpdating Address");
        for( i=1;i<100000000;i++)
        {}
        System.out.print(".");
        for( i=1;i<100000000;i++)
        {}
        System.out.print(".");
        for( i=1;i<100000000;i++)
        {}
        System.out.println(".");
        for( i=1;i<100000000;i++)
        {}
        FileWriter fadd=new FileWriter(id+pass+".txt");
        BufferedWriter bradd=new BufferedWriter(fadd);
        PrintWriter padd=new PrintWriter(bradd);
        for(int q=0;q<12;q++)
        {
            padd.println(uarray[q]); 
        }
        padd.close();
        bradd.close();
        accDetails();
    }
    
    static void BPIN()throws IOException//method to edit password
    {
        FileReader farray=new FileReader(id+pass+".txt");
        BufferedReader brarray=new BufferedReader(farray);
        String uarray[]=new String[12];
        String tarray;
        for(int iarray=0;iarray<12;iarray++)
        {
            tarray=brarray.readLine();
            uarray[iarray]=tarray;
        }
        brarray.close();
        farray.close();
        BufferedReader BPIN=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fWelcome\t"+uarray[0]+" "+uarray[1]+" "+uarray[2]+"\t\t\t\t\t\t\t\t\tYour Account Number is:"+uarray[10]); 
        Calendar c=Calendar.getInstance();
        System.out.print("[Current Log in:"+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR)+" "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+" IST]");
        System.out.println("\t\t\t\t\t\t\t\tYour current Account Balance is Rs."+uarray[9]);
        System.out.print("[Last Log in:"+uarray[11]+" IST]");
        System.out.println("\n\n\t\t\t\t|EDIT PASSWORD|");
        System.out.println("\t\t\t\t---------------");
        System.out.print("Current BPIN(password):\t");
        String cpass=BPIN.readLine();
        if(cpass.equals(uarray[8])==true)
        {
            System.out.print("New BPIN(password):\t");
            String npass=BPIN.readLine();
            System.out.print("Verify new BPIN(password)\t");
            String vnpass=BPIN.readLine();
            if(npass.equals(vnpass)==false)
            {
                while(npass.equals(vnpass)==false)
                {
                    System.out.println("BPIN(password) doesn't match");
                    System.out.print("Re-enter BPIN(password)\t");
                    vnpass=BPIN.readLine();
                }
            }
            FileWriter ffpass=new FileWriter(id+pass+".txt");
            BufferedWriter brrpass=new BufferedWriter(ffpass);
            PrintWriter pppass=new PrintWriter(brrpass);
            uarray[8]=npass;
            for(int q=0;q<12;q++)
            {
                pppass.println(uarray[q]); 
            }
            pppass.close();
            brrpass.close();
            FileWriter fpass=new FileWriter(id+npass+".txt");
            BufferedWriter brpass=new BufferedWriter(fpass);
            PrintWriter ppass=new PrintWriter(brpass);
            uarray[8]=vnpass;
            for(int q=0;q<12;q++)
            {
                ppass.println(uarray[q]); 
            }
            ppass.close();
            brpass.close();
            accDetails();
        }
        else
        {
            System.out.println("\t\t  Incorrect BPIN");
            System.out.print("\t\t  You will be redirectd");
            for( i=1;i<100000000;i++)
            {}
            System.out.print(".");
            for( i=1;i<100000000;i++)
            {}
            System.out.print(".");
            for( i=1;i<100000000;i++)
            {}
            System.out.println(".");
            for( i=1;i<100000000;i++)
            {}
            accDetails();
        }
    }
    
    static void faq()throws IOException//method to view FAQ
    {
        BufferedReader brfaq=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\f\t\t\t| Frequently Asked Questions |");
        System.out.println("\t\t\t------------------------------");
        System.out.println("\n\n\t 1) What all can I do using Bancroft?");
        System.out.println("\t 2) What is the procedure to create a new Savings' Account?");
        System.out.println("\t 3) What is BPIN?");
        System.out.println("\t 4) How to Deposit amount from my Savings' Account?");
        System.out.println("\t 5) How to Withdraw amount from my Savings' Account?");
        System.out.println("\t 6) Can I view my Account Statement for previous transactions?");
        System.out.println("\t 7) Can I edit my Account details?");
        System.out.println("\t 8) Can I change my User/Customer ID?");
        System.out.println("\t 9) Can I add another Account number?");
        System.out.println("\t10) Back");
        System.out.println("_____________________________________________________________________");
        System.out.print("\t\t");
        int chfaq=0;
        do
        {
            try
            {
                chfaq=Integer.parseInt(brfaq.readLine());
                flag=0;
            }
            catch(Exception e)
            {
                System.out.println("Invalid option");
                System.out.println("Re-enter option");
                flag=1;
            }
        }while(flag==1);
        do
        {
            flag=0;
            switch(chfaq)
            {
                case 1:
                  banc();
                break;
                case 2:
                {
                    nsa();
                }break;
                case 3:
                {
                    bpin();
                }break;
                case 4:
                {
                    dipacc();
                }break;
                case 5:
                {
                    witacc();
                }break;
                case 6:
                {
                    pretrans();
                }break;
                case 7:
                {
                    ques7();
                }break;
                case 8:
                {
                    ques8();
                }break;
                case 9:
                {
                    ques9();
                }break;
                case 10:
                {
                    main();
                }break;
                default:
                {
                    System.out.println("Wrong Input");
                    System.out.println("Re-enter");
                    flag=1;
                }break;
            }
        }while(flag==1);
    }
    
    static void banc()throws IOException//method to print answer of question 1
    {
        BufferedReader banc=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\t 1) What all can I do using Bancroft?");
        System.out.println("\n\tAns: Using Bancroft you can :");
        System.out.println("\t\t\ta)Deposit Amount in your Account");
        System.out.println("\t\t\tb)Withdraw as per your choice.");
        System.out.println("\t\t\tc)Update your Personal Information");
        System.out.println("\t\t\td)View your Account Statement any time");
        System.out.print("\n\t\tPess Enter to go Back");
        sfaq=banc.readLine();
        faq();
    }
    
    static void nsa()throws IOException//method to print answer of question 2
    {
        BufferedReader nsa=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\t 2) What is the procedure to create a new Savings' Account?");
        System.out.println("\n\tAns: To create a new Savings Account using Bancroft, follow these steps:");
        System.out.println("\t\tIn the Welcome Screen Choose '2)Create Savings' Account'");
        System.out.println("\t\tEnter the desired Information");
        System.out.println("\t\tBancroft will give you a unique account number for identification.");
        System.out.print("\n\t\tPess Enter to go Back");
        sfaq=nsa.readLine();
        faq();
    }
    
    static void bpin()throws IOException//method to print answer of question 3
    {
        BufferedReader bpin=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\t 3) What is BPIN?");
        System.out.println("\n\tAns: Bancroft Personal Identification Number(BPIN),");
        System.out.println("\t\tis a code set by the user itself");
        System.out.println("\t\tfor initiating personal access of His/Her Account.");
        System.out.print("\n\t\tPess Enter to go Back");
        sfaq=bpin.readLine();
        faq();
    }
    
    static void dipacc()throws IOException//method to print answer of question 4
    {
        BufferedReader banc=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\t 4) How to Deposit amount from my Savings' Account?");
        System.out.println("\n\tAns: After you Log into your Bancroft Account,");
        System.out.println("\t\tYou have the facility to Deposit amount as per your wish.");
        System.out.println("\t\tTo do this choose '1)Deposit Amount'.");
        System.out.println("\t\tEnter the amount to be depositted and you are done.");
        System.out.print("\n\t\tPess Enter to go Back");
        sfaq=banc.readLine();
        faq();
    }
    
    static void witacc()throws IOException//method to print answer of question 5
    {
        BufferedReader banc=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\t 5) How to Withdraw amount from my Savings' Account?");
        System.out.println("\n\tAns: After you Log into your Bancroft Account,");
        System.out.println("\t\tYou have the facility to Withdraw amount as per your wish.");
        System.out.println("\t\tto do this, choose '2)Withdraw Amount'.");
        System.out.println("\t\tEnter the amount to be Withdrawn and you are done.");
        System.out.println("\t\tBut be CAREFULL:");
        System.out.println("\t\t\tYour Account should contain atleast Rs.1000.");
        System.out.print("\n\t\tPess Enter to go Back");
        sfaq=banc.readLine();
        faq();
    }
    
    static void pretrans()throws IOException//method to print answer of question 6
    {
        BufferedReader banc=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\t 6) Can I view my Account Statement for previous transactions?");
        System.out.println("\n\tAns: Yes.");
        System.out.println("\t\t\tBancroft facilitates you to view or print your previous Transactions.");
        System.out.println("\t\t\tTo do this, choose '3)View Account Statement'");
        System.out.println("\t\t\tpresent at your Homepage.");
        System.out.print("\n\t\tPess Enter to go Back");
        sfaq=banc.readLine();
        faq();
    }
    
    static void ques7()throws IOException//method to print answer of question 7
    {
        BufferedReader ques7=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\t 7) Can I edit my Account details?");
        System.out.println("\n\tAns: Yes.");
        System.out.println("\t\tYou can update your-");
        System.out.println("\t\t\t~Name,Date of Birth,Address");
        System.out.println("\t\t\t~Date of Birth,");
        System.out.println("\t\t\t~Address and");
        System.out.println("\t\t\t~BIPIN(password)");
        System.out.println("\t\tby choosing '4)Edit Account Details'");
        System.out.println("\t\tpresent on the Homepage.");
        System.out.print("\n\t\tPess Enter to go Back");
        sfaq=ques7.readLine();
        faq();
    }
    
    static void ques8()throws IOException//method to print answer of question 8
    {
        BufferedReader ques8=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\t 8) Can I change my User/Customer ID?");
        System.out.println("\n\tAns: No.");
        System.out.println("\t\tOn the present version of Bancroft,");
        System.out.println("\t\tthis feature is not available.");
        System.out.print("\n\t\tPess Enter to go Back");
        sfaq=ques8.readLine();
        faq();
    }
    
    static void ques9()throws IOException//method to print answer of question 9
    {
        BufferedReader ques9=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\t 9) Can I add another Account number?");
        System.out.println("\n\tAns: No.");
        System.out.println("\t\tOn the present version of Bancroft,");
        System.out.println("\t\tthis feature is not available.");
        System.out.print("\n\t\tPess Enter to go Back");
        sfaq=ques9.readLine();
        faq();
    }
}

