package playground.healthCheck.test;

public interface MyInterface {

    void call();
}

class MyAbstract {

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("test = " + test);

        Class<Test> testClass = Test.class;
        System.out.println("testClass = " + testClass);

        Class<Test> testClass2 = Test.class;
        System.out.println("testClass2 = " + testClass2);

        boolean equals = testClass.equals(testClass2);
        System.out.println(testClass == testClass2);
        System.out.println("equals = " + equals);

    }
}

class Test {

}


