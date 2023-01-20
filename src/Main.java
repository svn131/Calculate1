import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
//  получаем в виде масива деленое по пробелу.
public class Main {
    public static void main(String[] args) throws trowsException {
        int x = 0;


        ///////////////////
//            throw new trowsException();
//          throw  new trowsException();}
//////////////////////////

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите ваш пример");
        String vvedenayaStroka = scn.nextLine();
        String[] vvedenoeMasiv = vvedenayaStroka.split(" ");
        int a = 0;
        int b = 0;
        boolean rim = false;
        if (vvedenoeMasiv.length > 3) {
            throw new trowsException();
        }// 1 + 2 + 3 обработка исключения
        try {

            a = Integer.parseInt(vvedenoeMasiv[0]);
            b = Integer.parseInt(vvedenoeMasiv[2]);

        } catch (NumberFormatException exc) {  // прогрмма поняла что присутсвуют буквы  а или б или а и б
            // код для римких чисел
            rim = true;


            for (int q = 0; q < 3; q++) {
                if (vvedenoeMasiv[q].equals("I")) {
                    if (q == 0) {
                        a = 1;
                        q = ++q;

                    } else {
                        b = 1;
                    }
                } else if (vvedenoeMasiv[q].equals("II")) {
                    if (q == 0) {
                        a = 2;
                        q = ++q;

                    } else {
                        b = 2;
                    }
                } else if (vvedenoeMasiv[q].equals("III")) {
                    if (q == 0) {
                        a = 3;
                        q = ++q;

                    } else {
                        b = 3;
                    }
                } else if (vvedenoeMasiv[q].equals("IV")) {
                    if (q == 0) {
                        a = 4;
                        q = ++q;

                    } else {
                        b = 4;
                    }
                } else if (vvedenoeMasiv[q].equals("V")) {
                    if (q == 0) {
                        a = 5;
                        q = ++q;

                    } else {
                        b = 5;
                    }
                } else if (vvedenoeMasiv[q].equals("VI")) {
                    if (q == 0) {
                        a = 6;
                        q = ++q;

                    } else {
                        b = 6;
                    }
                } else if (vvedenoeMasiv[q].equals("VII")) {
                    if (q == 0) {
                        a = 7;
                        q = ++q;

                    } else {
                        b = 7;
                    }
                } else if (vvedenoeMasiv[q].equals("VIII")) {
                    if (q == 0) {
                        a = 8;
                        q = ++q;

                    } else {
                        b = 8;
                    }
                } else if (vvedenoeMasiv[q].equals("IX")) {
                    if (q == 0) {
                        a = 9;
                        q = ++q;
                    } else {
                        b = 9;
                    }
                } else if (vvedenoeMasiv[q].equals("X")) {
                    if (q == 0) {
                        a = 10;
                        q = ++q;

                    } else {
                        b = 10;
                    }

                } else {
                    throw new trowsException();
                }


            }

        }



        Deistvie deistvie = new Deistvie();
        if (a < 11 && b < 11) {
            if (vvedenoeMasiv[1].equals("-")) {
                x = deistvie.minus(a,b);
            } else if (vvedenoeMasiv[1].equals("/")) {
                x = deistvie.delenie(a,b);
            } else if (vvedenoeMasiv[1].equals("*")) {
                x = deistvie.umnoghenie(a,b);
            } else if (vvedenoeMasiv[1].equals("+")) {
                x = deistvie.sum(a,b);
            } else {
                throw new trowsException();
            }
        }
        else {
            throw new trowsException();
        }













//        //Арефметическое действие
//        if (a < 11 && b < 11) {
//            if (vvedenoeMasiv[1].equals("-")) {
//                x = a - b;
//            } else if (vvedenoeMasiv[1].equals("/")) {
//                x = a / b;
//            } else if (vvedenoeMasiv[1].equals("*")) {
//                x = a * b;
//            } else if (vvedenoeMasiv[1].equals("+")) {
//                x = a + b;
//            } else {
//                throw new trowsException();
//            }
//        }
//        else {
//            throw new trowsException();
//        }






        if (rim == false) {
            System.out.println(x);
        } else if (x > 0) {
            String z = Integer.toString(x); // поменял тип переменной
            String[] masivOtvet = z.split("");// создал из нее
            String[] masivRim = new String[2];
            int i = 0;

            // код вывод римского чисела больше 0
            if (x > 9) {


                if (masivOtvet.length == 3) {
                    masivRim[i] = "C";
                    i++;
                } else if (masivOtvet[0].equals("1")) {
                    masivRim[i] = "X";
                    i++;
                } else if (masivOtvet[0].equals("2")) {
                    masivRim[i] = "XX";
                    i++;
                } else if (masivOtvet[0].equals("3")) {
                    masivRim[i] = "XXX";
                    i++;
                } else if (masivOtvet[0].equals("4")) {
                    masivRim[i] = "XL";
                    i++;
                } else if (masivOtvet[0].equals("5")) {
                    masivRim[i] = "L";
                    i++;
                } else if (masivOtvet[0].equals("6")) {
                    masivRim[i] = "LX";
                    i++;
                } else if (masivOtvet[0].equals("7")) {
                    masivRim[i] = "LXX";
                    i++;
                } else if (masivOtvet[0].equals("8")) {
                    masivRim[i] = "LXXX";
                    i++;
                } else if (masivOtvet[0].equals("9")) {
                    masivRim[i] = "XC";
                    i++;
                }
            }

            /// числа до 10ти

            if (masivOtvet[i].equals("1")) {
                masivRim[i] = "I";
            } else if (masivOtvet[i].equals("2")) {
                masivRim[i] = "II";
            } else if (masivOtvet[i].equals("3")) {
                masivRim[i] = "III";
            } else if (masivOtvet[i].equals("4")) {
                masivRim[i] = "IV";
            } else if (masivOtvet[i].equals("5")) {
                masivRim[i] = "V";
            } else if (masivOtvet[i].equals("6")) {
                masivRim[i] = "VI";
            } else if (masivOtvet[i].equals("7")) {
                masivRim[i] = "VII";
            } else if (masivOtvet[i].equals("8")) {
                masivRim[i] = "VIII";
            } else if (masivOtvet[i].equals("9")) {
                masivRim[i] = "IX";
            } else if (masivOtvet[i].equals("0")) {
                masivRim[i]  = "";
            }

            System.out.print(masivRim[0]);
            if (i == 1) {
                System.out.print(masivRim[1]);
            }
//            System.out.println(b);
        }
        else {
            throw new trowsException();//исключение в случаее если римское число отрицательное
        }
    }
}
class Deistvie {
    public int sum( int a, int b){
        return a+b;
    }
    public int minus(int a, int b){
        return a-b;
    }

