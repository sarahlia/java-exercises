package com.sarahlia;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here..";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over Earth.";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a death maze.";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the Galaxy.";
    }
}

class Forgettable extends Movie {

    public Forgettable() {
        super("Forgettable");
    }

    //no plot method here.
}

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\nPlot: " + movie.plot() + "\n" );
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) ( Math.random() * 5 ) + 1; //generates random number between 1 and 5
        System.out.println("Random number generated: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();//no need for 'break because there's already 'return'
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
        }

        return null; // or we need 'default: return null;' in line 92 & 93.
    }
}
