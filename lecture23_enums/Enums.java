package lecture23_enums;

class PaymentStatus {
    public static final int SUCCESS = 1;
    public static final int FAILED = 2;
    public static final int PENDING = 3;
}

class Role {
    public static final int ADMIN = 1;
    public static final int CLIENT = 2;
}

// There is some issue in this
/**
 * Problem with before enums.
 * 1. type safety
 * 2. Poor Readability
 * 3. No Grouping of related entities.
 */

enum Direction {
    NORTH,
    SOUTH,
    WEST,
    EAST
}

// Direction
/**
 * 
 * class Direction extends Enum<Direction> {
 * 
 * public static final Direction NORTH = new Direction("NORTH", 0);
 * public static final Direction SOUTH = new Direction("SOUTH", 1);
 * public static final Direction WEST = new Direction("WEST", 2);
 * public static final Direction EAST = new Direction("EAST", 3);
 * 
 * private Direction(String name, int ordinal) {
 * super(name, ordinal);
 * }
 * }
 * 
 */

enum Status {

    LOW(10),
    MEDIUM(20),
    HIGH(30);

    private int value;

    Status(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}

/**
 * // Status
 * 
 * class Status extends Enum<Status> {
 * 
 * public static final Status LOW =
 * new Status("LOW", 0, 10);
 * 
 * public static final Status MEDIUM =
 * new Status("MEDIUM", 1, 20);
 * 
 * public static final Status HIGH =
 * new Status("HIGH", 2, 30);
 * 
 * private int value;
 * 
 * private Status(String name, int ordinal, int value) {
 * super(name, ordinal);
 * this.value = value;
 * }
 * 
 * public int getValue() {
 * return this.value;
 * }
 * }
 */

enum DirectionMoves {
    NORTH {
        @Override
        public void move() {
            System.out.println("Moving up");
        }
    },
    SOUTH {
        @Override
        public void move() {
            System.out.println("Moving down");
        }
    },
    WEST {
        @Override
        public void move() {
            System.out.println("Moving right");
        }
    },
    EAST {
        @Override
        public void move() {
            System.out.println("Moving left");
        }
    };

    public abstract void move();
}

/**
 * DirectionMoves
 * 
 * class DirectionMoves extends Enum<DirectionMoves> {
 * 
 * public static final DirectionMoves NORTH =
 * new DirectionMoves("NORTH", 0) {
 * public void move() {
 * System.out.println("Moving up");
 * }
 * };
 * 
 * public static final DirectionMoves SOUTH =
 * new DirectionMoves("SOUTH", 1) {
 * public void move() {
 * System.out.println("Moving down");
 * }
 * };
 * 
 * public static final DirectionMoves WEST =
 * new DirectionMoves("WEST", 2) {
 * public void move() {
 * System.out.println("Moving right");
 * }
 * };
 * 
 * public static final DirectionMoves EAST =
 * new DirectionMoves("EAST", 3) {
 * public void move() {
 * System.out.println("Moving left");
 * }
 * };
 * 
 * private DirectionMoves(String name, int ordinal) {
 * super(name, ordinal);
 * }
 * 
 * public abstract void move();
 * }
 */

public class Enums {
    public static void main(String[] args) {

        // int status = PaymentStatus.SUCCESS;
        // System.out.println(status);

        // status = 100; // type safety. problem 1.
        // if (status == 2) { // problem2

        // }
        // if (status == Role.ADMIN) { // problem 3

        // }

        Direction d = Direction.EAST;
        // d = 12 // Problem 1
        // if (d == 100) { // Problem 2

        // }
        // if(d == Role.ADMIN){ // Problem 3

        // }

        Status st = Status.HIGH;
        // System.out.println(st.getValue());

        DirectionMoves dm = DirectionMoves.EAST;
        dm.move();

        // Some function from
        // @value => Array of all the enums
        // @valueOf => convert string to enum constraints its case sensitive
        // name()=>give the name of objects toString() give the same. but its can't
        // override
        // ordinal -> gives indexing of enums.

        DirectionMoves[] dArr = DirectionMoves.values();
        for (DirectionMoves direc : dArr) {
            System.out.println(direc.name());
        }

        DirectionMoves d2 = DirectionMoves.valueOf("WEST");
        System.out.println(d2);

    }
}
