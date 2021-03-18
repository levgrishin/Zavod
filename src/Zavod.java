public class Zavod {
    public static void main(String[] args) {
        Stanok stanok = new Stanok(100, false);

        stanok.makeDetails(50);
        stanok.makeDetails(100);
        stanok.refuel(50);
        stanok.makeDetails(100);

    }
}

//https://docs.google.com/document/d/1ZLCGJN-zgQNGq9lB5j9fZCrWUnofzQ3J9CNp3-pVvNU/edit?usp=sharing