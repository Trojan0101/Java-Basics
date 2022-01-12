public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel:-1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount >= 0 && tonerAmount <= 100) {
            if ((this.tonerLevel + tonerAmount) > 100) {
                return -1;
            } else {
                return this.tonerLevel += tonerAmount;
            }
        }
        return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            this.pagesPrinted += (pagesToPrint / 2) + (pagesToPrint % 2);
            return this.pagesPrinted;
        } else {
            this.pagesPrinted += pagesToPrint;
            return this.pagesPrinted;
        }
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }

}
