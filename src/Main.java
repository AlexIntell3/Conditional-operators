public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Ваш возраст равен " + age + " , вы совершеннолетний.");
        } else {
            System.out.println("Вы не достигли совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задание 2");
        int tempOut = 6;
        if (tempOut >= 5) {
            System.out.println("На улице " + tempOut + " градусов,можно идти без шапки.");
        } else {
            System.out.println("На улице " + tempOut + " градусов,нужно надеть шапку.");
        }

        System.out.println("Задание 3");
        int speed = 87;
        if (speed > 60) {
            System.out.println("Ваша скорость больше " + speed + " ,придется заплатить штраф.");
        } else {
            System.out.println("Ваша скорость " + speed + " ,можно ездить спокойно.");
        }
        //Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.
        //Если человеку от 7 до 18 лет, то ему нужно ходить в школу.
        // Если человеку больше 18 лет, но меньше 24, то его место в университете.
        //А если человеку больше 24, то ему пора ходить на работу.

        System.out.println("Задание 4");
        int humanAge = 23;
        if (humanAge > 1 && humanAge < 7) {
            System.out.println("Ваш возраст равен " + humanAge + " ,вам нужно ходить в детский сад.");
        }
        if (humanAge > 6 && humanAge < 19) {
            System.out.println("Ваш возраст равен " + humanAge + " ,вам нужно ходить в школу.");
        }
        if (humanAge > 18 && humanAge <= 24) {
            System.out.println("Ваш возраст равен " + humanAge + " ,ваше место в университете.");
        }
        if (humanAge > 24) {
            System.out.println("Ваш возраст равен " + humanAge + " ,вам пора ходить на работу.");
        }

        System.out.println("Задание 5");
        int childAge = 13;
        if (childAge < 5) {
            System.out.println("Возраст ребенка " + childAge + " ,нельзя кататься на атракционe.");
        }
        if (childAge > 4 && childAge < 14) {
            System.out.println("Возраст ребенка " + childAge + " ,можно кататься на аттракционе только в сопровождении взрослого.");
        }
        if (childAge >= 14) {
            System.out.println("Возраст ребенка " + childAge + " ,можно кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println("Задание 6");
        int oneWagonCapacity = 102;
        int seatPlaces = 60;
        int standPlaces = oneWagonCapacity - seatPlaces;
        int engagedSeatPlaces = 37;
        int engagedStandPlaces = 12;
        int freeSeatPlaces = seatPlaces - engagedSeatPlaces;
        int freeStandPlaces = standPlaces - engagedStandPlaces;
        int totalFreePlaces = freeStandPlaces + freeSeatPlaces;
        if (totalFreePlaces >= 1) {
            System.out.println("Всего свободных мест в вагоне " + totalFreePlaces + " ,из них сидячих мест " + freeSeatPlaces + " , стоячих мест " + freeStandPlaces + ".");
        } else {
            System.out.println("Вагон уже забит.");
        }
        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число one равно " + one + " ,самое большее.");
        }
        if (two > one && two > three) {
            System.out.println("Число  two равно " + two + " ,самое большее.");
        }
        if (three > one && three > two) {
            System.out.println("Число three равно " + three + " ,самое большее.");
        }
    }
}




























