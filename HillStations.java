class HillStations {
    void location() {
        System.out.println("Location is .....");
    }

    void Famas() {
        System.out.println("It is vary famous for....");
    }
}

class ABC extends HillStations {
    void location() {
        System.out.println("It is in nepal gandaki pradesh in the mountanious region");
    }

    void Famas() {
        System.out.println(
                "It is vary famous for the arnapurna mountain the 10th highest in the globe and the arnapurna mountain range");
    }
}

class EBC extends HillStations {
    void location() {
        System.out.println("It is in nepal koshi pradesh in the mountanious region");
    }

    void Famas() {
        System.out.println(
                "It is vary famous for the HIGHEST mountain the in the globe mount everest and its mountain range also including makalu and kanchungjanga etc");
    }
}

class Gorkha extends HillStations {
    void location() {
        System.out.println("It is in nepal gandaki pradesh in the hilly region");
    }

    void Famas() {
        System.out.println("It is vary famous for THE GORKHA PALACE of prithivi narayan shah");
    }
}

class Main {
    public static void Main(String[] args) {
        HillStations A = new HillStations();
        HillStations B = new HillStations();
        HillStations C = new HillStations();
        HillStations D = new HillStations();
        A.location();
        A.Famas();
        B.location();
        B.Famas();
        C.location();
        C.Famas();
        D.location();
        D.Famas();
    }
}