    public int umnoghenie (int a,int b){
        return a*b;
    }

    public int delenie (int a, int b){
        return a/b;
    }
}



























        //        Scanner scn = new Scanner(System.in);
//        System.out.println("Введите сумму");
//        double summ = scn.nextInt();
//        System.out.println("Введите количество лет");
//        int year = scn.nextInt();
//        for (int i = 1; i < year+1; i++) {
//          summ = summ/100*103 ;
//            System.out.println( i + " год,сумма = " + summ);
//
//        }
//    }
//}






//
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Введите слово");
//        String slovo = scn.next();
//
//        System.out.println("Введите разделитель");
//        String razdelitel = scn.next();
//
//        System.out.println("Введите число");
//        int razy = scn.nextInt();
//
//        String[] itog = new String[razy * 2 - 1];
//        for (int i = 0; i < itog.length; i++) {
//            itog[i] = slovo;
//            i++;
//            if(i<itog.length) {
//                itog[i] = razdelitel;
//            }
//
//
//        }

//      System.out.println(Arrays.toString(itog).replaceAll(",", ""));

//        for (int i = 0; i < itog.length; i++) {
//            System.out.print(itog[i]);

//
//            }
//        }

        //       String toString = new String();
        //  String arrayToString = Arrays.stream(itog).collect(Collectors.joining());
        //System.out.println(arrayToString);
