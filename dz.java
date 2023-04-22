import java.util.Scanner;

/**
 * dz
 */
public class dz {

    public static void main(String[] args) 
    {
        boolean here = true;
        Scanner work = new Scanner(System.in);
        System.out.println("Здравствуйте!");
        while (here) 
        {
            System.out.println(" Введите, пожалуйста, через пробел свои ФИО, дату рождения(дд.мм.гг), номер телефона и пол:");
            String data = work.nextLine();
            String[] userdata = data.split(" ");
            if (userdata.length != 6) 
            {
                System.out.println("Обработка прервана. Вам нужно заполнить данную форму строго по установленным пунктам. Попробуйте ещё раз!");
            }
            else 
            {
                here = false;
            }
    }

    }
}