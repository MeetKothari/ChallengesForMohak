// Here is your second challenge:
// this will test your understanding of classes and
// class methods on a deeper level than the first challenge

// furthermore, it will require you to do some indepedent study into concepts of java
// such as String Builder


// your goal is to fix the methods provided in 'cipherBase.java' so that the outputs match
// my outputs.

public class Main {
    public static void main(String[] args) {


        cipherBase test = new cipherBase();
        test.setString("Test");
        // System.out.print(test.getString());
        // System.out.println(test);

        System.out.println(test.isCaesarCorrect(test.caesarCipher()));
        // output should be: true


    }
}