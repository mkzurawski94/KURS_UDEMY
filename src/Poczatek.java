public class Poczatek {

    ////      TABLICA Z IMIENIEM ORAZ NAZWISKIEM

//        String[] imieNazwisko = new String[3];
//        imieNazwisko[0] = "Mateusz Zurawski";
//        imieNazwisko[1] = "Martyna Wichert";
//        imieNazwisko[2] = "Adam Nowak";
//
////      ULEPSZONA PETLA FOR
//
//        for(String nazwa:imieNazwisko)
//        {
//            System.out.println(nazwa);
//        }
//
//
//        int a;
//        for(a=0 ; a <= imieNazwisko.length - 1 ; a++)
//            {
//                System.out.println(imieNazwisko[a]);
//            }


//  //    TABLICA Z WIEKIEM
//        int[] wiek= {14, 24, 38};
//        int b;
//        for(b=0 ; b <= wiek.length - 1 ; b++)
//        {
//            System.out.println(wiek[b]);
//        }
//        System.out.println("pierwszy wyraz tablicy to" + wiek[0]);
//        System.out.println("ostatni wyraz tablicy to " + wiek[wiek.length-1]);

////      TABLICA WYPISUJACA LICZBY OD 0 DO X

//        int[] liczby=new int[4];
//        int c =0;
//
//        for(int d = 0; d <= liczby.length-1; d++)
//        {
//            liczby[c]=c;
//            System.out.println("tab " + liczby[c]);
//            c++;
//        }
//

////      TABLICE DWUWYMIAROWE

//        int[][] tab = new int[4][4];
//        int a = 0;
//        for(int i = 0; i <=3; i++)
//        {
//            for(int j = 0 ; j <= 3; j++)
//            {
//                tab[i][j] = a;
//                if(j<3)
//                {
//
//                    System.out.print(tab[i][j]);
//                    a++;
//
//                }
//                else
//                {
//
//                    System.out.println(tab[i][j]);
//                    a++;
//
//                }
//            }
//        }



////          DO WHILE/ WHILE

//        int i = 0, a = 5; //a - ilosc elementow tablicy
//        int[] tab = new int[a];
//
//        do{
//            tab[i]=(i+1) * 10;
//            System.out.println(tab[i]);
//            i++;
//        }while(i <= tab.length - 1);

////        TABLICZKA MNOZENIA (continue co druga linia)
//        for(int i =1;i <= 10; i++)
//        {
//            if (i%2!=0)
//                {
//                    System.out.println();
//                    continue;
//                }
//            else
//                for(int j = 1; j <=10; j++)
//                {
//                    System.out.print(i * j + "  ");
//                }
//            System.out.println();
//        }
////    Ulepszona petla for i sumowanie

//        int suma = 0;
//        int[] tab={1, 2, 3, 4, 5};
//            for(int tab2:tab)
//            {
//                suma+=tab2;
//                System.out.println(suma);
//            }
}
