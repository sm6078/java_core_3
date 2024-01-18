//package homeworks.module1.homework4.ex4;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Runner {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        while (true) {
//            System.out.print("Введите одну из команд - (list | save fullName | delete uuid | read uuid | update uuid fullName | clear | exit): ");
//            String[] params = reader.readLine().trim().toLowerCase().split(" ");
//            if (params.length < 1 || params.length > 3) {
//                System.out.println("Неверная команда.");
//                continue;
//            }
//            String param = null;
//            if (params.length > 1) {
//                param = params[1].intern();
//            }
//            switch (params[0]) {
//                case "list":
//                    break;
//                case "getSize":
//                    System.out.println(ARRAY_STORAGE.getSize());
//                    break;
//                case "save":
//                    r = new Resume(param);
//                    ARRAY_STORAGE.save(r);
//                    printAll();
//                    break;
//                case "delete":
//                    ARRAY_STORAGE.delete(param);
//                    printAll();
//                    break;
//                case "read":
//                    System.out.println(ARRAY_STORAGE.get(param));
//                    break;
//                case "update":
//                    String secondParam = params[2].intern();
//                    r = new Resume(param, secondParam);
//                    ARRAY_STORAGE.update(r);
//                    printAll();
//                    break;
//                case "clear":
//                    ARRAY_STORAGE.clear();
//                    printAll();
//                    break;
//                case "exit":
//                    return;
//                default:
//                    System.out.println("Неверная команда.");
//                    break;
//            }
//        }
//    }
//}
