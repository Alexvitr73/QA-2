package homework.hw16;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите программу на которую вы хотите " +
                "получить ссылку ( IDEA, Git, Java):");
        String programma = in.next();
        System.out.println("Введите операционную систему для выбраной программы (Linux, macOS, Windows)");
        String operSys = in.next();

        switch (programma.toUpperCase()) {
            case ("IDEA"):
                switch (operSys.toUpperCase()) {
                    case ("LINUX"):
                        System.out.println("Ваша ссылка для установки:\n" +
                                "https://www.jetbrains.com/idea/download/#section=linux");
                        break;
                    case ("MACOS"):
                        System.out.println("Ваша ссылка для установки:\n" +
                                "https://www.jetbrains.com/idea/download/#section=mac");
                        break;
                    case ("WINDOWS"):
                        System.out.println("Ваша ссылка для установки:\n" +
                                "https://www.jetbrains.com/idea/download/#section=windows");
                        break;
                    default:
                        System.out.println("Данной операционной системы не существует");
                        break;
                }
                break;
//                        Раздел для Git
            case ("GIT"):
                switch (operSys.toUpperCase()) {
                    case ("LINUX"):
                        System.out.println("Ваша ссылка для установки:\n" +
                                "https://git-scm.com/download/linux");
                        break;
                    case ("MACOS"):
                        System.out.println("Ваша ссылка для установки:\n" +
                                "https://git-scm.com/download/mac");
                        break;
                    case ("WINDOWS"):
                        System.out.println("Ваша ссылка для установки:\n" +
                                "https://git-scm.com/download/win");
                        break;
                    default:
                        System.out.println("Данной операционной системы не существует");
                        break;
                }
                break;
            //                        Раздел для JAWA
            case ("JAVA"):
                switch (operSys.toUpperCase()) {
                    case ("LINUX"):
                        System.out.println("Ваша ссылка для установки:\n" +
                                "https://www.oracle.com/java/technologies/downloads/#jdk19-linux");
                        break;
                    case ("MACOS"):
                        System.out.println("Ваша ссылка для установки:\n" +
                                "https://www.oracle.com/java/technologies/downloads/#jdk19-mac");
                        break;
                    case ("WINDOWS"):
                        System.out.println("Ваша ссылка для установки:\n" +
                                "https://www.oracle.com/java/technologies/downloads/#jdk19-windows");
                        break;
                    default:
                        System.out.println("Данной операционной системы не существует");
                        break;
                }
                break;
            default:
                System.out.println("Данной программы не существует");
                break;

        }
    }
}