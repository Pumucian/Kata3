package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("ull.es", 10);
        histogram.increment("gmail.es", 20);
        histogram.increment("ulpgc.es", 15);
        histogram.increment("hotmail.com", 5);
        
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
}