//        Arrays.toString(string).replaceAll(",", "");
//        System.out.println(toString);
//        Arrays.toString(string).replaceAll(regex, " ") ;
//    }
//
//}


//
//        Film[] films = new Film[5];
//
//        Random rnd = new Random();
//        Scanner scn = new Scanner(System.in);
//        String[] avtory = {"Саня белый", "Саня знатный", "Саня добрый", "Саня ровный", "Саня от души"};
//        int [] parametry = new int[2];
//        for (int i = 0; i < films.length; i++) {
//            Film film = new Film();
//            film.name = "film" + i;
//            film.regiser = avtory[rnd.nextInt(avtory.length)];

//            if (regiser == 1) {
//                film.regiser = "Саня белый";
//            } else if (regiser == 2) {
//                film.regiser = "Саня добрый";
//            } else if (regiser == 3) {
//                film.regiser = "Саня знатный";
//            } else if (regiser == 4) {
//                film.regiser = "Саня ровный";
//            } else {
//                film.regiser = "Саня от души";
//            }
//            film.time = rnd.nextInt(90) + 60;
//            film.cool = rnd.nextInt(9) + 2;
//            films[i] = film;
//        }
//        for (int i = 0; i < films.length; i++) {
//            System.out.println(films[i].name + " от режисера " + films[i].regiser + " " + " идёт " + films[i].time + " минут " + films[i].cool + " звезд");
//
//        }
//        System.out.println("Какого Саню хотите посмотреть ?");
//        String VvedenuySanya = scn.nextLine();
//        System.out.println("Вот что нашлось");
//        for (int i = 0; i < avtory.length; i++) {
//if (VvedenuySanya.equals(films[i].regiser))
//    System.out.println(films[i].name + " от режисера " + films[i].regiser + " " + " идёт " + films[i].time + " минут " + films[i].cool + " звезд");
//        }
//        System.out.println("Фильтрация\nВведите сколько у вас свободного времени в минутах");
//parametry[0] = scn.nextInt();
//        System.out.println("От скольки звезд ?");
//        parametry[1] = scn.nextInt();
//        System.out.println("Вот что нашлось");
//        for (int i = 0 ; i< films.length ;i++) {
//        if(films[i].time<parametry[0] && films[i].cool>parametry[1] )
//            System.out.println(films[i].name + " от режисера " + films[i].regiser + " " + " идёт " + films[i].time + " минут " + films[i].cool + " звезд");
//        }
//    }
//}
//
//class Film{
//    String name   ;
//    String regiser;
//    int time;
//    int cool;
//}
//
//
//
//
//


