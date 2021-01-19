/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazifeladattmb;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Soma
 */
public class HazifeladatTMB 
{

    /**
     * @param args the command line arguments
     */
    public static final String TEXT_RED = "\u001B[31m";
    static int[] OttelOSzthatoTMb=new int[50];
    static int[] HettelOszthatoTMb=new int[50];
    static int[] MunkaTMB=new int[50];
    static Random rnd=new Random();
    public static void main(String[] args) 
    {
        Feladat1_2();System.out.println("\n--------------------------------------------\n");
        Feladat3_4();System.out.println("\n--------------------------------------------\n");
        Feladat5();System.out.println("\n--------------------------------------------\n");
        Feladat6();System.out.println("\n--------------------------------------------\n");
        Feladat7();System.out.println("\n--------------------------------------------\n");
        Feladat8();System.out.println("\n--------------------------------------------\n");
        Feladat9();System.out.println("\n--------------------------------------------\n");
        Feladat10_11();System.out.println("\n--------------------------------------------\n");
        Feladat12();System.out.println("\n--------------------------------------------\n");
        //Feladat13();System.out.println("\n--------------------------------------------\n");
        Feladat14();
        
    }

    private static void Feladat1_2()
    {
        System.out.println("1. Hozzon létre két 50 elemű tömböt, az elemek 1 és 200 közötti random számok legyenek, "+
                "\naz egyik tömb csak öttel osztható számokat tartalmazzon, a másik tömbben a hét egész többszörösei legyenek csak.");
        int i=0;
        int Szam1;
        while(i!=OttelOSzthatoTMb.length)
        {
            Szam1=rnd.nextInt(201);
            if(Szam1%5==0)
            {
               OttelOSzthatoTMb[i]=Szam1;
               i++;
            } 
            if(Szam1%7==0)
            {
                HettelOszthatoTMb[i]=Szam1;
                 i++;
            }
        }
        
        System.out.println("\n--------------------------------------------\n");
        System.out.println("2. Írja ki a konzolra külön-külön a két tömböt oly módon, hogy egy sorba tíz elem kerüljön pontos vesszővel elválasztva.");
        System.out.println("Öttel osztható számok tömbje:\n");
        for (int j = 0; j < OttelOSzthatoTMb.length; j++)
        {
            if(j%10==0)
            {
                System.out.print("\n");
            }
            System.out.print(OttelOSzthatoTMb[j] +" ;");
        }
        System.out.println("\n--------------------------------------------\n");
        System.out.println("Héttel osztható számok tömbje:\n");
        for (int k = 0; k < HettelOszthatoTMb.length; k++)
        {
            if(k%10==0)
            {
                System.out.print("\n");
            }
            System.out.print(HettelOszthatoTMb[k] +" ;");
        }
    }

    private static void Feladat3_4() 
    {
        System.out.println("3. Hozzon létre egy harmadik tömböt (MunkaTMB legyen a neve) melynek minden eleme az előző két tömb \nazonos helyen álló elemének összegeként áll elő.");
        int UjErtek=0;
        for (int i = 0; i < MunkaTMB.length; i++)
        {
            UjErtek=OttelOSzthatoTMb[i]+HettelOszthatoTMb[i];
            MunkaTMB[i]=UjErtek;
        }
        System.out.println("\n--------------------------------------------\n");
        System.out.println("4. Írja ki a konzolra a tömböt oly módon, hogy egy sorba tíz elem kerüljön pontos vesszővel elválasztva.");
        for (int k = 0; k < MunkaTMB.length; k++)
        {
            if(k%10==0)
            {
                System.out.print("\n");
            }
            System.out.print(MunkaTMB[k] +" ;");
        }
    }

    private static void Feladat5() 
    {
        System.out.println("5. Határozza meg a tömb elemének összegét és átlagát külön-külön két tizedes jegyre kerekítve.");
        double Osszeg=0;
        double Atlag=0;
        for (int i : MunkaTMB)
        {
            Osszeg+=i;
        }
        Atlag=Osszeg/MunkaTMB.length;
        System.out.println("\tA MunkaTMB elemeinek összeg: "+Osszeg);
        System.out.println("\tA MunkaTMB elemeinek átlaga: " +Atlag);
    }

    private static void Feladat6() 
    {
        System.out.println("6. Százalékos értékben adja meg a páros és páratlan számok arányát.");
        double ParosDB=0;
        double ParatlanDB=0;
        for (int i : MunkaTMB)
        {
            if(i%2==0)
            {
                ParosDB++;
            }
            if(i%2==1)
            {
                ParatlanDB++;
            }
        }
        double ParosArany=(ParosDB/MunkaTMB.length)*100;
        double ParatlanArany=100-ParosArany;
        System.out.println("\tA páros számok aránya: " + ParosArany + " %");
        System.out.println("\tA páratlan számok aránya: " + ParatlanArany + " %");
    }

