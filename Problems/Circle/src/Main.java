class Circle {

    double radius;

    double getLength() {
        return this.radius * Math.PI * 2;
    }

    double getArea() {
        return (this.radius * this.radius) * Math.PI;
    }
}