import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.io.File;
import java.io.FileWriter;

public class dz {

    public static void main(String[] args) throws Exception
    {
        boolean here = true;
        Scanner work = new Scanner(System.in);
        System.out.println("Здравствуйте!");
        while (here) 
        {
            System.out.println(" Введите, пожалуйста, через пробел свои ФИО, дату рождения(дд.мм.гг), номер телефона и пол:");
            String data = work.nextLine();
            String[] userdata = data.split(" ");
            if (data.matches("[0-9]+") || data.matches("[a-zA-Z]+")) 
            {
                System.out.println("Данные не приняты. Введёное вами не имеет смыслового значения. Попробуйте ещё раз!");
            }
            else if (userdata.length != 6)
            {
                System.out.println("Обработка прервана. Вам нужно заполнить данную форму СТРОГО по установленным пунктам. Попробуйте ещё раз!");
            }
            else
            {
                for (int i = 0; i<userdata.length; i++) 
                {
                    if(userdata[i] instanceof String) 
                    {
                        FileWriter storage = new FileWriter(new File(userdata[i] + ".txt"), StandardCharsets.UTF_8, true);
                        for (int j = 0; j < userdata.length; j++)
                        {
                            storage.write("<");
                            storage.write(userdata[j]);
                            storage.write(">");
                        }
                        storage.write("\n");
                        i = userdata.length;
                        storage.flush();
                        storage.close();
                        here = false;
                    }
                }
            }
        }
        System.out.println("Запись файла успешно выполнена!");
        work.close();
    }
}