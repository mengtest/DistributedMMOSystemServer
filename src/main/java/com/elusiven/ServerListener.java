package com.elusiven;

import java.io.IOException;
import java.net.Socket;

/*
    THIS IS FOR PRIMARY SERVER ONLY
    Listen for incoming connections from other servers
    Add to list of nearby secondary servers
 */

public class ServerListener extends Thread {

    public ServerStarter serverStarter;
    public NearbyServers nearbyServers;

    public ServerListener(int port) throws IOException {

        // Create a serverStarter socket to listen for other serverStarter connections
        serverStarter = new ServerStarter(port);
        nearbyServers = new NearbyServers();
    }

    @Override
    public void run() {
        while(true){
            Socket socketServer = null;
            try {
                socketServer = serverStarter.accept();
                // nearby serverStarter connected - create and add to list
                Server server = new Server(socketServer, nearbyServers);
                nearbyServers.addServer(server);
                System.out.println("ServerStarter " + "-- "  + socketServer.getRemoteSocketAddress() + " --" + " connected.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
