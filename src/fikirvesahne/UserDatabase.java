package fikirvesahne;

import java.io.*;
import java.util.HashMap;

public class UserDatabase {
    private static HashMap<String, User> users = new HashMap<>();
    private static final String FILE_PATH = "users.dat";

    
    private static void saveUsers() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    private static void loadUsers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            users = (HashMap<String, User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

   
    public static boolean addUser(User user) {
        if (users.containsKey(user.getUsername())) {
            return false; 
        }
        users.put(user.getUsername(), user);
        saveUsers(); 
        return true;
    }

   
    public static boolean authenticate(String username, String password) {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }

    // Kullanıcı var mı kontrol etme
    public static boolean userExists(String username) {
        return users.containsKey(username);
    }

    // Başlatıldığında kullanıcıları yükle
    static {
        loadUsers();
    }
}