//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        Phone[] arr = new Phone[5];
//        Random rnd = new Random();
//        Scanner scn = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            Phone phone = new Phone();
//            phone.name = "Iphone" + i;
//          int cvets = rnd.nextInt(5)+1;
//            if (cvets == 1) {
//                phone.cvet = "Белый";
//            }
//            else if (cvets == 2) {
//                phone.cvet = "Синий";
//            }
//            else if (cvets == 3) {
//                phone.cvet = "Черный";
//            }
//            else if (cvets == 4) {
//                phone.cvet = "Розовый";
//            }
//            else  {
//                phone.cvet = "Золотистый";
//            }
//       phone.price = rnd.nextInt(1000)+50;
//            arr[i] = phone;
//        }
//
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i].name+" "+arr[i].cvet+" "+arr[i].price);
//
//        }
//        System.out.println("Сколько у вас лавандоса ?");
//
//        int lavehaKlienta = scn.nextInt();
//        System.out.println("Вот эти модели вы можете себе позволить:");
//        for (int i = 0; i < arr.length; i++) {
//        if(arr[i].price<lavehaKlienta){
//            System.out.println(arr[i].name+" "+arr[i].cvet+" "+arr[i].price);
//        }
//
//        }
//        System.out.println("Сколько у вас лавандоса ?");
//        int lavehaKlienta2 = scn.nextInt();
//       System.out.println("Введите цвет с большой буквы");
//        String vedenyiCvet = scn.next();
//        System.out.println("Вот эти модели вы можете себе позволить:");
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i].price<lavehaKlienta2 && arr[i].cvet.equals(vedenyiCvet)){
//                System.out.println(arr[i].name+" "+arr[i].cvet+" "+arr[i].price);
//            }
//
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//class Phone{
//    String name;
//    int price;
//    String cvet;
//}


//
//        String[] frends = new String[3];
//        Scanner vvedenoe = new Scanner(System.in);
//        int vybor = 0;
//        int indexFends = 0;
//        while (vybor < 4) {
//            System.out.println("1. Добавить в друзья\n" + "2. Удалить из друзей \n" + "3. Вывести всех друзей \n" + "4. Выход");
//            vybor = Integer.parseInt(vvedenoe.next());
//            if (vybor == 1) {
//                System.out.println("Введите никнейм друга");
//                boolean dublikate = false;
//                String vvedenyiKoresh = vvedenoe.next();
//                for (int i = 0; i < frends.length; i++) {
//                    if (frends[i] != null && frends[i].equals(vvedenyiKoresh)) {
//                        System.out.println(vvedenyiKoresh + " " + "уже у вас в друзьях");
//                        dublikate = true;
//                        break;
//
//
//                    }
//                }
//
//                if (dublikate == false) {
//                    frends[indexFends] = vvedenyiKoresh;
//                    indexFends++;
//                    System.out.println(vvedenyiKoresh + " " + "успешно добавлен в друзья");
//                }
//
//            } else if (vybor == 2) {
//                System.out.println("Кого желаете удалить из друзей ?");
//                String vvedenyiKoresh = vvedenoe.next();
//                boolean esttakoi = false;
//                for (int i = 0; i < frends.length; i++) {
//                    if (frends[i] != null && frends[i].equals(vvedenyiKoresh)) {
//                        frends[i] = null;
//                        System.out.println(vvedenyiKoresh + " " + "успешно удален");
//                        esttakoi = true;
//                        break;
//                    }
//
//                }
//                if (esttakoi == false) {
//                    System.out.println("Такого пользователя нету среди ваших друзей");
//                }
//
//            } else if (vybor == 3) {
//
//                for (int i = 0; i < frends.length; i++) {
//                    if (frends[i] != null) {
//                        System.out.println(frends[i]);
//
//
//                    }
//                }
//
//
//            }
//        }
//
//    }
//
//}


//        String[] films = new String[3];
//        Scanner vvedenoe = new Scanner(System.in);
//        int nomerIndexa = 0;
//
//        while (nomerIndexa < films.length) {
//            System.out.println("Введите название фильма");
//            String tekushifilm = vvedenoe.next();
//            boolean dublikate = false;
//            for (int i = 0; i < films.length; i++) {
//                if (films[i] != null && films[i].equals(tekushifilm)) {
//                    System.out.println("Такой фильм уже есть в списке.");
//               dublikate = true;
//                break;
//                }
//
//            }
//             if(dublikate == false){
//    films[nomerIndexa] = tekushifilm;
//                nomerIndexa++;
//}
//
//        }
//
//        for (int y = 0; y < films.length; y++) {
//            System.out.println(films[y]);
//        }
//        }
//    }


        //        Scanner scn = new Scanner(System.in);
//        System.out.println("ведите имена через тире или проценты");
//        String a = scn.next();
//
//        String[] b = null;
//        String znak = "e";
//        if (a.contains("-")) {
//            b = a.split("-");
//            znak = "-";
//
//        }
//        else if (a.contains("%")) {
//            a = a.replace(znak, " ");
//            b = a.split("%");
//            znak = "%";
//
//        }
//
//        a = a.replace(znak, " ");//a = a.replace("-", " ").replace("%", " ");
//
//        b = a.split(" ");
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }
//    }
//}


