package dominio;

public class Hora {
    private int hour;
    private int minutes;
    private int seconds;

    public Hora(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hora{");

        sb.append("");

        if (hour < 10)
            sb.append(0);

        sb.append(hour).append(":");

        if (minutes < 10)
            sb.append(0);

        sb.append(minutes).append(":");

        if (seconds < 10)
            sb.append(0);

        sb.append(seconds).append('}');

        return sb.toString();
    }

    public Hora increase1Second(Hora clock) {
        this.seconds++;

        if (this.seconds >= 60) {
            seconds = 00;
            minutes++;
        }

        if (this.minutes >= 60) {
            minutes = 00;
            hour++;
        }

        return clock;
    }

    public Hora decrease1Second(Hora clock) {
        this.seconds--;

        if (this.seconds < 00) {
            seconds = 00;
            minutes--;
        }

        if (this.minutes < 00) {
            minutes = 00;
            hour--;
        }
        return clock;
    }
}
