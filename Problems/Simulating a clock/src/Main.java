class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        this.minutes += 1;
        if (this.minutes > 59) {
            this.hours++;
            this.minutes = 0;
        }
        if (this.hours > 12) {
            hours = 1;
        }
    }
}