//                переменная а введеное с клавиатуры число
//                переменная  b масив введеный с клавиатыры
//                переменная c - масив чисел словами
//
//Scanner scn = new Scanner(System.in);
//        String a = scn.next();
//        String[] b = a.split("");
//        // System.out.println(Arrays.toString(b));  // можно убрать
//        String c[] = new String[b.length];
//        for (int i = 0; i < b.length; i++) {
//
//            switch (b[i]) {
//                case "0":
//                    c[i] = "Ноль ";
//                    break;
//
//                case "1":
//                    c[i] = "Один ";
//                    break;
//                case "2":
//                case "4":
//                    c[i] = "Толи два толи четыре ";
//                    break;
//
//
//
//
//
//
//            }
//
//
//

//


//            if (b[i].equals("0")) {
//                c[i] = "Ноль ";
//            } else if (b[i].equals("1")) {
//                c[i] = "Один ";
//            } else if (b[i].equals("2")) {
//                c[i] = "Два ";
//            } else if (b[i].equals("3")) {
//                c[i] = "Три ";
//            } else if (b[i].equals("4")) {
//                c[i] = "Четыре ";
//            } else if (b[i].equals("5")) {
//                c[i] = "Пять";
//            } else if (b[i].equals("6")) {
//                c[i] = "Шесть ";
//            } else if (b[i].equals("7")) {
//                c[i] = "Семь ";
//            } else if (b[i].equals("8")) {
//                c[i] = "Восемь ";
//
//            } else {
//                c[i] = "Девять ";
//            }
//        }
//
//
//        System.out.println(Arrays.toString(c));
//    }
//}



    //        Scanner scn = new Scanner(System.in);     ТО ЧТО НУЖНО НО ВВОДИТЬСЯ ПО ОДНОМУ.

//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Enter value: ");
//            arr[i] = scn.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//    }





        //
//String  str = "hello";
//String a = str.split('')
//

        //        System.out.println("Введите число");
//        Scanner  scn = new Scanner(System.in);
//        int a =  scn.nextInt();
//        int array [] = new int[8];
//        for (int i = 0 ; i < array.length; i++) {
//            a[i] = a;
//












//        System.out.println();
//String [] logins = new String [5];
//Scanner  scn = new Scanner(System.in);
//for (int i = 0 ; i < logins.length; i++) {
//    logins [i] = "logins" + i;
//}
//        System.out.println("Введите логин");
//String userlogin = scn.next();
//boolean dailinet = false ;
//        for (int i = 0 ; i < logins.length; i++) {
//            if(logins[i].equals(userlogin)){
//                System.out.println("Вы вошли в систему");
//                dailinet = true;
//
//            }
//
//        }
//
//if (!dailinet){
//    System.out.println("Такого пользователя не существует");
//}

            //        System.out.println("Введите номер телефона\n");
//        Scanner scn = new Scanner(System.in);
//       long a =  scn.nextLong();
//if (a == 81234561233l) {
//    System.out.println("Олег");
//}
//    else if (a == 81234561235l) {
//    System.out.println("Иван");
//}
//else if (a == 81234561237l) {
//    System.out.println("Омар");
//}
//    else {
//    System.out.println("Нет такого пользователя");
//    }
            //    System.out.println(10);
//    System.out.println(11);
//    System.out.println(12);
//    System.out.println(19);

//        Scanner scn = new Scanner(System.in);
//        System.out.print("Введите число\n");
//        int a = scn.nextInt();
//        if (a>0) {
//            System.out.println("Число положительное");
//        }
//        else if (a<0) {
//            System.out.println("Число отрицательное");
//        } else {
//            System.out.println("Ваше число 0 - нейтральное");
//
//
//        }


//        String a = scn.next();
//        System.out.print("Enter b ");
//        String b = scn.next();
//        if (a.equals(b)) {
//            System.out.println("А равно Б");
//        } else {
//            System.out.println("А не равно Б");

//        Моя программа
//        System.out.println("Введите число");
//        Scanner scn = new Scanner(System.in);
//        int a =  scn.nextInt();
//        int[] arr = new int[10];

//+ " " Выводит в одну строчку



