public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1-2.");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        int numberOne = number[0]; //.Я присвоил переменно numberOne, место в ячейке[0]
        int numberTwo = number[1];
        int numberTree = number[2];
        {
            System.out.print(numberOne + "," + numberTwo + "," + numberTree);
            System.out.println();
        }

        float[] numbers = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < 3; i++)
            if (i == 0 || i == 2) {
                System.out.print(numbers[i] + " ");
            } else {
                System.out.print(numbers[1] + ", ");
            }
        {
            System.out.println();

//Задание2 "Запятая между последним элементом одного массива и первым элементом следующего не нужна."
        //Задание3" - "Если во втором задании в консоль у вас вывелся результат
       // 1, 2, 3
       // 1.57,запятая стоит!!(Почему!??  если в условии говорят что она не нужна) 7.654, 9.986"
        // С этого условия у меня прям пригорело, так нужна запятая в после первого элемента след массива или нет??
        //Если конечно это не обязательные условия то ладно, но блин, я наверное час потратил думая как эту запятую туда не поставить))

            boolean[] free = {true, false};{
              for (int z = 0; z < 2; z++)
                  System.out.print(free[z] + " ");}
        System.out.println();
        System.out.println("Задание 3.");
        for (int x = 0; x < 1; x++)
            if (x < 3)

        { System.out.print(numberTree + ", " + numberTwo + ", " + numberOne);}
        System.out.println();
            {System.out.print(free[0] + " " + free[1]);}
            System.out.println();
            for (int p = 2; p >= 0; p--)
            if (p==0 || p == 2)
            {System.out.print(numbers[p] + " ");}
            else {
                System.out.print(numbers[1] + ", ");}
// Если будет трудно понять что тут вообще происходить - Без паники! И я сам не особо понимаю, половину кода писал на интуиции))


        System.out.println();
        {System.out.println("Задание 4!");}


        for (int p = 0; p < 2; p++)
            if ( p % 2 == 0){
            numberOne = numberOne + 1;
            numberTree = numberTree + 1;
            System.out.print(numberOne + ", " + numberTwo + ", " + numberTree);

            //.



            }}}}





















