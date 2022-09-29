public class U2L3Runner {
    public static void main(String[] args) {
        /*double length, width, height;

        length = 5.0;
        width = 10.0;
        height = length;

        Box box1 = new Box(length, width, height);
        Box box2 = new Box(length);
        box1.printDimensions();
        box2.printDimensions();

        String bigger;

        if (box1.volume() > box2.volume())
        {
            bigger = "box1 has greater volume";
        }
        else if (box1.volume() < box2.volume())
        {
            bigger = "box2 has greater volume";
        }
        else
        {
            bigger = "both boxes have equal volume";
        }

        System.out.println(bigger);

        boolean box1sides = box1.anySideLongerThan(length);
        boolean box2sides = box2.anySideLongerThan(length);

        System.out.println("box1 has a side that exceeds " + length + ": " + box1sides);
        System.out.println("box2 has a side that exceeds " + length + ": " + box2sides);
        double x = 10/0;
        System.out.println(x);
        int x1 = 3;
        int y1 = 5;

        SlopeCalculator calc = new SlopeCalculator();
        int x2 = calc.square(x1);
        int y2 = calc.square(y1);

        double slope = calc.slope(x1, y1, x2, y2);
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
        System.out.println("y1 = " + y1 + ", y2 = " + y2);
        System.out.println("slope = " + slope);
        Game game = new Game();
        game.addPlayer();
        game.addPlayer();
        game.addPlayer();
        game.increaseScore(8);
        game.increaseScore(3);
        System.out.println("Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println("Avg score per player: " + game.averageScorePerPlayer()); */
        Student student1 = new Student("Charles", "Smith", 2021);
        student1.addTestScore(85.5);
        student1.printStudentInfo();
        System.out.println();

        student1.addTestScore(94.5);
        student1.printStudentInfo();
        System.out.println();

        student1.addTestScore(100);
        student1.printStudentInfo();
        System.out.println();

        student1.addTestScore(96);
        student1.printStudentInfo();
        System.out.println();

        Student student2 = new Student("Amy", "Adams", 2020);
        student2.addTestScore(98.2);
        student2.printStudentInfo();
        System.out.println();

        student2.addTestScore(92.5);
        student2.printStudentInfo();
        System.out.println();

        double student1avg = student1.averageTestScore();
        double student2avg = student2.averageTestScore();

        boolean student1greater = (student1avg > student2avg);
        System.out.println(student1greater);
        boolean student2greater = (student1avg < student2avg);
        System.out.println(student2greater);

    }
}