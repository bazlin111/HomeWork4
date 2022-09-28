public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание № 1 ");
        int age = 45;
        if (age >= 18) {
            System.out.println(" Поздравляем с  днем СОВЕРШЕННОЛЕТИЯ !!!");
        }
        if ( age <  18 ) {
            System.out.println(" К сожалению возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }
        System.out.println();
        System.out.println(" Задание № 2 ");
        int yers = 26;
        if (yers >= 7 && yers < 18) {
                System.out.println("Вы ходите в школу"); }
        if ( yers >= 18 && yers < 24  ) {
            System.out.println(" ВЫ закончили школу и можете идти учиться в университет "); }
        if (yers >=24 ){
            System.out.println("Вы окончили университет и пора искать работу");}
        System.out.println();
        System.out.println(" Задание №3 ");
        int place = 105;
        if (place <= 60) {
            System.out.println("В вагоне есть свободные сидячие места");
        }
        if (place >= 60)
            if (place < 102){
                System.out.println(" Есть свободные стоячие места , но сидячие места все заняты");
            }
        if (place >= 102){
            System.out.println(" МЕСТ НЕТ ");
        }
        System.out.println();

        System.out.println(" Задание №4 ");
        int agey = 17;
        if (agey >= 18) {
            System.out.println(" Поздравляем с  СОВЕРШЕННОЛЕТИЕМ !!!");
        } else {
            System.out.println(" К сожалению возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }
        System.out.println();

        System.out.println(" Задание № 5 ");
        int yerssOld = 26;
        if (yerssOld >= 7 && yerssOld < 18 ) {
                System.out.println("Вы ходите в школу");
            } else if ( yerssOld >=18 && yerssOld< 24 ) {
                System.out.println(" ВЫ закончили школу и можете идти учиться в университет ");
            }else if (yerssOld>=24 ){
                System.out.println("Вы окончили университет и пора искать работу");
            }
         System.out.println();

        System.out.println( " Задание №6 ");
        int placee = 10;
        if (placee <= 60) {
            System.out.println("В вагоне есть свободные сидячие места");
        }
        if (placee >= 60)
            if (placee < 102){
                System.out.println(" Есть свободные стоячие места , но сидячие места все заняты");
            }else {
                System.out.println(" МЕСТ НЕТ ");
            }
        System.out.println();

        System.out.println(" Задание №7 ");
        int fullYears = 7;
        if( fullYears >=2 &&  fullYears <= 6 ) {
            System.out.println("Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад");}
         else if (fullYears > 6 &&  fullYears <=18 ){
            System.out.println("Если человек от 7 до 18 лет, то ему нужно ходить в школу");}
         else if (fullYears > 18 &&  fullYears <= 24 ){
            System.out.println("Если человеку больше 18 лет, но меньше 24, то его место в университете");}
         else if (fullYears > 24) {
            System.out.println("А если человеку больше 24, то ему пора ходить на работу");}
        System.out.println();

        System.out.println(" Задание №8 ");
        if (fullYears < 5 ){
            System.out.println("  Нельзя кататься на атракционе  ");
        }
        else if (fullYears < 14 ){
            System.out.println(" Можно кататься в сопровождение взрослого");
        } else {
            System.out.println(" Можно кататься без сопровождения взрослых");}
        System.out.println();

        System.out.println(" Задание №9 ");
        int one = 65;
        int two = 65;
        int free = 65;
        if ( one> two) {
            if (one >= free) {
                System.out.println(" Максимальное  число - " + one);
            } else {
                System.out.println(" Максимальное  число - " + free);
            }
        } else if ( two> one) {
            if (two >= free) {
                System.out.println(" Максимальное  число - " + two);
            } else {
                System.out.println(" Максимальное  число - " + free);
            }
        }else {
            if (one>free){
                System.out.println(" Максимальное  число - " + one);
            } else if (free>one){
                System.out.println(" Максимальное  число - " + free);
            } else {
                System.out.println(" все три числа равны  " );
            }
        }
    }

}