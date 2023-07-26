import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ChatClient extends UnicastRemoteObject  {
    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 1099;

    protected ChatClient() throws RemoteException {
    }


    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(SERVER_HOST, SERVER_PORT);
            ChatService server = (ChatService) registry.lookup("ChatService");

            User client = new User();
            client.name="Bandara";
            server.registerClient(client);

            Scanner scanner = new Scanner(System.in);
            while (true) {
                String message = scanner.nextLine();
                server.sendMessage(message, client);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
