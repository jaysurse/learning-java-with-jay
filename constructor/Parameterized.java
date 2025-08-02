class Add {
    int num1;
    int num2;

    Add(int i, int j) {
        num1 = i;
        num2 = j;
    }

    void display() {
        int sum = num1 + num2;
        System.out.println(sum);
    }
}

public class Parameterized {
    public static void main(String[] args) {
        Add a1 = new Add(10, 20);
        a1.display();
    }
}
