/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javadeveloper;

import com.google.gson.Gson;

public class App {

    public static void main(String[] args) {
        User user = new User("Olexsandr", "Lutskiy");
        System.out.println(new Gson().toJson(user));
    }
}
