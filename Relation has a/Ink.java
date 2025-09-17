class Ink {
    public String inkColor;

    public Ink(String inkColor) {
        this.inkColor = inkColor;
    }

    public void inkDetails() {
        System.out.println("Ink color = " + inkColor);
    }
}

class Pen {
    public String penColor;
    public Ink ink;

    public Pen(Ink ink) {
        this.penColor = ink.inkColor;
        this.ink = ink;
    }

    public void displayPen() {
        ink.inkDetails();
    }
}

class PenRunner {
    public static void main(String[] args) {
        Ink ink = new Ink("Blue");
        Pen pen = new Pen(ink);

        pen.displayPen();
    }
}
