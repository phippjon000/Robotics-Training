public class Motor {
    private final Sensor s;

    public Motor() {
        s = new Sensor();
    }

    public double getPosition() {
        return s.getPosition();
    }

    public void moveToPosition(double target) {
        double distance = target - getPosition();
        if (distance != 0) {
            if (distance > 0) {
                System.out.println("Moving out...");
                while (distance >= 10) {
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        System.out.println("Sleep interrupted!");
                    }
                    s.addTen();
                    System.out.println("Position at " + getPosition());
                    distance = target - getPosition();
                }
            } else {
                System.out.println("Moving in...");
                while (distance <= -10) {
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        System.out.println("Sleep interrupted!");
                    }
                    s.subTen();
                    System.out.println("Position at " + getPosition());
                    distance = target - getPosition();
                }
            }

            if (distance != 0) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println("Sleep interrupted!");
                }
                s.setPosition(target);
                System.out.println("Position at " + getPosition());
            }
        }

        System.out.println("Done moving!");
    }
}