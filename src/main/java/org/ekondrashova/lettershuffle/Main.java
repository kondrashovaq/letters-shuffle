package org.ekondrashova.lettershuffle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String path = scanner.nextLine();

        TextManager textManager = new TextManager();
        textManager.process(path);
    }
}