    private static void Feladat7() 
    {
        System.out.println("7. Számolja meg, hány olyan szám van a tömbben ami 12-vel osztható.");
        int DB12=0;
        for (int i : MunkaTMB) 
        {
            if(i%12==0)
            {
                DB12++;
            }
        }
        System.out.println("\tEnnyi 12-vel osztható szám van a tömbben: "+DB12);
    }

    private static void Feladat8() 
    {
        System.out.println("8. Írjon programot mely eldönti a 45 eleme-e a MunkaTMB-ben, ha talál ilyen számot a tömbben akkor írja ki a program van ilyen szám a tömbben,\n amennyiben nincs ilyen szám a tömbben írja ki a program, hogy nincs ilyen szám.");
        boolean IgenVagyNem=false;
        for (int i : MunkaTMB)
        {
            if(i==45)
            {
                IgenVagyNem=true;
                break;
            }
        }
        if(IgenVagyNem==true) 
        {
            System.out.println("\tA 45 eleme a tömbnek");
        }
        else 
        {
            System.out.println("\tA 45 nem eleme a tömbnek");
        }
    }

    private static void Feladat9() {
        System.out.println("9. Kérjen be a felhasználótól egy számot, ha bekért érték benne van a tömbben, \nírja ki a program hányadik eleme a tömbnek a keresett szám, ha nincs találat írja ki a program nincs találat.");
        Scanner Beker=new Scanner(System.in);
        System.out.print
        ("\tKérem adjon meg egy számot: ");
        int BekertSzam=Beker.nextInt();
        int db=0;
        for (int i : MunkaTMB)
        {
            if(i==BekertSzam)
            {
                db++;
            }
        }
        if(db>0) 
        {System.out.println("\tA keresett szám benne van a tömbben");}
        else{System.out.println("\tA keresett szám nincs benne a tömbben");}
        
    }

    private static void Feladat10_11() 
    {
        System.out.println("10.	Határozza meg a MunkaTMB legkisebb értékét, és azt is hányadik helyen van a tömbben.");
        int Min=Integer.MAX_VALUE;
        int Minhely=0;
        for (int i = 0; i < MunkaTMB.length; i++)
        {
             if(MunkaTMB[i]<Min)
            {
                Min=MunkaTMB[i]; 
                Minhely=i+1;
            }
        }
        System.out.println("\tA tömb legkisebb értéke: "+Min+"\n\tA legkisebb elem enyiedik eleme a tömbnek : "+Minhely);
        System.out.println("\n--------------------------------------------\n");
        System.out.println("11.	Határozza meg a MunkaTMB legnagyobb értékét, és azt is hányadik helyen van a tömbben.");
        int Max=Integer.MIN_VALUE;
        int Maxhely=0;
        for (int j = 0; j < MunkaTMB.length; j++)
        {
             if(MunkaTMB[j]>Max)
            {
                Max=MunkaTMB[j]; 
                Maxhely=j+1;
            }
        }
         System.out.println("\tA tömb legnagyobb értéke: "+Max+"\n\tA legnagyobb elem enyiedik eleme a tömbnek : "+Maxhely);
    }

    private static void Feladat12() 
    {
        System.out.println("12.	Számolja le a program hány elem van a MunkaTMB-nek melynek értéke 80 és 90 közötti.");
        int db=0;
        for (int i : MunkaTMB) 
        {
            if(80<i && i<90)
            {
                db++;            
            }
        }
        System.out.println("\tEnnyi elem van 80 és 90 között: "+db);
    }

    private static void Feladat13() 
    {
        System.out.println("13.	Színezze pirosra azokat a számokat amelyek páratlanok és a korábbi feltételeknek megfelelően írja ki a konzolra.");
        String TEXT_RESET = null;
        //System.out.println(TEXT_RED + "This text is red!" + TEXT_RESET);
        for (int k = 0; k < MunkaTMB.length; k++)
        {
            if(k%10==0)
            {
                System.out.print("\n");
            }
            if(MunkaTMB[k]%2==0)
            {
                
                //System.out.print(colored MunkaTMB[k] +Color.red " ; ");
            }
            System.out.print(MunkaTMB[k] +" ;");
        }
    }

    private static void Feladat14() 
    {
        System.out.println("14.	Rendezze a tömb elemeit növekvő sorrendbe, rendezési tétel segítségével és a korábbi feltételeknek megfelelően írja ki a konzolra.");
        int Csere;
        for (int i = 0; i < MunkaTMB.length-1; i++)
        {
            for (int j = 0; j < MunkaTMB.length-1; j++)
            {
              if(MunkaTMB[j]>MunkaTMB[j+1])
              {
                  Csere=MunkaTMB[j];
                  MunkaTMB[j]=MunkaTMB[j+1];
                  MunkaTMB[j+1]=Csere;
              }
            }
        }
         for (int k = 0; k < MunkaTMB.length; k++)
        {
            if(k%10==0)
            {
                System.out.print("\n");
            }
            System.out.print(MunkaTMB[k] +" ;");
        }
    }
    
}
