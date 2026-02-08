public class CodingExercise34Calculator {

    private Floor floor;
    private Carpet carpet;

    public double getTotalCost() {
        return (floor.getArea() * carpet.getCost());
    }

    class Floor {

        private double width;
        private double length;

        public Floor(double width, double length) {
            this.width = width < 0 ? 0 : width;
            this.length = length < 0 ? 0 : length;
        }

        public double getArea() {
            return (width * length);
        }
    }

    class Carpet {
        private double cost;

        public Carpet(double cost) {
            this.cost = cost < 0 ? 0:cost;
        }

        public double getCost(){
            return (this.cost);
        }
    }
}
