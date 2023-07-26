import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ChatServer extends UnicastRemoteObject implements ChatService {
    private List<ChatClientInterface> clients;

    public ChatServer() throws RemoteException {

    }

    @Override
    public void sendMessage(String message, ChatClientInterface client) throws RemoteException {

    }

    @Override
    public void registerClient(ChatClientInterface client) throws RemoteException {

    }

    @Override
    public void unregisterClient(ChatClientInterface client) throws RemoteException {

    }
}
